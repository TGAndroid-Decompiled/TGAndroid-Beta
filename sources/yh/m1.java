package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Runnable {
    public final int f47388a;
    public final z3 f47389b;
    public final TL_stars.TL_starGiftUnique f47390c;
    public final zf.a d;
    public final Runnable e;

    public m1(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f47388a = i10;
        this.f47389b = z3Var;
        this.f47390c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f47388a;
        zf.b bVar = zf.b.f48947a;
        zf.b bVar2 = zf.b.f48948b;
        Runnable runnable = this.e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f47390c;
        z3 z3Var = this.f47389b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                z3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f48945a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                z3Var.f48019e0.setResellPrice(aVar);
                xh.c2 c2Var = z3Var.f48018d1;
                if (c2Var != null) {
                    c2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.c.s(R.string.Gift2ResaleEnable, new Object[]{z3Var.C1()}, z3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f48945a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                z3Var.f48019e0.setResellPrice(aVar);
                xh.c2 c2Var2 = z3Var.f48018d1;
                if (c2Var2 != null) {
                    c2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
