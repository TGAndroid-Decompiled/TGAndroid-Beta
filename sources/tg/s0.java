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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.o20;
import org.telegram.ui.vy0;
import w7.y5;
public final class s0 extends ab {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final d0 f43521a0;
    public r0 f43522b0;
    public l0 f43523c0;

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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f18343id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        o20 o20Var = new o20(getContext(), this.resourcesProvider, this.d);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        o20Var.setBackgroundColor(j6.v0(j6.f19180h5, this.resourcesProvider));
        d0 d0Var = new d0(getContext(), this.resourcesProvider);
        this.f43521a0 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new vy0(17, this, chat));
        o20Var.addView(d0Var, y5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(o20Var, y5.f(-2.0f, 87, i11, 0, i11, 0));
        yl0 yl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new o6(24, this, chat));
        fixNavigationBar();
        N();
        S(false);
        pc.a(this.container, new Object());
    }

    public static void P(s0 s0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = s0Var.X;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            if (lVar.getBoost().cooldown_until_date > 0) {
                new xc(s0Var.container, s0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(lVar.getBoost())) {
                arrayList.remove(lVar.getBoost());
            } else {
                arrayList.add(lVar.getBoost());
            }
            lVar.c(arrayList.contains(lVar.getBoost()), true);
            s0Var.S(true);
            s0Var.f43522b0.a(arrayList, chat);
        }
    }

    public static void Q(s0 s0Var, TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(s0Var.currentAccount).getBoostsController().getBoostsStats(-chat.f18343id, new c5(s0Var, tL_premium_myBoosts, arrayList, hashSet, 1));
    }

    public final void S(boolean z10) {
        d0 d0Var = this.f43521a0;
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
        this.f43523c0 = new l0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43523c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f43523c0.start();
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        return new m0(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
