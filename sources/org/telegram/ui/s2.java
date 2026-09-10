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
public final class s2 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f36521a;
    public final h4 f36522b;
    public c3 f36523c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f36524f;

    public s2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f36521a = t70Var;
        this.f36522b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f36523c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f36523c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f31515s;
        this.f36521a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f36523c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f31515s;
        this.f36521a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f36523c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f31515s;
        this.f36521a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f36523c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f36523c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36524f != null && this.f36523c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f36521a, canvas, this, 0);
            this.f36523c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f36523c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVHeading, j4.j(this.f36521a, this.f36522b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f36521a;
        t70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        t70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f36524f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            t70 t70Var2 = this.f36521a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f36524f;
            h4 h4Var = this.f36522b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(t70Var2, this, null, richText, dp, 0, pageblocksubheader2, alignment, 0, this.f36522b);
            this.f36523c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight() + this.e;
                int i13 = this.e;
                i12 = height + i13;
                c3 c3Var = this.f36523c;
                c3Var.f31515s = this.d;
                c3Var.v = i13;
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
        if (!j4.l(this.f36521a, this.f36522b, motionEvent, this, this.f36523c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f36524f = pageblocksubheader;
        requestLayout();
    }
}
