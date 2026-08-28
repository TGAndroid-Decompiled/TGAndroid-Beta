package y7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import g7.p8;
import w7.i;
public final class b extends y5.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new i(14);
    public final int f49611a;
    public final int f49612b;
    public final Intent f49613c;

    public b(int i9, int i10, Intent intent) {
        this.f49611a = i9;
        this.f49612b = i10;
        this.f49613c = intent;
    }

    @Override
    public final Status i() {
        if (this.f49612b == 0) {
            return Status.f2737e;
        }
        return Status.f2740r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f49611a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f49612b);
        p8.k(parcel, 3, this.f49613c, i9);
        p8.r(parcel, q10);
    }
}
