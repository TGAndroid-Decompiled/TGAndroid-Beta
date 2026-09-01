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
    public final d2 f49429a;
    public byte[] f49430b;
    public final int[] f49431c;
    public final String[] d;
    public final int[] f49432e;
    public final byte[][] f49433f;
    public final y7.a[] h;
    public final boolean f49434n;
    public final x1 f49435r;

    public c(d2 d2Var, x1 x1Var) {
        this.f49429a = d2Var;
        this.f49435r = x1Var;
        this.f49431c = null;
        this.d = null;
        this.f49432e = null;
        this.f49433f = null;
        this.h = null;
        this.f49434n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f49429a, cVar.f49429a) && Arrays.equals(this.f49430b, cVar.f49430b) && Arrays.equals(this.f49431c, cVar.f49431c) && Arrays.equals(this.d, cVar.d) && m.l(this.f49435r, cVar.f49435r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.f49432e, cVar.f49432e) && Arrays.deepEquals(this.f49433f, cVar.f49433f) && Arrays.equals(this.h, cVar.h) && this.f49434n == cVar.f49434n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49429a, this.f49430b, this.f49431c, this.d, this.f49435r, null, null, this.f49432e, this.f49433f, this.h, Boolean.valueOf(this.f49434n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f49429a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f49430b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f49431c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.f49435r);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.f49432e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f49433f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f49434n);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f49429a, i10);
        g5.c(parcel, 3, this.f49430b);
        g5.g(parcel, 4, this.f49431c);
        g5.m(parcel, 5, this.d);
        g5.g(parcel, 6, this.f49432e);
        g5.d(parcel, 7, this.f49433f);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.f49434n ? 1 : 0);
        g5.o(parcel, 9, this.h, i10);
        g5.r(parcel, q10);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z4, y7.a[] aVarArr) {
        this.f49429a = d2Var;
        this.f49430b = bArr;
        this.f49431c = iArr;
        this.d = strArr;
        this.f49435r = null;
        this.f49432e = iArr2;
        this.f49433f = bArr2;
        this.h = aVarArr;
        this.f49434n = z4;
    }
}
