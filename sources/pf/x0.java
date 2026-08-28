package pf;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x0 {
    public int f45825a;
    public int f45826b;

    public x0(int i9, int i10) {
        this.f45825a = i9;
        this.f45826b = i10;
    }

    public static String a(int i9) {
        int i10 = i9 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i9 - i10) / 60) % 24, i10);
        String format = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
        if (i9 > 1440) {
            return LocaleController.formatString(R.string.BusinessHoursNextDay, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f45825a) + " - " + a(this.f45826b);
    }
}
