package th;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class t4 {
    public final int f49472a;
    public final long f49473b;
    public final boolean f49474c;
    public boolean d;
    public boolean e;
    public boolean f49475f;
    public final ArrayList f49476g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean f49477i;
    public final e5 f49478j;

    public t4(int i10, long j10, e5 e5Var) {
        boolean z10;
        this.f49478j = e5Var;
        this.f49472a = i10;
        this.f49473b = j10;
        if (j10 == e20.i(i10).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49474c = z10;
        d();
    }

    public final boolean a() {
        if ((this.f49474c || this.f49478j.i(this.f49473b)) && this.f49475f && this.h.size() < ((org.telegram.messenger.l0) wp.r1(this.f49472a).f19300y7.f18047u.f10701a).f16855c) {
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
                if (i10 == y4Var.f49694a) {
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
                if (i10 == ((y4) arrayList.get(i11)).f49694a) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void d() {
        if (!this.e && !this.f49475f) {
            this.e = true;
            boolean z10 = this.d;
            long j10 = this.f49473b;
            int i10 = this.f49472a;
            if (!z10) {
                is a02 = is.a0(i10);
                a02.f16331a.c(new org.telegram.messenger.d4(a02, j10, new s4(this), 23));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = wp.r1(i10).i1(j10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new ag.c(this, 21));
        }
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.f49472a;
        tL_reorderAlbums.peer = wp.r1(i10).i1(this.f49473b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((y4) obj).f49694a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.f49472a;
        is a02 = is.a0(i10);
        org.telegram.messenger.r5 r5Var = a02.f16331a;
        long j10 = this.f49473b;
        r5Var.c(new org.telegram.messenger.d4(a02, j10, this.h, 26));
        if (z10) {
            at.f(i10).k(at.f14731j3, Long.valueOf(j10), this);
        }
    }
}
