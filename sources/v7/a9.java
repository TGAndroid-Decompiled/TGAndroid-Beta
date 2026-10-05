package v7;

import w7.pa;
import x7.ia;
import z7.zf;
public final class a9 implements pa.b {
    public final int f47872a;
    public final l5.r f47873b;

    public a9(l5.r rVar, int i10) {
        this.f47872a = i10;
        this.f47873b = rVar;
    }

    @Override
    public final Object get() {
        switch (this.f47872a) {
            case 0:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f47918e);
            case 1:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f48823e);
            case 3:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.f49538e);
            case 5:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.f53073e);
            default:
                return this.f47873b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
