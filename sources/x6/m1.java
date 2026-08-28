package x6;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f49040a;
    public final String f49041b;

    public m1(IBinder iBinder, String str) {
        this.f49040a = iBinder;
        this.f49041b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f49040a;
    }
}
