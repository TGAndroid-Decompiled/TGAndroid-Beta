package vg;

import org.telegram.messenger.sk;
import org.telegram.ui.web.o0;
import org.telegram.ui.yy;
import ug.b0;
public final class c implements Runnable {
    public final int f46967a;
    public final e f46968b;

    public c(e eVar, int i10) {
        this.f46967a = i10;
        this.f46968b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f46967a) {
            case 0:
                this.f46968b.E();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.f46968b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                yy yyVar = new yy(sk.d(3, "onlySelect", "dialogsType", true));
                yyVar.C2 = new o0(17, eVar, sb3);
                eVar.e.presentFragment(yyVar);
                ((b0) eVar).f46282r.dismiss();
                return;
        }
    }
}
