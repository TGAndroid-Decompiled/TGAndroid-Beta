package ra;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
public final class c implements WildcardType, Serializable {
    public final Type f43400a;
    public final Type f43401b;

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
            this.f43401b = d.a(typeArr2[0]);
            this.f43400a = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        d.c(typeArr[0]);
        this.f43401b = null;
        this.f43400a = d.a(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && d.e(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.f43401b;
        return type != null ? new Type[]{type} : d.f43402a;
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.f43400a};
    }

    public final int hashCode() {
        int i10;
        Type type = this.f43401b;
        if (type != null) {
            i10 = type.hashCode() + 31;
        } else {
            i10 = 1;
        }
        return i10 ^ (this.f43400a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f43401b;
        if (type != null) {
            return "? super " + d.k(type);
        }
        Type type2 = this.f43400a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.k(type2);
    }
}
