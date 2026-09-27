package ug;

import org.telegram.messenger.qk;
import org.telegram.ui.ty;
import tg.b0;
public final class c implements Runnable {
    public final int f44046a;
    public final e f44047b;

    public c(e eVar, int i10) {
        this.f44046a = i10;
        this.f44047b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f44046a) {
            case 0:
                this.f44047b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f44047b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ty tyVar = new ty(qk.e(3, "onlySelect", "dialogsType", true));
                tyVar.C2 = new s5.e(8, eVar, sb3);
                eVar.e.presentFragment(tyVar);
                ((b0) eVar).f43425r.dismiss();
                return;
        }
    }
}
