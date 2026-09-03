package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f44667a;
    public final w f44668b;

    public x(w wVar, w wVar2) {
        this.f44667a = wVar;
        this.f44668b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (u5.a.d(this.f44667a, xVar.f44667a) && u5.a.d(this.f44668b, xVar.f44668b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44667a, this.f44668b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44667a, i10);
        g5.k(parcel, 3, this.f44668b, i10);
        g5.r(parcel, q10);
    }
}
