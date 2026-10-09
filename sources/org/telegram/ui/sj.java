package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class sj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.e6, mv0, org.telegram.ui.Components.w60, nm {
    public final zn f41705a;

    public sj(zn znVar) {
        this.f41705a = znVar;
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.i6.T0(str);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f41705a.f44988x0.getChildCount(); i10++) {
                if (this.f41705a.f44988x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41705a.f44988x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.f6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f26250b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                xk xkVar = this.f41705a.f44984wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                pv0 pv0Var = xkVar.d;
                                if (pv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = pv0Var.f40899b.getBitmap(width, height);
                                }
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.f41705a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            zn znVar = this.f41705a;
            mediaController.setTextureView(znVar.f44982w8, znVar.f44969v8, znVar.f44944t8, true);
        }
        this.f41705a.f44988x0.invalidate();
    }

    @Override
    public void O0(int i10) {
        this.f41705a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override
    public int a1(int i10) {
        return x0(i10);
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    @Override
    public TextureView d0() {
        return this.f41705a.f44982w8;
    }

    @Override
    public void e() {
        org.telegram.ui.Components.gn0.d(new bf(this.f41705a, 2));
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public void o0(String str) {
        this.f41705a.ia(str, false);
    }

    @Override
    public void w0(MessageObject messageObject) {
        zn znVar = this.f41705a;
        znVar.f44988x0.I0(true);
        znVar.f44988x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            znVar.X0.removeView(znVar.f44944t8);
            znVar.f44944t8 = null;
            znVar.f44982w8 = null;
            znVar.f44969v8 = null;
        }
        for (int i10 = 0; i10 < znVar.f44988x0.getChildCount(); i10++) {
            if (znVar.f44988x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) znVar.f44988x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21125v3;
    }

    @Override
    public int x0(int i10) {
        return this.f41705a.getThemedColor(i10);
    }

    @Override
    public void c() {
    }

    @Override
    public void I0(int i10, int i11) {
    }

    @Override
    public void V(boolean z10, boolean z11) {
    }
}
