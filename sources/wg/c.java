package wg;

import org.telegram.messenger.wh;
import org.telegram.ui.bh1;
import org.telegram.ui.ey;
import vg.b0;
public final class c implements Runnable {
    public final int f51234a;
    public final e f51235b;

    public c(e eVar, int i10) {
        this.f51234a = i10;
        this.f51235b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f51234a) {
            case 0:
                this.f51235b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f51235b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ey eyVar = new ey(wh.c(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new bh1(25, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((b0) eVar).f50182r.dismiss();
                return;
        }
    }
}
