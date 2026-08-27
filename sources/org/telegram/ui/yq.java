package org.telegram.ui;

import android.content.Context;
import android.view.ViewParent;
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

public final class yq implements Runnable {

    public final int f44873a;

    public final Object f44874b;

    public final Object f44875c;

    public yq(int i10, Object obj, Object obj2) {
        this.f44873a = i10;
        this.f44874b = obj;
        this.f44875c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44873a) {
            case 0:
                zq zqVar = (zq) this.f44874b;
                TLRPC.User user = (TLRPC.User) this.f44875c;
                lr lrVar = zqVar.f45234a;
                if (org.telegram.ui.Components.mc.a(lrVar)) {
                    org.telegram.ui.Components.mc.C(lrVar, user.first_name).j();
                }
                break;
            case 1:
                ((org.telegram.ui.Components.e0) this.f44874b).f27893q0.unsave((TL_aicompose.TL_aiComposeTone) this.f44875c);
                break;
            case 2:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.f44874b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f44875c;
                qVar.getClass();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    n2VarU.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 3:
                boolean[] zArr = (boolean[]) this.f44874b;
                ky0 ky0Var = (ky0) this.f44875c;
                if (zArr[0]) {
                    ky0Var.run();
                }
                break;
            case 4:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.f44874b;
                TLObject tLObject = (TLObject) this.f44875c;
                t9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    t9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.ec ecVar = (org.telegram.ui.Components.ec) this.f44874b;
                CharSequence charSequence = (CharSequence) this.f44875c;
                ecVar.f28024n = true;
                ViewParent viewParent = ecVar.f28016e;
                if (viewParent instanceof org.telegram.ui.Components.kb) {
                    org.telegram.ui.Components.lb lbVar = (org.telegram.ui.Components.lb) ((org.telegram.ui.Components.kb) viewParent);
                    lbVar.f30639b.setText(charSequence);
                    AndroidUtilities.updateViewShow(lbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(lbVar.f30639b, true, false, true);
                }
                ecVar.i(true);
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) this.f44874b;
                Runnable runnable = (Runnable) this.f44875c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                }
                break;
            case 7:
                ((org.telegram.ui.Components.xc) this.f44874b).removeView((lh.w3) this.f44875c);
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f44874b;
                lh.w3 w3Var = (lh.w3) this.f44875c;
                int i10 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.removeView(w3Var);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f44874b;
                CharSequence charSequence2 = (CharSequence) this.f44875c;
                int i11 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.S = null;
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f44874b;
                org.telegram.ui.Components.ed edVar = (org.telegram.ui.Components.ed) this.f44875c;
                int i12 = ChatActivityEnterView.f26070i5;
                edVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.M, chatActivityEnterView3.L2, true);
                break;
            case 11:
                org.telegram.ui.Components.eg egVar = (org.telegram.ui.Components.eg) this.f44874b;
                org.telegram.ui.Components.bg bgVar = (org.telegram.ui.Components.bg) this.f44875c;
                ChatActivityEnterView chatActivityEnterView4 = egVar.R;
                chatActivityEnterView4.f26098e1 = chatActivityEnterView4.f26091d1.getAudioRightMs() - chatActivityEnterView4.f26091d1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.f26091d1.getAudioLeftMs(), chatActivityEnterView4.f26091d1.getAudioRightMs(), bgVar);
                break;
            case 12:
                ((org.telegram.ui.Components.gi) this.f44874b).containerView.removeView((lh.w3) this.f44875c);
                break;
            case 13:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.f44874b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f44875c;
                giVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                }
                break;
            case 14:
                org.telegram.ui.Components.gi giVar2 = (org.telegram.ui.Components.gi) this.f44874b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.zh) this.f44875c).f35239c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                giVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(giVar2.F1).updateAttachMenuBotsInCache();
                break;
            case 15:
                org.telegram.ui.Components.gi giVar3 = (org.telegram.ui.Components.gi) this.f44874b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.f44875c;
                MediaDataController.getInstance(giVar3.F1).loadAttachMenuBots(false, true);
                if (giVar3.f28696u0 == giVar3.f28693t0.get(tL_attachMenuBot2.bot_id)) {
                    giVar3.Q1(giVar3.f28650f0);
                }
                break;
            case 16:
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) this.f44874b;
                ArrayList arrayList = (ArrayList) this.f44875c;
                riVar.D = false;
                riVar.E = arrayList;
                riVar.P();
                break;
            case 17:
                org.telegram.ui.Components.ri riVar2 = (org.telegram.ui.Components.ri) this.f44874b;
                ((org.telegram.ui.Components.gi) this.f44875c).Z0();
                riVar2.L();
                riVar2.f34900b.X1(riVar2, 0);
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new yq(19, (org.telegram.ui.Components.kj) this.f44874b, ((org.telegram.ui.Components.jj) this.f44875c).run()));
                break;
            case 19:
                ((org.telegram.ui.Components.kj) this.f44874b).setStatus((CharSequence) this.f44875c);
                break;
            case 20:
                org.telegram.ui.Components.ak akVar = (org.telegram.ui.Components.ak) this.f44874b;
                String str = (String) this.f44875c;
                akVar.getClass();
                ArrayList arrayList2 = new ArrayList(akVar.T.v.f33096c);
                if (akVar.T.v.d.isEmpty()) {
                    arrayList2.addAll(0, akVar.T.v.f33097e);
                }
                Utilities.searchQueue.postRunnable(new cg.c(akVar, str, !akVar.N.isEmpty(), arrayList2, 14));
                break;
            case 21:
                org.telegram.ui.Components.ak akVar2 = (org.telegram.ui.Components.ak) this.f44874b;
                ArrayList arrayList3 = (ArrayList) this.f44875c;
                org.telegram.ui.Components.bk bkVar = akVar2.T;
                boolean z10 = bkVar.U;
                org.telegram.ui.Components.qj qjVar = bkVar.f27115r;
                if (z10) {
                    f2.q0 adapter = qjVar.getAdapter();
                    org.telegram.ui.Components.ak akVar3 = bkVar.f27119y;
                    if (adapter != akVar3) {
                        qjVar.setAdapter(akVar3);
                    }
                }
                akVar2.f26755s = arrayList3;
                akVar2.l();
                break;
            case 22:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.f44874b;
                float[] fArr = (float[]) this.f44875c;
                tkVar.getClass();
                tkVar.b0(fArr[0], fArr[1]);
                break;
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f44874b;
                org.telegram.ui.Components.yh yhVar = (org.telegram.ui.Components.yh) this.f44875c;
                boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                int currentItemTop = yhVar.getCurrentItemTop();
                int listTopPadding = yhVar.getListTopPadding();
                org.telegram.ui.Components.gl glVar = chatAttachAlertPhotoLayout.A;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                glVar.scrollBy(0, listTopPadding);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.f44874b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44875c;
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout2.L;
                if (qlVar != null) {
                    qlVar.setLayoutParams(layoutParams);
                }
                break;
            case 25:
                org.telegram.ui.Components.em emVar = (org.telegram.ui.Components.em) this.f44874b;
                org.telegram.ui.Components.yh yhVar2 = (org.telegram.ui.Components.yh) this.f44875c;
                int currentItemTop2 = yhVar2.getCurrentItemTop();
                int listTopPadding2 = yhVar2.getListTopPadding();
                hh.f1 f1Var = emVar.f28087r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                f1Var.scrollBy(0, listTopPadding2);
                break;
            case 26:
                org.telegram.ui.Components.un unVar = (org.telegram.ui.Components.un) this.f44874b;
                qf.i iVar = (qf.i) this.f44875c;
                org.telegram.ui.Components.wn.a(unVar.f33139c);
                iVar.run();
                break;
            case 27:
                ((org.telegram.ui.Components.vo) this.f44874b).f33467b.y((List) this.f44875c);
                break;
            case 28:
                ((org.telegram.ui.Components.wo) this.f44874b).f34304b.y((List) this.f44875c);
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f44874b;
                Context context = (Context) this.f44875c;
                e3Var.dismiss();
                we.e.s(context, "https://t.me/BotFather?start=deletebot");
                break;
        }
    }
}
