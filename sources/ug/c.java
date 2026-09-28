package ug;

import org.telegram.messenger.ok;
import org.telegram.ui.qy;
import tg.b0;
public final class c implements Runnable {
    public final int f44000a;
    public final e f44001b;

    public c(e eVar, int i10) {
        this.f44000a = i10;
        this.f44001b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f44000a) {
            case 0:
                this.f44001b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f44001b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                qy qyVar = new qy(ok.e(3, "onlySelect", "dialogsType", true));
                qyVar.C2 = new s5.e(8, eVar, sb3);
                eVar.e.presentFragment(qyVar);
                ((b0) eVar).f43380r.dismiss();
                return;
        }
    }
}
