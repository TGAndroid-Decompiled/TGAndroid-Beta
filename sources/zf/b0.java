package zf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 extends s4.n {
    public final g0 f55443b;

    public b0(g0 g0Var) {
        this.f55443b = g0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        g0 g0Var = this.f55443b;
        e0 e0Var = (e0) g0Var.f55501f3.get(i10);
        e0 e0Var2 = (e0) g0Var.f55500e3.get(i11);
        if (e0Var.b(e0Var2)) {
            int i12 = e0Var.d;
            if (i12 == 4) {
                TLObject tLObject = e0Var.f55478f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = e0Var2.f55478f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f19942id == ((TLRPC.User) tLObject2).f19942id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = e0Var2.f55478f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f19793id == ((TLRPC.Chat) tLObject3).f19793id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return e0Var.f55477c.equals(e0Var2.f55477c);
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
        return this.f55443b.f55500e3.size();
    }

    @Override
    public final int e() {
        return this.f55443b.f55501f3.size();
    }
}
