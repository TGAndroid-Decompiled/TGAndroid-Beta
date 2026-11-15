package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class wi implements org.telegram.ui.ActionBar.n0, br0, org.telegram.ui.Components.u40, kl, mm0 {
    public final an f52914a;

    public wi(an anVar) {
        this.f52914a = anVar;
    }

    @Override
    public void G0(org.telegram.messenger.gj gjVar) {
        an anVar = this.f52914a;
        anVar.A0.I0(true);
        anVar.A0.C0();
        if (MediaController.B().I(gjVar)) {
            anVar.f45278m1.removeView(anVar.I8);
            anVar.I8 = null;
            anVar.L8 = null;
            anVar.K8 = null;
        }
        for (int i7 = 0; i7 < anVar.A0.getChildCount(); i7++) {
            if (anVar.A0.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) anVar.A0.getChildAt(i7);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == gjVar.e1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override
    public void I(org.telegram.messenger.gj gjVar) {
        Bitmap bitmap;
        if (gjVar == null) {
            return;
        }
        if (MediaController.B().I(gjVar)) {
            for (int i7 = 0; i7 < this.f52914a.A0.getChildCount(); i7++) {
                if (this.f52914a.A0.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f52914a.A0.getChildAt(i7);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == gjVar.e1()) {
                        org.telegram.ui.Components.t5 m10 = q1Var.getPhotoImage().m();
                        if (m10.f39513c0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                yj yjVar = this.f52914a.Sa;
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
            this.f52914a.e8(true);
            MediaController B = MediaController.B();
            an anVar = this.f52914a;
            B.p0(anVar.L8, anVar.K8, anVar.I8, true);
        }
        this.f52914a.A0.invalidate();
    }

    @Override
    public void P0(int i7) {
        this.f52914a.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public TextureView g0() {
        return this.f52914a.L8;
    }

    @Override
    public void k() {
        org.telegram.ui.Components.ok0.d(new je(this.f52914a, 2));
    }

    @Override
    public void s0() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f52914a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void v0(String str) {
        this.f52914a.Ga(str, false);
    }

    @Override
    public void f(ArrayList arrayList) {
    }

    @Override
    public void i() {
    }

    @Override
    public void Y(boolean z10, boolean z11) {
    }
}
