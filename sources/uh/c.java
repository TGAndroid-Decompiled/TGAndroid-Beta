package uh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
public final class c implements xl0 {
    public final d6 f47832a;
    public final Context f47833b;
    public final f f47834c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f47834c = fVar;
        this.f47832a = d6Var;
        this.f47833b = context;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f47834c;
        o20 o20Var = fVar.f47847h0;
        HashMap hashMap = fVar.f47849j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f47843d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            o20Var.c((v30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new xc(fVar.f47852n0, this.f47832a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            v30 v30Var = new v30(this.f47833b, tL_help_country);
            v30Var.setOnClickListener(new a(fVar, 4));
            o20Var.a(v30Var);
            hashMap.put(tL_help_country.iso2, v30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.f47843d0.N(true);
        fVar.f47844e0.b(hashMap.size(), true);
    }
}
