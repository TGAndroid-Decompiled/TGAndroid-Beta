package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b3 {
    public final zf.b f47291a;
    public final TLRPC.TL_payments_paymentFormStarGift f47292b;
    public final zf.a f47293c;

    public b3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f47291a = bVar;
        this.f47292b = tL_payments_paymentFormStarGift;
        u5[][] u5VarArr = u5.S;
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
        zf.b bVar2 = zf.b.f49274a;
        if (bVar == bVar2) {
            this.f47293c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f49275b;
        if (bVar == bVar3) {
            this.f47293c = zf.a.i(j3, bVar3);
        } else {
            this.f47293c = zf.a.i(0L, bVar2);
        }
    }
}
