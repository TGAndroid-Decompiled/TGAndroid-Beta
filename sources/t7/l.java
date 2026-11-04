package t7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
public final class l extends q6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final LocationRequest f54969a;

    public l(com.google.android.gms.location.LocationRequest r26, java.util.ArrayList r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, long r34) {
        throw new UnsupportedOperationException("Method not decompiled: t7.l.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return p6.m.k(this.f54969a, ((l) obj).f54969a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54969a.hashCode();
    }

    public final String toString() {
        return this.f54969a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f54969a, i3);
        j8.a.t(parcel, s6);
    }
}
