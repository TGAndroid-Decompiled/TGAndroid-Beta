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
public final class xi implements Runnable {
    public final int f45693a;
    public final Object f45694b;

    public xi(Object obj, int i10) {
        this.f45693a = i10;
        this.f45694b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f45693a;
        int i15 = 0;
        Object obj = this.f45694b;
        switch (i14) {
            case 0:
                fi.m5 m5Var = (fi.m5) obj;
                i10 = ((org.telegram.ui.ActionBar.r2) ((wn) m5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(m5Var.f11251b);
                return;
            case 1:
                zi ziVar = (zi) obj;
                i11 = ((org.telegram.ui.ActionBar.r2) ((wn) ziVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ziVar.f46282c);
                return;
            case 2:
                wn.a2(((rj) obj).H3);
                return;
            case 3:
                ((uj) obj).T.A0.O(false);
                return;
            case 4:
                si siVar = (si) obj;
                wn wnVar = siVar.f43343b;
                if (wnVar.f45250q2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(wnVar.f45250q2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new kg.e(siVar, 27));
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
                hm hmVar = ((xl) obj).f45734c.f46046a;
                i12 = ((org.telegram.ui.ActionBar.r2) hmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                hmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((lm) obj).f41203c.r9(true);
                return;
            case 8:
                ((vi) obj).c(false);
                return;
            case 9:
                wn wnVar2 = ((in) obj).f40214j;
                wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.Y9);
                return;
            case 10:
                wn wnVar3 = ((on) obj).f42126b;
                wnVar3.f45162j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(wnVar3.f45162j0.getSearchField());
                if (wnVar3.Fa > 0) {
                    jf jfVar = new jf(wnVar3, 9);
                    wnVar3.Ga = jfVar;
                    AndroidUtilities.runOnUIThread(jfVar, 200L);
                    return;
                }
                return;
            case 11:
                oo ooVar = ((mo) obj).f41491a;
                ooVar.e.setImageDrawable(ooVar.f42150r);
                ooVar.f42132b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().putUser(ooVar.C0, true);
                }
                ooVar.N0 = true;
                if (ooVar.Q0 == null) {
                    ooVar.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ooVar.f42132b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ooVar.f42132b0.e.setAnimation(ooVar.Q0);
                return;
            case 12:
                ((rq) obj).run(0);
                return;
            case 13:
                ((sr) obj).invalidateSelf();
                return;
            case 14:
                as asVar = (as) obj;
                ArrayList arrayList = asVar.f37815c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                asVar.invalidateSelf();
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((dt) obj).f38675a.n();
                return;
            case 17:
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj;
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 19:
                ((org.telegram.ui.Cells.x2) obj).updateColors();
                return;
            case 20:
                ((org.telegram.ui.Cells.xa) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                return;
            case 22:
                ((bw) obj).f38113a.f39004f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                ey eyVar = ((qx) obj).f42804a;
                i13 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                eyVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                ey eyVar2 = ((tx) obj).B0;
                eyVar2.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) eyVar2, 9, true));
                eyVar2.f39105z0.setIsEditing(false);
                eyVar2.Q4(false);
                return;
            case 25:
                ey eyVar3 = ((ux) obj).f44129b;
                eyVar3.f39105z0.setIsEditing(true);
                eyVar3.Q4(true);
                return;
            case 26:
                ((ny) obj).removeSelfFromStack();
                return;
            case 27:
                qy qyVar = (qy) obj;
                ArrayList arrayList2 = qyVar.f42814x;
                ArrayList arrayList3 = qyVar.f42813w;
                if (qyVar.f42811r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = qyVar.f42811r;
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
                                qyVar.f42811r = 0;
                                qyVar.v = null;
                                qyVar.f42812s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                qyVar.f42815y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(qyVar.f42807b).getInputPeer(qyVar.I);
                        ConnectionsManager.getInstance(qyVar.f42807b).sendRequest(tL_messages_setTyping, null);
                        qyVar.f42811r = 0;
                        qyVar.v = null;
                        qyVar.f42812s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                qyVar.f42815y = null;
                return;
            case 28:
                ((oz) obj).f0(true);
                return;
            default:
                ((mz) obj).f39721a.getBackground().setState(new int[0]);
                return;
        }
    }
}
