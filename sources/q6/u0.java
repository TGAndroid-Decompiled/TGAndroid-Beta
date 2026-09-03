package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class u0 extends c6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(16);
    public final b7.w0 f42995a;
    public final b7.w0 f42996b;

    public u0(b7.w0 w0Var, b7.w0 w0Var2) {
        this.f42995a = w0Var;
        this.f42996b = w0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!b6.m.l(this.f42995a, u0Var.f42995a) || !b6.m.l(this.f42996b, u0Var.f42996b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42995a, this.f42996b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q10 = f5.q(parcel, 20293);
        byte[] bArr = null;
        b7.w0 w0Var = this.f42995a;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        f5.c(parcel, 1, u10);
        b7.w0 w0Var2 = this.f42996b;
        if (w0Var2 != null) {
            bArr = w0Var2.u();
        }
        f5.c(parcel, 2, bArr);
        f5.r(parcel, q10);
    }
}
