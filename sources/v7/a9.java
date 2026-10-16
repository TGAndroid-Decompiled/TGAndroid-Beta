package v7;

import w7.pa;
import x7.ia;
import z7.ag;
public final class a9 implements qa.b {
    public final int f46579a;
    public final l5.q f46580b;

    public a9(l5.q qVar, int i10) {
        this.f46579a = i10;
        this.f46580b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f46579a) {
            case 0:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.e);
            case 1:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.e);
            case 3:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.e);
            case 5:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.e);
            default:
                return this.f46580b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
