package th;

import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class x7 {
    public static long f49669g;
    public final e5 f49670a;
    public final int f49671b;
    public final long f49672c;
    public int d;
    public boolean e;
    public final sg.v f49673f = new sg.v(this, 24);

    public x7(int i10, long j10, e5 e5Var) {
        this.f49671b = i10;
        this.f49670a = e5Var;
        this.f49672c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f49670a.y(this.f49672c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = c3.i0.j(y3.stories.get(i10).f20032id, i10, 1, arrayList);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.e == z10) {
            return;
        }
        if (z10) {
            this.e = true;
            c();
            return;
        }
        this.e = false;
        org.telegram.messenger.i0.r(this.f49673f);
        ConnectionsManager.getInstance(this.f49671b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f49669g);
        if (currentTimeMillis > 0) {
            sg.v vVar = this.f49673f;
            org.telegram.messenger.i0.r(vVar);
            org.telegram.messenger.i0.h3(vVar, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f20040id);
            if (!tL_stories_getStoriesViews.f20040id.isEmpty()) {
                int i10 = this.f49671b;
                tL_stories_getStoriesViews.peer = wp.r1(i10).i1(this.f49672c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new rh.h5(5, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.f49672c;
            e5 e5Var = this.f49670a;
            TL_stories.PeerStories y3 = e5Var.y(j10);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20032id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                r5 r5Var = e5Var.f48925k;
                r5Var.f49426b.f16331a.c(new q5(r5Var, y3, 0));
                return true;
            }
        }
        return false;
    }
}
