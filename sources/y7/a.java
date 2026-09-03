package y7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k7.t8;
import org.telegram.ui.yh;
import u6.p;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(22);
    public final String f50831a;
    public final byte[] f50832b;
    public final byte[][] f50833c;
    public final byte[][] d;
    public final byte[][] f50834e;
    public final byte[][] f50835f;
    public final int[] h;
    public final byte[][] f50836n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f50831a = str;
        this.f50832b = bArr;
        this.f50833c = bArr2;
        this.d = bArr3;
        this.f50834e = bArr4;
        this.f50835f = bArr5;
        this.h = iArr;
        this.f50836n = bArr6;
    }

    public static List e(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            i10 = yh.d(iArr[i10], i10, 1, arrayList);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List f(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void g(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z4 = true;
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z4) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i10++;
                z4 = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (t8.a(this.f50831a, aVar.f50831a) && Arrays.equals(this.f50832b, aVar.f50832b) && t8.a(f(this.f50833c), f(aVar.f50833c)) && t8.a(f(this.d), f(aVar.d)) && t8.a(f(this.f50834e), f(aVar.f50834e)) && t8.a(f(this.f50835f), f(aVar.f50835f)) && t8.a(e(this.h), e(aVar.h)) && t8.a(f(this.f50836n), f(aVar.f50836n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f50831a;
        if (str == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
            sb3.append("'");
            sb3.append(str);
            sb3.append("'");
            sb = sb3.toString();
        }
        sb2.append(sb);
        sb2.append(", direct=");
        byte[] bArr = this.f50832b;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        g(sb2, "GAIA", this.f50833c);
        sb2.append(", ");
        g(sb2, "PSEUDO", this.d);
        sb2.append(", ");
        g(sb2, "ALWAYS", this.f50834e);
        sb2.append(", ");
        g(sb2, "OTHER", this.f50835f);
        sb2.append(", ");
        sb2.append("weak");
        sb2.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            sb2.append("null");
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z4 = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z4) {
                    sb2.append(", ");
                }
                sb2.append(i11);
                i10++;
                z4 = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        g(sb2, "directs", this.f50836n);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f50831a);
        g5.c(parcel, 3, this.f50832b);
        g5.d(parcel, 4, this.f50833c);
        g5.d(parcel, 5, this.d);
        g5.d(parcel, 6, this.f50834e);
        g5.d(parcel, 7, this.f50835f);
        g5.g(parcel, 8, this.h);
        g5.d(parcel, 9, this.f50836n);
        g5.r(parcel, q10);
    }
}
