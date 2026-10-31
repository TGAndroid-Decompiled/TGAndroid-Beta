package sg;

import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
public final class h implements Runnable {
    public final int f48339a;
    public final o f48340b;

    public h(o oVar, int i10) {
        this.f48339a = i10;
        this.f48340b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48339a;
        o oVar = this.f48340b;
        switch (i10) {
            case 0:
                oVar.h.requestFocus();
                return;
            case 1:
                oVar.h.setFocusableInTouchMode(true);
                return;
            case 2:
                oVar.finishFragment();
                return;
            case 3:
                if (oVar.O && !oVar.N) {
                    oVar.N = true;
                    zs.e().k(98, 512);
                    oVar.f48423c.setVisibility(0);
                    oVar.f48423c.setLayerType(2, null);
                    oVar.i0(oVar.P.e);
                    oVar.P.a(true, true);
                    return;
                }
                return;
            case 4:
                gf.f.r(oVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                gf.f.r(oVar.getParentActivity(), cd.L0(2131752409, null));
                return;
            default:
                oVar.d0(false);
                return;
        }
    }
}
