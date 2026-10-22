package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rr implements org.telegram.ui.Components.cw0, org.telegram.ui.Components.dw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.kd0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.md0 {
    public final int f41275a;

    public rr(int i10) {
        this.f41275a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        tr trVar = (tr) obj;
        switch (this.f41275a) {
            case 1:
                trVar.d = f7;
                if (trVar.getParent() != null) {
                    ((View) trVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                trVar.e = f7;
                if (trVar.getParent() != null) {
                    ((View) trVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        int i11;
        switch (this.f41275a) {
            case 6:
                return i2.e.j(i10, "");
            case 7:
                switch (i10) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 8:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
            case 10:
            case 20:
            case 27:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i12 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                int i13 = calendar.get(1);
                if (i13 == i12 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else if (i13 == i12) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i14 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                if (calendar3.get(1) == i14) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 22:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 23:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 24:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i15 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i15) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                boolean z10 = LocaleController.is24HourFormat;
                int i16 = 12;
                if (z10) {
                    i11 = 24;
                } else {
                    i11 = 12;
                }
                int i17 = i10 % i11;
                if (i10 % 12 != 0 || z10) {
                    i16 = i17;
                }
                String format = String.format("%02d", Integer.valueOf(i16));
                if (i10 >= 24) {
                    return LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format);
                }
                return format;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41275a) {
            case 9:
                b2Var.dismiss();
                return;
            case 20:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        tr trVar = (tr) obj;
        switch (this.f41275a) {
            case 0:
                return trVar.d;
            default:
                return trVar.e;
        }
    }

    @Override
    public void q(org.telegram.ui.Components.od0 od0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.f5.f26080a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f41275a) {
            case 4:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }
}
