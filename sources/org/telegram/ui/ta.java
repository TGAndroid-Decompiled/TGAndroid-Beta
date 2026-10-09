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
    public final int f41927a;
    public final Object f41928b;
    public final Object f41929c;
    public final Object d;
    public final Object f41930e;
    public final Object f41931f;

    public ta(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f41927a = i10;
        this.f41928b = notificationCenterDelegate;
        this.f41929c = obj;
        this.d = obj2;
        this.f41930e = obj3;
        this.f41931f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f41927a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.a9((vb) this.f41928b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f41929c, (ArrayList) this.d, (ArrayList) this.f41930e, (sa) this.f41931f));
                return;
            case 1:
                zn znVar = (zn) this.f41928b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f41929c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f41931f;
                Long l4 = (Long) obj;
                int i10 = znVar.R3;
                Object obj2 = this.f41930e;
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.L(znVar.getParentActivity(), znVar.T5, new a1.d(znVar, tL_document, str, obj2, 4), znVar.f44761ea);
                } else {
                    znVar.getSendMessagesHelper().sendSticker(tL_document, str, znVar.T5, znVar.f44866n5, znVar.X3, null, znVar.f44840l5, sendAnimationData, true, 0, 0, false, obj2, znVar.H8(), l4.longValue(), znVar.S8(), znVar.f44781g5);
                    tL_document = tL_document;
                }
                znVar.j9(false);
                znVar.Y.m(tL_document);
                znVar.Y.setFieldText("");
                return;
            case 2:
                final zn znVar2 = (zn) this.f41928b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41929c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f41930e;
                CharacterStyle characterStyle = (CharacterStyle) this.f41931f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = znVar2.getMessagesController().getUserFull(user.f20185id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.p80 I = org.telegram.ui.Components.p80.I(znVar2, u1Var);
                org.telegram.ui.Components.gn0 gn0Var = new org.telegram.ui.Components.gn0(znVar2.getParentActivity(), znVar2.f44761ea);
                I.f29784p = new se(gn0Var, 1);
                z zVar = new z(znVar2, user, str2, 2);
                org.telegram.ui.Components.p80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new nu0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(znVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new nu0(zVar, 27), false);
                if (tL_contact == null && (user == null || !znVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.f20185id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ue(znVar2, str2, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(znVar2, str2, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(znVar2, str2, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new qg(znVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        zn znVar3 = znVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z12, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z122, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                        return;
                                    default:
                                        zn znVar4 = znVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z13, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z132, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
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
                                        zn znVar3 = znVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z122, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z1222, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                        return;
                                    default:
                                        zn znVar4 = znVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z132, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z1322, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(znVar2, str2, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(znVar2, str2, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(znVar2, gn0Var, user, 17));
                }
                gn0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.v61) {
                    String url = ((org.telegram.ui.Components.v61) characterStyle).getURL();
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
                    gn0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    gn0Var.f(u1Var, characterStyle, null, false);
                }
                znVar2.showDialog(gn0Var);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f41929c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.f41930e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.zy zyVar = ((org.telegram.ui.Components.yy) this.f41928b).f33403a;
                String str3 = zyVar.v;
                ArrayList arrayList4 = zyVar.f33678r;
                ArrayList arrayList5 = zyVar.h;
                ArrayList arrayList6 = zyVar.f33679s;
                org.telegram.ui.Components.a00 a00Var = zyVar.F;
                if (((String) this.f41931f).equals(str3)) {
                    org.telegram.ui.Components.zw zwVar = a00Var.V;
                    org.telegram.ui.Components.my myVar = a00Var.P;
                    int i11 = 0;
                    zwVar.e(false);
                    zyVar.f33682y = true;
                    s4.i0 adapter = myVar.getAdapter();
                    org.telegram.ui.Components.zy zyVar2 = a00Var.S;
                    if (adapter != zyVar2) {
                        myVar.setAdapter(zyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(zyVar.f33677n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.sy syVar = (org.telegram.ui.Components.sy) obj3;
                        if (longSparseIntArray.indexOfKey(syVar.f30950c.f20065id) < 0) {
                            longSparseIntArray.append(syVar.f30950c.f20065id, 1);
                            arrayList6.add(syVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.sy syVar2 = (org.telegram.ui.Components.sy) obj4;
                        if (longSparseIntArray.indexOfKey(syVar2.f30950c.f20065id) < 0) {
                            longSparseIntArray.append(syVar2.f30950c.f20065id, 1);
                            arrayList6.add(syVar2);
                        }
                    }
                    zyVar.l();
                    return;
                }
                return;
            case 4:
                ty tyVar = (ty) this.f41928b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                tyVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f41929c).dismiss();
                tyVar.getMessagesController().loadChannelParticipants(l10);
                ny nyVar = tyVar.C2;
                tyVar.removeSelfFromStack();
                ((md) this.f41930e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f41931f).finishFragment();
                if (nyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    nyVar.w(tyVar, arrayList7, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
                    return;
                }
                return;
            default:
                yh.s3.s0((yh.s3) this.f41928b, (TL_stars.StarGift) this.f41929c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.cd[]) this.f41930e, (boolean[]) this.f41931f, (ArrayList) obj);
                return;
        }
    }

    public ta(org.telegram.ui.Components.yy yyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f41927a = 3;
        this.f41928b = yyVar;
        this.f41931f = str;
        this.f41929c = arrayList;
        this.d = arrayList2;
        this.f41930e = arrayList3;
    }
}
