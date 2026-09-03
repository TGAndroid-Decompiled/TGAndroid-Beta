package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class h0 extends c6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(7);
    public final f0 f44707a;
    public final String f44708b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        b6.m.h(str);
        try {
            this.f44707a = f0.a(str);
            this.f44708b = str2;
        } catch (g0 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!b7.b.h(this.f44707a, h0Var.f44707a) || !b7.b.h(this.f44708b, h0Var.f44708b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44707a, this.f44708b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44707a.f44701a);
        g5.l(parcel, 3, this.f44708b);
        g5.r(parcel, q10);
    }
}
