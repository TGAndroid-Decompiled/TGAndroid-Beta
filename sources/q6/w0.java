package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class w0 extends c6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(23);
    public final long f43011a;
    public final b7.w0 f43012b;
    public final b7.w0 f43013c;
    public final b7.w0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        b6.m.h(bArr);
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t9 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t10 = b7.w0.t(bArr3.length, bArr3);
        this.f43011a = j10;
        this.f43012b = t6;
        this.f43013c = t9;
        this.d = t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f43011a == w0Var.f43011a && b6.m.l(this.f43012b, w0Var.f43012b) && b6.m.l(this.f43013c, w0Var.f43013c) && b6.m.l(this.d, w0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f43011a), this.f43012b, this.f43013c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 8);
        parcel.writeLong(this.f43011a);
        f5.c(parcel, 2, this.f43012b.u());
        f5.c(parcel, 3, this.f43013c.u());
        f5.c(parcel, 4, this.d.u());
        f5.r(parcel, q10);
    }
}
