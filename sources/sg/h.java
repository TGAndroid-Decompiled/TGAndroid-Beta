package sg;

import org.telegram.messenger.at;
import org.telegram.messenger.dd;
public final class h implements Runnable {
    public final int f48350a;
    public final o f48351b;

    public h(o oVar, int i10) {
        this.f48350a = i10;
        this.f48351b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48350a;
        o oVar = this.f48351b;
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
                    at.e().k(98, 512);
                    oVar.f48434c.setVisibility(0);
                    oVar.f48434c.setLayerType(2, null);
                    oVar.j0(oVar.P.e);
                    oVar.P.a(true, true);
                    return;
                }
                return;
            case 4:
                gf.f.r(oVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                gf.f.r(oVar.getParentActivity(), dd.L0(2131752409, null));
                return;
            default:
                oVar.e0(false);
                return;
        }
    }
}
