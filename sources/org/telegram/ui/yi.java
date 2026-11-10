package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class yi implements org.telegram.ui.ActionBar.o0, gr0, org.telegram.ui.Components.r40, ml, om0 {
    public final cn f52049a;

    public yi(cn cnVar) {
        this.f52049a = cnVar;
    }

    @Override
    public void I(org.telegram.messenger.ij ijVar) {
        Bitmap bitmap;
        if (ijVar == null) {
            return;
        }
        if (MediaController.B().I(ijVar)) {
            for (int i7 = 0; i7 < this.f52049a.f44741z0.getChildCount(); i7++) {
                if (this.f52049a.f44741z0.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f52049a.f44741z0.getChildAt(i7);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == ijVar.e1()) {
                        org.telegram.ui.Components.u5 m10 = q1Var.getPhotoImage().m();
                        if (m10.f38516b0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                ak akVar = this.f52049a.Ra;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.t5 t5Var = akVar.d;
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
            this.f52049a.d8(true);
            MediaController B = MediaController.B();
            cn cnVar = this.f52049a;
            B.p0(cnVar.K8, cnVar.J8, cnVar.H8, true);
        }
        this.f52049a.f44741z0.invalidate();
    }

    @Override
    public void I0(org.telegram.messenger.ij ijVar) {
        cn cnVar = this.f52049a;
        cnVar.f44741z0.I0(true);
        cnVar.f44741z0.C0();
        if (MediaController.B().I(ijVar)) {
            cnVar.l1.removeView(cnVar.H8);
            cnVar.H8 = null;
            cnVar.K8 = null;
            cnVar.J8 = null;
        }
        for (int i7 = 0; i7 < cnVar.f44741z0.getChildCount(); i7++) {
            if (cnVar.f44741z0.getChildAt(i7) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) cnVar.f44741z0.getChildAt(i7);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == ijVar.e1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override
    public void T0(int i7) {
        this.f52049a.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public TextureView l0() {
        return this.f52049a.K8;
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
            this.f52049a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void n() {
        org.telegram.ui.Components.jk0.d(new me(this.f52049a, 2));
    }

    @Override
    public void w0(String str) {
        this.f52049a.Fa(str, false);
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
