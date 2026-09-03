package z7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import u6.p;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(24);
    public String f47450a;
    public String f47451b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(this.f47450a, aVar.f47450a) && m.l(this.f47451b, aVar.f47451b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47450a, this.f47451b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f47450a);
        f5.l(parcel, 2, this.f47451b);
        f5.r(parcel, q10);
    }
}
