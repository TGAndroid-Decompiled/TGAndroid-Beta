package vg;

import org.telegram.messenger.nk;
import org.telegram.ui.cy;
import org.telegram.ui.web.m;
import ug.a0;
public final class c implements Runnable {
    public final int f48363a;
    public final e f48364b;

    public c(e eVar, int i10) {
        this.f48363a = i10;
        this.f48364b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48363a) {
            case 0:
                this.f48364b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48364b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                cy cyVar = new cy(nk.d(3, "onlySelect", "dialogsType", true));
                cyVar.C2 = new m(19, eVar, sb3);
                eVar.e.presentFragment(cyVar);
                ((a0) eVar).f47651r.dismiss();
                return;
        }
    }
}
