package qh;

import org.telegram.tgnet.TLRPC;
public final class s {
    public int f46668a = 0;
    public boolean f46669b;
    public boolean f46670c;
    public boolean d;
    public String f46671e;
    public float f46672f;
    public TLRPC.Photo f46673g;
    public TLRPC.Document h;
    public TLRPC.Document f46674i;
    public int f46675j;
    public int f46676k;
    public int f46677l;
    public int f46678m;
    public boolean f46679n;

    public final boolean a() {
        if (this.f46668a == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f46668a == 2) {
            if (!this.f46669b && !this.f46670c && !this.d) {
                if (this.f46673g != null) {
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
