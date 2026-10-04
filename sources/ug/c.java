package ug;

import org.telegram.messenger.ok;
import org.telegram.ui.uy;
import rg.x;
import tg.b0;
public final class c implements Runnable {
    public final int f47644a;
    public final e f47645b;

    public c(e eVar, int i10) {
        this.f47644a = i10;
        this.f47645b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f47644a) {
            case 0:
                this.f47645b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f47645b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(ok.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new x(9, eVar, sb3);
                eVar.f47650e.presentFragment(uyVar);
                ((b0) eVar).f46981r.dismiss();
                return;
        }
    }
}
