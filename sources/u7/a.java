package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import g7.p8;
import g7.t7;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q7.j;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new j(19);
    public final String f48135a;
    public final byte[] f48136b;
    public final byte[][] f48137c;
    public final byte[][] d;
    public final byte[][] f48138e;
    public final byte[][] f48139f;
    public final int[] h;
    public final byte[][] f48140n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f48135a = str;
        this.f48136b = bArr;
        this.f48137c = bArr2;
        this.d = bArr3;
        this.f48138e = bArr4;
        this.f48139f = bArr5;
        this.h = iArr;
        this.f48140n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i9 = 0;
        while (i9 < length) {
            i9 = r0.e(iArr[i9], i9, 1, arrayList);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List c(byte[][] bArr) {
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

    public static void d(StringBuilder sb2, String str, byte[][] bArr) {
        String str2;
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb2.append("(");
            int length = bArr.length;
            boolean z10 = true;
            int i9 = 0;
            while (i9 < length) {
                byte[] bArr2 = bArr[i9];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i9++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (t7.a(this.f48135a, aVar.f48135a) && Arrays.equals(this.f48136b, aVar.f48136b) && t7.a(c(this.f48137c), c(aVar.f48137c)) && t7.a(c(this.d), c(aVar.d)) && t7.a(c(this.f48138e), c(aVar.f48138e)) && t7.a(c(this.f48139f), c(aVar.f48139f)) && t7.a(b(this.h), b(aVar.h)) && t7.a(c(this.f48140n), c(aVar.f48140n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f48135a;
        if (str == null) {
            sb2 = "null";
        } else {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 2);
            sb4.append("'");
            sb4.append(str);
            sb4.append("'");
            sb2 = sb4.toString();
        }
        sb3.append(sb2);
        sb3.append(", direct=");
        byte[] bArr = this.f48136b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f48137c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.f48138e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f48139f);
        sb3.append(", ");
        sb3.append("weak");
        sb3.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            sb3.append("null");
        } else {
            sb3.append("(");
            int length = iArr.length;
            boolean z10 = true;
            int i9 = 0;
            while (i9 < length) {
                int i10 = iArr[i9];
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(i10);
                i9++;
                z10 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        d(sb3, "directs", this.f48140n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f48135a);
        p8.c(parcel, 3, this.f48136b);
        p8.d(parcel, 4, this.f48137c);
        p8.d(parcel, 5, this.d);
        p8.d(parcel, 6, this.f48138e);
        p8.d(parcel, 7, this.f48139f);
        p8.g(parcel, 8, this.h);
        p8.d(parcel, 9, this.f48140n);
        p8.r(parcel, q10);
    }
}
