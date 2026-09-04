package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class ig extends o6.a {
    public static final Parcelable.Creator<ig> CREATOR = new cg(2);
    public final List f51118a;
    public final float[] f51119b;
    public final Bitmap f51120c;
    public final List d;

    public ig(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f51118a = arrayList;
        this.f51119b = fArr;
        this.f51120c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.p(parcel, 1, this.f51118a);
        float[] fArr = this.f51119b;
        if (fArr != null) {
            int q10 = w7.e0.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            w7.e0.r(parcel, q10);
        }
        w7.e0.k(parcel, 3, this.f51120c, i10);
        List list = this.d;
        if (list != null) {
            int q11 = w7.e0.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            w7.e0.r(parcel, q11);
        }
        w7.e0.r(parcel, q6);
    }
}
