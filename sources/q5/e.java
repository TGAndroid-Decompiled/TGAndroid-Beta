package q5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
import l7.w0;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f42786a;
    public final r5.e0 f42787b;
    public final Bundle f42788c;
    public final String d = UUID.randomUUID().toString();

    public e(w0 w0Var) {
        this.f42786a = (CastDevice) w0Var.f11676b;
        this.f42787b = (r5.e0) w0Var.f11677c;
        this.f42788c = (Bundle) w0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: q5.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42786a, this.f42788c, 0, this.d});
    }
}
