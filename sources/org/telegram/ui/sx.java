package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class sx extends UndoView {
    public final oy f38450c0;

    public sx(oy oyVar, Activity activity) {
        super(activity);
        this.f38450c0 = oyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ny[] nyVarArr = this.f38450c0.f37009b0;
            if (i10 < nyVarArr.length) {
                if (nyVarArr[i10].f36749x.k()) {
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
        oy oyVar = this.f38450c0;
        oyVar.f37113v3 = 1;
        oyVar.A4(true, true);
        if (oyVar.O1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < oyVar.O1.size()) {
                    if (((TLRPC.Dialog) oyVar.O1.get(i11)).f19188id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                oyVar.f37009b0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey(this, i11, (TLRPC.Dialog) oyVar.O1.remove(i11), 23));
            } else {
                oyVar.A4(false, true);
            }
        }
        oyVar.o3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        oy oyVar = this.f38450c0;
        UndoView[] undoViewArr = oyVar.f37110v0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                oyVar.f37091r1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                oyVar.X4();
            }
        }
    }
}
