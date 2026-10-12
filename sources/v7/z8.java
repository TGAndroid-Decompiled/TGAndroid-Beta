package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f46858a;
    public final AtomicLong f46859b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f46859b = new AtomicLong(-1L);
                this.f46858a = new com.google.android.gms.common.api.j(context, p6.b.f43145k, new n6.q("mlkit:vision"), com.google.android.gms.common.api.i.f4897c);
                return;
            default:
                this.f46859b = new AtomicLong(-1L);
                this.f46858a = new com.google.android.gms.common.api.j(context, p6.b.f43145k, new n6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f4897c);
                return;
        }
    }
}
