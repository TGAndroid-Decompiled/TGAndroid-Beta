package s5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.internal.clearcut.y1;
import g7.p8;
import java.util.Arrays;
import q7.j;
import x5.l;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final e2 f47444a;
    public byte[] f47445b;
    public final int[] f47446c;
    public final String[] d;
    public final int[] f47447e;
    public final byte[][] f47448f;
    public final u7.a[] h;
    public final boolean f47449n;
    public final y1 f47450r;

    public c(e2 e2Var, y1 y1Var) {
        this.f47444a = e2Var;
        this.f47450r = y1Var;
        this.f47446c = null;
        this.d = null;
        this.f47447e = null;
        this.f47448f = null;
        this.h = null;
        this.f47449n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.l(this.f47444a, cVar.f47444a) && Arrays.equals(this.f47445b, cVar.f47445b) && Arrays.equals(this.f47446c, cVar.f47446c) && Arrays.equals(this.d, cVar.d) && l.l(this.f47450r, cVar.f47450r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.f47447e, cVar.f47447e) && Arrays.deepEquals(this.f47448f, cVar.f47448f) && Arrays.equals(this.h, cVar.h) && this.f47449n == cVar.f47449n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47444a, this.f47445b, this.f47446c, this.d, this.f47450r, null, null, this.f47447e, this.f47448f, this.h, Boolean.valueOf(this.f47449n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f47444a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f47445b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb2.append(str);
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f47446c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f47450r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f47447e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f47448f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f47449n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f47444a, i9);
        p8.c(parcel, 3, this.f47445b);
        p8.g(parcel, 4, this.f47446c);
        p8.m(parcel, 5, this.d);
        p8.g(parcel, 6, this.f47447e);
        p8.d(parcel, 7, this.f47448f);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.f47449n ? 1 : 0);
        p8.o(parcel, 9, this.h, i9);
        p8.r(parcel, q10);
    }

    public c(e2 e2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, u7.a[] aVarArr) {
        this.f47444a = e2Var;
        this.f47445b = bArr;
        this.f47446c = iArr;
        this.d = strArr;
        this.f47450r = null;
        this.f47447e = iArr2;
        this.f47448f = bArr2;
        this.h = aVarArr;
        this.f47449n = z10;
    }
}
