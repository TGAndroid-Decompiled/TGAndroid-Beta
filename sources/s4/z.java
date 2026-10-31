package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new p7.n(19);
    public int f48050a;
    public int f48051b;
    public boolean f48052c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f48050a);
        parcel.writeInt(this.f48051b);
        parcel.writeInt(this.f48052c ? 1 : 0);
    }
}
