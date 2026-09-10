package xh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 {
    public final yf.b f45239a;
    public final TLRPC.TL_payments_paymentFormStarGift f45240b;
    public final yf.a f45241c;

    public a3(yf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.f45239a = bVar;
        this.f45240b = tL_payments_paymentFormStarGift;
        v5[][] v5VarArr = v5.S;
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
        yf.b bVar2 = yf.b.f46928a;
        if (bVar == bVar2) {
            this.f45241c = yf.a.g(j3, bVar2);
            return;
        }
        yf.b bVar3 = yf.b.f46929b;
        if (bVar == bVar3) {
            this.f45241c = yf.a.i(j3, bVar3);
        } else {
            this.f45241c = yf.a.i(0L, bVar2);
        }
    }
}
