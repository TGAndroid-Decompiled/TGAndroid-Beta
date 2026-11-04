package r7;

import android.os.IBinder;
import android.os.IInterface;
public final class b extends p6.h {
    @Override
    public final int d() {
        return 12600000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    @Override
    public final String n() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
