package zf;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j41;
public final class k0 implements Runnable {
    public final int f55553a;
    public final Object f55554b;
    public final Object f55555c;
    public final Object d;

    public k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f55553a = i10;
        this.f55555c = obj;
        this.f55554b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f55553a) {
            case 0:
                x0 x0Var = (x0) this.f55555c;
                a0.h hVar = (a0.h) this.d;
                x0Var.f55662p0 = null;
                x0Var.Y(hVar, (ArrayList) this.f55554b, true);
                return;
            case 1:
                m1 m1Var = (m1) this.f55555c;
                ArrayList arrayList = (ArrayList) this.f55554b;
                m1Var.f55588q = arrayList;
                m1Var.f55589r = (HashMap) this.d;
                m1Var.f55590s = true;
                m1Var.f55575a.c0(arrayList);
                return;
            default:
                n1 n1Var = (n1) this.f55555c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = ((TLRPC.TL_messages_searchStickerSets) this.f55554b).f19907q;
                o1 o1Var = n1Var.f55595a;
                String str2 = o1Var.R;
                j41 j41Var = o1Var.e;
                if (str.equals(str2)) {
                    n1Var.a();
                    j41Var.f27223b.h.getProgressDrawable().e = false;
                    o1Var.N = 0;
                    j41Var.b(true);
                    o1Var.E.addAll(tL_messages_foundStickerSets.sets);
                    o1Var.f();
                    return;
                }
                return;
        }
    }
}
