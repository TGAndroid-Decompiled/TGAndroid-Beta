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
public final class xm extends org.telegram.ui.Components.ow0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final fo J0;
    public int f41896w0;
    public int f41897x0;
    public int f41898y0;
    public final ArrayList f41899z0;

    public xm(fo foVar, Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context, b5Var);
        this.J0 = foVar;
        this.f41896w0 = 0;
        this.f41899z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new wm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        fo foVar = this.J0;
        foVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        kVar.setTranslationY(0.0f);
        il ilVar = foVar.f35895bb;
        if (ilVar != null) {
            dl dlVar = foVar.f36047o1;
            if (dlVar != null) {
                i10 = dlVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            ilVar.setTranslationY(i10);
        }
        di.d4 d4Var = foVar.f36148w1;
        if (d4Var != null) {
            d4Var.setTranslationY(0.0f);
        }
        di.d4 d4Var2 = foVar.f36134v1;
        if (d4Var2 != null) {
            d4Var2.setTranslationY(0.0f);
        }
        foVar.Q0.setTranslationY(0.0f);
        foVar.P.setTranslationY(0.0f);
        foVar.w9 = 0.0f;
        foVar.f36169x9 = 0.0f;
        foVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.u60 u60Var = foVar.f35887b3;
        if (u60Var != null) {
            u60Var.e(0.0f);
        }
        di.p6 p6Var = foVar.f36176y2;
        if (p6Var != null) {
            org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) p6Var.f7587b;
            haVar.f25601u = 0.0f;
            haVar.d.invalidate();
        }
        foVar.setFragmentPanTranslationOffset(0);
        foVar.t9();
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
        bi.w3 w3Var = this.J0.J1;
        if (w3Var != null && w3Var.isShowing()) {
            this.f28088f = 0;
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
        fo foVar = this.J0;
        gh.a c10 = foVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(foVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(foVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        foVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        foVar.Eb = z11;
        foVar.L.f10156a = c10;
        kh.f fVar = foVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.f fVar2 = foVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        foVar.s9();
        foVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        float f10;
        int save = canvas.save();
        fo foVar = this.J0;
        float x10 = u1Var.getX() + foVar.f36160x0.getLeft();
        float y3 = u1Var.getY() + foVar.f36160x0.getY() + u1Var.getPaddingTop();
        if (u1Var.a()) {
            f10 = u1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(foVar.f36160x0.getLeft(), f7, foVar.f36160x0.getRight(), ((((foVar.f36160x0.getY() + foVar.f36160x0.getMeasuredHeight()) - foVar.Ba) - foVar.v.e()) - foVar.f36107sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && foVar.M8 != null)) {
            float f11 = (foVar.H8 * foVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, foVar.M8, f11, foVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, foVar.N8, foVar.M8, f11);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.tg tgVar;
        int i11;
        fo foVar = this.J0;
        bh.b bVar = foVar.J;
        sk skVar = foVar.Y;
        if (skVar != null && view == skVar.m0) {
            kh.f fVar = foVar.X;
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
        sk skVar2 = foVar.Y;
        if (skVar2 != null && view == skVar2.m0) {
            fi.x xVar = (fi.x) view;
            xVar.setBackgroundDrawable(bVar.c(xVar.f9652c, foVar.f36159x, false));
        }
        sk skVar3 = foVar.Y;
        if (skVar3 != null && view == (tgVar = skVar3.O1)) {
            tgVar.setBlurredBackgroundFactory(bVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            fo foVar = this.J0;
            if (view != foVar.f36176y2 && view != foVar.f36069q1 && view != foVar.f36028m9 && view != foVar.X && view != foVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xm.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nl nlVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (nlVar = this.J0.Fa) != null && nlVar.f29939s) {
            nlVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xm.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xm.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f36160x0.getBottom();
    }

    public fo getChatActivity() {
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
        return this.J0.f36160x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f35932ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f35932ea.h;
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
        return this.J0.f36160x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        super.onAttachedToWindow();
        fo foVar = this.J0;
        if (!foVar.Pa) {
            b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                if (((ActionBarLayout) b5Var2).f19492b) {
                    org.telegram.ui.ActionBar.o1 o1Var = this.H;
                    b5Var3 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                    o1Var.f20556b = (FrameLayout) b5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f20556b = foVar.X0;
        }
        this.H.c();
        foVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == foVar.T5)) {
            MediaController.getInstance().setTextureView(foVar.Q7(false), foVar.f36141v8, foVar.f36116t8, true);
        }
        dq dqVar = foVar.P9;
        if (dqVar != null) {
            dqVar.f();
        }
        foVar.f36170xa.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        fo foVar = this.J0;
        dq dqVar = foVar.P9;
        if (dqVar != null) {
            NotificationCenter.getInstance(dqVar.f35352e0).removeObserver(dqVar, NotificationCenter.updateInterfaces);
            dqVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.s5 s5Var = dqVar.f35359k0;
            if (s5Var != null && (view = dqVar.f35346a0) != null) {
                s5Var.o(view);
            }
            dqVar.Q = 0.0f;
            dqVar.P = 0L;
            foVar.P9 = null;
        }
        foVar.f36170xa.j();
        AndroidUtilities.runOnUIThread(new ah.j(20));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fo foVar;
        di.p6 p6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (p6Var = (foVar = this.J0).f36176y2) != null && p6Var.a() && foVar.f36176y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xm.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xm.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        fo foVar = this.J0;
        hh.d.c(foVar.f36193z8, foVar.fragmentView);
        foVar.A8.d();
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
        fo foVar = this.J0;
        foVar.f36142v9 = i11;
        foVar.t9();
        foVar.w9();
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
