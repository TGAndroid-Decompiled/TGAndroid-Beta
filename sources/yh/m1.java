package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Runnable {
    public final int f47385a;
    public final y3 f47386b;
    public final TL_stars.TL_starGiftUnique f47387c;
    public final zf.a d;
    public final Runnable e;

    public m1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f47385a = i10;
        this.f47386b = y3Var;
        this.f47387c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f47385a;
        zf.b bVar = zf.b.f48898a;
        zf.b bVar2 = zf.b.f48899b;
        Runnable runnable = this.e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f47387c;
        y3 y3Var = this.f47386b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                y3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f48896a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                y3Var.f47954e0.setResellPrice(aVar);
                xh.d2 d2Var = y3Var.f47953d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.c.s(R.string.Gift2ResaleEnable, new Object[]{y3Var.C1()}, y3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f48896a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                y3Var.f47954e0.setResellPrice(aVar);
                xh.d2 d2Var2 = y3Var.f47953d1;
                if (d2Var2 != null) {
                    d2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
