package org.telegram.ui;

import java.util.Calendar;
public final class t00 implements org.telegram.ui.Components.db0 {
    public final int f49847a;
    public final long f49848b;
    public final Calendar f49849c;
    public final int d;

    public t00(long j3, Calendar calendar, int i7, int i10) {
        this.f49847a = i10;
        this.f49848b = j3;
        this.f49849c = calendar;
        this.d = i7;
    }

    @Override
    public final String h(int i7) {
        int i10 = this.f49847a;
        int i11 = this.d;
        Calendar calendar = this.f49849c;
        long j3 = this.f49848b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == i11) {
                    return org.telegram.messenger.hd.E0().A0().format(j10) + " " + org.telegram.messenger.hd.E0().w0().format(j10);
                }
                return org.telegram.messenger.hd.E0().y0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, "MessageScheduleToday");
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
