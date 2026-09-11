package uh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zk0;
public final class c implements zk0 {
    public final f6 f47239a;
    public final Context f47240b;
    public final f f47241c;

    public c(Context context, f6 f6Var, f fVar) {
        this.f47241c = fVar;
        this.f47239a = f6Var;
        this.f47240b = context;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f47241c;
        f20 f20Var = fVar.f47254h0;
        HashMap hashMap = fVar.f47256j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f47250d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            f20Var.c((m30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new yc(fVar.f47259n0, this.f47239a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            m30 m30Var = new m30(this.f47240b, tL_help_country);
            m30Var.setOnClickListener(new a(fVar, 4));
            f20Var.a(m30Var);
            hashMap.put(tL_help_country.iso2, m30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.f47250d0.N(true);
        fVar.f47251e0.b(hashMap.size(), true);
    }
}
