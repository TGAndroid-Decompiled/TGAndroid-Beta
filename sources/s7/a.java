package s7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f57120a;

    public a(IBinder iBinder) {
        this.f57120a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f57120a;
    }
}
