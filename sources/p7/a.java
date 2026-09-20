package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f40986a;

    public a(IBinder iBinder) {
        this.f40986a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f40986a;
    }
}
