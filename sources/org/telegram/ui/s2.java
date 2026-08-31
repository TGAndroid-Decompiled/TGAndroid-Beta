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
public final class s2 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final n2 f41107a;
    public final q2 f41108b;
    public final r2 f41109c;
    public TL_iv.pageBlockSlideshow d;
    public d3 f41110e;
    public d3 f41111f;
    public final int h;
    public int f41112n;
    public int f41113r;
    public float f41114s;
    public int v;
    public final j4 f41115w;
    public final l4 f41116x;

    public s2(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f41116x = l4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f41115w = j4Var;
        if (l4.f38602y1 == null) {
            Paint paint = new Paint(1);
            l4.f38602y1 = paint;
            paint.setColor(-1);
        }
        n2 n2Var = new n2(this, context);
        this.f41107a = n2Var;
        n2Var.b(new o2(this, 0));
        q2 q2Var = new q2(this);
        this.f41108b = q2Var;
        n2Var.setAdapter(q2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(n2Var, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        addView(n2Var);
        r2 r2Var = new r2(this, context);
        this.f41109c = r2Var;
        addView(r2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f41110e;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f41111f;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f41110e;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.f41111f;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f41110e;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.f41111f;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            d3 d3Var = this.f41110e;
            l4 l4Var = this.f41116x;
            int i10 = this.h;
            int i11 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f41112n);
                l4.v(l4Var, canvas, this, 0);
                this.f41110e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f41111f != null) {
                canvas.save();
                canvas.translate(i10, this.f41112n + this.f41113r);
                l4.v(l4Var, canvas, this, i11);
                this.f41111f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f41110e != null) {
            sb.append(", ");
            sb.append(this.f41110e.d.getText());
        }
        if (this.f41111f != null) {
            sb.append(", ");
            sb.append(this.f41111f.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        n2 n2Var = this.f41107a;
        n2Var.layout(0, dp, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = n2Var.getBottom() - AndroidUtilities.dp(23.0f);
        r2 r2Var = this.f41109c;
        r2Var.layout(0, bottom, r2Var.getMeasuredWidth(), r2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f41107a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f41109c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f41112n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = l4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f41116x;
            d3 p10 = l4.p(l4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f41115w);
            this.f41110e = p10;
            int i13 = this.h;
            if (p10 != null) {
                int height = this.f41110e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f41113r = height;
                dp = org.telegram.messenger.y3.C(4.0f, height, dp);
                d3 d3Var = this.f41110e;
                d3Var.f35986s = i13;
                d3Var.v = this.f41112n;
            } else {
                this.f41113r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f41115w.D) {
                alignment = org.telegram.ui.Components.lw0.a();
            }
            d3 p11 = l4.p(l4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f41115w);
            this.f41111f = p11;
            if (p11 != null) {
                dp += this.f41111f.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.f41111f;
                d3Var2.f35986s = i13;
                d3Var2.v = this.f41112n + this.f41113r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f41110e;
        int i10 = this.h;
        int i11 = this.f41112n;
        l4 l4Var = this.f41116x;
        if (!l4.l(l4Var, this.f41115w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f41115w, motionEvent, this, this.f41111f, this.h, this.f41112n + this.f41113r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
