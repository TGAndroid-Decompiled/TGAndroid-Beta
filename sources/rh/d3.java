package rh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d3 {
    public final sf.b f46756a;
    public final TLRPC.TL_payments_paymentFormStarGift f46757b;
    public final sf.a f46758c;

    public d3(sf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.f46756a = bVar;
        this.f46757b = tL_payments_paymentFormStarGift;
        e6[][] e6VarArr = e6.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i10 = 0;
            j10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        sf.b bVar2 = sf.b.f48256a;
        if (bVar == bVar2) {
            this.f46758c = sf.a.g(j10, bVar2);
            return;
        }
        sf.b bVar3 = sf.b.f48257b;
        if (bVar == bVar3) {
            this.f46758c = sf.a.i(j10, bVar3);
        } else {
            this.f46758c = sf.a.i(0L, bVar2);
        }
    }
}
