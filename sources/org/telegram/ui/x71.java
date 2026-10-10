package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class x71 extends org.telegram.ui.Components.eb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.e00 X;
    public final ci.d Y;
    public final ai.e9 Z;
    public final HashMap f43887a0;
    public final int f43888b0;
    public int f43889c0;
    public org.telegram.ui.Components.d71 f43890d0;

    public x71(org.telegram.ui.ActionBar.n2 r17, long r18, int r20, org.telegram.ui.Components.wc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x71.<init>(org.telegram.ui.ActionBar.n2, long, int, org.telegram.ui.Components.wc):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        int abs;
        org.telegram.ui.Components.e00 e00Var = this.X;
        int L0 = e00Var.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(e00Var.N0() - L0) + 1;
        }
        ai.e9 e9Var = this.Z;
        if (e9Var != null) {
            int i10 = L0 + abs;
            int i11 = e9Var.i();
            int i12 = this.f43888b0;
            if (i10 > i11 - i12) {
                e9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.q61 G;
        org.telegram.ui.Components.d71 d71Var = this.f43890d0;
        if (d71Var == null || i10 == 0 || (G = d71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f43887a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f30057e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f30057e = true;
                ((org.telegram.ui.Cells.t7) view).i(true, true);
            }
            ci.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ai.e9) objArr[0]) == this.Z) {
            this.f43890d0.N(false);
            Q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43889c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f43889c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.qm0 x(org.telegram.ui.Components.rm0 rm0Var) {
        org.telegram.ui.Components.d71 d71Var = new org.telegram.ui.Components.d71(rm0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.f43890d0 = d71Var;
        d71Var.f25587r = false;
        return d71Var;
    }
}
