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
public abstract class ur extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.av0 E;
    public static final org.telegram.ui.Components.av0 F;
    public static final org.telegram.ui.Components.av0 G;
    public static final org.telegram.ui.Components.av0 H;
    public Canvas A;
    public ValueAnimator B;
    public ValueAnimator C;
    public boolean D;
    public float f43317b;
    public float f43318c;
    public float d;
    public float f43319e;
    public o1.k f43320f;
    public o1.k h;
    public o1.k f43321n;
    public o1.k f43322r;
    public boolean f43323s;
    public float v;
    public float f43324w;
    public boolean f43325x;
    public Bitmap f43326y;

    static {
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(new m4.a(20), new m4.a(21));
        av0Var.f26899c = 100.0f;
        E = av0Var;
        org.telegram.ui.Components.av0 av0Var2 = new org.telegram.ui.Components.av0(new m4.a(22), new m4.a(23));
        av0Var2.f26899c = 100.0f;
        F = av0Var2;
        org.telegram.ui.Components.av0 av0Var3 = new org.telegram.ui.Components.av0(new m4.a(24), new m4.a(25));
        av0Var3.f26899c = 100.0f;
        G = av0Var3;
        org.telegram.ui.Components.av0 av0Var4 = new org.telegram.ui.Components.av0(new m4.a(26), new m4.a(27));
        av0Var4.f26899c = 100.0f;
        H = av0Var4;
    }

    public static void k(o1.k kVar, float f9) {
        o1.l lVar = kVar.f19045u;
        if (lVar != null && f9 == ((float) lVar.f19052i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f9);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f19052i = f9;
        kVar.f19045u = lVar2;
        kVar.f();
    }

    public float getErrorProgress() {
        return this.f43318c;
    }

    public float getFocusedProgress() {
        return this.f43317b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f43319e;
    }

    public final void i(float f9) {
        k(this.h, f9 * 100.0f);
    }

    public final void j(float f9) {
        k(this.f43320f, f9 * 100.0f);
    }

    public final void l(float f9) {
        k(this.f43321n, f9 * 100.0f);
        o1.k kVar = this.f43322r;
        kVar.c();
        if (f9 != 0.0f) {
            o1.l l10 = th.l(1.0f, 500.0f, 0.75f);
            l10.f19052i = 100.0f;
            kVar.f19045u = l10;
            kVar.f19036b = 100.0f;
            kVar.f19037c = true;
            kVar.f19035a = 4000.0f;
            kVar.f();
            return;
        }
        this.f43319e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f43326y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f43326y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f43326y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f43326y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.A = new Canvas(this.f43326y);
            }
            this.f43326y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.A.save();
            this.A.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.A);
            this.A.restore();
            this.f43324w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 8));
            this.C.setDuration(220L);
            this.C.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43320f.c();
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
                        i10 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    if (i10 > 0) {
                        startActionMode(new tr(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f43323s) {
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
        this.f43323s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
