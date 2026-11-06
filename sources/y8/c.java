package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList f59142a;
    public boolean f59143b;
    public boolean f59144c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.h(parcel, 1, this.f59142a);
        boolean z9 = this.f59143b;
        wb.q(parcel, 2, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f59144c;
        wb.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.d;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        wb.s(parcel, r10);
    }
}
