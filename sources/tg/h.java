package tg;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import b2.u;
import g.y;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.fd1;
import org.telegram.ui.nf0;
import org.telegram.ui.of0;
public final class h {
    public final RenderNode f48760a;
    public final u f48761b;
    public final y f48762c = new Object();
    public long d = 0;
    public int e;
    public int f48763f;

    public h(RenderNode renderNode, u uVar) {
        this.f48760a = renderNode;
        this.f48761b = uVar;
    }

    public final void a() {
        long j10;
        boolean z10;
        hi.f C;
        hi.f C2;
        int width = this.f48760a.getWidth();
        int height = this.f48760a.getHeight();
        y yVar = this.f48762c;
        yVar.f7258a = 0L;
        yVar.f7259b = false;
        u uVar = this.f48761b;
        boolean z11 = uVar.f2300b;
        of0 of0Var = (of0) uVar.f2301c;
        int themedColor = of0Var.getThemedColor(t6.f20930d6);
        RectF rectF = of0Var.U;
        yVar.a(themedColor);
        yVar.b(uz.f());
        SparseArray sparseArray = of0Var.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            k2 k2Var = ((fd1) sparseArray.valueAt(i10)).f37108a;
            View view = k2Var.fragmentView;
            if (view != null && zg.h.c(view, of0Var.f37788b, rectF) && rectF.right > 0.0f && rectF.left < of0Var.fragmentView.getMeasuredWidth() && (k2Var instanceof nf0)) {
                nf0 nf0Var = (nf0) k2Var;
                if (z11) {
                    C2 = nf0Var.k();
                } else {
                    C2 = nf0Var.C();
                }
                if (C2 != null) {
                    yVar.c(rectF.left);
                    yVar.c(rectF.top);
                    yVar.a(k2Var.getClassGuid());
                }
            }
        }
        if (yVar.f7259b) {
            j10 = -1;
        } else {
            j10 = yVar.f7258a;
        }
        if (this.f48760a.hasDisplayList() && width == this.e && height == this.f48763f && j10 == this.d && j10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.e = width;
        this.f48763f = height;
        this.d = j10;
        if (z10) {
            RecordingCanvas beginRecording = this.f48760a.beginRecording();
            View view2 = of0Var.fragmentView;
            SparseArray sparseArray2 = of0Var.f37787a;
            RectF rectF2 = of0Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = of0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(of0Var.getThemedColor(t6.f20930d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                k2 k2Var2 = ((fd1) sparseArray2.valueAt(i11)).f37108a;
                View view3 = k2Var2.fragmentView;
                if (view3 != null && zg.h.c(view3, of0Var.f37788b, rectF2) && rectF2.right > 0.0f && rectF2.left < of0Var.fragmentView.getMeasuredWidth() && (k2Var2 instanceof nf0)) {
                    nf0 nf0Var2 = (nf0) k2Var2;
                    if (z11) {
                        C = nf0Var2.k();
                    } else {
                        C = nf0Var2.C();
                    }
                    hi.f fVar = C;
                    if (fVar != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        fVar.e(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        beginRecording.restore();
                    }
                }
            }
            this.f48760a.endRecording();
        }
    }
}
