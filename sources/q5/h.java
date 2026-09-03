package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f44590a;
    public final String f44591b;

    public h(String str, String str2) {
        this.f44590a = str;
        this.f44591b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (b6.m.l(this.f44590a, hVar.f44590a) && b6.m.l(this.f44591b, hVar.f44591b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44590a, this.f44591b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f44590a);
        g5.l(parcel, 2, this.f44591b);
        g5.r(parcel, q10);
    }
}
