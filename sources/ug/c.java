package ug;

import org.telegram.messenger.ok;
import org.telegram.ui.qy;
import tg.b0;
public final class c implements Runnable {
    public final int f44001a;
    public final e f44002b;

    public c(e eVar, int i10) {
        this.f44001a = i10;
        this.f44002b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f44001a) {
            case 0:
                this.f44002b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f44002b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                qy qyVar = new qy(ok.e(3, "onlySelect", "dialogsType", true));
                qyVar.C2 = new s5.e(8, eVar, sb3);
                eVar.e.presentFragment(qyVar);
                ((b0) eVar).f43381r.dismiss();
                return;
        }
    }
}
