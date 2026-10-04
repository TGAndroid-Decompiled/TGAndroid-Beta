package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.uy;
import rg.x;
import tg.b0;
public final class c implements Runnable {
    public final int f47652a;
    public final e f47653b;

    public c(e eVar, int i10) {
        this.f47652a = i10;
        this.f47653b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f47652a) {
            case 0:
                this.f47653b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f47653b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(bi.d(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new x(9, eVar, sb3);
                eVar.f47658e.presentFragment(uyVar);
                ((b0) eVar).f46988r.dismiss();
                return;
        }
    }
}
