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
public final class um extends org.telegram.ui.Components.ov0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final co J0;
    public int f41185w0;
    public int f41186x0;
    public int f41187y0;
    public final ArrayList f41188z0;

    public um(co coVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = coVar;
        this.f41185w0 = 0;
        this.f41188z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new tm(this, this);
    }

    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        co coVar = this.J0;
        coVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        kVar.setTranslationY(0.0f);
        dl dlVar = coVar.f35209bb;
        if (dlVar != null) {
            yk ykVar = coVar.f35359o1;
            if (ykVar != null) {
                i10 = ykVar.getCurrentHeight();
            } else {
                i10 = 0;
            }
            dlVar.setTranslationY(i10);
        }
        di.f4 f4Var = coVar.f35461w1;
        if (f4Var != null) {
            f4Var.setTranslationY(0.0f);
        }
        di.f4 f4Var2 = coVar.f35448v1;
        if (f4Var2 != null) {
            f4Var2.setTranslationY(0.0f);
        }
        coVar.Q0.setTranslationY(0.0f);
        coVar.P.setTranslationY(0.0f);
        coVar.f35469w9 = 0.0f;
        coVar.f35482x9 = 0.0f;
        coVar.X0.setBackgroundTranslation(0);
        gl glVar = coVar.f35201b3;
        if (glVar != null) {
            glVar.f32152t0 = 0.0f;
            glVar.s();
        }
        di.r6 r6Var = coVar.f35488y2;
        if (r6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f8068b;
            faVar.f25999u = 0.0f;
            faVar.d.invalidate();
        }
        coVar.setFragmentPanTranslationOffset(0);
        coVar.o9();
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
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            ((org.telegram.ui.Components.dc0) drawable).p();
        }
        co coVar = this.J0;
        gh.a c10 = coVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(coVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(coVar.W.a(c10));
        boolean z11 = false;
        if (computePerceivedBrightness <= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        coVar.Db = z10;
        if (computePerceivedBrightness2 <= 0.9f) {
            z11 = true;
        }
        coVar.Eb = z11;
        coVar.L.f10661a = c10;
        kh.f fVar = coVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.g gVar = coVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        coVar.n9();
        coVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        float f10;
        int save = canvas.save();
        co coVar = this.J0;
        float x10 = t1Var.getX() + coVar.f35473x0.getLeft();
        float y3 = t1Var.getY() + coVar.f35473x0.getY() + t1Var.getPaddingTop();
        if (t1Var.a()) {
            f10 = t1Var.getAlpha();
        } else {
            f10 = 1.0f;
        }
        canvas.clipRect(coVar.f35473x0.getLeft(), f7, coVar.f35473x0.getRight(), ((((coVar.f35473x0.getY() + coVar.f35473x0.getMeasuredHeight()) - coVar.Aa) - coVar.v.d()) - coVar.f35421sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && coVar.M8 != null)) {
            float f11 = (coVar.H8 * coVar.K8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, coVar.M8, f11, coVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.i2(this, canvas, coVar.N8, coVar.M8, f11);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        int i11;
        co coVar = this.J0;
        bh.b bVar = coVar.J;
        mk mkVar = coVar.Y;
        if (mkVar != null && view == mkVar.m0) {
            kh.f fVar = coVar.X;
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
        mk mkVar2 = coVar.Y;
        if (mkVar2 != null && view == mkVar2.m0) {
            fi.y yVar = (fi.y) view;
            yVar.setBackgroundDrawable(bVar.c(yVar.f10100c, coVar.f35472x, false));
        }
        mk mkVar3 = coVar.Y;
        if (mkVar3 != null && view == (sgVar = mkVar3.N1)) {
            sgVar.setBlurredBackgroundFactory(bVar);
        }
    }

    public final boolean b0(View view) {
        if (view != this.L) {
            co coVar = this.J0;
            if (view != coVar.f35488y2 && view != coVar.f35383q1 && view != coVar.f35342m9 && view != coVar.X && view != coVar.K3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        il ilVar;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (ilVar = this.J0.Ea) != null && ilVar.f32231s) {
            ilVar.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public float getBottomOffset() {
        return this.J0.f35473x0.getBottom();
    }

    public co getChatActivity() {
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
        return this.J0.f35473x0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        Drawable d = this.J0.f35247ea.d();
        if (d != null) {
            return d;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.f35247ea.h;
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
        return this.J0.f35473x0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        co coVar = this.J0;
        if (!coVar.Oa) {
            d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                if (((ActionBarLayout) d5Var2).f20140b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                    p1Var.f21277b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.H.f21277b = coVar.X0;
        }
        this.H.c();
        coVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == coVar.T5)) {
            MediaController.getInstance().setTextureView(coVar.N7(false), coVar.f35455v8, coVar.f35430t8, true);
        }
        aq aqVar = coVar.P9;
        if (aqVar != null) {
            aqVar.f();
        }
        coVar.f35483xa.j();
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        co coVar = this.J0;
        aq aqVar = coVar.P9;
        if (aqVar != null) {
            NotificationCenter.getInstance(aqVar.f34512e0).removeObserver(aqVar, NotificationCenter.updateInterfaces);
            aqVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = aqVar.f34519k0;
            if (q5Var != null && (view = aqVar.f34505a0) != null) {
                q5Var.o(view);
            }
            aqVar.Q = 0.0f;
            aqVar.P = 0L;
            coVar.P9 = null;
        }
        coVar.f35483xa.k();
        AndroidUtilities.runOnUIThread(new ah.j(20));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        co coVar;
        di.r6 r6Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (r6Var = (coVar = this.J0).f35488y2) != null && r6Var.a() && coVar.f35488y2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        co coVar = this.J0;
        hh.d.c(coVar.f35506z8, coVar.fragmentView);
        coVar.A8.d();
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
        co coVar = this.J0;
        coVar.v9 = i11;
        coVar.o9();
        coVar.r9();
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
