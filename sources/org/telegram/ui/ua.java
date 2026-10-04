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
    public final int f41129a;
    public final Object f41130b;
    public final Object f41131c;
    public final Object d;
    public final Object f41132e;
    public final Object f41133f;

    public ua(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f41129a = i10;
        this.f41130b = notificationCenterDelegate;
        this.f41131c = obj;
        this.d = obj2;
        this.f41132e = obj3;
        this.f41133f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f41129a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((wb) this.f41130b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f41131c, (ArrayList) this.d, (ArrayList) this.f41132e, (ta) this.f41133f));
                return;
            case 1:
                yn ynVar = (yn) this.f41130b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f41131c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f41133f;
                Long l4 = (Long) obj;
                int i10 = ynVar.P3;
                Object obj2 = this.f41132e;
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.M(ynVar.getParentActivity(), ynVar.R5, new a1.d(ynVar, tL_document, str, obj2, 4), ynVar.f43299ca);
                } else {
                    ynVar.getSendMessagesHelper().sendSticker(tL_document, str, ynVar.R5, ynVar.f43404l5, ynVar.V3, null, ynVar.f43380j5, sendAnimationData, true, 0, 0, false, obj2, ynVar.D8(), l4.longValue(), ynVar.O8(), ynVar.f43320e5);
                    tL_document = tL_document;
                }
                ynVar.f9(false);
                ynVar.W.o(tL_document);
                ynVar.W.setFieldText("");
                return;
            case 2:
                final yn ynVar2 = (yn) this.f41130b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f41131c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f41132e;
                CharacterStyle characterStyle = (CharacterStyle) this.f41133f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = ynVar2.getMessagesController().getUserFull(user.f20184id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.b80 I = org.telegram.ui.Components.b80.I(ynVar2, u1Var);
                org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(ynVar2.getParentActivity(), ynVar2.f43299ca);
                I.f24839p = new se(sm0Var, 1);
                z zVar = new z(ynVar2, user, str2, 2);
                org.telegram.ui.Components.b80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new hu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(ynVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new hu0(zVar, 26), false);
                if (tL_contact == null && (user == null || !ynVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.f20184id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.n2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ue(ynVar2, str2, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(ynVar2, str2, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(ynVar2, str2, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new sg(ynVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        yn ynVar3 = ynVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            ynVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, ynVar3.getParentActivity(), userFull2, ynVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, ynVar3.getParentActivity(), userFull2, ynVar3.getAccountInstance());
                                        return;
                                    default:
                                        yn ynVar4 = ynVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            ynVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, ynVar4.getParentActivity(), userFull3, ynVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, ynVar4.getParentActivity(), userFull3, ynVar4.getAccountInstance());
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
                                        yn ynVar3 = ynVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            ynVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, ynVar3.getParentActivity(), userFull2, ynVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, ynVar3.getParentActivity(), userFull2, ynVar3.getAccountInstance());
                                        return;
                                    default:
                                        yn ynVar4 = ynVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            ynVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, ynVar4.getParentActivity(), userFull3, ynVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, ynVar4.getParentActivity(), userFull3, ynVar4.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(ynVar2, str2, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(ynVar2, str2, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(ynVar2, sm0Var, user, 16));
                }
                sm0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.m61) {
                    String url = ((org.telegram.ui.Components.m61) characterStyle).getURL();
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
                    sm0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    sm0Var.f(u1Var, characterStyle, null, false);
                }
                ynVar2.showDialog(sm0Var);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f41131c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.f41132e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ny nyVar = ((org.telegram.ui.Components.my) this.f41130b).f28748a;
                String str3 = nyVar.v;
                ArrayList arrayList4 = nyVar.f29077r;
                ArrayList arrayList5 = nyVar.h;
                ArrayList arrayList6 = nyVar.f29078s;
                org.telegram.ui.Components.nz nzVar = nyVar.F;
                if (((String) this.f41133f).equals(str3)) {
                    org.telegram.ui.Components.nw nwVar = nzVar.V;
                    org.telegram.ui.Components.zx zxVar = nzVar.P;
                    int i11 = 0;
                    nwVar.e(false);
                    nyVar.f29081y = true;
                    s4.h0 adapter = zxVar.getAdapter();
                    org.telegram.ui.Components.ny nyVar2 = nzVar.S;
                    if (adapter != nyVar2) {
                        zxVar.setAdapter(nyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(nyVar.f29076n);
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
                        if (longSparseIntArray.indexOfKey(gyVar.f26946c.f20064id) < 0) {
                            longSparseIntArray.append(gyVar.f26946c.f20064id, 1);
                            arrayList6.add(gyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.gy gyVar2 = (org.telegram.ui.Components.gy) obj4;
                        if (longSparseIntArray.indexOfKey(gyVar2.f26946c.f20064id) < 0) {
                            longSparseIntArray.append(gyVar2.f26946c.f20064id, 1);
                            arrayList6.add(gyVar2);
                        }
                    }
                    nyVar.l();
                    return;
                }
                return;
            case 4:
                uy uyVar = (uy) this.f41130b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                uyVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f41131c).dismiss();
                uyVar.getMessagesController().loadChannelParticipants(l10);
                oy oyVar = uyVar.C2;
                uyVar.removeSelfFromStack();
                ((nd) this.f41132e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f41133f).finishFragment();
                if (oyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    oyVar.u(uyVar, arrayList7, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                    return;
                }
                return;
            default:
                yh.x3.r0((yh.x3) this.f41130b, (TL_stars.StarGift) this.f41131c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.ad[]) this.f41132e, (boolean[]) this.f41133f, (ArrayList) obj);
                return;
        }
    }

    public ua(org.telegram.ui.Components.my myVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f41129a = 3;
        this.f41130b = myVar;
        this.f41133f = str;
        this.f41131c = arrayList;
        this.d = arrayList2;
        this.f41132e = arrayList3;
    }
}
