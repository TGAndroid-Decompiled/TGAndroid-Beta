package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int f56091a;
    public final Account f56092b;
    public final int f56093c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f56091a = i7;
        this.f56092b = account;
        this.f56093c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56091a);
        cc.k(parcel, 2, this.f56092b, i7);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f56093c);
        cc.k(parcel, 4, this.d, i7);
        cc.s(parcel, r10);
    }
}
