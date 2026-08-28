package pc;

import f7.m7;
import g7.n6;
import g7.o6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class f extends n6 {
    public static boolean a(Object[] objArr, Object obj) {
        int i9;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i9 = 0;
            while (i9 < length) {
                if (objArr[i9] == null) {
                    break;
                }
                i9++;
            }
            i9 = -1;
        } else {
            int length2 = objArr.length;
            for (int i10 = 0; i10 < length2; i10++) {
                if (obj.equals(objArr[i10])) {
                    i9 = i10;
                    break;
                }
            }
            i9 = -1;
        }
        if (i9 < 0) {
            return false;
        }
        return true;
    }

    public static void b(int i9, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i9, i11 - i10);
    }

    public static void c(int i9, int i10, int i11, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i9, i11 - i10);
    }

    public static void d(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        c(0, i9, i10, objArr, objArr2);
    }

    public static final void e(int i9, int i10, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i9, i10, (Object) null);
    }

    public static String f(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int i9 = 0;
        for (Object obj : objArr) {
            i9++;
            if (i9 > 1) {
                sb2.append((CharSequence) ",");
            }
            m7.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public static List g(long[] jArr) {
        kotlin.jvm.internal.i.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            int i9 = 0;
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                int length2 = jArr.length;
                while (i9 < length2) {
                    i9 = aa.d.g(jArr[i9], arrayList, i9, 1);
                }
                return arrayList;
            }
            return o6.a(Long.valueOf(jArr[0]));
        }
        return o.f45540a;
    }

    public static List h(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new d(objArr, false));
            }
            return o6.a(objArr[0]);
        }
        return o.f45540a;
    }
}
