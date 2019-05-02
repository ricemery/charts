/*
 * Copyright 2019 © Denmar Technical Services Inc
 * The U.S. Government has unlimited rights per DFAR 252.227-7014, all other
 * rights reserved.
 *
 * WARNING - This software contains Technical Data whose export is restricted by
 * the Arms Export Control Act (Title 22, U.S.C., Sec 2751, et seq.) or the
 * Export Administration Act of 1979, as amended (Title 50, U.S. C. App. 2401
 * et seq.). Violations of these export laws are subject to severe criminal
 * penalties.
 */
package eu.hansolo.fx.charts;

import javafx.util.StringConverter;

import java.util.Locale;

public class DoubleStringConverter extends StringConverter<Double> {
   @Override
   public String toString(Double value) {
      return value == null
         ? ""
         :  String.format(Locale.US, "%.0f", value);
   }

   @Override
   public Double fromString(String string) {
      try {
         // If the specified value is null or zero-length, return null
         if (string == null) {
            return null;
         }

         string = string.trim();

         if (string.length() < 1) {
            return null;
         }

         // Perform the requested parsing
         return Double.valueOf(string);
      } catch (NumberFormatException ex) {
         return 0.0;
      }
   }
}
