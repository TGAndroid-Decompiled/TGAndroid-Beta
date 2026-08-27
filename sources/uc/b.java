package uc;

import a9.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import qc.c;

public final class b extends c implements a, Serializable {

    public final Enum[] f48493a;

    public b(Enum[] entries) {
        j.e(entries, "entries");
        this.f48493a = entries;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f48493a;
        j.e(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10;
    }

    @Override
    public final Object get(int i10) {
        Enum[] enumArr = this.f48493a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(p.j(i10, length, "index: ", ", size: "));
        }
        return enumArr[i10];
    }

    @Override
    public final int i() {
        return this.f48493a.length;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f48493a;
        j.e(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
