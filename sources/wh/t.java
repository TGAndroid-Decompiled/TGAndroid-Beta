package wh;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f50066a = 0;
    public boolean f50067b;
    public boolean f50068c;
    public boolean d;
    public String f50069e;
    public float f50070f;
    public TLRPC.Photo f50071g;
    public TLRPC.Document h;
    public TLRPC.Document f50072i;
    public int f50073j;
    public int f50074k;
    public int f50075l;
    public int f50076m;
    public boolean f50077n;

    public final boolean a() {
        if (this.f50066a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f50066a == 2) {
            if (!this.f50067b && !this.f50068c && !this.d) {
                if (this.f50071g != null) {
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
