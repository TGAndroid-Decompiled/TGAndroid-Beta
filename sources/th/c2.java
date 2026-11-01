package th;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.rz;
import org.telegram.messenger.y20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s40;
public final class c2 implements s40 {
    public final z2 f48843a;

    public c2(z2 z2Var) {
        this.f48843a = z2Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return this.f48843a.f49740k1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f48843a.f49733i2;
    }

    @Override
    public final View getFragmentView() {
        return this.f48843a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.f48843a.getContext());
    }

    @Override
    public final void u(ff ffVar, y20 y20Var, boolean z10, int i10, int i11, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z12;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        z2 z2Var = this.f48843a;
        TL_stories.StoryItem storyItem = z2Var.f49790x1.f49675a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = z2Var.f49740k1;
            if (ffVar.f14603b) {
                if (y20Var != null) {
                    accountInstance4 = z2Var.getAccountInstance();
                    String str = ffVar.I;
                    long j11 = z2Var.f49740k1;
                    ArrayList arrayList = ffVar.f14612n;
                    rz.b0(ffVar.f14621x, i10, i11, j11, 0L, j10, 0L, ffVar.f14602a, str, null, arrayList, accountInstance4, null, null, null, null, null, y20Var, null, storyItem, null, z10, false, ffVar.M);
                } else {
                    accountInstance3 = z2Var.getAccountInstance();
                    String str2 = ffVar.I;
                    long j12 = z2Var.f49740k1;
                    ArrayList arrayList2 = ffVar.f14612n;
                    rz.b0(ffVar.f14621x, i10, i11, j12, 0L, j10, 0L, ffVar.f14602a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, ffVar.M);
                }
            } else if (ffVar.h != null) {
                accountInstance2 = z2Var.getAccountInstance();
                rz.Z(accountInstance2, ffVar.h, ffVar.f14604c, null, z2Var.f49740k1, null, null, null, ffVar.f14612n, ffVar.f14616r, null, ffVar.f14621x, null, y20Var, z10, i10, false, ffVar.f14602a, null, 0L, j10, 0L, null);
            } else if (ffVar.I != null) {
                accountInstance = z2Var.getAccountInstance();
                rz.Z(accountInstance, ffVar.I, ffVar.f14604c, null, z2Var.f49740k1, null, null, null, ffVar.f14612n, ffVar.f14616r, null, ffVar.f14621x, null, y20Var, z10, i10, false, ffVar.f14602a, null, 0L, j10, 0L, null);
            }
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z2Var.i0(z12);
        }
    }
}
