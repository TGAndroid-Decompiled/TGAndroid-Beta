package wh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements t4 {
    public final t f49686a;
    public final a f49687b;
    public final r3 f49688c;

    public c3(a aVar, t tVar, r3 r3Var) {
        this.f49688c = r3Var;
        this.f49686a = tVar;
        this.f49687b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f49686a;
        tVar.h = document;
        tVar.f50035i = document;
        tVar.f50029a = 2;
        TL_iv.PageBlock pageBlock = this.f49687b.f49616b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20849id;
        }
        r3 r3Var = this.f49688c;
        r3Var.W3.remove(tVar);
        r3Var.V2.N(false);
        r3Var.f49979e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f49686a.f50033f = f10;
        a aVar = this.f49687b;
        r3 r3Var = this.f49688c;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof y) {
            ((y) z12).m(false);
            z12.invalidate();
        }
        r3Var.f49979e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f49686a;
        tVar.f50029a = 3;
        r3 r3Var = this.f49688c;
        r3Var.W3.remove(tVar);
        int indexOf = r3Var.f49987i3.indexOf(this.f49687b);
        if (indexOf >= 0) {
            r3Var.f49987i3.remove(indexOf);
            r3Var.V2.N(true);
        }
        r3Var.f49979e3.onContentChanged();
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
