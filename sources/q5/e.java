package q5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
import l7.w0;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f42818a;
    public final r5.e0 f42819b;
    public final Bundle f42820c;
    public final String d = UUID.randomUUID().toString();

    public e(w0 w0Var) {
        this.f42818a = (CastDevice) w0Var.f11786b;
        this.f42819b = (r5.e0) w0Var.f11787c;
        this.f42820c = (Bundle) w0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: q5.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42818a, this.f42820c, 0, this.d});
    }
}
