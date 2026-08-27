package qc;

import g7.n7;
import h7.p6;
import h7.q6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class f extends p6 {
    public static boolean a(Object[] objArr, Object obj) {
        int i10;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i10 = 0;
            while (i10 < length) {
                if (objArr[i10] != null) {
                    i10++;
                }
            }
            i10 = -1;
        } else {
            int length2 = objArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (obj.equals(objArr[i11])) {
                    i10 = i11;
                }
            }
            i10 = -1;
        }
        return i10 >= 0;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ",");
            }
            n7.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public static List g(long[] jArr) {
        kotlin.jvm.internal.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return o.f46210a;
        }
        int iF = 0;
        if (length == 1) {
            return q6.a(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        int length2 = jArr.length;
        while (iF < length2) {
            iF = com.google.android.recaptcha.internal.a.f(jArr[iF], arrayList, iF, 1);
        }
        return arrayList;
    }

    public static List h(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new d(objArr, false)) : q6.a(objArr[0]);
        }
        return o.f46210a;
    }
}
