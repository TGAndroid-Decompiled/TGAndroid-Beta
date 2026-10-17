package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f45913a;
    public int f45914b;
    public boolean f45915c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45913a);
        parcel.writeInt(this.f45914b);
        parcel.writeInt(this.f45915c ? 1 : 0);
    }
}
