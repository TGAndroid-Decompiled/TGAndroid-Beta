package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f54017a;
    public final String f54018b;

    public m1(IBinder iBinder, String str) {
        this.f54017a = iBinder;
        this.f54018b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f54017a;
    }
}
