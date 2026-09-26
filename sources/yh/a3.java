package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 {
    public final zf.b f47199a;
    public final TLRPC.TL_payments_paymentFormStarGift f47200b;
    public final zf.a f47201c;

    public a3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f47199a = bVar;
        this.f47200b = tL_payments_paymentFormStarGift;
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
        zf.b bVar2 = zf.b.f49226a;
        if (bVar == bVar2) {
            this.f47201c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f49227b;
        if (bVar == bVar3) {
            this.f47201c = zf.a.i(j3, bVar3);
        } else {
            this.f47201c = zf.a.i(0L, bVar2);
        }
    }
}
