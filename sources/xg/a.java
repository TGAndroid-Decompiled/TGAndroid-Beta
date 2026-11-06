package xg;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import zh.b4;
import zh.e1;
import zh.h3;
import zh.k3;
import zh.m3;
public final class a implements c20 {
    public final int f58607a;
    public final Object f58608b;

    public a(Object obj, int i7) {
        this.f58607a = i7;
        this.f58608b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f58607a) {
            case 0:
                HashMap hashMap = ((c) this.f58608b).f58624x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 1:
                ((f) this.f58608b).F((TLObject) obj);
                return;
            case 2:
                HashMap hashMap2 = ((i) this.f58608b).f58652r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 3:
                Boolean bool = (Boolean) obj;
                ((e1) this.f58608b).a();
                return;
            case 4:
                ((m3) this.f58608b).j0(((Boolean) obj).booleanValue());
                return;
            case 5:
                ((Boolean) obj).getClass();
                h3 h3Var = ((k3) this.f58608b).d;
                if (h3Var != null) {
                    h3Var.run();
                    return;
                }
                return;
            default:
                wg.h.j(((b4) this.f58608b).getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
