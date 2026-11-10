package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class x0 extends j1.b {
    public static final Parcelable.Creator<x0> CREATOR = new c5.i(4);
    public Parcelable f57193c;

    public x0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f57193c = parcel.readParcelable(classLoader == null ? n0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f57193c, 0);
    }
}
