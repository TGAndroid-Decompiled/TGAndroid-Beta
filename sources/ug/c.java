package ug;

import org.telegram.messenger.v0;
import org.telegram.ui.vy;
import qg.x1;
import tg.a0;
public final class c implements Runnable {
    public final int f49145a;
    public final e f49146b;

    public c(e eVar, int i10) {
        this.f49145a = i10;
        this.f49146b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f49145a) {
            case 0:
                this.f49146b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f49146b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                vy vyVar = new vy(v0.e(3, "onlySelect", "dialogsType", true));
                vyVar.C2 = new x1(13, eVar, sb3);
                eVar.f49151e.presentFragment(vyVar);
                ((a0) eVar).f48497r.dismiss();
                return;
        }
    }
}
