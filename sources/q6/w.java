package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int f55394a;
    public final Account f55395b;
    public final int f55396c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f55394a = i7;
        this.f55395b = account;
        this.f55396c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55394a);
        yb.k(parcel, 2, this.f55395b, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f55396c);
        yb.k(parcel, 4, this.d, i7);
        yb.s(parcel, r10);
    }
}
