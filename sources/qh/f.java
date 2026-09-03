package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.ss0;
public final class f extends fu {
    public org.telegram.ui.Components.fa S;
    public qg.b T;
    public final org.telegram.ui.ActionBar.g6 U;
    public final org.telegram.ui.Components.ba V;
    public final k W;

    public f(k kVar, Context context, pv0 pv0Var, int i10, oh.b bVar, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar) {
        super(context, pv0Var, null, i10, true, bVar);
        this.W = kVar;
        this.U = g6Var;
        this.V = baVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k kVar = this.W;
        if ((kVar instanceof p) && ((p) kVar).L1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            k kVar = this.W;
            if (kVar.getEditTextStyle() == 2 || kVar.getEditTextStyle() == 3) {
                emojiView.f29327t0 = false;
                emojiView.f29332u2 = false;
                emojiView.setShouldDrawBackground(false);
                if (kVar instanceof bd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f29272c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.F2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new hg.j1(17));
        }
    }

    @Override
    public final void g(Canvas canvas, bu buVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        k kVar = this.W;
        og.i iVar = kVar.d;
        RectF rectF = kVar.f45595w0;
        rectF.set(0.0f, 0.0f, buVar.getWidth(), AndroidUtilities.dp(29.0f) + buVar.getHeight());
        int i12 = 0;
        if (kVar.f45573e0 != null) {
            if (this.T == null) {
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
                qg.b c3 = kVar.f45573e0.c(buVar, null, false);
                c3.n(sg.b.i(this.U));
                this.T = c3;
                c3.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                qg.b bVar = this.T;
                bVar.f44888k = true;
                bVar.t(AndroidUtilities.dp(32.0f));
                qg.b bVar2 = this.T;
                bVar2.h.f44872g = 0.4f;
                bVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.T.setBounds(rect);
            this.T.draw(canvas);
        } else if (kVar.g()) {
            if (this.S == null) {
                this.S = new org.telegram.ui.Components.fa(this.V, buVar, 7, false);
            }
            kVar.h(this.S, canvas, kVar.f45595w0, AndroidUtilities.dp(29.0f), false, 0.0f, -buVar.getY(), false);
            iVar.f16822k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
        } else {
            Paint paint = kVar.f45572e;
            FrameLayout frameLayout = kVar.G;
            if (kVar.f45581l0 > 0.0f && kVar.f45588r0 != null && kVar.f45585p0 != null && (bitmap = kVar.f45584o0) != null && !bitmap.isRecycled()) {
                kVar.f45586q0.reset();
                kVar.f45586q0.postScale(frameLayout.getWidth() / kVar.f45584o0.getWidth(), frameLayout.getHeight() / kVar.f45584o0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                bu buVar2 = buVar;
                while (i12 < 8 && buVar2 != null) {
                    f10 += buVar2.getX();
                    f11 += buVar2.getY();
                    ViewParent parent = buVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    buVar2 = r14;
                }
                kVar.f45586q0.postTranslate(-f10, -f11);
                kVar.f45585p0.setLocalMatrix(kVar.f45586q0);
                kVar.f45588r0.setAlpha((int) (kVar.f45581l0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, kVar.f45588r0);
            }
            if (kVar.f45588r0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, kVar.f45581l0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.W.I.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.W.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        k kVar = this.W;
        f fVar = kVar.f45574f;
        ObjectAnimator objectAnimator = kVar.f45571d0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == kVar.V) {
            return false;
        }
        kVar.invalidate();
        if (kVar.T) {
            kVar.T = false;
            if (kVar.U != i10) {
                ObjectAnimator objectAnimator2 = kVar.f45571d0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != kVar.V) {
                    ObjectAnimator objectAnimator3 = kVar.f45571d0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    fVar.getEditText().setScrollY(kVar.U);
                    xt editText = fVar.getEditText();
                    int i11 = kVar.U;
                    kVar.V = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    kVar.f45571d0 = ofInt;
                    ofInt.setDuration(240L);
                    kVar.f45571d0.setInterpolator(pr.h);
                    kVar.f45571d0.addListener(new ss0(this, 28));
                    kVar.f45571d0.start();
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
        this.W.I.f45394e = true;
    }

    @Override
    public final void y() {
        this.W.I.a();
    }
}
