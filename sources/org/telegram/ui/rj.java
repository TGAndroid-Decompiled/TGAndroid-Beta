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
public final class rj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.f6, nv0, om {
    public final bo f37254a;

    public rj(bo boVar) {
        this.f37254a = boVar;
    }

    @Override
    public void E0(MessageObject messageObject) {
        bo boVar = this.f37254a;
        boVar.f32506x0.J0(true);
        boVar.f32506x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            boVar.X0.removeView(boVar.f32463t8);
            boVar.f32463t8 = null;
            boVar.f32501w8 = null;
            boVar.f32488v8 = null;
        }
        for (int i10 = 0; i10 < boVar.f32506x0.getChildCount(); i10++) {
            if (boVar.f32506x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) boVar.f32506x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int G0(int i10) {
        return this.f37254a.getThemedColor(i10);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f37254a.f32506x0.getChildCount(); i10++) {
                if (this.f37254a.f32506x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37254a.f32506x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.b6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.f22586b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                wk wkVar = this.f37254a.f32503wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                qv0 qv0Var = wkVar.d;
                                if (qv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = qv0Var.f37043b.getBitmap(width, height);
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
            this.f37254a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            bo boVar = this.f37254a;
            mediaController.setTextureView(boVar.f32501w8, boVar.f32488v8, boVar.f32463t8, true);
        }
        this.f37254a.f32506x0.invalidate();
    }

    @Override
    public void S0(int i10) {
        this.f37254a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.bm0.d(new bf(this.f37254a, 2));
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return G0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public TextureView j0() {
        return this.f37254a.f32501w8;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void s0(String str) {
        this.f37254a.da(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19190v3;
    }

    @Override
    public void c() {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }
}
