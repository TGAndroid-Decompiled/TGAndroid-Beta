package qh;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.f11;
import org.telegram.ui.web.v1;
public final class s implements us {
    public final int f45733a;
    public final TLRPC.Document f45734b;
    public final int f45735c;
    public final f11 d;
    public boolean e;
    public boolean f45736f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, f11 f11Var) {
        this.f45733a = i10;
        this.f45734b = document;
        this.f45735c = i11;
        this.d = f11Var;
        zs.f(i10).b(this, zs.Y1);
        b8.G(i10);
        if (!b8.K(document, null, true, true).exists()) {
            b8.G(i10).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f45736f) {
            b8.G(this.f45733a);
            if (b8.K(this.f45734b, null, true, true).exists()) {
                this.f45736f = true;
                zs.f(this.f45733a).n(this, zs.Y1);
                b8.G(this.f45733a);
                Utilities.e.c(new v1(13, this, b8.K(this.f45734b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
            a();
        }
    }
}
