package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.ty;
import qg.x1;
import tg.b0;
public final class c implements Runnable {
    public final int f48961a;
    public final e f48962b;

    public c(e eVar, int i10) {
        this.f48961a = i10;
        this.f48962b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48961a) {
            case 0:
                this.f48962b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48962b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ty tyVar = new ty(bi.d(3, "onlySelect", "dialogsType", true));
                tyVar.C2 = new x1(12, eVar, sb3);
                eVar.f48967e.presentFragment(tyVar);
                ((b0) eVar).f48340r.dismiss();
                return;
        }
    }
}
