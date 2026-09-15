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
    public final int f37310a;
    public final Object f37311b;
    public final Object f37312c;
    public final Object d;
    public final Object e;
    public final Object f37313f;

    public sa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37310a = i10;
        this.f37311b = notificationCenterDelegate;
        this.f37312c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37313f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f37310a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((ub) this.f37311b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f37312c, (ArrayList) this.d, (ArrayList) this.e, (ra) this.f37313f));
                return;
            case 1:
                final bo boVar = (bo) this.f37311b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37312c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f37313f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = boVar.getMessagesController().getUserFull(user.f18259id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(boVar, t1Var);
                org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(boVar.getParentActivity(), boVar.f32297ea);
                I.f26363p = new pe(am0Var, 1);
                y yVar = new y(boVar, user, str, 2);
                org.telegram.ui.Components.n70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new q1(boVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new mu0(yVar, 26), false);
                if (tL_contact == null && (user == null || !boVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f18259id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new re(boVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(boVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(boVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new sg(boVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        bo boVar2 = boVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            boVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                        return;
                                    default:
                                        bo boVar3 = boVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            boVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
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
                                        bo boVar2 = boVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            boVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                        return;
                                    default:
                                        bo boVar3 = boVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            boVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(boVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(boVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new q1(boVar, am0Var, user, 16));
                }
                am0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.o51) {
                    String url = ((org.telegram.ui.Components.o51) characterStyle).getURL();
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
                boVar.showDialog(am0Var);
                return;
            case 2:
                bo boVar2 = (bo) this.f37311b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f37312c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f37313f;
                Long l4 = (Long) obj;
                int i10 = boVar2.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.c5.M(boVar2.getParentActivity(), boVar2.T5, new a1.d(boVar2, tL_document, str2, obj2, 4), boVar2.f32297ea);
                } else {
                    boVar2.getSendMessagesHelper().sendSticker(tL_document, str2, boVar2.T5, boVar2.f32403n5, boVar2.X3, null, boVar2.f32377l5, sendAnimationData, true, 0, 0, false, obj2, boVar2.C8(), l4.longValue(), boVar2.N8(), boVar2.f32317g5);
                    tL_document = tL_document;
                }
                boVar2.e9(false);
                boVar2.Y.o(tL_document);
                boVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f37312c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.jy jyVar = ((org.telegram.ui.Components.iy) this.f37311b).f25167a;
                String str3 = jyVar.v;
                ArrayList arrayList4 = jyVar.f25453r;
                ArrayList arrayList5 = jyVar.h;
                ArrayList arrayList6 = jyVar.f25454s;
                org.telegram.ui.Components.kz kzVar = jyVar.F;
                if (((String) this.f37313f).equals(str3)) {
                    org.telegram.ui.Components.jw jwVar = kzVar.V;
                    org.telegram.ui.Components.vx vxVar = kzVar.P;
                    int i11 = 0;
                    jwVar.e(false);
                    jyVar.f25457y = true;
                    s4.h0 adapter = vxVar.getAdapter();
                    org.telegram.ui.Components.jy jyVar2 = kzVar.S;
                    if (adapter != jyVar2) {
                        vxVar.setAdapter(jyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(jyVar.f25452n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.cy cyVar = (org.telegram.ui.Components.cy) obj3;
                        if (longSparseIntArray.indexOfKey(cyVar.f23162c.f18139id) < 0) {
                            longSparseIntArray.append(cyVar.f23162c.f18139id, 1);
                            arrayList6.add(cyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.cy cyVar2 = (org.telegram.ui.Components.cy) obj4;
                        if (longSparseIntArray.indexOfKey(cyVar2.f23162c.f18139id) < 0) {
                            longSparseIntArray.append(cyVar2.f23162c.f18139id, 1);
                            arrayList6.add(cyVar2);
                        }
                    }
                    jyVar.l();
                    return;
                }
                return;
            case 4:
                uy uyVar = (uy) this.f37311b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                uyVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f37312c).dismiss();
                uyVar.getMessagesController().loadChannelParticipants(l10);
                oy oyVar = uyVar.C2;
                uyVar.removeSelfFromStack();
                ((ld) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f37313f).finishFragment();
                if (oyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    oyVar.u(uyVar, arrayList7, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                    return;
                }
                return;
            default:
                yh.a4.s0((yh.a4) this.f37311b, (TL_stars.StarGift) this.f37312c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.xc[]) this.e, (boolean[]) this.f37313f, (ArrayList) obj);
                return;
        }
    }

    public sa(org.telegram.ui.Components.iy iyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f37310a = 3;
        this.f37311b = iyVar;
        this.f37313f = str;
        this.f37312c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
