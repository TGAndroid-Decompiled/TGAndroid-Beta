package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rm extends org.telegram.ui.Components.qv0 {
    public Paint A0;
    public int B0;
    public float C0;
    public float D0;
    public long E0;
    public boolean F0;
    public final zn G0;
    public int f37888t0;
    public int f37889u0;
    public int f37890v0;
    public final ArrayList f37891w0;
    public final ArrayList f37892x0;
    public final ArrayList f37893y0;
    public final ArrayList f37894z0;

    public rm(zn znVar, Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context, e5Var);
        this.G0 = znVar;
        this.f37888t0 = 0;
        this.f37891w0 = new ArrayList();
        this.f37892x0 = new ArrayList();
        this.f37893y0 = new ArrayList();
        this.f37894z0 = new ArrayList();
        this.E = new qm(this, this);
    }

    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        zn znVar = this.G0;
        znVar.U0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        kVar.setTranslationY(0.0f);
        cl clVar = znVar.Ya;
        if (clVar != null) {
            xk xkVar = znVar.l1;
            if (xkVar != null) {
                i10 = xkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            clVar.setTranslationY(i10);
        }
        ph.f3 f3Var = znVar.f40749t1;
        if (f3Var != null) {
            f3Var.setTranslationY(0.0f);
        }
        ph.f3 f3Var2 = znVar.f40739s1;
        if (f3Var2 != null) {
            f3Var2.setTranslationY(0.0f);
        }
        znVar.N0.setTranslationY(0.0f);
        znVar.M.setTranslationY(0.0f);
        znVar.t9 = 0.0f;
        znVar.f40768u9 = 0.0f;
        znVar.U0.setBackgroundTranslation(0);
        fl flVar = znVar.Y2;
        if (flVar != null) {
            flVar.f30891q0 = 0.0f;
            flVar.s();
        }
        eg.i0 i0Var = znVar.f40774v2;
        if (i0Var != null) {
            org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.f5290b;
            x9Var.f30562u = 0.0f;
            x9Var.d.invalidate();
        }
        znVar.setFragmentPanTranslationOffset(0);
        znVar.o9();
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void U(Drawable drawable) {
        boolean z4;
        if (drawable instanceof org.telegram.ui.Components.ec0) {
            ((org.telegram.ui.Components.ec0) drawable).p();
        }
        zn znVar = this.G0;
        sg.a c3 = znVar.T.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(znVar.T.b(c3));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(znVar.T.a(c3));
        boolean z10 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z4 = true;
        } else {
            z4 = false;
        }
        znVar.Ab = z4;
        if (computePerceivedBrightness2 <= 0.9f) {
            z10 = true;
        }
        znVar.Bb = z10;
        znVar.I.f44382a = c3;
        wg.f fVar = znVar.U;
        if (fVar != null) {
            fVar.invalidate();
        }
        ug.f fVar2 = znVar.P;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        znVar.n9();
        znVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.s1 s1Var, int i10) {
        float f11;
        int save = canvas.save();
        zn znVar = this.G0;
        float x10 = s1Var.getX() + znVar.f40759u0.getLeft();
        float y10 = s1Var.getY() + znVar.f40759u0.getY() + s1Var.getPaddingTop();
        if (s1Var.a()) {
            f11 = s1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.clipRect(znVar.f40759u0.getLeft(), f10, znVar.f40759u0.getRight(), ((((znVar.f40759u0.getY() + znVar.f40759u0.getMeasuredHeight()) - znVar.f40810xa) - znVar.v.d()) - znVar.f40710pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y10);
        boolean z4 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f11, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f11);
        } else if (i10 == 2) {
            s1Var.I1(f11, canvas, (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (i10 == 3) {
            z4 = (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) ? false : false;
            s1Var.N1(canvas, f11);
            if (!z4) {
                s1Var.d2(canvas, f11, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && znVar.J8 != null)) {
            float f12 = (znVar.E8 * znVar.H8) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, znVar.J8, f12, znVar.F8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            s1Var.i2(this, canvas, znVar.K8, znVar.J8, f12);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ig igVar;
        int i11;
        zn znVar = this.G0;
        ng.a aVar = znVar.G;
        lk lkVar = znVar.V;
        if (lkVar != null && view == lkVar.f22759j0) {
            wg.f fVar = znVar.U;
            if (fVar != null) {
                i11 = indexOfChild(fVar);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                i10 = i11;
            }
            super.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
        lk lkVar2 = znVar.V;
        if (lkVar2 != null && view == lkVar2.f22759j0) {
            rh.v vVar = (rh.v) view;
            vVar.setBackgroundDrawable(aVar.c(vVar.f43873c, znVar.f40799x, false));
        }
        lk lkVar3 = znVar.V;
        if (lkVar3 != null && view == (igVar = lkVar3.K1)) {
            igVar.setBlurredBackgroundFactory(aVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.I) {
            zn znVar = this.G0;
            if (view != znVar.f40774v2 && view != znVar.f40675n1 && view != znVar.f40634j9 && view != znVar.U && view != znVar.H3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hl hlVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (hlVar = this.G0.Ba) != null && hlVar.f30579s) {
            hlVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.G0.f40759u0.getBottom();
    }

    public zn getChatActivity() {
        return this.G0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.G0.La) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.G0.f40759u0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.G0.f40534ba.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.G0.f40534ba.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        if (wallPaperSettings != null && wallPaperSettings.motion) {
            return true;
        }
        return false;
    }

    @Override
    public int getScrollOffset() {
        return this.G0.f40759u0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        super.onAttachedToWindow();
        zn znVar = this.G0;
        if (!znVar.La) {
            e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                if (((ActionBarLayout) e5Var2).f19425b) {
                    org.telegram.ui.ActionBar.r1 r1Var = this.E;
                    e5Var3 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                    r1Var.f20520b = (FrameLayout) e5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.E.f20520b = znVar.U0;
        }
        this.E.c();
        znVar.V.setAdjustPanLayoutHelper(this.E);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == znVar.Q5)) {
            MediaController.getInstance().setTextureView(znVar.N7(false), znVar.f40745s8, znVar.f40719q8, true);
        }
        vp vpVar = znVar.M9;
        if (vpVar != null) {
            vpVar.f();
        }
        znVar.f40769ua.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.E.d();
        zn znVar = this.G0;
        vp vpVar = znVar.M9;
        if (vpVar != null) {
            NotificationCenter.getInstance(vpVar.f39147b0).removeObserver(vpVar, NotificationCenter.updateInterfaces);
            vpVar.C.onDetachedFromWindow();
            org.telegram.ui.Components.l5 l5Var = vpVar.f39155h0;
            if (l5Var != null && (view = vpVar.X) != null) {
                l5Var.o(view);
            }
            vpVar.N = 0.0f;
            vpVar.M = 0L;
            znVar.M9 = null;
        }
        znVar.f40769ua.k();
        AndroidUtilities.runOnUIThread(new cg.n0(22));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zn znVar;
        eg.i0 i0Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (i0Var = (znVar = this.G0).f40774v2) != null && i0Var.a() && znVar.f40774v2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        zn znVar = this.G0;
        tg.c.c(znVar.f40794w8, znVar.fragmentView);
        znVar.f40808x8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.G0.C4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        zn znVar = this.G0;
        znVar.s9 = i11;
        znVar.o9();
        znVar.r9();
    }

    @Override
    public final void M() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
    }
}
