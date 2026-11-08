package org.telegram.ui;

import java.util.Calendar;
public final class t00 implements org.telegram.ui.Components.db0 {
    public final int f49865a;
    public final long f49866b;
    public final Calendar f49867c;
    public final int d;

    public t00(long j3, Calendar calendar, int i7, int i10) {
        this.f49865a = i10;
        this.f49866b = j3;
        this.f49867c = calendar;
        this.d = i7;
    }

    @Override
    public final String h(int i7) {
        int i10 = this.f49865a;
        int i11 = this.d;
        Calendar calendar = this.f49867c;
        long j3 = this.f49866b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131748532, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.id.E0().A0().format(j10) + " " + org.telegram.messenger.id.E0().w0().format(j10);
                }
                return org.telegram.messenger.id.E0().y0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131748532, "MessageScheduleToday");
                }
                long j11 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j11);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.id.E0().w0().format(j11);
                }
                return org.telegram.messenger.id.E0().y0().format(j11);
        }
    }
}
