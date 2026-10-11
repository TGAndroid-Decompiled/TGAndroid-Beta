package v7;

import w7.pa;
import x7.ja;
import z7.ag;
public final class a9 implements pa.b {
    public final int f49250a;
    public final l5.q f49251b;

    public a9(l5.q qVar, int i10) {
        this.f49250a = i10;
        this.f49251b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f49250a) {
            case 0:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.f49280e);
            case 1:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.f50229e);
            case 3:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.f50950e);
            case 5:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.f53709e);
            default:
                return this.f49251b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
