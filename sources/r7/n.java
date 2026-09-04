package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final LocationRequest f44955a;

    public n(com.google.android.gms.location.LocationRequest r28, java.util.ArrayList r29, boolean r30, boolean r31, java.lang.String r32, boolean r33, boolean r34, java.lang.String r35, long r36) {
        throw new UnsupportedOperationException("Method not decompiled: r7.n.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return n6.l.l(this.f44955a, ((n) obj).f44955a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44955a.hashCode();
    }

    public final String toString() {
        return this.f44955a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f44955a, i10);
        e0.r(parcel, q6);
    }
}
