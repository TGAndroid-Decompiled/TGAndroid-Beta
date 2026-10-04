package v7;

import w7.pa;
import x7.ia;
import z7.zf;
public final class a9 implements pa.b {
    public final int f47857a;
    public final l5.r f47858b;

    public a9(l5.r rVar, int i10) {
        this.f47857a = i10;
        this.f47858b = rVar;
    }

    @Override
    public final Object get() {
        switch (this.f47857a) {
            case 0:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f47903e);
            case 1:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f48808e);
            case 3:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.f49523e);
            case 5:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.f53047e);
            default:
                return this.f47858b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
