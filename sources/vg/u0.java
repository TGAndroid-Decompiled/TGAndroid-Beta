package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.ls0;
public final class u0 extends LinearLayout {
    public int f56865a;
    public final TextView f56866b;
    public final s70 f56867c;
    public LinearLayout d;
    public final k0 f56868e;
    public final ViewGroup f56869f;
    public boolean h;
    public final v0 f56870n;

    public u0(v0 v0Var, Context context, int i3) {
        super(context);
        int i10;
        i iVar;
        this.f56870n = v0Var;
        setOrientation(1);
        ls0 ls0Var = (ls0) v0Var.f56875l1.get(i3);
        int i11 = ls0Var.f47430a;
        if (i11 == 0) {
            ?? aVar = new a(context, v0Var.J0);
            aVar.f56568b.setOnScrollListener(new q0(v0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new m1(context, v0Var.f28583a);
            } else if (i11 == 10) {
                iVar = new m0(context, v0Var.J0);
            } else {
                iVar = new w1(context, v0Var.f56883u1, v0Var.f28583a, ls0Var.f47430a, v0Var.J0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, v0Var.J0);
            iVar2.f56568b.setOnScrollListener(new q0(v0Var, 0));
            iVar = iVar2;
        }
        this.f56869f = iVar;
        addView(iVar);
        this.f56868e = iVar;
        TextView textView = new TextView(context);
        this.f56866b = textView;
        textView.setGravity(1);
        int i12 = k6.f27988j5;
        k5.n(textView, i12, v0Var.J0, 1, 20.0f);
        addView(textView, mf.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        s70 s70Var = new s70(context, null);
        this.f56867c = s70Var;
        s70Var.setGravity(1);
        s70Var.setTextSize(1, 15.0f);
        r6.V(s70Var, i12, v0Var.J0);
        if (!v0Var.f56885w1) {
            s70Var.setLines(2);
        }
        addView(s70Var, mf.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f56869f) {
            boolean z10 = view instanceof a;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f56870n.D1);
            }
            if (z10) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TextView textView = this.f56866b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f56869f;
        boolean z10 = viewGroup instanceof a;
        v0 v0Var = this.f56870n;
        if (z10) {
            ((a) viewGroup).setTopOffset(v0Var.D1);
        }
        viewGroup.getLayoutParams().height = v0Var.f56880r1;
        s70 s70Var = this.f56867c;
        s70Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i3, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            s70Var.setVisibility(8);
            super.onMeasure(i3, i10);
        }
    }
}
