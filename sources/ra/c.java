package ra;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
public final class c implements WildcardType, Serializable {
    public final Type f46751a;
    public final Type f46752b;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z4;
        boolean z10;
        if (typeArr2.length <= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        d.b(z4);
        if (typeArr.length == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            d.c(typeArr2[0]);
            d.b(typeArr[0] == Object.class);
            this.f46752b = d.a(typeArr2[0]);
            this.f46751a = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        d.c(typeArr[0]);
        this.f46752b = null;
        this.f46751a = d.a(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && d.e(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.f46752b;
        return type != null ? new Type[]{type} : d.f46753a;
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.f46751a};
    }

    public final int hashCode() {
        int i10;
        Type type = this.f46752b;
        if (type != null) {
            i10 = type.hashCode() + 31;
        } else {
            i10 = 1;
        }
        return i10 ^ (this.f46751a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f46752b;
        if (type != null) {
            return "? super " + d.k(type);
        }
        Type type2 = this.f46751a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.k(type2);
    }
}
