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
    public final int f41089a;
    public final Object f41090b;

    public rh(Object obj, int i10) {
        this.f41089a = i10;
        this.f41090b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f41089a;
        int i15 = 0;
        Object obj = this.f41090b;
        switch (i14) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                ci.k kVar = (ci.k) obj;
                i10 = ((org.telegram.ui.ActionBar.k2) ((un) kVar.e)).currentAccount;
                org.telegram.messenger.at.f(i10).j(kVar.f4224c);
                return;
            case 2:
                dj djVar = (dj) obj;
                i11 = ((org.telegram.ui.ActionBar.k2) ((un) djVar.e)).currentAccount;
                org.telegram.messenger.at.f(i11).j(djVar.f36616c);
                return;
            case 3:
                un.e2(((vj) obj).F3);
                return;
            case 4:
                ((yj) obj).T.C0.O(false);
                return;
            case 5:
                bi biVar = (bi) obj;
                un unVar = biVar.f36060b;
                if (unVar.f42216s2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(unVar.f42216s2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new s9(biVar, 17));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    return;
                }
                return;
            case 6:
                ((org.telegram.messenger.kj) obj).f16712q = false;
                return;
            case 7:
                Bundle bundle = new Bundle();
                fm fmVar = ((zl) obj).f44020c.f35805a;
                i12 = ((org.telegram.ui.ActionBar.k2) fmVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.e20.i(i12).f15524n);
                fmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 8:
                ((hm) obj).f37835b.w9(true);
                return;
            case 9:
                ((bj) obj).c(false);
                return;
            case 10:
                un unVar2 = ((gn) obj).h;
                unVar2.getNotificationCenter().j(unVar2.f42013ba);
                return;
            case 11:
                un unVar3 = ((mn) obj).f39577b;
                unVar3.f42102j0.getSearchField().requestFocus();
                org.telegram.messenger.i0.J3(unVar3.f42102j0.getSearchField());
                if (unVar3.Ia > 0) {
                    nf nfVar = new nf(unVar3, 9);
                    unVar3.Ja = nfVar;
                    org.telegram.messenger.i0.h3(nfVar, 200L);
                    return;
                }
                return;
            case 12:
                oo ooVar = ((lo) obj).f39340a;
                ooVar.e.setImageDrawable(ooVar.f40224r);
                ooVar.f40206b0.o(2131232046, org.telegram.messenger.dd.L0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().U3(ooVar.C0, true, false);
                }
                ooVar.O0 = true;
                if (ooVar.R0 == null) {
                    ooVar.R0 = new org.telegram.ui.Components.ci0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                }
                ooVar.f40206b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                ooVar.f40206b0.e.setAnimation(ooVar.R0);
                return;
            case 13:
                ((sq) obj).a(0);
                return;
            case 14:
                ((vr) obj).invalidateSelf();
                return;
            case 15:
                cs csVar = (cs) obj;
                ArrayList arrayList = csVar.f36391c;
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
                ((ft) obj).f37231a.o();
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
                org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(((org.telegram.messenger.c) obj).f15043a);
                q6.getMessagesStorage().f16331a.c(new org.telegram.messenger.y5(q6, 0));
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
                ((zx) ((ar) obj).f35827b).f44143f0.setAlpha(1.0f);
                return;
            case 24:
                Bundle bundle2 = new Bundle();
                zx zxVar = ((nx) obj).f39980a;
                i13 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.e20.i(i13).e());
                bundle2.putBoolean("my_profile", true);
                zxVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 25:
                zx zxVar2 = ((px) obj).B0;
                zxVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) zxVar2, 9, true));
                zxVar2.f44243z0.setIsEditing(false);
                zxVar2.U4(false);
                return;
            case 26:
                zx zxVar3 = ((qx) obj).f40919b;
                zxVar3.f44243z0.setIsEditing(true);
                zxVar3.U4(true);
                return;
            case 27:
                ((hy) obj).removeSelfFromStack();
                return;
            case 28:
                ky kyVar = (ky) obj;
                ArrayList arrayList2 = kyVar.f39025y;
                ArrayList arrayList3 = kyVar.f39024x;
                if (kyVar.f39021r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = kyVar.f39021r;
                    tL_sendMessageEmojiInteraction.emoticon = kyVar.f39023w;
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
                                kyVar.f39021r = 0;
                                kyVar.f39023w = null;
                                kyVar.f39022s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.f8.g(e, true);
                                kyVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = kyVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.wp.r1(kyVar.f39017b).i1(kyVar.I);
                        ConnectionsManager.getInstance(kyVar.f39017b).sendRequest(tL_messages_setTyping, null);
                        kyVar.f39021r = 0;
                        kyVar.f39023w = null;
                        kyVar.f39022s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                kyVar.D = null;
                return;
            default:
                ((hz) obj).j0(true);
                return;
        }
    }
}
