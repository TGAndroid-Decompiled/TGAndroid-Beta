package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
public final class ig extends o6.a {
    public static final Parcelable.Creator<ig> CREATOR = new dg(1);
    public final float[] f54148a;
    public final Bitmap f54149b;
    public final int f54150c;
    public final int d;
    public final int f54151e;
    public final int f54152f;
    public final int h;

    public ig(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f54148a = fArr;
        this.f54149b = bitmap;
        this.f54150c = i10;
        this.d = i11;
        this.f54151e = i12;
        this.f54152f = i13;
        this.h = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        float[] fArr = this.f54148a;
        if (fArr != null) {
            int q10 = w7.c0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.c0.r(parcel, q10);
        }
        w7.c0.k(parcel, 2, this.f54149b, i10);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f54150c);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.f54151e);
        w7.c0.s(parcel, 6, 4);
        parcel.writeInt(this.f54152f);
        w7.c0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.c0.r(parcel, q6);
    }
}
