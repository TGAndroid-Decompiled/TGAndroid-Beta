package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.v00;
public final class d implements bj0 {
    public final h6 f57513a;
    public final Context f57514b;
    public final g f57515c;

    public d(Context context, h6 h6Var, g gVar) {
        this.f57515c = gVar;
        this.f57513a = h6Var;
        this.f57514b = context;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.f57515c;
        v00 v00Var = gVar.f57523c2;
        HashMap hashMap = gVar.f57524e2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.Y1.G(i7 - 1).G) == null) {
            return;
        }
        boolean z9 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            v00Var.c((c20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = gVar.f57527h2;
            if (size >= i10) {
                q.s(id.a0(null, null, 2131747112, Integer.valueOf(i10)), new gc(gVar.f57528i2, this.f57513a), 2131624067, 36);
                return;
            }
            c20 c20Var = new c20(this.f57514b, tL_help_country);
            c20Var.setOnClickListener(new a(gVar, 4));
            v00Var.a(c20Var);
            hashMap.put(tL_help_country.iso2, c20Var);
            z9 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z9, true);
        }
        gVar.Y1.O(true);
        gVar.Z1.c(hashMap.size(), true);
    }
}
