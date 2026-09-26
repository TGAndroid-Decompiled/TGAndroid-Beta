package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s20 implements org.telegram.ui.Components.ad0 {
    public final int f37576a;
    public final long f37577b;
    public final Calendar f37578c;
    public final int d;

    public s20(long j3, Calendar calendar, int i10, int i11) {
        this.f37576a = i11;
        this.f37577b = j3;
        this.f37578c = calendar;
        this.d = i10;
    }

    @Override
    public final String j(int i10) {
        switch (this.f37576a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j3 = (i10 * 86400000) + this.f37577b;
                Calendar calendar = this.f37578c;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j3) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j3);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f37577b;
                Calendar calendar2 = this.f37578c;
                calendar2.setTimeInMillis(j10);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
        }
    }
}
