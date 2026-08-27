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

public final class u2 extends FrameLayout implements org.telegram.ui.Cells.i9 {

    public final p2 f43068a;

    public final s2 f43069b;

    public final t2 f43070c;
    public TL_iv.pageBlockSlideshow d;

    public f3 f43071e;

    public f3 f43072f;
    public final int h;

    public int f43073n;

    public int f43074r;

    public float f43075s;
    public int v;

    public final k4 f43076w;

    public final m4 f43077x;

    public u2(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.f43077x = m4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f43076w = k4Var;
        if (m4.f40331x1 == null) {
            Paint paint = new Paint(1);
            m4.f40331x1 = paint;
            paint.setColor(-1);
        }
        p2 p2Var = new p2(this, context);
        this.f43068a = p2Var;
        p2Var.b(new q2(this, 0));
        s2 s2Var = new s2(this);
        this.f43069b = s2Var;
        p2Var.setAdapter(s2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(p2Var, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        addView(p2Var);
        t2 t2Var = new t2(this, context);
        this.f43070c = t2Var;
        addView(t2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f43071e;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f43072f;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f43071e;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f43072f;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f43071e;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f43072f;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d == null) {
            return;
        }
        f3 f3Var = this.f43071e;
        m4 m4Var = this.f43077x;
        int i10 = this.h;
        int i11 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(i10, this.f43073n);
            m4.v(m4Var, canvas, this, 0);
            this.f43071e.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f43072f != null) {
            canvas.save();
            canvas.translate(i10, this.f43073n + this.f43074r);
            m4.v(m4Var, canvas, this, i11);
            this.f43072f.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f43071e != null) {
            sb2.append(", ");
            sb2.append(this.f43071e.d.getText());
        }
        if (this.f43072f != null) {
            sb2.append(", ");
            sb2.append(this.f43072f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iDp = AndroidUtilities.dp(8.0f);
        p2 p2Var = this.f43068a;
        p2Var.layout(0, iDp, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = p2Var.getBottom() - AndroidUtilities.dp(23.0f);
        t2 t2Var = this.f43070c;
        t2Var.layout(0, bottom, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int iDp2 = AndroidUtilities.dp(310.0f);
            this.f43068a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824));
            this.d.items.size();
            this.f43070c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int iDp3 = size - AndroidUtilities.dp(36.0f);
            int iDp4 = AndroidUtilities.dp(16.0f) + iDp2;
            this.f43073n = iDp4;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignmentA = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.f43077x;
            f3 f3VarP = m4.p(m4Var, this, null, richText, iDp3, iDp4, pageblockslideshow, alignmentA, 0, this.f43076w);
            this.f43071e = f3VarP;
            int i12 = this.h;
            if (f3VarP != null) {
                int height = this.f43071e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f43074r = height;
                iDp2 = org.telegram.messenger.y1.C(4.0f, height, iDp2);
                f3 f3Var = this.f43071e;
                f3Var.f37923s = i12;
                f3Var.v = this.f43073n;
            } else {
                this.f43074r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f43076w.C) {
                alignmentA = org.telegram.ui.Components.tv0.a();
            }
            f3 f3VarP2 = m4.p(m4Var, this, null, richText2, iDp3, 0, pageblockslideshow2, alignmentA, 0, this.f43076w);
            this.f43072f = f3VarP2;
            if (f3VarP2 != null) {
                iDp2 += this.f43072f.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.f43072f;
                f3Var2.f37923s = i12;
                f3Var2.v = this.f43073n + this.f43074r;
            }
            iDp = AndroidUtilities.dp(16.0f) + iDp2;
        } else {
            iDp = 1;
        }
        setMeasuredDimension(size, iDp);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f43071e;
        int i10 = this.h;
        int i11 = this.f43073n;
        m4 m4Var = this.f43077x;
        if (m4.l(m4Var, this.f43076w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return m4.l(m4Var, this.f43076w, motionEvent, this, this.f43072f, this.h, this.f43073n + this.f43074r) || super.onTouchEvent(motionEvent);
    }
}
