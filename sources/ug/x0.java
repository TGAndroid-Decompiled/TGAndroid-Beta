package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.f3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.xs0;
public final class x0 extends LinearLayout {
    public int f58952a;
    public final TextView f58953b;
    public final m80 f58954c;
    public LinearLayout d;
    public final n0 f58955e;
    public final ViewGroup f58956f;
    public boolean h;
    public final y0 f58957n;

    public x0(y0 y0Var, Context context, int i7) {
        super(context);
        int i10;
        i iVar;
        this.f58957n = y0Var;
        setOrientation(1);
        xs0 xs0Var = (xs0) y0Var.f58962o1.get(i7);
        int i11 = xs0Var.f53918a;
        if (i11 == 0) {
            ?? aVar = new a(context, y0Var.J0);
            aVar.f58606b.setOnScrollListener(new t0(y0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new m1(context, y0Var.f30139a);
            } else if (i11 == 10) {
                iVar = new p0(context, y0Var.J0);
            } else {
                iVar = new w1(context, y0Var.f58971x1, y0Var.f30139a, xs0Var.f53918a, y0Var.J0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, y0Var.J0);
            iVar2.f58606b.setOnScrollListener(new t0(y0Var, 0));
            iVar = iVar2;
        }
        this.f58956f = iVar;
        addView(iVar);
        this.f58955e = iVar;
        TextView textView = new TextView(context);
        this.f58953b = textView;
        textView.setGravity(1);
        int i12 = m6.f29455j5;
        f3.l(textView, i12, y0Var.J0, 1, 20.0f);
        addView(textView, na.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        m80 m80Var = new m80(context, null);
        this.f58954c = m80Var;
        m80Var.setGravity(1);
        m80Var.setTextSize(1, 15.0f);
        t6.U(m80Var, i12, y0Var.J0);
        if (!y0Var.f58973z1) {
            m80Var.setLines(2);
        }
        addView(m80Var, na.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f58956f) {
            boolean z10 = view instanceof a;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f58957n.G1);
            }
            if (z10) {
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
        TextView textView = this.f58953b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f58956f;
        boolean z10 = viewGroup instanceof a;
        y0 y0Var = this.f58957n;
        if (z10) {
            ((a) viewGroup).setTopOffset(y0Var.G1);
        }
        viewGroup.getLayoutParams().height = y0Var.f58968u1;
        m80 m80Var = this.f58954c;
        m80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            m80Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
