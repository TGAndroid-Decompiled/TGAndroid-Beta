package qf;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class x0 {

    public int f46493a;

    public int f46494b;

    public x0(int i10, int i11) {
        this.f46493a = i10;
        this.f46494b = i11;
    }

    public static String a(int i10) {
        int i11 = i10 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i10 - i11) / 60) % 24, i11);
        String str = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
        return i10 > 1440 ? LocaleController.formatString(R.string.BusinessHoursNextDay, str) : str;
    }

    public final String toString() {
        return a(this.f46493a) + " - " + a(this.f46494b);
    }
}
