package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f56027a;
    public final String f56028b;

    public m1(IBinder iBinder, String str) {
        this.f56027a = iBinder;
        this.f56028b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f56027a;
    }
}
