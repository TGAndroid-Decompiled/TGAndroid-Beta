package yb;
public abstract class j {
    public final float f59372a;
    public final float f59373b;

    public j(float f10, float f11) {
        this.f59372a = f10;
        this.f59373b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return a7.h.a(jVar.f59372a, jVar.f59373b, jVar2.f59372a, jVar2.f59373b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f59372a == jVar.f59372a && this.f59373b == jVar.f59373b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f59373b) + (Float.floatToIntBits(this.f59372a) * 31);
    }

    public final String toString() {
        return "(" + this.f59372a + ',' + this.f59373b + ')';
    }
}
