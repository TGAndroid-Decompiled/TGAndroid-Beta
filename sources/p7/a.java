package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f43983a;

    public a(IBinder iBinder) {
        this.f43983a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f43983a;
    }
}
