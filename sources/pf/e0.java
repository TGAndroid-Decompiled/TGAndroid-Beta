package pf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class e0 {

    public final int f45779a;

    public final int f45780b;

    public final String f45781c;
    public final int d;

    public final TLRPC.MessagesFilter f45782e;

    public TLObject f45783f;

    public c0 f45784g;
    public boolean h;

    public e0(int i10, int i11, String str) {
        this.h = true;
        this.f45779a = i10;
        this.f45781c = str;
        this.f45782e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5;
    }

    public final boolean b(e0 e0Var) {
        if (this.d == e0Var.d) {
            return true;
        }
        return a() && e0Var.a();
    }

    public e0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.f45779a = i10;
        this.f45780b = i11;
        this.f45782e = messagesFilter;
        this.d = i12;
    }
}
