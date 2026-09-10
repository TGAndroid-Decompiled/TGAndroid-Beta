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
public final class r2 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final m2 f36171a;
    public final p2 f36172b;
    public final q2 f36173c;
    public TL_iv.pageBlockSlideshow d;
    public c3 e;
    public c3 f36174f;
    public final int h;
    public int f36175n;
    public int f36176r;
    public float f36177s;
    public int v;
    public final h4 f36178w;
    public final j4 f36179x;

    public r2(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.f36179x = j4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f36178w = h4Var;
        if (j4.B1 == null) {
            Paint paint = new Paint(1);
            j4.B1 = paint;
            paint.setColor(-1);
        }
        m2 m2Var = new m2(this, context);
        this.f36171a = m2Var;
        m2Var.b(new n2(this, 0));
        p2 p2Var = new p2(this);
        this.f36172b = p2Var;
        m2Var.setAdapter(p2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(m2Var, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        addView(m2Var);
        q2 q2Var = new q2(this, context);
        this.f36173c = q2Var;
        addView(q2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.e;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.f36174f;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.e;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.f36174f;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.e;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.f36174f;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            c3 c3Var = this.e;
            j4 j4Var = this.f36179x;
            int i10 = this.h;
            int i11 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f36175n);
                j4.v(j4Var, canvas, this, 0);
                this.e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f36174f != null) {
                canvas.save();
                canvas.translate(i10, this.f36175n + this.f36176r);
                j4.v(j4Var, canvas, this, i11);
                this.f36174f.draw(canvas, this);
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
        if (this.f36174f != null) {
            sb2.append(", ");
            sb2.append(this.f36174f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        m2 m2Var = this.f36171a;
        m2Var.layout(0, dp, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = m2Var.getBottom() - AndroidUtilities.dp(23.0f);
        q2 q2Var = this.f36173c;
        q2Var.layout(0, bottom, q2Var.getMeasuredWidth(), q2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f36171a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f36173c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f36175n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = j4.f33876b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f36179x;
            c3 p5 = j4.p(j4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f36178w);
            this.e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f36176r = height;
                dp = org.telegram.messenger.a2.C(4.0f, height, dp);
                c3 c3Var = this.e;
                c3Var.f31515s = i13;
                c3Var.v = this.f36175n;
            } else {
                this.f36176r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f36178w.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            }
            c3 p10 = j4.p(j4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f36178w);
            this.f36174f = p10;
            if (p10 != null) {
                dp += this.f36174f.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = this.f36174f;
                c3Var2.f31515s = i13;
                c3Var2.v = this.f36175n + this.f36176r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.e;
        int i10 = this.h;
        int i11 = this.f36175n;
        j4 j4Var = this.f36179x;
        if (!j4.l(j4Var, this.f36178w, motionEvent, this, c3Var, i10, i11)) {
            if (!j4.l(j4Var, this.f36178w, motionEvent, this, this.f36174f, this.h, this.f36175n + this.f36176r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
