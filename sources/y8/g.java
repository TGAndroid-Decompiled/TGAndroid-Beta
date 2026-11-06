package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f59189a;
    public final String f59190b;
    public final CommonWalletObject f59191c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f59189a = i7;
        this.f59190b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7732a = str;
            this.f59191c = commonWalletObject2;
            return;
        }
        this.f59191c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f59189a);
        wb.l(parcel, 3, this.f59190b);
        wb.k(parcel, 4, this.f59191c, i7);
        wb.s(parcel, r10);
    }
}
