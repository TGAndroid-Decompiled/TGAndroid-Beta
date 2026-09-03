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
public final class u2 extends FrameLayout implements org.telegram.ui.Cells.k9 {
    public final p2 f38663a;
    public final s2 f38664b;
    public final t2 f38665c;
    public TL_iv.pageBlockSlideshow d;
    public f3 e;
    public f3 f38666f;
    public final int h;
    public int f38667n;
    public int f38668r;
    public float f38669s;
    public int v;
    public final l4 f38670w;
    public final n4 f38671x;

    public u2(n4 n4Var, Context context, l4 l4Var) {
        super(context);
        this.f38671x = n4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f38670w = l4Var;
        if (n4.f36358y1 == null) {
            Paint paint = new Paint(1);
            n4.f36358y1 = paint;
            paint.setColor(-1);
        }
        p2 p2Var = new p2(this, context);
        this.f38663a = p2Var;
        p2Var.b(new q2(this, 0));
        s2 s2Var = new s2(this);
        this.f38664b = s2Var;
        p2Var.setAdapter(s2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(p2Var, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        addView(p2Var);
        t2 t2Var = new t2(this, context);
        this.f38665c = t2Var;
        addView(t2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.e;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f38666f;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.e;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f38666f;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.e;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f38666f;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            f3 f3Var = this.e;
            n4 n4Var = this.f38671x;
            int i10 = this.h;
            int i11 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f38667n);
                n4.v(n4Var, canvas, this, 0);
                this.e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f38666f != null) {
                canvas.save();
                canvas.translate(i10, this.f38667n + this.f38668r);
                n4.v(n4Var, canvas, this, i11);
                this.f38666f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.e != null) {
            sb.append(", ");
            sb.append(this.e.d.getText());
        }
        if (this.f38666f != null) {
            sb.append(", ");
            sb.append(this.f38666f.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        p2 p2Var = this.f38663a;
        p2Var.layout(0, dp, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = p2Var.getBottom() - AndroidUtilities.dp(23.0f);
        t2 t2Var = this.f38665c;
        t2Var.layout(0, bottom, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f38663a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f38665c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f38667n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = n4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            n4 n4Var = this.f38671x;
            f3 p10 = n4.p(n4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f38670w);
            this.e = p10;
            int i13 = this.h;
            if (p10 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f38668r = height;
                dp = org.telegram.messenger.y3.C(4.0f, height, dp);
                f3 f3Var = this.e;
                f3Var.f33933s = i13;
                f3Var.v = this.f38667n;
            } else {
                this.f38668r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f38670w.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            f3 p11 = n4.p(n4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f38670w);
            this.f38666f = p11;
            if (p11 != null) {
                dp += this.f38666f.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.f38666f;
                f3Var2.f33933s = i13;
                f3Var2.v = this.f38667n + this.f38668r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.e;
        int i10 = this.h;
        int i11 = this.f38667n;
        n4 n4Var = this.f38671x;
        if (!n4.l(n4Var, this.f38670w, motionEvent, this, f3Var, i10, i11)) {
            if (!n4.l(n4Var, this.f38670w, motionEvent, this, this.f38666f, this.h, this.f38667n + this.f38668r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
