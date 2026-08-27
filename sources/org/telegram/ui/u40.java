package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class u40 implements org.telegram.ui.Components.vj0 {

    public final Path f43109a = new Path();

    public final Paint f43110b;

    public final s50 f43111c;

    public u40(s50 s50Var) {
        this.f43111c = s50Var;
        Paint paint = new Paint(1);
        this.f43110b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = q0Var.f11412f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = q0Var.f11413g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        s50 s50Var = this.f43111c;
        s50Var.A1(tL_textWithEntities);
        r30 r30Var = s50Var.D;
        if (r30Var.m()) {
            r30Var.j();
        } else {
            r30Var.d();
        }
        ig.d0 reactionsWindow = s50Var.G.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.f11282q) {
            return;
        }
        s50Var.G.getReactionsWindow().e();
        s50Var.G.n();
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
        Paint paint = this.f43110b;
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        s50 s50Var = this.f43111c;
        if (s50Var.M2 != null) {
            canvas.save();
            if (f10 > 0.0f) {
                Path path = this.f43109a;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
                canvas.clipPath(path);
            } else {
                canvas.clipRect(rectF);
            }
            canvas.translate(-s50Var.G.getX(), -s50Var.G.getY());
            float f13 = s50Var.N2;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(s50Var.M2);
            canvas.restore();
        }
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final void s() {
    }
}
