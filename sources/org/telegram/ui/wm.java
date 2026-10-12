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
public final class wm extends org.telegram.ui.Components.yw0 {
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
    public int f43561w0;
    public int f43562x0;
    public int f43563y0;
    public final ArrayList f43564z0;

    public wm(eo eoVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.J0 = eoVar;
        this.f43561w0 = 0;
        this.f43564z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new vm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        eo eoVar = this.J0;
        eoVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
        kVar.setTranslationY(0.0f);
        il ilVar = eoVar.f37213bb;
        if (ilVar != null) {
            dl dlVar = eoVar.f37363o1;
            if (dlVar != null) {
                i10 = dlVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            ilVar.setTranslationY(i10);
        }
        ci.d4 d4Var = eoVar.f37465w1;
        if (d4Var != null) {
            d4Var.setTranslationY(0.0f);
        }
        ci.d4 d4Var2 = eoVar.f37452v1;
        if (d4Var2 != null) {
            d4Var2.setTranslationY(0.0f);
        }
        eoVar.Q0.setTranslationY(0.0f);
        eoVar.P.setTranslationY(0.0f);
        eoVar.f37473w9 = 0.0f;
        eoVar.f37487x9 = 0.0f;
        eoVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.b70 b70Var = eoVar.f37205b3;
        if (b70Var != null) {
            b70Var.e(0.0f);
        }
        ci.r6 r6Var = eoVar.f37493y2;
        if (r6Var != null) {
            org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) r6Var.f5905b;
            haVar.f26724u = 0.0f;
            haVar.d.invalidate();
        }
        eoVar.setFragmentPanTranslationOffset(0);
        eoVar.t9();
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
            this.f33193f = 0;
            return 0;
        }
        return super.R();
    }

    @Override
    public final void U(Drawable drawable) {
        boolean z10;
        if (drawable instanceof org.telegram.ui.Components.gd0) {
            ((org.telegram.ui.Components.gd0) drawable).p();
        }
        eo eoVar = this.J0;
        fh.a c10 = eoVar.W.c(drawable);
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
        eoVar.L.f9940a = c10;
        jh.f fVar = eoVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.f fVar2 = eoVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        eoVar.s9();
        eoVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        eo eoVar = this.J0;
        float x10 = u1Var.getX() + eoVar.f37478x0.getLeft();
        float y3 = u1Var.getY() + eoVar.f37478x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(eoVar.f37478x0.getLeft(), f7, eoVar.f37478x0.getRight(), ((((eoVar.f37478x0.getY() + eoVar.f37478x0.getMeasuredHeight()) - eoVar.Ba) - eoVar.v.e()) - eoVar.f37425sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && eoVar.M8 != null)) {
            float f11 = (eoVar.H8 * eoVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, eoVar.M8, f11, eoVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, eoVar.N8, eoVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.wg wgVar;
        int i11;
        eo eoVar = this.J0;
        ah.c cVar = eoVar.J;
        sk skVar = eoVar.Y;
        if (skVar != null && view == skVar.m0) {
            jh.f fVar = eoVar.X;
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
        sk skVar2 = eoVar.Y;
        if (skVar2 != null && view == skVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.f9492c, eoVar.f37477x, false));
        }
        sk skVar3 = eoVar.Y;
        if (skVar3 != null && view == (wgVar = skVar3.O1)) {
            wgVar.setBlurredBackgroundFactory(cVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            eo eoVar = this.J0;
            if (view != eoVar.f37493y2 && view != eoVar.f37387q1 && view != eoVar.f37346m9 && view != eoVar.X && view != eoVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nl nlVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (nlVar = this.J0.Fa) != null && nlVar.f33331s) {
            nlVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f37478x0.getBottom();
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
        if (this.J0.Pa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.J0.f37478x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f37251ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f37251ea.h;
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
        return this.J0.f37478x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        eo eoVar = this.J0;
        if (!eoVar.Pa) {
            b5Var = ((org.telegram.ui.ActionBar.m2) eoVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) eoVar).parentLayout;
                if (((ActionBarLayout) b5Var2).f20083b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    b5Var3 = ((org.telegram.ui.ActionBar.m2) eoVar).parentLayout;
                    o1Var.f21183b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21183b = eoVar.X0;
        }
        this.H.c();
        eoVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == eoVar.T5)) {
            MediaController.getInstance().setTextureView(eoVar.Q7(false), eoVar.f37459v8, eoVar.f37434t8, true);
        }
        aq aqVar = eoVar.P9;
        if (aqVar != null) {
            aqVar.f();
        }
        eoVar.f37488xa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        eo eoVar = this.J0;
        aq aqVar = eoVar.P9;
        if (aqVar != null) {
            NotificationCenter.getInstance(aqVar.f35925e0).removeObserver(aqVar, NotificationCenter.updateInterfaces);
            aqVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.s5 s5Var = aqVar.f35932k0;
            if (s5Var != null && (view = aqVar.f35918a0) != null) {
                s5Var.o(view);
            }
            aqVar.Q = 0.0f;
            aqVar.P = 0L;
            eoVar.P9 = null;
        }
        eoVar.f37488xa.j();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eo eoVar;
        ci.r6 r6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (r6Var = (eoVar = this.J0).f37493y2) != null && r6Var.a() && eoVar.f37493y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        eo eoVar = this.J0;
        gh.d.c(eoVar.f37510z8, eoVar.fragmentView);
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
        eoVar.t9();
        eoVar.w9();
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
