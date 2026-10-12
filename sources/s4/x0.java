package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class x0 extends i1.c {
    public static final Parcelable.Creator<x0> CREATOR = new i1.b(3);
    public Parcelable f48048c;

    public x0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f48048c = parcel.readParcelable(classLoader == null ? p0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f48048c, 0);
    }
}
