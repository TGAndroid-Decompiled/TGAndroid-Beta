package w5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import j7.g5;
import java.util.Arrays;
import u6.p;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(12);
    public final d2 f49465a;
    public byte[] f49466b;
    public final int[] f49467c;
    public final String[] d;
    public final int[] f49468e;
    public final byte[][] f49469f;
    public final y7.a[] h;
    public final boolean f49470n;
    public final x1 f49471r;

    public c(d2 d2Var, x1 x1Var) {
        this.f49465a = d2Var;
        this.f49471r = x1Var;
        this.f49467c = null;
        this.d = null;
        this.f49468e = null;
        this.f49469f = null;
        this.h = null;
        this.f49470n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f49465a, cVar.f49465a) && Arrays.equals(this.f49466b, cVar.f49466b) && Arrays.equals(this.f49467c, cVar.f49467c) && Arrays.equals(this.d, cVar.d) && m.l(this.f49471r, cVar.f49471r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f49468e, cVar.f49468e) && Arrays.deepEquals(this.f49469f, cVar.f49469f) && Arrays.equals(this.h, cVar.h) && this.f49470n == cVar.f49470n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49465a, this.f49466b, this.f49467c, this.d, this.f49471r, null, null, this.f49468e, this.f49469f, this.h, Boolean.valueOf(this.f49470n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f49465a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f49466b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f49467c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.f49471r);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.f49468e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f49469f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f49470n);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f49465a, i10);
        g5.c(parcel, 3, this.f49466b);
        g5.g(parcel, 4, this.f49467c);
        g5.m(parcel, 5, this.d);
        g5.g(parcel, 6, this.f49468e);
        g5.d(parcel, 7, this.f49469f);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.f49470n ? 1 : 0);
        g5.o(parcel, 9, this.h, i10);
        g5.r(parcel, q10);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z4, y7.a[] aVarArr) {
        this.f49465a = d2Var;
        this.f49466b = bArr;
        this.f49467c = iArr;
        this.d = strArr;
        this.f49471r = null;
        this.f49468e = iArr2;
        this.f49469f = bArr2;
        this.h = aVarArr;
        this.f49470n = z4;
    }
}
