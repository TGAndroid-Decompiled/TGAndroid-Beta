package sh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wc;
public final class c implements jl0 {
    public final f6 f42036a;
    public final Context f42037b;
    public final f f42038c;

    public c(Context context, f6 f6Var, f fVar) {
        this.f42038c = fVar;
        this.f42036a = f6Var;
        this.f42037b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f42038c;
        o20 o20Var = fVar.f42051h0;
        HashMap hashMap = fVar.f42053j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f42047d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            o20Var.c((w30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new wc(fVar.f42056n0, this.f42036a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            w30 w30Var = new w30(this.f42037b, tL_help_country);
            w30Var.setOnClickListener(new a(fVar, 4));
            o20Var.a(w30Var);
            hashMap.put(tL_help_country.iso2, w30Var);
            z10 = true;
        }
        if (view instanceof wg.b) {
            ((wg.b) view).c(z10, true);
        }
        fVar.f42047d0.N(true);
        fVar.f42048e0.b(hashMap.size(), true);
    }
}
