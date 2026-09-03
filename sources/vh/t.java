package vh;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f46247a = 0;
    public boolean f46248b;
    public boolean f46249c;
    public boolean d;
    public String e;
    public float f46250f;
    public TLRPC.Photo f46251g;
    public TLRPC.Document h;
    public TLRPC.Document f46252i;
    public int f46253j;
    public int f46254k;
    public int f46255l;
    public int f46256m;
    public boolean f46257n;

    public final boolean a() {
        if (this.f46247a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f46247a == 2) {
            if (!this.f46248b && !this.f46249c && !this.d) {
                if (this.f46251g != null) {
                    return true;
                }
                return false;
            } else if (this.h != null) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
