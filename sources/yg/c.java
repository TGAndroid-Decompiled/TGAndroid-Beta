package yg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;
import org.telegram.ui.uw;
import xg.b0;
public final class c implements Runnable {
    public final int f59438a;
    public final e f59439b;

    public c(e eVar, int i3) {
        this.f59438a = i3;
        this.f59439b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f59438a) {
            case 0:
                this.f59439b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f59439b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                uw uwVar = new uw(f1.l(3, "onlySelect", "dialogsType", true));
                uwVar.D2 = new na1(27, eVar, sb3);
                eVar.f59444e.presentFragment(uwVar);
                ((b0) eVar).f58656r.dismiss();
                return;
        }
    }
}
