package xg;

import org.telegram.ui.Cells.c0;
import org.telegram.ui.bx;
import org.telegram.ui.uc1;
import wg.a0;
public final class c implements Runnable {
    public final int f60608a;
    public final e f60609b;

    public c(e eVar, int i7) {
        this.f60608a = i7;
        this.f60609b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60608a) {
            case 0:
                this.f60609b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f60609b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                bx bxVar = new bx(c0.l(3, "onlySelect", "dialogsType", true));
                bxVar.E2 = new uc1(28, eVar, sb3);
                eVar.f60614e.presentFragment(bxVar);
                ((a0) eVar).f59824r.dismiss();
                return;
        }
    }
}
