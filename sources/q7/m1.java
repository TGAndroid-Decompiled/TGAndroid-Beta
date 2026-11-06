package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f53911a;
    public final String f53912b;

    public m1(IBinder iBinder, String str) {
        this.f53911a = iBinder;
        this.f53912b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f53911a;
    }
}
