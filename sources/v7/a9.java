package v7;

import w7.pa;
import x7.ia;
import z7.zf;
public final class a9 implements pa.b {
    public final int f47856a;
    public final l5.r f47857b;

    public a9(l5.r rVar, int i10) {
        this.f47856a = i10;
        this.f47857b = rVar;
    }

    @Override
    public final Object get() {
        switch (this.f47856a) {
            case 0:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f47902e);
            case 1:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f48807e);
            case 3:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.f49522e);
            case 5:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.f53046e);
            default:
                return this.f47857b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
