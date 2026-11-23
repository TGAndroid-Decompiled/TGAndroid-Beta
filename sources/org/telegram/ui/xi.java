package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class xi implements org.telegram.ui.ActionBar.n0, dr0, org.telegram.ui.Components.c50, ll, nm0 {
    public final bn f53978a;

    public xi(bn bnVar) {
        this.f53978a = bnVar;
    }

    @Override
    public void G(org.telegram.messenger.fj fjVar) {
        Bitmap bitmap;
        if (fjVar == null) {
            return;
        }
        if (MediaController.B().I(fjVar)) {
            for (int i7 = 0; i7 < this.f53978a.A0.getChildCount(); i7++) {
                if (this.f53978a.A0.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f53978a.A0.getChildAt(i7);
                    if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == fjVar.e1()) {
                        org.telegram.ui.Components.b6 m10 = r1Var.getPhotoImage().m();
                        if (m10.f33641c0) {
                            m10.stop();
                        }
                        Bitmap m11 = m10.m();
                        if (m11 != null) {
                            try {
                                zj zjVar = this.f53978a.Ta;
                                int width = m11.getWidth();
                                int height = m11.getHeight();
                                org.telegram.ui.Cells.u5 u5Var = zjVar.d;
                                if (u5Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ((TextureView) u5Var.d).getBitmap(width, height);
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
            this.f53978a.e8(true);
            MediaController B = MediaController.B();
            bn bnVar = this.f53978a;
            B.p0(bnVar.M8, bnVar.L8, bnVar.J8, true);
        }
        this.f53978a.A0.invalidate();
    }

    @Override
    public TextureView T() {
        return this.f53978a.M8;
    }

    @Override
    public void d() {
        org.telegram.ui.Components.yk0.d(new le(this.f53978a, 2));
    }

    @Override
    public void i0(String str) {
        this.f53978a.Ga(str, false);
    }

    @Override
    public void t() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f53978a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void u0(org.telegram.messenger.fj fjVar) {
        bn bnVar = this.f53978a;
        bnVar.A0.I0(true);
        bnVar.A0.C0();
        if (MediaController.B().I(fjVar)) {
            bnVar.f46279m1.removeView(bnVar.J8);
            bnVar.J8 = null;
            bnVar.M8 = null;
            bnVar.L8 = null;
        }
        for (int i7 = 0; i7 < bnVar.A0.getChildCount(); i7++) {
            if (bnVar.A0.getChildAt(i7) instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) bnVar.A0.getChildAt(i7);
                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == fjVar.e1()) {
                    r1Var.getPhotoImage().P0(false, true);
                }
            }
        }
    }

    @Override
    public void z0(int i7) {
        this.f53978a.l(i7, 0, true, 0, true, 0);
    }

    @Override
    public void b(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void N(boolean z10, boolean z11) {
    }
}
