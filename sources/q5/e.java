package q5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
import l7.w0;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f44537a;
    public final r5.e0 f44538b;
    public final Bundle f44539c;
    public final String d = UUID.randomUUID().toString();

    public e(w0 w0Var) {
        this.f44537a = (CastDevice) w0Var.f12080b;
        this.f44538b = (r5.e0) w0Var.f12081c;
        this.f44539c = (Bundle) w0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: q5.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44537a, this.f44539c, 0, this.d});
    }
}
