package wh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements t4 {
    public final t f49723a;
    public final a f49724b;
    public final r3 f49725c;

    public c3(a aVar, t tVar, r3 r3Var) {
        this.f49725c = r3Var;
        this.f49723a = tVar;
        this.f49724b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f49723a;
        tVar.h = document;
        tVar.f50072i = document;
        tVar.f50066a = 2;
        TL_iv.PageBlock pageBlock = this.f49724b.f49653b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20851id;
        }
        r3 r3Var = this.f49725c;
        r3Var.W3.remove(tVar);
        r3Var.V2.N(false);
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f49723a.f50070f = f10;
        a aVar = this.f49724b;
        r3 r3Var = this.f49725c;
        View y12 = r3Var.y1(aVar);
        if (y12 instanceof y) {
            ((y) y12).m(false);
            y12.invalidate();
        }
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f49723a;
        tVar.f50066a = 3;
        r3 r3Var = this.f49725c;
        r3Var.W3.remove(tVar);
        int indexOf = r3Var.f50024i3.indexOf(this.f49724b);
        if (indexOf >= 0) {
            r3Var.f50024i3.remove(indexOf);
            r3Var.V2.N(true);
        }
        r3Var.f50016e3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void a(int i10, int i11) {
    }
}
