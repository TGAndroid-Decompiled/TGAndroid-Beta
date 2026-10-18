package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f48290a;
    public final AtomicLong f48291b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f48291b = new AtomicLong(-1L);
                this.f48290a = new com.google.android.gms.common.api.j(context, p6.b.f44276k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6359c);
                return;
            default:
                this.f48291b = new AtomicLong(-1L);
                this.f48290a = new com.google.android.gms.common.api.j(context, p6.b.f44276k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6359c);
                return;
        }
    }
}
