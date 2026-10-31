package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rh implements Runnable {
    public final int f41229a;
    public final Object f41230b;

    public rh(Object obj, int i10) {
        this.f41229a = i10;
        this.f41230b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f41229a;
        int i15 = 0;
        Object obj = this.f41230b;
        switch (i14) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                ci.k kVar = (ci.k) obj;
                i10 = ((org.telegram.ui.ActionBar.k2) ((un) kVar.e)).currentAccount;
                org.telegram.messenger.zs.f(i10).j(kVar.f4224c);
                return;
            case 2:
                dj djVar = (dj) obj;
                i11 = ((org.telegram.ui.ActionBar.k2) ((un) djVar.e)).currentAccount;
                org.telegram.messenger.zs.f(i11).j(djVar.f36778c);
                return;
            case 3:
                un.d2(((vj) obj).F3);
                return;
            case 4:
                ((yj) obj).T.C0.O(false);
                return;
            case 5:
                bi biVar = (bi) obj;
                un unVar = biVar.f36263b;
                if (unVar.f42405s2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(unVar.f42405s2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new s9(biVar, 17));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    return;
                }
                return;
            case 6:
                ((org.telegram.messenger.jj) obj).f16359q = false;
                return;
            case 7:
                Bundle bundle = new Bundle();
                fm fmVar = ((zl) obj).f44179c.f35671a;
                i12 = ((org.telegram.ui.ActionBar.k2) fmVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.d20.i(i12).f15165n);
                fmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 8:
                ((hm) obj).f37996b.r9(true);
                return;
            case 9:
                ((bj) obj).c(false);
                return;
            case 10:
                un unVar2 = ((gn) obj).h;
                unVar2.getNotificationCenter().j(unVar2.f42202ba);
                return;
            case 11:
                un unVar3 = ((mn) obj).f39737b;
                unVar3.f42291j0.getSearchField().requestFocus();
                org.telegram.messenger.i0.J3(unVar3.f42291j0.getSearchField());
                if (unVar3.Ia > 0) {
                    mf mfVar = new mf(unVar3, 10);
                    unVar3.Ja = mfVar;
                    org.telegram.messenger.i0.h3(mfVar, 200L);
                    return;
                }
                return;
            case 12:
                oo ooVar = ((lo) obj).f39326a;
                ooVar.e.setImageDrawable(ooVar.f40335r);
                ooVar.f40317b0.o(2131232046, org.telegram.messenger.cd.L0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().U3(ooVar.C0, true, false);
                }
                ooVar.O0 = true;
                if (ooVar.R0 == null) {
                    ooVar.R0 = new org.telegram.ui.Components.bi0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                }
                ooVar.f40317b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                ooVar.f40317b0.e.setAnimation(ooVar.R0);
                return;
            case 13:
                ((sq) obj).a(0);
                return;
            case 14:
                ((vr) obj).invalidateSelf();
                return;
            case 15:
                cs csVar = (cs) obj;
                ArrayList arrayList = csVar.f36532c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                csVar.invalidateSelf();
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((gt) obj).f37643a.o();
                return;
            case 18:
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) obj;
                org.telegram.ui.ActionBar.z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(((org.telegram.messenger.c) obj).f14863a);
                q6.getMessagesStorage().f15938a.c(new org.telegram.messenger.y5(q6, 0));
                return;
            case 20:
                ((org.telegram.ui.Cells.d3) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.ma) obj).updateColors();
                return;
            case 22:
                ((org.telegram.ui.Cells.l) obj).updateColors();
                return;
            case 23:
                ((ay) ((ar) obj).f35699b).f35800f0.setAlpha(1.0f);
                return;
            case 24:
                Bundle bundle2 = new Bundle();
                ay ayVar = ((ox) obj).f40388a;
                i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.d20.i(i13).e());
                bundle2.putBoolean("my_profile", true);
                ayVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 25:
                ay ayVar2 = ((qx) obj).B0;
                ayVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) ayVar2, 9, true));
                ayVar2.f35900z0.setIsEditing(false);
                ayVar2.T4(false);
                return;
            case 26:
                ay ayVar3 = ((rx) obj).f41307b;
                ayVar3.f35900z0.setIsEditing(true);
                ayVar3.T4(true);
                return;
            case 27:
                ((iy) obj).removeSelfFromStack();
                return;
            case 28:
                ly lyVar = (ly) obj;
                ArrayList arrayList2 = lyVar.f39435y;
                ArrayList arrayList3 = lyVar.f39434x;
                if (lyVar.f39431r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = lyVar.f39431r;
                    tL_sendMessageEmojiInteraction.emoticon = lyVar.f39433w;
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
                                lyVar.f39431r = 0;
                                lyVar.f39433w = null;
                                lyVar.f39432s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.f8.g(e, true);
                                lyVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = lyVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.vp.r1(lyVar.f39427b).i1(lyVar.I);
                        ConnectionsManager.getInstance(lyVar.f39427b).sendRequest(tL_messages_setTyping, null);
                        lyVar.f39431r = 0;
                        lyVar.f39433w = null;
                        lyVar.f39432s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                lyVar.D = null;
                return;
            default:
                ((iz) obj).i0(true);
                return;
        }
    }
}
