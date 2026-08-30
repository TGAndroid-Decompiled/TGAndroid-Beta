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
public final class zi implements Runnable {
    public final int f40811a;
    public final Object f40812b;

    public zi(Object obj, int i10) {
        this.f40811a = i10;
        this.f40812b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f40811a;
        int i14 = 0;
        Object obj = this.f40812b;
        switch (i13) {
            case 0:
                aj ajVar = (aj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) ajVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(ajVar.f32645c);
                return;
            case 1:
                xn.X1(((qj) obj).f37784v3);
                return;
            case 2:
                ((tj) obj).T.f40234x0.O(false);
                return;
            case 3:
                ti tiVar = (ti) obj;
                xn xnVar = tiVar.f38672b;
                if (xnVar.f39960b2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xnVar.f39960b2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new s5(tiVar, 18));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    return;
                }
                return;
            case 4:
                ((MessageObject) obj).settingAvatar = false;
                return;
            case 5:
                Bundle bundle = new Bundle();
                jm jmVar = ((am) obj).f32669c.f32984a;
                i11 = ((org.telegram.ui.ActionBar.p2) jmVar.N).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                jmVar.N.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((nm) obj).f36688c.e9(true);
                return;
            case 7:
                ((wi) obj).c(false);
                return;
            case 8:
                xn xnVar2 = ((kn) obj).h;
                xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.F9);
                return;
            case 9:
                xn xnVar3 = ((pn) obj).h;
                xnVar3.f40022g0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(xnVar3.f40022g0.getSearchField());
                if (xnVar3.f40104ma > 0) {
                    lf lfVar = new lf(xnVar3, 9);
                    xnVar3.f40118na = lfVar;
                    AndroidUtilities.runOnUIThread(lfVar, 200L);
                    return;
                }
                return;
            case 10:
                po poVar = ((no) obj).f36703a;
                poVar.e.setImageDrawable(poVar.f37401r);
                poVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = poVar.A0;
                if (user != null) {
                    user.photo = null;
                    poVar.getMessagesController().putUser(poVar.A0, true);
                }
                poVar.L0 = true;
                if (poVar.O0 == null) {
                    int i15 = R.raw.camera_outline;
                    poVar.O0 = new org.telegram.ui.Components.gj0(i15, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                poVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                poVar.Y.e.setAnimation(poVar.O0);
                return;
            case 11:
                ((tq) obj).run(0);
                return;
            case 12:
                ((tr) obj).invalidateSelf();
                return;
            case 13:
                cs csVar = (cs) obj;
                ArrayList arrayList = csVar.f33419c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                csVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((us) obj).f38993a;
                contactsActivity.W.f23815r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.W.f23815r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((lt) obj).f36133a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 19:
                ((org.telegram.ui.Cells.z2) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.sa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                oy oyVar = ((nw) obj).f36733y0;
                oyVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) oyVar, 9, true));
                oyVar.f37115w0.setIsEditing(false);
                oyVar.I4(false);
                return;
            case 23:
                oy oyVar2 = ((ow) obj).f36989b;
                oyVar2.f37115w0.setIsEditing(true);
                oyVar2.I4(true);
                return;
            case 24:
                ((pw) obj).f37544a.f37015c0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                oy oyVar3 = ((cy) obj).f33449a;
                i12 = ((org.telegram.ui.ActionBar.p2) oyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                oyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((xy) obj).removeSelfFromStack();
                return;
            case 27:
                bz bzVar = (bz) obj;
                ArrayList arrayList2 = bzVar.f33056x;
                ArrayList arrayList3 = bzVar.f33055w;
                if (bzVar.f33053r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = bzVar.f33053r;
                    tL_sendMessageEmojiInteraction.emoticon = bzVar.v;
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
                                bzVar.f33053r = 0;
                                bzVar.v = null;
                                bzVar.f33054s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                bzVar.f33057y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = bzVar.G;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(bzVar.f33049b).getInputPeer(bzVar.F);
                        ConnectionsManager.getInstance(bzVar.f33049b).sendRequest(tL_messages_setTyping, null);
                        bzVar.f33053r = 0;
                        bzVar.v = null;
                        bzVar.f33054s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e6) {
                        e = e6;
                    }
                }
                bzVar.f33057y = null;
                return;
            case 28:
                ((yz) obj).e0(true);
                return;
            default:
                ((wz) obj).f38142a.getBackground().setState(new int[0]);
                return;
        }
    }
}
