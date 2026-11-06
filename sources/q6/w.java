package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int f53853a;
    public final Account f53854b;
    public final int f53855c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f53853a = i7;
        this.f53854b = account;
        this.f53855c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53853a);
        wb.k(parcel, 2, this.f53854b, i7);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f53855c);
        wb.k(parcel, 4, this.d, i7);
        wb.s(parcel, r10);
    }
}
