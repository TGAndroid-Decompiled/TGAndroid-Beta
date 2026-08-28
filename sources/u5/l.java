package u5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import x5.x;
public abstract class l extends a7.a implements x {
    public final int f48125b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 11);
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5.l.b(z10);
        this.f48125b = Arrays.hashCode(bArr);
    }

    public static byte[] J0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f48125b);
            return true;
        }
        h6.b bVar = new h6.b(K0());
        parcel2.writeNoException();
        w6.a.c(parcel2, bVar);
        return true;
    }

    public abstract byte[] K0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            try {
                x xVar = (x) obj;
                if (((l) xVar).f48125b == this.f48125b) {
                    return Arrays.equals(K0(), (byte[]) h6.b.K0(new h6.b(((l) xVar).K0())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f48125b;
    }
}
