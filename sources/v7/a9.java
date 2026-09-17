package v7;

import w7.pa;
import x7.ia;
import z7.zf;
public final class a9 implements pa.b {
    public final int f47381a;
    public final l5.q f47382b;

    public a9(l5.q qVar, int i10) {
        this.f47381a = i10;
        this.f47382b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f47381a) {
            case 0:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f47434e);
            case 1:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f48264e);
            case 3:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.f49042e);
            case 5:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.f51375e);
            default:
                return this.f47382b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
