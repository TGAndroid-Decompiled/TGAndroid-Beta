package zh;

import android.view.View;
import bi.k7;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.y31;
public final class u1 implements a20, b20 {
    public final z1 f60557a;

    public u1(z1 z1Var) {
        this.f60557a = z1Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.y31 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.u1.a(org.telegram.ui.Components.y31, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        y31 y31Var = (y31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        z1 z1Var = this.f60557a;
        vp0 vp0Var = z1Var.f60639a;
        int i7 = z1Var.f60640b;
        if (z1Var.f60642e != null) {
            Object obj3 = y31Var.G;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (z1Var.h) {
                    if (!z1Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z9 = savedStarGift.pinned_to_top;
                        boolean z10 = !z9;
                        if (!z9 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = z1Var.f60642e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (z1Var.f60642e.o(savedStarGift, z10, true)) {
                            hc.a0(vp0Var.f60292a).Q(2131623981, 36, id.H(',', "GiftsPinLimit", qp.s1(i7).K6)).j();
                        }
                        if (!z9) {
                            z1Var.f60643f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k7 k7Var = new k7(z1Var.getContext(), z1Var.f60640b, vp0Var.f60294c, z1Var.f60641c, null);
                k7Var.f4169c3 = new p1(z1Var, 2);
                k7Var.J2 = new org.telegram.ui.web.a0(28, z1Var, savedStarGift);
                k7Var.i2(savedStarGift, z1Var.f60642e);
                k7Var.show();
            }
        }
    }
}
