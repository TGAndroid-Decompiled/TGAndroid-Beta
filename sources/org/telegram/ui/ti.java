package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ti implements Runnable {
    public final int f42018a;
    public final Object f42019b;

    public ti(Object obj, int i10) {
        this.f42018a = i10;
        this.f42019b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f42018a;
        int i15 = 0;
        Object obj = this.f42019b;
        switch (i14) {
            case 0:
                ei.n5 n5Var = (ei.n5) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((sn) n5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(n5Var.f9524b);
                return;
            case 1:
                vi viVar = (vi) obj;
                i11 = ((org.telegram.ui.ActionBar.o2) ((sn) viVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(viVar.f42779c);
                return;
            case 2:
                sn.X1(((nj) obj).A3);
                return;
            case 3:
                ((qj) obj).T.A0.O(false);
                return;
            case 4:
                oi oiVar = (oi) obj;
                sn snVar = oiVar.f40211b;
                if (snVar.f41647q2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(snVar.f41647q2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new m.a(oiVar, 25));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    return;
                }
                return;
            case 5:
                ((MessageObject) obj).settingAvatar = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                em emVar = ((ul) obj).f42471c.f42787a;
                i12 = ((org.telegram.ui.ActionBar.o2) emVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                emVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((im) obj).f38268c.j9(true);
                return;
            case 8:
                ((ri) obj).c(false);
                return;
            case 9:
                sn snVar2 = ((en) obj).h;
                snVar2.getNotificationCenter().onAnimationFinish(snVar2.U9);
                return;
            case 10:
                sn snVar3 = ((kn) obj).f38977s;
                snVar3.f41560j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(snVar3.f41560j0.getSearchField());
                if (snVar3.Ba > 0) {
                    kf kfVar = new kf(snVar3, 7);
                    snVar3.Ca = kfVar;
                    AndroidUtilities.runOnUIThread(kfVar, 200L);
                    return;
                }
                return;
            case 11:
                ko koVar = ((io) obj).f38284a;
                koVar.e.setImageDrawable(koVar.f39004r);
                koVar.f38986b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar.C0;
                if (user != null) {
                    user.photo = null;
                    koVar.getMessagesController().putUser(koVar.C0, true);
                }
                koVar.N0 = true;
                if (koVar.Q0 == null) {
                    koVar.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar.f38986b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar.f38986b0.e.setAnimation(koVar.Q0);
                return;
            case 12:
                ((nq) obj).run(0);
                return;
            case 13:
                ((nr) obj).invalidateSelf();
                return;
            case 14:
                wr wrVar = (wr) obj;
                ArrayList arrayList = wrVar.f43424c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                wrVar.invalidateSelf();
                return;
            case 15:
                ContactsActivity contactsActivity = ((os) obj).f40252a;
                contactsActivity.Z.f27836r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f27836r);
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((dt) obj).f36729a.n();
                return;
            case 18:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                    return;
                }
                return;
            case 19:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 20:
                ((org.telegram.ui.Cells.y2) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.ta) obj).updateColors();
                return;
            case 22:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                return;
            case 23:
                ey eyVar = ((cw) obj).B0;
                eyVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) eyVar, 9, true));
                eyVar.f37167z0.setIsEditing(false);
                eyVar.G4(false);
                return;
            case 24:
                ey eyVar2 = ((dw) obj).f36743b;
                eyVar2.f37167z0.setIsEditing(true);
                eyVar2.G4(true);
                return;
            case 25:
                ((ew) obj).f37028a.f37065f0.setAlpha(1.0f);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                ey eyVar3 = ((rx) obj).f41264a;
                i13 = ((org.telegram.ui.ActionBar.o2) eyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                eyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                ((ny) obj).removeSelfFromStack();
                return;
            case 28:
                qy qyVar = (qy) obj;
                ArrayList arrayList2 = qyVar.f40942x;
                ArrayList arrayList3 = qyVar.f40941w;
                if (qyVar.f40939r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = qyVar.f40939r;
                    tL_sendMessageEmojiInteraction.emoticon = qyVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i16)).intValue() + 1);
                                jSONObject2.put("t", ((float) ((Long) arrayList3.get(i16)).longValue()) / 1000.0f);
                                jSONArray.put(i16, jSONObject2);
                            } catch (JSONException e) {
                                e = e;
                                qyVar.f40939r = 0;
                                qyVar.v = null;
                                qyVar.f40940s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                qyVar.f40943y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = qyVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(qyVar.f40935b).getInputPeer(qyVar.I);
                        ConnectionsManager.getInstance(qyVar.f40935b).sendRequest(tL_messages_setTyping, null);
                        qyVar.f40939r = 0;
                        qyVar.v = null;
                        qyVar.f40940s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                qyVar.f40943y = null;
                return;
            default:
                ((oz) obj).e0(true);
                return;
        }
    }
}
