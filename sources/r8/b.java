package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import q4.x;
public final class b extends r6.a implements r {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int f56491a;
    public final int f56492b;
    public final Intent f56493c;

    public b(int i7, int i10, Intent intent) {
        this.f56491a = i7;
        this.f56492b = i10;
        this.f56493c = intent;
    }

    @Override
    public final Status a() {
        if (this.f56492b == 0) {
            return Status.f6185e;
        }
        return Status.f6188r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56491a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f56492b);
        cc.k(parcel, 3, this.f56493c, i7);
        cc.s(parcel, r10);
    }
}
