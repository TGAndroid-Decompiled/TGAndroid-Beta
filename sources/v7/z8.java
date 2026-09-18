package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f44229a;
    public final AtomicLong f44230b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44230b = new AtomicLong(-1L);
                this.f44229a = new com.google.android.gms.common.api.j(context, p6.b.f40718k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6034c);
                return;
            default:
                this.f44230b = new AtomicLong(-1L);
                this.f44229a = new com.google.android.gms.common.api.j(context, p6.b.f40718k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6034c);
                return;
        }
    }
}
