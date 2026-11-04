package w8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new b(2);
    public int f57414a;
    public int f57415b;
    public int f57416c;
    public boolean d;
    public boolean f57417e;
    public float f57418f;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f57414a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f57415b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f57416c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f57417e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f57418f;
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(f10);
        j8.a.t(parcel, s6);
    }
}
