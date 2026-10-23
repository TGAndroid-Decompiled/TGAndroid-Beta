package zh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s implements NotificationCenter.NotificationCenterDelegate {
    public final int f52569a;
    public final TLRPC.Document f52570b;
    public final int f52571c;
    public final org.telegram.ui.Wallet.w d;
    public boolean e;
    public boolean f52572f;
    public boolean h;

    public s(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, org.telegram.ui.Wallet.w wVar) {
        this.f52569a = i10;
        this.f52570b = document;
        this.f52571c = i11;
        this.d = wVar;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        if (!FileLoader.getInstance(i10).getPathToAttach(document, true).exists()) {
            FileLoader.getInstance(i10).loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f52572f && FileLoader.getInstance(this.f52569a).getPathToAttach(this.f52570b, true).exists()) {
            this.f52572f = true;
            NotificationCenter.getInstance(this.f52569a).removeObserver(this, NotificationCenter.fileLoaded);
            Utilities.globalQueue.postRunnable(new u2.k0(23, this, FileLoader.getInstance(this.f52569a).getPathToAttach(this.f52570b, true)));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}
