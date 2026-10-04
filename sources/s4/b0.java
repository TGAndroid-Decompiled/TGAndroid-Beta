package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f46501a;
    public int f46502b;
    public boolean f46503c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46501a);
        parcel.writeInt(this.f46502b);
        parcel.writeInt(this.f46503c ? 1 : 0);
    }
}
