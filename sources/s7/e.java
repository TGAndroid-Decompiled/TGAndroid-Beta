package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new s6.i(18);
    public final List f47671a;
    public final boolean f47672b;
    public final boolean f47673c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f47671a = arrayList;
        this.f47672b = z10;
        this.f47673c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.p(parcel, 1, DesugarCollections.unmodifiableList(this.f47671a));
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f47672b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f47673c ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
