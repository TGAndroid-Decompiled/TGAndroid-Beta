package xg;

import org.telegram.ui.Cells.c0;
import org.telegram.ui.cx;
import org.telegram.ui.wc1;
import wg.b0;
public final class c implements Runnable {
    public final int f60480a;
    public final e f60481b;

    public c(e eVar, int i7) {
        this.f60480a = i7;
        this.f60481b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60480a) {
            case 0:
                this.f60481b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f60481b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                cx cxVar = new cx(c0.l(3, "onlySelect", "dialogsType", true));
                cxVar.E2 = new wc1(28, eVar, sb3);
                eVar.f60486e.presentFragment(cxVar);
                ((b0) eVar).f59723r.dismiss();
                return;
        }
    }
}
