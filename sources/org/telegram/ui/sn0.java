package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class sn0 extends FrameLayout {
    public int D;
    public int E;
    public dn0 F;
    public vg.f G;
    public vg.f H;
    public boolean I;
    public final Path J;
    public int K;
    public final nb0 f41609a;
    public final s4.a0 f41610b;
    public final x7 f41611c;
    public int d;
    public final org.telegram.ui.Components.t5 e;
    public final ArrayList f41612f;
    public fn0 h;
    public final RectF f41613n;
    public final RectF f41614r;
    public final RectF f41615s;
    public final Paint f41616w;
    public final Paint f41617x;
    public int f41618y;

    public sn0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f41612f = new ArrayList();
        this.f41613n = new RectF();
        this.f41614r = new RectF();
        this.f41615s = new RectF();
        this.f41616w = new Paint(1);
        this.f41617x = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        nb0 nb0Var = new nb0(this, context, p6Var, 1);
        this.f41609a = nb0Var;
        nb0Var.setClipToPadding(false);
        nb0Var.setClipChildren(false);
        nb0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        nb0Var.setOverScrollMode(2);
        nb0Var.setHorizontalScrollBarEnabled(false);
        nb0Var.setItemAnimator(null);
        s4.a0 a0Var = new s4.a0(0, false);
        this.f41610b = a0Var;
        nb0Var.setLayoutManager(a0Var);
        x7 x7Var = new x7(this, 6);
        this.f41611c = x7Var;
        nb0Var.setAdapter(x7Var);
        nb0Var.setOnItemClickListener(new g(this, 20));
        addView(nb0Var, w7.b6.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.t5(nb0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.e(true, i10);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f41612f;
        boolean isEmpty = arrayList.isEmpty();
        nb0 nb0Var = this.f41609a;
        if (!isEmpty) {
            int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
            if (z10) {
                nb0Var.y0(j10);
            } else {
                nb0Var.v0(j10);
            }
        }
        nb0Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f41610b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.D;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vg.f fVar;
        rf.o.g(this.G, 0, 0, getWidth(), getHeight());
        rf.o.g(this.H, 0, 0, getWidth(), getHeight());
        if (this.I) {
            fVar = this.H;
        } else {
            fVar = this.G;
        }
        fVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = L;
        path.addRoundRect(f7, f7, i10 - L, i11 - L, org.telegram.messenger.i0.L(18.0f) - L, org.telegram.messenger.i0.L(18.0f) - L, Path.Direction.CW);
    }
}
