package zh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class l1 implements Runnable {
    public final int f52180a;
    public final w3 f52181b;
    public final TL_stars.TL_starGiftUnique f52182c;
    public final zf.a d;
    public final Runnable f52183e;

    public l1(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.f52180a = i10;
        this.f52181b = w3Var;
        this.f52182c = tL_starGiftUnique;
        this.d = aVar;
        this.f52183e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f52180a;
        zf.b bVar = zf.b.f51624a;
        zf.b bVar2 = zf.b.f51625b;
        Runnable runnable = this.f52183e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f52182c;
        w3 w3Var = this.f52181b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                w3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f51622a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                w3Var.f52763e0.setResellPrice(aVar);
                yh.b2 b2Var = w3Var.f52762d1;
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
                if (aVar.f51622a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                w3Var.f52763e0.setResellPrice(aVar);
                yh.b2 b2Var2 = w3Var.f52762d1;
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
