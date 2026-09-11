package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f47680a;
    public final AtomicLong f47681b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f47681b = new AtomicLong(-1L);
                this.f47680a = new com.google.android.gms.common.api.j(context, p6.b.f43955k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4958c);
                return;
            default:
                this.f47681b = new AtomicLong(-1L);
                this.f47680a = new com.google.android.gms.common.api.j(context, p6.b.f43955k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f4958c);
                return;
        }
    }
}
