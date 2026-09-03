package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.ai;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new r0(0);
    public final a0 f43014a;
    public final o f43015b;

    public x(String str, int i10) {
        b6.m.h(str);
        try {
            this.f43014a = a0.a(str);
            try {
                this.f43015b = o.a(i10);
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
        if (!this.f43014a.equals(xVar.f43014a) || !this.f43015b.equals(xVar.f43015b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43014a, this.f43015b});
    }

    public final String toString() {
        return ai.k("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f43014a), ", \n algorithm=", String.valueOf(this.f43015b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        this.f43014a.getClass();
        f5.l(parcel, 2, "public-key");
        f5.i(parcel, 3, Integer.valueOf(this.f43015b.f42967a.a()));
        f5.r(parcel, q10);
    }
}
