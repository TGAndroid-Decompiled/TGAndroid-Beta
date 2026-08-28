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
public final class ri implements Runnable {
    public final int f42435a;
    public final Object f42436b;

    public ri(Object obj, int i9) {
        this.f42435a = i9;
        this.f42436b = obj;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12 = this.f42435a;
        int i13 = 0;
        Object obj = this.f42436b;
        switch (i12) {
            case 0:
                si siVar = (si) obj;
                i9 = ((org.telegram.ui.ActionBar.o2) ((qn) siVar.f42705e)).currentAccount;
                NotificationCenter.getInstance(i9).onAnimationFinish(siVar.f42704c);
                return;
            case 1:
                qn.X1(((ij) obj).f39194u3);
                return;
            case 2:
                ((lj) obj).T.f42114w0.O(false);
                return;
            case 3:
                li liVar = (li) obj;
                qn qnVar = liVar.f40146b;
                if (qnVar.a2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qnVar.a2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new mh.x(liVar, 25));
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
                bm bmVar = ((sl) obj).f42716c.f43027a;
                i10 = ((org.telegram.ui.ActionBar.o2) bmVar.M).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i10).clientUserId);
                bmVar.M.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((gm) obj).f38568c.e9(true);
                return;
            case 7:
                ((oi) obj).c(false);
                return;
            case 8:
                qn qnVar2 = ((dn) obj).h;
                qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.E9);
                return;
            case 9:
                qn qnVar3 = ((in) obj).h;
                qnVar3.f41904f0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(qnVar3.f41904f0.getSearchField());
                if (qnVar3.f41987la > 0) {
                    gf gfVar = new gf(qnVar3, 9);
                    qnVar3.f41999ma = gfVar;
                    AndroidUtilities.runOnUIThread(gfVar, 200L);
                    return;
                }
                return;
            case 10:
                ho hoVar = ((fo) obj).f38325a;
                hoVar.f38842e.setImageDrawable(hoVar.f38857r);
                hoVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = hoVar.f38870z0;
                if (user != null) {
                    user.photo = null;
                    hoVar.getMessagesController().putUser(hoVar.f38870z0, true);
                }
                hoVar.K0 = true;
                if (hoVar.N0 == null) {
                    int i14 = R.raw.camera_outline;
                    hoVar.N0 = new org.telegram.ui.Components.mi0(i14, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                hoVar.X.f24875e.setTranslationX(-AndroidUtilities.dp(8.0f));
                hoVar.X.f24875e.setAnimation(hoVar.N0);
                return;
            case 11:
                ((lq) obj).run(0);
                return;
            case 12:
                ((nr) obj).invalidateSelf();
                return;
            case 13:
                wr wrVar = (wr) obj;
                ArrayList arrayList = wrVar.f44250c;
                int size = arrayList.size();
                while (i13 < size) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    ((View) obj2).invalidate();
                }
                wrVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((os) obj).f41235a;
                contactsActivity.V.f30664r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.V.f30664r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((dt) obj).f37593a.p();
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
                ((org.telegram.ui.Cells.z2) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.sa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                dy dyVar = ((cw) obj).f37335x0;
                dyVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) dyVar, 9, true));
                dyVar.f37735v0.setIsEditing(false);
                dyVar.I4(false);
                return;
            case 23:
                dy dyVar2 = ((dw) obj).f37619b;
                dyVar2.f37735v0.setIsEditing(true);
                dyVar2.I4(true);
                return;
            case 24:
                ((ew) obj).f38033a.f37633b0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                dy dyVar3 = ((qx) obj).f42216a;
                i11 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i11).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                dyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((my) obj).removeSelfFromStack();
                return;
            case 27:
                py pyVar = (py) obj;
                ArrayList arrayList2 = pyVar.f41625x;
                ArrayList arrayList3 = pyVar.f41624w;
                if (pyVar.f41622r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = pyVar.f41622r;
                    tL_sendMessageEmojiInteraction.emoticon = pyVar.v;
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
                            } catch (JSONException e10) {
                                e = e10;
                                pyVar.f41622r = 0;
                                pyVar.v = null;
                                pyVar.f41623s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                pyVar.f41626y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = pyVar.F;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(pyVar.f41617b).getInputPeer(pyVar.E);
                        ConnectionsManager.getInstance(pyVar.f41617b).sendRequest(tL_messages_setTyping, null);
                        pyVar.f41622r = 0;
                        pyVar.v = null;
                        pyVar.f41623s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                pyVar.f41626y = null;
                return;
            case 28:
                ((lz) obj).d0(true);
                return;
            default:
                ((jz) obj).f38045a.getBackground().setState(new int[0]);
                return;
        }
    }
}
