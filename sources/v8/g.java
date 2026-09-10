package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f43249a;
    public final String f43250b;
    public final CommonWalletObject f43251c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f43249a = i10;
        this.f43250b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f5903a = str;
            this.f43251c = commonWalletObject2;
            return;
        }
        this.f43251c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f43249a);
        e0.l(parcel, 3, this.f43250b);
        e0.k(parcel, 4, this.f43251c, i10);
        e0.r(parcel, q6);
    }
}
