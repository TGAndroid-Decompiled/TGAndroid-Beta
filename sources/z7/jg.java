package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new eg(1);
    public final float[] f51080a;
    public final Bitmap f51081b;
    public final int f51082c;
    public final int d;
    public final int e;
    public final int f51083f;
    public final int h;

    public jg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f51080a = fArr;
        this.f51081b = bitmap;
        this.f51082c = i10;
        this.d = i11;
        this.e = i12;
        this.f51083f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        float[] fArr = this.f51080a;
        if (fArr != null) {
            int q10 = w7.f0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.f0.r(parcel, q10);
        }
        w7.f0.k(parcel, 2, this.f51081b, i10);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f51082c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.f0.s(parcel, 6, 4);
        parcel.writeInt(this.f51083f);
        w7.f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.f0.r(parcel, q6);
    }
}
