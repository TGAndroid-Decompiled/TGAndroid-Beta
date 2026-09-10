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
public final class ua implements Utilities.Callback {
    public final int f37189a;
    public final Object f37190b;
    public final Object f37191c;
    public final Object d;
    public final Object e;
    public final Object f37192f;

    public ua(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37189a = i10;
        this.f37190b = notificationCenterDelegate;
        this.f37191c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37192f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f37189a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.te((wb) this.f37190b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f37191c, (ArrayList) this.d, (ArrayList) this.e, (ta) this.f37192f, 4));
                return;
            case 1:
                final eo eoVar = (eo) this.f37190b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37191c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f37192f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = eoVar.getMessagesController().getUserFull(user.f17342id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.w70 I = org.telegram.ui.Components.w70.I(eoVar, t1Var);
                org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(eoVar.getParentActivity(), eoVar.f32316ea);
                I.f28696p = new se(km0Var, 1);
                z zVar = new z(eoVar, user, str, 2);
                org.telegram.ui.Components.w70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new s1(eoVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new mu0(zVar, 26), false);
                if (tL_contact == null && (user == null || !eoVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f17342id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new di.p2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ue(eoVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(eoVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(eoVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new tg(eoVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        eo eoVar2 = eoVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            eoVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.m(user, false, z10, eoVar2.getParentActivity(), userFull2, eoVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.m(user, false, z10, eoVar2.getParentActivity(), userFull2, eoVar2.getAccountInstance());
                                        return;
                                    default:
                                        eo eoVar3 = eoVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            eoVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.m(user, true, z11, eoVar3.getParentActivity(), userFull3, eoVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.m(user, true, z11, eoVar3.getParentActivity(), userFull3, eoVar3.getAccountInstance());
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
                                        eo eoVar2 = eoVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            eoVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.m(user, false, z10, eoVar2.getParentActivity(), userFull2, eoVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.m(user, false, z10, eoVar2.getParentActivity(), userFull2, eoVar2.getAccountInstance());
                                        return;
                                    default:
                                        eo eoVar3 = eoVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            eoVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.m(user, true, z11, eoVar3.getParentActivity(), userFull3, eoVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.m(user, true, z11, eoVar3.getParentActivity(), userFull3, eoVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(eoVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(eoVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new s1(eoVar, km0Var, user, 16));
                }
                km0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.b61) {
                    String url = ((org.telegram.ui.Components.b61) characterStyle).getURL();
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
                    km0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    km0Var.f(t1Var, characterStyle, null, false);
                }
                eoVar.showDialog(km0Var);
                return;
            case 2:
                eo eoVar2 = (eo) this.f37190b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f37191c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f37192f;
                Long l4 = (Long) obj;
                int i10 = eoVar2.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.d5.M(eoVar2.getParentActivity(), eoVar2.T5, new a1.d(eoVar2, tL_document, str2, obj2, 4), eoVar2.f32316ea);
                } else {
                    eoVar2.getSendMessagesHelper().sendSticker(tL_document, str2, eoVar2.T5, eoVar2.f32421n5, eoVar2.X3, null, eoVar2.f32395l5, sendAnimationData, true, 0, 0, false, obj2, eoVar2.C8(), l4.longValue(), eoVar2.N8(), eoVar2.f32336g5);
                    tL_document = tL_document;
                }
                eoVar2.e9(false);
                eoVar2.Y.o(tL_document);
                eoVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f37191c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ry ryVar = ((org.telegram.ui.Components.qy) this.f37190b).f26493a;
                String str3 = ryVar.v;
                ArrayList arrayList4 = ryVar.f26781r;
                ArrayList arrayList5 = ryVar.h;
                ArrayList arrayList6 = ryVar.f26782s;
                org.telegram.ui.Components.rz rzVar = ryVar.F;
                if (((String) this.f37192f).equals(str3)) {
                    org.telegram.ui.Components.pw pwVar = rzVar.V;
                    org.telegram.ui.Components.px pxVar = rzVar.P;
                    int i11 = 0;
                    pwVar.e(false);
                    ryVar.f26785y = true;
                    s4.h0 adapter = pxVar.getAdapter();
                    org.telegram.ui.Components.ry ryVar2 = rzVar.S;
                    if (adapter != ryVar2) {
                        pxVar.setAdapter(ryVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(ryVar.f26780n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) obj3;
                        if (longSparseIntArray.indexOfKey(jyVar.f24521c.f17222id) < 0) {
                            longSparseIntArray.append(jyVar.f24521c.f17222id, 1);
                            arrayList6.add(jyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.jy jyVar2 = (org.telegram.ui.Components.jy) obj4;
                        if (longSparseIntArray.indexOfKey(jyVar2.f24521c.f17222id) < 0) {
                            longSparseIntArray.append(jyVar2.f24521c.f17222id, 1);
                            arrayList6.add(jyVar2);
                        }
                    }
                    ryVar.l();
                    return;
                }
                return;
            case 4:
                wy wyVar = (wy) this.f37190b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                wyVar.getClass();
                ((org.telegram.ui.ActionBar.d2) this.f37191c).dismiss();
                wyVar.getMessagesController().loadChannelParticipants(l10);
                qy qyVar = wyVar.C2;
                wyVar.removeSelfFromStack();
                ((nd) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) this.f37192f).finishFragment();
                if (qyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    qyVar.v(wyVar, arrayList7, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
                    return;
                }
                return;
            default:
                xh.x3.s0((xh.x3) this.f37190b, (TL_stars.StarGift) this.f37191c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.yc[]) this.e, (boolean[]) this.f37192f, (ArrayList) obj);
                return;
        }
    }

    public ua(org.telegram.ui.Components.qy qyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f37189a = 3;
        this.f37190b = qyVar;
        this.f37192f = str;
        this.f37191c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
