package xg;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import zh.b4;
import zh.d1;
import zh.g3;
import zh.k3;
public final class a implements c20 {
    public final int f58712a;
    public final Object f58713b;

    public a(Object obj, int i7) {
        this.f58712a = i7;
        this.f58713b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f58712a) {
            case 0:
                HashMap hashMap = ((c) this.f58713b).f58729x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                return;
            case 1:
                ((f) this.f58713b).F((TLObject) obj);
                return;
            case 2:
                HashMap hashMap2 = ((i) this.f58713b).f58757r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                return;
            case 3:
                Boolean bool = (Boolean) obj;
                ((d1) this.f58713b).a();
                return;
            case 4:
                ((Boolean) obj).getClass();
                g3 g3Var = ((k3) this.f58713b).d;
                if (g3Var != null) {
                    g3Var.run();
                    return;
                }
                return;
            default:
                wg.h.j(((b4) this.f58713b).getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
