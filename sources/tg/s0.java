package tg;

import ai.f4;
import ai.o6;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.m20;
import org.telegram.ui.vy0;
import w7.x5;
public final class s0 extends eb {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final d0 f48407a0;
    public r0 f48408b0;
    public l0 f48409c0;

    public s0(n2 n2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(n2Var, false);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.v = 0.3f;
        this.Z = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f20038id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        m20 m20Var = new m20(getContext(), this.resourcesProvider, this.d);
        m20Var.setClickable(true);
        m20Var.setOrientation(1);
        m20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        m20Var.setBackgroundColor(i6.w0(i6.f20868h5, this.resourcesProvider));
        d0 d0Var = new d0(getContext(), this.resourcesProvider);
        this.f48407a0 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new vy0(23, this, chat));
        m20Var.addView(d0Var, x5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(m20Var, x5.f(-2.0f, 87, i11, 0, i11, 0));
        qm0 qm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new o6(24, this, chat));
        fixNavigationBar();
        O();
        T(false);
        tc.a(this.container, new Object());
    }

    public static void Q(s0 s0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = s0Var.X;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            if (lVar.getBoost().cooldown_until_date > 0) {
                new ad(s0Var.container, s0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(lVar.getBoost())) {
                arrayList.remove(lVar.getBoost());
            } else {
                arrayList.add(lVar.getBoost());
            }
            lVar.c(arrayList.contains(lVar.getBoost()), true);
            s0Var.T(true);
            s0Var.f48408b0.a(arrayList, chat);
        }
    }

    public static void R(s0 s0Var, TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(s0Var.currentAccount).getBoostsController().getBoostsStats(-chat.f20038id, new f4(s0Var, tL_premium_myBoosts, arrayList, hashSet, 18));
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }

    public final void T(boolean z10) {
        d0 d0Var = this.f48407a0;
        boolean z11 = false;
        d0Var.setShowZero(false);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            d0Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            d0Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        d0Var.b(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        d0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48409c0 = new l0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48409c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f48409c0.start();
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        return new m0(this);
    }
}
