package ug;

import ai.bd;
import android.view.View;
import android.view.ViewGroup;
import ci.y4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import w7.z5;
public final class r0 extends bb {
    public final ArrayList X;
    public final ArrayList Y;
    public final TLRPC.Chat Z;
    public final c0 f47751a0;
    public q0 f47752b0;
    public k0 f47753c0;

    public r0(n2 n2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f20273id)) {
                this.Y.add(tL_myBoost2);
            }
        }
        bd bdVar = new bd(getContext(), this.resourcesProvider, this.d);
        bdVar.setClickable(true);
        bdVar.setOrientation(1);
        bdVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        bdVar.setBackgroundColor(h6.w0(h6.f21058h5, this.resourcesProvider));
        c0 c0Var = new c0(getContext(), this.resourcesProvider);
        this.f47751a0 = c0Var;
        c0Var.k();
        c0Var.setCounterColor(-6785796);
        c0Var.setOnClickListener(new qg.n(4, this, chat));
        bdVar.addView(c0Var, z5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(bdVar, z5.f(-2.0f, 87, i11, 0, i11, 0));
        im0 im0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        im0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new y4(24, this, chat));
        fixNavigationBar();
        O();
        T(false);
        qc.a(this.container, new Object());
    }

    public static void Q(r0 r0Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = r0Var.X;
        if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            if (kVar.getBoost().cooldown_until_date > 0) {
                new xc(r0Var.container, r0Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(kVar.getBoost())) {
                arrayList.remove(kVar.getBoost());
            } else {
                arrayList.add(kVar.getBoost());
            }
            kVar.c(arrayList.contains(kVar.getBoost()), true);
            r0Var.T(true);
            r0Var.f47752b0.a(arrayList, chat);
        }
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }

    public final void T(boolean z10) {
        c0 c0Var = this.f47751a0;
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
        this.f47753c0 = new k0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47753c0.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.f47753c0.start();
    }

    @Override
    public final hm0 x(im0 im0Var) {
        return new l0(this);
    }
}
