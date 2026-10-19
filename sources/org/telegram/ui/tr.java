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
public abstract class tr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.dw0 I;
    public static final org.telegram.ui.Components.dw0 J;
    public static final org.telegram.ui.Components.dw0 K;
    public static final org.telegram.ui.Components.dw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f41724b;
    public float f41725c;
    public float d;
    public float e;
    public o1.k f41726f;
    public o1.k h;
    public o1.k f41727n;
    public o1.k f41728r;
    public boolean f41729s;
    public float v;
    public float f41730w;
    public boolean f41731x;
    public Bitmap f41732y;

    static {
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(new m4.v0(26), new m4.v0(27));
        dw0Var.f25659c = 100.0f;
        I = dw0Var;
        org.telegram.ui.Components.dw0 dw0Var2 = new org.telegram.ui.Components.dw0(new m4.v0(28), new m4.v0(29));
        dw0Var2.f25659c = 100.0f;
        J = dw0Var2;
        org.telegram.ui.Components.dw0 dw0Var3 = new org.telegram.ui.Components.dw0(new rr(0), new rr(1));
        dw0Var3.f25659c = 100.0f;
        K = dw0Var3;
        org.telegram.ui.Components.dw0 dw0Var4 = new org.telegram.ui.Components.dw0(new rr(2), new rr(3));
        dw0Var4.f25659c = 100.0f;
        L = dw0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f17559u;
        if (lVar != null && f7 == ((float) lVar.f17565i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f17565i = f7;
        kVar.f17559u = lVar2;
        kVar.h();
    }

    public float getErrorProgress() {
        return this.f41725c;
    }

    public float getFocusedProgress() {
        return this.f41724b;
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
        k(this.f41726f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f41727n, f7 * 100.0f);
        o1.k kVar = this.f41728r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l l4 = org.telegram.ui.Cells.c1.l(1.0f, 500.0f, 0.75f);
            l4.f17565i = 100.0f;
            kVar.f17559u = l4;
            kVar.f17550b = 100.0f;
            kVar.f17551c = true;
            kVar.f17549a = 4000.0f;
            kVar.h();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f41732y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f41732y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f41732y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f41732y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f41732y);
            }
            this.f41732y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f41730w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 8));
            this.G.setDuration(220L);
            this.G.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41726f.c();
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
        qr qrVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof qr) {
                qrVar = (qr) getParent();
            } else {
                qrVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && qrVar != null) {
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
                        startActionMode(new sr(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f41729s) {
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
        this.f41729s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
