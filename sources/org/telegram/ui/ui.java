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
    public final int f43271a;
    public final Object f43272b;

    public ui(Object obj, int i10) {
        this.f43271a = i10;
        this.f43272b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f43271a;
        int i14 = 0;
        Object obj = this.f43272b;
        switch (i13) {
            case 0:
                vi viVar = (vi) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((tn) viVar.f43608e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(viVar.f43607c);
                return;
            case 1:
                tn.X1(((lj) obj).f40234u3);
                return;
            case 2:
                ((oj) obj).T.f43013w0.O(false);
                return;
            case 3:
                oi oiVar = (oi) obj;
                tn tnVar = oiVar.f41182b;
                if (tnVar.a2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(tnVar.a2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new nh.q5(oiVar, 27));
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
                em emVar = ((ul) obj).f43284c.f43618a;
                i11 = ((org.telegram.ui.ActionBar.o2) emVar.M).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                emVar.M.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((im) obj).f39293c.e9(true);
                return;
            case 7:
                ((ri) obj).c(false);
                return;
            case 8:
                tn tnVar2 = ((gn) obj).h;
                tnVar2.getNotificationCenter().onAnimationFinish(tnVar2.E9);
                return;
            case 9:
                tn tnVar3 = ((ln) obj).h;
                tnVar3.f42802f0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(tnVar3.f42802f0.getSearchField());
                if (tnVar3.f42885la > 0) {
                    df dfVar = new df(tnVar3, 9);
                    tnVar3.ma = dfVar;
                    AndroidUtilities.runOnUIThread(dfVar, 200L);
                    return;
                }
                return;
            case 10:
                ko koVar = ((io) obj).f39299a;
                koVar.f39945e.setImageDrawable(koVar.f39960r);
                koVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar.f39973z0;
                if (user != null) {
                    user.photo = null;
                    koVar.getMessagesController().putUser(koVar.f39973z0, true);
                }
                koVar.K0 = true;
                if (koVar.N0 == null) {
                    int i15 = R.raw.camera_outline;
                    koVar.N0 = new org.telegram.ui.Components.xi0(i15, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar.X.f24711e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar.X.f24711e.setAnimation(koVar.N0);
                return;
            case 11:
                ((nq) obj).run(0);
                return;
            case 12:
                ((nr) obj).invalidateSelf();
                return;
            case 13:
                vr vrVar = (vr) obj;
                ArrayList arrayList = vrVar.f43717c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                vrVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ns) obj).f40895a;
                contactsActivity.V.f34546r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.V.f34546r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((dt) obj).f37629a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 19:
                ((org.telegram.ui.Cells.x2) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.pa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                fy fyVar = ((ew) obj).f37909x0;
                fyVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) fyVar, 9, true));
                fyVar.f38362v0.setIsEditing(false);
                fyVar.I4(false);
                return;
            case 23:
                fy fyVar2 = ((fw) obj).f38242b;
                fyVar2.f38362v0.setIsEditing(true);
                fyVar2.I4(true);
                return;
            case 24:
                ((gw) obj).f38676a.f38261b0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                fy fyVar3 = ((sx) obj).f42477a;
                i12 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                fyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((oy) obj).removeSelfFromStack();
                return;
            case 27:
                ry ryVar = (ry) obj;
                ArrayList arrayList2 = ryVar.f42234x;
                ArrayList arrayList3 = ryVar.f42233w;
                if (ryVar.f42231r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = ryVar.f42231r;
                    tL_sendMessageEmojiInteraction.emoticon = ryVar.v;
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
                            } catch (JSONException e10) {
                                e = e10;
                                ryVar.f42231r = 0;
                                ryVar.v = null;
                                ryVar.f42232s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                ryVar.f42235y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = ryVar.F;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(ryVar.f42226b).getInputPeer(ryVar.E);
                        ConnectionsManager.getInstance(ryVar.f42226b).sendRequest(tL_messages_setTyping, null);
                        ryVar.f42231r = 0;
                        ryVar.v = null;
                        ryVar.f42232s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                ryVar.f42235y = null;
                return;
            case 28:
                ((nz) obj).e0(true);
                return;
            default:
                ((lz) obj).f38693a.getBackground().setState(new int[0]);
                return;
        }
    }
}
