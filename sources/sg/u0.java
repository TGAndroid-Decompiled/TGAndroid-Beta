package sg;

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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.p20;
import org.telegram.ui.w71;
import w7.a6;
public final class u0 extends ab {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final d0 f42010a0;
    public t0 f42011b0;
    public n0 f42012c0;

    public u0(p2 p2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(p2Var, false);
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f17195id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        p20 p20Var = new p20(getContext(), this.resourcesProvider, this.d);
        p20Var.setClickable(true);
        p20Var.setOrientation(1);
        p20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        p20Var.setBackgroundColor(j6.v0(j6.f17998h5, this.resourcesProvider));
        d0 d0Var = new d0(getContext(), this.resourcesProvider);
        this.f42010a0 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new w71(13, this, chat));
        p20Var.addView(d0Var, a6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(p20Var, a6.f(-2.0f, 87, i11, 0, i11, 0));
        vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new ai.b0(23, this, chat));
        fixNavigationBar();
        N();
        S(false);
        pc.a(this.container, new Object());
    }

    public static void P(u0 u0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = u0Var.X;
        if (view instanceof wg.k) {
            wg.k kVar = (wg.k) view;
            if (kVar.getBoost().cooldown_until_date > 0) {
                new wc(u0Var.container, u0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(kVar.getBoost())) {
                arrayList.remove(kVar.getBoost());
            } else {
                arrayList.add(kVar.getBoost());
            }
            kVar.c(arrayList.contains(kVar.getBoost()), true);
            u0Var.S(true);
            u0Var.f42011b0.a(arrayList, chat);
        }
    }

    public static void Q(u0 u0Var, TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(u0Var.currentAccount).getBoostsController().getBoostsStats(-chat.f17195id, new l0(u0Var, tL_premium_myBoosts, arrayList, hashSet, 0));
    }

    public final void S(boolean z10) {
        d0 d0Var = this.f42010a0;
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
        this.f42012c0 = new n0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42012c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f42012c0.start();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        return new o0(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
