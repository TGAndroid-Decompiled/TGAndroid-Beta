package org.telegram.ui;

import java.util.Calendar;
public final class x00 implements org.telegram.ui.Components.mb0 {
    public final int f53817a;
    public final long f53818b;
    public final Calendar f53819c;
    public final int d;

    public x00(long j3, Calendar calendar, int i7, int i10) {
        this.f53817a = i10;
        this.f53818b = j3;
        this.f53819c = calendar;
        this.d = i7;
    }

    @Override
    public final String e(int i7) {
        int i10 = this.f53817a;
        int i11 = this.d;
        Calendar calendar = this.f53819c;
        long j3 = this.f53818b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131748338, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.gd.E0().A0().format(j10) + " " + org.telegram.messenger.gd.E0().w0().format(j10);
                }
                return org.telegram.messenger.gd.E0().y0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.N0(2131748338, "MessageScheduleToday");
                }
                long j11 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j11);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.gd.E0().w0().format(j11);
                }
                return org.telegram.messenger.gd.E0().y0().format(j11);
        }
    }
}
