package zh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z implements NotificationCenter.NotificationCenterDelegate {
    public final int f52167a;
    public final TLRPC.Document f52168b;
    public final TLRPC.Document f52169c;
    public final int d;
    public final boolean e;
    public final v0 f52170f;
    public final v0 h;
    public boolean f52171n;
    public boolean f52172r;
    public boolean f52173s;
    public boolean v;
    public boolean f52174w;

    public z(int i10, TLRPC.Document document, TLRPC.Document document2, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, boolean z10, v0 v0Var, v0 v0Var2) {
        boolean z11;
        this.f52167a = i10;
        this.f52168b = document;
        this.f52169c = document2;
        this.d = i11;
        this.e = z10;
        this.f52170f = v0Var;
        this.h = v0Var2;
        if (document2 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.v = z11;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        FileLoader fileLoader = FileLoader.getInstance(i10);
        if (document2 != null && !b(document2).exists()) {
            fileLoader.loadFile(document2, tL_starGiftUnique, 3, 1);
        }
        if (!b(document).exists()) {
            fileLoader.loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f52171n) {
            TLRPC.Document document = this.f52169c;
            if (document != null && !this.f52172r && b(document).exists()) {
                this.f52172r = true;
                final File b10 = b(this.f52169c);
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final z f52143b;

                    {
                        this.f52143b = this;
                    }

                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: zh.y.run():void");
                    }
                });
            }
            if (!this.f52173s && b(this.f52168b).exists()) {
                this.f52173s = true;
                final File b11 = b(this.f52168b);
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final z f52143b;

                    {
                        this.f52143b = this;
                    }

                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: zh.y.run():void");
                    }
                });
            }
            if ((this.f52169c == null || this.f52172r) && this.f52173s) {
                NotificationCenter.getInstance(this.f52167a).removeObserver(this, NotificationCenter.fileLoaded);
            }
        }
    }

    public final File b(TLRPC.Document document) {
        return FileLoader.getInstance(this.f52167a).getPathToAttach(document, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}
