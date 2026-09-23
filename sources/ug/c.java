package ug;

import org.telegram.messenger.z0;
import org.telegram.ui.ry;
import tg.c0;
public final class c implements Runnable {
    public final int f43663a;
    public final e f43664b;

    public c(e eVar, int i10) {
        this.f43663a = i10;
        this.f43664b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f43663a) {
            case 0:
                this.f43664b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f43664b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ry ryVar = new ry(z0.e(3, "onlySelect", "dialogsType", true));
                ryVar.C2 = new tg.d(7, eVar, sb3);
                eVar.e.presentFragment(ryVar);
                ((c0) eVar).f43068r.dismiss();
                return;
        }
    }
}
