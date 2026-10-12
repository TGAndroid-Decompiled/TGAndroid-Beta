package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class zx extends UndoView {
    public final vy f44928f0;

    public zx(vy vyVar, Activity activity) {
        super(activity);
        this.f44928f0 = vyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            uy[] uyVarArr = this.f44928f0.f42903e0;
            if (i10 < uyVarArr.length) {
                if (uyVarArr[i10].f42620x.k()) {
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
        vy vyVar = this.f44928f0;
        vyVar.y3 = 1;
        vyVar.x4(true, true);
        if (vyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < vyVar.R1.size()) {
                    if (((TLRPC.Dialog) vyVar.R1.get(i11)).f19806id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                vyVar.f42903e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bl(this, i11, (TLRPC.Dialog) vyVar.R1.remove(i11), 26));
            } else {
                vyVar.x4(false, true);
            }
        }
        vyVar.l3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vy vyVar = this.f44928f0;
        UndoView[] undoViewArr = vyVar.f43004y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                vyVar.f42984u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                vyVar.U4();
            }
        }
    }
}
