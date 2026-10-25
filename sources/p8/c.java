package p8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class c extends c8.b implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
    }

    @Override
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                l6.a aVar = (l6.a) l7.a.a(parcel, l6.a.CREATOR);
                b bVar = (b) l7.a.a(parcel, b.CREATOR);
                l7.a.b(parcel);
                break;
            case 4:
                Status status = (Status) l7.a.a(parcel, Status.CREATOR);
                l7.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) l7.a.a(parcel, Status.CREATOR);
                l7.a.b(parcel);
                break;
            case 7:
                Status status3 = (Status) l7.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) l7.a.a(parcel, GoogleSignInAccount.CREATOR);
                l7.a.b(parcel);
                break;
            case 8:
                l7.a.b(parcel);
                m((h) l7.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) l7.a.a(parcel, f.CREATOR);
                l7.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
