package wh;

import org.telegram.tgnet.TLRPC;
public final class t {
    public int f50030a = 0;
    public boolean f50031b;
    public boolean f50032c;
    public boolean d;
    public String f50033e;
    public float f50034f;
    public TLRPC.Photo f50035g;
    public TLRPC.Document h;
    public TLRPC.Document f50036i;
    public int f50037j;
    public int f50038k;
    public int f50039l;
    public int f50040m;
    public boolean f50041n;

    public final boolean a() {
        if (this.f50030a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f50030a == 2) {
            if (!this.f50031b && !this.f50032c && !this.d) {
                if (this.f50035g != null) {
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
