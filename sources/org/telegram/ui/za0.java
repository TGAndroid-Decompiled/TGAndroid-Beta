package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;
public class za0 extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.y f52593a;
    public final org.telegram.ui.Components.w70 f52594b;
    public int f52595c;
    public final xd0 d;

    public za0(xd0 xd0Var, Context context) {
        super(context);
        this.d = xd0Var;
        int i3 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i3, false)), 7, -1);
        this.f52593a = h02;
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70();
        this.f52594b = w70Var;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        this.f52595c = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        h02.setCallback(this);
        w70Var.D = true;
        w70Var.f39942u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28298ze));
    }

    public boolean b() {
        return true;
    }

    public final void c() {
        CharSequence text;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(0);
        n70Var.f36406q = org.telegram.messenger.g0.L(3.0f);
        n70Var.f36407r = org.telegram.messenger.g0.L(6.0f);
        int length = text.length();
        n70Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, n70Var);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(n70Var.f36408s, n70Var.f36410u, n70Var.f36409t, n70Var.v);
        this.f52593a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.w70 w70Var = this.f52594b;
        w70Var.f39945y = n70Var;
        w70Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.f28298ze);
        w70Var.g(org.telegram.ui.ActionBar.k6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.r1(6.0f, themedColor));
        w70Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        canvas.save();
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            paddingTop = getPaddingTop();
        }
        canvas.translate(getPaddingLeft(), paddingTop);
        this.f52593a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a10 = a();
        org.telegram.ui.Components.w70 w70Var = this.f52594b;
        if (!a10 && !w70Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        w70Var.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b10 = b();
        org.telegram.ui.Cells.y yVar = this.f52593a;
        if (b10 && motionEvent.getAction() == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842910, 16842919});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
            yVar.setState(new int[0]);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        c();
    }

    @Override
    public final void updateColors() {
        try {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false));
            org.telegram.ui.Cells.y yVar = this.f52593a;
            if (yVar != null && r12 != this.f52595c) {
                org.telegram.ui.ActionBar.k6.H1(yVar, r12, true);
            }
            this.f52595c = r12;
            org.telegram.ui.Components.w70 w70Var = this.f52594b;
            if (w70Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.f28298ze);
                w70Var.g(org.telegram.ui.ActionBar.k6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.r1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f52593a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
