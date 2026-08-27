package z7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import h7.r8;

public final class b extends z5.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new w7.f(22);

    public final int f50208a;

    public final int f50209b;

    public final Intent f50210c;

    public b(int i10, int i11, Intent intent) {
        this.f50208a = i10;
        this.f50209b = i11;
        this.f50210c = intent;
    }

    @Override
    public final Status i() {
        return this.f50209b == 0 ? Status.f3182e : Status.f3185r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f50208a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f50209b);
        r8.k(parcel, 3, this.f50210c, i10);
        r8.r(parcel, iQ);
    }
}
