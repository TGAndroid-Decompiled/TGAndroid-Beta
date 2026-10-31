package ph;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.cd;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.vq0;
public final class a2 implements o20, p20 {
    public final f2 f44973a;

    public a2(f2 f2Var) {
        this.f44973a = f2Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.a51 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: ph.a2.a(org.telegram.ui.Components.a51, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a51 a51Var = (a51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        f2 f2Var = this.f44973a;
        vq0 vq0Var = f2Var.f45042a;
        int i10 = f2Var.f45043b;
        if (f2Var.e != null) {
            Object obj3 = a51Var.G;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (f2Var.h) {
                    if (!f2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = f2Var.e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                        }
                        if (f2Var.e.o(savedStarGift, z11, true)) {
                            cc.a0(vq0Var.f45128a).Q(2131623981, 36, cd.H(',', "GiftsPinLimit", vp.r1(i10).L6)).j();
                        }
                        if (!z10) {
                            f2Var.f45045f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                rh.e4 e4Var = new rh.e4(f2Var.getContext(), f2Var.f45043b, vq0Var.f45130c, f2Var.f45044c, null);
                e4Var.f46802c3 = new u1(f2Var, 2);
                e4Var.J2 = new org.telegram.ui.web.k0(4, f2Var, savedStarGift);
                e4Var.j2(savedStarGift, f2Var.e);
                e4Var.show();
            }
        }
    }
}
