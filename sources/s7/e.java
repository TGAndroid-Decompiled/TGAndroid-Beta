package s7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h7.g7;
import h7.l7;
import h7.r7;
import y5.l;

public abstract class e {

    public static boolean f47806a = false;

    public static int f47807b = 1;

    public static synchronized int a(Context context) {
        String str;
        try {
            l.i(context, "Context is null");
            Log.d("e", "preferredRenderer: ".concat("null"));
            if (f47806a) {
                return 0;
            }
            try {
                t7.e eVarA = l7.a(context);
                try {
                    t7.a aVarU0 = eVarA.U0();
                    l.h(aVarU0);
                    g7.f8402a = aVarU0;
                    d7.e eVarW0 = eVarA.W0();
                    if (r7.f8533a == null) {
                        l.i(eVarW0, "delegate must not be null");
                        r7.f8533a = eVarW0;
                    }
                    f47806a = true;
                    try {
                        Parcel parcelL0 = eVarA.L0(eVarA.M0(), 9);
                        int i10 = parcelL0.readInt();
                        parcelL0.recycle();
                        if (i10 == 2) {
                            f47807b = 2;
                        }
                        i6.b bVar = new i6.b(context);
                        Parcel parcelM0 = eVarA.M0();
                        d7.b.c(parcelM0, bVar);
                        parcelM0.writeInt(0);
                        eVarA.Q0(parcelM0, 10);
                    } catch (RemoteException e9) {
                        Log.e("e", "Failed to retrieve renderer type or log initialization.", e9);
                    }
                    int i11 = f47807b;
                    if (i11 != 1) {
                        str = i11 != 2 ? "null" : "LATEST";
                    } else {
                        str = "LEGACY";
                    }
                    Log.d("e", "loadedRenderer: ".concat(str));
                    return 0;
                } catch (RemoteException e10) {
                    throw new a7.c(e10);
                }
            } catch (v5.f e11) {
                return e11.f48796a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
