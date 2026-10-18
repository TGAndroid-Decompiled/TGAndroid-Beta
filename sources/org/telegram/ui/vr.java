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
    public static final org.telegram.ui.Components.cw0 I;
    public static final org.telegram.ui.Components.cw0 J;
    public static final org.telegram.ui.Components.cw0 K;
    public static final org.telegram.ui.Components.cw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f42280b;
    public float f42281c;
    public float d;
    public float e;
    public o1.k f42282f;
    public o1.k h;
    public o1.k f42283n;
    public o1.k f42284r;
    public boolean f42285s;
    public float v;
    public float f42286w;
    public boolean f42287x;
    public Bitmap f42288y;

    static {
        org.telegram.ui.Components.cw0 cw0Var = new org.telegram.ui.Components.cw0(new m4.v0(26), new m4.v0(27));
        cw0Var.f25402c = 100.0f;
        I = cw0Var;
        org.telegram.ui.Components.cw0 cw0Var2 = new org.telegram.ui.Components.cw0(new m4.v0(28), new m4.v0(29));
        cw0Var2.f25402c = 100.0f;
        J = cw0Var2;
        org.telegram.ui.Components.cw0 cw0Var3 = new org.telegram.ui.Components.cw0(new tr(0), new tr(1));
        cw0Var3.f25402c = 100.0f;
        K = cw0Var3;
        org.telegram.ui.Components.cw0 cw0Var4 = new org.telegram.ui.Components.cw0(new tr(2), new tr(3));
        cw0Var4.f25402c = 100.0f;
        L = cw0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f17562u;
        if (lVar != null && f7 == ((float) lVar.f17568i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f17568i = f7;
        kVar.f17562u = lVar2;
        kVar.h();
    }

    public float getErrorProgress() {
        return this.f42281c;
    }

    public float getFocusedProgress() {
        return this.f42280b;
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
        k(this.f42282f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f42283n, f7 * 100.0f);
        o1.k kVar = this.f42284r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l l4 = org.telegram.ui.Cells.c1.l(1.0f, 500.0f, 0.75f);
            l4.f17568i = 100.0f;
            kVar.f17562u = l4;
            kVar.f17553b = 100.0f;
            kVar.f17554c = true;
            kVar.f17552a = 4000.0f;
            kVar.h();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f42288y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f42288y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f42288y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f42288y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f42288y);
            }
            this.f42288y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f42286w = 0.0f;
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
        this.f42282f.c();
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
        sr srVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof sr) {
                srVar = (sr) getParent();
            } else {
                srVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && srVar != null) {
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
                        startActionMode(new ur(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f42285s) {
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
        this.f42285s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
