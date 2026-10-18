package zh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s implements NotificationCenter.NotificationCenterDelegate {
    public final int f51827a;
    public final TLRPC.Document f51828b;
    public final int f51829c;
    public final org.telegram.ui.Wallet.x d;
    public boolean e;
    public boolean f51830f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, org.telegram.ui.Wallet.x xVar) {
        this.f51827a = i10;
        this.f51828b = document;
        this.f51829c = i11;
        this.d = xVar;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        if (!FileLoader.getInstance(i10).getPathToAttach(document, true).exists()) {
            FileLoader.getInstance(i10).loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f51830f && FileLoader.getInstance(this.f51827a).getPathToAttach(this.f51828b, true).exists()) {
            this.f51830f = true;
            NotificationCenter.getInstance(this.f51827a).removeObserver(this, NotificationCenter.fileLoaded);
            Utilities.globalQueue.postRunnable(new u2.q0(22, this, FileLoader.getInstance(this.f51827a).getPathToAttach(this.f51828b, true)));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}
