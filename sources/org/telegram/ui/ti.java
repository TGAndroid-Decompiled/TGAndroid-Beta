package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
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

    public final int f42950a;

    public final Object f42951b;

    public ti(Object obj, int i10) {
        this.f42950a = i10;
        this.f42951b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f42950a;
        int i11 = 9;
        int i12 = 0;
        Object obj = this.f42951b;
        switch (i10) {
            case 0:
                ui uiVar = (ui) obj;
                NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) ((rn) uiVar.f43236e)).currentAccount).onAnimationFinish(uiVar.f43235c);
                break;
            case 1:
                rn.X1(((kj) obj).f39786u3);
                break;
            case 2:
                ((nj) obj).T.f42252w0.O(false);
                break;
            case 3:
                ni niVar = (ni) obj;
                rn rnVar = niVar.f40839b;
                if (rnVar.a2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rnVar.a2, (Property<org.telegram.ui.Components.x30, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new lh.h9(niVar, 27));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 4:
                ((MessageObject) obj).settingAvatar = false;
                break;
            case 5:
                Bundle bundle = new Bundle();
                dm dmVar = ((tl) obj).f42962c.f43247a;
                bundle.putLong("user_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) dmVar.M).currentAccount).clientUserId);
                dmVar.M.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((hm) obj).f38857c.e9(true);
                break;
            case 7:
                ((qi) obj).c(false);
                break;
            case 8:
                rn rnVar2 = ((en) obj).h;
                rnVar2.getNotificationCenter().onAnimationFinish(rnVar2.E9);
                break;
            case 9:
                rn rnVar3 = ((jn) obj).h;
                rnVar3.f42040f0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(rnVar3.f42040f0.getSearchField());
                if (rnVar3.la > 0) {
                    gf gfVar = new gf(rnVar3, i11);
                    rnVar3.f42135ma = gfVar;
                    AndroidUtilities.runOnUIThread(gfVar, 200L);
                }
                break;
            case 10:
                jo joVar = ((ho) obj).f38874a;
                joVar.f39410e.setImageDrawable(joVar.f39425r);
                joVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = joVar.f39438z0;
                if (user != null) {
                    user.photo = null;
                    joVar.getMessagesController().putUser(joVar.f39438z0, true);
                }
                joVar.K0 = true;
                if (joVar.N0 == null) {
                    joVar.N0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                joVar.X.f24631e.setTranslationX(-AndroidUtilities.dp(8.0f));
                joVar.X.f24631e.setAnimation(joVar.N0);
                break;
            case 11:
                ((nq) obj).run(0);
                break;
            case 12:
                ((pr) obj).invalidateSelf();
                break;
            case 13:
                xr xrVar = (xr) obj;
                ArrayList arrayList = xrVar.f44599c;
                int size = arrayList.size();
                while (i12 < size) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    ((View) obj2).invalidate();
                }
                xrVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((ps) obj).f41424a;
                contactsActivity.V.f31468r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.V.f31468r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((ft) obj).f38203a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                break;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 19:
                ((org.telegram.ui.Cells.x2) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.oa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                gy gyVar = ((fw) obj).f38213x0;
                gyVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) gyVar, 9, true));
                gyVar.f38604v0.setIsEditing(false);
                gyVar.I4(false);
                break;
            case 23:
                gy gyVar2 = ((gw) obj).f38485b;
                gyVar2.f38604v0.setIsEditing(true);
                gyVar2.I4(true);
                break;
            case 24:
                ((hw) obj).f38894a.f38502b0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                gy gyVar3 = ((tx) obj).f43026a;
                bundle2.putLong("user_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                gyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((py) obj).removeSelfFromStack();
                break;
            case 27:
                sy syVar = (sy) obj;
                ArrayList arrayList2 = syVar.f42721x;
                ArrayList arrayList3 = syVar.f42720w;
                if (syVar.f42718r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = syVar.f42718r;
                    tL_sendMessageEmojiInteraction.emoticon = syVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i13)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i13)).longValue() / 1000.0f);
                                jSONArray.put(i13, jSONObject2);
                            } catch (JSONException e9) {
                                e = e9;
                                syVar.f42718r = 0;
                                syVar.v = null;
                                syVar.f42719s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                syVar.f42722y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = syVar.F;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(syVar.f42713b).getInputPeer(syVar.E);
                        ConnectionsManager.getInstance(syVar.f42713b).sendRequest(tL_messages_setTyping, null);
                        syVar.f42718r = 0;
                        syVar.v = null;
                        syVar.f42719s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                syVar.f42722y = null;
                break;
            case 28:
                ((oz) obj).e0(true);
                break;
            default:
                ((mz) obj).f38912a.getBackground().setState(new int[0]);
                break;
        }
    }
}
