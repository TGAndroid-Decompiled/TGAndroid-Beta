package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class xx extends UndoView {
    public final ty f44203f0;

    public xx(ty tyVar, Activity activity) {
        super(activity);
        this.f44203f0 = tyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            sy[] syVarArr = this.f44203f0.f42218e0;
            if (i10 < syVarArr.length) {
                if (syVarArr[i10].f41843x.k()) {
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
        ty tyVar = this.f44203f0;
        tyVar.y3 = 1;
        tyVar.x4(true, true);
        if (tyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < tyVar.R1.size()) {
                    if (((TLRPC.Dialog) tyVar.R1.get(i11)).f20046id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                tyVar.f42218e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zk(this, i11, (TLRPC.Dialog) tyVar.R1.remove(i11), 26));
            } else {
                tyVar.x4(false, true);
            }
        }
        tyVar.l3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ty tyVar = this.f44203f0;
        UndoView[] undoViewArr = tyVar.f42319y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                tyVar.f42299u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                tyVar.U4();
            }
        }
    }
}
