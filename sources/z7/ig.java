package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class ig extends o6.a {
    public static final Parcelable.Creator<ig> CREATOR = new cg(2);
    public final List f48754a;
    public final float[] f48755b;
    public final Bitmap f48756c;
    public final List d;

    public ig(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f48754a = arrayList;
        this.f48755b = fArr;
        this.f48756c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.p(parcel, 1, this.f48754a);
        float[] fArr = this.f48755b;
        if (fArr != null) {
            int q10 = w7.f0.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            w7.f0.r(parcel, q10);
        }
        w7.f0.k(parcel, 3, this.f48756c, i10);
        List list = this.d;
        if (list != null) {
            int q11 = w7.f0.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            w7.f0.r(parcel, q11);
        }
        w7.f0.r(parcel, q6);
    }
}
