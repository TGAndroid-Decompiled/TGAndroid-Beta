package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t40 implements org.telegram.ui.Components.ek0 {
    public final Path f42544a = new Path();
    public final Paint f42545b;
    public final r50 f42546c;

    public t40(r50 r50Var) {
        this.f42546c = r50Var;
        Paint paint = new Paint(1);
        this.f42545b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.f42545b;
        int i11 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f9, f9, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            r50 r50Var = this.f42546c;
            if (r50Var.M2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f42544a;
                    path.rewind();
                    path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-r50Var.G.getX(), -r50Var.G.getY());
                float f12 = r50Var.N2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(r50Var.M2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean O() {
        return true;
    }

    @Override
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = q0Var.f13825f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = q0Var.f13826g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        r50 r50Var = this.f42546c;
        r50Var.A1(tL_textWithEntities);
        r30 r30Var = r50Var.D;
        if (r30Var.m()) {
            r30Var.j();
        } else {
            r30Var.d();
        }
        kg.d0 reactionsWindow = r50Var.G.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f13695q) {
            r50Var.G.getReactionsWindow().e();
            r50Var.G.n();
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void H() {
    }
}
