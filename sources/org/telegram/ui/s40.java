package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s40 implements org.telegram.ui.Components.bl0 {
    public final Path f41355a = new Path();
    public final Paint f41356b;
    public final q50 f41357c;

    public s40(q50 q50Var) {
        this.f41357c = q50Var;
        Paint paint = new Paint(1);
        this.f41356b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = i1Var.f783f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = i1Var.f784g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        q50 q50Var = this.f41357c;
        q50Var.B1(tL_textWithEntities);
        p30 p30Var = q50Var.H;
        if (p30Var.m()) {
            p30Var.j();
        } else {
            p30Var.d();
        }
        ah.t0 reactionsWindow = q50Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f881q) {
            q50Var.K.getReactionsWindow().e();
            q50Var.K.n();
        }
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        Paint paint = this.f41356b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            q50 q50Var = this.f41357c;
            if (q50Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f41355a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-q50Var.K.getX(), -q50Var.K.getY());
                float f12 = q50Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(q50Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final void v() {
    }
}
