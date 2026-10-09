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
public final class sm extends org.telegram.ui.Components.sw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final zn J0;
    public int f41731w0;
    public int f41732x0;
    public int f41733y0;
    public final ArrayList f41734z0;

    public sm(zn znVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = znVar;
        this.f41731w0 = 0;
        this.f41734z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new rm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        zn znVar = this.J0;
        znVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        kVar.setTranslationY(0.0f);
        el elVar = znVar.f44725bb;
        if (elVar != null) {
            zk zkVar = znVar.f44875o1;
            if (zkVar != null) {
                i10 = zkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            elVar.setTranslationY(i10);
        }
        ci.d4 d4Var = znVar.f44977w1;
        if (d4Var != null) {
            d4Var.setTranslationY(0.0f);
        }
        ci.d4 d4Var2 = znVar.f44964v1;
        if (d4Var2 != null) {
            d4Var2.setTranslationY(0.0f);
        }
        znVar.Q0.setTranslationY(0.0f);
        znVar.P.setTranslationY(0.0f);
        znVar.f44985w9 = 0.0f;
        znVar.f44999x9 = 0.0f;
        znVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.y60 y60Var = znVar.f44717b3;
        if (y60Var != null) {
            y60Var.e(0.0f);
        }
        ci.r6 r6Var = znVar.f45005y2;
        if (r6Var != null) {
            org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) r6Var.f5907b;
            iaVar.f27316u = 0.0f;
            iaVar.d.invalidate();
        }
        znVar.setFragmentPanTranslationOffset(0);
        znVar.t9();
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
    public final int R() {
        ai.h4 h4Var = this.J0.J1;
        if (h4Var != null && h4Var.isShowing()) {
            this.f30925f = 0;
            return 0;
        }
        return super.R();
    }

    @Override
    public final void U(Drawable drawable) {
        boolean z10;
        if (drawable instanceof org.telegram.ui.Components.cd0) {
            ((org.telegram.ui.Components.cd0) drawable).p();
        }
        zn znVar = this.J0;
        fh.a c10 = znVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(znVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(znVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        znVar.Eb = z11;
        znVar.L.f9942a = c10;
        jh.f fVar = znVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.f fVar2 = znVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        znVar.s9();
        znVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        zn znVar = this.J0;
        float x10 = u1Var.getX() + znVar.f44990x0.getLeft();
        float y3 = u1Var.getY() + znVar.f44990x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(znVar.f44990x0.getLeft(), f7, znVar.f44990x0.getRight(), ((((znVar.f44990x0.getY() + znVar.f44990x0.getMeasuredHeight()) - znVar.Ba) - znVar.v.e()) - znVar.f44937sc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        boolean z10 = true;
        u1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            u1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            u1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            if (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            u1Var.I1(f10, canvas, z10);
        } else if (i10 == 3) {
            if (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            u1Var.N1(canvas, f10);
            if (!z10) {
                u1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && znVar.M8 != null)) {
            float f11 = (znVar.H8 * znVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, znVar.M8, f11, znVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, znVar.N8, znVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ug ugVar;
        int i11;
        zn znVar = this.J0;
        ah.c cVar = znVar.J;
        ok okVar = znVar.Y;
        if (okVar != null && view == okVar.m0) {
            jh.f fVar = znVar.X;
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
        ok okVar2 = znVar.Y;
        if (okVar2 != null && view == okVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.f9495c, znVar.f44989x, false));
        }
        ok okVar3 = znVar.Y;
        if (okVar3 != null && view == (ugVar = okVar3.O1)) {
            ugVar.setBlurredBackgroundFactory(cVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            zn znVar = this.J0;
            if (view != znVar.f45005y2 && view != znVar.f44899q1 && view != znVar.f44858m9 && view != znVar.X && view != znVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jl jlVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (jlVar = this.J0.Fa) != null && jlVar.f31754s) {
            jlVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f44990x0.getBottom();
    }

    public zn getChatActivity() {
        return this.J0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.J0.Pa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.J0.f44990x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f44763ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f44763ea.h;
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
        return this.J0.f44990x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        zn znVar = this.J0;
        if (!znVar.Pa) {
            d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                if (((ActionBarLayout) d5Var2).f20316b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                    p1Var.f21457b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21457b = znVar.X0;
        }
        this.H.c();
        znVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == znVar.T5)) {
            MediaController.getInstance().setTextureView(znVar.Q7(false), znVar.f44971v8, znVar.f44946t8, true);
        }
        xp xpVar = znVar.P9;
        if (xpVar != null) {
            xpVar.f();
        }
        znVar.f45000xa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        zn znVar = this.J0;
        xp xpVar = znVar.P9;
        if (xpVar != null) {
            NotificationCenter.getInstance(xpVar.f44097e0).removeObserver(xpVar, NotificationCenter.updateInterfaces);
            xpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.s5 s5Var = xpVar.f44104k0;
            if (s5Var != null && (view = xpVar.f44090a0) != null) {
                s5Var.o(view);
            }
            xpVar.Q = 0.0f;
            xpVar.P = 0L;
            znVar.P9 = null;
        }
        znVar.f45000xa.j();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zn znVar;
        ci.r6 r6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (r6Var = (znVar = this.J0).f45005y2) != null && r6Var.a() && znVar.f45005y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        zn znVar = this.J0;
        gh.d.c(znVar.f45022z8, znVar.fragmentView);
        znVar.A8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.J0.F4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        zn znVar = this.J0;
        znVar.v9 = i11;
        znVar.t9();
        znVar.w9();
    }

    @Override
    public final void M() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
