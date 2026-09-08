package zh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class l1 implements Runnable {
    public final int f52211a;
    public final w3 f52212b;
    public final TL_stars.TL_starGiftUnique f52213c;
    public final zf.a d;
    public final Runnable f52214e;

    public l1(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f52211a = i10;
        this.f52212b = w3Var;
        this.f52213c = tL_starGiftUnique;
        this.d = aVar;
        this.f52214e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f52211a;
        zf.b bVar = zf.b.f51655a;
        zf.b bVar2 = zf.b.f51656b;
        Runnable runnable = this.f52214e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f52213c;
        w3 w3Var = this.f52212b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                w3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f51653a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                w3Var.f52794e0.setResellPrice(aVar);
                yh.b2 b2Var = w3Var.f52793d1;
                if (b2Var != null) {
                    b2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i2.g.s(R.string.Gift2ResaleEnable, new Object[]{w3Var.C1()}, w3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f51653a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                w3Var.f52794e0.setResellPrice(aVar);
                yh.b2 b2Var2 = w3Var.f52793d1;
                if (b2Var2 != null) {
                    b2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
