package vh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.zl0;
public final class c implements zl0 {
    public final u6 f50305a;
    public final Context f50306b;
    public final f f50307c;

    public c(Context context, u6 u6Var, f fVar) {
        this.f50307c = fVar;
        this.f50305a = u6Var;
        this.f50306b = context;
    }

    @Override
    public final void c(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f50307c;
        q20 q20Var = fVar.f50320h0;
        HashMap hashMap = fVar.f50322j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f50316d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            q20Var.c((x30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new wc(fVar.f50325n0, this.f50305a).R(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            x30 x30Var = new x30(this.f50306b, tL_help_country);
            x30Var.setOnClickListener(new a(fVar, 4));
            q20Var.a(x30Var);
            hashMap.put(tL_help_country.iso2, x30Var);
            z10 = true;
        }
        if (view instanceof zg.b) {
            ((zg.b) view).c(z10, true);
        }
        fVar.f50316d0.O(true);
        fVar.f50317e0.b(hashMap.size(), true);
    }
}
