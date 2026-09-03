package p4;

import android.net.Uri;
import h5.d0;
import j3.g;
import java.util.Arrays;
import org.telegram.ui.cl0;
public final class b implements g {
    public static final b f44229f = new b(new a[0], 0, -9223372036854775807L, 0);
    public static final a h;
    public static final String f44230n;
    public static final String f44231r;
    public static final String f44232s;
    public static final String v;
    public static final cl0 f44233w;
    public final int f44234a;
    public final long f44235b;
    public final long f44236c;
    public final int d;
    public final a[] f44237e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f44226e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f44227f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new a(aVar.f44223a, 0, aVar.f44225c, copyOf, (Uri[]) Arrays.copyOf(aVar.d, 0), copyOf2, aVar.h, aVar.f44228n);
        int i10 = d0.f7237a;
        f44230n = Integer.toString(1, 36);
        f44231r = Integer.toString(2, 36);
        f44232s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f44233w = new cl0(13);
    }

    public b(a[] aVarArr, long j10, long j11, int i10) {
        this.f44235b = j10;
        this.f44236c = j11;
        this.f44234a = aVarArr.length + i10;
        this.f44237e = aVarArr;
        this.d = i10;
    }

    public final a a(int i10) {
        int i11 = this.d;
        if (i10 < i11) {
            return h;
        }
        return this.f44237e[i10 - i11];
    }

    public final boolean b(int i10) {
        if (i10 == this.f44234a - 1) {
            a a2 = a(i10);
            if (a2.f44228n && a2.f44223a == Long.MIN_VALUE && a2.f44224b == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                int i10 = d0.f7237a;
                if (this.f44234a == bVar.f44234a && this.f44235b == bVar.f44235b && this.f44236c == bVar.f44236c && this.d == bVar.d && Arrays.equals(this.f44237e, bVar.f44237e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.f44234a * 961) + ((int) this.f44235b)) * 31) + ((int) this.f44236c)) * 31) + this.d) * 31) + Arrays.hashCode(this.f44237e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f44235b);
        sb.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f44237e;
            if (i10 < aVarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(aVarArr[i10].f44223a);
                sb.append(", ads=[");
                for (int i11 = 0; i11 < aVarArr[i10].f44226e.length; i11++) {
                    sb.append("ad(state=");
                    int i12 = aVarArr[i10].f44226e[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(aVarArr[i10].f44227f[i11]);
                    sb.append(')');
                    if (i11 < aVarArr[i10].f44226e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i10 < aVarArr.length - 1) {
                    sb.append(", ");
                }
                i10++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
