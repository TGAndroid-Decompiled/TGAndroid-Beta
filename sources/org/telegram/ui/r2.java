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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class r2 extends FrameLayout implements org.telegram.ui.Cells.n9, org.telegram.ui.ActionBar.b6 {
    public int f40968a;
    public final m2 f40969b;
    public final p2 f40970c;
    public final q2 d;
    public TL_iv.pageBlockSlideshow e;
    public c3 f40971f;
    public c3 h;
    public final int f40972n;
    public int f40973r;
    public int f40974s;
    public float v;
    public int f40975w;
    public final i4 f40976x;
    public final k4 f40977y;

    public r2(k4 k4Var, Context context, i4 i4Var) {
        super(context);
        this.f40977y = k4Var;
        this.f40972n = AndroidUtilities.dp(18.0f);
        this.f40976x = i4Var;
        if (k4.C1 == null) {
            Paint paint = new Paint(1);
            k4.C1 = paint;
            paint.setColor(-1);
        }
        m2 m2Var = new m2(this, context);
        this.f40969b = m2Var;
        m2Var.b(new n2(this, 0));
        p2 p2Var = new p2(this);
        this.f40970c = p2Var;
        m2Var.setAdapter(p2Var);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false);
        this.f40968a = x02;
        AndroidUtilities.setViewPagerEdgeEffectColor(m2Var, x02);
        addView(m2Var);
        q2 q2Var = new q2(this, context);
        this.d = q2Var;
        addView(q2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f40971f;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.h;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f40971f;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.h;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f40971f;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.h;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            c3 c3Var = this.f40971f;
            k4 k4Var = this.f40977y;
            int i10 = this.f40972n;
            int i11 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f40973r);
                k4.v(k4Var, canvas, this, 0);
                this.f40971f.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i10, this.f40973r + this.f40974s);
                k4.v(k4Var, canvas, this, i11);
                this.h.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f40971f != null) {
            sb2.append(", ");
            sb2.append(this.f40971f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        m2 m2Var = this.f40969b;
        m2Var.layout(0, dp, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = m2Var.getBottom() - AndroidUtilities.dp(23.0f);
        q2 q2Var = this.d;
        q2Var.layout(0, bottom, q2Var.getMeasuredWidth(), q2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.e != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f40969b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f40973r = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = k4.f38761c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            k4 k4Var = this.f40977y;
            c3 p5 = k4.p(k4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f40976x);
            this.f40971f = p5;
            int i13 = this.f40972n;
            if (p5 != null) {
                int height = this.f40971f.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f40974s = height;
                dp = org.telegram.messenger.v0.C(4.0f, height, dp);
                c3 c3Var = this.f40971f;
                c3Var.f36233s = i13;
                c3Var.v = this.f40973r;
            } else {
                this.f40974s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f40976x.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            }
            c3 p9 = k4.p(k4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f40976x);
            this.h = p9;
            if (p9 != null) {
                dp += this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = this.h;
                c3Var2.f36233s = i13;
                c3Var2.v = this.f40973r + this.f40974s;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.f40971f;
        int i10 = this.f40972n;
        int i11 = this.f40973r;
        k4 k4Var = this.f40977y;
        if (!k4.l(k4Var, this.f40976x, motionEvent, this, c3Var, i10, i11)) {
            if (!k4.l(k4Var, this.f40976x, motionEvent, this, this.h, this.f40972n, this.f40973r + this.f40974s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        m2 m2Var = this.f40969b;
        if (m2Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false);
                if (x02 != this.f40968a) {
                    this.f40968a = x02;
                    AndroidUtilities.setViewPagerEdgeEffectColor(m2Var, x02);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
