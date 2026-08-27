package r7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new r6.l(14);

    public final List f46859a;

    public final boolean f46860b;

    public final boolean f46861c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f46859a = arrayList;
        this.f46860b = z10;
        this.f46861c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.p(parcel, 1, DesugarCollections.unmodifiableList(this.f46859a));
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f46860b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f46861c ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
