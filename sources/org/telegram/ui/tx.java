package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class tx extends UndoView {
    public final py f41648c0;

    public tx(py pyVar, Activity activity) {
        super(activity);
        this.f41648c0 = pyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            oy[] oyVarArr = this.f41648c0.f40155b0;
            if (i10 < oyVarArr.length) {
                if (oyVarArr[i10].f39831x.k()) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void h(int i10, long j10) {
        if (i10 != 1 && i10 != 27) {
            return;
        }
        py pyVar = this.f41648c0;
        pyVar.f40260v3 = 1;
        pyVar.A4(true, true);
        if (pyVar.O1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < pyVar.O1.size()) {
                    if (((TLRPC.Dialog) pyVar.O1.get(i11)).f20849id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                pyVar.f40155b0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gy(this, i11, (TLRPC.Dialog) pyVar.O1.remove(i11), 23));
            } else {
                pyVar.A4(false, true);
            }
        }
        pyVar.o3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        py pyVar = this.f41648c0;
        UndoView[] undoViewArr = pyVar.f40257v0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                pyVar.f40238r1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                pyVar.X4();
            }
        }
    }
}
