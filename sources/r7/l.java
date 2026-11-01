package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import w7.h0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final LocationRequest f46367a;

    public l(com.google.android.gms.location.LocationRequest r26, java.util.ArrayList r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, long r34) {
        throw new UnsupportedOperationException("Method not decompiled: r7.l.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return n6.l.k(this.f46367a, ((l) obj).f46367a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46367a.hashCode();
    }

    public final String toString() {
        return this.f46367a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f46367a, i10);
        h0.r(parcel, q6);
    }
}
