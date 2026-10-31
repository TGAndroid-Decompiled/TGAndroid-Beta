package vb;

import w7.z8;
public abstract class j {
    public final float f50766a;
    public final float f50767b;

    public j(float f7, float f10) {
        this.f50766a = f7;
        this.f50767b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z8.a(jVar.f50766a, jVar.f50767b, jVar2.f50766a, jVar2.f50767b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f50766a == jVar.f50766a && this.f50767b == jVar.f50767b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50767b) + (Float.floatToIntBits(this.f50766a) * 31);
    }

    public final String toString() {
        return "(" + this.f50766a + ',' + this.f50767b + ')';
    }
}
