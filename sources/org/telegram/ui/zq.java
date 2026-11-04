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
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class zq extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.kt0 Y1;
    public static final org.telegram.ui.Components.kt0 Z1;
    public static final org.telegram.ui.Components.kt0 f52739a2;
    public static final org.telegram.ui.Components.kt0 f52740b2;
    public float H1;
    public float I1;
    public float J1;
    public float K1;
    public q1.g L1;
    public q1.g M1;
    public q1.g N1;
    public q1.g O1;
    public boolean P1;
    public float Q1;
    public float R1;
    public boolean S1;
    public Bitmap T1;
    public Canvas U1;
    public ValueAnimator V1;
    public ValueAnimator W1;
    public boolean X1;

    static {
        org.telegram.ui.Components.kt0 kt0Var = new org.telegram.ui.Components.kt0(new org.telegram.messenger.go(22), new org.telegram.messenger.go(23));
        kt0Var.f35485c = 100.0f;
        Y1 = kt0Var;
        org.telegram.ui.Components.kt0 kt0Var2 = new org.telegram.ui.Components.kt0(new org.telegram.messenger.go(24), new org.telegram.messenger.go(25));
        kt0Var2.f35485c = 100.0f;
        Z1 = kt0Var2;
        org.telegram.ui.Components.kt0 kt0Var3 = new org.telegram.ui.Components.kt0(new org.telegram.messenger.go(26), new org.telegram.messenger.go(27));
        kt0Var3.f35485c = 100.0f;
        f52739a2 = kt0Var3;
        org.telegram.ui.Components.kt0 kt0Var4 = new org.telegram.ui.Components.kt0(new org.telegram.messenger.go(28), new org.telegram.messenger.go(29));
        kt0Var4.f35485c = 100.0f;
        f52740b2 = kt0Var4;
    }

    public static void B(q1.g gVar, float f10) {
        q1.h hVar = gVar.f53653m;
        if (hVar != null && f10 == ((float) hVar.f53661i)) {
            return;
        }
        gVar.d();
        q1.h hVar2 = new q1.h(f10);
        hVar2.b(400.0f);
        hVar2.a(1.0f);
        hVar2.f53661i = f10;
        gVar.f53653m = hVar2;
        gVar.h();
    }

    public final void A(float f10) {
        B(this.L1, f10 * 100.0f);
    }

    public final void C(float f10) {
        B(this.N1, f10 * 100.0f);
        q1.g gVar = this.O1;
        gVar.d();
        if (f10 != 0.0f) {
            q1.h s6 = org.telegram.ui.Cells.f1.s(1.0f, 500.0f, 0.75f);
            s6.f53661i = 100.0f;
            gVar.f53653m = s6;
            gVar.f53644b = 100.0f;
            gVar.f53645c = true;
            gVar.f53643a = 4000.0f;
            gVar.h();
            return;
        }
        this.K1 = 1.0f;
    }

    public final void D() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.T1;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.T1.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.T1;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.T1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.U1 = new Canvas(this.T1);
            }
            this.T1.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.U1.save();
            this.U1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.U1);
            this.U1.restore();
            this.R1 = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 7));
            this.W1.setDuration(220L);
            this.W1.start();
        }
    }

    public float getErrorProgress() {
        return this.I1;
    }

    public float getFocusedProgress() {
        return this.H1;
    }

    public float getSuccessProgress() {
        return this.J1;
    }

    public float getSuccessScaleProgress() {
        return this.K1;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L1.d();
        this.M1.d();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        super.onFocusChanged(z10, i3, rect);
        if (!isFocused()) {
            m();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xq xqVar;
        ClipDescription primaryClipDescription;
        String str;
        int i3;
        if (motionEvent.getAction() == 0) {
            this.X1 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof xq) {
                xqVar = (xq) getParent();
            } else {
                xqVar = null;
            }
            if (motionEvent.getAction() == 1 && this.X1) {
                if (isFocused() && xqVar != null) {
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
                        i3 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i3 = -1;
                    }
                    if (i3 > 0) {
                        startActionMode(new yq(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.P1) {
                    org.telegram.messenger.g0.K3(this);
                }
            }
            this.X1 = false;
        }
        return this.X1;
    }

    @Override
    public final boolean requestFocus(int i3, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i3, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.P1 = z10;
        setShowSoftInputOnFocus(z10);
    }

    public final void z(float f10) {
        B(this.M1, f10 * 100.0f);
    }
}
