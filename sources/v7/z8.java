package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f44224a;
    public final AtomicLong f44225b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44225b = new AtomicLong(-1L);
                this.f44224a = new com.google.android.gms.common.api.j(context, p6.b.f40713k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6034c);
                return;
            default:
                this.f44225b = new AtomicLong(-1L);
                this.f44224a = new com.google.android.gms.common.api.j(context, p6.b.f40713k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6034c);
                return;
        }
    }
}
