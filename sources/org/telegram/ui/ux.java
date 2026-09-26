package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ux extends UndoView {
    public final qy f38569f0;

    public ux(qy qyVar, Activity activity) {
        super(activity);
        this.f38569f0 = qyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            py[] pyVarArr = this.f38569f0.f37032e0;
            if (i10 < pyVarArr.length) {
                if (pyVarArr[i10].f36701x.k()) {
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
        qy qyVar = this.f38569f0;
        qyVar.y3 = 1;
        qyVar.A4(true, true);
        if (qyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < qyVar.R1.size()) {
                    if (((TLRPC.Dialog) qyVar.R1.get(i11)).f18339id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                qyVar.f37032e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ym(this, i11, (TLRPC.Dialog) qyVar.R1.remove(i11), 25));
            } else {
                qyVar.A4(false, true);
            }
        }
        qyVar.o3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        qy qyVar = this.f38569f0;
        UndoView[] undoViewArr = qyVar.f37133y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                qyVar.f37113u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                qyVar.X4();
            }
        }
    }
}
