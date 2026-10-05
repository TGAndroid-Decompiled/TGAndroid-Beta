package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f48176a;
    public final AtomicLong f48177b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f48177b = new AtomicLong(-1L);
                this.f48176a = new com.google.android.gms.common.api.j(context, p6.b.f44311k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6485c);
                return;
            default:
                this.f48177b = new AtomicLong(-1L);
                this.f48176a = new com.google.android.gms.common.api.j(context, p6.b.f44311k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6485c);
                return;
        }
    }
}
