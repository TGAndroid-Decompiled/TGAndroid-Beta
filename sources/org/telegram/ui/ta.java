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
public final class ta implements Utilities.Callback {
    public final int f40693a;
    public final Object f40694b;
    public final Object f40695c;
    public final Object d;
    public final Object f40696e;
    public final Object f40697f;

    public ta(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40693a = i10;
        this.f40694b = notificationCenterDelegate;
        this.f40695c = obj;
        this.d = obj2;
        this.f40696e = obj3;
        this.f40697f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f40693a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.h8((ub) this.f40694b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f40695c, (ArrayList) this.d, (ArrayList) this.f40696e, (sa) this.f40697f));
                return;
            case 1:
                final co coVar = (co) this.f40694b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f40695c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f40696e;
                CharacterStyle characterStyle = (CharacterStyle) this.f40697f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = coVar.getMessagesController().getUserFull(user.f20016id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(coVar, t1Var);
                org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(coVar.getParentActivity(), coVar.f35247ea);
                I.f28655p = new qe(am0Var, 1);
                y yVar = new y(coVar, user, str, 2);
                org.telegram.ui.Components.n70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(coVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new lu0(yVar, 26), false);
                if (tL_contact == null && (user == null || !coVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f20016id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new fi.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(coVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(coVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(coVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new sg(coVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        co coVar2 = coVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            coVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                        return;
                                    default:
                                        co coVar3 = coVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            coVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
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
                                        co coVar2 = coVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            coVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                        return;
                                    default:
                                        co coVar3 = coVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            coVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(coVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(coVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(coVar, am0Var, user, 16));
                }
                am0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.n51) {
                    String url = ((org.telegram.ui.Components.n51) characterStyle).getURL();
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
                    am0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    am0Var.f(t1Var, characterStyle, null, false);
                }
                coVar.showDialog(am0Var);
                return;
            case 2:
                co coVar2 = (co) this.f40694b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f40695c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f40697f;
                Long l4 = (Long) obj;
                int i10 = coVar2.R3;
                Object obj2 = this.f40696e;
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.M(coVar2.getParentActivity(), coVar2.T5, new a1.d(coVar2, tL_document, str2, obj2, 4), coVar2.f35247ea);
                } else {
                    coVar2.getSendMessagesHelper().sendSticker(tL_document, str2, coVar2.T5, coVar2.f35352n5, coVar2.X3, null, coVar2.f35326l5, sendAnimationData, true, 0, 0, false, obj2, coVar2.C8(), l4.longValue(), coVar2.N8(), coVar2.f35267g5);
                    tL_document = tL_document;
                }
                coVar2.e9(false);
                coVar2.Y.o(tL_document);
                coVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f40695c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.f40696e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ky kyVar = ((org.telegram.ui.Components.jy) this.f40694b).f27584a;
                String str3 = kyVar.v;
                ArrayList arrayList4 = kyVar.f27918r;
                ArrayList arrayList5 = kyVar.h;
                ArrayList arrayList6 = kyVar.f27919s;
                org.telegram.ui.Components.kz kzVar = kyVar.F;
                if (((String) this.f40697f).equals(str3)) {
                    org.telegram.ui.Components.kw kwVar = kzVar.V;
                    org.telegram.ui.Components.kx kxVar = kzVar.P;
                    int i11 = 0;
                    kwVar.e(false);
                    kyVar.f27922y = true;
                    s4.h0 adapter = kxVar.getAdapter();
                    org.telegram.ui.Components.ky kyVar2 = kzVar.S;
                    if (adapter != kyVar2) {
                        kxVar.setAdapter(kyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(kyVar.f27917n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.dy dyVar = (org.telegram.ui.Components.dy) obj3;
                        if (longSparseIntArray.indexOfKey(dyVar.f25478c.f19896id) < 0) {
                            longSparseIntArray.append(dyVar.f25478c.f19896id, 1);
                            arrayList6.add(dyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.dy dyVar2 = (org.telegram.ui.Components.dy) obj4;
                        if (longSparseIntArray.indexOfKey(dyVar2.f25478c.f19896id) < 0) {
                            longSparseIntArray.append(dyVar2.f25478c.f19896id, 1);
                            arrayList6.add(dyVar2);
                        }
                    }
                    kyVar.l();
                    return;
                }
                return;
            case 4:
                uy uyVar = (uy) this.f40694b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                uyVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f40695c).dismiss();
                uyVar.getMessagesController().loadChannelParticipants(l10);
                oy oyVar = uyVar.C2;
                uyVar.removeSelfFromStack();
                ((md) this.f40696e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f40697f).finishFragment();
                if (oyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    oyVar.u(uyVar, arrayList7, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                    return;
                }
                return;
            default:
                zh.w3.s0((zh.w3) this.f40694b, (TL_stars.StarGift) this.f40695c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.ad[]) this.f40696e, (boolean[]) this.f40697f, (ArrayList) obj);
                return;
        }
    }

    public ta(org.telegram.ui.Components.jy jyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f40693a = 3;
        this.f40694b = jyVar;
        this.f40697f = str;
        this.f40695c = arrayList;
        this.d = arrayList2;
        this.f40696e = arrayList3;
    }
}
