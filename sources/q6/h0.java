package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class h0 extends c6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(7);
    public final f0 f42914a;
    public final String f42915b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        b6.m.h(str);
        try {
            this.f42914a = f0.a(str);
            this.f42915b = str2;
        } catch (g0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!b7.b.h(this.f42914a, h0Var.f42914a) || !b7.b.h(this.f42915b, h0Var.f42915b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42914a, this.f42915b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42914a.f42909a);
        f5.l(parcel, 3, this.f42915b);
        f5.r(parcel, q10);
    }
}
