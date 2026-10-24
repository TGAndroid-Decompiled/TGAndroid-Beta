package uh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.zl0;
public final class c implements zl0 {
    public final g6 f48271a;
    public final Context f48272b;
    public final f f48273c;

    public c(Context context, g6 g6Var, f fVar) {
        this.f48273c = fVar;
        this.f48271a = g6Var;
        this.f48272b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f48273c;
        m20 m20Var = fVar.f48286h0;
        HashMap hashMap = fVar.f48288j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f48282d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            m20Var.c((t30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new vc(fVar.f48291n0, this.f48271a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            t30 t30Var = new t30(this.f48272b, tL_help_country);
            t30Var.setOnClickListener(new a(fVar, 4));
            m20Var.a(t30Var);
            hashMap.put(tL_help_country.iso2, t30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.f48282d0.N(true);
        fVar.f48283e0.b(hashMap.size(), true);
    }
}
