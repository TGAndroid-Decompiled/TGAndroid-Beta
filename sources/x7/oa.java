package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(3);
    public final float f49609a;
    public final int f49610b;

    public oa(float f7, int i10) {
        this.f49609a = f7;
        this.f49610b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeFloat(this.f49609a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f49610b);
        w7.g0.r(parcel, q6);
    }
}
