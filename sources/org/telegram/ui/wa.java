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
public final class wa implements Utilities.Callback {
    public final int f43111a;
    public final Object f43112b;
    public final Object f43113c;
    public final Object d;
    public final Object f43114e;
    public final Object f43115f;

    public wa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43111a = i10;
        this.f43112b = notificationCenterDelegate;
        this.f43113c = obj;
        this.d = obj2;
        this.f43114e = obj3;
        this.f43115f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f43111a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.a9((yb) this.f43112b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f43113c, (ArrayList) this.d, (ArrayList) this.f43114e, (va) this.f43115f));
                return;
            case 1:
                eo eoVar = (eo) this.f43112b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f43113c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f43115f;
                Long l4 = (Long) obj;
                int i10 = eoVar.R3;
                Object obj2 = this.f43114e;
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.L(eoVar.getParentActivity(), eoVar.T5, new a1.d(eoVar, tL_document, str, obj2, 4), eoVar.f37256ea);
                } else {
                    eoVar.getSendMessagesHelper().sendSticker(tL_document, str, eoVar.T5, eoVar.f37361n5, eoVar.X3, null, eoVar.f37335l5, sendAnimationData, true, 0, 0, false, obj2, eoVar.H8(), l4.longValue(), eoVar.S8(), eoVar.f37276g5);
                    tL_document = tL_document;
                }
                eoVar.j9(false);
                eoVar.Y.o(tL_document);
                eoVar.Y.setFieldText("");
                return;
            case 2:
                final eo eoVar2 = (eo) this.f43112b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f43113c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f43114e;
                CharacterStyle characterStyle = (CharacterStyle) this.f43115f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = eoVar2.getMessagesController().getUserFull(user.f19950id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.s80 I = org.telegram.ui.Components.s80.I(eoVar2, u1Var);
                org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0(eoVar2.getParentActivity(), eoVar2.f37256ea);
                I.f30463p = new we(mn0Var, 1);
                z zVar = new z(eoVar2, user, str2, 2);
                org.telegram.ui.Components.s80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new pu0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(eoVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new pu0(zVar, 27), false);
                if (tL_contact == null && (user == null || !eoVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.f19950id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ye(eoVar2, str2, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ye(eoVar2, str2, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ye(eoVar2, str2, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new ug(eoVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        eo eoVar3 = eoVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            eoVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z12, eoVar3.getParentActivity(), userFull2, eoVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z122, eoVar3.getParentActivity(), userFull2, eoVar3.getAccountInstance());
                                        return;
                                    default:
                                        eo eoVar4 = eoVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            eoVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z13, eoVar4.getParentActivity(), userFull3, eoVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z132, eoVar4.getParentActivity(), userFull3, eoVar4.getAccountInstance());
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
                                        eo eoVar3 = eoVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            eoVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z122, eoVar3.getParentActivity(), userFull2, eoVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z1222, eoVar3.getParentActivity(), userFull2, eoVar3.getAccountInstance());
                                        return;
                                    default:
                                        eo eoVar4 = eoVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            eoVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z132, eoVar4.getParentActivity(), userFull3, eoVar4.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z1322, eoVar4.getParentActivity(), userFull3, eoVar4.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ye(eoVar2, str2, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ye(eoVar2, str2, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(eoVar2, mn0Var, user, 17));
                }
                mn0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.a71) {
                    String url = ((org.telegram.ui.Components.a71) characterStyle).getURL();
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
                    mn0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    mn0Var.f(u1Var, characterStyle, null, false);
                }
                eoVar2.showDialog(mn0Var);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f43113c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.f43114e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.cz czVar = ((org.telegram.ui.Components.bz) this.f43112b).f24771a;
                String str3 = czVar.v;
                ArrayList arrayList4 = czVar.f25047r;
                ArrayList arrayList5 = czVar.h;
                ArrayList arrayList6 = czVar.f25048s;
                org.telegram.ui.Components.d00 d00Var = czVar.F;
                if (((String) this.f43115f).equals(str3)) {
                    org.telegram.ui.Components.cx cxVar = d00Var.V;
                    org.telegram.ui.Components.py pyVar = d00Var.P;
                    int i11 = 0;
                    cxVar.e(false);
                    czVar.f25051y = true;
                    s4.i0 adapter = pyVar.getAdapter();
                    org.telegram.ui.Components.cz czVar2 = d00Var.S;
                    if (adapter != czVar2) {
                        pyVar.setAdapter(czVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(czVar.f25046n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.Components.vy vyVar = (org.telegram.ui.Components.vy) obj3;
                        if (longSparseIntArray.indexOfKey(vyVar.f32196c.f19830id) < 0) {
                            longSparseIntArray.append(vyVar.f32196c.f19830id, 1);
                            arrayList6.add(vyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.vy vyVar2 = (org.telegram.ui.Components.vy) obj4;
                        if (longSparseIntArray.indexOfKey(vyVar2.f32196c.f19830id) < 0) {
                            longSparseIntArray.append(vyVar2.f32196c.f19830id, 1);
                            arrayList6.add(vyVar2);
                        }
                    }
                    czVar.l();
                    return;
                }
                return;
            case 4:
                vy vyVar3 = (vy) this.f43112b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                vyVar3.getClass();
                ((org.telegram.ui.ActionBar.a2) this.f43113c).dismiss();
                vyVar3.getMessagesController().loadChannelParticipants(l10);
                py pyVar2 = vyVar3.C2;
                vyVar3.removeSelfFromStack();
                ((qd) this.f43114e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.m2) this.f43115f).finishFragment();
                if (pyVar2 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    pyVar2.w(vyVar3, arrayList7, null, false, vyVar3.J2, vyVar3.K2, vyVar3.L2, null);
                    return;
                }
                return;
            default:
                yh.s3.s0((yh.s3) this.f43112b, (TL_stars.StarGift) this.f43113c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.bd[]) this.f43114e, (boolean[]) this.f43115f, (ArrayList) obj);
                return;
        }
    }

    public wa(org.telegram.ui.Components.bz bzVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f43111a = 3;
        this.f43112b = bzVar;
        this.f43115f = str;
        this.f43113c = arrayList;
        this.d = arrayList2;
        this.f43114e = arrayList3;
    }
}
