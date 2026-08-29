package th;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class a3 implements r4 {
    public final s f48350a;
    public final a f48351b;
    public final p3 f48352c;

    public a3(a aVar, s sVar, p3 p3Var) {
        this.f48352c = p3Var;
        this.f48350a = sVar;
        this.f48351b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        s sVar = this.f48350a;
        sVar.h = document;
        sVar.f48718i = document;
        sVar.f48712a = 2;
        TL_iv.PageBlock pageBlock = this.f48351b.f48328b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f22398id;
        }
        p3 p3Var = this.f48352c;
        p3Var.V3.remove(sVar);
        p3Var.U2.N(false);
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void f(float f9) {
        this.f48350a.f48716f = f9;
        a aVar = this.f48351b;
        p3 p3Var = this.f48352c;
        View z12 = p3Var.z1(aVar);
        if (z12 instanceof x) {
            ((x) z12).m(false);
            z12.invalidate();
        }
        p3Var.f48638d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f48350a;
        sVar.f48712a = 3;
        p3 p3Var = this.f48352c;
        p3Var.V3.remove(sVar);
        int indexOf = p3Var.f48646h3.indexOf(this.f48351b);
        if (indexOf >= 0) {
            p3Var.f48646h3.remove(indexOf);
            p3Var.U2.N(true);
        }
        p3Var.f48638d3.onContentChanged();
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
