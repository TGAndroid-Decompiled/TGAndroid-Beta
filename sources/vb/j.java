package vb;

import w7.z8;
public abstract class j {
    public final float f50780a;
    public final float f50781b;

    public j(float f7, float f10) {
        this.f50780a = f7;
        this.f50781b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z8.a(jVar.f50780a, jVar.f50781b, jVar2.f50780a, jVar2.f50781b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f50780a == jVar.f50780a && this.f50781b == jVar.f50781b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50781b) + (Float.floatToIntBits(this.f50780a) * 31);
    }

    public final String toString() {
        return "(" + this.f50780a + ',' + this.f50781b + ')';
    }
}
