package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class wx extends UndoView {
    public final sy f43918f0;

    public wx(sy syVar, Activity activity) {
        super(activity);
        this.f43918f0 = syVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ry[] ryVarArr = this.f43918f0.f41941e0;
            if (i10 < ryVarArr.length) {
                if (ryVarArr[i10].f41573x.k()) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void h(int i10, long j3) {
        if (i10 != 1 && i10 != 27) {
            return;
        }
        sy syVar = this.f43918f0;
        syVar.y3 = 1;
        syVar.x4(true, true);
        if (syVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < syVar.R1.size()) {
                    if (((TLRPC.Dialog) syVar.R1.get(i11)).f20072id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                syVar.f41941e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zk(this, i11, (TLRPC.Dialog) syVar.R1.remove(i11), 26));
            } else {
                syVar.x4(false, true);
            }
        }
        syVar.l3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        sy syVar = this.f43918f0;
        UndoView[] undoViewArr = syVar.f42042y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                syVar.f42022u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                syVar.U4();
            }
        }
    }
}
