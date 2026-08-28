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
public abstract class vr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.pu0 E;
    public static final org.telegram.ui.Components.pu0 F;
    public static final org.telegram.ui.Components.pu0 G;
    public static final org.telegram.ui.Components.pu0 H;
    public Canvas A;
    public ValueAnimator B;
    public ValueAnimator C;
    public boolean D;
    public float f43565b;
    public float f43566c;
    public float d;
    public float f43567e;
    public o1.j f43568f;
    public o1.j h;
    public o1.j f43569n;
    public o1.j f43570r;
    public boolean f43571s;
    public float v;
    public float f43572w;
    public boolean f43573x;
    public Bitmap f43574y;

    static {
        org.telegram.ui.Components.pu0 pu0Var = new org.telegram.ui.Components.pu0(new mg.b(26), new mg.b(27));
        pu0Var.f31764c = 100.0f;
        E = pu0Var;
        org.telegram.ui.Components.pu0 pu0Var2 = new org.telegram.ui.Components.pu0(new mg.b(28), new mg.b(29));
        pu0Var2.f31764c = 100.0f;
        F = pu0Var2;
        org.telegram.ui.Components.pu0 pu0Var3 = new org.telegram.ui.Components.pu0(new tr(0), new tr(1));
        pu0Var3.f31764c = 100.0f;
        G = pu0Var3;
        org.telegram.ui.Components.pu0 pu0Var4 = new org.telegram.ui.Components.pu0(new tr(2), new tr(3));
        pu0Var4.f31764c = 100.0f;
        H = pu0Var4;
    }

    public static void k(o1.j jVar, float f10) {
        o1.k kVar = jVar.f18800u;
        if (kVar != null && f10 == ((float) kVar.f18807i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f10);
        kVar2.b(400.0f);
        kVar2.a(1.0f);
        kVar2.f18807i = f10;
        jVar.f18800u = kVar2;
        jVar.f();
    }

    public float getErrorProgress() {
        return this.f43566c;
    }

    public float getFocusedProgress() {
        return this.f43565b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f43567e;
    }

    public final void i(float f10) {
        k(this.h, f10 * 100.0f);
    }

    public final void j(float f10) {
        k(this.f43568f, f10 * 100.0f);
    }

    public final void l(float f10) {
        k(this.f43569n, f10 * 100.0f);
        o1.j jVar = this.f43570r;
        jVar.c();
        if (f10 != 0.0f) {
            o1.k i9 = org.telegram.ui.Cells.j2.i(1.0f, 500.0f, 0.75f);
            i9.f18807i = 100.0f;
            jVar.f18800u = i9;
            jVar.f18791b = 100.0f;
            jVar.f18792c = true;
            jVar.f18790a = 4000.0f;
            jVar.f();
            return;
        }
        this.f43567e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f43574y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f43574y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f43574y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f43574y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.A = new Canvas(this.f43574y);
            }
            this.f43574y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.A.save();
            this.A.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.A);
            this.A.restore();
            this.f43572w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 8));
            this.C.setDuration(220L);
            this.C.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43568f.c();
        this.h.c();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i9, Rect rect) {
        super.onFocusChanged(z10, i9, rect);
        if (!isFocused()) {
            hideActionMode();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sr srVar;
        ClipDescription primaryClipDescription;
        String str;
        int i9;
        if (motionEvent.getAction() == 0) {
            this.D = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof sr) {
                srVar = (sr) getParent();
            } else {
                srVar = null;
            }
            if (motionEvent.getAction() == 1 && this.D) {
                if (isFocused() && srVar != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.e.f(getContext(), ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    if (itemAt != null && itemAt.getText() != null) {
                        str = itemAt.getText().toString();
                    } else {
                        str = "";
                    }
                    try {
                        i9 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i9 = -1;
                    }
                    if (i9 > 0) {
                        startActionMode(new ur(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f43571s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.D = false;
        }
        return this.D;
    }

    @Override
    public final boolean requestFocus(int i9, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i9, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.f43571s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
