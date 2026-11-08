package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.vs0;
public final class v0 extends LinearLayout {
    public int f56835a;
    public final TextView f56836b;
    public final w70 f56837c;
    public LinearLayout d;
    public final l0 f56838e;
    public final ViewGroup f56839f;
    public boolean h;
    public final w0 f56840n;

    public v0(w0 w0Var, Context context, int i7) {
        super(context);
        int i10;
        i iVar;
        this.f56840n = w0Var;
        setOrientation(1);
        vs0 vs0Var = (vs0) w0Var.f56845k1.get(i7);
        int i11 = vs0Var.f50766a;
        if (i11 == 0) {
            ?? aVar = new a(context, w0Var.I0);
            aVar.f56522b.setOnScrollListener(new r0(w0Var, 1));
            iVar = aVar;
        } else if (i11 != 14 && i11 != 28) {
            if (i11 == 5) {
                iVar = new j1(context, w0Var.f28616a);
            } else if (i11 == 10) {
                iVar = new n0(context, w0Var.I0);
            } else {
                iVar = new t1(context, w0Var.f56852t1, w0Var.f28616a, vs0Var.f50766a, w0Var.I0);
            }
        } else {
            if (i11 == 28) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(i10, context, w0Var.I0);
            iVar2.f56522b.setOnScrollListener(new r0(w0Var, 0));
            iVar = iVar2;
        }
        this.f56839f = iVar;
        addView(iVar);
        this.f56838e = iVar;
        TextView textView = new TextView(context);
        this.f56836b = textView;
        textView.setGravity(1);
        int i12 = k6.f27960j5;
        k5.n(textView, i12, w0Var.I0, 1, 20.0f);
        addView(textView, ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        w70 w70Var = new w70(context, null);
        this.f56837c = w70Var;
        w70Var.setGravity(1);
        w70Var.setTextSize(1, 15.0f);
        r6.V(w70Var, i12, w0Var.I0);
        if (!w0Var.f56854v1) {
            w70Var.setLines(2);
        }
        addView(w70Var, ha.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f56839f) {
            boolean z9 = view instanceof a;
            if (z9) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(this.f56840n.C1);
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
        TextView textView = this.f56836b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f56839f;
        boolean z9 = viewGroup instanceof a;
        w0 w0Var = this.f56840n;
        if (z9) {
            ((a) viewGroup).setTopOffset(w0Var.C1);
        }
        viewGroup.getLayoutParams().height = w0Var.f56849q1;
        w70 w70Var = this.f56837c;
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
