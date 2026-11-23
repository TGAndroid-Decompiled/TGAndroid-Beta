package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import java.util.List;
import q4.x;
public final class f extends r6.a implements r {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List f56494a;
    public final String f56495b;

    public f(String str, ArrayList arrayList) {
        this.f56494a = arrayList;
        this.f56495b = str;
    }

    @Override
    public final Status a() {
        if (this.f56495b != null) {
            return Status.f6185e;
        }
        return Status.f6188r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.n(parcel, 1, this.f56494a);
        cc.l(parcel, 2, this.f56495b);
        cc.s(parcel, r10);
    }
}
