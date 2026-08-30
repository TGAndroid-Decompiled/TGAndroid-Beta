package vh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements t4 {
    public final s f45837a;
    public final a f45838b;
    public final r3 f45839c;

    public c3(a aVar, s sVar, r3 r3Var) {
        this.f45839c = r3Var;
        this.f45837a = sVar;
        this.f45838b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        s sVar = this.f45837a;
        sVar.h = document;
        sVar.f46155i = document;
        sVar.f46150a = 2;
        TL_iv.PageBlock pageBlock = this.f45838b.f45775b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f19190id;
        }
        r3 r3Var = this.f45839c;
        r3Var.W3.remove(sVar);
        r3Var.V2.N(false);
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f45837a.f46153f = f10;
        a aVar = this.f45838b;
        r3 r3Var = this.f45839c;
        View z12 = r3Var.z1(aVar);
        if (z12 instanceof x) {
            ((x) z12).m(false);
            z12.invalidate();
        }
        r3Var.f46112e3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f45837a;
        sVar.f46150a = 3;
        r3 r3Var = this.f45839c;
        r3Var.W3.remove(sVar);
        int indexOf = r3Var.f46120i3.indexOf(this.f45838b);
        if (indexOf >= 0) {
            r3Var.f46120i3.remove(indexOf);
            r3Var.V2.N(true);
        }
        r3Var.f46112e3.onContentChanged();
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
