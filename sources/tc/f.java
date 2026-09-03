package tc;

import j7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.s7;
import k7.t7;
public abstract class f extends s7 {
    public static boolean a(Object[] objArr, Object obj) {
        int i10;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i10 = 0;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    break;
                }
                i10++;
            }
            i10 = -1;
        } else {
            int length2 = objArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (obj.equals(objArr[i11])) {
                    i10 = i11;
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public static void b(int i10, int i11, int i12, int[] iArr, int[] destination) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    public static void c(int i10, int i11, int i12, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    public static void d(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        c(0, i10, i11, objArr, objArr2);
    }

    public static final void e(int i10, int i11, Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static String f(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) ",");
            }
            r8.a(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public static List g(long[] jArr) {
        kotlin.jvm.internal.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                int length2 = jArr.length;
                while (i10 < length2) {
                    i10 = android.support.v4.media.a.g(jArr[i10], arrayList, i10, 1);
                }
                return arrayList;
            }
            return t7.a(Long.valueOf(jArr[0]));
        }
        return o.f48100a;
    }

    public static List h(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new d(objArr, false));
            }
            return t7.a(objArr[0]);
        }
        return o.f48100a;
    }
}
