package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends o6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] f52769a;
    public final Bitmap f52770b;
    public final int f52771c;
    public final int d;
    public final int f52772e;
    public final int f52773f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f52769a = fArr;
        this.f52770b = bitmap;
        this.f52771c = i10;
        this.d = i11;
        this.f52772e = i12;
        this.f52773f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        float[] fArr = this.f52769a;
        if (fArr != null) {
            int q10 = w7.g0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.g0.r(parcel, q10);
        }
        w7.g0.k(parcel, 2, this.f52770b, i10);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f52771c);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.f52772e);
        w7.g0.s(parcel, 6, 4);
        parcel.writeInt(this.f52773f);
        w7.g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.g0.r(parcel, q6);
    }
}
