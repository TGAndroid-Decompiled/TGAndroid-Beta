package s7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f56501a;

    public a(IBinder iBinder) {
        this.f56501a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f56501a;
    }
}
