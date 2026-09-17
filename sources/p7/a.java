package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f43957a;

    public a(IBinder iBinder) {
        this.f43957a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f43957a;
    }
}
