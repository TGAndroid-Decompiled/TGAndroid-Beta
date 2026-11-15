package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import java.util.List;
import q4.x;
public final class f extends r6.a implements r {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List f55910a;
    public final String f55911b;

    public f(String str, ArrayList arrayList) {
        this.f55910a = arrayList;
        this.f55911b = str;
    }

    @Override
    public final Status a() {
        if (this.f55911b != null) {
            return Status.f5907e;
        }
        return Status.f5910r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.n(parcel, 1, this.f55910a);
        yb.l(parcel, 2, this.f55911b);
        yb.s(parcel, r10);
    }
}
