package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class w71 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.nz X;
    public final di.d Y;
    public final bi.l8 Z;
    public final HashMap f41816a0;
    public final int f41817b0;
    public int f41818c0;
    public org.telegram.ui.Components.v51 f41819d0;

    public w71(org.telegram.ui.ActionBar.n2 r17, long r18, int r20, org.telegram.ui.Components.tc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w71.<init>(org.telegram.ui.ActionBar.n2, long, int, org.telegram.ui.Components.tc):void");
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.nz nzVar = this.X;
        int L0 = nzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(nzVar.N0() - L0) + 1;
        }
        bi.l8 l8Var = this.Z;
        if (l8Var != null) {
            int i10 = L0 + abs;
            int i11 = l8Var.i();
            int i12 = this.f41817b0;
            if (i10 > i11 - i12) {
                l8Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.h51 G;
        org.telegram.ui.Components.v51 v51Var = this.f41819d0;
        if (v51Var == null || i10 == 0 || (G = v51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f41816a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f26615e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f26615e = true;
                ((org.telegram.ui.Cells.t7) view).i(true, true);
            }
            di.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((bi.l8) objArr[0]) == this.Z) {
            this.f41819d0.N(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41818c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f41818c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.kl0 v(org.telegram.ui.Components.ll0 ll0Var) {
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(ll0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.f41819d0 = v51Var;
        v51Var.f31162r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
