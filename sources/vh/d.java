package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.qj0;
public final class d implements qj0 {
    public final h6 f59595a;
    public final Context f59596b;
    public final g f59597c;

    public d(Context context, h6 h6Var, g gVar) {
        this.f59597c = gVar;
        this.f59595a = h6Var;
        this.f59596b = context;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.f59597c;
        j10 j10Var = gVar.d2;
        HashMap hashMap = gVar.f59607f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Z1.G(i7 - 1).H) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            j10Var.c((p20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.f59610i2;
            if (size >= i10) {
                n10.u(gd.a0(null, null, 2131746918, Integer.valueOf(i10)), new lc(gVar.f59611j2, this.f59595a), 2131624068, 36);
                return;
            }
            p20 p20Var = new p20(this.f59596b, tL_help_country);
            p20Var.setOnClickListener(new a(gVar, 4));
            j10Var.a(p20Var);
            hashMap.put(tL_help_country.iso2, p20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        gVar.Z1.O(true);
        gVar.f59603a2.c(hashMap.size(), true);
    }
}
