package p4;

import android.net.Uri;
import h5.d0;
import j3.g;
import java.util.Arrays;
import org.telegram.ui.cl0;
public final class a implements g {
    public static final String B;
    public static final String C;
    public static final cl0 D;
    public static final String f41055r;
    public static final String f41056s;
    public static final String v;
    public static final String f41057w;
    public static final String f41058x;
    public static final String f41059y;
    public final long f41060a;
    public final int f41061b;
    public final int f41062c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f41063f;
    public final long h;
    public final boolean f41064n;

    static {
        int i10 = d0.f6924a;
        f41055r = Integer.toString(0, 36);
        f41056s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f41057w = Integer.toString(3, 36);
        f41058x = Integer.toString(4, 36);
        f41059y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new cl0(14);
    }

    public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z4) {
        boolean z10;
        if (iArr.length == uriArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        this.f41060a = j10;
        this.f41061b = i10;
        this.f41062c = i11;
        this.e = iArr;
        this.d = uriArr;
        this.f41063f = jArr;
        this.h = j11;
        this.f41064n = z4;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || this.f41064n || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f41060a == aVar.f41060a && this.f41061b == aVar.f41061b && this.f41062c == aVar.f41062c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f41063f, aVar.f41063f) && this.h == aVar.h && this.f41064n == aVar.f41064n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41060a;
        int hashCode = Arrays.hashCode(this.e);
        int hashCode2 = Arrays.hashCode(this.f41063f);
        long j11 = this.h;
        return ((((hashCode2 + ((hashCode + (((((((this.f41061b * 31) + this.f41062c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f41064n ? 1 : 0);
    }
}
