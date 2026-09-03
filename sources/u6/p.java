package u6;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class p implements Parcelable.Creator {
    public final int f45239a;

    public p(int i10) {
        this.f45239a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: u6.p.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f45239a) {
            case 0:
                return new o[i10];
            case 1:
                return new q[i10];
            case 2:
                return new r[i10];
            case 3:
                return new u7.g[i10];
            case 4:
                return new u7.h[i10];
            case 5:
                return new u7.j[i10];
            case 6:
                return new u7.b[i10];
            case 7:
                return new LocationAvailability[i10];
            case 8:
                return new LocationRequest[i10];
            case 9:
                return new LocationResult[i10];
            case 10:
                return new u7.e[i10];
            case 11:
                return new w5.b[i10];
            case 12:
                return new w5.c[i10];
            case 13:
                return new CameraPosition[i10];
            case 14:
                return new x7.c[i10];
            case 15:
                return new LatLngBounds[i10];
            case 16:
                return new LatLng[i10];
            case 17:
                return new x7.f[i10];
            case 18:
                return new x7.h[i10];
            case 19:
                return new x7.i[i10];
            case 20:
                return new y5.a[i10];
            case 21:
                return new y5.c[i10];
            case 22:
                return new y7.a[i10];
            case 23:
                return new DataHolder[i10];
            case 24:
                return new z7.a[i10];
            case 25:
                return new z7.b[i10];
            case 26:
                return new z7.c[i10];
            default:
                return new z7.d[i10];
        }
    }
}
