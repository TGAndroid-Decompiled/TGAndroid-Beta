package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.location.LocationRequest;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final LocationRequest f56390a;

    public l(com.google.android.gms.location.LocationRequest r26, java.util.ArrayList r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, long r34) {
        throw new UnsupportedOperationException("Method not decompiled: u7.l.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return q6.m.k(this.f56390a, ((l) obj).f56390a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56390a.hashCode();
    }

    public final String toString() {
        return this.f56390a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f56390a, i7);
        xb.s(parcel, r10);
    }
}
