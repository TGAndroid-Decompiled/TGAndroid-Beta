package xg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.a0;
import org.telegram.ui.zw;
import wg.b0;
public final class d implements Runnable {
    public final int f58728a;
    public final f f58729b;

    public d(f fVar, int i7) {
        this.f58728a = i7;
        this.f58729b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f58728a) {
            case 0:
                this.f58729b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.f58729b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                zw zwVar = new zw(f1.h(3, "onlySelect", "dialogsType", true));
                zwVar.D2 = new a0(25, fVar, sb3);
                fVar.f58734e.presentFragment(zwVar);
                ((b0) fVar).f57698r.dismiss();
                return;
        }
    }
}
