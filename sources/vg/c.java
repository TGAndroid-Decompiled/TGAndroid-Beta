package vg;

import org.telegram.messenger.v0;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.ey;
import ug.z;
public final class c implements Runnable {
    public final int f48801a;
    public final e f48802b;

    public c(e eVar, int i10) {
        this.f48801a = i10;
        this.f48802b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f48801a) {
            case 0:
                this.f48802b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f48802b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                ey eyVar = new ey(v0.e(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new e8(21, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((z) eVar).f48266r.dismiss();
                return;
        }
    }
}
