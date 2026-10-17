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
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
public final class c implements wl0 {
    public final d6 f47847a;
    public final Context f47848b;
    public final f f47849c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f47849c = fVar;
        this.f47847a = d6Var;
        this.f47848b = context;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f47849c;
        o20 o20Var = fVar.f47862h0;
        HashMap hashMap = fVar.f47864j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f47858d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            o20Var.c((v30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new xc(fVar.f47867n0, this.f47847a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            v30 v30Var = new v30(this.f47848b, tL_help_country);
            v30Var.setOnClickListener(new a(fVar, 4));
            o20Var.a(v30Var);
            hashMap.put(tL_help_country.iso2, v30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.f47858d0.N(true);
        fVar.f47859e0.b(hashMap.size(), true);
    }
}
