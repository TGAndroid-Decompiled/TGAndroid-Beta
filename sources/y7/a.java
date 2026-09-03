package y7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k7.s8;
import org.telegram.ui.ai;
import u6.p;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(22);
    public final String f47199a;
    public final byte[] f47200b;
    public final byte[][] f47201c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f47202f;
    public final int[] h;
    public final byte[][] f47203n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f47199a = str;
        this.f47200b = bArr;
        this.f47201c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f47202f = bArr5;
        this.h = iArr;
        this.f47203n = bArr6;
    }

    public static List e(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            i10 = ai.d(iArr[i10], i10, 1, arrayList);
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
            if (s8.a(this.f47199a, aVar.f47199a) && Arrays.equals(this.f47200b, aVar.f47200b) && s8.a(f(this.f47201c), f(aVar.f47201c)) && s8.a(f(this.d), f(aVar.d)) && s8.a(f(this.e), f(aVar.e)) && s8.a(f(this.f47202f), f(aVar.f47202f)) && s8.a(e(this.h), e(aVar.h)) && s8.a(f(this.f47203n), f(aVar.f47203n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f47199a;
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
        byte[] bArr = this.f47200b;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        g(sb2, "GAIA", this.f47201c);
        sb2.append(", ");
        g(sb2, "PSEUDO", this.d);
        sb2.append(", ");
        g(sb2, "ALWAYS", this.e);
        sb2.append(", ");
        g(sb2, "OTHER", this.f47202f);
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
        g(sb2, "directs", this.f47203n);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f47199a);
        f5.c(parcel, 3, this.f47200b);
        f5.d(parcel, 4, this.f47201c);
        f5.d(parcel, 5, this.d);
        f5.d(parcel, 6, this.e);
        f5.d(parcel, 7, this.f47202f);
        f5.g(parcel, 8, this.h);
        f5.d(parcel, 9, this.f47203n);
        f5.r(parcel, q10);
    }
}
