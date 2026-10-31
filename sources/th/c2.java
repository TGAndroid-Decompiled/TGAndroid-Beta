package th;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.qz;
import org.telegram.messenger.x20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s40;
public final class c2 implements s40 {
    public final z2 f48829a;

    public c2(z2 z2Var) {
        this.f48829a = z2Var;
    }

    @Override
    public final long a() {
        return this.f48829a.f49726k1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f48829a.f49719i2;
    }

    @Override
    public final View getFragmentView() {
        return this.f48829a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.f48829a.getContext());
    }

    @Override
    public final void t(ef efVar, x20 x20Var, boolean z10, int i10, int i11, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z12;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        z2 z2Var = this.f48829a;
        TL_stories.StoryItem storyItem = z2Var.f49776x1.f49661a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = z2Var.f49726k1;
            if (efVar.f19507b) {
                if (x20Var != null) {
                    accountInstance4 = z2Var.getAccountInstance();
                    String str = efVar.I;
                    long j11 = z2Var.f49726k1;
                    ArrayList arrayList = efVar.f19516n;
                    qz.b0(efVar.f19525x, i10, i11, j11, 0L, j10, 0L, efVar.f19506a, str, null, arrayList, accountInstance4, null, null, null, null, null, x20Var, null, storyItem, null, z10, false, efVar.M);
                } else {
                    accountInstance3 = z2Var.getAccountInstance();
                    String str2 = efVar.I;
                    long j12 = z2Var.f49726k1;
                    ArrayList arrayList2 = efVar.f19516n;
                    qz.b0(efVar.f19525x, i10, i11, j12, 0L, j10, 0L, efVar.f19506a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, efVar.M);
                }
            } else if (efVar.h != null) {
                accountInstance2 = z2Var.getAccountInstance();
                qz.Z(accountInstance2, efVar.h, efVar.f19508c, null, z2Var.f49726k1, null, null, null, efVar.f19516n, efVar.f19520r, null, efVar.f19525x, null, x20Var, z10, i10, false, efVar.f19506a, null, 0L, j10, 0L, null);
            } else if (efVar.I != null) {
                accountInstance = z2Var.getAccountInstance();
                qz.Z(accountInstance, efVar.I, efVar.f19508c, null, z2Var.f49726k1, null, null, null, efVar.f19516n, efVar.f19520r, null, efVar.f19525x, null, x20Var, z10, i10, false, efVar.f19506a, null, 0L, j10, 0L, null);
            }
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z2Var.i0(z12);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
