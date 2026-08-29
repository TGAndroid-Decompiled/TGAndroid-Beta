package z6;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f50740a;
    public final String f50741b;

    public m1(IBinder iBinder, String str) {
        this.f50740a = iBinder;
        this.f50741b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f50740a;
    }
}
