package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class x extends c6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f42907a;
    public final w f42908b;

    public x(w wVar, w wVar2) {
        this.f42907a = wVar;
        this.f42908b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (u5.a.d(this.f42907a, xVar.f42907a) && u5.a.d(this.f42908b, xVar.f42908b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42907a, this.f42908b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42907a, i10);
        f5.k(parcel, 3, this.f42908b, i10);
        f5.r(parcel, q10);
    }
}
