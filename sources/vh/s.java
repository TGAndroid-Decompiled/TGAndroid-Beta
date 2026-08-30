package vh;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f46150a = 0;
    public boolean f46151b;
    public boolean f46152c;
    public boolean d;
    public String e;
    public float f46153f;
    public TLRPC.Photo f46154g;
    public TLRPC.Document h;
    public TLRPC.Document f46155i;
    public int f46156j;
    public int f46157k;
    public int f46158l;
    public int f46159m;
    public boolean f46160n;

    public final boolean a() {
        if (this.f46150a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f46150a == 2) {
            if (!this.f46151b && !this.f46152c && !this.d) {
                if (this.f46154g != null) {
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
