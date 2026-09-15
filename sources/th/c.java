package th;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.zk0;
public final class c implements zk0 {
    public final e6 f43251a;
    public final Context f43252b;
    public final f f43253c;

    public c(Context context, e6 e6Var, f fVar) {
        this.f43253c = fVar;
        this.f43251a = e6Var;
        this.f43252b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f43253c;
        f20 f20Var = fVar.f43266h0;
        HashMap hashMap = fVar.f43268j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f43262d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            f20Var.c((m30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new vc(fVar.f43271n0, this.f43251a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            m30 m30Var = new m30(this.f43252b, tL_help_country);
            m30Var.setOnClickListener(new a(fVar, 4));
            f20Var.a(m30Var);
            hashMap.put(tL_help_country.iso2, m30Var);
            z10 = true;
        }
        if (view instanceof xg.b) {
            ((xg.b) view).c(z10, true);
        }
        fVar.f43262d0.N(true);
        fVar.f43263e0.b(hashMap.size(), true);
    }
}
