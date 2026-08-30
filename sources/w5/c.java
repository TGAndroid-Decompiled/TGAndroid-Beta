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
    public final d2 f46456a;
    public byte[] f46457b;
    public final int[] f46458c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f46459f;
    public final y7.a[] h;
    public final boolean f46460n;
    public final x1 f46461r;

    public c(d2 d2Var, x1 x1Var) {
        this.f46456a = d2Var;
        this.f46461r = x1Var;
        this.f46458c = null;
        this.d = null;
        this.e = null;
        this.f46459f = null;
        this.h = null;
        this.f46460n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.f46456a, cVar.f46456a) && Arrays.equals(this.f46457b, cVar.f46457b) && Arrays.equals(this.f46458c, cVar.f46458c) && Arrays.equals(this.d, cVar.d) && m.l(this.f46461r, cVar.f46461r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f46459f, cVar.f46459f) && Arrays.equals(this.h, cVar.h) && this.f46460n == cVar.f46460n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46456a, this.f46457b, this.f46458c, this.d, this.f46461r, null, null, this.e, this.f46459f, this.h, Boolean.valueOf(this.f46460n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f46456a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f46457b;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f46458c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.f46461r);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f46459f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f46460n);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f46456a, i10);
        f5.c(parcel, 3, this.f46457b);
        f5.g(parcel, 4, this.f46458c);
        f5.m(parcel, 5, this.d);
        f5.g(parcel, 6, this.e);
        f5.d(parcel, 7, this.f46459f);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.f46460n ? 1 : 0);
        f5.o(parcel, 9, this.h, i10);
        f5.r(parcel, q10);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z4, y7.a[] aVarArr) {
        this.f46456a = d2Var;
        this.f46457b = bArr;
        this.f46458c = iArr;
        this.d = strArr;
        this.f46461r = null;
        this.e = iArr2;
        this.f46459f = bArr2;
        this.h = aVarArr;
        this.f46460n = z4;
    }
}
