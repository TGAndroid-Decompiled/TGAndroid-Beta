package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.x20;
public final class c implements fm0 {
    public final d6 f48582a;
    public final Context f48583b;
    public final f f48584c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f48584c = fVar;
        this.f48582a = d6Var;
        this.f48583b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f48584c;
        x20 x20Var = fVar.f48597h0;
        HashMap hashMap = fVar.f48599j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f48593d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            x20Var.c((e40) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new ad(fVar.f48602n0, this.f48582a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            e40 e40Var = new e40(this.f48583b, tL_help_country);
            e40Var.setOnClickListener(new a(fVar, 4));
            x20Var.a(e40Var);
            hashMap.put(tL_help_country.iso2, e40Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f48593d0.N(true);
        fVar.f48594e0.b(hashMap.size(), true);
    }
}
