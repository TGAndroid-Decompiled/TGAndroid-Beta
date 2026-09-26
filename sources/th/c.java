package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.xc;
public final class c implements ll0 {
    public final d6 f43534a;
    public final Context f43535b;
    public final f f43536c;

    public c(Context context, d6 d6Var, f fVar) {
        this.f43536c = fVar;
        this.f43534a = d6Var;
        this.f43535b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f43536c;
        h20 h20Var = fVar.f43549h0;
        HashMap hashMap = fVar.f43551j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f43545d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            h20Var.c((o30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new xc(fVar.f43554n0, this.f43534a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            o30 o30Var = new o30(this.f43535b, tL_help_country);
            o30Var.setOnClickListener(new a(fVar, 4));
            h20Var.a(o30Var);
            hashMap.put(tL_help_country.iso2, o30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f43545d0.N(true);
        fVar.f43546e0.b(hashMap.size(), true);
    }
}
