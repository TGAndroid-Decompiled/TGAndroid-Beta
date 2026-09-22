package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x20 implements org.telegram.ui.Components.qc0 {
    public final int f39475a;
    public final long f39476b;
    public final Calendar f39477c;
    public final int d;

    public x20(long j3, Calendar calendar, int i10, int i11) {
        this.f39475a = i11;
        this.f39476b = j3;
        this.f39477c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f39475a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j3 = (i10 * 86400000) + this.f39476b;
                Calendar calendar = this.f39477c;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j3) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j3);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f39476b;
                Calendar calendar2 = this.f39477c;
                calendar2.setTimeInMillis(j10);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
        }
    }
}
