package q2;

import android.os.Build;
import java.util.UUID;
public final class r implements k2.b {
    public static final boolean f53652c;
    public final UUID f53653a;
    public final byte[] f53654b;

    static {
        boolean z9;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
                f53652c = z9;
            }
        }
        z9 = false;
        f53652c = z9;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f53653a = uuid;
        this.f53654b = bArr;
    }
}
