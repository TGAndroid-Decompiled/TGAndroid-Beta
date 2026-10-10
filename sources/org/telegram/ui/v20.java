package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v20 implements org.telegram.ui.Components.rd0 {
    public final int f42663a;
    public final long f42664b;
    public final Calendar f42665c;
    public final int d;

    public v20(long j3, Calendar calendar, int i10, int i11) {
        this.f42663a = i11;
        this.f42664b = j3;
        this.f42665c = calendar;
        this.d = i10;
    }

    @Override
    public final String i(int i10) {
        switch (this.f42663a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j3 = (i10 * 86400000) + this.f42664b;
                Calendar calendar = this.f42665c;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j3) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j3);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j3);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f42664b;
                Calendar calendar2 = this.f42665c;
                calendar2.setTimeInMillis(j10);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
        }
    }
}
