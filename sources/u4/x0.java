package u4;

import android.os.Parcel;
import android.os.Parcelable;
public final class x0 extends i1.b {
    public static final Parcelable.Creator<x0> CREATOR = new b5.j(4);
    public Parcelable f55676c;

    public x0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f55676c = parcel.readParcelable(classLoader == null ? o0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f55676c, 0);
    }
}
