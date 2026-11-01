package vh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wt;
public final class f extends wt {
    public w9 V;
    public vg.f W;
    public final org.telegram.ui.ActionBar.p6 f51135a0;
    public final s9 f51136b0;
    public final k f51137c0;

    public f(k kVar, Context context, vu0 vu0Var, int i10, th.b bVar, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context, vu0Var, null, i10, true, bVar);
        this.f51137c0 = kVar;
        this.f51135a0 = p6Var;
        this.f51136b0 = s9Var;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f51137c0;
        if ((kVar instanceof p) && ((p) kVar).N1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        if (emojiView != null) {
            k kVar = this.f51137c0;
            if (kVar.getEditTextStyle() == 2 || kVar.getEditTextStyle() == 3) {
                emojiView.f32005w0 = false;
                emojiView.f32011x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (kVar instanceof nc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.i0.f16167n);
                    emojiView.f31941c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bi.d2(25));
        }
    }

    @Override
    public final void g(Canvas canvas, st stVar) {
        float W1;
        Bitmap bitmap;
        ?? r12;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        st stVar2 = stVar;
        k kVar = this.f51137c0;
        tg.i iVar = kVar.d;
        RectF rectF = kVar.f51380y0;
        rectF.set(0.0f, 0.0f, stVar2.getWidth(), org.telegram.messenger.i0.L(29.0f) + stVar2.getHeight());
        int i12 = 0;
        if (kVar.f51357g0 != null) {
            if (this.W == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i11 = 0;
                    } else {
                        i11 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i10 = 0;
                    } else {
                        i10 = roundedCorner2.getRadius();
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                vg.f c10 = kVar.f51357g0.c(stVar2, null, false);
                c10.o(w7.b9.i(this.f51135a0));
                this.W = c10;
                c10.s(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), i10, i11, true);
                vg.f fVar = this.W;
                fVar.R = true;
                fVar.t(org.telegram.messenger.i0.L(32.0f));
                vg.f fVar2 = this.W;
                fVar2.P.f50849g = 0.4f;
                fVar2.m();
            }
            Rect rect = org.telegram.messenger.i0.Q;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (kVar.g()) {
            if (this.V == null) {
                this.V = new w9(this.f51136b0, stVar2, 7, false);
            }
            kVar.h(this.V, canvas, kVar.f51380y0, org.telegram.messenger.i0.L(29.0f), false, 0.0f, -stVar2.getY(), false);
            iVar.f48773m = org.telegram.messenger.i0.L(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.i0.L(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
        } else {
            Paint paint = kVar.e;
            FrameLayout frameLayout = kVar.J;
            if (kVar.f51364n0 > 0.0f && kVar.f51372t0 != null && kVar.f51369r0 != null && (bitmap = kVar.f51367q0) != null && !bitmap.isRecycled()) {
                kVar.f51371s0.reset();
                kVar.f51371s0.postScale(frameLayout.getWidth() / kVar.f51367q0.getWidth(), frameLayout.getHeight() / kVar.f51367q0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                st stVar3 = stVar2;
                while (i12 < 8 && stVar3 != null) {
                    f7 += stVar3.getX();
                    f10 += stVar3.getY();
                    ViewParent parent = stVar3.getParent();
                    if (parent instanceof View) {
                        r12 = (View) parent;
                    } else {
                        r12 = 0;
                    }
                    i12++;
                    stVar3 = r12;
                }
                kVar.f51371s0.postTranslate(-f7, -f10);
                kVar.f51369r0.setLocalMatrix(kVar.f51371s0);
                kVar.f51372t0.setAlpha((int) (kVar.f51364n0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, kVar.f51372t0);
            }
            if (kVar.f51372t0 == null) {
                W1 = 128.0f;
            } else {
                W1 = org.telegram.messenger.i0.W1(kVar.f51364n0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) W1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f51137c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f51137c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        k kVar = this.f51137c0;
        f fVar = kVar.f51355f;
        ObjectAnimator objectAnimator = kVar.f51356f0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == kVar.f51350b0) {
            return false;
        }
        kVar.invalidate();
        if (kVar.W) {
            kVar.W = false;
            if (kVar.f51348a0 != i10) {
                ObjectAnimator objectAnimator2 = kVar.f51356f0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != kVar.f51350b0) {
                    ObjectAnimator objectAnimator3 = kVar.f51356f0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    fVar.getEditText().setScrollY(kVar.f51348a0);
                    mt editText = fVar.getEditText();
                    int i11 = kVar.f51348a0;
                    kVar.f51350b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    kVar.f51356f0 = ofInt;
                    ofInt.setDuration(240L);
                    kVar.f51356f0.setInterpolator(gr.h);
                    kVar.f51356f0.addListener(new sg.r(this, 13));
                    kVar.f51356f0.start();
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void u() {
        this.f51137c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f51137c0.L.a();
    }
}
