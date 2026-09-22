package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends o6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] f48473a;
    public final Bitmap f48474b;
    public final int f48475c;
    public final int d;
    public final int e;
    public final int f48476f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f48473a = fArr;
        this.f48474b = bitmap;
        this.f48475c = i10;
        this.d = i11;
        this.e = i12;
        this.f48476f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        float[] fArr = this.f48473a;
        if (fArr != null) {
            int q10 = w7.e0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.e0.r(parcel, q10);
        }
        w7.e0.k(parcel, 2, this.f48474b, i10);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f48475c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.e0.s(parcel, 6, 4);
        parcel.writeInt(this.f48476f);
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.e0.r(parcel, q6);
    }
}
