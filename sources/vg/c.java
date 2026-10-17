package vg;

import org.telegram.messenger.wh;
import org.telegram.ui.ey;
import org.telegram.ui.web.c0;
import ug.z;
public final class c implements Runnable {
    public final int f48374a;
    public final e f48375b;

    public c(e eVar, int i10) {
        this.f48374a = i10;
        this.f48375b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48374a) {
            case 0:
                this.f48375b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48375b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ey eyVar = new ey(wh.d(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new c0(18, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((z) eVar).f47841r.dismiss();
                return;
        }
    }
}
