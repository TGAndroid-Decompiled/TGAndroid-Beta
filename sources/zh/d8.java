package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public class d8 {
    public static long f48354g;
    public final i5 f48355a;
    public final int f48356b;
    public final long f48357c;
    public int d;
    public boolean e;
    public final k5 f48358f = new k5(this, 10);

    public d8(int i10, long j3, i5 i5Var) {
        this.f48356b = i10;
        this.f48355a = i5Var;
        this.f48357c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.f48355a.y(this.f48357c);
        if (y3 != null && y3.stories != null) {
            int i10 = 0;
            while (i10 < y3.stories.size()) {
                i10 = com.google.android.gms.internal.vision.e2.d(y3.stories.get(i10).f17435id, i10, 1, arrayList);
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
        AndroidUtilities.cancelRunOnUIThread(this.f48358f);
        ConnectionsManager.getInstance(this.f48356b).cancelRequest(this.d, false);
        this.d = 0;
    }

    public final void c() {
        if (!this.e) {
            return;
        }
        long currentTimeMillis = 10000 - (System.currentTimeMillis() - f48354g);
        if (currentTimeMillis > 0) {
            k5 k5Var = this.f48358f;
            AndroidUtilities.cancelRunOnUIThread(k5Var);
            AndroidUtilities.runOnUIThread(k5Var, currentTimeMillis);
            return;
        }
        if (this.d == 0) {
            TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
            a(tL_stories_getStoriesViews.f17443id);
            if (!tL_stories_getStoriesViews.f17443id.isEmpty()) {
                int i10 = this.f48356b;
                tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.f48357c);
                this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new wh.s3(11, this, tL_stories_getStoriesViews));
                return;
            }
        }
        this.d = 0;
        this.e = false;
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.f48357c;
            i5 i5Var = this.f48355a;
            TL_stories.PeerStories y3 = i5Var.y(j3);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f17435id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                v5 v5Var = i5Var.f48506k;
                v5Var.f48990b.getStorageQueue().postRunnable(new t5(v5Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
