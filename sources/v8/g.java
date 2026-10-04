package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f48200a;
    public final String f48201b;
    public final CommonWalletObject f48202c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f48200a = i10;
        this.f48201b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7687a = str;
            this.f48202c = commonWalletObject2;
            return;
        }
        this.f48202c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f48200a);
        g0.l(parcel, 3, this.f48201b);
        g0.k(parcel, 4, this.f48202c, i10);
        g0.r(parcel, q6);
    }
}
