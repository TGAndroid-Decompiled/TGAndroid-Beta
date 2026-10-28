package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z40 implements org.telegram.ui.Components.fl0 {
    public final Path f46156a = new Path();
    public final Paint f46157b;
    public final x50 f46158c;

    public z40(x50 x50Var) {
        this.f46158c = x50Var;
        Paint paint = new Paint(1);
        this.f46157b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        Paint paint = this.f46157b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            x50 x50Var = this.f46158c;
            if (x50Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f46156a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-x50Var.K.getX(), -x50Var.K.getY());
                float f12 = x50Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(x50Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = x0Var.f4208f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = x0Var.f4209g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        x50 x50Var = this.f46158c;
        x50Var.A1(tL_textWithEntities);
        w30 w30Var = x50Var.H;
        if (w30Var.m()) {
            w30Var.j();
        } else {
            w30Var.d();
        }
        bh.i0 reactionsWindow = x50Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f4060q) {
            x50Var.K.getReactionsWindow().e();
            x50Var.K.n();
        }
    }

    @Override
    public final void m() {
    }
}
