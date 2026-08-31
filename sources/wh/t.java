package wh;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f50029a = 0;
    public boolean f50030b;
    public boolean f50031c;
    public boolean d;
    public String f50032e;
    public float f50033f;
    public TLRPC.Photo f50034g;
    public TLRPC.Document h;
    public TLRPC.Document f50035i;
    public int f50036j;
    public int f50037k;
    public int f50038l;
    public int f50039m;
    public boolean f50040n;

    public final boolean a() {
        if (this.f50029a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f50029a == 2) {
            if (!this.f50030b && !this.f50031c && !this.d) {
                if (this.f50034g != null) {
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
