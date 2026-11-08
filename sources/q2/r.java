package q2;

import android.os.Build;
import java.util.UUID;
public final class r implements k2.b {
    public static final boolean f53745c;
    public final UUID f53746a;
    public final byte[] f53747b;

    static {
        boolean z9;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
                f53745c = z9;
            }
        }
        z9 = false;
        f53745c = z9;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f53746a = uuid;
        this.f53747b = bArr;
    }
}
