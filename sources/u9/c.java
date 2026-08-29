package u9;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import s9.g;
public final class c implements s9.f {
    public static final SimpleDateFormat f49151a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f49151a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((g) obj2).f(f49151a.format((Date) obj));
    }
}
