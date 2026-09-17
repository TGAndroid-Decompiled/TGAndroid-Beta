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
public final class tm extends org.telegram.ui.Components.qv0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final bo J0;
    public int f37830w0;
    public int f37831x0;
    public int f37832y0;
    public final ArrayList f37833z0;

    public tm(bo boVar, Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context, e5Var);
        this.J0 = boVar;
        this.f37830w0 = 0;
        this.f37833z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new sm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        bo boVar = this.J0;
        boVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        kVar.setTranslationY(0.0f);
        dl dlVar = boVar.f32238bb;
        if (dlVar != null) {
            zk zkVar = boVar.f32388o1;
            if (zkVar != null) {
                i10 = zkVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            dlVar.setTranslationY(i10);
        }
        ci.f4 f4Var = boVar.f32490w1;
        if (f4Var != null) {
            f4Var.setTranslationY(0.0f);
        }
        ci.f4 f4Var2 = boVar.f32477v1;
        if (f4Var2 != null) {
            f4Var2.setTranslationY(0.0f);
        }
        boVar.Q0.setTranslationY(0.0f);
        boVar.P.setTranslationY(0.0f);
        boVar.f32498w9 = 0.0f;
        boVar.f32511x9 = 0.0f;
        boVar.X0.setBackgroundTranslation(0);
        gl glVar = boVar.f32230b3;
        if (glVar != null) {
            glVar.f29556t0 = 0.0f;
            glVar.s();
        }
        ci.s6 s6Var = boVar.f32517y2;
        if (s6Var != null) {
            org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) s6Var.f5516b;
            daVar.f23302u = 0.0f;
            daVar.d.invalidate();
        }
        boVar.setFragmentPanTranslationOffset(0);
        boVar.o9();
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
        boolean z10;
        if (drawable instanceof org.telegram.ui.Components.cc0) {
            ((org.telegram.ui.Components.cc0) drawable).p();
        }
        bo boVar = this.J0;
        fh.a c10 = boVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(boVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(boVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        boVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        boVar.Eb = z11;
        boVar.L.f9081a = c10;
        jh.f fVar = boVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = boVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        boVar.n9();
        boVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        float f10;
        int save = canvas.save();
        bo boVar = this.J0;
        float x10 = t1Var.getX() + boVar.f32502x0.getLeft();
        float y3 = t1Var.getY() + boVar.f32502x0.getY() + t1Var.getPaddingTop();
        if (t1Var.a()) {
            f10 = t1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(boVar.f32502x0.getLeft(), f7, boVar.f32502x0.getRight(), ((((boVar.f32502x0.getY() + boVar.f32502x0.getMeasuredHeight()) - boVar.Aa) - boVar.v.d()) - boVar.f32450sc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        boolean z10 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(f10, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, f10);
        } else if (i10 == 2) {
            t1Var.I1(f10, canvas, (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (i10 == 3) {
            z10 = (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false;
            t1Var.N1(canvas, f10);
            if (!z10) {
                t1Var.d2(canvas, f10, null);
            }
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && boVar.M8 != null)) {
            float f11 = (boVar.H8 * boVar.K8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, boVar.M8, f11, boVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.i2(this, canvas, boVar.N8, boVar.M8, f11);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.qg qgVar;
        int i11;
        bo boVar = this.J0;
        ah.c cVar = boVar.J;
        nk nkVar = boVar.Y;
        if (nkVar != null && view == nkVar.m0) {
            jh.f fVar = boVar.X;
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
        nk nkVar2 = boVar.Y;
        if (nkVar2 != null && view == nkVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.f8740c, boVar.f32501x, false));
        }
        nk nkVar3 = boVar.Y;
        if (nkVar3 != null && view == (qgVar = nkVar3.N1)) {
            qgVar.setBlurredBackgroundFactory(cVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            bo boVar = this.J0;
            if (view != boVar.f32517y2 && view != boVar.f32412q1 && view != boVar.f32371m9 && view != boVar.X && view != boVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        il ilVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (ilVar = this.J0.Ea) != null && ilVar.f28677s) {
            ilVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f32502x0.getBottom();
    }

    public bo getChatActivity() {
        return this.J0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.J0.Oa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.J0.f32502x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f32275ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f32275ea.h;
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
        return this.J0.f32502x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        super.onAttachedToWindow();
        bo boVar = this.J0;
        if (!boVar.Oa) {
            e5Var = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
                if (((ActionBarLayout) e5Var2).f18390b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.H;
                    e5Var3 = ((org.telegram.ui.ActionBar.o2) boVar).parentLayout;
                    q1Var.f19509b = (FrameLayout) e5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f19509b = boVar.X0;
        }
        this.H.c();
        boVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == boVar.T5)) {
            MediaController.getInstance().setTextureView(boVar.N7(false), boVar.f32484v8, boVar.f32459t8, true);
        }
        zp zpVar = boVar.P9;
        if (zpVar != null) {
            zpVar.f();
        }
        boVar.f32512xa.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        bo boVar = this.J0;
        zp zpVar = boVar.P9;
        if (zpVar != null) {
            NotificationCenter.getInstance(zpVar.f40300e0).removeObserver(zpVar, NotificationCenter.updateInterfaces);
            zpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.o5 o5Var = zpVar.f40307k0;
            if (o5Var != null && (view = zpVar.f40294a0) != null) {
                o5Var.o(view);
            }
            zpVar.Q = 0.0f;
            zpVar.P = 0L;
            boVar.P9 = null;
        }
        boVar.f32512xa.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bo boVar;
        ci.s6 s6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (s6Var = (boVar = this.J0).f32517y2) != null && s6Var.a() && boVar.f32517y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        bo boVar = this.J0;
        gh.d.c(boVar.f32535z8, boVar.fragmentView);
        boVar.A8.d();
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
        bo boVar = this.J0;
        boVar.v9 = i11;
        boVar.o9();
        boVar.r9();
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
