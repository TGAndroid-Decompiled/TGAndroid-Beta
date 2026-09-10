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
public final class sj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.f6, nv0, qm {
    public final eo f36692a;

    public sj(eo eoVar) {
        this.f36692a = eoVar;
    }

    @Override
    public void D0(MessageObject messageObject) {
        eo eoVar = this.f36692a;
        eoVar.f32542x0.I0(true);
        eoVar.f32542x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            eoVar.X0.removeView(eoVar.f32499t8);
            eoVar.f32499t8 = null;
            eoVar.f32537w8 = null;
            eoVar.f32524v8 = null;
        }
        for (int i10 = 0; i10 < eoVar.f32542x0.getChildCount(); i10++) {
            if (eoVar.f32542x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) eoVar.f32542x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int F0(int i10) {
        return this.f36692a.getThemedColor(i10);
    }

    @Override
    public void G(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f36692a.f32542x0.getChildCount(); i10++) {
                if (this.f36692a.f32542x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36692a.f32542x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.c6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.f21999b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                xk xkVar = this.f36692a.f32539wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                qv0 qv0Var = xkVar.d;
                                if (qv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = qv0Var.f36143b.getBitmap(width, height);
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
            this.f36692a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            eo eoVar = this.f36692a;
            mediaController.setTextureView(eoVar.f32537w8, eoVar.f32524v8, eoVar.f32499t8, true);
        }
        this.f36692a.f32542x0.invalidate();
    }

    @Override
    public void S0(int i10) {
        this.f36692a.E(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.km0.d(new cf(this.f36692a, 2));
    }

    @Override
    public int e0(int i10) {
        return F0(i10);
    }

    @Override
    public int f1(int i10) {
        return F0(i10);
    }

    @Override
    public TextureView g0() {
        return this.f36692a.f32537w8;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public void r0(String str) {
        this.f36692a.da(str, false);
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.f18251v3;
    }

    @Override
    public void c() {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void V(boolean z10, boolean z11) {
    }
}
