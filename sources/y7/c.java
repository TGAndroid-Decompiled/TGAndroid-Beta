package y7;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class c extends a7.a implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 10);
    }

    @Override
    public final boolean F0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 3:
                u5.a aVar = (u5.a) u6.a.a(parcel, u5.a.CREATOR);
                b bVar = (b) u6.a.a(parcel, b.CREATOR);
                u6.a.b(parcel);
                break;
            case 4:
                Status status = (Status) u6.a.a(parcel, Status.CREATOR);
                u6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) u6.a.a(parcel, Status.CREATOR);
                u6.a.b(parcel);
                break;
            case 7:
                Status status3 = (Status) u6.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) u6.a.a(parcel, GoogleSignInAccount.CREATOR);
                u6.a.b(parcel);
                break;
            case 8:
                u6.a.b(parcel);
                s0((h) u6.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) u6.a.a(parcel, f.CREATOR);
                u6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
