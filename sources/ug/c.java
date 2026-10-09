package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.ty;
import qg.x1;
import tg.b0;
public final class c implements Runnable {
    public final int f48917a;
    public final e f48918b;

    public c(e eVar, int i10) {
        this.f48917a = i10;
        this.f48918b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48917a) {
            case 0:
                this.f48918b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48918b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ty tyVar = new ty(bi.d(3, "onlySelect", "dialogsType", true));
                tyVar.C2 = new x1(12, eVar, sb3);
                eVar.f48923e.presentFragment(tyVar);
                ((b0) eVar).f48296r.dismiss();
                return;
        }
    }
}
