package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f59164a;
    public final String f59165b;
    public final CommonWalletObject f59166c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f59164a = i7;
        this.f59165b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7732a = str;
            this.f59166c = commonWalletObject2;
            return;
        }
        this.f59166c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f59164a);
        wb.l(parcel, 3, this.f59165b);
        wb.k(parcel, 4, this.f59166c, i7);
        wb.s(parcel, r10);
    }
}
