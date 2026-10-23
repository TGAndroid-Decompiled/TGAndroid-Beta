package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tr implements org.telegram.ui.Components.fw0, org.telegram.ui.Components.gw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.od0 {
    public final int f42065a;

    public tr(int i10) {
        this.f42065a = i10;
    }

    @Override
    public void b(Object obj, float f7) {
        vr vrVar = (vr) obj;
        switch (this.f42065a) {
            case 1:
                vrVar.f42819b = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
            case 4:
            default:
                vrVar.e = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                vrVar.f42820c = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            case 5:
                vrVar.d = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f42065a) {
            case 10:
                return i2.o1.k(i10, "");
            case 11:
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
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
            case 14:
            case 24:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                int i12 = calendar.get(1);
                if (i12 == i11 && i10 < 7) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else if (i12 == i11) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
                } else {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                if (calendar3.get(1) == i13) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 22:
                return String.format("%02d", Integer.valueOf(i10));
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 26:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 27:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 28:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i14) {
                    return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f42065a) {
            case 13:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        vr vrVar = (vr) obj;
        switch (this.f42065a) {
            case 0:
                return vrVar.f42819b;
            case 1:
            case 3:
            default:
                return vrVar.e;
            case 2:
                return vrVar.f42820c;
            case 4:
                return vrVar.d;
        }
    }

    @Override
    public void n(org.telegram.ui.Components.qd0 qd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.f5.f26167a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f42065a) {
            case 8:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }
}
