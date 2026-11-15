package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.location.LocationRequest;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new n(0);
    public final LocationRequest f57889a;

    public m(com.google.android.gms.location.LocationRequest r26, java.util.ArrayList r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, long r34) {
        throw new UnsupportedOperationException("Method not decompiled: u7.m.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return q6.m.k(this.f57889a, ((m) obj).f57889a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57889a.hashCode();
    }

    public final String toString() {
        return this.f57889a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f57889a, i7);
        yb.s(parcel, r10);
    }
}
