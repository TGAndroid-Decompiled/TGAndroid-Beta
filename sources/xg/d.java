package xg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.a0;
import org.telegram.ui.yw;
import wg.b0;
public final class d implements Runnable {
    public final int f58730a;
    public final f f58731b;

    public d(f fVar, int i7) {
        this.f58730a = i7;
        this.f58731b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f58730a) {
            case 0:
                this.f58731b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.f58731b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                yw ywVar = new yw(f1.h(3, "onlySelect", "dialogsType", true));
                ywVar.D2 = new a0(25, fVar, sb3);
                fVar.f58736e.presentFragment(ywVar);
                ((b0) fVar).f57699r.dismiss();
                return;
        }
    }
}
