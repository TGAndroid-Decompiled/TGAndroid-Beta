package org.telegram.ui;

import java.util.Calendar;
public final class y00 implements org.telegram.ui.Components.pb0 {
    public final int f54000a;
    public final long f54001b;
    public final Calendar f54002c;
    public final int d;

    public y00(long j3, Calendar calendar, int i7, int i10) {
        this.f54000a = i10;
        this.f54001b = j3;
        this.f54002c = calendar;
        this.d = i7;
    }

    @Override
    public final String i(int i7) {
        int i10 = this.f54000a;
        int i11 = this.d;
        Calendar calendar = this.f54002c;
        long j3 = this.f54001b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.N0(2131748338, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.hd.E0().A0().format(j10) + " " + org.telegram.messenger.hd.E0().w0().format(j10);
                }
                return org.telegram.messenger.hd.E0().y0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.N0(2131748338, "MessageScheduleToday");
                }
                long j11 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j11);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.hd.E0().w0().format(j11);
                }
                return org.telegram.messenger.hd.E0().y0().format(j11);
        }
    }
}
