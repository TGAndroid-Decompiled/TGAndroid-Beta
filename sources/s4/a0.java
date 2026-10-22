package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f45895a;
    public int f45896b;
    public boolean f45897c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45895a);
        parcel.writeInt(this.f45896b);
        parcel.writeInt(this.f45897c ? 1 : 0);
    }
}
