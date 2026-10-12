package org.telegram.ui;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rp implements Runnable {
    public final int f39840a;
    public final Object f39841b;
    public final Object f39842c;

    public rp(int i10, Object obj, Object obj2) {
        this.f39840a = i10;
        this.f39841b = obj;
        this.f39842c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f39840a) {
            case 0:
                aq.U((aq) this.f39841b, (org.telegram.ui.ActionBar.a2[]) this.f39842c);
                return;
            case 1:
                aq aqVar = (aq) this.f39841b;
                TLObject tLObject = (TLObject) this.f39842c;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    aqVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    aqVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                aqVar.f34299w = false;
                aqVar.f34300x = true;
                aqVar.b0();
                return;
            case 2:
                ((wp) this.f39841b).f41631x.d.P = false;
                ((org.telegram.ui.Components.i90) this.f39842c).run();
                return;
            case 3:
                ((wp) this.f39841b).f41631x.d.O = false;
                ((org.telegram.ui.Components.j90) this.f39842c).run();
                return;
            case 4:
                aq aqVar2 = ((wp) this.f39841b).f41631x.d;
                aqVar2.O = false;
                aqVar2.P = false;
                ((Runnable) this.f39842c).run();
                return;
            case 5:
                wp wpVar = (wp) this.f39841b;
                wpVar.getClass();
                ((TLRPC.Chat) this.f39842c).join_request = true;
                wpVar.h = true;
                wpVar.f26986c.setChecked(true);
                return;
            case 6:
                yr yrVar = (yr) this.f39841b;
                yrVar.getClass();
                yrVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f39842c).chats.get(0).f19216id, 0, true);
                return;
            case 7:
                TLRPC.User user = (TLRPC.User) this.f39842c;
                yr yrVar2 = ((nr) this.f39841b).f38784a;
                if (org.telegram.ui.Components.zc.a(yrVar2)) {
                    org.telegram.ui.Components.zc.C(yrVar2, user.first_name).j();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.e0) this.f39841b).f24538u0.unsave((TL_aicompose.TL_aiComposeTone) this.f39842c);
                return;
            case 9:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.f39841b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f39842c;
                qVar.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 10:
                uz0 uz0Var = (uz0) this.f39842c;
                if (((boolean[]) this.f39841b)[0]) {
                    uz0Var.run();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f39841b;
                TLObject tLObject2 = (TLObject) this.f39842c;
                faVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    faVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f39841b;
                CharSequence charSequence = (CharSequence) this.f39842c;
                scVar.f29106n = true;
                org.telegram.ui.Components.wb wbVar = scVar.e;
                if (wbVar instanceof org.telegram.ui.Components.xb) {
                    org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ((org.telegram.ui.Components.xb) wbVar);
                    ybVar.f23513b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ybVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ybVar.f23513b, true, false, true);
                }
                scVar.i(true);
                return;
            case 13:
                boolean[] zArr = (boolean[]) this.f39841b;
                Runnable runnable = (Runnable) this.f39842c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ((org.telegram.ui.Components.md) this.f39841b).removeView((di.d4) this.f39842c);
                return;
            case 15:
                int i10 = ChatActivityEnterView.f22849n5;
                ((ChatActivityEnterView) this.f39841b).removeView((di.d4) this.f39842c);
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f39841b;
                int i11 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f39842c);
                chatActivityEnterView.W = null;
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f39841b;
                int i12 = ChatActivityEnterView.f22849n5;
                ((org.telegram.ui.Components.td) this.f39842c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 18:
                org.telegram.ui.Components.qg qgVar = (org.telegram.ui.Components.qg) this.f39842c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.tg) this.f39841b).V;
                chatActivityEnterView3.f22902i1 = chatActivityEnterView3.f22896h1.getAudioRightMs() - chatActivityEnterView3.f22896h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22896h1.getAudioLeftMs(), chatActivityEnterView3.f22896h1.getAudioRightMs(), qgVar);
                return;
            case 19:
                ((org.telegram.ui.Components.vi) this.f39841b).containerView.removeView((di.d4) this.f39842c);
                return;
            case 20:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f39842c;
                ((org.telegram.ui.Components.vi) this.f39841b).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 21:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f39842c;
                if (!((org.telegram.ui.Components.vi) this.f39841b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f39841b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.oi) this.f39842c).f27963c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.M1).updateAttachMenuBotsInCache();
                return;
            case 23:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) this.f39841b;
                MediaDataController.getInstance(viVar2.M1).loadAttachMenuBots(false, true);
                if (viVar2.B0 == viVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f39842c).bot_id)) {
                    viVar2.U1(viVar2.f30013j0);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) this.f39841b;
                hjVar.G = false;
                hjVar.H = (ArrayList) this.f39842c;
                hjVar.S();
                return;
            case 25:
                org.telegram.ui.Components.hj hjVar2 = (org.telegram.ui.Components.hj) this.f39841b;
                ((org.telegram.ui.Components.vi) this.f39842c).b1();
                hjVar2.O();
                hjVar2.f27671b.b2(hjVar2, 0);
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new rp(27, (org.telegram.ui.Components.yj) this.f39841b, ((org.telegram.ui.Components.xj) this.f39842c).run()));
                return;
            case 27:
                ((org.telegram.ui.Components.yj) this.f39841b).setStatus((CharSequence) this.f39842c);
                return;
            case 28:
                org.telegram.ui.Components.ok okVar = (org.telegram.ui.Components.ok) this.f39841b;
                String str = (String) this.f39842c;
                okVar.getClass();
                ArrayList arrayList2 = new ArrayList(okVar.X.v.f25987c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.h4(okVar, str, !okVar.R.isEmpty(), arrayList2, 17));
                return;
            default:
                org.telegram.ui.Components.ok okVar2 = (org.telegram.ui.Components.ok) this.f39841b;
                ArrayList arrayList3 = (ArrayList) this.f39842c;
                org.telegram.ui.Components.pk pkVar = okVar2.X;
                boolean z10 = pkVar.f28348b0;
                org.telegram.ui.Components.ek ekVar = pkVar.f28354r;
                if (z10) {
                    s4.g0 adapter = ekVar.getAdapter();
                    org.telegram.ui.Components.ok okVar3 = pkVar.f28358y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.f27983s = arrayList3;
                okVar2.l();
                return;
        }
    }
}
