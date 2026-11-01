package th;

import java.util.HashMap;
import org.telegram.messenger.r20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class j4 implements r20 {
    public final int f49117a;
    public final e5 f49118b;

    public j4(e5 e5Var, int i10) {
        this.f49117a = i10;
        this.f49118b = e5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49117a) {
            case 0:
                x4 x4Var = (x4) obj;
                e5 e5Var = this.f49118b;
                HashMap hashMap = e5Var.H;
                int i10 = x4Var.e;
                int i11 = x4Var.f49648f;
                long j10 = x4Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j10));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j10));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = e5Var.G[i10];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j10));
                    return;
                }
                return;
            case 1:
                this.f49118b.f48921f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                e5 e5Var2 = this.f49118b;
                e5Var2.f48928n = false;
                if (tL_stories_allStories != null) {
                    e5Var2.b0(tL_stories_allStories, false, true, false);
                    e5Var2.T(false);
                    e5Var2.T(true);
                    return;
                }
                e5Var2.q();
                e5Var2.W();
                return;
        }
    }
}
