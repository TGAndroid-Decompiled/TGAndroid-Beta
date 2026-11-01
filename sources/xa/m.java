package xa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import w7.g0;
public final class m implements Parcelable.Creator {
    public final int f53571a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f53571a) {
            case 0:
                int z10 = g0.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        g0.y(parcel, readInt);
                    } else {
                        bundle = g0.a(parcel, readInt);
                    }
                }
                g0.m(parcel, z10);
                return new l(bundle);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f53571a) {
            case 0:
                return new l[i10];
            default:
                return new ParcelImpl[i10];
        }
    }
}
