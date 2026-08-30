package tf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 extends f2.q {
    public final g0 f44666b;

    public b0(g0 g0Var) {
        this.f44666b = g0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        g0 g0Var = this.f44666b;
        e0 e0Var = (e0) g0Var.V2.get(i10);
        e0 e0Var2 = (e0) g0Var.U2.get(i11);
        if (e0Var.b(e0Var2)) {
            int i12 = e0Var.d;
            if (i12 == 4) {
                TLObject tLObject = e0Var.f44706f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = e0Var2.f44706f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f19331id == ((TLRPC.User) tLObject2).f19331id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = e0Var2.f44706f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f19184id == ((TLRPC.Chat) tLObject3).f19184id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return e0Var.f44705c.equals(e0Var2.f44705c);
            } else {
                if (i12 == 7) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f44666b.U2.size();
    }

    @Override
    public final int e() {
        return this.f44666b.V2.size();
    }
}
