package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f54004a;
    public final String f54005b;

    public m1(IBinder iBinder, String str) {
        this.f54004a = iBinder;
        this.f54005b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f54004a;
    }
}
