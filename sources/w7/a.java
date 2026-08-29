package w7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.cast.o;
import i7.k8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.th;
import w5.k;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new k(1);
    public final String f49795a;
    public final byte[] f49796b;
    public final byte[][] f49797c;
    public final byte[][] d;
    public final byte[][] f49798e;
    public final byte[][] f49799f;
    public final int[] h;
    public final byte[][] f49800n;

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f49795a = str;
        this.f49796b = bArr;
        this.f49797c = bArr2;
        this.d = bArr3;
        this.f49798e = bArr4;
        this.f49799f = bArr5;
        this.h = iArr;
        this.f49800n = bArr6;
    }

    public static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            i10 = th.d(iArr[i10], i10, 1, arrayList);
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
            if (k8.a(this.f49795a, aVar.f49795a) && Arrays.equals(this.f49796b, aVar.f49796b) && k8.a(c(this.f49797c), c(aVar.f49797c)) && k8.a(c(this.d), c(aVar.d)) && k8.a(c(this.f49798e), c(aVar.f49798e)) && k8.a(c(this.f49799f), c(aVar.f49799f)) && k8.a(b(this.h), b(aVar.h)) && k8.a(c(this.f49800n), c(aVar.f49800n))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f49795a;
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
        byte[] bArr = this.f49796b;
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        d(sb3, "GAIA", this.f49797c);
        sb3.append(", ");
        d(sb3, "PSEUDO", this.d);
        sb3.append(", ");
        d(sb3, "ALWAYS", this.f49798e);
        sb3.append(", ");
        d(sb3, "OTHER", this.f49799f);
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
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(i11);
                i10++;
                z10 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        d(sb3, "directs", this.f49800n);
        sb3.append(")");
        return sb3.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f49795a);
        o.c(parcel, 3, this.f49796b);
        o.d(parcel, 4, this.f49797c);
        o.d(parcel, 5, this.d);
        o.d(parcel, 6, this.f49798e);
        o.d(parcel, 7, this.f49799f);
        o.g(parcel, 8, this.h);
        o.d(parcel, 9, this.f49800n);
        o.r(parcel, q6);
    }
}
