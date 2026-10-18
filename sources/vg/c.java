package vg;

import org.telegram.messenger.kk;
import org.telegram.ui.ey;
import org.telegram.ui.web.m;
import ug.a0;
public final class c implements Runnable {
    public final int f48399a;
    public final e f48400b;

    public c(e eVar, int i10) {
        this.f48399a = i10;
        this.f48400b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48399a) {
            case 0:
                this.f48400b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48400b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ey eyVar = new ey(kk.d(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new m(19, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((a0) eVar).f47687r.dismiss();
                return;
        }
    }
}
