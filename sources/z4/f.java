package z4;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends i1.c {
    public static final Parcelable.Creator<f> CREATOR = new i1.b(4);
    public int f52402c;
    public Parcelable d;
    public final ClassLoader f52403e;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? f.class.getClassLoader() : classLoader;
        this.f52402c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.f52403e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return a4.a.o(this.f52402c, "}", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f52402c);
        parcel.writeParcelable(this.d, i10);
    }
}
