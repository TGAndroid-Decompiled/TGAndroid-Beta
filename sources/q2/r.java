package q2;

import android.os.Build;
import java.util.UUID;
public final class r implements k2.b {
    public static final boolean f55891c;
    public final UUID f55892a;
    public final byte[] f55893b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f55891c = z10;
            }
        }
        z10 = false;
        f55891c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f55892a = uuid;
        this.f55893b = bArr;
    }
}
