package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f54005a;
    public final String f54006b;

    public m1(IBinder iBinder, String str) {
        this.f54005a = iBinder;
        this.f54006b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f54005a;
    }
}
