package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import q4.x;
public final class b extends r6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int f54332a;
    public final int f54333b;
    public final Intent f54334c;

    public b(int i7, int i10, Intent intent) {
        this.f54332a = i7;
        this.f54333b = i10;
        this.f54334c = intent;
    }

    @Override
    public final Status a() {
        if (this.f54333b == 0) {
            return Status.f6525e;
        }
        return Status.f6528r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f54332a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f54333b);
        wb.k(parcel, 3, this.f54334c, i7);
        wb.s(parcel, r10);
    }
}
