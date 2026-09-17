package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z20 implements org.telegram.ui.Components.qc0 {
    public final int f40101a;
    public final long f40102b;
    public final Calendar f40103c;
    public final int d;

    public z20(long j3, Calendar calendar, int i10, int i11) {
        this.f40101a = i11;
        this.f40102b = j3;
        this.f40103c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f40101a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j3 = (i10 * 86400000) + this.f40102b;
                Calendar calendar = this.f40103c;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j3) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j3);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f40102b;
                Calendar calendar2 = this.f40103c;
                calendar2.setTimeInMillis(j10);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
        }
    }
}
