package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends o6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] f53945a;
    public final Bitmap f53946b;
    public final int f53947c;
    public final int d;
    public final int f53948e;
    public final int f53949f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f53945a = fArr;
        this.f53946b = bitmap;
        this.f53947c = i10;
        this.d = i11;
        this.f53948e = i12;
        this.f53949f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        float[] fArr = this.f53945a;
        if (fArr != null) {
            int q10 = w7.d0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.d0.r(parcel, q10);
        }
        w7.d0.k(parcel, 2, this.f53946b, i10);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53947c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f53948e);
        w7.d0.s(parcel, 6, 4);
        parcel.writeInt(this.f53949f);
        w7.d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.d0.r(parcel, q6);
    }
}
