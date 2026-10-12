package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Components.zc;
public final class c implements km0 {
    public final c6 f48689a;
    public final Context f48690b;
    public final f f48691c;

    public c(Context context, c6 c6Var, f fVar) {
        this.f48691c = fVar;
        this.f48689a = c6Var;
        this.f48690b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f48691c;
        z20 z20Var = fVar.f48704h0;
        HashMap hashMap = fVar.f48706j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f48700d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            z20Var.c((g40) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new zc(fVar.f48709n0, this.f48689a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            g40 g40Var = new g40(this.f48690b, tL_help_country);
            g40Var.setOnClickListener(new a(fVar, 4));
            z20Var.a(g40Var);
            hashMap.put(tL_help_country.iso2, g40Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f48700d0.N(true);
        fVar.f48701e0.b(hashMap.size(), true);
    }
}
