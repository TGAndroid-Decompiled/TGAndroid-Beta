package v7;

import w7.pa;
import x7.ja;
import z7.zf;
public final class b9 implements pa.b {
    public final int f44224a;
    public final l5.q f44225b;

    public b9(l5.q qVar, int i10) {
        this.f44224a = i10;
        this.f44225b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f44224a) {
            case 0:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("json"), e9.e);
            case 1:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("proto"), e9.d);
            case 2:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.e);
            case 3:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.e);
            case 5:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.e);
            default:
                return this.f44225b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
