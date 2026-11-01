package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new p7.n(19);
    public int f48061a;
    public int f48062b;
    public boolean f48063c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f48061a);
        parcel.writeInt(this.f48062b);
        parcel.writeInt(this.f48063c ? 1 : 0);
    }
}
