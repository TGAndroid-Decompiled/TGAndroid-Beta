package zh;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class w4 {
    public final int f49003a;
    public final long f49004b;
    public final boolean f49005c;
    public boolean d;
    public boolean e;
    public boolean f49006f;
    public final ArrayList f49007g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f49008i;
    public final i5 f49009j;

    public w4(int i10, long j3, i5 i5Var) {
        boolean z10;
        this.f49009j = i5Var;
        this.f49003a = i10;
        this.f49004b = j3;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49005c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f49005c || this.f49009j.i(this.f49004b)) && this.f49006f && this.h.size() < MessagesController.getInstance(this.f49003a).config.storiesAlbumsLimit.get()) {
            return true;
        }
        return false;
    }

    public final b5 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                b5 b5Var = (b5) arrayList.get(i11);
                if (i10 == b5Var.f48308a) {
                    return b5Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final int c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (i10 == ((b5) arrayList.get(i11)).f48308a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f49006f) {
            this.e = true;
            boolean z10 = this.d;
            long j3 = this.f49004b;
            int i10 = this.f49003a;
            if (!z10) {
                MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j3, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        AndroidUtilities.runOnUIThread(new yg.q(15, w4.this, (List) obj));
                    }

                    public Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new bi.c2(this, 29));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f49003a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.f49004b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((b5) obj).f48308a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f49003a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j3 = this.f49004b;
        messagesStorage.saveStoryAlbumsCache(j3, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j3), this);
        }
    }
}
