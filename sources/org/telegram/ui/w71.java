package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class w71 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.e00 X;
    public final ci.d Y;
    public final ai.e9 Z;
    public final HashMap f43231a0;
    public final int f43232b0;
    public int f43233c0;
    public org.telegram.ui.Components.e71 f43234d0;

    public w71(org.telegram.ui.ActionBar.m2 r17, long r18, int r20, org.telegram.ui.Components.vc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w71.<init>(org.telegram.ui.ActionBar.m2, long, int, org.telegram.ui.Components.vc):void");
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
            int i12 = this.f43232b0;
            if (i10 > i11 - i12) {
                e9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.r61 G;
        org.telegram.ui.Components.e71 e71Var = this.f43234d0;
        if (e71Var == null || i10 == 0 || (G = e71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f43231a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f30355e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f30355e = true;
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
            this.f43234d0.N(false);
            Q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43233c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f43233c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.rm0 x(org.telegram.ui.Components.sm0 sm0Var) {
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(sm0Var, getContext(), this.currentAccount, 0, false, new a5(this, 25), this.resourcesProvider);
        this.f43234d0 = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
