package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yv extends UndoView {
    public final uw f52415k0;

    public yv(uw uwVar, Activity activity) {
        super(activity);
        this.f52415k0 = uwVar;
    }

    @Override
    public final boolean a() {
        int i3 = 0;
        while (true) {
            tw[] twVarArr = this.f52415k0.f50230f0;
            if (i3 < twVarArr.length) {
                if (twVarArr[i3].f49907y.k()) {
                    return false;
                }
                i3++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void g(int i3, long j10) {
        if (i3 != 1 && i3 != 27) {
            return;
        }
        uw uwVar = this.f52415k0;
        uwVar.M4(true, true);
        if (uwVar.S1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < uwVar.S1.size()) {
                    if (((TLRPC.Dialog) uwVar.S1.get(i10)).f27005id == j10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                uwVar.f50230f0[0].d.f();
                org.telegram.messenger.g0.h3(new f4(this, i10, (TLRPC.Dialog) uwVar.S1.remove(i10), 29));
            } else {
                uwVar.M4(false, true);
            }
        }
        uwVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        uw uwVar = this.f52415k0;
        UndoView[] undoViewArr = uwVar.f50330z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                uwVar.f50309v1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                uwVar.k5();
            }
        }
    }
}
