package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f40959a;

    public a(IBinder iBinder) {
        this.f40959a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f40959a;
    }
}
