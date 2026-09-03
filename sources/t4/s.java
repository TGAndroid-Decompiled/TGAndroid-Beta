package t4;

import android.os.Parcel;
import android.os.Parcelable;
public final class s implements Parcelable.Creator {
    public final int f44622a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f44622a) {
            case 0:
                return new u(parcel);
            default:
                return new t(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f44622a) {
            case 0:
                return new u[i10];
            default:
                return new t[i10];
        }
    }
}
