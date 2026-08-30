package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class u0 extends c6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(16);
    public final b7.w0 f42965a;
    public final b7.w0 f42966b;

    public u0(b7.w0 w0Var, b7.w0 w0Var2) {
        this.f42965a = w0Var;
        this.f42966b = w0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!b6.m.l(this.f42965a, u0Var.f42965a) || !b6.m.l(this.f42966b, u0Var.f42966b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42965a, this.f42966b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q10 = f5.q(parcel, 20293);
        byte[] bArr = null;
        b7.w0 w0Var = this.f42965a;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        f5.c(parcel, 1, u10);
        b7.w0 w0Var2 = this.f42966b;
        if (w0Var2 != null) {
            bArr = w0Var2.u();
        }
        f5.c(parcel, 2, bArr);
        f5.r(parcel, q10);
    }
}
