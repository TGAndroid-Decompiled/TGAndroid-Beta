package zh;

import android.view.View;
import bi.k7;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.x31;
public final class v1 implements a20, b20 {
    public final a2 f60465a;

    public v1(a2 a2Var) {
        this.f60465a = a2Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.x31 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v1.a(org.telegram.ui.Components.x31, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        a2 a2Var = this.f60465a;
        up0 up0Var = a2Var.f60111a;
        int i7 = a2Var.f60112b;
        if (a2Var.f60114e != null) {
            Object obj3 = x31Var.G;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (a2Var.h) {
                    if (!a2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z9 = savedStarGift.pinned_to_top;
                        boolean z10 = !z9;
                        if (!z9 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = a2Var.f60114e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (a2Var.f60114e.o(savedStarGift, z10, true)) {
                            hc.a0(up0Var.f60217a).Q(2131623981, 36, hd.H(',', "GiftsPinLimit", qp.s1(i7).K6)).j();
                        }
                        if (!z9) {
                            a2Var.f60115f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k7 k7Var = new k7(a2Var.getContext(), a2Var.f60112b, up0Var.f60219c, a2Var.f60113c, null);
                k7Var.f4169c3 = new q1(a2Var, 2);
                k7Var.J2 = new org.telegram.ui.web.a0(29, a2Var, savedStarGift);
                k7Var.j2(savedStarGift, a2Var.f60114e);
                k7Var.show();
            }
        }
    }
}
