package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f53887a;
    public final String f53888b;

    public m1(IBinder iBinder, String str) {
        this.f53887a = iBinder;
        this.f53888b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f53887a;
    }
}
