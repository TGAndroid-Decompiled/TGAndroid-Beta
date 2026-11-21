package org.telegram.ui;

import java.util.Calendar;
public final class y00 implements org.telegram.ui.Components.pb0 {
    public final int f53996a;
    public final long f53997b;
    public final Calendar f53998c;
    public final int d;

    public y00(long j3, Calendar calendar, int i7, int i10) {
        this.f53996a = i10;
        this.f53997b = j3;
        this.f53998c = calendar;
        this.d = i7;
    }

    @Override
    public final String i(int i7) {
        int i10 = this.f53996a;
        int i11 = this.d;
        Calendar calendar = this.f53998c;
        long j3 = this.f53997b;
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
