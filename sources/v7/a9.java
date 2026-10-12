package v7;

import w7.pa;
import x7.ja;
import z7.ag;
public final class a9 implements pa.b {
    public final int f49365a;
    public final l5.r f49366b;

    public a9(l5.r rVar, int i10) {
        this.f49365a = i10;
        this.f49366b = rVar;
    }

    @Override
    public final Object get() {
        switch (this.f49365a) {
            case 0:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f49395e);
            case 1:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f50343e);
            case 3:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.f51065e);
            case 5:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.f53820e);
            default:
                return this.f49366b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
