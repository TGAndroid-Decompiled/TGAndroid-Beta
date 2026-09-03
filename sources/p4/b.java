package p4;

import android.net.Uri;
import h5.d0;
import j3.g;
import java.util.Arrays;
import org.telegram.ui.cl0;
public final class b implements g {
    public static final b f41065f = new b(new a[0], 0, -9223372036854775807L, 0);
    public static final a h;
    public static final String f41066n;
    public static final String f41067r;
    public static final String f41068s;
    public static final String v;
    public static final cl0 f41069w;
    public final int f41070a;
    public final long f41071b;
    public final long f41072c;
    public final int d;
    public final a[] e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f41063f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new a(aVar.f41060a, 0, aVar.f41062c, copyOf, (Uri[]) Arrays.copyOf(aVar.d, 0), copyOf2, aVar.h, aVar.f41064n);
        int i10 = d0.f6924a;
        f41066n = Integer.toString(1, 36);
        f41067r = Integer.toString(2, 36);
        f41068s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f41069w = new cl0(13);
    }

    public b(a[] aVarArr, long j10, long j11, int i10) {
        this.f41071b = j10;
        this.f41072c = j11;
        this.f41070a = aVarArr.length + i10;
        this.e = aVarArr;
        this.d = i10;
    }

    public final a a(int i10) {
        int i11 = this.d;
        if (i10 < i11) {
            return h;
        }
        return this.e[i10 - i11];
    }

    public final boolean b(int i10) {
        if (i10 == this.f41070a - 1) {
            a a2 = a(i10);
            if (a2.f41064n && a2.f41060a == Long.MIN_VALUE && a2.f41061b == -1) {
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
                int i10 = d0.f6924a;
                if (this.f41070a == bVar.f41070a && this.f41071b == bVar.f41071b && this.f41072c == bVar.f41072c && this.d == bVar.d && Arrays.equals(this.e, bVar.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.f41070a * 961) + ((int) this.f41071b)) * 31) + ((int) this.f41072c)) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f41071b);
        sb.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.e;
            if (i10 < aVarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(aVarArr[i10].f41060a);
                sb.append(", ads=[");
                for (int i11 = 0; i11 < aVarArr[i10].e.length; i11++) {
                    sb.append("ad(state=");
                    int i12 = aVarArr[i10].e[i11];
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
                    sb.append(aVarArr[i10].f41063f[i11]);
                    sb.append(')');
                    if (i11 < aVarArr[i10].e.length - 1) {
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
