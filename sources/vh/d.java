package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.w00;
public final class d implements cj0 {
    public final g6 f57517a;
    public final Context f57518b;
    public final g f57519c;

    public d(Context context, g6 g6Var, g gVar) {
        this.f57519c = gVar;
        this.f57517a = g6Var;
        this.f57518b = context;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.f57519c;
        w00 w00Var = gVar.Z1;
        HashMap hashMap = gVar.f57526b2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.V1.G(i7 - 1).G) == null) {
            return;
        }
        boolean z9 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            w00Var.c((d20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.f57528e2;
            if (size >= i10) {
                q.s(id.a0(null, null, 2131747112, Integer.valueOf(i10)), new hc(gVar.f57529f2, this.f57517a), 2131624067, 36);
                return;
            }
            d20 d20Var = new d20(this.f57518b, tL_help_country);
            d20Var.setOnClickListener(new a(gVar, 4));
            w00Var.a(d20Var);
            hashMap.put(tL_help_country.iso2, d20Var);
            z9 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z9, true);
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }
}
