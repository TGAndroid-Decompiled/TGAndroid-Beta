package th;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends x4 {
    public final ArrayList C;

    public z4(int i10, ArrayList arrayList) {
        super(i10, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = this.f49636i;
        arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            i10 = this.f49633c;
            if (i11 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                jj jjVar = new jj(i10, storyItem);
                jjVar.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(jjVar);
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            zs.f(i10).k(zs.f19723x5, this);
        }
    }

    @Override
    public final jj f(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f49636i;
            if (i10 < arrayList.size()) {
                return (jj) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.f49636i.size();
    }

    @Override
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override
    public final int i() {
        return this.f49636i.size();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean q(int i10, List list, boolean z10) {
        return false;
    }

    @Override
    public final boolean r(int i10) {
        return false;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void x() {
    }
}
