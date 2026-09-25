package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class s2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final p70 f37573a;
    public final g4 f37574b;
    public b3 f37575c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f37576f;

    public s2(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f37573a = p70Var;
        this.f37574b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f37575c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f37575c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f32305s;
        this.f37573a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f37575c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f32305s;
        this.f37573a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f37575c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f32305s;
        this.f37573a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f37575c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f37575c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37576f != null && this.f37575c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.v(this.f37573a, canvas, this, 0);
            this.f37575c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f37575c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f37573a, this.f37574b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f37573a;
        p70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        p70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f37576f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            p70 p70Var2 = this.f37573a;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f37576f;
            g4 g4Var = this.f37574b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(p70Var2, this, null, richText, dp, 0, pageblocksubtitle2, alignment, 0, this.f37574b);
            this.f37575c = p5;
            if (p5 != null) {
                p70Var.getClass();
                i12 = this.f37575c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f37575c;
                b3Var.f32305s = this.d;
                b3Var.v = this.e;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f37573a, this.f37574b, motionEvent, this, this.f37575c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f37576f = pageblocksubtitle;
        requestLayout();
    }
}
