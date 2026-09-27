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
public final class va implements Utilities.Callback {
    public final int f38529a;
    public final Object f38530b;
    public final Object f38531c;
    public final Object d;
    public final Object e;
    public final Object f38532f;

    public va(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38529a = i10;
        this.f38530b = notificationCenterDelegate;
        this.f38531c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f38532f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f38529a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((wb) this.f38530b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f38531c, (ArrayList) this.d, (ArrayList) this.e, (ua) this.f38532f));
                return;
            case 1:
                final xn xnVar = (xn) this.f38530b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f38531c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f38532f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = xnVar.getMessagesController().getUserFull(user.f18476id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.a80 I = org.telegram.ui.Components.a80.I(xnVar, u1Var);
                org.telegram.ui.Components.om0 om0Var = new org.telegram.ui.Components.om0(xnVar.getParentActivity(), xnVar.f39750ea);
                I.f22601p = new te(om0Var, 1);
                a0 a0Var = new a0(xnVar, user, str, 2);
                org.telegram.ui.Components.a80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new hu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new s1(xnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new hu0(a0Var, 26), false);
                if (tL_contact == null && (user == null || !xnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f18476id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ve(xnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ve(xnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ve(xnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new pg(xnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            xnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
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
                                        xn xnVar2 = xnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            xnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ve(xnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ve(xnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new s1(xnVar, om0Var, user, 16));
                }
                om0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.d61) {
                    String url = ((org.telegram.ui.Components.d61) characterStyle).getURL();
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
                    om0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    om0Var.f(u1Var, characterStyle, null, false);
                }
                xnVar.showDialog(om0Var);
                return;
            case 2:
                xn xnVar2 = (xn) this.f38530b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f38531c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f38532f;
                Long l4 = (Long) obj;
                int i10 = xnVar2.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.M(xnVar2.getParentActivity(), xnVar2.T5, new a1.d(xnVar2, tL_document, str2, obj2, 4), xnVar2.f39750ea);
                } else {
                    xnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, xnVar2.T5, xnVar2.f39856n5, xnVar2.X3, null, xnVar2.f39830l5, sendAnimationData, true, 0, 0, false, obj2, xnVar2.C8(), l4.longValue(), xnVar2.N8(), xnVar2.f39770g5);
                    tL_document = tL_document;
                }
                xnVar2.e9(false);
                xnVar2.Y.o(tL_document);
                xnVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f38531c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.my myVar = ((org.telegram.ui.Components.ly) this.f38530b).f26231a;
                String str3 = myVar.v;
                ArrayList arrayList4 = myVar.f26558r;
                ArrayList arrayList5 = myVar.h;
                ArrayList arrayList6 = myVar.f26559s;
                org.telegram.ui.Components.mz mzVar = myVar.F;
                if (((String) this.f38532f).equals(str3)) {
                    org.telegram.ui.Components.mw mwVar = mzVar.V;
                    org.telegram.ui.Components.xx xxVar = mzVar.P;
                    int i11 = 0;
                    mwVar.e(false);
                    myVar.f26562y = true;
                    s4.h0 adapter = xxVar.getAdapter();
                    org.telegram.ui.Components.my myVar2 = mzVar.S;
                    if (adapter != myVar2) {
                        xxVar.setAdapter(myVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(myVar.f26557n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.ey eyVar = (org.telegram.ui.Components.ey) obj3;
                        if (longSparseIntArray.indexOfKey(eyVar.f24151c.f18356id) < 0) {
                            longSparseIntArray.append(eyVar.f24151c.f18356id, 1);
                            arrayList6.add(eyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.ey eyVar2 = (org.telegram.ui.Components.ey) obj4;
                        if (longSparseIntArray.indexOfKey(eyVar2.f24151c.f18356id) < 0) {
                            longSparseIntArray.append(eyVar2.f24151c.f18356id, 1);
                            arrayList6.add(eyVar2);
                        }
                    }
                    myVar.l();
                    return;
                }
                return;
            case 4:
                ty tyVar = (ty) this.f38530b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                tyVar.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f38531c).dismiss();
                tyVar.getMessagesController().loadChannelParticipants(l10);
                ny nyVar = tyVar.C2;
                tyVar.removeSelfFromStack();
                ((nd) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.f38532f).finishFragment();
                if (nyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    nyVar.u(tyVar, arrayList7, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
                    return;
                }
                return;
            default:
                yh.x3.r0((yh.x3) this.f38530b, (TL_stars.StarGift) this.f38531c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e, (boolean[]) this.f38532f, (ArrayList) obj);
                return;
        }
    }

    public va(org.telegram.ui.Components.ly lyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f38529a = 3;
        this.f38530b = lyVar;
        this.f38532f = str;
        this.f38531c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
