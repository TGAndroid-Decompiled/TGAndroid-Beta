package q7;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class j implements Parcelable.Creator {
    public final int f46109a;

    public j(int i9) {
        this.f46109a = i9;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: q7.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f46109a) {
            case 0:
                return new h[i9];
            case 1:
                return new k[i9];
            case 2:
                return new b[i9];
            case 3:
                return new LocationAvailability[i9];
            case 4:
                return new LocationRequest[i9];
            case 5:
                return new LocationResult[i9];
            case 6:
                return new e[i9];
            case 7:
                return new s5.b[i9];
            case 8:
                return new s5.c[i9];
            case 9:
                return new CameraPosition[i9];
            case 10:
                return new t7.b[i9];
            case 11:
                return new LatLngBounds[i9];
            case 12:
                return new LatLng[i9];
            case 13:
                return new t7.e[i9];
            case 14:
                return new t7.g[i9];
            case 15:
                return new t7.h[i9];
            case 16:
                return new u0.h[i9];
            case 17:
                return new u5.a[i9];
            case 18:
                return new u5.c[i9];
            case 19:
                return new u7.a[i9];
            case 20:
                return new DataHolder[i9];
            case 21:
                return new v7.a[i9];
            case 22:
                return new v7.b[i9];
            case 23:
                return new v7.c[i9];
            case 24:
                return new v7.d[i9];
            case 25:
                return new w5.a[i9];
            case 26:
                return new w7.e[i9];
            case 27:
                return new w7.a[i9];
            case 28:
                return new w7.f[i9];
            default:
                return new w7.g[i9];
        }
    }
}
