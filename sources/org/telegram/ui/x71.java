package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class x71 extends org.telegram.ui.Components.eb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d00 X;
    public final ci.d Y;
    public final ai.e9 Z;
    public final HashMap f43841a0;
    public final int f43842b0;
    public int f43843c0;
    public org.telegram.ui.Components.c71 f43844d0;

    public x71(org.telegram.ui.ActionBar.n2 r17, long r18, int r20, org.telegram.ui.Components.wc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x71.<init>(org.telegram.ui.ActionBar.n2, long, int, org.telegram.ui.Components.wc):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        int abs;
        org.telegram.ui.Components.d00 d00Var = this.X;
        int L0 = d00Var.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(d00Var.N0() - L0) + 1;
        }
        ai.e9 e9Var = this.Z;
        if (e9Var != null) {
            int i10 = L0 + abs;
            int i11 = e9Var.i();
            int i12 = this.f43842b0;
            if (i10 > i11 - i12) {
                e9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.p61 G;
        org.telegram.ui.Components.c71 c71Var = this.f43844d0;
        if (c71Var == null || i10 == 0 || (G = c71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f43841a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f29728e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f29728e = true;
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
            this.f43844d0.N(false);
            Q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43843c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f43843c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.pm0 x(org.telegram.ui.Components.qm0 qm0Var) {
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(qm0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.f43844d0 = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }
}
