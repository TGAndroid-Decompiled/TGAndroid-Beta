package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b3 {
    public final zf.b f47224a;
    public final TLRPC.TL_payments_paymentFormStarGift f47225b;
    public final zf.a f47226c;

    public b3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f47224a = bVar;
        this.f47225b = tL_payments_paymentFormStarGift;
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
        zf.b bVar2 = zf.b.f49208a;
        if (bVar == bVar2) {
            this.f47226c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f49209b;
        if (bVar == bVar3) {
            this.f47226c = zf.a.i(j3, bVar3);
        } else {
            this.f47226c = zf.a.i(0L, bVar2);
        }
    }
}
