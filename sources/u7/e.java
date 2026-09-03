package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new u6.p(10);
    public final List f48476a;
    public final boolean f48477b;
    public final boolean f48478c;

    public e(ArrayList arrayList, boolean z4, boolean z10) {
        this.f48476a = arrayList;
        this.f48477b = z4;
        this.f48478c = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.p(parcel, 1, DesugarCollections.unmodifiableList(this.f48476a));
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f48477b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f48478c ? 1 : 0);
        g5.r(parcel, q10);
    }
}
