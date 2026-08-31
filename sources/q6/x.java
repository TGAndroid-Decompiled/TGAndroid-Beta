package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new r0(0);
    public final a0 f44750a;
    public final o f44751b;

    public x(String str, int i10) {
        b6.m.h(str);
        try {
            this.f44750a = a0.a(str);
            try {
                this.f44751b = o.a(i10);
            } catch (n e6) {
                throw new IllegalArgumentException(e6);
            }
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f44750a.equals(xVar.f44750a) || !this.f44751b.equals(xVar.f44751b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44750a, this.f44751b});
    }

    public final String toString() {
        return yh.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f44750a), ", \n algorithm=", String.valueOf(this.f44751b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        this.f44750a.getClass();
        g5.l(parcel, 2, "public-key");
        g5.i(parcel, 3, Integer.valueOf(this.f44751b.f44700a.a()));
        g5.r(parcel, q10);
    }
}
