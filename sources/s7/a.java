package s7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f57075a;

    public a(IBinder iBinder) {
        this.f57075a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f57075a;
    }
}
