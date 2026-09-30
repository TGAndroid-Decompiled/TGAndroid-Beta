package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sa implements Utilities.Callback {
    public final int f37757a;
    public final Object f37758b;
    public final Object f37759c;
    public final Object d;
    public final Object e;
    public final Object f37760f;

    public sa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37757a = i10;
        this.f37758b = notificationCenterDelegate;
        this.f37759c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37760f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f37757a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((ub) this.f37758b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f37759c, (ArrayList) this.d, (ArrayList) this.e, (ra) this.f37760f));
                return;
            case 1:
                final wn wnVar = (wn) this.f37758b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37759c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f37760f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = wnVar.getMessagesController().getUserFull(user.f18499id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.b80 I = org.telegram.ui.Components.b80.I(wnVar, u1Var);
                org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(wnVar.getParentActivity(), wnVar.f39562ea);
                I.f22867p = new qe(pm0Var, 1);
                z zVar = new z(wnVar, user, str, 2);
                org.telegram.ui.Components.b80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new eu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(wnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new eu0(zVar, 26), false);
                if (tL_contact == null && (user == null || !wnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f18499id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(wnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(wnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(wnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new mg(wnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                        return;
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                        return;
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(wnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(wnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(wnVar, pm0Var, user, 16));
                }
                pm0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.e61) {
                    String url = ((org.telegram.ui.Components.e61) characterStyle).getURL();
                    if (url == null) {
                        url = "";
                    }
                    String trim = url.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        trim = trim.substring(0, 204) + "…";
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    pm0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    pm0Var.f(u1Var, characterStyle, null, false);
                }
                wnVar.showDialog(pm0Var);
                return;
            case 2:
                wn wnVar2 = (wn) this.f37758b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f37759c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f37760f;
                Long l4 = (Long) obj;
                int i10 = wnVar2.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.M(wnVar2.getParentActivity(), wnVar2.T5, new a1.d(wnVar2, tL_document, str2, obj2, 4), wnVar2.f39562ea);
                } else {
                    wnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, wnVar2.T5, wnVar2.f39667n5, wnVar2.X3, null, wnVar2.f39641l5, sendAnimationData, true, 0, 0, false, obj2, wnVar2.C8(), l4.longValue(), wnVar2.N8(), wnVar2.f39582g5);
                    tL_document = tL_document;
                }
                wnVar2.e9(false);
                wnVar2.Y.o(tL_document);
                wnVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f37759c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ny nyVar = ((org.telegram.ui.Components.my) this.f37758b).f26465a;
                String str3 = nyVar.v;
                ArrayList arrayList4 = nyVar.f26802r;
                ArrayList arrayList5 = nyVar.h;
                ArrayList arrayList6 = nyVar.f26803s;
                org.telegram.ui.Components.nz nzVar = nyVar.F;
                if (((String) this.f37760f).equals(str3)) {
                    org.telegram.ui.Components.mw mwVar = nzVar.V;
                    org.telegram.ui.Components.zx zxVar = nzVar.P;
                    int i11 = 0;
                    mwVar.e(false);
                    nyVar.f26806y = true;
                    s4.h0 adapter = zxVar.getAdapter();
                    org.telegram.ui.Components.ny nyVar2 = nzVar.S;
                    if (adapter != nyVar2) {
                        zxVar.setAdapter(nyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(nyVar.f26801n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.gy gyVar = (org.telegram.ui.Components.gy) obj3;
                        if (longSparseIntArray.indexOfKey(gyVar.f24686c.f18379id) < 0) {
                            longSparseIntArray.append(gyVar.f24686c.f18379id, 1);
                            arrayList6.add(gyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.gy gyVar2 = (org.telegram.ui.Components.gy) obj4;
                        if (longSparseIntArray.indexOfKey(gyVar2.f24686c.f18379id) < 0) {
                            longSparseIntArray.append(gyVar2.f24686c.f18379id, 1);
                            arrayList6.add(gyVar2);
                        }
                    }
                    nyVar.l();
                    return;
                }
                return;
            case 4:
                qy qyVar = (qy) this.f37758b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                qyVar.getClass();
                ((org.telegram.ui.ActionBar.a2) this.f37759c).dismiss();
                qyVar.getMessagesController().loadChannelParticipants(l10);
                ky kyVar = qyVar.C2;
                qyVar.removeSelfFromStack();
                ((ld) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.m2) this.f37760f).finishFragment();
                if (kyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    kyVar.u(qyVar, arrayList7, null, false, qyVar.J2, qyVar.K2, qyVar.L2, null);
                    return;
                }
                return;
            default:
                yh.x3.r0((yh.x3) this.f37758b, (TL_stars.StarGift) this.f37759c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.ad[]) this.e, (boolean[]) this.f37760f, (ArrayList) obj);
                return;
        }
    }

    public sa(org.telegram.ui.Components.my myVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f37757a = 3;
        this.f37758b = myVar;
        this.f37760f = str;
        this.f37759c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
