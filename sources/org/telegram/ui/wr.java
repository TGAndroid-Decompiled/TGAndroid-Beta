package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public abstract class wr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.su0 E;
    public static final org.telegram.ui.Components.su0 F;
    public static final org.telegram.ui.Components.su0 G;
    public static final org.telegram.ui.Components.su0 H;
    public Canvas A;
    public ValueAnimator B;
    public ValueAnimator C;
    public boolean D;

    public float f44172b;

    public float f44173c;
    public float d;

    public float f44174e;

    public o1.j f44175f;
    public o1.j h;

    public o1.j f44176n;

    public o1.j f44177r;

    public boolean f44178s;
    public float v;

    public float f44179w;

    public boolean f44180x;

    public Bitmap f44181y;

    static {
        org.telegram.ui.Components.su0 su0Var = new org.telegram.ui.Components.su0(new fr(1), new fr(2));
        su0Var.f32580c = 100.0f;
        E = su0Var;
        org.telegram.ui.Components.su0 su0Var2 = new org.telegram.ui.Components.su0(new fr(3), new fr(4));
        su0Var2.f32580c = 100.0f;
        F = su0Var2;
        org.telegram.ui.Components.su0 su0Var3 = new org.telegram.ui.Components.su0(new fr(5), new fr(6));
        su0Var3.f32580c = 100.0f;
        G = su0Var3;
        org.telegram.ui.Components.su0 su0Var4 = new org.telegram.ui.Components.su0(new fr(7), new fr(8));
        su0Var4.f32580c = 100.0f;
        H = su0Var4;
    }

    public static void k(o1.j jVar, float f10) {
        o1.k kVar = jVar.f19147u;
        if (kVar == null || f10 != ((float) kVar.f19154i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f10);
            kVar2.b(400.0f);
            kVar2.a(1.0f);
            kVar2.f19154i = f10;
            jVar.f19147u = kVar2;
            jVar.f();
        }
    }

    public float getErrorProgress() {
        return this.f44173c;
    }

    public float getFocusedProgress() {
        return this.f44172b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f44174e;
    }

    public final void i(float f10) {
        k(this.h, f10 * 100.0f);
    }

    public final void j(float f10) {
        k(this.f44175f, f10 * 100.0f);
    }

    public final void l(float f10) {
        k(this.f44176n, f10 * 100.0f);
        o1.j jVar = this.f44177r;
        jVar.c();
        if (f10 == 0.0f) {
            this.f44174e = 1.0f;
            return;
        }
        o1.k kVarK = org.telegram.ui.Cells.pa.k(1.0f, 500.0f, 0.75f);
        kVarK.f19154i = 100.0f;
        jVar.f19147u = kVarK;
        jVar.f19138b = 100.0f;
        jVar.f19139c = true;
        jVar.f19137a = 4000.0f;
        jVar.f();
    }

    public final void m() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.f44181y;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f44181y.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.f44181y;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f44181y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.A = new Canvas(this.f44181y);
        }
        this.f44181y.eraseColor(0);
        CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
        StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.A.save();
        this.A.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.A);
        this.A.restore();
        this.f44179w = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g3(this, 8));
        this.C.setDuration(220L);
        this.C.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44175f.c();
        this.h.c();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (isFocused()) {
            return;
        }
        hideActionMode();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.D = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ur urVar = getParent() instanceof ur ? (ur) getParent() : null;
            if (motionEvent.getAction() == 1 && this.D) {
                if (!isFocused() || urVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.e.f(getContext(), ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i10 = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    if (i10 > 0) {
                        startActionMode(new vr(this));
                    }
                }
                setSelection(0);
                if (this.f44178s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.D = false;
        }
        return this.D;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.f44178s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
