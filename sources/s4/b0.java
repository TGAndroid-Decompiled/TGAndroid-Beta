package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f45716a;
    public int f45717b;
    public boolean f45718c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45716a);
        parcel.writeInt(this.f45717b);
        parcel.writeInt(this.f45718c ? 1 : 0);
    }
}
