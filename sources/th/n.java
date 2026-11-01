package th;

import android.content.Context;
import org.telegram.messenger.r20;
import rh.v8;
public final class n extends v8 {
    public final r20[] m0;

    public n(Context context, b bVar, r20[] r20VarArr) {
        super(context, bVar);
        this.m0 = r20VarArr;
    }

    @Override
    public final void e(int i10) {
        this.m0[0].a(Integer.valueOf(i10));
    }
}
