package ug;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.o20;
import org.telegram.ui.wy0;
import w7.x5;
public final class t0 extends bb {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final e0 f47237a0;
    public s0 f47238b0;
    public m0 f47239c0;

    public t0(n2 n2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f19896id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        o20 o20Var = new o20(getContext(), this.resourcesProvider, this.d);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        o20Var.setBackgroundColor(j6.v0(j6.f20761h5, this.resourcesProvider));
        e0 e0Var = new e0(getContext(), this.resourcesProvider);
        this.f47237a0 = e0Var;
        e0Var.k();
        e0Var.setCounterColor(-6785796);
        e0Var.setOnClickListener(new wy0(17, this, chat));
        o20Var.addView(e0Var, x5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(o20Var, x5.f(-2.0f, 87, i11, 0, i11, 0));
        ll0 ll0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new bi.x5(24, this, chat));
        fixNavigationBar();
        N();
        S(false);
        qc.a(this.container, new Object());
    }

    public static void P(t0 t0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = t0Var.X;
        if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            if (lVar.getBoost().cooldown_until_date > 0) {
                new yc(t0Var.container, t0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(lVar.getBoost())) {
                arrayList.remove(lVar.getBoost());
            } else {
                arrayList.add(lVar.getBoost());
            }
            lVar.c(arrayList.contains(lVar.getBoost()), true);
            t0Var.S(true);
            t0Var.f47238b0.a(arrayList, chat);
        }
    }

    public final void S(boolean z10) {
        e0 e0Var = this.f47237a0;
        boolean z11 = false;
        e0Var.setShowZero(false);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            e0Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            e0Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        e0Var.b(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        e0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47239c0 = new m0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47239c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f47239c0.start();
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        return new n0(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
