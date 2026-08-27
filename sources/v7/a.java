package v7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import h7.r8;
import h7.w7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r6.l;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new l(27);

    public final String f48820a;

    public final byte[] f48821b;

    public final byte[][] f48822c;
    public final byte[][] d;

    public final byte[][] f48823e;

    public final byte[][] f48824f;
    public final int[] h;

    public final byte[][] f48825n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f48820a = str;
        this.f48821b = bArr;
        this.f48822c = bArr2;
        this.d = bArr3;
        this.f48823e = bArr4;
        this.f48824f = bArr5;
        this.h = iArr;
        this.f48825n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int iF = 0;
        while (iF < length) {
            iF = i0.a.f(iArr[iF], iF, 1, arrayList);
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
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i10++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (w7.a(this.f48820a, aVar.f48820a) && Arrays.equals(this.f48821b, aVar.f48821b) && w7.a(c(this.f48822c), c(aVar.f48822c)) && w7.a(c(this.d), c(aVar.d)) && w7.a(c(this.f48823e), c(aVar.f48823e)) && w7.a(c(this.f48824f), c(aVar.f48824f)) && w7.a(b(this.h), b(aVar.h)) && w7.a(c(this.f48825n), c(aVar.f48825n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f48820a;
        if (str == null) {
            string = "null";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
            sb3.append("'");
            sb3.append(str);
            sb3.append("'");
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append(", direct=");
        byte[] bArr = this.f48821b;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        d(sb2, "GAIA", this.f48822c);
        sb2.append(", ");
        d(sb2, "PSEUDO", this.d);
        sb2.append(", ");
        d(sb2, "ALWAYS", this.f48823e);
        sb2.append(", ");
        d(sb2, "OTHER", this.f48824f);
        sb2.append(", ");
        sb2.append("weak");
        sb2.append("=");
        int[] iArr = this.h;
        if (iArr == null) {
            sb2.append("null");
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i11);
                i10++;
                z10 = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        d(sb2, "directs", this.f48825n);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f48820a);
        r8.c(parcel, 3, this.f48821b);
        r8.d(parcel, 4, this.f48822c);
        r8.d(parcel, 5, this.d);
        r8.d(parcel, 6, this.f48823e);
        r8.d(parcel, 7, this.f48824f);
        r8.g(parcel, 8, this.h);
        r8.d(parcel, 9, this.f48825n);
        r8.r(parcel, iQ);
    }
}
