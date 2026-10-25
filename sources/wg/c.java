package wg;

import org.telegram.messenger.vh;
import org.telegram.ui.cy;
import org.telegram.ui.zg1;
import vg.b0;
public final class c implements Runnable {
    public final int f51173a;
    public final e f51174b;

    public c(e eVar, int i10) {
        this.f51173a = i10;
        this.f51174b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f51173a) {
            case 0:
                this.f51174b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f51174b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                cy cyVar = new cy(vh.c(3, "onlySelect", "dialogsType", true));
                cyVar.C2 = new zg1(25, eVar, sb3);
                eVar.e.presentFragment(cyVar);
                ((b0) eVar).f50144r.dismiss();
                return;
        }
    }
}
