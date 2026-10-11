package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new dg(2);
    public final List f54027a;
    public final float[] f54028b;
    public final Bitmap f54029c;
    public final List d;

    public jg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.f54027a = arrayList;
        this.f54028b = fArr;
        this.f54029c = bitmap;
        this.d = arrayList2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.p(parcel, 1, this.f54027a);
        float[] fArr = this.f54028b;
        if (fArr != null) {
            int q10 = w7.d0.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            w7.d0.r(parcel, q10);
        }
        w7.d0.k(parcel, 3, this.f54029c, i10);
        List list = this.d;
        if (list != null) {
            int q11 = w7.d0.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            w7.d0.r(parcel, q11);
        }
        w7.d0.r(parcel, q6);
    }
}
