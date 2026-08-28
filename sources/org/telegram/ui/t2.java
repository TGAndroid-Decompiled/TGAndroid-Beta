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
public final class t2 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final o2 f42811a;
    public final r2 f42812b;
    public final s2 f42813c;
    public TL_iv.pageBlockSlideshow d;
    public e3 f42814e;
    public e3 f42815f;
    public final int h;
    public int f42816n;
    public int f42817r;
    public float f42818s;
    public int v;
    public final j4 f42819w;
    public final l4 f42820x;

    public t2(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f42820x = l4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f42819w = j4Var;
        if (l4.f40010x1 == null) {
            Paint paint = new Paint(1);
            l4.f40010x1 = paint;
            paint.setColor(-1);
        }
        o2 o2Var = new o2(this, context);
        this.f42811a = o2Var;
        o2Var.b(new p2(this, 0));
        r2 r2Var = new r2(this);
        this.f42812b = r2Var;
        o2Var.setAdapter(r2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(o2Var, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        addView(o2Var);
        s2 s2Var = new s2(this, context);
        this.f42813c = s2Var;
        addView(s2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f42814e;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.f42815f;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f42814e;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.f42815f;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f42814e;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.f42815f;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            e3 e3Var = this.f42814e;
            l4 l4Var = this.f42820x;
            int i9 = this.h;
            int i10 = 0;
            if (e3Var != null) {
                canvas.save();
                canvas.translate(i9, this.f42816n);
                l4.v(l4Var, canvas, this, 0);
                this.f42814e.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.f42815f != null) {
                canvas.save();
                canvas.translate(i9, this.f42816n + this.f42817r);
                l4.v(l4Var, canvas, this, i10);
                this.f42815f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f42814e != null) {
            sb2.append(", ");
            sb2.append(this.f42814e.d.getText());
        }
        if (this.f42815f != null) {
            sb2.append(", ");
            sb2.append(this.f42815f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(8.0f);
        o2 o2Var = this.f42811a;
        o2Var.layout(0, dp, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = o2Var.getBottom() - AndroidUtilities.dp(23.0f);
        s2 s2Var = this.f42813c;
        s2Var.layout(0, bottom, s2Var.getMeasuredWidth(), s2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f42811a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f42813c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f42816n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = l4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f42820x;
            e3 p6 = l4.p(l4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f42819w);
            this.f42814e = p6;
            int i12 = this.h;
            if (p6 != null) {
                int height = this.f42814e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f42817r = height;
                dp = org.telegram.messenger.l0.C(4.0f, height, dp);
                e3 e3Var = this.f42814e;
                e3Var.f37805s = i12;
                e3Var.v = this.f42816n;
            } else {
                this.f42817r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f42819w.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            }
            e3 p9 = l4.p(l4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f42819w);
            this.f42815f = p9;
            if (p9 != null) {
                dp += this.f42815f.d.getHeight() + AndroidUtilities.dp(4.0f);
                e3 e3Var2 = this.f42815f;
                e3Var2.f37805s = i12;
                e3Var2.v = this.f42816n + this.f42817r;
            }
            i11 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.f42814e;
        int i9 = this.h;
        int i10 = this.f42816n;
        l4 l4Var = this.f42820x;
        if (!l4.l(l4Var, this.f42819w, motionEvent, this, e3Var, i9, i10)) {
            if (!l4.l(l4Var, this.f42819w, motionEvent, this, this.f42815f, this.h, this.f42816n + this.f42817r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
