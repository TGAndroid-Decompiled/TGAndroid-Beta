package rh;

import org.telegram.tgnet.TLRPC;

public final class s {

    public int f47414a = 0;

    public boolean f47415b;

    public boolean f47416c;
    public boolean d;

    public String f47417e;

    public float f47418f;

    public TLRPC.Photo f47419g;
    public TLRPC.Document h;

    public TLRPC.Document f47420i;

    public int f47421j;

    public int f47422k;

    public int f47423l;

    public int f47424m;

    public boolean f47425n;

    public final boolean a() {
        return this.f47414a == 1;
    }

    public final boolean b() {
        if (this.f47414a != 2) {
            return false;
        }
        if (this.f47415b || this.f47416c || this.d) {
            return this.h != null;
        }
        return this.f47419g != null;
    }
}
