package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 {
    public final zf.b f47200a;
    public final TLRPC.TL_payments_paymentFormStarGift f47201b;
    public final zf.a f47202c;

    public a3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f47200a = bVar;
        this.f47201b = tL_payments_paymentFormStarGift;
        s5[][] s5VarArr = s5.S;
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
        zf.b bVar2 = zf.b.f49227a;
        if (bVar == bVar2) {
            this.f47202c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f49228b;
        if (bVar == bVar3) {
            this.f47202c = zf.a.i(j3, bVar3);
        } else {
            this.f47202c = zf.a.i(0L, bVar2);
        }
    }
}
