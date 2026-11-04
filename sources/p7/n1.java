package p7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f53387a;
    public final String f53388b;

    public n1(IBinder iBinder, String str) {
        this.f53387a = iBinder;
        this.f53388b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f53387a;
    }
}
