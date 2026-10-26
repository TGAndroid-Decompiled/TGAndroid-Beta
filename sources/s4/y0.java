package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class y0 extends i1.b {
    public static final Parcelable.Creator<y0> CREATOR = new a5.k(4);
    public Parcelable f47860c;

    public y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f47860c = parcel.readParcelable(classLoader == null ? p0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f47860c, 0);
    }
}
