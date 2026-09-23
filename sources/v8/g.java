package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f44179a;
    public final String f44180b;
    public final CommonWalletObject f44181c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f44179a = i10;
        this.f44180b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7112a = str;
            this.f44181c = commonWalletObject2;
            return;
        }
        this.f44181c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44179a);
        e0.l(parcel, 3, this.f44180b);
        e0.k(parcel, 4, this.f44181c, i10);
        e0.r(parcel, q6);
    }
}
