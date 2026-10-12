package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class qr implements Utilities.Callback2Return, org.telegram.ui.Components.pw0, org.telegram.ui.Components.qw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.ud0, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.wd0 {
    public final int f41428a;

    public qr(int i10) {
        this.f41428a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        hs hsVar = (hs) obj;
        switch (this.f41428a) {
            case 2:
                hsVar.f38502b = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
            case 5:
            default:
                hsVar.f38504e = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                hsVar.f38503c = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 6:
                hsVar.d = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f41428a) {
            case 11:
                return hg.c.i(i10, "");
            case 12:
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
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
            case 15:
            case 25:
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i11) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
            case 16:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i13 = calendar2.get(1);
                if (i13 == i12 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                } else if (i13 == i12) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
                }
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i14) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 27:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 28:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41428a) {
            case 14:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        hs hsVar = (hs) obj;
        switch (this.f41428a) {
            case 1:
                return hsVar.f38502b;
            case 2:
            case 4:
            default:
                return hsVar.f38504e;
            case 3:
                return hsVar.f38503c;
            case 5:
                return hsVar.d;
        }
    }

    @Override
    public void q(org.telegram.ui.Components.yd0 yd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.g5.f26278a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f41428a) {
            case 9:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
