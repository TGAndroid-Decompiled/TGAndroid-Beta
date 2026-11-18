package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.oj0;
public final class d implements oj0 {
    public final i6 f59556a;
    public final Context f59557b;
    public final g f59558c;

    public d(Context context, i6 i6Var, g gVar) {
        this.f59558c = gVar;
        this.f59556a = i6Var;
        this.f59557b = context;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.f59558c;
        g10 g10Var = gVar.d2;
        HashMap hashMap = gVar.f59568f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Z1.G(i7 - 1).H) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            g10Var.c((m20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.f59571i2;
            if (size >= i10) {
                n10.u(gd.a0(null, null, 2131746919, Integer.valueOf(i10)), new lc(gVar.f59572j2, this.f59556a), 2131624068, 36);
                return;
            }
            m20 m20Var = new m20(this.f59557b, tL_help_country);
            m20Var.setOnClickListener(new a(gVar, 4));
            g10Var.a(m20Var);
            hashMap.put(tL_help_country.iso2, m20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        gVar.Z1.O(true);
        gVar.f59564a2.c(hashMap.size(), true);
    }
}
