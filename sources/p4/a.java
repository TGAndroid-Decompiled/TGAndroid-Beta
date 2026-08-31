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
    public static final String f44187r;
    public static final String f44188s;
    public static final String v;
    public static final String f44189w;
    public static final String f44190x;
    public static final String f44191y;
    public final long f44192a;
    public final int f44193b;
    public final int f44194c;
    public final Uri[] d;
    public final int[] f44195e;
    public final long[] f44196f;
    public final long h;
    public final boolean f44197n;

    static {
        int i10 = d0.f7237a;
        f44187r = Integer.toString(0, 36);
        f44188s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f44189w = Integer.toString(3, 36);
        f44190x = Integer.toString(4, 36);
        f44191y = Integer.toString(5, 36);
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
        this.f44192a = j10;
        this.f44193b = i10;
        this.f44194c = i11;
        this.f44195e = iArr;
        this.d = uriArr;
        this.f44196f = jArr;
        this.h = j11;
        this.f44197n = z4;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f44195e;
            if (i12 >= iArr.length || this.f44197n || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
            if (this.f44192a == aVar.f44192a && this.f44193b == aVar.f44193b && this.f44194c == aVar.f44194c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f44195e, aVar.f44195e) && Arrays.equals(this.f44196f, aVar.f44196f) && this.h == aVar.h && this.f44197n == aVar.f44197n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f44192a;
        int hashCode = Arrays.hashCode(this.f44195e);
        int hashCode2 = Arrays.hashCode(this.f44196f);
        long j11 = this.h;
        return ((((hashCode2 + ((hashCode + (((((((this.f44193b * 31) + this.f44194c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f44197n ? 1 : 0);
    }
}
