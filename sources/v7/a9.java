package v7;

import w7.pa;
import x7.ja;
import z7.zf;
public final class a9 implements pa.b {
    public final int f49129a;
    public final l5.q f49130b;

    public a9(l5.q qVar, int i10) {
        this.f49129a = i10;
        this.f49130b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f49129a) {
            case 0:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f49159e);
            case 1:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f50108e);
            case 3:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.f50828e);
            case 5:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.f54179e);
            default:
                return this.f49130b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
