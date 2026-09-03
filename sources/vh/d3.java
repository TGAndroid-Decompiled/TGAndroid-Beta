package vh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements u4 {
    public final t f45934a;
    public final a f45935b;
    public final s3 f45936c;

    public d3(a aVar, t tVar, s3 s3Var) {
        this.f45936c = s3Var;
        this.f45934a = tVar;
        this.f45935b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f45934a;
        tVar.h = document;
        tVar.f46252i = document;
        tVar.f46247a = 2;
        TL_iv.PageBlock pageBlock = this.f45935b.f45853b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f19165id;
        }
        s3 s3Var = this.f45936c;
        s3Var.W3.remove(tVar);
        s3Var.V2.N(false);
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f45934a.f46250f = f10;
        a aVar = this.f45935b;
        s3 s3Var = this.f45936c;
        View y12 = s3Var.y1(aVar);
        if (y12 instanceof y) {
            ((y) y12).m(false);
            y12.invalidate();
        }
        s3Var.f46209e3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f45934a;
        tVar.f46247a = 3;
        s3 s3Var = this.f45936c;
        s3Var.W3.remove(tVar);
        int indexOf = s3Var.f46217i3.indexOf(this.f45935b);
        if (indexOf >= 0) {
            s3Var.f46217i3.remove(indexOf);
            s3Var.V2.N(true);
        }
        s3Var.f46209e3.onContentChanged();
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
