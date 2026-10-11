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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.l20;
import org.telegram.ui.uy0;
import w7.x5;
public final class r0 extends db {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final c0 f48471a0;
    public q0 f48472b0;
    public k0 f48473c0;

    public r0(m2 m2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(m2Var, false);
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f20032id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        l20 l20Var = new l20(getContext(), this.resourcesProvider, this.d);
        l20Var.setClickable(true);
        l20Var.setOrientation(1);
        l20Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l20Var.setBackgroundColor(h6.w0(h6.f20857h5, this.resourcesProvider));
        c0 c0Var = new c0(getContext(), this.resourcesProvider);
        this.f48471a0 = c0Var;
        c0Var.k();
        c0Var.setCounterColor(-6785796);
        c0Var.setOnClickListener(new uy0(23, this, chat));
        l20Var.addView(c0Var, x5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(l20Var, x5.f(-2.0f, 87, i11, 0, i11, 0));
        sm0 sm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new o6(24, this, chat));
        fixNavigationBar();
        O();
        T(false);
        sc.a(this.container, new Object());
    }

    public static void Q(r0 r0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = r0Var.X;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            if (lVar.getBoost().cooldown_until_date > 0) {
                new ad(r0Var.container, r0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(lVar.getBoost())) {
                arrayList.remove(lVar.getBoost());
            } else {
                arrayList.add(lVar.getBoost());
            }
            lVar.c(arrayList.contains(lVar.getBoost()), true);
            r0Var.T(true);
            r0Var.f48472b0.a(arrayList, chat);
        }
    }

    public static void R(r0 r0Var, TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(r0Var.currentAccount).getBoostsController().getBoostsStats(-chat.f20032id, new f4(r0Var, tL_premium_myBoosts, arrayList, hashSet, 18));
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }

    public final void T(boolean z10) {
        c0 c0Var = this.f48471a0;
        boolean z11 = false;
        c0Var.setShowZero(false);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            c0Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            c0Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        c0Var.b(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        c0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48473c0 = new k0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48473c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f48473c0.start();
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        return new l0(this);
    }
}
