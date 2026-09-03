package y5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public abstract class l extends a7.c implements y {
    public final int f47189b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        boolean z4;
        if (bArr.length == 25) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.b(z4);
        this.f47189b = Arrays.hashCode(bArr);
    }

    public static byte[] J0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f47189b);
            return true;
        }
        l6.b bVar = new l6.b(K0());
        parcel2.writeNoException();
        a7.d.c(parcel2, bVar);
        return true;
    }

    public abstract byte[] K0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y)) {
            try {
                y yVar = (y) obj;
                if (((l) yVar).f47189b == this.f47189b) {
                    return Arrays.equals(K0(), (byte[]) l6.b.K0(new l6.b(((l) yVar).K0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47189b;
    }
}
