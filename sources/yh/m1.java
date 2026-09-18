package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class m1 implements Runnable {
    public final int f47462a;
    public final a4 f47463b;
    public final TL_stars.TL_starGiftUnique f47464c;
    public final zf.a d;
    public final Runnable e;

    public m1(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f47462a = i10;
        this.f47463b = a4Var;
        this.f47464c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f47462a;
        zf.b bVar = zf.b.f48982a;
        zf.b bVar2 = zf.b.f48983b;
        Runnable runnable = this.e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f47464c;
        a4 a4Var = this.f47463b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                a4Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f48980a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                a4Var.f46981e0.setResellPrice(aVar);
                xh.c2 c2Var = a4Var.f46980d1;
                if (c2Var != null) {
                    c2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.k0.s(R.string.Gift2ResaleEnable, new Object[]{a4Var.C1()}, a4Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f48980a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                a4Var.f46981e0.setResellPrice(aVar);
                xh.c2 c2Var2 = a4Var.f46980d1;
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
