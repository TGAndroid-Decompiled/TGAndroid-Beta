package ug;

import org.telegram.messenger.w1;
import org.telegram.ui.wy;
import tg.c0;
public final class c implements Runnable {
    public final int f43738a;
    public final e f43739b;

    public c(e eVar, int i10) {
        this.f43738a = i10;
        this.f43739b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f43738a) {
            case 0:
                this.f43739b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f43739b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                wy wyVar = new wy(w1.e(3, "onlySelect", "dialogsType", true));
                wyVar.C2 = new tg.d(6, eVar, sb3);
                eVar.e.presentFragment(wyVar);
                ((c0) eVar).f43139r.dismiss();
                return;
        }
    }
}
