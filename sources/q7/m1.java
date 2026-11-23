package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f56072a;
    public final String f56073b;

    public m1(IBinder iBinder, String str) {
        this.f56072a = iBinder;
        this.f56073b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f56072a;
    }
}
