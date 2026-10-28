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
public abstract class zr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.qw0 I;
    public static final org.telegram.ui.Components.qw0 J;
    public static final org.telegram.ui.Components.qw0 K;
    public static final org.telegram.ui.Components.qw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f46341b;
    public float f46342c;
    public float d;
    public float e;
    public o1.j f46343f;
    public o1.j h;
    public o1.j f46344n;
    public o1.j f46345r;
    public boolean f46346s;
    public float v;
    public float f46347w;
    public boolean f46348x;
    public Bitmap f46349y;

    static {
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(new cg(4), new cg(5));
        qw0Var.f32059c = 100.0f;
        I = qw0Var;
        org.telegram.ui.Components.qw0 qw0Var2 = new org.telegram.ui.Components.qw0(new cg(6), new cg(7));
        qw0Var2.f32059c = 100.0f;
        J = qw0Var2;
        org.telegram.ui.Components.qw0 qw0Var3 = new org.telegram.ui.Components.qw0(new cg(8), new cg(9));
        qw0Var3.f32059c = 100.0f;
        K = qw0Var3;
        org.telegram.ui.Components.qw0 qw0Var4 = new org.telegram.ui.Components.qw0(new cg(10), new cg(11));
        qw0Var4.f32059c = 100.0f;
        L = qw0Var4;
    }

    public static void k(o1.j jVar, float f7) {
        o1.k kVar = jVar.f18968u;
        if (kVar != null && f7 == ((float) kVar.f18974i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f7);
        kVar2.b(400.0f);
        kVar2.a(1.0f);
        kVar2.f18974i = f7;
        jVar.f18968u = kVar2;
        jVar.h();
    }

    public float getErrorProgress() {
        return this.f46342c;
    }

    public float getFocusedProgress() {
        return this.f46341b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.e;
    }

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f46343f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f46344n, f7 * 100.0f);
        o1.j jVar = this.f46345r;
        jVar.c();
        if (f7 != 0.0f) {
            o1.k l4 = d3.l(1.0f, 500.0f, 0.75f);
            l4.f18974i = 100.0f;
            jVar.f18968u = l4;
            jVar.f18960b = 100.0f;
            jVar.f18961c = true;
            jVar.f18959a = 4000.0f;
            jVar.h();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f46349y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f46349y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f46349y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f46349y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f46349y);
            }
            this.f46349y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f46347w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 7));
            this.G.setDuration(220L);
            this.G.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46343f.c();
        this.h.c();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!isFocused()) {
            hideActionMode();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xr xrVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof xr) {
                xrVar = (xr) getParent();
            } else {
                xrVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && xrVar != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
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
                        i10 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    if (i10 > 0) {
                        startActionMode(new yr(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f46346s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.H = false;
        }
        return this.H;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.f46346s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
