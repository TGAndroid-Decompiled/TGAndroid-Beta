package p8;

import h7.u6;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

public abstract class l {
    public static void a(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object b(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static u0 e(Set set, o8.f fVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof u0)) {
                return new v0(set2, fVar);
            }
            u0 u0Var = (u0) set2;
            o8.f fVar2 = u0Var.f45593b;
            fVar2.getClass();
            return new v0((SortedSet) u0Var.f45592a, new o8.g(Arrays.asList(fVar2, fVar)));
        }
        if (!(set instanceof u0)) {
            set.getClass();
            return new u0(set, fVar);
        }
        u0 u0Var2 = (u0) set;
        o8.f fVar3 = u0Var2.f45593b;
        fVar3.getClass();
        return new u0(u0Var2.f45592a, new o8.g(Arrays.asList(fVar3, fVar)));
    }

    public static Object f(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object g(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return i0.a.j(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int h(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static t0 i(Set set, c0 c0Var) {
        if (set == null) {
            throw new NullPointerException("set1");
        }
        if (c0Var != null) {
            return new t0(set, c0Var);
        }
        throw new NullPointerException("set2");
    }

    public static int j(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        a(length, "arraySize");
        ArrayList arrayList = new ArrayList(u6.d(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static HashSet l(int i10) {
        int i11;
        if (i10 < 3) {
            a(i10, "expectedSize");
            i11 = i10 + 1;
        } else {
            i11 = i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new HashSet(i11);
    }

    public static int m(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iP = p(obj);
        int i11 = iP & i10;
        int iQ = q(i11, obj3);
        if (iQ != 0) {
            int i12 = ~i10;
            int i13 = iP & i12;
            int i14 = -1;
            while (true) {
                int i15 = iQ - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) == i13 && h7.e0.a(obj, objArr[i15]) && (objArr2 == null || h7.e0.a(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i14 == -1) {
                        r(i11, i17, obj3);
                        return i15;
                    }
                    iArr[i14] = j(iArr[i14], i17, i10);
                    return i15;
                }
                int i18 = i16 & i10;
                if (i18 == 0) {
                    break;
                }
                i14 = i15;
                iQ = i18;
            }
        }
        return -1;
    }

    public static void n(List list, o8.f fVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int o(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int p(Object obj) {
        return o(obj == null ? 0 : obj.hashCode());
    }

    public static int q(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void r(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
