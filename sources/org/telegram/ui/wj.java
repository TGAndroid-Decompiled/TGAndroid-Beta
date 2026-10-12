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
public final class wj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.c6, ov0, org.telegram.ui.Components.z60, rm {
    public final eo f43542a;

    public wj(eo eoVar) {
        this.f43542a = eoVar;
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f43542a.f37478x0.getChildCount(); i10++) {
                if (this.f43542a.f37478x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f43542a.f37478x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.f6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f25901b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                bl blVar = this.f43542a.f37474wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                rv0 rv0Var = blVar.d;
                                if (rv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = rv0Var.f41737b.getBitmap(width, height);
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
            this.f43542a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            eo eoVar = this.f43542a;
            mediaController.setTextureView(eoVar.f37472w8, eoVar.f37459v8, eoVar.f37434t8, true);
        }
        this.f43542a.f37478x0.invalidate();
    }

    @Override
    public void O0(int i10) {
        this.f43542a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public int d0(int i10) {
        return x0(i10);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.mn0.d(new ff(this.f43542a, 2));
    }

    @Override
    public int f1(int i10) {
        return x0(i10);
    }

    @Override
    public TextureView g0() {
        return this.f43542a.f37472w8;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public void p0(String str) {
        this.f43542a.ia(str, false);
    }

    @Override
    public void w0(MessageObject messageObject) {
        eo eoVar = this.f43542a;
        eoVar.f37478x0.I0(true);
        eoVar.f37478x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            eoVar.X0.removeView(eoVar.f37434t8);
            eoVar.f37434t8 = null;
            eoVar.f37472w8 = null;
            eoVar.f37459v8 = null;
        }
        for (int i10 = 0; i10 < eoVar.f37478x0.getChildCount(); i10++) {
            if (eoVar.f37478x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) eoVar.f37478x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f20889v3;
    }

    @Override
    public int x0(int i10) {
        return this.f43542a.getThemedColor(i10);
    }

    @Override
    public void c() {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }
}
