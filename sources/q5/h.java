package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f42808a;
    public final String f42809b;

    public h(String str, String str2) {
        this.f42808a = str;
        this.f42809b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (b6.m.l(this.f42808a, hVar.f42808a) && b6.m.l(this.f42809b, hVar.f42809b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42808a, this.f42809b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f42808a);
        f5.l(parcel, 2, this.f42809b);
        f5.r(parcel, q10);
    }
}
