package v7;

import w7.pa;
import x7.ia;
import z7.zf;
public final class a9 implements pa.b {
    public final int f42936a;
    public final l5.q f42937b;

    public a9(l5.q qVar, int i10) {
        this.f42936a = i10;
        this.f42937b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f42936a) {
            case 0:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("json"), d9.e);
            case 1:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("proto"), d9.d);
            case 2:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("json"), pa.e);
            case 3:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("proto"), pa.d);
            case 4:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("json"), ia.e);
            case 5:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("proto"), ia.d);
            case 6:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("json"), zf.e);
            default:
                return this.f42937b.a("FIREBASE_ML_SDK", new i5.c("proto"), zf.d);
        }
    }
}
