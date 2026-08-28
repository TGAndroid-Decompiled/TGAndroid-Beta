package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
import w7.i;
public final class f extends y5.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new i(15);
    public final List f49614a;
    public final String f49615b;

    public f(String str, ArrayList arrayList) {
        this.f49614a = arrayList;
        this.f49615b = str;
    }

    @Override
    public final Status i() {
        if (this.f49615b != null) {
            return Status.f2737e;
        }
        return Status.f2740r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.n(parcel, 1, this.f49614a);
        p8.l(parcel, 2, this.f49615b);
        p8.r(parcel, q10);
    }
}
