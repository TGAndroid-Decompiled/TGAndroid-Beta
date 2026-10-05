package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.uy;
import rg.x;
import tg.b0;
public final class c implements Runnable {
    public final int f47659a;
    public final e f47660b;

    public c(e eVar, int i10) {
        this.f47659a = i10;
        this.f47660b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f47659a) {
            case 0:
                this.f47660b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f47660b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(bi.d(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new x(9, eVar, sb3);
                eVar.f47665e.presentFragment(uyVar);
                ((b0) eVar).f46995r.dismiss();
                return;
        }
    }
}
