package z7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import h7.r8;
import java.util.ArrayList;
import java.util.List;

public final class f extends z5.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new w7.f(23);

    public final List f50211a;

    public final String f50212b;

    public f(String str, ArrayList arrayList) {
        this.f50211a = arrayList;
        this.f50212b = str;
    }

    @Override
    public final Status i() {
        return this.f50212b != null ? Status.f3182e : Status.f3185r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.n(parcel, 1, this.f50211a);
        r8.l(parcel, 2, this.f50212b);
        r8.r(parcel, iQ);
    }
}
