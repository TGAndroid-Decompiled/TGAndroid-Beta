package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.ty;
import qg.x1;
import tg.b0;
public final class c implements Runnable {
    public final int f48915a;
    public final e f48916b;

    public c(e eVar, int i10) {
        this.f48915a = i10;
        this.f48916b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48915a) {
            case 0:
                this.f48916b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48916b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ty tyVar = new ty(bi.d(3, "onlySelect", "dialogsType", true));
                tyVar.C2 = new x1(12, eVar, sb3);
                eVar.f48921e.presentFragment(tyVar);
                ((b0) eVar).f48294r.dismiss();
                return;
        }
    }
}
