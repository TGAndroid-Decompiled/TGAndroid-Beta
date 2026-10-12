package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f43146a;

    public a(IBinder iBinder) {
        this.f43146a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f43146a;
    }
}
