package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ux extends UndoView {
    public final qy f38924c0;

    public ux(qy qyVar, Activity activity) {
        super(activity);
        this.f38924c0 = qyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            py[] pyVarArr = this.f38924c0.f37527b0;
            if (i10 < pyVarArr.length) {
                if (pyVarArr[i10].f37254x.k()) {
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
        qy qyVar = this.f38924c0;
        qyVar.f37631v3 = 1;
        qyVar.A4(true, true);
        if (qyVar.O1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < qyVar.O1.size()) {
                    if (((TLRPC.Dialog) qyVar.O1.get(i11)).f19163id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                qyVar.f37527b0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey(this, i11, (TLRPC.Dialog) qyVar.O1.remove(i11), 23));
            } else {
                qyVar.A4(false, true);
            }
        }
        qyVar.o3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qy qyVar = this.f38924c0;
        UndoView[] undoViewArr = qyVar.f37628v0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                qyVar.f37609r1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                qyVar.X4();
            }
        }
    }
}
