package q2;

import android.os.Build;
import java.util.UUID;
public final class r implements k2.b {
    public static final boolean f53758c;
    public final UUID f53759a;
    public final byte[] f53760b;

    static {
        boolean z9;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
                f53758c = z9;
            }
        }
        z9 = false;
        f53758c = z9;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f53759a = uuid;
        this.f53760b = bArr;
    }
}
