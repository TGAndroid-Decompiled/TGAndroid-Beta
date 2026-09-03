package uf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e0 {
    public final int f48582a;
    public final int f48583b;
    public final String f48584c;
    public final int d;
    public final TLRPC.MessagesFilter f48585e;
    public TLObject f48586f;
    public c0 f48587g;
    public boolean h;

    public e0(int i10, int i11, String str) {
        this.h = true;
        this.f48582a = i10;
        this.f48584c = str;
        this.f48585e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(e0 e0Var) {
        if (this.d != e0Var.d) {
            if (a() && e0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public e0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.f48582a = i10;
        this.f48583b = i11;
        this.f48585e = messagesFilter;
        this.d = i12;
    }
}
