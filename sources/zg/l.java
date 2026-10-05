package zg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
public final class l extends b0 {
    public final o h;

    public l(o oVar, Context context, d6 d6Var, int i10) {
        super(context, i10, d6Var);
        this.h = oVar;
    }

    @Override
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.E.w0(0, AndroidUtilities.dp(30.0f), null);
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
        return this.h.b0();
    }
}
