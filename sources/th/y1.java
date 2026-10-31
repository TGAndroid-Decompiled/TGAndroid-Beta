package th;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.qz;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nj;
public final class y1 implements nj {
    public final z2 f49660a;

    public y1(z2 z2Var) {
        this.f49660a = z2Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.k2 k2Var = this.f49660a.f49755s0.f49303f;
            if (k2Var.getParentActivity() == null) {
                return;
            }
            k2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        boolean z12;
        z2 z2Var = this.f49660a;
        TL_stories.StoryItem storyItem = z2Var.f49776x1.f49661a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = z2Var.getAccountInstance();
            qz.V(i10, z2Var.f49726k1, 0L, j11, 0L, null, str, null, arrayList, arrayList, null, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, z10, false);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z2Var.i0(z12);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
