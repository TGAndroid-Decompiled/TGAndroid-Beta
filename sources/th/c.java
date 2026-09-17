package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.vc;
public final class c implements al0 {
    public final f6 f43274a;
    public final Context f43275b;
    public final f f43276c;

    public c(Context context, f6 f6Var, f fVar) {
        this.f43276c = fVar;
        this.f43274a = f6Var;
        this.f43275b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f43276c;
        f20 f20Var = fVar.f43289h0;
        HashMap hashMap = fVar.f43291j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f43285d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            f20Var.c((m30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new vc(fVar.f43294n0, this.f43274a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            m30 m30Var = new m30(this.f43275b, tL_help_country);
            m30Var.setOnClickListener(new a(fVar, 4));
            f20Var.a(m30Var);
            hashMap.put(tL_help_country.iso2, m30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f43285d0.N(true);
        fVar.f43286e0.b(hashMap.size(), true);
    }
}
