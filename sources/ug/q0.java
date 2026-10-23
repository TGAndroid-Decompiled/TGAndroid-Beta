package ug;

import ai.cd;
import android.view.View;
import android.view.ViewGroup;
import ci.x4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import w7.z5;
public final class q0 extends bb {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final b0 f48193a0;
    public p0 f48194b0;
    public j0 f48195c0;

    public q0(o2 o2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f20343id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        cd cdVar = new cd(getContext(), this.resourcesProvider, this.d);
        cdVar.setClickable(true);
        cdVar.setOrientation(1);
        cdVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        r6.i(k6.f21254h5, cdVar, this.resourcesProvider);
        b0 b0Var = new b0(getContext(), this.resourcesProvider);
        this.f48193a0 = b0Var;
        b0Var.k();
        b0Var.setCounterColor(-6785796);
        b0Var.setOnClickListener(new org.telegram.ui.web.c(5, this, chat));
        cdVar.addView(b0Var, z5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(cdVar, z5.f(-2.0f, 87, i11, 0, i11, 0));
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new x4(24, this, chat));
        fixNavigationBar();
        N();
        S(false);
        qc.a(this.container, new Object());
    }

    public static void P(q0 q0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = q0Var.X;
        if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            if (kVar.getBoost().cooldown_until_date > 0) {
                new xc(q0Var.container, q0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(kVar.getBoost())) {
                arrayList.remove(kVar.getBoost());
            } else {
                arrayList.add(kVar.getBoost());
            }
            kVar.c(arrayList.contains(kVar.getBoost()), true);
            q0Var.S(true);
            q0Var.f48194b0.a(arrayList, chat);
        }
    }

    public final void S(boolean z10) {
        b0 b0Var = this.f48193a0;
        boolean z11 = false;
        b0Var.setShowZero(false);
        ArrayList arrayList = this.X;
        if (arrayList.size() > 1) {
            b0Var.i(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            b0Var.i(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        b0Var.b(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        b0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48195c0 = new j0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48195c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f48195c0.start();
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        return new k0(this);
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
