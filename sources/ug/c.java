package ug;

import org.telegram.messenger.ai;
import org.telegram.ui.sy;
import q9.p;
import tg.a0;
public final class c implements Runnable {
    public final int f49004a;
    public final e f49005b;

    public c(e eVar, int i10) {
        this.f49004a = i10;
        this.f49005b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f49004a) {
            case 0:
                this.f49005b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f49005b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                sy syVar = new sy(ai.d(3, "onlySelect", "dialogsType", true));
                syVar.C2 = new p(13, eVar, sb3);
                eVar.f49010e.presentFragment(syVar);
                ((a0) eVar).f48356r.dismiss();
                return;
        }
    }
}
