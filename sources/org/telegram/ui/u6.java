package org.telegram.ui;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class u6 implements org.telegram.ui.Components.dw0, Utilities.Callback2Return, org.telegram.ui.ActionBar.z1, hh.i, org.telegram.ui.Components.jl0, org.telegram.ui.Components.rv0, org.telegram.ui.Components.sv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.ad0, org.telegram.ui.Components.cd0 {
    public final int f38311a;

    public u6(int i10) {
        this.f38311a = i10;
    }

    public static ActionMode.Callback2 c(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public void b(Object obj, float f7) {
        as asVar = (as) obj;
        switch (this.f38311a) {
            case 10:
                asVar.f32206b = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    return;
                }
                return;
            case 11:
            case 13:
            default:
                asVar.e = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    return;
                }
                return;
            case 12:
                asVar.f32207c = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    return;
                }
                return;
            case 14:
                asVar.d = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38311a) {
            case 4:
                a2Var.dismiss();
                return;
            case 7:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        as asVar = (as) obj;
        switch (this.f38311a) {
            case 9:
                return asVar.f32206b;
            case 10:
            case 12:
            default:
                return asVar.e;
            case 11:
                return asVar.f32207c;
            case 13:
                return asVar.d;
        }
    }

    @Override
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public String j(int i10) {
        switch (this.f38311a) {
            case 19:
                return hg.c.h(i10, "");
            case 20:
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
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
            case 23:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
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
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void q(org.telegram.ui.Components.ed0 ed0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.e5.f23809a;
    }

    @Override
    public void run(Exception exc) {
        switch (this.f38311a) {
            case 17:
                FileLog.e(exc);
                return;
            default:
                FileLog.e(exc);
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f38311a) {
            case 2:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void n() {
    }
}
