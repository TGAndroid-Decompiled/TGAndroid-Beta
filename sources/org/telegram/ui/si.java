package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class si implements org.telegram.ui.ActionBar.n0, tq0, org.telegram.ui.Components.n40, gl, gm0 {
    public final wm f49516a;

    public si(wm wmVar) {
        this.f49516a = wmVar;
    }

    @Override
    public void G(org.telegram.messenger.zi ziVar) {
        Bitmap bitmap;
        if (ziVar == null) {
            return;
        }
        if (MediaController.B().I(ziVar)) {
            for (int i3 = 0; i3 < this.f49516a.A0.getChildCount(); i3++) {
                if (this.f49516a.A0.getChildAt(i3) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f49516a.A0.getChildAt(i3);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == ziVar.f1()) {
                        org.telegram.ui.Components.t5 m10 = q1Var.getPhotoImage().m();
                        if (m10.f38257c0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                uj ujVar = this.f49516a.Qa;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.t5 t5Var = ujVar.d;
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
            this.f49516a.c8(true);
            MediaController B = MediaController.B();
            wm wmVar = this.f49516a;
            B.p0(wmVar.L8, wmVar.K8, wmVar.I8, true);
        }
        this.f49516a.A0.invalidate();
    }

    @Override
    public void I0(org.telegram.messenger.zi ziVar) {
        wm wmVar = this.f49516a;
        wmVar.A0.I0(true);
        wmVar.A0.C0();
        if (MediaController.B().I(ziVar)) {
            wmVar.m1.removeView(wmVar.I8);
            wmVar.I8 = null;
            wmVar.L8 = null;
            wmVar.K8 = null;
        }
        for (int i3 = 0; i3 < wmVar.A0.getChildCount(); i3++) {
            if (wmVar.A0.getChildAt(i3) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) wmVar.A0.getChildAt(i3);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == ziVar.f1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override
    public void T0(int i3) {
        this.f49516a.l(i3, 0, true, 0, true, 0);
    }

    @Override
    public void g() {
        org.telegram.ui.Components.nk0.d(new ke(this.f49516a, 2));
    }

    @Override
    public TextureView i0() {
        return this.f49516a.L8;
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
            this.f49516a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void w0(String str) {
        this.f49516a.Da(str, false);
    }

    @Override
    public void a(ArrayList arrayList) {
    }

    @Override
    public void e() {
    }

    @Override
    public void Y(boolean z10, boolean z11) {
    }
}
