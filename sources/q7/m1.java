package q7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f56068a;
    public final String f56069b;

    public m1(IBinder iBinder, String str) {
        this.f56068a = iBinder;
        this.f56069b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f56068a;
    }
}
