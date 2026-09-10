package tg;

import org.telegram.messenger.a2;
import org.telegram.ui.wy;
import sg.b0;
import sg.f0;
public final class c implements Runnable {
    public final int f42150a;
    public final e f42151b;

    public c(e eVar, int i10) {
        this.f42150a = i10;
        this.f42151b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f42150a) {
            case 0:
                this.f42151b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f42151b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                wy wyVar = new wy(a2.e(3, "onlySelect", "dialogsType", true));
                wyVar.C2 = new f0(1, eVar, sb3);
                eVar.e.presentFragment(wyVar);
                ((b0) eVar).f41875r.dismiss();
                return;
        }
    }
}
