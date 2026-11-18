package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.f3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k80;
import org.telegram.ui.ws0;
public final class y0 extends LinearLayout {
    public int f58949a;
    public final TextView f58950b;
    public final k80 f58951c;
    public LinearLayout d;
    public final o0 f58952e;
    public final ViewGroup f58953f;
    public boolean h;
    public final z0 f58954n;

    public y0(z0 z0Var, Context context, int i7) {
        super(context);
        int i10;
        i iVar;
        this.f58954n = z0Var;
        setOrientation(1);
        ws0 ws0Var = (ws0) z0Var.f58958o1.get(i7);
        int i11 = ws0Var.f53518a;
        if (i11 == 0) {
            ?? aVar = new a(context, z0Var.J0);
            aVar.f58595b.setOnScrollListener(new u0(z0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new n1(context, z0Var.f30189a);
            } else if (i11 == 10) {
                iVar = new q0(context, z0Var.J0);
            } else {
                iVar = new x1(context, z0Var.f58967x1, z0Var.f30189a, ws0Var.f53518a, z0Var.J0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, z0Var.J0);
            iVar2.f58595b.setOnScrollListener(new u0(z0Var, 0));
            iVar = iVar2;
        }
        this.f58953f = iVar;
        addView(iVar);
        this.f58952e = iVar;
        TextView textView = new TextView(context);
        this.f58950b = textView;
        textView.setGravity(1);
        int i12 = n6.f29504j5;
        f3.l(textView, i12, z0Var.J0, 1, 20.0f);
        addView(textView, ma.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        k80 k80Var = new k80(context, null);
        this.f58951c = k80Var;
        k80Var.setGravity(1);
        k80Var.setTextSize(1, 15.0f);
        u6.U(k80Var, i12, z0Var.J0);
        if (!z0Var.f58969z1) {
            k80Var.setLines(2);
        }
        addView(k80Var, ma.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f58953f) {
            boolean z10 = view instanceof a;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f58954n.G1);
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
        TextView textView = this.f58950b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f58953f;
        boolean z10 = viewGroup instanceof a;
        z0 z0Var = this.f58954n;
        if (z10) {
            ((a) viewGroup).setTopOffset(z0Var.G1);
        }
        viewGroup.getLayoutParams().height = z0Var.f58964u1;
        k80 k80Var = this.f58951c;
        k80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            k80Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
