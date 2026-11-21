package q2;

import android.os.Build;
import java.util.UUID;
public final class r implements k2.b {
    public static final boolean f55809c;
    public final UUID f55810a;
    public final byte[] f55811b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f55809c = z10;
            }
        }
        z10 = false;
        f55809c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f55810a = uuid;
        this.f55811b = bArr;
    }
}
