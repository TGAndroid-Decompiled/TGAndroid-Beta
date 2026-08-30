package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new r0(0);
    public final a0 f42984a;
    public final o f42985b;

    public x(String str, int i10) {
        b6.m.h(str);
        try {
            this.f42984a = a0.a(str);
            try {
                this.f42985b = o.a(i10);
            } catch (n e) {
                throw new IllegalArgumentException(e);
            }
        } catch (z e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f42984a.equals(xVar.f42984a) || !this.f42985b.equals(xVar.f42985b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42984a, this.f42985b});
    }

    public final String toString() {
        return yh.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f42984a), ", \n algorithm=", String.valueOf(this.f42985b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        this.f42984a.getClass();
        f5.l(parcel, 2, "public-key");
        f5.i(parcel, 3, Integer.valueOf(this.f42985b.f42937a.a()));
        f5.r(parcel, q10);
    }
}
