package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.z00;
public final class e implements gj0 {
    public final e6 f58991a;
    public final Context f58992b;
    public final h f58993c;

    public e(Context context, e6 e6Var, h hVar) {
        this.f58993c = hVar;
        this.f58991a = e6Var;
        this.f58992b = context;
    }

    @Override
    public final void b(int i7, View view) {
        TLRPC.TL_help_country tL_help_country;
        h hVar = this.f58993c;
        z00 z00Var = hVar.d2;
        HashMap hashMap = hVar.f59003f2;
        if (i7 == 0 || (tL_help_country = (TLRPC.TL_help_country) hVar.Z1.G(i7 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            z00Var.c((f20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = hVar.f59006i2;
            if (size >= i10) {
                i20.t(hd.a0(null, null, 2131747112, Integer.valueOf(i10)), new cc(hVar.f59007j2, this.f58991a), 2131624068, 36);
                return;
            }
            f20 f20Var = new f20(this.f58992b, tL_help_country);
            f20Var.setOnClickListener(new a(hVar, 4));
            z00Var.a(f20Var);
            hashMap.put(tL_help_country.iso2, f20Var);
            z10 = true;
        }
        if (view instanceof ah.c) {
            ((ah.c) view).c(z10, true);
        }
        hVar.Z1.O(true);
        hVar.f58999a2.c(hashMap.size(), true);
    }
}
