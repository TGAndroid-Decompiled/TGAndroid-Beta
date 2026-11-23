package q2;

import android.os.Build;
import java.util.UUID;
public final class r implements k2.b {
    public static final boolean f55813c;
    public final UUID f55814a;
    public final byte[] f55815b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f55813c = z10;
            }
        }
        z10 = false;
        f55813c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f55814a = uuid;
        this.f55815b = bArr;
    }
}
