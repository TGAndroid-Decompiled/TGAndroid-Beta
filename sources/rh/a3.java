package rh;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class a3 implements r4 {

    public final s f47050a;

    public final a f47051b;

    public final p3 f47052c;

    public a3(a aVar, s sVar, p3 p3Var) {
        this.f47052c = p3Var;
        this.f47050a = sVar;
        this.f47051b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        s sVar = this.f47050a;
        sVar.h = document;
        sVar.f47420i = document;
        sVar.f47414a = 2;
        TL_iv.PageBlock pageBlock = this.f47051b.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f22386id;
        }
        p3 p3Var = this.f47052c;
        p3Var.V3.remove(sVar);
        p3Var.U2.N(false);
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void f(float f10) {
        this.f47050a.f47418f = f10;
        a aVar = this.f47051b;
        p3 p3Var = this.f47052c;
        View viewZ1 = p3Var.z1(aVar);
        if (viewZ1 instanceof x) {
            ((x) viewZ1).m(false);
            viewZ1.invalidate();
        }
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void onError() {
        s sVar = this.f47050a;
        sVar.f47414a = 3;
        p3 p3Var = this.f47052c;
        p3Var.V3.remove(sVar);
        int iIndexOf = p3Var.f47348h3.indexOf(this.f47051b);
        if (iIndexOf >= 0) {
            p3Var.f47348h3.remove(iIndexOf);
            p3Var.U2.N(true);
        }
        p3Var.f47340d3.onContentChanged();
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
