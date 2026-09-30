package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.yc;
public final class c implements ml0 {
    public final d6 f43537a;
    public final Context f43538b;
    public final f f43539c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f43539c = fVar;
        this.f43537a = d6Var;
        this.f43538b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f43539c;
        i20 i20Var = fVar.f43552h0;
        HashMap hashMap = fVar.f43554j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f43548d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            i20Var.c((p30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new yc(fVar.f43557n0, this.f43537a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            p30 p30Var = new p30(this.f43538b, tL_help_country);
            p30Var.setOnClickListener(new a(fVar, 4));
            i20Var.a(p30Var);
            hashMap.put(tL_help_country.iso2, p30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f43548d0.N(true);
        fVar.f43549e0.b(hashMap.size(), true);
    }
}
