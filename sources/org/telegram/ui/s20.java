package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s20 implements org.telegram.ui.Components.bd0 {
    public final int f37575a;
    public final long f37576b;
    public final Calendar f37577c;
    public final int d;

    public s20(long j3, Calendar calendar, int i10, int i11) {
        this.f37575a = i11;
        this.f37576b = j3;
        this.f37577c = calendar;
        this.d = i10;
    }

    @Override
    public final String j(int i10) {
        switch (this.f37575a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j3 = (i10 * 86400000) + this.f37576b;
                Calendar calendar = this.f37577c;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j3) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j3);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f37576b;
                Calendar calendar2 = this.f37577c;
                calendar2.setTimeInMillis(j10);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
        }
    }
}
