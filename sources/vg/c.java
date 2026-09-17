package vg;

import org.telegram.messenger.w1;
import org.telegram.ui.uy;
import sg.x;
import ug.c0;
public final class c implements Runnable {
    public final int f47829a;
    public final e f47830b;

    public c(e eVar, int i10) {
        this.f47829a = i10;
        this.f47830b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f47829a) {
            case 0:
                this.f47830b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f47830b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uy uyVar = new uy(w1.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new x(8, eVar, sb3);
                eVar.f47835e.presentFragment(uyVar);
                ((c0) eVar).f47127r.dismiss();
                return;
        }
    }
}
