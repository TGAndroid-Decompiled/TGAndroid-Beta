package q7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new j(6);
    public final List f46099a;
    public final boolean f46100b;
    public final boolean f46101c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f46099a = arrayList;
        this.f46100b = z10;
        this.f46101c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.p(parcel, 1, DesugarCollections.unmodifiableList(this.f46099a));
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f46100b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f46101c ? 1 : 0);
        p8.r(parcel, q10);
    }
}
