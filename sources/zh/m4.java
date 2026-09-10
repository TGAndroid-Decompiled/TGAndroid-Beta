package zh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class m4 implements e2.h {
    public final int f48686a;
    public final i5 f48687b;

    public m4(i5 i5Var, int i10) {
        this.f48686a = i10;
        this.f48687b = i5Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f48686a) {
            case 0:
                this.f48687b.f48502f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                i5 i5Var = this.f48687b;
                i5Var.f48509n = false;
                if (tL_stories_allStories != null) {
                    i5Var.Y(tL_stories_allStories, false, true, false);
                    i5Var.Q(false);
                    i5Var.Q(true);
                    return;
                }
                i5Var.q();
                i5Var.T();
                return;
        }
    }
}
