package w7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import r6.l;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new l(29);

    public String f49270a;

    public String f49271b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (y5.l.l(this.f49270a, aVar.f49270a) && y5.l.l(this.f49271b, aVar.f49271b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49270a, this.f49271b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f49270a);
        r8.l(parcel, 2, this.f49271b);
        r8.r(parcel, iQ);
    }
}
