package pf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import fh.k6;
import g7.e6;
import j$.util.Objects;
import kh.g4;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
import qh.x1;
import yf.j2;
import yf.m2;
public final class v implements View.OnClickListener {
    public final int f45797a;
    public final Object f45798b;
    public final Object f45799c;

    public v(int i9, Object obj, Object obj2) {
        this.f45797a = i9;
        this.f45798b = obj;
        this.f45799c = obj2;
    }

    @Override
    public final void onClick(View view) {
        j2 j10;
        switch (this.f45797a) {
            case 0:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f45798b).link);
                oc.a0((qn) this.f45799c).k(false).j();
                return;
            case 1:
                g0.P((g0) this.f45798b, (TL_account.TL_connectedBot) this.f45799c);
                return;
            case 2:
                ph.b bVar = (ph.b) this.f45798b;
                bVar.getClass();
                ((Runnable) this.f45799c).run();
                bVar.dismiss();
                return;
            case 3:
                x1.X((x1) this.f45798b, (Context) this.f45799c, view);
                return;
            case 4:
                xf.x xVar = (xf.x) this.f45798b;
                Context context = (Context) this.f45799c;
                if (!xVar.f49412n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f49412n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f49412n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    xf.n nVar = new xf.n(xVar, context, createBitmap);
                    xVar.f49412n.f().addView(nVar, e6.c(-1.0f, -1));
                    xf.u uVar = xVar.f49412n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new k6(uVar, 6));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(gr.f28844f);
                    duration.addUpdateListener(new g4(nVar, 22));
                    duration.start();
                    xVar.f49412n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 5:
                m2 m2Var = (m2) this.f45798b;
                kh.oc ocVar = (kh.oc) this.f45799c;
                j2[] j2VarArr = m2Var.D;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.E != null && (j10 = m2Var.j(m2Var.f49996j0, m2Var.f49997k0)) != null) {
                    ocVar.run(j10);
                    return;
                }
                return;
            case 6:
                jn.c0((qn) this.f45799c, 41026, new i9((yg.c) this.f45798b, 24), null);
                return;
            default:
                zf.j0.U((zf.j0) this.f45798b, (Context) this.f45799c);
                return;
        }
    }
}
