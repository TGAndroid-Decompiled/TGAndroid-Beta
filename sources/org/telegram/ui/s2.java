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
public final class s2 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final n2 f41329a;
    public final q2 f41330b;
    public final r2 f41331c;
    public TL_iv.pageBlockSlideshow d;
    public d3 e;
    public d3 f41332f;
    public final int h;
    public int f41333n;
    public int f41334r;
    public float f41335s;
    public int v;
    public final j4 f41336w;
    public final l4 f41337x;

    public s2(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f41337x = l4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f41336w = j4Var;
        if (l4.B1 == null) {
            Paint paint = new Paint(1);
            l4.B1 = paint;
            paint.setColor(-1);
        }
        n2 n2Var = new n2(this, context);
        this.f41329a = n2Var;
        n2Var.b(new o2(this, 0));
        q2 q2Var = new q2(this);
        this.f41330b = q2Var;
        n2Var.setAdapter(q2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(n2Var, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
        addView(n2Var);
        r2 r2Var = new r2(this, context);
        this.f41331c = r2Var;
        addView(r2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.e;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f41332f;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.f41332f;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.f41332f;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            d3 d3Var = this.e;
            l4 l4Var = this.f41337x;
            int i10 = this.h;
            int i11 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f41333n);
                l4.v(l4Var, canvas, this, 0);
                this.e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f41332f != null) {
                canvas.save();
                canvas.translate(i10, this.f41333n + this.f41334r);
                l4.v(l4Var, canvas, this, i11);
                this.f41332f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.f41332f != null) {
            sb2.append(", ");
            sb2.append(this.f41332f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        n2 n2Var = this.f41329a;
        n2Var.layout(0, dp, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = n2Var.getBottom() - AndroidUtilities.dp(23.0f);
        r2 r2Var = this.f41331c;
        r2Var.layout(0, bottom, r2Var.getMeasuredWidth(), r2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f41329a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f41331c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f41333n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = l4.f38739b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f41337x;
            d3 p5 = l4.p(l4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f41336w);
            this.e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f41334r = height;
                dp = org.telegram.messenger.g0.C(4.0f, height, dp);
                d3 d3Var = this.e;
                d3Var.f36246s = i13;
                d3Var.v = this.f41333n;
            } else {
                this.f41334r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f41336w.G) {
                alignment = org.telegram.ui.Components.fx0.a();
            }
            d3 p9 = l4.p(l4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f41336w);
            this.f41332f = p9;
            if (p9 != null) {
                dp += this.f41332f.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.f41332f;
                d3Var2.f36246s = i13;
                d3Var2.v = this.f41333n + this.f41334r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.e;
        int i10 = this.h;
        int i11 = this.f41333n;
        l4 l4Var = this.f41337x;
        if (!l4.l(l4Var, this.f41336w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f41336w, motionEvent, this, this.f41332f, this.h, this.f41333n + this.f41334r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
