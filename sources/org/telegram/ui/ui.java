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
public final class ui implements Runnable {
    public final int f44143a;
    public final Object f44144b;

    public ui(Object obj, int i10) {
        this.f44143a = i10;
        this.f44144b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f44143a;
        int i15 = 0;
        Object obj = this.f44144b;
        switch (i14) {
            case 0:
                fi.m5 m5Var = (fi.m5) obj;
                i10 = ((org.telegram.ui.ActionBar.r2) ((un) m5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(m5Var.f11252b);
                return;
            case 1:
                wi wiVar = (wi) obj;
                i11 = ((org.telegram.ui.ActionBar.r2) ((un) wiVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(wiVar.f45497c);
                return;
            case 2:
                un.Z1(((oj) obj).H3);
                return;
            case 3:
                ((rj) obj).T.A0.O(false);
                return;
            case 4:
                pi piVar = (pi) obj;
                un unVar = piVar.f42555b;
                if (unVar.f44379q2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(unVar.f44379q2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new kg.e(piVar, 27));
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
                fm fmVar = ((vl) obj).f44856c.f45515a;
                i12 = ((org.telegram.ui.ActionBar.r2) fmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                fmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((jm) obj).f40685c.o9(true);
                return;
            case 8:
                ((si) obj).c(false);
                return;
            case 9:
                un unVar2 = ((gn) obj).f39721j;
                unVar2.getNotificationCenter().onAnimationFinish(unVar2.U9);
                return;
            case 10:
                un unVar3 = ((mn) obj).f41591b;
                unVar3.f44291j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(unVar3.f44291j0.getSearchField());
                if (unVar3.Ba > 0) {
                    kf kfVar = new kf(unVar3, 8);
                    unVar3.Ca = kfVar;
                    AndroidUtilities.runOnUIThread(kfVar, 200L);
                    return;
                }
                return;
            case 11:
                mo moVar = ((ko) obj).f40990a;
                moVar.e.setImageDrawable(moVar.f41615r);
                moVar.f41597b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = moVar.C0;
                if (user != null) {
                    user.photo = null;
                    moVar.getMessagesController().putUser(moVar.C0, true);
                }
                moVar.N0 = true;
                if (moVar.Q0 == null) {
                    moVar.Q0 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                moVar.f41597b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                moVar.f41597b0.e.setAnimation(moVar.Q0);
                return;
            case 12:
                ((pq) obj).run(0);
                return;
            case 13:
                ((qr) obj).invalidateSelf();
                return;
            case 14:
                yr yrVar = (yr) obj;
                ArrayList arrayList = yrVar.f46095c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                yrVar.invalidateSelf();
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((bt) obj).f38155a.n();
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
                ((zv) obj).f46368a.f38589f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                cy cyVar = ((nx) obj).f42013a;
                i13 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                cyVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                cy cyVar2 = ((qx) obj).B0;
                cyVar2.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) cyVar2, 9, true));
                cyVar2.f38690z0.setIsEditing(false);
                cyVar2.Q4(false);
                return;
            case 25:
                cy cyVar3 = ((rx) obj).f43307b;
                cyVar3.f38690z0.setIsEditing(true);
                cyVar3.Q4(true);
                return;
            case 26:
                ((ly) obj).removeSelfFromStack();
                return;
            case 27:
                oy oyVar = (oy) obj;
                ArrayList arrayList2 = oyVar.f42309x;
                ArrayList arrayList3 = oyVar.f42308w;
                if (oyVar.f42306r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = oyVar.f42306r;
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
                                oyVar.f42306r = 0;
                                oyVar.v = null;
                                oyVar.f42307s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                oyVar.f42310y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(oyVar.f42302b).getInputPeer(oyVar.I);
                        ConnectionsManager.getInstance(oyVar.f42302b).sendRequest(tL_messages_setTyping, null);
                        oyVar.f42306r = 0;
                        oyVar.v = null;
                        oyVar.f42307s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                oyVar.f42310y = null;
                return;
            case 28:
                ((lz) obj).f0(true);
                return;
            default:
                ((jz) obj).f39208a.getBackground().setState(new int[0]);
                return;
        }
    }
}
