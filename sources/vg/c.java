package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import g.y;
import w7.k8;
import w7.k9;
public final class c extends k8 {
    public NinePatchDrawable f50836c;
    public long d;
    public final f f50837f;
    public final y f50834a = new Object();
    public final Rect f50835b = new Rect();
    public final Bitmap[] e = new Bitmap[1];

    public c(f fVar) {
        this.f50837f = fVar;
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        int i10;
        hi.a u10 = f.u(aVar);
        f fVar = this.f50837f;
        if (Color.alpha(fVar.f50867y) != 255 && (u10 instanceof hi.c)) {
            i10 = ((hi.c) u10).f7712b;
        } else {
            i10 = 0;
        }
        c(canvas, i0.b.k(fVar.f50867y, i10));
    }

    public final void c(Canvas canvas, int i10) {
        long j10;
        int i11;
        f fVar = this.f50837f;
        e eVar = fVar.P;
        if (Color.alpha(i10) == 0 && Color.alpha(fVar.f50866x) == 0) {
            return;
        }
        y yVar = this.f50834a;
        yVar.f7258a = 0L;
        yVar.f7259b = false;
        yVar.a(i10);
        yVar.a(fVar.f50866x);
        for (float f7 : eVar.f50846b) {
            yVar.c(f7);
        }
        yVar.c(fVar.S);
        yVar.c(0.0f);
        yVar.c(fVar.T);
        if (yVar.f7259b) {
            j10 = -1;
        } else {
            j10 = yVar.f7258a;
        }
        NinePatchDrawable ninePatchDrawable = this.f50836c;
        Rect rect = this.f50835b;
        if (ninePatchDrawable == null || this.d != j10) {
            this.d = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = k9.b(this.e, i10, eVar.f50846b, fVar.S, fVar.f50866x, fVar.T, i11);
            this.f50836c = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.f50836c;
        Rect rect2 = eVar.f50854m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(fVar.f6650c);
        ninePatchDrawable2.draw(canvas);
    }
}
