package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class w71 extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.nz X;
    public final ci.d Y;
    public final ai.d9 Z;
    public final HashMap f38690a0;
    public final int f38691b0;
    public int f38692c0;
    public org.telegram.ui.Components.k61 f38693d0;

    public w71(org.telegram.ui.ActionBar.n2 r17, long r18, int r20, org.telegram.ui.Components.sc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w71.<init>(org.telegram.ui.ActionBar.n2, long, int, org.telegram.ui.Components.sc):void");
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
        ai.d9 d9Var = this.Z;
        if (d9Var != null) {
            int i10 = L0 + abs;
            int i11 = d9Var.i();
            int i12 = this.f38691b0;
            if (i10 > i11 - i12) {
                d9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.w51 G;
        org.telegram.ui.Components.k61 k61Var = this.f38693d0;
        if (k61Var == null || i10 == 0 || (G = k61Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f38690a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.u7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.u7) view).i(true, true);
            }
            ci.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ai.d9) objArr[0]) == this.Z) {
            this.f38693d0.N(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38692c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f38692c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        org.telegram.ui.Components.k61 k61Var = new org.telegram.ui.Components.k61(vl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.f38693d0 = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
