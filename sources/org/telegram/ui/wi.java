package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class wi implements org.telegram.ui.ActionBar.o0, dr0, org.telegram.ui.Components.r40, kl, lm0 {
    public final an f51445a;

    public wi(an anVar) {
        this.f51445a = anVar;
    }

    @Override
    public void I(org.telegram.messenger.ij ijVar) {
        Bitmap bitmap;
        if (ijVar == null) {
            return;
        }
        if (MediaController.B().I(ijVar)) {
            for (int i7 = 0; i7 < this.f51445a.f44037z0.getChildCount(); i7++) {
                if (this.f51445a.f44037z0.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f51445a.f44037z0.getChildAt(i7);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == ijVar.f1()) {
                        org.telegram.ui.Components.v5 m10 = q1Var.getPhotoImage().m();
                        if (m10.f38825b0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                yj yjVar = this.f51445a.Pa;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.t5 t5Var = yjVar.d;
                                if (t5Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ((TextureView) t5Var.d).getBitmap(width, height);
                                }
                                new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                            }
                        }
                    }
                }
            }
            this.f51445a.c8(true);
            MediaController B = MediaController.B();
            an anVar = this.f51445a;
            B.p0(anVar.K8, anVar.J8, anVar.H8, true);
        }
        this.f51445a.f44037z0.invalidate();
    }

    @Override
    public void I0(org.telegram.messenger.ij ijVar) {
        an anVar = this.f51445a;
        anVar.f44037z0.I0(true);
        anVar.f44037z0.C0();
        if (MediaController.B().I(ijVar)) {
            anVar.l1.removeView(anVar.H8);
            anVar.H8 = null;
            anVar.K8 = null;
            anVar.J8 = null;
        }
        for (int i7 = 0; i7 < anVar.f44037z0.getChildCount(); i7++) {
            if (anVar.f44037z0.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) anVar.f44037z0.getChildAt(i7);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == ijVar.f1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override
    public void T0(int i7) {
        this.f51445a.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public TextureView l0() {
        return this.f51445a.K8;
    }

    @Override
    public void m() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f51445a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void n() {
        org.telegram.ui.Components.jk0.d(new me(this.f51445a, 2));
    }

    @Override
    public void w0(String str) {
        this.f51445a.Da(str, false);
    }

    @Override
    public void c(ArrayList arrayList) {
    }

    @Override
    public void i() {
    }

    @Override
    public void Y(boolean z9, boolean z10) {
    }
}
