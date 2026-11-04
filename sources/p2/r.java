package p2;

import android.os.Build;
import java.util.UUID;
public final class r implements j2.b {
    public static final boolean f53124c;
    public final UUID f53125a;
    public final byte[] f53126b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f53124c = z10;
            }
        }
        z10 = false;
        f53124c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f53125a = uuid;
        this.f53126b = bArr;
    }
}
