package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int f55978a;
    public final Account f55979b;
    public final int f55980c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f55978a = i7;
        this.f55979b = account;
        this.f55980c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f55978a);
        cc.k(parcel, 2, this.f55979b, i7);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f55980c);
        cc.k(parcel, 4, this.d, i7);
        cc.s(parcel, r10);
    }
}
