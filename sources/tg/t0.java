package tg;

import ai.c5;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.za;
import org.telegram.ui.q20;
import org.telegram.ui.xy0;
import w7.x5;
public final class t0 extends za {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final e0 f43245a0;
    public s0 f43246b0;
    public m0 f43247c0;

    public t0(o2 o2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(o2Var, false);
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f18121id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        q20 q20Var = new q20(getContext(), this.resourcesProvider, this.d);
        q20Var.setClickable(true);
        q20Var.setOrientation(1);
        q20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        q20Var.setBackgroundColor(j6.v0(j6.f18933h5, this.resourcesProvider));
        e0 e0Var = new e0(getContext(), this.resourcesProvider);
        this.f43245a0 = e0Var;
        e0Var.k();
        e0Var.setCounterColor(-6785796);
        e0Var.setOnClickListener(new xy0(17, this, chat));
        q20Var.addView(e0Var, x5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(q20Var, x5.f(-2.0f, 87, i11, 0, i11, 0));
        ml0 ml0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new o6(24, this, chat));
        fixNavigationBar();
        N();
        S(false);
        oc.a(this.container, new Object());
    }

    public static void P(t0 t0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = t0Var.X;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            if (lVar.getBoost().cooldown_until_date > 0) {
                new vc(t0Var.container, t0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(lVar.getBoost())) {
                arrayList.remove(lVar.getBoost());
            } else {
                arrayList.add(lVar.getBoost());
            }
            lVar.c(arrayList.contains(lVar.getBoost()), true);
            t0Var.S(true);
            t0Var.f43246b0.a(arrayList, chat);
        }
    }

    public static void Q(t0 t0Var, TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(t0Var.currentAccount).getBoostsController().getBoostsStats(-chat.f18121id, new c5(t0Var, tL_premium_myBoosts, arrayList, hashSet, 1));
    }

    public final void S(boolean z10) {
        e0 e0Var = this.f43245a0;
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
        this.f43247c0 = new m0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43247c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f43247c0.start();
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        return new n0(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
