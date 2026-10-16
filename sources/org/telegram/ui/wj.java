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
public final class wj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.c6, rv0, org.telegram.ui.Components.s60, sm {
    public final fo f41298a;

    public wj(fo foVar) {
        this.f41298a = foVar;
    }

    @Override
    public void C0(MessageObject messageObject) {
        fo foVar = this.f41298a;
        foVar.f35861x0.I0(true);
        foVar.f35861x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            foVar.X0.removeView(foVar.f35817t8);
            foVar.f35817t8 = null;
            foVar.f35856w8 = null;
            foVar.f35842v8 = null;
        }
        for (int i10 = 0; i10 < foVar.f35861x0.getChildCount(); i10++) {
            if (foVar.f35861x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) foVar.f35861x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public int E0(int i10) {
        return this.f41298a.getThemedColor(i10);
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f41298a.f35861x0.getChildCount(); i10++) {
                if (this.f41298a.f35861x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41298a.f35861x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.f6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f24605b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                bl blVar = this.f41298a.f35857wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                uv0 uv0Var = blVar.d;
                                if (uv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = uv0Var.f40495b.getBitmap(width, height);
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
            this.f41298a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            fo foVar = this.f41298a;
            mediaController.setTextureView(foVar.f35856w8, foVar.f35842v8, foVar.f35817t8, true);
        }
        this.f41298a.f35861x0.invalidate();
    }

    @Override
    public void R0(int i10) {
        this.f41298a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public int b0(int i10) {
        return E0(i10);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.cn0.d(new hf(this.f41298a, 2));
    }

    @Override
    public int f1(int i10) {
        return E0(i10);
    }

    @Override
    public TextureView g0() {
        return this.f41298a.f35856w8;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public void r0(String str) {
        this.f41298a.ia(str, false);
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.g6.f19930v3;
    }

    @Override
    public void d() {
    }

    @Override
    public void M0(int i10, int i11) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }
}
