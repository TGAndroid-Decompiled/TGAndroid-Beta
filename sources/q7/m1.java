package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f55453a;
    public final String f55454b;

    public m1(IBinder iBinder, String str) {
        this.f55453a = iBinder;
        this.f55454b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f55453a;
    }
}
