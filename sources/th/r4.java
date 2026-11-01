package th;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jj;
public final class r4 extends x4 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public r4(int i10, String str, String str2) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override
    public final kj f(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f49650i;
            if (i10 < arrayList.size()) {
                return (kj) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.J;
    }

    @Override
    public final ArrayList h() {
        return this.F;
    }

    @Override
    public final int i() {
        return this.f49650i.size();
    }

    @Override
    public final boolean k() {
        return this.G;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean q(int i10, List list, boolean z10) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i10;
        String str = this.C;
        if (str != null) {
            tL_stories_searchPosts.flags |= 1;
            tL_stories_searchPosts.hashtag = str;
        }
        TL_stories.MediaArea mediaArea = this.E;
        if (mediaArea != null) {
            tL_stories_searchPosts.flags |= 2;
            tL_stories_searchPosts.area = mediaArea;
        }
        this.G = true;
        String str2 = this.D;
        boolean isEmpty = TextUtils.isEmpty(str2);
        TLObject tLObject = null;
        int i11 = this.f49647c;
        if (!isEmpty) {
            TLObject e22 = wp.r1(i11).e2(str2);
            if (e22 == null) {
                wp.r1(i11).c2().a(str2, null, new jj(this, z10, i10, list));
                return true;
            }
            tLObject = e22;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = wp.j1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_searchPosts, new ag.c(this, 20));
        return true;
    }

    @Override
    public final boolean r(int i10) {
        return false;
    }

    public r4(int i10, TL_stories.MediaArea mediaArea) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
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
