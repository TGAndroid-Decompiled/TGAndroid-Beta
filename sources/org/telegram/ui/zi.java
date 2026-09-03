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
    public final int f43970a;
    public final Object f43971b;

    public zi(Object obj, int i10) {
        this.f43970a = i10;
        this.f43971b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f43970a;
        int i14 = 0;
        Object obj = this.f43971b;
        switch (i13) {
            case 0:
                aj ajVar = (aj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) ajVar.f35200e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(ajVar.f35199c);
                return;
            case 1:
                xn.X1(((qj) obj).f40533v3);
                return;
            case 2:
                ((tj) obj).T.f43381x0.O(false);
                return;
            case 3:
                ti tiVar = (ti) obj;
                xn xnVar = tiVar.f41546b;
                if (xnVar.f43106b2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xnVar.f43106b2, View.ALPHA, 0.0f));
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
                jm jmVar = ((am) obj).f35218c.f35565a;
                i11 = ((org.telegram.ui.ActionBar.p2) jmVar.N).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                jmVar.N.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((nm) obj).f39403c.e9(true);
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
                xnVar3.f43169g0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(xnVar3.f43169g0.getSearchField());
                if (xnVar3.f43251ma > 0) {
                    lf lfVar = new lf(xnVar3, 9);
                    xnVar3.f43265na = lfVar;
                    AndroidUtilities.runOnUIThread(lfVar, 200L);
                    return;
                }
                return;
            case 10:
                po poVar = ((no) obj).f39417a;
                poVar.f40063e.setImageDrawable(poVar.f40078r);
                poVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = poVar.A0;
                if (user != null) {
                    user.photo = null;
                    poVar.getMessagesController().putUser(poVar.A0, true);
                }
                poVar.L0 = true;
                if (poVar.O0 == null) {
                    poVar.O0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                poVar.Y.f23315e.setTranslationX(-AndroidUtilities.dp(8.0f));
                poVar.Y.f23315e.setAnimation(poVar.O0);
                return;
            case 11:
                ((uq) obj).run(0);
                return;
            case 12:
                ((ur) obj).invalidateSelf();
                return;
            case 13:
                ds dsVar = (ds) obj;
                ArrayList arrayList = dsVar.f36246c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                dsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((vs) obj).f42203a;
                contactsActivity.W.f26132r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.W.f26132r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((mt) obj).f39067a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
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
                py pyVar = ((ow) obj).f39815y0;
                pyVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) pyVar, 9, true));
                pyVar.f40262w0.setIsEditing(false);
                pyVar.I4(false);
                return;
            case 23:
                py pyVar2 = ((pw) obj).f40138b;
                pyVar2.f40262w0.setIsEditing(true);
                pyVar2.I4(true);
                return;
            case 24:
                ((qw) obj).f40703a.f40161c0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                py pyVar3 = ((dy) obj).f36284a;
                i12 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                pyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((yy) obj).removeSelfFromStack();
                return;
            case 27:
                cz czVar = (cz) obj;
                ArrayList arrayList2 = czVar.f35912x;
                ArrayList arrayList3 = czVar.f35911w;
                if (czVar.f35909r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = czVar.f35909r;
                    tL_sendMessageEmojiInteraction.emoticon = czVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i15)).intValue() + 1);
                                jSONObject2.put("t", ((float) ((Long) arrayList3.get(i15)).longValue()) / 1000.0f);
                                jSONArray.put(i15, jSONObject2);
                            } catch (JSONException e6) {
                                e = e6;
                                czVar.f35909r = 0;
                                czVar.v = null;
                                czVar.f35910s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                czVar.f35913y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = czVar.G;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(czVar.f35904b).getInputPeer(czVar.F);
                        ConnectionsManager.getInstance(czVar.f35904b).sendRequest(tL_messages_setTyping, null);
                        czVar.f35909r = 0;
                        czVar.v = null;
                        czVar.f35910s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                czVar.f35913y = null;
                return;
            case 28:
                ((zz) obj).e0(true);
                return;
            default:
                ((xz) obj).f41332a.getBackground().setState(new int[0]);
                return;
        }
    }
}
