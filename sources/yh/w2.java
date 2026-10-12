package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w2 {
    public final zf.b f53552a;
    public final TLRPC.TL_payments_paymentFormStarGift f53553b;
    public final zf.a f53554c;

    public w2(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f53552a = bVar;
        this.f53553b = tL_payments_paymentFormStarGift;
        n5[][] n5VarArr = n5.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i10 = 0;
            j3 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j3 += tL_labeledPrice.amount;
            }
        } else {
            j3 = 0;
        }
        zf.b bVar2 = zf.b.f54667a;
        if (bVar == bVar2) {
            this.f53554c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f54668b;
        if (bVar == bVar3) {
            this.f53554c = zf.a.i(j3, bVar3);
        } else {
            this.f53554c = zf.a.i(0L, bVar2);
        }
    }
}
