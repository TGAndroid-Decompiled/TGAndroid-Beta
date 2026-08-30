package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new u6.p(10);
    public final List f45182a;
    public final boolean f45183b;
    public final boolean f45184c;

    public e(ArrayList arrayList, boolean z4, boolean z10) {
        this.f45182a = arrayList;
        this.f45183b = z4;
        this.f45184c = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.p(parcel, 1, DesugarCollections.unmodifiableList(this.f45182a));
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f45183b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f45184c ? 1 : 0);
        f5.r(parcel, q10);
    }
}
