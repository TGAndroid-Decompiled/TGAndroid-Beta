package xg;

import org.telegram.ui.Cells.y0;
import org.telegram.ui.yw;
import wg.z;
public final class c implements Runnable {
    public final int f59910a;
    public final f f59911b;

    public c(f fVar, int i7) {
        this.f59910a = i7;
        this.f59911b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f59910a) {
            case 0:
                this.f59911b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.f59911b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                yw ywVar = new yw(y0.j(3, "onlySelect", "dialogsType", true));
                ywVar.E2 = new d(fVar, sb3);
                fVar.f59918e.presentFragment(ywVar);
                ((z) fVar).f59296r.dismiss();
                return;
        }
    }
}
