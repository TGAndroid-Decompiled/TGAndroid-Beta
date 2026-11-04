package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xg implements Runnable {
    public final int f52019a;
    public final Object f52020b;

    public xg(Object obj, int i3) {
        this.f52019a = i3;
        this.f52020b = obj;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.f52019a;
        int i14 = 0;
        Object obj = this.f52020b;
        switch (i13) {
            case 0:
                ((o6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                gi.z4 z4Var = (gi.z4) obj;
                i3 = ((org.telegram.ui.ActionBar.d2) ((wm) z4Var.f14028e)).currentAccount;
                org.telegram.messenger.hs.f(i3).j(z4Var.f14026b);
                return;
            case 2:
                fi fiVar = (fi) obj;
                i10 = ((org.telegram.ui.ActionBar.d2) ((wm) fiVar.f45287e)).currentAccount;
                org.telegram.messenger.hs.f(i10).j(fiVar.f45286c);
                return;
            case 3:
                wm.e2(((wi) obj).G3);
                return;
            case 4:
                ((zi) obj).T.D0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.zi) obj).f26889q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                fl flVar = ((zk) obj).f52692c.f43794a;
                i11 = ((org.telegram.ui.ActionBar.d2) flVar.R).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.h10.i(i11).f22848n);
                flVar.R.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((hl) obj).f45933b.B9(true);
                return;
            case 8:
                ((di) obj).c(false);
                return;
            case 9:
                wm wmVar = ((im) obj).h;
                wmVar.getNotificationCenter().j(wmVar.f51275ca);
                return;
            case 10:
                wm wmVar2 = ((om) obj).f48311b;
                wmVar2.f51371k0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(wmVar2.f51371k0.getSearchField());
                if (wmVar2.Ja > 0) {
                    xe xeVar = new xe(wmVar2, 9);
                    wmVar2.Ka = xeVar;
                    org.telegram.messenger.g0.i3(xeVar, 200L);
                    return;
                }
                return;
            case 11:
                ln lnVar = ((jn) obj).f46653a;
                lnVar.f47371e.setImageDrawable(lnVar.f47386r);
                lnVar.f47369c0.o(2131232047, org.telegram.messenger.bd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = lnVar.D0;
                if (user != null) {
                    user.photo = null;
                    lnVar.getMessagesController().X3(lnVar.D0, true, false);
                }
                lnVar.P0 = true;
                if (lnVar.S0 == null) {
                    lnVar.S0 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                lnVar.f47369c0.f29595e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                lnVar.f47369c0.f29595e.setAnimation(lnVar.S0);
                return;
            case 12:
                ((rp) obj).a(0);
                return;
            case 13:
                ((tq) obj).invalidateSelf();
                return;
            case 14:
                ar arVar = (ar) obj;
                ArrayList arrayList = arVar.f43829c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                arVar.invalidateSelf();
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((es) obj).f45025a.o();
                return;
            case 17:
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj;
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    t2VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).f21919a);
                q10.getMessagesStorage().f24934a.c(new org.telegram.messenger.w5(q10, 0));
                return;
            case 19:
                ((org.telegram.ui.Cells.b3) obj).updateColors();
                return;
            case 20:
                ((org.telegram.ui.Cells.ma) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                return;
            case 22:
                ((uw) ((o9) obj).f48236b).f50235g0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                uw uwVar = ((gw) obj).f45723a;
                i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.h10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                uwVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                uw uwVar2 = ((jw) obj).C0;
                uwVar2.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) uwVar2, 9, true));
                uwVar2.A0.setIsEditing(false);
                uwVar2.U4(false);
                return;
            case 25:
                uw uwVar3 = ((kw) obj).f47036b;
                uwVar3.A0.setIsEditing(true);
                uwVar3.U4(true);
                return;
            case 26:
                ((cx) obj).removeSelfFromStack();
                return;
            case 27:
                fx fxVar = (fx) obj;
                ArrayList arrayList2 = fxVar.f45395y;
                ArrayList arrayList3 = fxVar.f45394x;
                if (fxVar.f45391r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = fxVar.f45391r;
                    tL_sendMessageEmojiInteraction.emoticon = fxVar.f45393w;
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
                                fxVar.f45391r = 0;
                                fxVar.f45393w = null;
                                fxVar.f45392s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                fxVar.E = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = fxVar.K;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.hp.s1(fxVar.f45386b).j1(fxVar.J);
                        ConnectionsManager.getInstance(fxVar.f45386b).sendRequest(tL_messages_setTyping, null);
                        fxVar.f45391r = 0;
                        fxVar.f45393w = null;
                        fxVar.f45392s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                fxVar.E = null;
                return;
            case 28:
                ((cy) obj).j0(true);
                return;
            default:
                ((zx) obj).f50336a.getBackground().setState(new int[0]);
                return;
        }
    }
}
