package rf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f0 {
    public final int f47220a;
    public final int f47221b;
    public final String f47222c;
    public final int d;
    public final TLRPC.MessagesFilter f47223e;
    public TLObject f47224f;
    public d0 f47225g;
    public boolean h;

    public f0(int i10, int i11, String str) {
        this.h = true;
        this.f47220a = i10;
        this.f47222c = str;
        this.f47223e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(f0 f0Var) {
        if (this.d != f0Var.d) {
            if (a() && f0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public f0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.f47220a = i10;
        this.f47221b = i11;
        this.f47223e = messagesFilter;
        this.d = i12;
    }
}
