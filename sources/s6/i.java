package s6;

import android.os.Parcelable;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class i implements Parcelable.Creator {
    public final int f47660a;

    public i(int i10) {
        this.f47660a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: s6.i.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f47660a) {
            case 0:
                return new h[i10];
            case 1:
                return new j[i10];
            case 2:
                return new k[i10];
            case 3:
                return new GetCredentialRequest[i10];
            case 4:
                return new l[i10];
            case 5:
                return new m[i10];
            case 6:
                return new n[i10];
            case 7:
                return new o[i10];
            case 8:
                return new p[i10];
            case 9:
                return new q[i10];
            case 10:
                return new r[i10];
            case 11:
                return new s7.g[i10];
            case 12:
                return new s7.h[i10];
            case 13:
                return new s7.j[i10];
            case 14:
                return new s7.b[i10];
            case 15:
                return new LocationAvailability[i10];
            case 16:
                return new LocationRequest[i10];
            case 17:
                return new LocationResult[i10];
            case 18:
                return new s7.e[i10];
            case 19:
                return new u0.h[i10];
            case 20:
                return new u5.b[i10];
            case 21:
                return new u5.c[i10];
            case 22:
                return new CameraPosition[i10];
            case 23:
                return new v7.b[i10];
            case 24:
                return new LatLngBounds[i10];
            case 25:
                return new LatLng[i10];
            case 26:
                return new v7.e[i10];
            case 27:
                return new v7.g[i10];
            case 28:
                return new v7.h[i10];
            default:
                return new w5.a[i10];
        }
    }
}
