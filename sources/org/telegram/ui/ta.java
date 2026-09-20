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
    public final int f37710a;
    public final Object f37711b;
    public final Object f37712c;
    public final Object d;
    public final Object e;
    public final Object f37713f;

    public ta(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37710a = i10;
        this.f37711b = notificationCenterDelegate;
        this.f37712c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37713f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f37710a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((vb) this.f37711b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f37712c, (ArrayList) this.d, (ArrayList) this.e, (sa) this.f37713f));
                return;
            case 1:
                final zn znVar = (zn) this.f37711b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37712c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f37713f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = znVar.getMessagesController().getUserFull(user.f18475id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.v70 I = org.telegram.ui.Components.v70.I(znVar, u1Var);
                org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(znVar.getParentActivity(), znVar.f40303ea);
                I.f28989p = new re(mm0Var, 1);
                y yVar = new y(znVar, user, str, 2);
                org.telegram.ui.Components.v70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new q1(znVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new mu0(yVar, 26), false);
                if (tL_contact == null && (user == null || !znVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f18475id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new te(znVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new te(znVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new te(znVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new pg(znVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        zn znVar2 = znVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                        return;
                                    default:
                                        zn znVar3 = znVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
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
                                        zn znVar2 = znVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, znVar2.getParentActivity(), userFull2, znVar2.getAccountInstance());
                                        return;
                                    default:
                                        zn znVar3 = znVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, znVar3.getParentActivity(), userFull3, znVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new te(znVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new te(znVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new q1(znVar, mm0Var, user, 16));
                }
                mm0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.c61) {
                    String url = ((org.telegram.ui.Components.c61) characterStyle).getURL();
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
                    mm0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    mm0Var.f(u1Var, characterStyle, null, false);
                }
                znVar.showDialog(mm0Var);
                return;
            case 2:
                zn znVar2 = (zn) this.f37711b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f37712c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f37713f;
                Long l4 = (Long) obj;
                int i10 = znVar2.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.d5.M(znVar2.getParentActivity(), znVar2.T5, new a1.d(znVar2, tL_document, str2, obj2, 4), znVar2.f40303ea);
                } else {
                    znVar2.getSendMessagesHelper().sendSticker(tL_document, str2, znVar2.T5, znVar2.f40409n5, znVar2.X3, null, znVar2.f40383l5, sendAnimationData, true, 0, 0, false, obj2, znVar2.C8(), l4.longValue(), znVar2.N8(), znVar2.f40323g5);
                    tL_document = tL_document;
                }
                znVar2.e9(false);
                znVar2.Y.o(tL_document);
                znVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f37712c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ky kyVar = ((org.telegram.ui.Components.jy) this.f37711b).f25558a;
                String str3 = kyVar.v;
                ArrayList arrayList4 = kyVar.f25884r;
                ArrayList arrayList5 = kyVar.h;
                ArrayList arrayList6 = kyVar.f25885s;
                org.telegram.ui.Components.kz kzVar = kyVar.F;
                if (((String) this.f37713f).equals(str3)) {
                    org.telegram.ui.Components.kw kwVar = kzVar.V;
                    org.telegram.ui.Components.wx wxVar = kzVar.P;
                    int i11 = 0;
                    kwVar.e(false);
                    kyVar.f25888y = true;
                    s4.h0 adapter = wxVar.getAdapter();
                    org.telegram.ui.Components.ky kyVar2 = kzVar.S;
                    if (adapter != kyVar2) {
                        wxVar.setAdapter(kyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(kyVar.f25883n);
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
                        if (longSparseIntArray.indexOfKey(dyVar.f23665c.f18355id) < 0) {
                            longSparseIntArray.append(dyVar.f23665c.f18355id, 1);
                            arrayList6.add(dyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.dy dyVar2 = (org.telegram.ui.Components.dy) obj4;
                        if (longSparseIntArray.indexOfKey(dyVar2.f23665c.f18355id) < 0) {
                            longSparseIntArray.append(dyVar2.f23665c.f18355id, 1);
                            arrayList6.add(dyVar2);
                        }
                    }
                    kyVar.l();
                    return;
                }
                return;
            case 4:
                uy uyVar = (uy) this.f37711b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                uyVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f37712c).dismiss();
                uyVar.getMessagesController().loadChannelParticipants(l10);
                oy oyVar = uyVar.C2;
                uyVar.removeSelfFromStack();
                ((md) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f37713f).finishFragment();
                if (oyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    oyVar.u(uyVar, arrayList7, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                    return;
                }
                return;
            default:
                yh.y3.s0((yh.y3) this.f37711b, (TL_stars.StarGift) this.f37712c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e, (boolean[]) this.f37713f, (ArrayList) obj);
                return;
        }
    }

    public ta(org.telegram.ui.Components.jy jyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f37710a = 3;
        this.f37711b = jyVar;
        this.f37713f = str;
        this.f37712c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
