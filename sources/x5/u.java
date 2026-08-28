package x5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import g7.p8;
public final class u extends y5.a {
    public static final Parcelable.Creator<u> CREATOR = new w7.i(5);
    public final int f48980a;
    public final Account f48981b;
    public final int f48982c;
    public final GoogleSignInAccount d;

    public u(int i9, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f48980a = i9;
        this.f48981b = account;
        this.f48982c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48980a);
        p8.k(parcel, 2, this.f48981b, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f48982c);
        p8.k(parcel, 4, this.d, i9);
        p8.r(parcel, q10);
    }
}
