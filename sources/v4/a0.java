package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f58477a;
    public int f58478b;
    public boolean f58479c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f58477a);
        parcel.writeInt(this.f58478b);
        parcel.writeInt(this.f58479c ? 1 : 0);
    }
}
