package xg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.a0;
import org.telegram.ui.ww;
import wg.b0;
public final class d implements Runnable {
    public final int f58631a;
    public final f f58632b;

    public d(f fVar, int i7) {
        this.f58631a = i7;
        this.f58632b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f58631a) {
            case 0:
                this.f58632b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.f58632b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                ww wwVar = new ww(f1.h(3, "onlySelect", "dialogsType", true));
                wwVar.C2 = new a0(26, fVar, sb3);
                fVar.f58637e.presentFragment(wwVar);
                ((b0) fVar).f57608r.dismiss();
                return;
        }
    }
}
