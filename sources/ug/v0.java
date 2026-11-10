package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ys0;
public final class v0 extends LinearLayout {
    public int f56847a;
    public final TextView f56848b;
    public final w70 f56849c;
    public LinearLayout d;
    public final l0 f56850e;
    public final ViewGroup f56851f;
    public boolean h;
    public final w0 f56852n;

    public v0(w0 w0Var, Context context, int i7) {
        super(context);
        int i10;
        i iVar;
        this.f56852n = w0Var;
        setOrientation(1);
        ys0 ys0Var = (ys0) w0Var.n1.get(i7);
        int i11 = ys0Var.f52109a;
        if (i11 == 0) {
            ?? aVar = new a(context, w0Var.I0);
            aVar.f56534b.setOnScrollListener(new r0(w0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new j1(context, w0Var.f28669a);
            } else if (i11 == 10) {
                iVar = new n0(context, w0Var.I0);
            } else {
                iVar = new t1(context, w0Var.f56864w1, w0Var.f28669a, ys0Var.f52109a, w0Var.I0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, w0Var.I0);
            iVar2.f56534b.setOnScrollListener(new r0(w0Var, 0));
            iVar = iVar2;
        }
        this.f56851f = iVar;
        addView(iVar);
        this.f56850e = iVar;
        TextView textView = new TextView(context);
        this.f56848b = textView;
        textView.setGravity(1);
        int i12 = m6.f27998j5;
        k5.n(textView, i12, w0Var.I0, 1, 20.0f);
        addView(textView, ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        w70 w70Var = new w70(context, null);
        this.f56849c = w70Var;
        w70Var.setGravity(1);
        w70Var.setTextSize(1, 15.0f);
        t6.U(w70Var, i12, w0Var.I0);
        if (!w0Var.f56866y1) {
            w70Var.setLines(2);
        }
        addView(w70Var, ha.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f56851f) {
            boolean z9 = view instanceof a;
            if (z9) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f56852n.F1);
            }
            if (z9) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView = this.f56848b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f56851f;
        boolean z9 = viewGroup instanceof a;
        w0 w0Var = this.f56852n;
        if (z9) {
            ((a) viewGroup).setTopOffset(w0Var.F1);
        }
        viewGroup.getLayoutParams().height = w0Var.f56861t1;
        w70 w70Var = this.f56849c;
        w70Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            w70Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
