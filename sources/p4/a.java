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
    public static final String f44218r;
    public static final String f44219s;
    public static final String v;
    public static final String f44220w;
    public static final String f44221x;
    public static final String f44222y;
    public final long f44223a;
    public final int f44224b;
    public final int f44225c;
    public final Uri[] d;
    public final int[] f44226e;
    public final long[] f44227f;
    public final long h;
    public final boolean f44228n;

    static {
        int i10 = d0.f7237a;
        f44218r = Integer.toString(0, 36);
        f44219s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f44220w = Integer.toString(3, 36);
        f44221x = Integer.toString(4, 36);
        f44222y = Integer.toString(5, 36);
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
        this.f44223a = j10;
        this.f44224b = i10;
        this.f44225c = i11;
        this.f44226e = iArr;
        this.d = uriArr;
        this.f44227f = jArr;
        this.h = j11;
        this.f44228n = z4;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f44226e;
            if (i12 >= iArr.length || this.f44228n || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
            if (this.f44223a == aVar.f44223a && this.f44224b == aVar.f44224b && this.f44225c == aVar.f44225c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f44226e, aVar.f44226e) && Arrays.equals(this.f44227f, aVar.f44227f) && this.h == aVar.h && this.f44228n == aVar.f44228n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f44223a;
        int hashCode = Arrays.hashCode(this.f44226e);
        int hashCode2 = Arrays.hashCode(this.f44227f);
        long j11 = this.h;
        return ((((hashCode2 + ((hashCode + (((((((this.f44224b * 31) + this.f44225c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f44228n ? 1 : 0);
    }
}
