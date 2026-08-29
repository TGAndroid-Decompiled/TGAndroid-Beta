package th;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f48712a = 0;
    public boolean f48713b;
    public boolean f48714c;
    public boolean d;
    public String f48715e;
    public float f48716f;
    public TLRPC.Photo f48717g;
    public TLRPC.Document h;
    public TLRPC.Document f48718i;
    public int f48719j;
    public int f48720k;
    public int f48721l;
    public int f48722m;
    public boolean f48723n;

    public final boolean a() {
        if (this.f48712a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f48712a == 2) {
            if (!this.f48713b && !this.f48714c && !this.d) {
                if (this.f48717g != null) {
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
