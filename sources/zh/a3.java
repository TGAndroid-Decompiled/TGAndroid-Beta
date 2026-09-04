package zh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 {
    public final zf.b f51675a;
    public final TLRPC.TL_payments_paymentFormStarGift f51676b;
    public final zf.a f51677c;

    public a3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f51675a = bVar;
        this.f51676b = tL_payments_paymentFormStarGift;
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
        zf.b bVar2 = zf.b.f51624a;
        if (bVar == bVar2) {
            this.f51677c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.f51625b;
        if (bVar == bVar3) {
            this.f51677c = zf.a.i(j3, bVar3);
        } else {
            this.f51677c = zf.a.i(0L, bVar2);
        }
    }
}
