package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f41007a;

    public a(IBinder iBinder) {
        this.f41007a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f41007a;
    }
}
