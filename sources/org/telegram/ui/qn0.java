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
public final class qn0 extends FrameLayout {
    public int D;
    public int E;
    public bn0 F;
    public vg.f G;
    public vg.f H;
    public boolean I;
    public final Path J;
    public int K;
    public final mb0 f40854a;
    public final s4.a0 f40855b;
    public final x7 f40856c;
    public int d;
    public final org.telegram.ui.Components.t5 e;
    public final ArrayList f40857f;
    public dn0 h;
    public final RectF f40858n;
    public final RectF f40859r;
    public final RectF f40860s;
    public final Paint f40861w;
    public final Paint f40862x;
    public int f40863y;

    public qn0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f40857f = new ArrayList();
        this.f40858n = new RectF();
        this.f40859r = new RectF();
        this.f40860s = new RectF();
        this.f40861w = new Paint(1);
        this.f40862x = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        mb0 mb0Var = new mb0(this, context, p6Var, 1);
        this.f40854a = mb0Var;
        mb0Var.setClipToPadding(false);
        mb0Var.setClipChildren(false);
        mb0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        mb0Var.setOverScrollMode(2);
        mb0Var.setHorizontalScrollBarEnabled(false);
        mb0Var.setItemAnimator(null);
        s4.a0 a0Var = new s4.a0(0, false);
        this.f40855b = a0Var;
        mb0Var.setLayoutManager(a0Var);
        x7 x7Var = new x7(this, 6);
        this.f40856c = x7Var;
        mb0Var.setAdapter(x7Var);
        mb0Var.setOnItemClickListener(new g(this, 20));
        addView(mb0Var, w7.b6.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.t5(mb0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
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
        ArrayList arrayList = this.f40857f;
        boolean isEmpty = arrayList.isEmpty();
        mb0 mb0Var = this.f40854a;
        if (!isEmpty) {
            int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
            if (z10) {
                mb0Var.y0(j10);
            } else {
                mb0Var.v0(j10);
            }
        }
        mb0Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f40855b.m(i10);
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
