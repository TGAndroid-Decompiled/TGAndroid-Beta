package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f45885a;
    public int f45886b;
    public boolean f45887c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45885a);
        parcel.writeInt(this.f45886b);
        parcel.writeInt(this.f45887c ? 1 : 0);
    }
}
