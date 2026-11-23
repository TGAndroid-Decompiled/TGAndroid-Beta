package xg;

import org.telegram.ui.Cells.c0;
import org.telegram.ui.cx;
import org.telegram.ui.wc1;
import wg.b0;
public final class c implements Runnable {
    public final int f60490a;
    public final e f60491b;

    public c(e eVar, int i7) {
        this.f60490a = i7;
        this.f60491b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60490a) {
            case 0:
                this.f60491b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f60491b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                cx cxVar = new cx(c0.l(3, "onlySelect", "dialogsType", true));
                cxVar.E2 = new wc1(28, eVar, sb3);
                eVar.f60496e.presentFragment(cxVar);
                ((b0) eVar).f59730r.dismiss();
                return;
        }
    }
}
