package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class rj implements org.telegram.ui.ActionBar.q0, os0, org.telegram.ui.Components.h50, gm, xn0 {
    public final un f41239a;

    public rj(un unVar) {
        this.f41239a = unVar;
    }

    @Override
    public void H0(org.telegram.messenger.jj jjVar) {
        un unVar = this.f41239a;
        unVar.f42492z0.I0(true);
        unVar.f42492z0.C0();
        if (MediaController.B().I(jjVar)) {
            unVar.l1.removeView(unVar.H8);
            unVar.H8 = null;
            unVar.K8 = null;
            unVar.J8 = null;
        }
        for (int i10 = 0; i10 < unVar.f42492z0.getChildCount(); i10++) {
            if (unVar.f42492z0.getChildAt(i10) instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) unVar.f42492z0.getChildAt(i10);
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == jjVar.f1()) {
                    q1Var.getPhotoImage().O0(false, true);
                }
            }
        }
    }

    @Override
    public void I(org.telegram.messenger.jj jjVar) {
        Bitmap bitmap;
        if (jjVar == null) {
            return;
        }
        if (MediaController.B().I(jjVar)) {
            for (int i10 = 0; i10 < this.f41239a.f42492z0.getChildCount(); i10++) {
                if (this.f41239a.f42492z0.getChildAt(i10) instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f41239a.f42492z0.getChildAt(i10);
                    if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == jjVar.f1()) {
                        org.telegram.ui.Components.s5 m10 = q1Var.getPhotoImage().m();
                        if (m10.f30128b0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                uk ukVar = this.f41239a.Pa;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.y5 y5Var = ukVar.d;
                                if (y5Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ((TextureView) y5Var.d).getBitmap(width, height);
                                }
                                new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                org.telegram.messenger.f8.g(th2, true);
                            }
                        }
                    }
                }
            }
            this.f41239a.V7(true);
            MediaController B = MediaController.B();
            un unVar = this.f41239a;
            B.p0(unVar.K8, unVar.J8, unVar.H8, true);
        }
        this.f41239a.f42492z0.invalidate();
    }

    @Override
    public void T0(int i10) {
        this.f41239a.k(i10, 0, true, 0, true, 0);
    }

    @Override
    public void V() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f41239a.startActivityForResult(createChooser, 1);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public void e() {
        org.telegram.ui.Components.nl0.d(new ye(this.f41239a, 2));
    }

    @Override
    public TextureView k0() {
        return this.f41239a.K8;
    }

    @Override
    public void v0(String str) {
        this.f41239a.ta(str, false);
    }

    @Override
    public void b(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void X(boolean z10, boolean z11) {
    }
}
