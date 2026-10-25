package s7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final LocationRequest f47913a;

    public n(com.google.android.gms.location.LocationRequest r26, java.util.ArrayList r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, long r34) {
        throw new UnsupportedOperationException("Method not decompiled: s7.n.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return o6.l.l(this.f47913a, ((n) obj).f47913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47913a.hashCode();
    }

    public final String toString() {
        return this.f47913a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f47913a, i10);
        df.r(parcel, q5);
    }
}
