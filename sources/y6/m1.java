package y6;

import android.os.IBinder;
import android.os.IInterface;

public final class m1 implements IInterface {

    public final IBinder f49757a;

    public final String f49758b;

    public m1(IBinder iBinder, String str) {
        this.f49757a = iBinder;
        this.f49758b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f49757a;
    }
}
