package ug;

import org.telegram.messenger.w1;
import org.telegram.ui.uy;
import tg.c0;
public final class c implements Runnable {
    public final int f43715a;
    public final e f43716b;

    public c(e eVar, int i10) {
        this.f43715a = i10;
        this.f43716b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f43715a) {
            case 0:
                this.f43716b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f43716b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(w1.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new tg.d(6, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((c0) eVar).f43117r.dismiss();
                return;
        }
    }
}
