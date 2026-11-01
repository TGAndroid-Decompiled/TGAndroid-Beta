package qh;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.d01;
import org.telegram.ui.web.v1;
public final class s implements vs {
    public final int f45744a;
    public final TLRPC.Document f45745b;
    public final int f45746c;
    public final d01 d;
    public boolean e;
    public boolean f45747f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, d01 d01Var) {
        this.f45744a = i10;
        this.f45745b = document;
        this.f45746c = i11;
        this.d = d01Var;
        at.f(i10).b(this, at.Y1);
        b8.G(i10);
        if (!b8.K(document, null, true, true).exists()) {
            b8.G(i10).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f45747f) {
            b8.G(this.f45744a);
            if (b8.K(this.f45745b, null, true, true).exists()) {
                this.f45747f = true;
                at.f(this.f45744a).n(this, at.Y1);
                b8.G(this.f45744a);
                Utilities.e.c(new v1(14, this, b8.K(this.f45745b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.Y1) {
            a();
        }
    }
}
