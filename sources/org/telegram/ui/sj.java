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
public final class sj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.d6, lv0, org.telegram.ui.Components.w60, nm {
    public final zn f41791a;

    public sj(zn znVar) {
        this.f41791a = znVar;
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f41791a.f45023x0.getChildCount(); i10++) {
                if (this.f41791a.f45023x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41791a.f45023x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.f6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f26324b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                xk xkVar = this.f41791a.f45019wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ov0 ov0Var = xkVar.d;
                                if (ov0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ov0Var.f40662b.getBitmap(width, height);
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
            this.f41791a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            zn znVar = this.f41791a;
            mediaController.setTextureView(znVar.f45017w8, znVar.f45004v8, znVar.f44979t8, true);
        }
        this.f41791a.f45023x0.invalidate();
    }

    @Override
    public void O0(int i10) {
        this.f41791a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
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
        return this.f41791a.f45017w8;
    }

    @Override
    public void e() {
        org.telegram.ui.Components.hn0.d(new af(this.f41791a, 2));
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
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public void o0(String str) {
        this.f41791a.ia(str, false);
    }

    @Override
    public void w0(MessageObject messageObject) {
        zn znVar = this.f41791a;
        znVar.f45023x0.I0(true);
        znVar.f45023x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            znVar.X0.removeView(znVar.f44979t8);
            znVar.f44979t8 = null;
            znVar.f45017w8 = null;
            znVar.f45004v8 = null;
        }
        for (int i10 = 0; i10 < znVar.f45023x0.getChildCount(); i10++) {
            if (znVar.f45023x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) znVar.f45023x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f21151v3;
    }

    @Override
    public int x0(int i10) {
        return this.f41791a.getThemedColor(i10);
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
