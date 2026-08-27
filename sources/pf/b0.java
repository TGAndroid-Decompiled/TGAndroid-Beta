package pf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class b0 extends f2.q {

    public final g0 f45738b;

    public b0(g0 g0Var) {
        this.f45738b = g0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        g0 g0Var = this.f45738b;
        e0 e0Var = (e0) g0Var.U2.get(i10);
        e0 e0Var2 = (e0) g0Var.T2.get(i11);
        if (!e0Var.b(e0Var2)) {
            return false;
        }
        int i12 = e0Var.d;
        if (i12 != 4) {
            if (i12 == 6) {
                return e0Var.f45781c.equals(e0Var2.f45781c);
            }
            return i12 == 7;
        }
        TLObject tLObject = e0Var.f45783f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = e0Var2.f45783f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).f22527id == ((TLRPC.User) tLObject2).f22527id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = e0Var2.f45783f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f22380id == ((TLRPC.Chat) tLObject3).f22380id;
    }

    @Override
    public final int d() {
        return this.f45738b.T2.size();
    }

    @Override
    public final int e() {
        return this.f45738b.U2.size();
    }
}
