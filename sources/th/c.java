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
import org.telegram.ui.Components.xc;
public final class c implements ml0 {
    public final d6 f43536a;
    public final Context f43537b;
    public final f f43538c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f43538c = fVar;
        this.f43536a = d6Var;
        this.f43537b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f43538c;
        i20 i20Var = fVar.f43551h0;
        HashMap hashMap = fVar.f43553j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f43547d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            i20Var.c((p30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new xc(fVar.f43556n0, this.f43536a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            p30 p30Var = new p30(this.f43537b, tL_help_country);
            p30Var.setOnClickListener(new a(fVar, 4));
            i20Var.a(p30Var);
            hashMap.put(tL_help_country.iso2, p30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f43547d0.N(true);
        fVar.f43548e0.b(hashMap.size(), true);
    }
}
