package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f56037a;
    public final String f56038b;

    public m1(IBinder iBinder, String str) {
        this.f56037a = iBinder;
        this.f56038b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f56037a;
    }
}
