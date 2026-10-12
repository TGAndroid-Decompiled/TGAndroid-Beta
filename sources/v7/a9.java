package v7;

import w7.pa;
import x7.ja;
import z7.ag;
public final class a9 implements pa.b {
    public final int f49357a;
    public final l5.r f49358b;

    public a9(l5.r rVar, int i10) {
        this.f49357a = i10;
        this.f49358b = rVar;
    }

    @Override
    public final Object get() {
        switch (this.f49357a) {
            case 0:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f49387e);
            case 1:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f50335e);
            case 3:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.f51057e);
            case 5:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.f53812e);
            default:
                return this.f49358b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
