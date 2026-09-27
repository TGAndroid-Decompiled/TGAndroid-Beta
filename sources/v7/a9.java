package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class a9 {
    public final p6.b f44241a;
    public final AtomicLong f44242b;

    public a9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44242b = new AtomicLong(-1L);
                this.f44241a = new com.google.android.gms.common.api.j(context, p6.b.f40956k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6018c);
                return;
            default:
                this.f44242b = new AtomicLong(-1L);
                this.f44241a = new com.google.android.gms.common.api.j(context, p6.b.f40956k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6018c);
                return;
        }
    }
}
