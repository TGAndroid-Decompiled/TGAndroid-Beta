package org.telegram.ui;

import java.util.Calendar;
public final class r00 implements org.telegram.ui.Components.ya0 {
    public final int f48980a;
    public final long f48981b;
    public final Calendar f48982c;
    public final int d;

    public r00(long j10, Calendar calendar, int i3, int i10) {
        this.f48980a = i10;
        this.f48981b = j10;
        this.f48982c = calendar;
        this.d = i3;
    }

    @Override
    public final String e(int i3) {
        int i10 = this.f48980a;
        int i11 = this.d;
        Calendar calendar = this.f48982c;
        long j10 = this.f48981b;
        switch (i10) {
            case 0:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                long j11 = (i3 * 86400000) + j10;
                calendar.setTimeInMillis(j11);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.bd.E0().A0().format(j11) + " " + org.telegram.messenger.bd.E0().w0().format(j11);
                }
                return org.telegram.messenger.bd.E0().y0().format(j11);
            default:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, "MessageScheduleToday");
                }
                long j12 = (i3 * 86400000) + j10;
                calendar.setTimeInMillis(j12);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.bd.E0().w0().format(j12);
                }
                return org.telegram.messenger.bd.E0().y0().format(j12);
        }
    }
}
