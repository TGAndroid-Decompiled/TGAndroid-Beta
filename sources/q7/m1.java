package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f54016a;
    public final String f54017b;

    public m1(IBinder iBinder, String str) {
        this.f54016a = iBinder;
        this.f54017b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f54016a;
    }
}
