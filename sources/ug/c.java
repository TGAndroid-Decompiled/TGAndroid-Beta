package ug;

import org.telegram.messenger.y0;
import org.telegram.ui.uy;
import tg.c0;
public final class c implements Runnable {
    public final int f43711a;
    public final e f43712b;

    public c(e eVar, int i10) {
        this.f43711a = i10;
        this.f43712b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f43711a) {
            case 0:
                this.f43712b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f43712b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(y0.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new tg.d(6, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((c0) eVar).f43113r.dismiss();
                return;
        }
    }
}
