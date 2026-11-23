package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.qj0;
public final class d implements qj0 {
    public final i6 f59684a;
    public final Context f59685b;
    public final g f59686c;

    public d(Context context, i6 i6Var, g gVar) {
        this.f59686c = gVar;
        this.f59684a = i6Var;
        this.f59685b = context;
    }

    @Override
    public final void b(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.f59686c;
        h10 h10Var = gVar.d2;
        HashMap hashMap = gVar.f59696f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Z1.G(i7 - 1).H) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            h10Var.c((n20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.f59699i2;
            if (size >= i10) {
                m10.u(gd.a0(null, null, 2131746918, Integer.valueOf(i10)), new kc(gVar.f59700j2, this.f59684a), 2131624068, 36);
                return;
            }
            n20 n20Var = new n20(this.f59685b, tL_help_country);
            n20Var.setOnClickListener(new a(gVar, 4));
            h10Var.a(n20Var);
            hashMap.put(tL_help_country.iso2, n20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        gVar.Z1.O(true);
        gVar.f59692a2.c(hashMap.size(), true);
    }
}
