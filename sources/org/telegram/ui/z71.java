package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class z71 extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.uz X;
    public final bi.d Y;
    public final zh.a5 Z;
    public final HashMap f39223a0;
    public final int f39224b0;
    public int f39225c0;
    public org.telegram.ui.Components.j61 f39226d0;

    public z71(org.telegram.ui.ActionBar.p2 r17, long r18, int r20, org.telegram.ui.Components.sc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z71.<init>(org.telegram.ui.ActionBar.p2, long, int, org.telegram.ui.Components.sc):void");
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.uz uzVar = this.X;
        int L0 = uzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(uzVar.N0() - L0) + 1;
        }
        zh.a5 a5Var = this.Z;
        if (a5Var != null) {
            int i10 = L0 + abs;
            int i11 = a5Var.i();
            int i12 = this.f39224b0;
            if (i10 > i11 - i12) {
                a5Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.v51 G;
        org.telegram.ui.Components.j61 j61Var = this.f39226d0;
        if (j61Var == null || i10 == 0 || (G = j61Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f39223a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.u7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.u7) view).i(true, true);
            }
            bi.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((zh.a5) objArr[0]) == this.Z) {
            this.f39226d0.N(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39225c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f39225c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(vl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.f39226d0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
