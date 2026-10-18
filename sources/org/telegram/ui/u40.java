package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u40 implements org.telegram.ui.Components.bl0 {
    public final Path f41852a = new Path();
    public final Paint f41853b;
    public final s50 f41854c;

    public u40(s50 s50Var) {
        this.f41854c = s50Var;
        Paint paint = new Paint(1);
        this.f41853b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = i1Var.f785f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = i1Var.f786g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        s50 s50Var = this.f41854c;
        s50Var.B1(tL_textWithEntities);
        r30 r30Var = s50Var.H;
        if (r30Var.m()) {
            r30Var.j();
        } else {
            r30Var.d();
        }
        ah.t0 reactionsWindow = s50Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f883q) {
            s50Var.K.getReactionsWindow().e();
            s50Var.K.n();
        }
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        Paint paint = this.f41853b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            s50 s50Var = this.f41854c;
            if (s50Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f41852a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-s50Var.K.getX(), -s50Var.K.getY());
                float f12 = s50Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(s50Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final void q() {
    }
}
