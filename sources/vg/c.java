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
    public NinePatchDrawable f50822c;
    public long d;
    public final f f50823f;
    public final y f50820a = new Object();
    public final Rect f50821b = new Rect();
    public final Bitmap[] e = new Bitmap[1];

    public c(f fVar) {
        this.f50823f = fVar;
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        int i10;
        hi.a u10 = f.u(aVar);
        f fVar = this.f50823f;
        if (Color.alpha(fVar.f50846s) != 255 && (u10 instanceof hi.c)) {
            i10 = ((hi.c) u10).f7711b;
        } else {
            i10 = 0;
        }
        c(canvas, i0.b.k(fVar.f50846s, i10));
    }

    public final void c(Canvas canvas, int i10) {
        long j10;
        int i11;
        f fVar = this.f50823f;
        e eVar = fVar.M;
        if (Color.alpha(i10) == 0 && Color.alpha(fVar.f50845r) == 0) {
            return;
        }
        y yVar = this.f50820a;
        yVar.f7257a = 0L;
        yVar.f7258b = false;
        yVar.a(i10);
        yVar.a(fVar.f50845r);
        for (float f7 : eVar.f50831b) {
            yVar.c(f7);
        }
        yVar.c(fVar.P);
        yVar.c(0.0f);
        yVar.c(fVar.Q);
        if (yVar.f7258b) {
            j10 = -1;
        } else {
            j10 = yVar.f7257a;
        }
        NinePatchDrawable ninePatchDrawable = this.f50822c;
        Rect rect = this.f50821b;
        if (ninePatchDrawable == null || this.d != j10) {
            this.d = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = k9.b(this.e, i10, eVar.f50831b, fVar.P, fVar.f50845r, fVar.Q, i11);
            this.f50822c = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.f50822c;
        Rect rect2 = eVar.f50839m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(fVar.f6649c);
        ninePatchDrawable2.draw(canvas);
    }
}
