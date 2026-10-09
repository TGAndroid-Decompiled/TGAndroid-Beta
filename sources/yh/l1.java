package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class l1 implements Runnable {
    public final int f52810a;
    public final s3 f52811b;
    public final TL_stars.TL_starGiftUnique f52812c;
    public final zf.a d;
    public final Runnable f52813e;

    public l1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f52810a = i10;
        this.f52811b = s3Var;
        this.f52812c = tL_starGiftUnique;
        this.d = aVar;
        this.f52813e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f52810a;
        zf.b bVar = zf.b.f54443a;
        zf.b bVar2 = zf.b.f54444b;
        Runnable runnable = this.f52813e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f52812c;
        s3 s3Var = this.f52811b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                s3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f54441a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                s3Var.f53169f0.setResellPrice(aVar);
                xh.d2 d2Var = s3Var.f53168e1;
                if (d2Var != null) {
                    d2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.c.q(R.string.Gift2ResaleEnable, new Object[]{s3Var.D1()}, s3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f54441a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                s3Var.f53169f0.setResellPrice(aVar);
                xh.d2 d2Var2 = s3Var.f53168e1;
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
