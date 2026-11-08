package xg;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import zh.a4;
import zh.d1;
import zh.f3;
import zh.j3;
import zh.l3;
public final class a implements c20 {
    public final int f58702a;
    public final Object f58703b;

    public a(Object obj, int i7) {
        this.f58702a = i7;
        this.f58703b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f58702a) {
            case 0:
                HashMap hashMap = ((c) this.f58703b).f58719x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 1:
                ((f) this.f58703b).F((TLObject) obj);
                return;
            case 2:
                HashMap hashMap2 = ((i) this.f58703b).f58747r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 3:
                Boolean bool = (Boolean) obj;
                ((d1) this.f58703b).a();
                return;
            case 4:
                ((l3) this.f58703b).j0(((Boolean) obj).booleanValue());
                return;
            case 5:
                ((Boolean) obj).getClass();
                f3 f3Var = ((j3) this.f58703b).d;
                if (f3Var != null) {
                    f3Var.run();
                    return;
                }
                return;
            default:
                wg.h.j(((a4) this.f58703b).getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
