package v7;

import w7.na;
import x7.ja;
import z7.ag;
public final class z8 implements qa.b {
    public final int f50682a;
    public final l5.q f50683b;

    public z8(l5.q qVar, int i10) {
        this.f50682a = i10;
        this.f50683b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f50682a) {
            case 0:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("json"), c9.e);
            case 1:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("proto"), c9.d);
            case 2:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("json"), na.e);
            case 3:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("proto"), na.d);
            case 4:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("json"), ja.e);
            case 5:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("proto"), ja.d);
            case 6:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("json"), ag.e);
            default:
                return this.f50683b.a("FIREBASE_ML_SDK", new i5.c("proto"), ag.d);
        }
    }
}
