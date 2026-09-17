package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f42676a;
    public int f42677b;
    public boolean f42678c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42676a);
        parcel.writeInt(this.f42677b);
        parcel.writeInt(this.f42678c ? 1 : 0);
    }
}
