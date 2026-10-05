package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.yc;
public final class c implements ml0 {
    public final d6 f47159a;
    public final Context f47160b;
    public final f f47161c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f47161c = fVar;
        this.f47159a = d6Var;
        this.f47160b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f47161c;
        j20 j20Var = fVar.f47174h0;
        HashMap hashMap = fVar.f47176j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f47170d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            j20Var.c((q30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new yc(fVar.f47179n0, this.f47159a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            q30 q30Var = new q30(this.f47160b, tL_help_country);
            q30Var.setOnClickListener(new a(fVar, 4));
            j20Var.a(q30Var);
            hashMap.put(tL_help_country.iso2, q30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f47170d0.N(true);
        fVar.f47171e0.b(hashMap.size(), true);
    }
}
