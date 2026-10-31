package th;

import android.content.Context;
import org.telegram.messenger.q20;
import rh.v8;
public final class n extends v8 {
    public final q20[] m0;

    public n(Context context, b bVar, q20[] q20VarArr) {
        super(context, bVar);
        this.m0 = q20VarArr;
    }

    @Override
    public final void e(int i10) {
        this.m0[0].a(Integer.valueOf(i10));
    }
}
