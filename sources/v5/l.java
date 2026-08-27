package v5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import y5.x;

public abstract class l extends b7.a implements x {

    public final int f48810b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 11);
        y5.l.b(bArr.length == 25);
        this.f48810b = Arrays.hashCode(bArr);
    }

    public static byte[] J0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            i6.b bVar = new i6.b(K0());
            parcel2.writeNoException();
            x6.a.c(parcel2, bVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f48810b);
        return true;
    }

    public abstract byte[] K0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            try {
                x xVar = (x) obj;
                if (((l) xVar).f48810b == this.f48810b) {
                    return Arrays.equals(K0(), (byte[]) i6.b.K0(new i6.b(((l) xVar).K0())));
                }
            } catch (RemoteException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f48810b;
    }
}
