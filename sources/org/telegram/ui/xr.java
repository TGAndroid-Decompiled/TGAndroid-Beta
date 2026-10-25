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
public abstract class xr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.pw0 I;
    public static final org.telegram.ui.Components.pw0 J;
    public static final org.telegram.ui.Components.pw0 K;
    public static final org.telegram.ui.Components.pw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f45834b;
    public float f45835c;
    public float d;
    public float e;
    public o1.j f45836f;
    public o1.j h;
    public o1.j f45837n;
    public o1.j f45838r;
    public boolean f45839s;
    public float v;
    public float f45840w;
    public boolean f45841x;
    public Bitmap f45842y;

    static {
        org.telegram.ui.Components.pw0 pw0Var = new org.telegram.ui.Components.pw0(new cg(4), new cg(5));
        pw0Var.f31728c = 100.0f;
        I = pw0Var;
        org.telegram.ui.Components.pw0 pw0Var2 = new org.telegram.ui.Components.pw0(new cg(6), new cg(7));
        pw0Var2.f31728c = 100.0f;
        J = pw0Var2;
        org.telegram.ui.Components.pw0 pw0Var3 = new org.telegram.ui.Components.pw0(new cg(8), new cg(9));
        pw0Var3.f31728c = 100.0f;
        K = pw0Var3;
        org.telegram.ui.Components.pw0 pw0Var4 = new org.telegram.ui.Components.pw0(new cg(10), new cg(11));
        pw0Var4.f31728c = 100.0f;
        L = pw0Var4;
    }

    public static void k(o1.j jVar, float f7) {
        o1.k kVar = jVar.f18969u;
        if (kVar != null && f7 == ((float) kVar.f18975i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f7);
        kVar2.b(400.0f);
        kVar2.a(1.0f);
        kVar2.f18975i = f7;
        jVar.f18969u = kVar2;
        jVar.h();
    }

    public float getErrorProgress() {
        return this.f45835c;
    }

    public float getFocusedProgress() {
        return this.f45834b;
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
        k(this.f45836f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f45837n, f7 * 100.0f);
        o1.j jVar = this.f45838r;
        jVar.c();
        if (f7 != 0.0f) {
            o1.k l4 = d3.l(1.0f, 500.0f, 0.75f);
            l4.f18975i = 100.0f;
            jVar.f18969u = l4;
            jVar.f18961b = 100.0f;
            jVar.f18962c = true;
            jVar.f18960a = 4000.0f;
            jVar.h();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f45842y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f45842y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f45842y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f45842y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f45842y);
            }
            this.f45842y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f45840w = 0.0f;
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
        this.f45836f.c();
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
        vr vrVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof vr) {
                vrVar = (vr) getParent();
            } else {
                vrVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && vrVar != null) {
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
                        startActionMode(new wr(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f45839s) {
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
        this.f45839s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
