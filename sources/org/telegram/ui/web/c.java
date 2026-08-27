package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import gh.c6;
import h7.z5;
import j$.util.Objects;
import lh.kc;
import lh.m2;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;
import zf.k2;
import zf.n2;

public final class c implements View.OnClickListener {

    public final int f43787a;

    public final Object f43788b;

    public final Object f43789c;

    public c(int i10, Object obj, Object obj2) {
        this.f43787a = i10;
        this.f43788b = obj;
        this.f43789c = obj2;
    }

    @Override
    public final void onClick(View view) {
        k2 k2VarJ;
        switch (this.f43787a) {
            case 0:
                l lVar = (l) this.f43788b;
                org.telegram.ui.a0 a0Var = (org.telegram.ui.a0) this.f43789c;
                lVar.f43893b = true;
                a0Var.run();
                lVar.f43900w.U2.N(true);
                break;
            case 1:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f43788b;
                rn rnVar = (rn) this.f43789c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                mc.a0(rnVar).k(false).j();
                break;
            case 2:
                qf.g0.Q((qf.g0) this.f43788b, (TL_account.TL_connectedBot) this.f43789c);
                break;
            case 3:
                qh.b bVar = (qh.b) this.f43788b;
                Runnable runnable = (Runnable) this.f43789c;
                bVar.getClass();
                runnable.run();
                bVar.dismiss();
                break;
            case 4:
                rh.x1.Y((rh.x1) this.f43788b, (Context) this.f43789c, view);
                break;
            case 5:
                yf.x xVar = (yf.x) this.f43788b;
                Context context = (Context) this.f43789c;
                if (!xVar.f50116n.c()) {
                    Bitmap bitmapSnapshotView = AndroidUtilities.snapshotView(xVar.f50116n.e());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapSnapshotView.getWidth(), bitmapSnapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f50116n.b(canvas);
                    canvas.drawBitmap(bitmapSnapshotView, 0.0f, 0.0f, (Paint) null);
                    bitmapSnapshotView.recycle();
                    yf.n nVar = new yf.n(xVar, context, bitmapCreateBitmap);
                    xVar.f50116n.f().addView(nVar, z5.c(-1.0f, -1));
                    yf.u uVar = xVar.f50116n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new c6(uVar, 6));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(er.f28122f);
                    duration.addUpdateListener(new m2(nVar, 25));
                    duration.start();
                    xVar.f50116n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 6:
                n2 n2Var = (n2) this.f43788b;
                kc kcVar = (kc) this.f43789c;
                k2[] k2VarArr = n2Var.D;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.E != null && (k2VarJ = n2Var.j(n2Var.f50622j0, n2Var.f50623k0)) != null) {
                    kcVar.run(k2VarJ);
                    break;
                }
                break;
            default:
                in.d0((rn) this.f43789c, 41026, new n6((zg.c) this.f43788b, 26), null);
                break;
        }
    }
}
