package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Runnable {
    public final int f51603a;
    public final x3 f51604b;
    public final TL_stars.TL_starGiftUnique f51605c;
    public final zf.a d;
    public final Runnable f51606e;

    public m1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f51603a = i10;
        this.f51604b = x3Var;
        this.f51605c = tL_starGiftUnique;
        this.d = aVar;
        this.f51606e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f51603a;
        zf.b bVar = zf.b.f53297a;
        zf.b bVar2 = zf.b.f53298b;
        Runnable runnable = this.f51606e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f51605c;
        x3 x3Var = this.f51604b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                x3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f53295a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                x3Var.f52215e0.setResellPrice(aVar);
                xh.d2 d2Var = x3Var.f52214d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.k0.p(R.string.Gift2ResaleEnable, new Object[]{x3Var.C1()}, x3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f53295a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                x3Var.f52215e0.setResellPrice(aVar);
                xh.d2 d2Var2 = x3Var.f52214d1;
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
