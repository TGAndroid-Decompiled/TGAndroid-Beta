package zf;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;
public final class k0 implements Runnable {
    public final int f55571a;
    public final Object f55572b;
    public final Object f55573c;
    public final Object d;

    public k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f55571a = i10;
        this.f55573c = obj;
        this.f55572b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f55571a) {
            case 0:
                x0 x0Var = (x0) this.f55573c;
                a0.h hVar = (a0.h) this.d;
                x0Var.f55680p0 = null;
                x0Var.Y(hVar, (ArrayList) this.f55572b, true);
                return;
            case 1:
                m1 m1Var = (m1) this.f55573c;
                ArrayList arrayList = (ArrayList) this.f55572b;
                m1Var.f55606q = arrayList;
                m1Var.f55607r = (HashMap) this.d;
                m1Var.f55608s = true;
                m1Var.f55593a.c0(arrayList);
                return;
            default:
                n1 n1Var = (n1) this.f55573c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = ((TLRPC.TL_messages_searchStickerSets) this.f55572b).f19908q;
                o1 o1Var = n1Var.f55613a;
                String str2 = o1Var.R;
                k41 k41Var = o1Var.e;
                if (str.equals(str2)) {
                    n1Var.a();
                    k41Var.f27727b.h.getProgressDrawable().e = false;
                    o1Var.N = 0;
                    k41Var.b(true);
                    o1Var.E.addAll(tL_messages_foundStickerSets.sets);
                    o1Var.f();
                    return;
                }
                return;
        }
    }
}
