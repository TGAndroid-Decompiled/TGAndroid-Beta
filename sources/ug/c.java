package ug;

import org.telegram.messenger.wh;
import org.telegram.ui.uy;
import tg.b0;
public final class c implements Runnable {
    public final int f43973a;
    public final e f43974b;

    public c(e eVar, int i10) {
        this.f43973a = i10;
        this.f43974b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f43973a) {
            case 0:
                this.f43974b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f43974b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(wh.d(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new s5.e(7, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((b0) eVar).f43350r.dismiss();
                return;
        }
    }
}
