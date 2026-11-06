package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
public final class zq implements org.telegram.ui.Components.kt0, org.telegram.ui.Components.jt0, org.telegram.messenger.oc, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.fb0, org.telegram.ui.Components.db0 {
    public final int f52635a;

    public zq(int i7) {
        this.f52635a = i7;
    }

    @Override
    public void f(Object obj, float f10) {
        br brVar = (br) obj;
        switch (this.f52635a) {
            case 0:
                brVar.I1 = f10;
                if (brVar.getParent() != null) {
                    ((View) brVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                brVar.J1 = f10;
                if (brVar.getParent() != null) {
                    ((View) brVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52635a) {
            case 5:
                u1Var.dismiss();
                return;
            case 19:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        return ((br) obj).J1;
    }

    @Override
    public String h(int i7) {
        int i10;
        switch (this.f52635a) {
            case 7:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i7);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.hd.E0().A0().format(timeInMillis) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis);
                }
                return org.telegram.messenger.hd.E0().y0().format(timeInMillis);
            case 8:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i7);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i13 = calendar2.get(1);
                if (i13 == i12 && i7 < 7) {
                    return org.telegram.messenger.hd.E0().A0().format(timeInMillis2) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis2);
                } else if (i13 == i12) {
                    return org.telegram.messenger.hd.E0().w0().format(timeInMillis2);
                } else {
                    return org.telegram.messenger.hd.E0().y0().format(timeInMillis2);
                }
            case 9:
                return String.format("%02d", Integer.valueOf(i7));
            case 10:
                return String.format("%02d", Integer.valueOf(i7));
            case 11:
                return String.format("%02d", Integer.valueOf(i7));
            case 12:
                return String.format("%02d", Integer.valueOf(i7));
            case 13:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i7);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 14:
                return String.format("%02d", Integer.valueOf(i7));
            case 15:
                return String.format("%02d", Integer.valueOf(i7));
            case 16:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i7);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) == i14) {
                    return org.telegram.messenger.hd.E0().w0().format(timeInMillis3);
                }
                return org.telegram.messenger.hd.E0().y0().format(timeInMillis3);
            case 17:
                return String.format("%02d", Integer.valueOf(i7));
            case 18:
                return String.format("%02d", Integer.valueOf(i7));
            case 19:
            case 26:
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131745362, null);
                }
                if (i7 >= 1 && i7 < 16) {
                    return org.telegram.messenger.hd.c0(i7);
                }
                if (i7 == 16) {
                    return org.telegram.messenger.hd.c0(30);
                }
                if (i7 == 17) {
                    return org.telegram.messenger.hd.c0(60);
                }
                if (i7 == 18) {
                    return org.telegram.messenger.hd.c0(3600);
                }
                if (i7 == 19) {
                    return org.telegram.messenger.hd.c0(86400);
                }
                if (i7 == 20) {
                    return org.telegram.messenger.hd.c0(604800);
                }
                return "";
            case 20:
                return org.telegram.messenger.hd.G(i7 + 1, "Times", new Object[0]);
            case 21:
                return org.telegram.messenger.hd.G(i7 + 1, "Minutes", new Object[0]);
            case 22:
                return org.telegram.messenger.hd.M0(2131747907, null);
            case 23:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i15 = calendar5.get(1);
                calendar5.add(6, i7);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) == i15) {
                    return org.telegram.messenger.hd.E0().A0().format(timeInMillis4) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis4);
                }
                return org.telegram.messenger.hd.E0().y0().format(timeInMillis4);
            case 24:
                return String.format("%02d", Integer.valueOf(i7));
            case 25:
                return String.format("%02d", Integer.valueOf(i7));
            case 27:
                boolean z9 = org.telegram.messenger.hd.f22873c0;
                int i16 = 12;
                if (z9) {
                    i10 = 24;
                } else {
                    i10 = 12;
                }
                int i17 = i7 % i10;
                if (i7 % 12 != 0 || z9) {
                    i16 = i17;
                }
                String format = String.format("%02d", Integer.valueOf(i16));
                if (i7 >= 24) {
                    return org.telegram.messenger.hd.a0(null, null, 2131752747, format);
                }
                return format;
            case 28:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public void n(org.telegram.ui.Components.hb0 hb0Var, int i7) {
        Pattern pattern = org.telegram.ui.Components.v4.f38823a;
    }

    @Override
    public void r(Exception exc) {
        switch (this.f52635a) {
            case 3:
                org.telegram.messenger.a8.g(exc, true);
                return;
            default:
                org.telegram.messenger.a8.g(exc, true);
                return;
        }
    }
}
