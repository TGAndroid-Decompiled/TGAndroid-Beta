package vg;

import android.view.View;
import android.view.ViewGroup;
import bi.sc;
import di.x4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
public final class s0 extends bb {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final d0 f50290a0;
    public r0 f50291b0;
    public l0 f50292c0;

    public s0(r2 r2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(r2Var, false);
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f22028id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        sc scVar = new sc(getContext(), this.resourcesProvider, this.d);
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f7.i(y6.f23428h5, scVar, this.resourcesProvider);
        d0 d0Var = new d0(getContext(), this.resourcesProvider);
        this.f50290a0 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new org.telegram.ui.web.c(5, this, chat));
        scVar.addView(d0Var, kb1.u(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(scVar, kb1.j(-2.0f, 87, i11, 0, i11, 0));
        nm0 nm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new x4(24, this, chat));
        fixNavigationBar();
        N();
        S(false);
        qc.a(this.container, new Object());
    }

    public static void P(s0 s0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = s0Var.X;
        if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            if (lVar.getBoost().cooldown_until_date > 0) {
                new wc(s0Var.container, s0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(lVar.getBoost())) {
                arrayList.remove(lVar.getBoost());
            } else {
                arrayList.add(lVar.getBoost());
            }
            lVar.c(arrayList.contains(lVar.getBoost()), true);
            s0Var.S(true);
            s0Var.f50291b0.a(arrayList, chat);
        }
    }

    public final void S(boolean z10) {
        d0 d0Var = this.f50290a0;
        boolean z11 = false;
        d0Var.setShowZero(false);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            d0Var.i(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            d0Var.i(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
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
        this.f50292c0 = new l0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50292c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f50292c0.start();
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        return new m0(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
