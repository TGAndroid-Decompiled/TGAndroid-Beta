package tg;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import g.y;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.hd1;
import org.telegram.ui.mf0;
import org.telegram.ui.of0;
import org.telegram.ui.pf0;
public final class h {
    public final RenderNode f48746a;
    public final mf0 f48747b;
    public final y f48748c = new Object();
    public long d = 0;
    public int e;
    public int f48749f;

    public h(RenderNode renderNode, mf0 mf0Var) {
        this.f48746a = renderNode;
        this.f48747b = mf0Var;
    }

    public final void a() {
        long j10;
        boolean z10;
        hi.f B;
        int width = this.f48746a.getWidth();
        int height = this.f48746a.getHeight();
        y yVar = this.f48748c;
        yVar.f7257a = 0L;
        yVar.f7258b = false;
        pf0 pf0Var = this.f48747b.f39698a;
        int themedColor = pf0Var.getThemedColor(t6.f20929d6);
        RectF rectF = pf0Var.T;
        yVar.a(themedColor);
        yVar.b(tz.f());
        SparseArray sparseArray = pf0Var.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            k2 k2Var = ((hd1) sparseArray.valueAt(i10)).f37897a;
            View view = k2Var.fragmentView;
            if (view != null && zg.h.c(view, pf0Var.f38498b, rectF) && rectF.right > 0.0f && rectF.left < pf0Var.fragmentView.getMeasuredWidth() && (k2Var instanceof of0) && ((of0) k2Var).B() != null) {
                yVar.c(rectF.left);
                yVar.c(rectF.top);
                yVar.a(k2Var.getClassGuid());
            }
        }
        if (yVar.f7258b) {
            j10 = -1;
        } else {
            j10 = yVar.f7257a;
        }
        if (this.f48746a.hasDisplayList() && width == this.e && height == this.f48749f && j10 == this.d && j10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.e = width;
        this.f48749f = height;
        this.d = j10;
        if (z10) {
            RecordingCanvas beginRecording = this.f48746a.beginRecording();
            View view2 = pf0Var.fragmentView;
            SparseArray sparseArray2 = pf0Var.f38497a;
            RectF rectF2 = pf0Var.T;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = pf0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(pf0Var.getThemedColor(t6.f20929d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                k2 k2Var2 = ((hd1) sparseArray2.valueAt(i11)).f37897a;
                View view3 = k2Var2.fragmentView;
                if (view3 != null && zg.h.c(view3, pf0Var.f38498b, rectF2) && rectF2.right > 0.0f && rectF2.left < pf0Var.fragmentView.getMeasuredWidth() && (k2Var2 instanceof of0) && (B = ((of0) k2Var2).B()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    B.e(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.f48746a.endRecording();
        }
    }
}
