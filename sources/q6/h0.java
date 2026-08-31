package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class h0 extends c6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(7);
    public final f0 f44676a;
    public final String f44677b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        b6.m.h(str);
        try {
            this.f44676a = f0.a(str);
            this.f44677b = str2;
        } catch (g0 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!b7.b.h(this.f44676a, h0Var.f44676a) || !b7.b.h(this.f44677b, h0Var.f44677b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44676a, this.f44677b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44676a.f44670a);
        g5.l(parcel, 3, this.f44677b);
        g5.r(parcel, q10);
    }
}
