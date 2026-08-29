package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final p2 f43135a;
    public final s2 f43136b;
    public final t2 f43137c;
    public TL_iv.pageBlockSlideshow d;
    public f3 f43138e;
    public f3 f43139f;
    public final int h;
    public int f43140n;
    public int f43141r;
    public float f43142s;
    public int v;
    public final k4 f43143w;
    public final m4 f43144x;

    public u2(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.f43144x = m4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f43143w = k4Var;
        if (m4.f40388x1 == null) {
            Paint paint = new Paint(1);
            m4.f40388x1 = paint;
            paint.setColor(-1);
        }
        p2 p2Var = new p2(this, context);
        this.f43135a = p2Var;
        p2Var.b(new q2(this, 0));
        s2 s2Var = new s2(this);
        this.f43136b = s2Var;
        p2Var.setAdapter(s2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(p2Var, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        addView(p2Var);
        t2 t2Var = new t2(this, context);
        this.f43137c = t2Var;
        addView(t2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f43138e;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f43139f;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f43138e;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f43139f;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f43138e;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f43139f;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            f3 f3Var = this.f43138e;
            m4 m4Var = this.f43144x;
            int i10 = this.h;
            int i11 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f43140n);
                m4.v(m4Var, canvas, this, 0);
                this.f43138e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f43139f != null) {
                canvas.save();
                canvas.translate(i10, this.f43140n + this.f43141r);
                m4.v(m4Var, canvas, this, i11);
                this.f43139f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f43138e != null) {
            sb2.append(", ");
            sb2.append(this.f43138e.d.getText());
        }
        if (this.f43139f != null) {
            sb2.append(", ");
            sb2.append(this.f43139f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        p2 p2Var = this.f43135a;
        p2Var.layout(0, dp, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = p2Var.getBottom() - AndroidUtilities.dp(23.0f);
        t2 t2Var = this.f43137c;
        t2Var.layout(0, bottom, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f43135a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f43137c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f43140n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.f43144x;
            f3 p10 = m4.p(m4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f43143w);
            this.f43138e = p10;
            int i13 = this.h;
            if (p10 != null) {
                int height = this.f43138e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f43141r = height;
                dp = org.telegram.messenger.x3.C(4.0f, height, dp);
                f3 f3Var = this.f43138e;
                f3Var.f37974s = i13;
                f3Var.v = this.f43140n;
            } else {
                this.f43141r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f43143w.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            }
            f3 p11 = m4.p(m4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f43143w);
            this.f43139f = p11;
            if (p11 != null) {
                dp += this.f43139f.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.f43139f;
                f3Var2.f37974s = i13;
                f3Var2.v = this.f43140n + this.f43141r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f43138e;
        int i10 = this.h;
        int i11 = this.f43140n;
        m4 m4Var = this.f43144x;
        if (!m4.l(m4Var, this.f43143w, motionEvent, this, f3Var, i10, i11)) {
            if (!m4.l(m4Var, this.f43143w, motionEvent, this, this.f43139f, this.h, this.f43140n + this.f43141r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
