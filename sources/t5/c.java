package t5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.internal.clearcut.y1;
import h7.r8;
import java.util.Arrays;
import r6.l;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new l(16);

    public final e2 f48093a;

    public byte[] f48094b;

    public final int[] f48095c;
    public final String[] d;

    public final int[] f48096e;

    public final byte[][] f48097f;
    public final v7.a[] h;

    public final boolean f48098n;

    public final y1 f48099r;

    public c(e2 e2Var, y1 y1Var) {
        this.f48093a = e2Var;
        this.f48099r = y1Var;
        this.f48095c = null;
        this.d = null;
        this.f48096e = null;
        this.f48097f = null;
        this.h = null;
        this.f48098n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (y5.l.l(this.f48093a, cVar.f48093a) && Arrays.equals(this.f48094b, cVar.f48094b) && Arrays.equals(this.f48095c, cVar.f48095c) && Arrays.equals(this.d, cVar.d) && y5.l.l(this.f48099r, cVar.f48099r) && y5.l.l(null, null) && y5.l.l(null, null) && Arrays.equals(this.f48096e, cVar.f48096e) && Arrays.deepEquals(this.f48097f, cVar.f48097f) && Arrays.equals(this.h, cVar.h) && this.f48098n == cVar.f48098n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48093a, this.f48094b, this.f48095c, this.d, this.f48099r, null, null, this.f48096e, this.f48097f, this.h, Boolean.valueOf(this.f48098n)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f48093a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f48094b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f48095c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f48099r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f48096e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f48097f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f48098n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f48093a, i10);
        r8.c(parcel, 3, this.f48094b);
        r8.g(parcel, 4, this.f48095c);
        r8.m(parcel, 5, this.d);
        r8.g(parcel, 6, this.f48096e);
        r8.d(parcel, 7, this.f48097f);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.f48098n ? 1 : 0);
        r8.o(parcel, 9, this.h, i10);
        r8.r(parcel, iQ);
    }

    public c(e2 e2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, v7.a[] aVarArr) {
        this.f48093a = e2Var;
        this.f48094b = bArr;
        this.f48095c = iArr;
        this.d = strArr;
        this.f48099r = null;
        this.f48096e = iArr2;
        this.f48097f = bArr2;
        this.h = aVarArr;
        this.f48098n = z10;
    }
}
