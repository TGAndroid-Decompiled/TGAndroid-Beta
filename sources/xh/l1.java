package xh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class l1 implements Runnable {
    public final int f45639a;
    public final x3 f45640b;
    public final TL_stars.TL_starGiftUnique f45641c;
    public final yf.a d;
    public final Runnable e;

    public l1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable, int i10) {
        this.f45639a = i10;
        this.f45640b = x3Var;
        this.f45641c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f45639a;
        yf.b bVar = yf.b.f46928a;
        yf.b bVar2 = yf.b.f46929b;
        Runnable runnable = this.e;
        yf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f45641c;
        x3 x3Var = this.f45640b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                x3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                if (aVar.f46926a == bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tL_starGiftUnique.resale_ton_only = z10;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                x3Var.f46275e0.setResellPrice(aVar);
                wh.b2 b2Var = x3Var.f46274d1;
                if (b2Var != null) {
                    b2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                com.google.android.gms.internal.vision.e2.o(R.string.Gift2ResaleEnable, new Object[]{x3Var.C1()}, x3Var.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            default:
                tL_starGiftUnique.flags |= 16;
                if (aVar.f46926a == bVar2) {
                    z11 = true;
                }
                tL_starGiftUnique.resale_ton_only = z11;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                x3Var.f46275e0.setResellPrice(aVar);
                wh.b2 b2Var2 = x3Var.f46274d1;
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
