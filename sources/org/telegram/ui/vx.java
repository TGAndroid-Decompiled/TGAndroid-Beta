package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class vx extends UndoView {
    public final ry f38488f0;

    public vx(ry ryVar, Activity activity) {
        super(activity);
        this.f38488f0 = ryVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            qy[] qyVarArr = this.f38488f0.f36978e0;
            if (i10 < qyVarArr.length) {
                if (qyVarArr[i10].f36637x.k()) {
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
        ry ryVar = this.f38488f0;
        ryVar.y3 = 1;
        ryVar.A4(true, true);
        if (ryVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < ryVar.R1.size()) {
                    if (((TLRPC.Dialog) ryVar.R1.get(i11)).f18087id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                ryVar.f36978e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xm(this, i11, (TLRPC.Dialog) ryVar.R1.remove(i11), 25));
            } else {
                ryVar.A4(false, true);
            }
        }
        ryVar.o3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ry ryVar = this.f38488f0;
        UndoView[] undoViewArr = ryVar.f37079y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ryVar.f37059u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                ryVar.X4();
            }
        }
    }
}
