package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yx extends UndoView {
    public final uy f43232f0;

    public yx(uy uyVar, Activity activity) {
        super(activity);
        this.f43232f0 = uyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ty[] tyVarArr = this.f43232f0.f41259e0;
            if (i10 < tyVarArr.length) {
                if (tyVarArr[i10].f40867x.k()) {
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
        uy uyVar = this.f43232f0;
        uyVar.y3 = 1;
        uyVar.A4(true, true);
        if (uyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < uyVar.R1.size()) {
                    if (((TLRPC.Dialog) uyVar.R1.get(i11)).f19873id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                uyVar.f41259e0[0].d.l();
                AndroidUtilities.runOnUIThread(new dm(this, i11, (TLRPC.Dialog) uyVar.R1.remove(i11), 26));
            } else {
                uyVar.A4(false, true);
            }
        }
        uyVar.o3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        uy uyVar = this.f43232f0;
        UndoView[] undoViewArr = uyVar.f41361y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                uyVar.f41340u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                uyVar.X4();
            }
        }
    }
}
