package z7;

import android.os.Parcel;

public abstract class c extends b7.a implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 10);
    }

    @Override
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                v6.a.b(parcel);
                break;
            case 4:
                v6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                v6.a.b(parcel);
                break;
            case 7:
                v6.a.b(parcel);
                break;
            case 8:
                h hVar = (h) v6.a.a(parcel, h.CREATOR);
                v6.a.b(parcel);
                p0(hVar);
                break;
            case 9:
                v6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
