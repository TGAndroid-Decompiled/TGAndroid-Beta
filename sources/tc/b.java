package tc;

import aa.d;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import pc.c;
public final class b extends c implements a, Serializable {
    public final Enum[] f47771a;

    public b(Enum[] entries) {
        i.e(entries, "entries");
        this.f47771a = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f47771a;
            i.e(enumArr, "<this>");
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
    public final Object get(int i9) {
        Enum[] enumArr = this.f47771a;
        int length = enumArr.length;
        if (i9 >= 0 && i9 < length) {
            return enumArr[i9];
        }
        throw new IndexOutOfBoundsException(d.k(i9, length, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f47771a.length;
    }

    @Override
    public final int indexOf(Object obj) {
        Enum r12;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            Enum[] enumArr = this.f47771a;
            i.e(enumArr, "<this>");
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
