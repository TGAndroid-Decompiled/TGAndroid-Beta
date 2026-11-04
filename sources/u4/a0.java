package u4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new q8.i(28);
    public int f55487a;
    public int f55488b;
    public boolean f55489c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f55487a);
        parcel.writeInt(this.f55488b);
        parcel.writeInt(this.f55489c ? 1 : 0);
    }
}
