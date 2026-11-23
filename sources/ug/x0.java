package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.f3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j80;
import org.telegram.ui.vs0;
public final class x0 extends LinearLayout {
    public int f59058a;
    public final TextView f59059b;
    public final j80 f59060c;
    public LinearLayout d;
    public final n0 f59061e;
    public final ViewGroup f59062f;
    public boolean h;
    public final y0 f59063n;

    public x0(y0 y0Var, Context context, int i7) {
        super(context);
        int i10;
        i iVar;
        this.f59063n = y0Var;
        setOrientation(1);
        vs0 vs0Var = (vs0) y0Var.f59079o1.get(i7);
        int i11 = vs0Var.f53023a;
        if (i11 == 0) {
            ?? aVar = new a(context, y0Var.J0);
            aVar.f58721b.setOnScrollListener(new t0(y0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new m1(context, y0Var.f30223a);
            } else if (i11 == 10) {
                iVar = new p0(context, y0Var.J0);
            } else {
                iVar = new x1(context, y0Var.f59088x1, y0Var.f30223a, vs0Var.f53023a, y0Var.J0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, y0Var.J0);
            iVar2.f58721b.setOnScrollListener(new t0(y0Var, 0));
            iVar = iVar2;
        }
        this.f59062f = iVar;
        addView(iVar);
        this.f59061e = iVar;
        TextView textView = new TextView(context);
        this.f59059b = textView;
        textView.setGravity(1);
        int i12 = n6.f29559j5;
        f3.l(textView, i12, y0Var.J0, 1, 20.0f);
        addView(textView, na.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        j80 j80Var = new j80(context, null);
        this.f59060c = j80Var;
        j80Var.setGravity(1);
        j80Var.setTextSize(1, 15.0f);
        u6.U(j80Var, i12, y0Var.J0);
        if (!y0Var.f59090z1) {
            j80Var.setLines(2);
        }
        addView(j80Var, na.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f59062f) {
            boolean z10 = view instanceof a;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f59063n.G1);
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
        TextView textView = this.f59059b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f59062f;
        boolean z10 = viewGroup instanceof a;
        y0 y0Var = this.f59063n;
        if (z10) {
            ((a) viewGroup).setTopOffset(y0Var.G1);
        }
        viewGroup.getLayoutParams().height = y0Var.f59085u1;
        j80 j80Var = this.f59060c;
        j80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            j80Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
