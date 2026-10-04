package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 {
    public final zf.b f51084a;
    public final TLRPC.TL_payments_paymentFormStarGift f51085b;
    public final zf.a f51086c;

    public a3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f51084a = bVar;
        this.f51085b = tL_payments_paymentFormStarGift;
        t5[][] t5VarArr = t5.S;
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
        zf.b bVar2 = zf.b.f53296a;
        if (bVar == bVar2) {
            this.f51086c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f53297b;
        if (bVar == bVar3) {
            this.f51086c = zf.a.i(j3, bVar3);
        } else {
            this.f51086c = zf.a.i(0L, bVar2);
        }
    }
}
