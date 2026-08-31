package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class w0 extends c6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(23);
    public final long f44747a;
    public final b7.w0 f44748b;
    public final b7.w0 f44749c;
    public final b7.w0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        b6.m.h(bArr);
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t9 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t10 = b7.w0.t(bArr3.length, bArr3);
        this.f44747a = j10;
        this.f44748b = t6;
        this.f44749c = t9;
        this.d = t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f44747a == w0Var.f44747a && b6.m.l(this.f44748b, w0Var.f44748b) && b6.m.l(this.f44749c, w0Var.f44749c) && b6.m.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44747a), this.f44748b, this.f44749c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 8);
        parcel.writeLong(this.f44747a);
        g5.c(parcel, 2, this.f44748b.u());
        g5.c(parcel, 3, this.f44749c.u());
        g5.c(parcel, 4, this.d.u());
        g5.r(parcel, q10);
    }
}
