package p4;

import android.net.Uri;
import h5.d0;
import j3.g;
import java.util.Arrays;
import org.telegram.ui.al0;
public final class a implements g {
    public static final String B;
    public static final String C;
    public static final al0 D;
    public static final String f41033r;
    public static final String f41034s;
    public static final String v;
    public static final String f41035w;
    public static final String f41036x;
    public static final String f41037y;
    public final long f41038a;
    public final int f41039b;
    public final int f41040c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f41041f;
    public final long h;
    public final boolean f41042n;

    static {
        int i10 = d0.f6937a;
        f41033r = Integer.toString(0, 36);
        f41034s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f41035w = Integer.toString(3, 36);
        f41036x = Integer.toString(4, 36);
        f41037y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new al0(14);
    }

    public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z4) {
        boolean z10;
        if (iArr.length == uriArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        this.f41038a = j10;
        this.f41039b = i10;
        this.f41040c = i11;
        this.e = iArr;
        this.d = uriArr;
        this.f41041f = jArr;
        this.h = j11;
        this.f41042n = z4;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || this.f41042n || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
            if (this.f41038a == aVar.f41038a && this.f41039b == aVar.f41039b && this.f41040c == aVar.f41040c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f41041f, aVar.f41041f) && this.h == aVar.h && this.f41042n == aVar.f41042n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41038a;
        int hashCode = Arrays.hashCode(this.e);
        int hashCode2 = Arrays.hashCode(this.f41041f);
        long j11 = this.h;
        return ((((hashCode2 + ((hashCode + (((((((this.f41039b * 31) + this.f41040c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f41042n ? 1 : 0);
    }
}
