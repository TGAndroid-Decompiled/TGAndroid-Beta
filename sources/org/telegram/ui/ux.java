package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ux extends UndoView {
    public final ty f38373f0;

    public ux(ty tyVar, Activity activity) {
        super(activity);
        this.f38373f0 = tyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            sy[] syVarArr = this.f38373f0.f37976e0;
            if (i10 < syVarArr.length) {
                if (syVarArr[i10].f37601x.k()) {
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
        ty tyVar = this.f38373f0;
        tyVar.y3 = 1;
        tyVar.J4(true, true);
        if (tyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < tyVar.R1.size()) {
                    if (((TLRPC.Dialog) tyVar.R1.get(i11)).f18333id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                tyVar.f37976e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ym(this, i11, (TLRPC.Dialog) tyVar.R1.remove(i11), 25));
            } else {
                tyVar.J4(false, true);
            }
        }
        tyVar.x3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ty tyVar = this.f38373f0;
        UndoView[] undoViewArr = tyVar.f38076y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                tyVar.f38057u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                tyVar.g5();
            }
        }
    }
}
