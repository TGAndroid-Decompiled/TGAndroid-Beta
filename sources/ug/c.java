package ug;

import org.telegram.messenger.rk;
import org.telegram.ui.uy;
import tg.b0;
public final class c implements Runnable {
    public final int f44038a;
    public final e f44039b;

    public c(e eVar, int i10) {
        this.f44038a = i10;
        this.f44039b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f44038a) {
            case 0:
                this.f44039b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f44039b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(rk.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new s5.e(7, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((b0) eVar).f43415r.dismiss();
                return;
        }
    }
}
