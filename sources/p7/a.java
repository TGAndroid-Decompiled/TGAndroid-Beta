package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f44298a;

    public a(IBinder iBinder) {
        this.f44298a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f44298a;
    }
}
