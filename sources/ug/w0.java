package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ss0;
public final class w0 extends LinearLayout {
    public int f58352a;
    public final TextView f58353b;
    public final z70 f58354c;
    public LinearLayout d;
    public final m0 f58355e;
    public final ViewGroup f58356f;
    public boolean h;
    public final x0 f58357n;

    public w0(x0 x0Var, Context context, int i7) {
        super(context);
        int i10;
        i iVar;
        this.f58357n = x0Var;
        setOrientation(1);
        ss0 ss0Var = (ss0) x0Var.f58371o1.get(i7);
        int i11 = ss0Var.f51268a;
        if (i11 == 0) {
            ?? aVar = new a(context, x0Var.J0);
            aVar.f58030b.setOnScrollListener(new s0(x0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new k1(context, x0Var.f29679a);
            } else if (i11 == 10) {
                iVar = new o0(context, x0Var.J0);
            } else {
                iVar = new w1(context, x0Var.f58380x1, x0Var.f29679a, ss0Var.f51268a, x0Var.J0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, x0Var.J0);
            iVar2.f58030b.setOnScrollListener(new s0(x0Var, 0));
            iVar = iVar2;
        }
        this.f58356f = iVar;
        addView(iVar);
        this.f58355e = iVar;
        TextView textView = new TextView(context);
        this.f58353b = textView;
        textView.setGravity(1);
        int i12 = j6.f28957j5;
        k5.m(textView, i12, x0Var.J0, 1, 20.0f);
        addView(textView, ja.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        z70 z70Var = new z70(context, null);
        this.f58354c = z70Var;
        z70Var.setGravity(1);
        z70Var.setTextSize(1, 15.0f);
        q6.U(z70Var, i12, x0Var.J0);
        if (!x0Var.f58382z1) {
            z70Var.setLines(2);
        }
        addView(z70Var, ja.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f58356f) {
            boolean z10 = view instanceof a;
            if (z10) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f58357n.G1);
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
        TextView textView = this.f58353b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f58356f;
        boolean z10 = viewGroup instanceof a;
        x0 x0Var = this.f58357n;
        if (z10) {
            ((a) viewGroup).setTopOffset(x0Var.G1);
        }
        viewGroup.getLayoutParams().height = x0Var.f58377u1;
        z70 z70Var = this.f58354c;
        z70Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            textView.setVisibility(8);
            z70Var.setVisibility(8);
            super.onMeasure(i7, i10);
        }
    }
}
