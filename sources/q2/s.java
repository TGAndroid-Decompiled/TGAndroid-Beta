package q2;

import android.os.Build;
import java.util.UUID;
public final class s implements k2.b {
    public static final boolean f55194c;
    public final UUID f55195a;
    public final byte[] f55196b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f55194c = z10;
            }
        }
        z10 = false;
        f55194c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f55195a = uuid;
        this.f55196b = bArr;
    }
}
