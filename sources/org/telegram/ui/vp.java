package org.telegram.ui;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vp implements Runnable {
    public final int f40745a;
    public final Object f40746b;
    public final Object f40747c;

    public vp(int i10, Object obj, Object obj2) {
        this.f40745a = i10;
        this.f40746b = obj;
        this.f40747c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40745a) {
            case 0:
                wp wpVar = (wp) this.f40746b;
                wpVar.getClass();
                ((TLRPC.Chat) this.f40747c).join_request = true;
                wpVar.h = true;
                wpVar.f26686c.setChecked(true);
                return;
            case 1:
                yr yrVar = (yr) this.f40746b;
                yrVar.getClass();
                yrVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f40747c).chats.get(0).f18916id, 0, true);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.f40747c;
                yr yrVar2 = ((nr) this.f40746b).f38464a;
                if (org.telegram.ui.Components.zc.a(yrVar2)) {
                    org.telegram.ui.Components.zc.C(yrVar2, user.first_name).j();
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.e0) this.f40746b).f24235u0.unsave((TL_aicompose.TL_aiComposeTone) this.f40747c);
                return;
            case 4:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.f40746b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f40747c;
                qVar.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 5:
                tz0 tz0Var = (tz0) this.f40747c;
                if (((boolean[]) this.f40746b)[0]) {
                    tz0Var.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f40746b;
                TLObject tLObject = (TLObject) this.f40747c;
                faVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    faVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f40746b;
                CharSequence charSequence = (CharSequence) this.f40747c;
                scVar.f28809n = true;
                org.telegram.ui.Components.wb wbVar = scVar.e;
                if (wbVar instanceof org.telegram.ui.Components.xb) {
                    org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ((org.telegram.ui.Components.xb) wbVar);
                    ybVar.f23192b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ybVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ybVar.f23192b, true, false, true);
                }
                scVar.i(true);
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.f40746b;
                Runnable runnable = (Runnable) this.f40747c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Components.md) this.f40746b).removeView((di.d4) this.f40747c);
                return;
            case 10:
                int i10 = ChatActivityEnterView.f22549n5;
                ((ChatActivityEnterView) this.f40746b).removeView((di.d4) this.f40747c);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f40746b;
                int i11 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f40747c);
                chatActivityEnterView.W = null;
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f40746b;
                int i12 = ChatActivityEnterView.f22549n5;
                ((org.telegram.ui.Components.td) this.f40747c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 13:
                org.telegram.ui.Components.qg qgVar = (org.telegram.ui.Components.qg) this.f40747c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.tg) this.f40746b).V;
                chatActivityEnterView3.f22602i1 = chatActivityEnterView3.f22596h1.getAudioRightMs() - chatActivityEnterView3.f22596h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22596h1.getAudioLeftMs(), chatActivityEnterView3.f22596h1.getAudioRightMs(), qgVar);
                return;
            case 14:
                ((org.telegram.ui.Components.vi) this.f40746b).containerView.removeView((di.d4) this.f40747c);
                return;
            case 15:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f40747c;
                ((org.telegram.ui.Components.vi) this.f40746b).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f40747c;
                if (!((org.telegram.ui.Components.vi) this.f40746b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f40746b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.oi) this.f40747c).f27652c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.M1).updateAttachMenuBotsInCache();
                return;
            case 18:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) this.f40746b;
                MediaDataController.getInstance(viVar2.M1).loadAttachMenuBots(false, true);
                if (viVar2.B0 == viVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f40747c).bot_id)) {
                    viVar2.U1(viVar2.f29684j0);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) this.f40746b;
                hjVar.G = false;
                hjVar.H = (ArrayList) this.f40747c;
                hjVar.S();
                return;
            case 20:
                org.telegram.ui.Components.hj hjVar2 = (org.telegram.ui.Components.hj) this.f40746b;
                ((org.telegram.ui.Components.vi) this.f40747c).b1();
                hjVar2.O();
                hjVar2.f27360b.b2(hjVar2, 0);
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new vp(22, (org.telegram.ui.Components.yj) this.f40746b, ((org.telegram.ui.Components.xj) this.f40747c).run()));
                return;
            case 22:
                ((org.telegram.ui.Components.yj) this.f40746b).setStatus((CharSequence) this.f40747c);
                return;
            case 23:
                org.telegram.ui.Components.ok okVar = (org.telegram.ui.Components.ok) this.f40746b;
                String str = (String) this.f40747c;
                okVar.getClass();
                ArrayList arrayList = new ArrayList(okVar.X.v.f25648c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.h4(okVar, str, !okVar.R.isEmpty(), arrayList, 16));
                return;
            case 24:
                org.telegram.ui.Components.ok okVar2 = (org.telegram.ui.Components.ok) this.f40746b;
                ArrayList arrayList2 = (ArrayList) this.f40747c;
                org.telegram.ui.Components.pk pkVar = okVar2.X;
                boolean z10 = pkVar.f28036b0;
                org.telegram.ui.Components.ek ekVar = pkVar.f28042r;
                if (z10) {
                    s4.g0 adapter = ekVar.getAdapter();
                    org.telegram.ui.Components.ok okVar3 = pkVar.f28046y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.f27672s = arrayList2;
                okVar2.l();
                return;
            case 25:
                org.telegram.ui.Components.vi viVar3 = ((org.telegram.ui.Components.cl) this.f40746b).f27360b;
                viVar3.dismiss();
                viVar3.f29672f0.presentFragment(fo.W9(((TLRPC.User) this.f40747c).f19063id));
                return;
            case 26:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, new org.telegram.ui.Components.zc((org.telegram.ui.Components.cl) this.f40746b, (org.telegram.ui.ActionBar.c6) this.f40747c), R.raw.copy, 36);
                return;
            case 27:
                org.telegram.ui.Components.tl tlVar = (org.telegram.ui.Components.tl) this.f40746b;
                float[] fArr = (float[]) this.f40747c;
                tlVar.getClass();
                tlVar.e0(fArr[0], fArr[1]);
                return;
            case 28:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) this.f40747c;
                boolean z11 = ChatAttachAlertPhotoLayout.f22718q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                org.telegram.ui.Components.gm gmVar = ((ChatAttachAlertPhotoLayout) this.f40746b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                gmVar.scrollBy(0, listTopPadding);
                return;
            default:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40747c;
                org.telegram.ui.Components.qm qmVar = ((ChatAttachAlertPhotoLayout) this.f40746b).P;
                if (qmVar != null) {
                    qmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
        }
    }
}
