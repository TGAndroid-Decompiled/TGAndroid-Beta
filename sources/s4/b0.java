package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f42681a;
    public int f42682b;
    public boolean f42683c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42681a);
        parcel.writeInt(this.f42682b);
        parcel.writeInt(this.f42683c ? 1 : 0);
    }
}
