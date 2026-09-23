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
    public final int f37219a;
    public final Object f37220b;
    public final Object f37221c;
    public final Object d;
    public final Object e;
    public final Object f37222f;

    public sa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37219a = i10;
        this.f37220b = notificationCenterDelegate;
        this.f37221c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37222f = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.f37219a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z8((ub) this.f37220b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.f37221c, (ArrayList) this.d, (ArrayList) this.e, (ra) this.f37222f));
                return;
            case 1:
                final xn xnVar = (xn) this.f37220b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37221c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f37222f;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = xnVar.getMessagesController().getUserFull(user.f18230id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.o70 I = org.telegram.ui.Components.o70.I(xnVar, t1Var);
                org.telegram.ui.Components.bm0 bm0Var = new org.telegram.ui.Components.bm0(xnVar.getParentActivity(), xnVar.f39370ea);
                I.f26664p = new pe(bm0Var, 1);
                z zVar = new z(xnVar, user, str, 2);
                org.telegram.ui.Components.o70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(xnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new fu0(zVar, 26), false);
                if (tL_contact == null && (user == null || !xnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.f18230id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new re(xnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(xnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(xnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new qg(xnVar, user, 0), false);
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
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
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
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new re(xnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new re(xnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(xnVar, bm0Var, user, 16));
                }
                bm0Var.e(I);
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
                    bm0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    bm0Var.f(t1Var, characterStyle, null, false);
                }
                xnVar.showDialog(bm0Var);
                return;
            case 2:
                xn xnVar2 = (xn) this.f37220b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f37221c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f37222f;
                Long l4 = (Long) obj;
                int i10 = xnVar2.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.M(xnVar2.getParentActivity(), xnVar2.T5, new a1.d(xnVar2, tL_document, str2, obj2, 4), xnVar2.f39370ea);
                } else {
                    xnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, xnVar2.T5, xnVar2.f39475n5, xnVar2.X3, null, xnVar2.f39449l5, sendAnimationData, true, 0, 0, false, obj2, xnVar2.C8(), l4.longValue(), xnVar2.N8(), xnVar2.f39390g5);
                    tL_document = tL_document;
                }
                xnVar2.e9(false);
                xnVar2.Y.p(tL_document);
                xnVar2.Y.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f37221c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ky kyVar = ((org.telegram.ui.Components.jy) this.f37220b).f25438a;
                String str3 = kyVar.v;
                ArrayList arrayList4 = kyVar.f25717r;
                ArrayList arrayList5 = kyVar.h;
                ArrayList arrayList6 = kyVar.f25718s;
                org.telegram.ui.Components.lz lzVar = kyVar.F;
                if (((String) this.f37222f).equals(str3)) {
                    org.telegram.ui.Components.kw kwVar = lzVar.V;
                    org.telegram.ui.Components.wx wxVar = lzVar.P;
                    int i11 = 0;
                    kwVar.e(false);
                    kyVar.f25721y = true;
                    s4.h0 adapter = wxVar.getAdapter();
                    org.telegram.ui.Components.ky kyVar2 = lzVar.S;
                    if (adapter != kyVar2) {
                        wxVar.setAdapter(kyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(kyVar.f25716n);
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
                        if (longSparseIntArray.indexOfKey(dyVar.f23486c.f18110id) < 0) {
                            longSparseIntArray.append(dyVar.f23486c.f18110id, 1);
                            arrayList6.add(dyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.dy dyVar2 = (org.telegram.ui.Components.dy) obj4;
                        if (longSparseIntArray.indexOfKey(dyVar2.f23486c.f18110id) < 0) {
                            longSparseIntArray.append(dyVar2.f23486c.f18110id, 1);
                            arrayList6.add(dyVar2);
                        }
                    }
                    kyVar.l();
                    return;
                }
                return;
            case 4:
                ry ryVar = (ry) this.f37220b;
                Long l10 = (Long) this.d;
                Runnable runnable2 = (Runnable) obj;
                ryVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f37221c).dismiss();
                ryVar.getMessagesController().loadChannelParticipants(l10);
                ly lyVar = ryVar.C2;
                ryVar.removeSelfFromStack();
                ((ld) this.e).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.f37222f).finishFragment();
                if (lyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    lyVar.u(ryVar, arrayList7, null, false, ryVar.J2, ryVar.K2, ryVar.L2, null);
                    return;
                }
                return;
            default:
                yh.y3.r0((yh.y3) this.f37220b, (TL_stars.StarGift) this.f37221c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e, (boolean[]) this.f37222f, (ArrayList) obj);
                return;
        }
    }

    public sa(org.telegram.ui.Components.jy jyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f37219a = 3;
        this.f37220b = jyVar;
        this.f37222f = str;
        this.f37221c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
