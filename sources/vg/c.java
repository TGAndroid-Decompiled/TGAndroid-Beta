package vg;

import org.telegram.messenger.lk;
import org.telegram.ui.ey;
import org.telegram.ui.web.n;
import ug.a0;
public final class c implements Runnable {
    public final int f48352a;
    public final e f48353b;

    public c(e eVar, int i10) {
        this.f48352a = i10;
        this.f48353b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48352a) {
            case 0:
                this.f48353b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48353b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ey eyVar = new ey(lk.d(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new n(19, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((a0) eVar).f47640r.dismiss();
                return;
        }
    }
}
