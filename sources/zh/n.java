package zh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import xh.o8;
public final class n extends o8 {
    public final Utilities.Callback[] m0;

    public n(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.m0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
