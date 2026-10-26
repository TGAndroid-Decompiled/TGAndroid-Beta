package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(12);
    public final int f51097a;
    public final String f51098b;
    public final CommonWalletObject f51099c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f51097a = i10;
        this.f51098b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7564a = str;
            this.f51099c = commonWalletObject2;
            return;
        }
        this.f51099c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f51097a);
        df.l(parcel, 3, this.f51098b);
        df.k(parcel, 4, this.f51099c, i10);
        df.r(parcel, q5);
    }
}
