package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v40 implements org.telegram.ui.Components.el0 {
    public final Path f42571a = new Path();
    public final Paint f42572b;
    public final u50 f42573c;

    public v40(u50 u50Var) {
        this.f42573c = u50Var;
        Paint paint = new Paint(1);
        this.f42572b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = i1Var.f784f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = i1Var.f785g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        u50 u50Var = this.f42573c;
        u50Var.A1(tL_textWithEntities);
        s30 s30Var = u50Var.H;
        if (s30Var.m()) {
            s30Var.j();
        } else {
            s30Var.d();
        }
        ah.t0 reactionsWindow = u50Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f882q) {
            u50Var.K.getReactionsWindow().e();
            u50Var.K.n();
        }
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        Paint paint = this.f42572b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            u50 u50Var = this.f42573c;
            if (u50Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f42571a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-u50Var.K.getX(), -u50Var.K.getY());
                float f12 = u50Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(u50Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final void u() {
    }
}
