package zh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class k1 implements Runnable {
    public final int f50744a;
    public final r3 f50745b;
    public final TL_stars.TL_starGiftUnique f50746c;
    public final ag.a d;
    public final Runnable e;

    public k1(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.f50744a = i10;
        this.f50745b = r3Var;
        this.f50746c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f50744a;
        ag.b bVar = ag.b.f629a;
        ag.b bVar2 = ag.b.f630b;
        Runnable runnable = this.e;
        ag.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f50746c;
        r3 r3Var = this.f50745b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                r3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f627a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                r3Var.f51078f0.setResellPrice(aVar);
                yh.b2 b2Var = r3Var.f51077e1;
                if (b2Var != null) {
                    b2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i2.d.q(R.string.Gift2ResaleEnable, new Object[]{r3Var.D1()}, r3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f627a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                r3Var.f51078f0.setResellPrice(aVar);
                yh.b2 b2Var2 = r3Var.f51077e1;
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
