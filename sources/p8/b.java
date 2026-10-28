package p8;

import a8.df;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import n4.x;
public final class b extends p6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new x(20);
    public final int f46852a;
    public final int f46853b;
    public final Intent f46854c;

    public b(int i10, int i11, Intent intent) {
        this.f46852a = i10;
        this.f46853b = i11;
        this.f46854c = intent;
    }

    @Override
    public final Status h() {
        if (this.f46853b == 0) {
            return Status.e;
        }
        return Status.f6465r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f46852a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f46853b);
        df.k(parcel, 3, this.f46854c, i10);
        df.r(parcel, q5);
    }
}
