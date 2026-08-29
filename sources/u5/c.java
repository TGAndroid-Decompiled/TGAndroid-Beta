package u5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.internal.clearcut.y1;
import java.util.Arrays;
import s6.i;
import z5.l;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new i(21);
    public final e2 f49108a;
    public byte[] f49109b;
    public final int[] f49110c;
    public final String[] d;
    public final int[] f49111e;
    public final byte[][] f49112f;
    public final w7.a[] h;
    public final boolean f49113n;
    public final y1 f49114r;

    public c(e2 e2Var, y1 y1Var) {
        this.f49108a = e2Var;
        this.f49114r = y1Var;
        this.f49110c = null;
        this.d = null;
        this.f49111e = null;
        this.f49112f = null;
        this.h = null;
        this.f49113n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f49108a, cVar.f49108a) && Arrays.equals(this.f49109b, cVar.f49109b) && Arrays.equals(this.f49110c, cVar.f49110c) && Arrays.equals(this.d, cVar.d) && l.l(this.f49114r, cVar.f49114r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f49111e, cVar.f49111e) && Arrays.deepEquals(this.f49112f, cVar.f49112f) && Arrays.equals(this.h, cVar.h) && this.f49113n == cVar.f49113n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49108a, this.f49109b, this.f49110c, this.d, this.f49114r, null, null, this.f49111e, this.f49112f, this.h, Boolean.valueOf(this.f49113n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f49108a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f49109b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f49110c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f49114r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f49111e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f49112f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f49113n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.f49108a, i10);
        o.c(parcel, 3, this.f49109b);
        o.g(parcel, 4, this.f49110c);
        o.m(parcel, 5, this.d);
        o.g(parcel, 6, this.f49111e);
        o.d(parcel, 7, this.f49112f);
        o.s(parcel, 8, 4);
        parcel.writeInt(this.f49113n ? 1 : 0);
        o.o(parcel, 9, this.h, i10);
        o.r(parcel, q6);
    }

    public c(e2 e2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, w7.a[] aVarArr) {
        this.f49108a = e2Var;
        this.f49109b = bArr;
        this.f49110c = iArr;
        this.d = strArr;
        this.f49114r = null;
        this.f49111e = iArr2;
        this.f49112f = bArr2;
        this.h = aVarArr;
        this.f49113n = z10;
    }
}
