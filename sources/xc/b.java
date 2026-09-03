package xc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import tc.c;
public final class b extends c implements a, Serializable {
    public final Enum[] f50537a;

    public b(Enum[] entries) {
        j.e(entries, "entries");
        this.f50537a = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f50537a;
            j.e(enumArr, "<this>");
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r02 = enumArr[ordinal];
            } else {
                r02 = null;
            }
            if (r02 == r42) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Object get(int i10) {
        Enum[] enumArr = this.f50537a;
        int length = enumArr.length;
        if (i10 >= 0 && i10 < length) {
            return enumArr[i10];
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, length, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f50537a.length;
    }

    @Override
    public final int indexOf(Object obj) {
        Enum r12;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f50537a;
            j.e(enumArr, "<this>");
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r12 = enumArr[ordinal];
            } else {
                r12 = null;
            }
            if (r12 == r42) {
                return ordinal;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((Enum) obj);
    }
}
