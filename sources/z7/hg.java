package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends o6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] f53899a;
    public final Bitmap f53900b;
    public final int f53901c;
    public final int d;
    public final int f53902e;
    public final int f53903f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f53899a = fArr;
        this.f53900b = bitmap;
        this.f53901c = i10;
        this.d = i11;
        this.f53902e = i12;
        this.f53903f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        float[] fArr = this.f53899a;
        if (fArr != null) {
            int q10 = w7.d0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.d0.r(parcel, q10);
        }
        w7.d0.k(parcel, 2, this.f53900b, i10);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53901c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f53902e);
        w7.d0.s(parcel, 6, 4);
        parcel.writeInt(this.f53903f);
        w7.d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.d0.r(parcel, q6);
    }
}
