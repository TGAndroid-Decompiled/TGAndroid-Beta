package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f47708a;
    public final AtomicLong f47709b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f47709b = new AtomicLong(-1L);
                this.f47708a = new com.google.android.gms.common.api.j(context, p6.b.f43982k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4985c);
                return;
            default:
                this.f47709b = new AtomicLong(-1L);
                this.f47708a = new com.google.android.gms.common.api.j(context, p6.b.f43982k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f4985c);
                return;
        }
    }
}
