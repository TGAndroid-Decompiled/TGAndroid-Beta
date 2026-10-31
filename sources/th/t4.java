package th;

import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class t4 {
    public final int f49458a;
    public final long f49459b;
    public final boolean f49460c;
    public boolean d;
    public boolean e;
    public boolean f49461f;
    public final ArrayList f49462g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f49463i;
    public final e5 f49464j;

    public t4(int i10, long j10, e5 e5Var) {
        boolean z10;
        this.f49464j = e5Var;
        this.f49458a = i10;
        this.f49459b = j10;
        if (j10 == d20.i(i10).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49460c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f49460c || this.f49464j.i(this.f49459b)) && this.f49461f && this.h.size() < ((org.telegram.messenger.l0) vp.r1(this.f49458a).f18957y7.f17855u.f10700a).f16658c) {
            return true;
        }
        return false;
    }

    public final y4 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                y4 y4Var = (y4) arrayList.get(i11);
                if (i10 == y4Var.f49680a) {
                    return y4Var;
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
                if (i10 == ((y4) arrayList.get(i11)).f49680a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f49461f) {
            this.e = true;
            boolean z10 = this.d;
            long j10 = this.f49459b;
            int i10 = this.f49458a;
            if (!z10) {
                hs a02 = hs.a0(i10);
                a02.f15938a.c(new org.telegram.messenger.d4(a02, j10, new s4(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = vp.r1(i10).i1(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new ag.c(this, 21));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f49458a;
        tL_reorderAlbums.peer = vp.r1(i10).i1(this.f49459b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((y4) obj).f49680a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f49458a;
        hs a02 = hs.a0(i10);
        org.telegram.messenger.r5 r5Var = a02.f15938a;
        long j10 = this.f49459b;
        r5Var.c(new org.telegram.messenger.d4(a02, j10, this.h, 26));
        if (z10) {
            zs.f(i10).k(zs.f19635j3, Long.valueOf(j10), this);
        }
    }
}
