package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class ub extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final gb B0;
    public kb C0;
    public final ArrayList D0;
    public qb E;
    public final a0.i E0;
    public TextView F;
    public eb F0;
    public jh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.fo I;
    public xa I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.t1 J0;
    public ImageView K;
    public int K0;
    public ai.p4 L;
    public final tb L0;
    public org.telegram.ui.Cells.w0 M;
    public long M0;
    public org.telegram.ui.ActionBar.v0 N;
    public int N0;
    public long O;
    public int O0;
    public boolean P;
    public final RectF P0;
    public boolean Q;
    public AnimatorSet R;
    public boolean S;
    public final int[] T;
    public boolean U;
    public boolean V;
    public jh.f W;
    public rb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final fh.e f38009a;
    public FrameLayout f38010a0;
    public final ah.c f38011b;
    public ImageView f38012b0;
    public final ah.c f38013c;
    public org.telegram.ui.ActionBar.i5 f38014c0;
    public final ah.h d;
    public k0 f38015d0;
    public final int e;
    public l4 f38016e0;
    public final TLRPC.Chat f38017f;
    public TextureView f38018f0;
    public int f38019g0;
    public final ArrayList h;
    public int f38020h0;
    public boolean f38021i0;
    public boolean f38022j0;
    public final a0.i f38023k0;
    public final a0.i f38024l0;
    public final HashMap m0;
    public FrameLayout f38025n;
    public final ArrayList f38026n0;
    public final ArrayList f38027o0;
    public final HashSet f38028p0;
    public boolean f38029q0;
    public View f38030r;
    public boolean f38031r0;
    public RadialProgressView f38032s;
    public boolean f38033s0;
    public ArrayList f38034t0;
    public TLRPC.TL_channelAdminLogEventsFilter f38035u0;
    public jb v;
    public String f38036v0;
    public UndoView f38037w;
    public a0.i f38038w0;
    public gg.b0 f38039x;
    public final AnimationNotificationsLocker f38040x0;
    public org.telegram.ui.Components.pk0 f38041y;
    public final HashMap f38042y0;
    public HashMap f38043z0;

    public ub(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f38019g0 = -1;
        this.f38020h0 = 0;
        this.f38021i0 = true;
        this.f38022j0 = false;
        this.f38023k0 = new a0.i();
        this.f38024l0 = new a0.i();
        this.m0 = new HashMap();
        this.f38026n0 = new ArrayList();
        this.f38027o0 = new ArrayList();
        this.f38028p0 = new HashSet();
        this.f38035u0 = null;
        this.f38036v0 = "";
        this.f38040x0 = new AnimationNotificationsLocker(R0);
        this.f38042y0 = new HashMap();
        this.B0 = new gb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.i();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new tb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        ki.e eVar = this.glassEngine;
        eVar.f13646a = new ya(this);
        eVar.e = new li.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f38009a = obj;
        ah.c cVar = new ah.c(obj);
        this.f38011b = cVar;
        cVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.d = hVar;
            fh.d dVar = new fh.d(obj);
            dVar.d = hVar;
            dVar.e = -3;
            dVar.f9060f = obj;
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj);
                dVar2.d = hVar;
                dVar2.e = -2;
                dVar2.f9060f = obj;
                ah.c cVar2 = new ah.c(dVar2);
                this.f38013c = cVar2;
                cVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                cVar2.f423b = dp2;
                cVar2.f424c = dp2;
                cVar2.f427i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                ah.c cVar3 = new ah.c(dVar);
                this.f38013c = cVar3;
                cVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                cVar3.f423b = dp;
                cVar3.f424c = dp;
                this.e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            ah.c cVar4 = new ah.c(obj);
            this.f38013c = cVar4;
            cVar4.h = this.glassEngine;
        }
        this.f38017f = chat;
    }

    public static void A0(ub ubVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = ubVar.getMessagesController();
        TLRPC.Chat chat = ubVar.f38017f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f18083id);
        org.telegram.ui.Components.s60 s60Var = new org.telegram.ui.Components.s60(ubVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, ubVar, chatFull.f18084id, false, ChatObject.isChannel(chat));
        s60Var.f27851j0 = new hb(ubVar);
        s60Var.show();
    }

    public static org.telegram.ui.ActionBar.k G0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k H0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k I0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static void K0(ub ubVar) {
        if (ubVar.v != null && !ubVar.f38026n0.isEmpty()) {
            ubVar.f38039x.h1(ubVar.f38027o0.size() - 1, (-100000) - ubVar.v.getPaddingTop());
        }
    }

    public static int L0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static d11 S0(CharSequence charSequence) {
        org.telegram.ui.Components.pq[] pqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.pq pqVar : (org.telegram.ui.Components.pq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.pq.class)) {
                if (pqVar != null) {
                    Drawable drawable = pqVar.drawable;
                    if (drawable instanceof d11) {
                        return (d11) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.i iVar = ubVar.f38023k0;
        int i10 = 0;
        ubVar.C0.N = false;
        ubVar.W0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = ubVar.f38026n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (iVar.h(tL_channelAdminLogEvent.f18115id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                ubVar.O = Math.min(ubVar.O, tL_channelAdminLogEvent.f18115id);
                MessageObject messageObject2 = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38017f, ubVar.T, false);
                if (messageObject2.contentType >= 0) {
                    iVar.k(messageObject2, tL_channelAdminLogEvent.f18115id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                ubVar.f38024l0.k(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (size != i12) {
                                messageObject = (MessageObject) arrayList.get(i12);
                                if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i12++;
                        } else {
                            messageObject = null;
                            break;
                        }
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList2.add(messageObject3);
            }
        }
        if (!arrayList2.isEmpty()) {
            MediaDataController.getInstance(ubVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -ubVar.f38017f.f18083id, 0, 0L, new xa(ubVar, 1), ubVar.getClassGuid(), null);
        }
        ubVar.R0();
        ubVar.f38031r0 = false;
        if (!z10) {
            ubVar.f38029q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(ubVar.f38025n, false, 0.3f, true);
        ubVar.v.setEmptyView(ubVar.H);
        qb qbVar = ubVar.E;
        if (qbVar != null) {
            qbVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = ubVar.N;
        if (v0Var != null) {
            if (ubVar.f38027o0.isEmpty() && TextUtils.isEmpty(ubVar.f38036v0)) {
                i10 = 8;
            }
            v0Var.setVisibility(i10);
        }
    }

    public static void V(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && ubVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, ubVar.getParentActivity(), ubVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            ubVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(ubVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(ubVar.getParentActivity(), ubVar.getResourceProvider()), w7.x5.n(-1, 8));
                } else {
                    Activity parentActivity = ubVar.getParentActivity();
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 == size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, parentActivity, ubVar.getResourceProvider(), z10, z11);
                    f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    f1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        f1Var.c(ubVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7), ubVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19008p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    f1Var.setOnClickListener(new ai.t7(ubVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            db dbVar = new db(0, ubVar.X.getContext(), ubVar);
            dbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            dbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            eb ebVar = new eb(ubVar, dbVar);
            ubVar.F0 = ebVar;
            ebVar.e = true;
            ebVar.f19407c = 220;
            ebVar.setOutsideTouchable(true);
            ubVar.F0.setClippingEnabled(true);
            ubVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            ubVar.F0.setFocusable(true);
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            ubVar.F0.setInputMethodMode(2);
            ubVar.F0.setSoftInputMode(48);
            ubVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - dbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (ubVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - dbVar.getMeasuredWidth()) {
                left = (ubVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - dbVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                ubVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = ubVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + dbVar.getMeasuredHeight();
            int R = ubVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y3 = (int) (ubVar.v.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < ubVar.v.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (ubVar.v.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!ubVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            dbVar.setMaxHeight(height - i10);
            ubVar.F0.showAtLocation(ubVar.v, 51, left, i10);
            ubVar.F0.b();
        }
    }

    public static void W(org.telegram.ui.ub r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.W(org.telegram.ui.ub, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(ub ubVar, int i10) {
        int i11;
        ah.h hVar = ubVar.d;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            if (w7.c0.a(i10, 4)) {
                ki.e eVar = ubVar.glassEngine;
                li.a aVar = eVar.f13660r;
                li.a aVar2 = eVar.f13659q;
                if (aVar == aVar2) {
                    aVar.getClass();
                } else {
                    aVar.f14115b = 0;
                    int i12 = aVar2.f14115b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        RectF rectF = (RectF) aVar2.f14114a.get(i13);
                        aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    }
                }
                float y3 = ubVar.v.getY();
                float width = ubVar.X.getWidth();
                float y10 = ubVar.v.getY() + ubVar.v.getHeight();
                int i14 = 0;
                while (true) {
                    i11 = aVar.f14115b;
                    if (i14 >= i11) {
                        break;
                    }
                    RectF rectF2 = (RectF) aVar.f14114a.get(i14);
                    float f7 = rectF2.right;
                    if (f7 > 0.0f) {
                        float f10 = rectF2.bottom;
                        if (f10 > y3) {
                            float f11 = rectF2.left;
                            if (f11 < width) {
                                float f12 = rectF2.top;
                                if (f12 < y10) {
                                    if (f11 < 0.0f) {
                                        rectF2.left = 0.0f;
                                    }
                                    if (f12 < y3) {
                                        rectF2.top = y3;
                                    }
                                    if (f7 > width) {
                                        rectF2.right = width;
                                    }
                                    if (f10 > y10) {
                                        rectF2.bottom = y10;
                                    }
                                    i14++;
                                }
                            }
                        }
                    }
                    aVar.c(i14);
                }
                ArrayList arrayList = hVar.f457i;
                hVar.f458j = i11;
                while (hVar.f458j > arrayList.size()) {
                    arrayList.add(new ah.g(hVar));
                }
                for (int i15 = 0; i15 < hVar.f458j; i15++) {
                    ah.g.a((ah.g) arrayList.get(i15), aVar.b(i15));
                }
            }
            rb rbVar = ubVar.X;
            Objects.requireNonNull(rbVar);
            hVar.e(new va(rbVar, 0), ubVar.X.getWidth(), ubVar.X.getHeight());
        }
    }

    public static void Y(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.i iVar = ubVar.f38023k0;
        ubVar.f38033s0 = false;
        ubVar.C0.N = false;
        ubVar.W0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (iVar.h(tL_channelAdminLogEvent2.f18115id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                ubVar.O = Math.min(ubVar.O, tL_channelAdminLogEvent2.f18115id);
                MessageObject messageObject = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, ubVar.f38017f, ubVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !iVar.d(tL_channelAdminLogEvent2.f18115id))) {
                    ubVar.f38026n0.add(0, messageObject);
                    iVar.k(messageObject, tL_channelAdminLogEvent2.f18115id);
                    z10 = true;
                }
            }
        }
        if (ubVar.E != null && z10) {
            ubVar.R0();
            ubVar.E.l();
        }
    }

    public static void Z(ub ubVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = ubVar.f38017f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            ubVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            ubVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            ubVar.f38034t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = ubVar.getMessagesController().getChatFull(chat.f18083id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = ubVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = ubVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j3 = ubVar.getMessagesController().telegramAntispamUserId;
                if (ubVar.getMessagesController().getUser(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f18224id.add(tL_inputUser);
                    ConnectionsManager.getInstance(ubVar.currentAccount).sendRequest(tL_users_getUsers, new wa(ubVar, 1));
                }
                ubVar.f38034t0.add(0, channelParticipant);
            }
            Dialog dialog = ubVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).S(ubVar.f38034t0);
            }
        }
    }

    public static void Z0(MessageObject messageObject, int i10) {
        if (messageObject == null) {
            return;
        }
        if (i10 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = messageObject.messageOwner.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i10, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public static org.telegram.ui.ActionBar.k a0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static CharSequence a1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.gms.internal.vision.e2.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            ah.e.l();
            spannableStringBuilder.setSpan(ah.e.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static org.telegram.ui.ActionBar.k b0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k d0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k f0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k g0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k j0(ub ubVar) {
        return ubVar.actionBar;
    }

    public static int l0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int m0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int n0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int o0(ub ubVar) {
        return ubVar.classGuid;
    }

    public static void p0(org.telegram.ui.ub r6, android.os.Bundle r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.p0(org.telegram.ui.ub, android.os.Bundle, long):void");
    }

    public static int q0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int r0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int s0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int t0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int u0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static void v0(ub ubVar, MessageObject messageObject) {
        if (ubVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        ubVar.showDialog(b2Var);
    }

    public static int w0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int x0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int y0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static int z0(ub ubVar) {
        return ubVar.classGuid;
    }

    public final MessageObject N0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f38027o0;
            messageObject = null;
            if (i12 < arrayList2.size()) {
                messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2 != null && messageObject2.contentType == 1 && messageObject2.actionDeleteGroupEventId == j3) {
                    break;
                }
                i12++;
            } else {
                messageObject2 = null;
                break;
            }
        }
        if (messageObject2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f38017f.f18083id;
            tL_message.f18104id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        messageObject2.contentType = 1;
        if (z11 && arrayList.size() > 1) {
            messageObject2.actionDeleteGroupEventId = j3;
        } else {
            messageObject2.actionDeleteGroupEventId = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new l8(1)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                ub ubVar = ub.this;
                ubVar.getClass();
                if (l4.longValue() < 0) {
                    TLRPC.Chat chat = ubVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(ubVar.getMessagesController().getUser(l4));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new ab(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            d11 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new d11(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.o6 o6Var = S0.f32478a;
                o6Var.u(bold);
                o6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f32480c != -1) {
                    S0.f32480c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.o6 o6Var2 = S0.f32478a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                o6Var2.q(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) hg.c.h(1, arrayList);
        }
        if (messageObject != null) {
            long j11 = messageObject.eventId;
            a0.i iVar = this.E0;
            if (!iVar.d(j11)) {
                long j12 = messageObject.eventId;
                int i13 = Q0;
                Q0 = i13 + 1;
                iVar.k(Integer.valueOf(i13), j12);
            }
            messageObject2.stableId = ((Integer) iVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void O0(boolean z10) {
        int abs;
        gg.b0 b0Var = this.f38039x;
        if (b0Var != null && !this.f38021i0) {
            int L0 = b0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f38039x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f38031r0 && !this.f38029q0) {
                    U0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f38015d0 == null) {
            k0 k0Var = new k0(this, getParentActivity(), 4);
            this.f38015d0 = k0Var;
            k0Var.setOutlineProvider(new ai.k2(8));
            this.f38015d0.setClipToOutline(true);
            this.f38015d0.setWillNotDraw(false);
            this.f38015d0.setVisibility(4);
            l4 l4Var = new l4(getParentActivity());
            this.f38016e0 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f38015d0.addView(this.f38016e0, w7.x5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f38018f0 = textureView;
            textureView.setOpaque(false);
            this.f38016e0.addView(this.f38018f0, w7.x5.c(-1.0f, -1));
        }
        if (this.f38015d0.getParent() == null) {
            rb rbVar = this.X;
            k0 k0Var2 = this.f38015d0;
            int i10 = AndroidUtilities.roundMessageSize;
            rbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f38015d0.setVisibility(4);
        this.f38016e0.setDrawingReady(false);
        return this.f38018f0;
    }

    public final void R0() {
        long j3;
        MessageObject messageObject;
        long j10;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.D0.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList4 = this.f38026n0;
            if (i12 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j3 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j3 = 0;
                }
                if (messageObject2.stableId <= 0) {
                    int i13 = Q0;
                    Q0 = i13 + 1;
                    messageObject2.stableId = i13;
                }
                int i14 = i12 + 1;
                if (i14 < arrayList4.size()) {
                    messageObject = (MessageObject) arrayList4.get(i14);
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (tL_channelAdminLogEvent = messageObject.currentEvent) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent.user_id;
                } else {
                    j10 = 0;
                }
                if (j3 != 0) {
                    arrayList3.add(messageObject2);
                } else {
                    arrayList2.add(messageObject2);
                }
                if (j3 != j10 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = messageObject2.messageOwner.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((MessageObject) arrayList3.get(size2)).contentType == 1; size2--) {
                        arrayList5.add((MessageObject) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        MessageObject messageObject3 = (MessageObject) hg.c.h(1, arrayList3);
                        if (TextUtils.isEmpty(this.f38036v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f38028p0;
                        if (!hashSet.contains(valueOf) && z11) {
                            Z0(messageObject3, arrayList3.size() - 1);
                            arrayList2.add(messageObject3);
                        } else {
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                Z0((MessageObject) arrayList3.get(i15), 0);
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = messageObject3.messageOwner.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z10 != z12) {
                            messageObject3.forceUpdate = true;
                            qb qbVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            qbVar.m(i10 + size);
                            qb qbVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            qbVar2.m(size + i11 + 1);
                        }
                        long j11 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j11, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) hg.c.h(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(N0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i12 = i14;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f38027o0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void T0(boolean z10) {
        if (this.M.getTag() != null && !this.P) {
            if (!this.S || this.Q) {
                this.M.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.R = animatorSet;
                    animatorSet.setDuration(150L);
                    this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
                    this.R.addListener(new u4(this, 15));
                    this.R.setStartDelay(500L);
                    this.R.start();
                    return;
                }
                AnimatorSet animatorSet2 = this.R;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.R = null;
                }
                this.M.setAlpha(0.0f);
            }
        }
    }

    public final void U0(boolean z10) {
        qb qbVar;
        if (!this.f38031r0) {
            ArrayList arrayList = this.f38026n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f38025n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f38023k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f38031r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f38017f);
            tL_channels_getAdminLog.f18118q = this.f38036v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f38035u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f38038w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f38038w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f38038w0.n(i10)));
                }
            }
            b1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new wa(this, 3));
            if (z10 && (qbVar = this.E) != null) {
                qbVar.l();
            }
        }
    }

    public final void V0() {
        if (this.f38033s0) {
            return;
        }
        this.f38033s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f38017f);
        tL_channels_getAdminLog.f18118q = this.f38036v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f38035u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f38038w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f38038w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f38038w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new wa(this, 0));
    }

    public final void W0(boolean z10) {
        int i10;
        long j3;
        jb jbVar = this.v;
        if (jbVar != null && this.f38039x != null && jbVar.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.t1 t1Var = null;
            int i11 = -1;
            for (int i12 = 0; i12 < this.v.getChildCount(); i12++) {
                View childAt = this.v.getChildAt(i12);
                this.v.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i10) {
                        }
                        i10 = childAt.getTop();
                        t1Var = childAt;
                        i11 = R;
                    } else {
                        if (top <= i10) {
                        }
                        i10 = childAt.getTop();
                        t1Var = childAt;
                        i11 = R;
                    }
                }
            }
            if (t1Var != null) {
                if (t1Var instanceof org.telegram.ui.Cells.t1) {
                    j3 = t1Var.getMessageObject().eventId;
                } else if (t1Var instanceof org.telegram.ui.Cells.w0) {
                    j3 = t1Var.getMessageObject().eventId;
                } else {
                    j3 = 0;
                }
                this.M0 = j3;
                this.N0 = i11;
                this.O0 = (this.v.getMeasuredHeight() - t1Var.getBottom()) - this.v.getPaddingBottom();
            }
        }
    }

    public final int X0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.J0) != null && (textLayoutBlocks = t1Var.f20975c4) != null) {
                i10 = (int) t1Var.f21170q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var2 = this.J0;
                if (t1Var2 != null && t1Var2.f21213t1) {
                    i10 = t1Var2.f21112m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = this.J0;
            if (t1Var3 != null) {
                t1Var3.f21284xe = 0;
                t1Var3.f21299ye = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.H0)) >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                    String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                    int i12 = textLayoutBlock.charactersOffset;
                    if (findQuoteStart > i12) {
                        if (findQuoteStart - i12 > charSequence3.length() - 1) {
                            lineTop = i10 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                        } else {
                            lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i10 + textLayoutBlock.padTop;
                        }
                        float f10 = AndroidUtilities.displaySize.y;
                        float f11 = 0.5f;
                        if (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                            f7 = 0.7f;
                        } else {
                            f7 = 0.5f;
                        }
                        if (lineTop > f10 * f7) {
                            float f12 = AndroidUtilities.displaySize.y;
                            if (this.X.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                                f11 = 0.7f;
                            }
                            return (int) (lineTop - (f12 * f11));
                        }
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            org.telegram.ui.Cells.t1 t1Var4 = this.J0;
            if (t1Var4 != null) {
                t1Var4.f21284xe = 0;
                t1Var4.f21299ye = null;
            }
        }
        return 0;
    }

    public final void Y0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.Y0(org.telegram.messenger.MessageObject):void");
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f38036v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f38038w0 == null && this.f38035u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f38017f.megagroup) {
                this.L.setText(a1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(a1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        } else {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        }
    }

    public final void c1() {
        MessageObject messageObject;
        int i10;
        jb jbVar = this.v;
        if (jbVar == null) {
            return;
        }
        int childCount = jbVar.getChildCount();
        int measuredHeight = this.v.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.t1 t1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.v.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                u1Var.f21394f = y3;
                u1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int top = t1Var2.getTop();
                t1Var2.getBottom();
                if (top >= 0) {
                    i10 = 0;
                } else {
                    i10 = -top;
                }
                int measuredHeight2 = t1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                t1Var2.b4(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = t1Var2.getMessageObject();
                if (this.f38015d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    this.f38015d0.setTranslationX(photoImage.getImageX());
                    this.f38015d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f38015d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var.J()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        t1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                kb kbVar = this.C0;
                if ((kbVar == null || (!kbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i12) {
                        i12 = bottom;
                        view = childAt;
                    }
                }
            }
        }
        k0 k0Var = this.f38015d0;
        if (k0Var != null) {
            if (!z11) {
                k0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.V) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            } else {
                MediaController.getInstance().setCurrentVideoVisible(true);
            }
        }
        if (t1Var != null) {
            if (t1Var instanceof org.telegram.ui.Cells.t1) {
                messageObject = t1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.w0) t1Var).getMessageObject();
            }
            this.M.T(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.t1) && !(view2 instanceof org.telegram.ui.Cells.w0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view != null) {
            if (view.getTop() <= this.v.getPaddingTop() && !this.Q) {
                if (view.getAlpha() != 0.0f) {
                    view.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.R;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.R = null;
                }
                if (this.M.getTag() == null) {
                    this.M.setTag(1);
                }
                if (this.M.getAlpha() != 1.0f) {
                    this.M.setAlpha(1.0f);
                }
                this.P = true;
            } else {
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                T0(true ^ this.Q);
            }
            int bottom2 = view.getBottom() - this.v.getPaddingTop();
            if (bottom2 > this.M.getMeasuredHeight() && bottom2 < this.M.getMeasuredHeight() * 2) {
                org.telegram.ui.Cells.w0 w0Var2 = this.M;
                w0Var2.setTranslationY(((-w0Var2.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        T0(true);
        this.M.setTranslationY(0.0f);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.h6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        hg.c.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 28));
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, null, false, null);
        this.I = foVar;
        il ilVar = foVar.h;
        if (ilVar != null) {
            ilVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        il ilVar2 = foVar.f24037r;
        if (ilVar2 != null) {
            ilVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        foVar.f24030k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.x5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.fo foVar2 = this.I;
        TLRPC.Chat chat = this.f38017f;
        foVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        ib ibVar = new ib(this, context);
        this.fragmentView = ibVar;
        this.X = ibVar;
        ibVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.h6.r0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        dh.e o9 = eh.b.o(this.resourceProvider);
        ah.c cVar = this.f38013c;
        kVar.M(cVar, o9, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.x5.e(-1, -2, 17));
        this.H.setOnTouchListener(new bi.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.u5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.f18821f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.x5.t(54, 54, 17, 16, 20, 16, -4));
        ai.p4 p4Var = new ai.p4(context, 9);
        this.L = p4Var;
        p4Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ai.p4 p4Var2 = this.L;
        int i11 = org.telegram.ui.ActionBar.h6.f18884ic;
        p4Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.x5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        jb jbVar = new jb(this, context);
        this.v = jbVar;
        jbVar.setOnItemClickListener(new g(this, 9));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        jb jbVar2 = this.v;
        qb qbVar = new qb(this, context);
        this.E = qbVar;
        jbVar2.setAdapter(qbVar);
        this.v.setClipToPadding(false);
        jb jbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.e;
        jbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        jb jbVar4 = this.v;
        kb kbVar = new kb(this, this.v, this.resourceProvider);
        this.C0 = kbVar;
        jbVar4.setItemAnimator(kbVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(this);
        this.f38039x = b0Var;
        b0Var.j1(1);
        this.f38039x.l1(true);
        this.v.setLayoutManager(this.f38039x);
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(this.v, this.f38039x);
        this.f38041y = pk0Var;
        pk0Var.h = new ya(this);
        pk0Var.f27078i = this.L0;
        this.X.addView(this.v, w7.x5.c(-1.0f, -1));
        this.v.setOnScrollListener(new i3(this));
        this.glassEngine.a(this.v);
        int i14 = this.f38019g0;
        if (i14 != -1) {
            this.f38039x.h1(i14, this.f38020h0);
            this.f38019g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f38011b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f38025n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f38025n, w7.x5.e(-1, -1, 51));
        View view2 = new View(context);
        this.f38030r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.u5(this.f38030r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f18821f2));
        this.f38025n.addView(this.f38030r, w7.x5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38032s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f38032s.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.f38025n.addView(this.f38032s, w7.x5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.x5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.d6 d6Var = this.resourceProvider;
        jh.e eVar = new jh.e(cVar, context, eh.b.b(d6Var), d6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        jh.e eVar2 = this.G;
        ch.d c10 = eVar2.f13011n.c(eVar2, null, false);
        c10.o(eVar2.f13012r);
        c10.q(AndroidUtilities.dp(22.0f));
        c10.p(AndroidUtilities.dp(6.0f));
        eVar2.f13013s = c10;
        this.X.addView(this.G, w7.x5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ub f32042b;

            {
                this.f32042b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ub ubVar = this.f32042b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(ubVar, ubVar.f38035u0, ubVar.f38038w0, ubVar.f38017f.megagroup);
                            g0Var.S(ubVar.f38034t0);
                            g0Var.f24123g0 = new ya(ubVar);
                            ubVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        ub ubVar2 = this.f32042b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.f38017f.megagroup) {
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string;
                        ubVar2.showDialog(b2Var);
                        return;
                    default:
                        ub ubVar3 = this.f32042b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.N.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.e5.p(ubVar3.getParentActivity(), new ua(ubVar3, 0), null).f18414a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.x5.e(-2, -2, 17));
        jh.e eVar3 = this.G;
        eVar3.f13010f.add(this.F);
        this.G.d(false);
        jh.e eVar4 = this.G;
        eVar4.f13008b[4] = new View.OnClickListener(this) {
            public final ub f32042b;

            {
                this.f32042b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ub ubVar = this.f32042b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(ubVar, ubVar.f38035u0, ubVar.f38038w0, ubVar.f38017f.megagroup);
                            g0Var.S(ubVar.f38034t0);
                            g0Var.f24123g0 = new ya(ubVar);
                            ubVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        ub ubVar2 = this.f32042b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.f38017f.megagroup) {
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string;
                        ubVar2.showDialog(b2Var);
                        return;
                    default:
                        ub ubVar3 = this.f32042b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.N.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.e5.p(ubVar3.getParentActivity(), new ua(ubVar3, 0), null).f18414a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f38010a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f38010a0.setVisibility(4);
        this.f38010a0.setFocusable(true);
        this.f38010a0.setFocusableInTouchMode(true);
        this.f38010a0.setClickable(true);
        this.f38010a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f38010a0, w7.x5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f38012b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f38012b0.setImageResource(R.drawable.msg_calendar);
        this.f38012b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19160xe, false), PorterDuff.Mode.MULTIPLY));
        this.f38010a0.addView(this.f38012b0, w7.x5.e(48, 48, 53));
        this.f38012b0.setOnClickListener(new View.OnClickListener(this) {
            public final ub f32042b;

            {
                this.f32042b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ub ubVar = this.f32042b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(ubVar, ubVar.f38035u0, ubVar.f38038w0, ubVar.f38017f.megagroup);
                            g0Var.S(ubVar.f38034t0);
                            g0Var.f24123g0 = new ya(ubVar);
                            ubVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        ub ubVar2 = this.f32042b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.f38017f.megagroup) {
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string;
                        ubVar2.showDialog(b2Var);
                        return;
                    default:
                        ub ubVar3 = this.f32042b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.N.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.e5.p(ubVar3.getParentActivity(), new ua(ubVar3, 0), null).f18414a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f38014c0 = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19178ye, false));
        this.f38014c0.setTextSize(15);
        this.f38014c0.setTypeface(AndroidUtilities.bold());
        this.f38010a0.addView(this.f38014c0, w7.x5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f38031r0 && this.f38026n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f38025n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f38025n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        jb jbVar5 = this.v;
        jbVar5.Y1 = true;
        jbVar5.Z1 = 1;
        UndoView undoView = new UndoView(context);
        this.f38037w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f38037w, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        b1();
        return this.fragmentView;
    }

    public final void d1() {
        boolean z10;
        jb jbVar = this.v;
        if (jbVar != null) {
            int childCount = jbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.v.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            t1Var.setDrawSelectionBackground(false);
                            t1Var.J3(false, true);
                            t1Var.L3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            xa xaVar = this.I0;
                            if (xaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(xaVar);
                            }
                            xa xaVar2 = new xa(this, 0);
                            this.I0 = xaVar2;
                            AndroidUtilities.runOnUIThread(xaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f38036v0)) {
                            t1Var.S3(this.f38036v0);
                        } else {
                            t1Var.S3(null);
                        }
                        if (this.v.getScrollState() == 0) {
                            z11 = false;
                        }
                        t1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    w0Var.setMessageObject(w0Var.getMessageObject());
                    if (this.v.getScrollState() == 0) {
                        z11 = false;
                    }
                    w0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.t1 t1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            jb jbVar = this.v;
            if (jbVar != null) {
                jbVar.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f38016e0, this.f38015d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt;
                            MessageObject messageObject4 = t1Var4.getMessageObject();
                            if (this.f38015d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = t1Var4.getPhotoImage();
                                this.f38015d0.setTranslationX(photoImage.getImageX());
                                this.f38015d0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f38015d0.invalidate();
                                z10 = true;
                                break;
                            }
                        }
                        i12++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (this.f38015d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f38015d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            jb jbVar2 = this.v;
            if (jbVar2 != null) {
                int childCount2 = jbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.v.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject3 = (t1Var3 = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                t1Var3.e1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    t1Var3.invalidate();
                                }
                            }
                        } else {
                            t1Var3.m4(false, true, false);
                        }
                    }
                }
            }
        } else if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                jb jbVar3 = this.v;
                if (jbVar3 != null) {
                    int childCount3 = jbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.v.getChildAt(i14);
                        if ((childAt3 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = (t1Var2 = (org.telegram.ui.Cells.t1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                t1Var2.q4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.V(org.telegram.ui.ActionBar.h6.r0());
                this.f38030r.invalidate();
                ai.p4 p4Var = this.L;
                if (p4Var != null) {
                    p4Var.invalidate();
                }
                this.v.f1();
            }
        } else {
            jb jbVar4 = this.v;
            if (jbVar4 != null) {
                int childCount4 = jbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.v.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                t1Var.e1(null, true);
                            }
                        } else {
                            t1Var.m4(false, true, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19120v8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f19084t8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f18767c2, org.telegram.ui.ActionBar.h6.f18785d2}, org.telegram.ui.ActionBar.h6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18880i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18898j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18918k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18936l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18955m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18975n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18992o8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18950m3, org.telegram.ui.ActionBar.h6.f19023q3}, null, org.telegram.ui.ActionBar.h6.f19048ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18970n3, org.telegram.ui.ActionBar.h6.f19041r3}, null, org.telegram.ui.ActionBar.h6.f18795dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.h6.f18950m3.k();
        int i13 = org.telegram.ui.ActionBar.h6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.f19023q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.h6.f18987o3.k();
        int i14 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.f19060s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18987o3, org.telegram.ui.ActionBar.h6.f19060s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18987o3, org.telegram.ui.ActionBar.h6.f19060s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18987o3, org.telegram.ui.ActionBar.h6.f19060s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18987o3, org.telegram.ui.ActionBar.h6.f19060s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19005p3, org.telegram.ui.ActionBar.h6.f19079t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.h6.f19059s2;
        int i15 = org.telegram.ui.ActionBar.h6.f18884ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.h6.f19059s2, null, null, org.telegram.ui.ActionBar.h6.f18902jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19134w4, org.telegram.ui.ActionBar.h6.f19024q4, org.telegram.ui.ActionBar.h6.f19151x4, org.telegram.ui.ActionBar.h6.f19116v4, org.telegram.ui.ActionBar.h6.f19098u4, org.telegram.ui.ActionBar.h6.C4}, null, org.telegram.ui.ActionBar.h6.f18922kc));
        int i16 = org.telegram.ui.ActionBar.h6.f18940lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18959mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18830fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f18865hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19186z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f19069sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O3, org.telegram.ui.ActionBar.h6.S3, org.telegram.ui.ActionBar.h6.W3}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P3, org.telegram.ui.ActionBar.h6.T3, org.telegram.ui.ActionBar.h6.X3}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.f19176yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18730a4, org.telegram.ui.ActionBar.h6.f18750b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.f19195zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18806e4}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18823f4}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18769c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18787d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18841g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.h6.f18876i4};
        int i17 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.h6.f18858h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i18 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.J4, null, org.telegram.ui.ActionBar.h6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f19045r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f19029qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.f18748b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18894j4}, null, org.telegram.ui.ActionBar.h6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.J2, null, null, org.telegram.ui.ActionBar.h6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.K2, null, null, org.telegram.ui.ActionBar.h6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.T1, null, null, org.telegram.ui.ActionBar.h6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.Q2, null, null, org.telegram.ui.ActionBar.h6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Rc));
        int i19 = org.telegram.ui.ActionBar.h6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.f18737ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18757bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18794db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18812eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18739ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18829fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18777cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18847gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18796dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18864hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18813ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18883ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18831fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18901jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18866hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18885id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19030qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18903jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19049rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18923kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18978nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19068sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18996od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19014pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18939lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19051rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19086tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19070sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19105ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19088td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19122vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19107ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19141wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19142wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19175yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19159xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19124vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19194zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19158xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19177yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19196zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.h6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18886ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19106uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18904je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19123vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.h6.f19052re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.h6.f19071se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19015pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.h6.f19033qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38032s, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38030r, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i21 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38037w, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f38037w;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        U0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f38017f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new wa(this, 4)), this.classGuid);
        setBulletinDelegate(new ci.a9(6));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.f38040x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        rb rbVar = this.X;
        if (rbVar != null) {
            org.telegram.ui.Components.k81 k81Var = rbVar.v;
            if (k81Var != null) {
                k81Var.c(false);
            }
            rbVar.F = true;
        }
        UndoView undoView = this.f38037w;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38021i0 = true;
        this.f38022j0 = true;
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
        if (mVar != null && mVar.f7316a) {
            com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k();
            if (k10.f7316a) {
                int i10 = d5.F;
                ((s4) k10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f38018f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        rb rbVar = this.X;
        if (rbVar != null) {
            org.telegram.ui.Components.k81 k81Var = rbVar.v;
            if (k81Var != null) {
                k81Var.c(true);
            }
            rbVar.F = false;
        }
        this.f38021i0 = false;
        O0(false);
        if (this.f38022j0) {
            this.f38022j0 = false;
            qb qbVar = this.E;
            if (qbVar != null) {
                qbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f38040x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f38040x0.lock();
        }
    }
}
