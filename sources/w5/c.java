package w5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import j7.f5;
import java.util.Arrays;
import u6.p;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(12);
    public final d2 f46538a;
    public byte[] f46539b;
    public final int[] f46540c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f46541f;
    public final y7.a[] h;
    public final boolean f46542n;
    public final x1 f46543r;

    public c(d2 d2Var, x1 x1Var) {
        this.f46538a = d2Var;
        this.f46543r = x1Var;
        this.f46540c = null;
        this.d = null;
        this.e = null;
        this.f46541f = null;
        this.h = null;
        this.f46542n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f46538a, cVar.f46538a) && Arrays.equals(this.f46539b, cVar.f46539b) && Arrays.equals(this.f46540c, cVar.f46540c) && Arrays.equals(this.d, cVar.d) && m.l(this.f46543r, cVar.f46543r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f46541f, cVar.f46541f) && Arrays.equals(this.h, cVar.h) && this.f46542n == cVar.f46542n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46538a, this.f46539b, this.f46540c, this.d, this.f46543r, null, null, this.e, this.f46541f, this.h, Boolean.valueOf(this.f46542n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f46538a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f46539b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f46540c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.f46543r);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f46541f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f46542n);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f46538a, i10);
        f5.c(parcel, 3, this.f46539b);
        f5.g(parcel, 4, this.f46540c);
        f5.m(parcel, 5, this.d);
        f5.g(parcel, 6, this.e);
        f5.d(parcel, 7, this.f46541f);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.f46542n ? 1 : 0);
        f5.o(parcel, 9, this.h, i10);
        f5.r(parcel, q10);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z4, y7.a[] aVarArr) {
        this.f46538a = d2Var;
        this.f46539b = bArr;
        this.f46540c = iArr;
        this.d = strArr;
        this.f46543r = null;
        this.e = iArr2;
        this.f46541f = bArr2;
        this.h = aVarArr;
        this.f46542n = z4;
    }
}
