package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f56150a;
    public final String f56151b;

    public m1(IBinder iBinder, String str) {
        this.f56150a = iBinder;
        this.f56151b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f56150a;
    }
}
