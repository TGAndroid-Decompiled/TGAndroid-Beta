package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class wq implements Runnable {
    public final int f44238a;
    public final Object f44239b;
    public final Object f44240c;

    public wq(int i9, Object obj, Object obj2) {
        this.f44238a = i9;
        this.f44239b = obj;
        this.f44240c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44238a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f44240c;
                jr jrVar = ((xq) this.f44239b).f44569a;
                if (org.telegram.ui.Components.oc.a(jrVar)) {
                    org.telegram.ui.Components.oc.C(jrVar, user.first_name).j();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.e0) this.f44239b).f27867q0.unsave((TL_aicompose.TL_aiComposeTone) this.f44240c);
                return;
            case 2:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.f44239b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f44240c;
                qVar.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 3:
                ky0 ky0Var = (ky0) this.f44240c;
                if (((boolean[]) this.f44239b)[0]) {
                    ky0Var.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f44239b;
                TLObject tLObject = (TLObject) this.f44240c;
                v9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.f44239b;
                CharSequence charSequence = (CharSequence) this.f44240c;
                gcVar.f28741n = true;
                org.telegram.ui.Components.lb lbVar = gcVar.f28733e;
                if (lbVar instanceof org.telegram.ui.Components.mb) {
                    org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) ((org.telegram.ui.Components.mb) lbVar);
                    nbVar.f31343b.setText(charSequence);
                    AndroidUtilities.updateViewShow(nbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(nbVar.f31343b, true, false, true);
                }
                gcVar.i(true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f44239b;
                Runnable runnable = (Runnable) this.f44240c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Components.ad) this.f44239b).removeView((kh.x3) this.f44240c);
                return;
            case 8:
                int i9 = ChatActivityEnterView.f26074i5;
                ((ChatActivityEnterView) this.f44239b).removeView((kh.x3) this.f44240c);
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f44239b;
                int i10 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.setFieldText((CharSequence) this.f44240c);
                chatActivityEnterView.S = null;
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f44239b;
                int i11 = ChatActivityEnterView.f26074i5;
                ((org.telegram.ui.Components.hd) this.f44240c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.M, chatActivityEnterView2.L2, true);
                return;
            case 11:
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.f44240c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.ig) this.f44239b).R;
                chatActivityEnterView3.f26102e1 = chatActivityEnterView3.f26095d1.getAudioRightMs() - chatActivityEnterView3.f26095d1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f26095d1.getAudioLeftMs(), chatActivityEnterView3.f26095d1.getAudioRightMs(), fgVar);
                return;
            case 12:
                ((org.telegram.ui.Components.ki) this.f44239b).containerView.removeView((kh.x3) this.f44240c);
                return;
            case 13:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f44240c;
                ((org.telegram.ui.Components.ki) this.f44239b).dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) this.f44239b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.di) this.f44240c).f27740c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                kiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(kiVar.F1).updateAttachMenuBotsInCache();
                return;
            case 15:
                org.telegram.ui.Components.ki kiVar2 = (org.telegram.ui.Components.ki) this.f44239b;
                MediaDataController.getInstance(kiVar2.F1).loadAttachMenuBots(false, true);
                if (kiVar2.f30160u0 == kiVar2.f30157t0.get(((TLRPC.TL_attachMenuBot) this.f44240c).bot_id)) {
                    kiVar2.Q1(kiVar2.f30114f0);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f44239b;
                viVar.D = false;
                viVar.E = (ArrayList) this.f44240c;
                viVar.O();
                return;
            case 17:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) this.f44239b;
                ((org.telegram.ui.Components.ki) this.f44240c).Z0();
                viVar2.K();
                viVar2.f27493b.X1(viVar2, 0);
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new wq(19, (org.telegram.ui.Components.oj) this.f44239b, ((org.telegram.ui.Components.nj) this.f44240c).run()));
                return;
            case 19:
                ((org.telegram.ui.Components.oj) this.f44239b).setStatus((CharSequence) this.f44240c);
                return;
            case 20:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) this.f44239b;
                String str = (String) this.f44240c;
                ekVar.getClass();
                ArrayList arrayList = new ArrayList(ekVar.T.v.f34980c);
                if (ekVar.T.v.d.isEmpty()) {
                    arrayList.addAll(0, ekVar.T.v.f34981e);
                }
                Utilities.searchQueue.postRunnable(new bg.d(ekVar, str, !ekVar.N.isEmpty(), arrayList, 15));
                return;
            case 21:
                org.telegram.ui.Components.ek ekVar2 = (org.telegram.ui.Components.ek) this.f44239b;
                ArrayList arrayList2 = (ArrayList) this.f44240c;
                org.telegram.ui.Components.fk fkVar = ekVar2.T;
                boolean z10 = fkVar.U;
                org.telegram.ui.Components.uj ujVar = fkVar.f28459r;
                if (z10) {
                    f2.r0 adapter = ujVar.getAdapter();
                    org.telegram.ui.Components.ek ekVar3 = fkVar.f28463y;
                    if (adapter != ekVar3) {
                        ujVar.setAdapter(ekVar3);
                    }
                }
                ekVar2.f28049s = arrayList2;
                ekVar2.l();
                return;
            case 22:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.f44239b;
                float[] fArr = (float[]) this.f44240c;
                xkVar.getClass();
                xkVar.a0(fArr[0], fArr[1]);
                return;
            case 23:
                org.telegram.ui.Components.ci ciVar = (org.telegram.ui.Components.ci) this.f44240c;
                boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                int currentItemTop = ciVar.getCurrentItemTop();
                int listTopPadding = ciVar.getListTopPadding();
                org.telegram.ui.Components.kl klVar = ((ChatAttachAlertPhotoLayout) this.f44239b).A;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                klVar.scrollBy(0, listTopPadding);
                return;
            case 24:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44240c;
                org.telegram.ui.Components.ul ulVar = ((ChatAttachAlertPhotoLayout) this.f44239b).L;
                if (ulVar != null) {
                    ulVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.ci ciVar2 = (org.telegram.ui.Components.ci) this.f44240c;
                int currentItemTop2 = ciVar2.getCurrentItemTop();
                int listTopPadding2 = ciVar2.getListTopPadding();
                gh.f1 f1Var = ((org.telegram.ui.Components.hm) this.f44239b).f29124r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                f1Var.scrollBy(0, listTopPadding2);
                return;
            case 26:
                org.telegram.ui.Components.yn.a(((org.telegram.ui.Components.wn) this.f44239b).f34298c);
                ((pf.h) this.f44240c).run();
                return;
            case 27:
                ((org.telegram.ui.Components.xo) this.f44239b).f34730b.x((List) this.f44240c);
                return;
            case 28:
                ((org.telegram.ui.Components.yo) this.f44239b).f35042b.x((List) this.f44240c);
                return;
            default:
                ((org.telegram.ui.ActionBar.f3) this.f44239b).dismiss();
                ve.e.s((Context) this.f44240c, "https://t.me/BotFather?start=deletebot");
                return;
        }
    }
}
