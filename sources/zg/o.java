package zg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
public final class o extends c0 {
    public final q h;

    public o(q qVar, Context context, c6 c6Var, int i10) {
        super(context, i10, c6Var);
        this.h = qVar;
    }

    @Override
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.f54889y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 != R.id.menu_delete && i10 != 16908320) {
            if (i10 != 16908322 && i10 != 16908321) {
                return super.onTextContextMenuItem(i10);
            }
            return false;
        }
        return this.h.a0();
    }
}
