package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class ig extends o6.a {
    public static final Parcelable.Creator<ig> CREATOR = new dg(1);
    public final float[] f54045a;
    public final Bitmap f54046b;
    public final int f54047c;
    public final int d;
    public final int f54048e;
    public final int f54049f;
    public final int h;

    public ig(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f54045a = fArr;
        this.f54046b = bitmap;
        this.f54047c = i10;
        this.d = i11;
        this.f54048e = i12;
        this.f54049f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        float[] fArr = this.f54045a;
        if (fArr != null) {
            int q10 = w7.d0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.d0.r(parcel, q10);
        }
        w7.d0.k(parcel, 2, this.f54046b, i10);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f54047c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f54048e);
        w7.d0.s(parcel, 6, 4);
        parcel.writeInt(this.f54049f);
        w7.d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.d0.r(parcel, q6);
    }
}
