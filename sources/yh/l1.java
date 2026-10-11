package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class l1 implements Runnable {
    public final int f52897a;
    public final s3 f52898b;
    public final TL_stars.TL_starGiftUnique f52899c;
    public final zf.a d;
    public final Runnable f52900e;

    public l1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f52897a = i10;
        this.f52898b = s3Var;
        this.f52899c = tL_starGiftUnique;
        this.d = aVar;
        this.f52900e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f52897a;
        zf.b bVar = zf.b.f54530a;
        zf.b bVar2 = zf.b.f54531b;
        Runnable runnable = this.f52900e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f52899c;
        s3 s3Var = this.f52898b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                s3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f54528a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                s3Var.f53256f0.setResellPrice(aVar);
                xh.d2 d2Var = s3Var.f53255e1;
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
                if (aVar.f54528a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                s3Var.f53256f0.setResellPrice(aVar);
                xh.d2 d2Var2 = s3Var.f53255e1;
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
