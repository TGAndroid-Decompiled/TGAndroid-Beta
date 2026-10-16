package uh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.zc;
public final class c implements am0 {
    public final c6 f46437a;
    public final Context f46438b;
    public final f f46439c;

    public c(Context context, c6 c6Var, f fVar) {
        this.f46439c = fVar;
        this.f46437a = c6Var;
        this.f46438b = context;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f46439c;
        s20 s20Var = fVar.f46452h0;
        HashMap hashMap = fVar.f46454j0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f46448d0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            s20Var.c((z30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.m0;
            if (size >= i11) {
                new zc(fVar.f46457n0, this.f46437a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            z30 z30Var = new z30(this.f46438b, tL_help_country);
            z30Var.setOnClickListener(new a(fVar, 4));
            s20Var.a(z30Var);
            hashMap.put(tL_help_country.iso2, z30Var);
            z10 = true;
        }
        if (view instanceof yg.b) {
            ((yg.b) view).c(z10, true);
        }
        fVar.f46448d0.N(true);
        fVar.f46449e0.b(hashMap.size(), true);
    }
}
