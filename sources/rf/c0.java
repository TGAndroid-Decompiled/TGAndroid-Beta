package rf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 extends f2.q {
    public final h0 f47184b;

    public c0(h0 h0Var) {
        this.f47184b = h0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        h0 h0Var = this.f47184b;
        f0 f0Var = (f0) h0Var.U2.get(i10);
        f0 f0Var2 = (f0) h0Var.T2.get(i11);
        if (f0Var.b(f0Var2)) {
            int i12 = f0Var.d;
            if (i12 == 4) {
                TLObject tLObject = f0Var.f47224f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = f0Var2.f47224f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f22539id == ((TLRPC.User) tLObject2).f22539id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = f0Var2.f47224f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f22392id == ((TLRPC.Chat) tLObject3).f22392id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return f0Var.f47222c.equals(f0Var2.f47222c);
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
        return this.f47184b.T2.size();
    }

    @Override
    public final int e() {
        return this.f47184b.U2.size();
    }
}
