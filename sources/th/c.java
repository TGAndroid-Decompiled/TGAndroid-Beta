package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.yc;
public final class c implements kl0 {
    public final d6 f43521a;
    public final Context f43522b;
    public final f f43523c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f43523c = fVar;
        this.f43521a = d6Var;
        this.f43522b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f43523c;
        g20 g20Var = fVar.f43536h0;
        HashMap hashMap = fVar.f43538j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f43532d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            g20Var.c((n30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new yc(fVar.f43541n0, this.f43521a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            n30 n30Var = new n30(this.f43522b, tL_help_country);
            n30Var.setOnClickListener(new a(fVar, 4));
            g20Var.a(n30Var);
            hashMap.put(tL_help_country.iso2, n30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f43532d0.N(true);
        fVar.f43533e0.b(hashMap.size(), true);
    }
}
