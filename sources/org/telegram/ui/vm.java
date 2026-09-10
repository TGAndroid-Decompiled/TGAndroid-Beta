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
public final class vm extends org.telegram.ui.Components.aw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final eo J0;
    public int f37585w0;
    public int f37586x0;
    public int f37587y0;
    public final ArrayList f37588z0;

    public vm(eo eoVar, Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context, f5Var);
        this.J0 = eoVar;
        this.f37585w0 = 0;
        this.f37588z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new um(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        eo eoVar = this.J0;
        eoVar.X0.setTranslationY(f7);
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        lVar.setTranslationY(0.0f);
        fl flVar = eoVar.f32279bb;
        if (flVar != null) {
            al alVar = eoVar.f32428o1;
            if (alVar != null) {
                i10 = alVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            flVar.setTranslationY(i10);
        }
        bi.x4 x4Var = eoVar.f32530w1;
        if (x4Var != null) {
            x4Var.setTranslationY(0.0f);
        }
        bi.x4 x4Var2 = eoVar.f32517v1;
        if (x4Var2 != null) {
            x4Var2.setTranslationY(0.0f);
        }
        eoVar.Q0.setTranslationY(0.0f);
        eoVar.P.setTranslationY(0.0f);
        eoVar.f32538w9 = 0.0f;
        eoVar.f32551x9 = 0.0f;
        eoVar.X0.setBackgroundTranslation(0);
        il ilVar = eoVar.f32271b3;
        if (ilVar != null) {
            ilVar.f22900t0 = 0.0f;
            ilVar.s();
        }
        bi.s7 s7Var = eoVar.f32557y2;
        if (s7Var != null) {
            org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) s7Var.f3651b;
            eaVar.f22650u = 0.0f;
            eaVar.d.invalidate();
        }
        eoVar.setFragmentPanTranslationOffset(0);
        eoVar.o9();
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
        if (drawable instanceof org.telegram.ui.Components.lc0) {
            ((org.telegram.ui.Components.lc0) drawable).p();
        }
        eo eoVar = this.J0;
        eh.a c10 = eoVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(eoVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(eoVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        eoVar.Eb = z11;
        eoVar.L.f7525a = c10;
        ih.f fVar = eoVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        gh.g gVar = eoVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        eoVar.n9();
        eoVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        float f10;
        int save = canvas.save();
        eo eoVar = this.J0;
        float x10 = t1Var.getX() + eoVar.f32542x0.getLeft();
        float y3 = t1Var.getY() + eoVar.f32542x0.getY() + t1Var.getPaddingTop();
        if (t1Var.a()) {
            f10 = t1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(eoVar.f32542x0.getLeft(), f7, eoVar.f32542x0.getRight(), ((((eoVar.f32542x0.getY() + eoVar.f32542x0.getMeasuredHeight()) - eoVar.Aa) - eoVar.v.d()) - eoVar.f32490sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && eoVar.M8 != null)) {
            float f11 = (eoVar.H8 * eoVar.K8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, eoVar.M8, f11, eoVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.i2(this, canvas, eoVar.N8, eoVar.M8, f11);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ug ugVar;
        int i11;
        eo eoVar = this.J0;
        zg.a aVar = eoVar.J;
        ok okVar = eoVar.Y;
        if (okVar != null && view == okVar.m0) {
            ih.f fVar = eoVar.X;
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
        ok okVar2 = eoVar.Y;
        if (okVar2 != null && view == okVar2.m0) {
            di.b0 b0Var = (di.b0) view;
            b0Var.setBackgroundDrawable(aVar.c(b0Var.f6532c, eoVar.f32541x, false));
        }
        ok okVar3 = eoVar.Y;
        if (okVar3 != null && view == (ugVar = okVar3.N1)) {
            ugVar.setBlurredBackgroundFactory(aVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            eo eoVar = this.J0;
            if (view != eoVar.f32557y2 && view != eoVar.f32452q1 && view != eoVar.f32411m9 && view != eoVar.X && view != eoVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        kl klVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (klVar = this.J0.Ea) != null && klVar.f22667s) {
            klVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f32542x0.getBottom();
    }

    public eo getChatActivity() {
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
        return this.J0.f32542x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f32316ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f32316ea.h;
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
        return this.J0.f32542x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        super.onAttachedToWindow();
        eo eoVar = this.J0;
        if (!eoVar.Oa) {
            f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                if (((ActionBarLayout) f5Var2).f17472b) {
                    org.telegram.ui.ActionBar.r1 r1Var = this.H;
                    f5Var3 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                    r1Var.f18594b = (FrameLayout) f5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f18594b = eoVar.X0;
        }
        this.H.c();
        eoVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == eoVar.T5)) {
            MediaController.getInstance().setTextureView(eoVar.N7(false), eoVar.f32524v8, eoVar.f32499t8, true);
        }
        bq bqVar = eoVar.P9;
        if (bqVar != null) {
            bqVar.f();
        }
        eoVar.f32552xa.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        eo eoVar = this.J0;
        bq bqVar = eoVar.P9;
        if (bqVar != null) {
            NotificationCenter.getInstance(bqVar.f31323e0).removeObserver(bqVar, NotificationCenter.updateInterfaces);
            bqVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.p5 p5Var = bqVar.f31330k0;
            if (p5Var != null && (view = bqVar.f31317a0) != null) {
                p5Var.o(view);
            }
            bqVar.Q = 0.0f;
            bqVar.P = 0L;
            eoVar.P9 = null;
        }
        eoVar.f32552xa.k();
        AndroidUtilities.runOnUIThread(new bi.f0(14));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eo eoVar;
        bi.s7 s7Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (s7Var = (eoVar = this.J0).f32557y2) != null && s7Var.a() && eoVar.f32557y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        eo eoVar = this.J0;
        fh.d.c(eoVar.f32575z8, eoVar.fragmentView);
        eoVar.A8.d();
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
        eo eoVar = this.J0;
        eoVar.v9 = i11;
        eoVar.o9();
        eoVar.r9();
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
