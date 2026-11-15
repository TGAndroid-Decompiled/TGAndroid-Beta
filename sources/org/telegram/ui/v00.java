package org.telegram.ui;

import java.util.Calendar;
public final class v00 implements org.telegram.ui.Components.eb0 {
    public final int f52077a;
    public final long f52078b;
    public final Calendar f52079c;
    public final int d;

    public v00(long j3, Calendar calendar, int i7, int i10) {
        this.f52077a = i10;
        this.f52078b = j3;
        this.f52079c = calendar;
        this.d = i7;
    }

    @Override
    public final String e(int i7) {
        int i10 = this.f52077a;
        int i11 = this.d;
        Calendar calendar = this.f52079c;
        long j3 = this.f52078b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748531, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.hd.E0().A0().format(j10) + " " + org.telegram.messenger.hd.E0().w0().format(j10);
                }
                return org.telegram.messenger.hd.E0().y0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748531, "MessageScheduleToday");
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
