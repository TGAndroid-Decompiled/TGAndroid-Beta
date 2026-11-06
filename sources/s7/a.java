package s7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f54842a;

    public a(IBinder iBinder) {
        this.f54842a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f54842a;
    }
}
