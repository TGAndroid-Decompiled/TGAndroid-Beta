package wh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.y10;
public final class e implements fj0 {
    public final e6 f57762a;
    public final Context f57763b;
    public final h f57764c;

    public e(Context context, e6 e6Var, h hVar) {
        this.f57764c = hVar;
        this.f57762a = e6Var;
        this.f57763b = context;
    }

    @Override
    public final void f(int i3, View view) {
        TLRPC.TL_help_country tL_help_country;
        h hVar = this.f57764c;
        r00 r00Var = hVar.f57770a2;
        HashMap hashMap = hVar.c2;
        if (i3 == 0 || (tL_help_country = (TLRPC.TL_help_country) hVar.W1.G(i3 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            r00Var.c((y10) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = hVar.f57774f2;
            if (size >= i10) {
                q.s(bd.a0(null, null, 2131747120, Integer.valueOf(i10)), new fc(hVar.f57775g2, this.f57762a), 2131624067, 36);
                return;
            }
            y10 y10Var = new y10(this.f57763b, tL_help_country);
            y10Var.setOnClickListener(new a(hVar, 4));
            r00Var.a(y10Var);
            hashMap.put(tL_help_country.iso2, y10Var);
            z10 = true;
        }
        if (view instanceof bh.c) {
            ((bh.c) view).c(z10, true);
        }
        hVar.W1.O(true);
        hVar.X1.c(hashMap.size(), true);
    }
}
