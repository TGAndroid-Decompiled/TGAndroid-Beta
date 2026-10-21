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
    public final int f41684a;
    public final Object f41685b;

    public ti(Object obj, int i10) {
        this.f41684a = i10;
        this.f41685b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f41684a;
        int i15 = 0;
        Object obj = this.f41685b;
        switch (i14) {
            case 0:
                ei.n5 n5Var = (ei.n5) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((qn) n5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(n5Var.f9513b);
                return;
            case 1:
                vi viVar = (vi) obj;
                i11 = ((org.telegram.ui.ActionBar.n2) ((qn) viVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(viVar.f42270c);
                return;
            case 2:
                qn.X1(((nj) obj).f39631x3);
                return;
            case 3:
                ((qj) obj).T.A0.O(false);
                return;
            case 4:
                oi oiVar = (oi) obj;
                qn qnVar = oiVar.f39902b;
                if (qnVar.f40666e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qnVar.f40666e2, View.ALPHA, 0.0f));
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
                dm dmVar = ((tl) obj).f41697c.f42011a;
                i12 = ((org.telegram.ui.ActionBar.n2) dmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                dmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((hm) obj).f37688c.j9(true);
                return;
            case 8:
                ((ri) obj).c(false);
                return;
            case 9:
                qn qnVar2 = ((dn) obj).h;
                qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.I9);
                return;
            case 10:
                qn qnVar3 = ((in) obj).f38032s;
                qnVar3.f40724j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(qnVar3.f40724j0.getSearchField());
                if (qnVar3.f40806pa > 0) {
                    kf kfVar = new kf(qnVar3, 7);
                    qnVar3.f40818qa = kfVar;
                    AndroidUtilities.runOnUIThread(kfVar, 200L);
                    return;
                }
                return;
            case 11:
                io ioVar = ((go) obj).f37375a;
                ioVar.e.setImageDrawable(ioVar.f38054r);
                ioVar.f38036b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ioVar.D0;
                if (user != null) {
                    user.photo = null;
                    ioVar.getMessagesController().putUser(ioVar.D0, true);
                }
                ioVar.O0 = true;
                if (ioVar.R0 == null) {
                    ioVar.R0 = new org.telegram.ui.Components.vj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ioVar.f38036b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ioVar.f38036b0.e.setAnimation(ioVar.R0);
                return;
            case 12:
                ((lq) obj).run(0);
                return;
            case 13:
                ((lr) obj).invalidateSelf();
                return;
            case 14:
                ur urVar = (ur) obj;
                ArrayList arrayList = urVar.f42031c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                urVar.invalidateSelf();
                return;
            case 15:
                ContactsActivity contactsActivity = ((ls) obj).f39005a;
                contactsActivity.Z.f27726r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f27726r);
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((at) obj).f35416a.p();
                return;
            case 18:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    return;
                }
                return;
            case 19:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 20:
                ((org.telegram.ui.Cells.z2) obj).d();
                return;
            case 21:
                ((org.telegram.ui.Cells.sa) obj).b();
                return;
            case 22:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 23:
                cy cyVar = ((aw) obj).B0;
                cyVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) cyVar, 9, true));
                cyVar.f36198z0.setIsEditing(false);
                cyVar.G4(false);
                return;
            case 24:
                cy cyVar2 = ((bw) obj).f35748b;
                cyVar2.f36198z0.setIsEditing(true);
                cyVar2.G4(true);
                return;
            case 25:
                ((cw) obj).f36059a.f36098f0.setAlpha(1.0f);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                cy cyVar3 = ((px) obj).f40313a;
                i13 = ((org.telegram.ui.ActionBar.n2) cyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                cyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                ((ly) obj).removeSelfFromStack();
                return;
            case 28:
                oy oyVar = (oy) obj;
                ArrayList arrayList2 = oyVar.f40008x;
                ArrayList arrayList3 = oyVar.f40007w;
                if (oyVar.f40005r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = oyVar.f40005r;
                    tL_sendMessageEmojiInteraction.emoticon = oyVar.v;
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
                                oyVar.f40005r = 0;
                                oyVar.v = null;
                                oyVar.f40006s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                oyVar.f40009y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = oyVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(oyVar.f40001b).getInputPeer(oyVar.I);
                        ConnectionsManager.getInstance(oyVar.f40001b).sendRequest(tL_messages_setTyping, null);
                        oyVar.f40005r = 0;
                        oyVar.v = null;
                        oyVar.f40006s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                oyVar.f40009y = null;
                return;
            default:
                ((lz) obj).e0(true);
                return;
        }
    }
}
