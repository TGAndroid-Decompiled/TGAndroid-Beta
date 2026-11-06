package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f53912a;
    public final String f53913b;

    public m1(IBinder iBinder, String str) {
        this.f53912a = iBinder;
        this.f53913b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f53912a;
    }
}
