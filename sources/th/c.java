package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.w20;
public final class c implements em0 {
    public final e6 f48458a;
    public final Context f48459b;
    public final f f48460c;

    public c(Context context, e6 e6Var, f fVar) {
        this.f48460c = fVar;
        this.f48458a = e6Var;
        this.f48459b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f48460c;
        w20 w20Var = fVar.f48473h0;
        HashMap hashMap = fVar.f48475j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f48469d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            w20Var.c((d40) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new ad(fVar.f48478n0, this.f48458a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            d40 d40Var = new d40(this.f48459b, tL_help_country);
            d40Var.setOnClickListener(new a(fVar, 4));
            w20Var.a(d40Var);
            hashMap.put(tL_help_country.iso2, d40Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f48469d0.N(true);
        fVar.f48470e0.b(hashMap.size(), true);
    }
}
