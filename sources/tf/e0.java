package tf;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e0 {
    public final int f44765a;
    public final int f44766b;
    public final String f44767c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f44768f;
    public c0 f44769g;
    public boolean h;

    public e0(int i10, int i11, String str) {
        this.h = true;
        this.f44765a = i10;
        this.f44767c = str;
        this.e = null;
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
        this.f44765a = i10;
        this.f44766b = i11;
        this.e = messagesFilter;
        this.d = i12;
    }
}
