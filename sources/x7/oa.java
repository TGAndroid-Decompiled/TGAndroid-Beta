package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(3);
    public final float f49156a;
    public final int f49157b;

    public oa(float f7, int i10) {
        this.f49156a = f7;
        this.f49157b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeFloat(this.f49156a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49157b);
        w7.e0.r(parcel, q6);
    }
}
