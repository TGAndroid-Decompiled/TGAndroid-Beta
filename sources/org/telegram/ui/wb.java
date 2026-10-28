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
public final class wb extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final ib B0;
    public mb C0;
    public final ArrayList D0;
    public sb E;
    public final a0.h E0;
    public TextView F;
    public gb F0;
    public lh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.po I;
    public za I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.s1 J0;
    public ImageView K;
    public int K0;
    public bi.md L;
    public final vb L0;
    public org.telegram.ui.Cells.v0 M;
    public long M0;
    public org.telegram.ui.ActionBar.w0 N;
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
    public lh.f W;
    public tb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final hh.e f44586a;
    public FrameLayout f44587a0;
    public final ch.b f44588b;
    public ImageView f44589b0;
    public final ch.b f44590c;
    public org.telegram.ui.ActionBar.b6 f44591c0;
    public final ch.f d;
    public k0 f44592d0;
    public final int e;
    public m4 f44593e0;
    public final TLRPC.Chat f44594f;
    public TextureView f44595f0;
    public int f44596g0;
    public final ArrayList h;
    public int f44597h0;
    public boolean f44598i0;
    public boolean f44599j0;
    public final a0.h f44600k0;
    public final a0.h f44601l0;
    public final HashMap m0;
    public FrameLayout f44602n;
    public final ArrayList f44603n0;
    public final ArrayList f44604o0;
    public final HashSet f44605p0;
    public boolean f44606q0;
    public View f44607r;
    public boolean f44608r0;
    public RadialProgressView f44609s;
    public boolean f44610s0;
    public ArrayList f44611t0;
    public TLRPC.TL_channelAdminLogEventsFilter f44612u0;
    public lb v;
    public String f44613v0;
    public UndoView f44614w;
    public a0.h f44615w0;
    public ig.a0 f44616x;
    public final AnimationNotificationsLocker f44617x0;
    public org.telegram.ui.Components.ql0 f44618y;
    public final HashMap f44619y0;
    public HashMap f44620z0;

    public wb(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f44596g0 = -1;
        this.f44597h0 = 0;
        this.f44598i0 = true;
        this.f44599j0 = false;
        this.f44600k0 = new a0.h();
        this.f44601l0 = new a0.h();
        this.m0 = new HashMap();
        this.f44603n0 = new ArrayList();
        this.f44604o0 = new ArrayList();
        this.f44605p0 = new HashSet();
        this.f44612u0 = null;
        this.f44613v0 = "";
        this.f44617x0 = new AnimationNotificationsLocker(R0);
        this.f44619y0 = new HashMap();
        this.B0 = new ib(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new vb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        oi.q qVar = this.glassEngine;
        qVar.f19481a = new ab(this);
        qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f44586a = obj;
        ch.b bVar = new ch.b(obj);
        this.f44588b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f();
            this.d = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(obj);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f12840f = obj;
            if (LiteMode.isEnabled(262144)) {
                hh.d dVar2 = new hh.d(obj);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f12840f = obj;
                ch.b bVar2 = new ch.b(dVar2);
                this.f44590c = bVar2;
                bVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                bVar2.f6299b = dp2;
                bVar2.f6300c = dp2;
                bVar2.f6303i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                ch.b bVar3 = new ch.b(dVar);
                this.f44590c = bVar3;
                bVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                bVar3.f6299b = dp;
                bVar3.f6300c = dp;
                this.e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            ch.b bVar4 = new ch.b(obj);
            this.f44590c = bVar4;
            bVar4.h = this.glassEngine;
        }
        this.f44594f = chat;
    }

    public static int A0(wb wbVar) {
        return wbVar.classGuid;
    }

    public static void B0(wb wbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = wbVar.getMessagesController();
        TLRPC.Chat chat = wbVar.f44594f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f22028id);
        org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(wbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, wbVar, chatFull.f22029id, false, ChatObject.isChannel(chat));
        o70Var.f31220j0 = new jb(wbVar);
        o70Var.show();
    }

    public static org.telegram.ui.ActionBar.k H0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k I0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k J0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static int K0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static void L0(wb wbVar) {
        if (wbVar.v != null && !wbVar.f44603n0.isEmpty()) {
            wbVar.f44616x.h1(wbVar.f44604o0.size() - 1, (-100000) - wbVar.v.getPaddingTop());
        }
    }

    public static x01 T0(CharSequence charSequence) {
        org.telegram.ui.Components.zq[] zqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.zq zqVar : (org.telegram.ui.Components.zq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.zq.class)) {
                if (zqVar != null) {
                    Drawable drawable = zqVar.drawable;
                    if (drawable instanceof x01) {
                        return (x01) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void V(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = wbVar.f44600k0;
        int i10 = 0;
        wbVar.C0.N = false;
        wbVar.X0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = wbVar.f44603n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f22060id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent.f22060id);
                MessageObject messageObject2 = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f44594f, wbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f22060id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                wbVar.f44601l0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(wbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -wbVar.f44594f.f22028id, 0, 0L, new za(wbVar, 1), wbVar.getClassGuid(), null);
        }
        wbVar.S0();
        wbVar.f44608r0 = false;
        if (!z10) {
            wbVar.f44606q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(wbVar.f44602n, false, 0.3f, true);
        wbVar.v.setEmptyView(wbVar.H);
        sb sbVar = wbVar.E;
        if (sbVar != null) {
            sbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = wbVar.N;
        if (w0Var != null) {
            if (wbVar.f44604o0.isEmpty() && TextUtils.isEmpty(wbVar.f44613v0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void W(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && wbVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, wbVar.getParentActivity(), wbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            wbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, wbVar.getResourceProvider());
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(wbVar.getParentActivity(), wbVar.getResourceProvider()), org.telegram.ui.Components.kb1.r(-1, 8));
                } else {
                    Activity parentActivity = wbVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, wbVar.getResourceProvider(), z10, z11);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.j((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        g1Var.d(wbVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23599q7), wbVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23582p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    g1Var.setOnClickListener(new di.c6(wbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            fb fbVar = new fb(0, wbVar.X.getContext(), wbVar);
            fbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.Components.kb1.y(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            fbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            gb gbVar = new gb(wbVar, fbVar);
            wbVar.F0 = gbVar;
            gbVar.e = true;
            gbVar.f22910c = 220;
            gbVar.setOutsideTouchable(true);
            wbVar.F0.setClippingEnabled(true);
            wbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            wbVar.F0.setFocusable(true);
            fbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            wbVar.F0.setInputMethodMode(2);
            wbVar.F0.setSoftInputMode(48);
            wbVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - fbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (wbVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - fbVar.getMeasuredWidth()) {
                left = (wbVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - fbVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                wbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = wbVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + fbVar.getMeasuredHeight();
            int Q = wbVar.X.Q();
            if (Q > AndroidUtilities.dp(20.0f)) {
                height += Q;
            }
            if (dp < height) {
                int y3 = (int) (wbVar.v.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < wbVar.v.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (wbVar.v.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!wbVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            fbVar.setMaxHeight(height - i10);
            wbVar.F0.showAtLocation(wbVar.v, 51, left, i10);
            wbVar.F0.b();
        }
    }

    public static void X(org.telegram.ui.wb r21, int r22, java.util.ArrayList r23, java.lang.Integer r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.X(org.telegram.ui.wb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void Y(wb wbVar, int i10) {
        ch.f fVar = wbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (a8.pf.a(i10, 4)) {
                qi.a e = wbVar.glassEngine.e();
                e.b(wbVar.v.getY(), wbVar.X.getWidth(), wbVar.v.getY() + wbVar.v.getHeight());
                fVar.h(e);
            }
            tb tbVar = wbVar.X;
            Objects.requireNonNull(tbVar);
            fVar.e(new xa(tbVar, 0), wbVar.X.getWidth(), wbVar.X.getHeight());
        }
    }

    public static void Z(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = wbVar.f44600k0;
        wbVar.f44610s0 = false;
        wbVar.C0.N = false;
        wbVar.X0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f22060id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent2.f22060id);
                MessageObject messageObject = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, wbVar.f44594f, wbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f22060id))) {
                    wbVar.f44603n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f22060id);
                    z10 = true;
                }
            }
        }
        if (wbVar.E != null && z10) {
            wbVar.S0();
            wbVar.E.l();
        }
    }

    public static void a0(wb wbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = wbVar.f44594f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            wbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            wbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            wbVar.f44611t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = wbVar.getMessagesController().getChatFull(chat.f22028id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = wbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = wbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = wbVar.getMessagesController().telegramAntispamUserId;
                if (wbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f22171id.add(tL_inputUser);
                    ConnectionsManager.getInstance(wbVar.currentAccount).sendRequest(tL_users_getUsers, new ya(wbVar, 1));
                }
                wbVar.f44611t0.add(0, channelParticipant);
            }
            Dialog dialog = wbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).S(wbVar.f44611t0);
            }
        }
    }

    public static void a1(MessageObject messageObject, int i10) {
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

    public static org.telegram.ui.ActionBar.k b0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!c3.h0.t(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static org.telegram.ui.ActionBar.k c0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k d0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k f0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k g0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k j0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static int m0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int n0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int o0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int p0(wb wbVar) {
        return wbVar.classGuid;
    }

    public static void q0(org.telegram.ui.wb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.q0(org.telegram.ui.wb, android.os.Bundle, long):void");
    }

    public static int r0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int s0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int t0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int u0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int v0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static void w0(wb wbVar, MessageObject messageObject) {
        if (wbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            e2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            e2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        wbVar.showDialog(e2Var);
    }

    public static int x0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int y0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int z0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public final MessageObject O0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f44604o0;
            messageObject = null;
            if (i12 < arrayList2.size()) {
                messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2 != null && messageObject2.contentType == 1 && messageObject2.actionDeleteGroupEventId == j10) {
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
            tL_message.dialog_id = -this.f44594f.f22028id;
            tL_message.f22049id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject2.contentType = 1;
        if (z11 && arrayList.size() > 1) {
            messageObject2.actionDeleteGroupEventId = j10;
        } else {
            messageObject2.actionDeleteGroupEventId = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new k2.g(2)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                wb wbVar = wb.this;
                wbVar.getClass();
                if (l4.longValue() < 0) {
                    TLRPC.Chat chat = wbVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(wbVar.getMessagesController().getUser(l4));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new cb(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            x01 T0 = T0(messageObject2.messageText);
            if (T0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                T0 = new x01(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.r6 r6Var = T0.f45439a;
                r6Var.x(bold);
                r6Var.w(AndroidUtilities.dp(10.0f));
                if (T0.f45441c != -1) {
                    T0.f45441c = -1;
                    T0.invalidateSelf();
                }
                T0.a(503316480);
            } else {
                org.telegram.ui.Components.r6 r6Var2 = T0.f45439a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                r6Var2.t(LocaleController.getString(i10), false, true);
            }
            T0.setBounds(0, 0, T0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(0, T0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) ic.a.g(1, arrayList);
        }
        if (messageObject != null) {
            long j12 = messageObject.eventId;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = messageObject.eventId;
                int i13 = Q0;
                Q0 = i13 + 1;
                hVar.k(Integer.valueOf(i13), j13);
            }
            messageObject2.stableId = ((Integer) hVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void P0(boolean z10) {
        int abs;
        ig.a0 a0Var = this.f44616x;
        if (a0Var != null && !this.f44598i0) {
            int L0 = a0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f44616x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f44608r0 && !this.f44606q0) {
                    V0(false);
                }
            }
        }
    }

    public final boolean Q0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.Q0(android.view.View, float, float):boolean");
    }

    public final TextureView R0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f44592d0 == null) {
            k0 k0Var = new k0(this, getParentActivity(), 4);
            this.f44592d0 = k0Var;
            k0Var.setOutlineProvider(new ag.v0(10));
            this.f44592d0.setClipToOutline(true);
            this.f44592d0.setWillNotDraw(false);
            this.f44592d0.setVisibility(4);
            m4 m4Var = new m4(getParentActivity());
            this.f44593e0 = m4Var;
            m4Var.setBackgroundColor(0);
            if (z10) {
                this.f44592d0.addView(this.f44593e0, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f44595f0 = textureView;
            textureView.setOpaque(false);
            this.f44593e0.addView(this.f44595f0, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        }
        if (this.f44592d0.getParent() == null) {
            tb tbVar = this.X;
            k0 k0Var2 = this.f44592d0;
            int i10 = AndroidUtilities.roundMessageSize;
            tbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f44592d0.setVisibility(4);
        this.f44593e0.setDrawingReady(false);
        return this.f44595f0;
    }

    public final void S0() {
        long j10;
        MessageObject messageObject;
        long j11;
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
            ArrayList arrayList4 = this.f44603n0;
            if (i12 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
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
                    j11 = tL_channelAdminLogEvent.user_id;
                } else {
                    j11 = 0;
                }
                if (j10 != 0) {
                    arrayList3.add(messageObject2);
                } else {
                    arrayList2.add(messageObject2);
                }
                if (j10 != j11 && !arrayList3.isEmpty()) {
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
                        MessageObject messageObject3 = (MessageObject) ic.a.g(1, arrayList3);
                        if (TextUtils.isEmpty(this.f44613v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f44605p0;
                        if (!hashSet.contains(valueOf) && z11) {
                            a1(messageObject3, arrayList3.size() - 1);
                            arrayList2.add(messageObject3);
                        } else {
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                a1((MessageObject) arrayList3.get(i15), 0);
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
                            sb sbVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            sbVar.m(i10 + size);
                            sb sbVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            sbVar2.m(size + i11 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(O0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) ic.a.g(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(O0(messageObject4.eventId, messageObject4.currentEvent.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i12 = i14;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f44604o0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void U0(boolean z10) {
        if (this.M.getTag() != null && !this.P) {
            if (!this.S || this.Q) {
                this.M.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.R = animatorSet;
                    animatorSet.setDuration(150L);
                    this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
                    this.R.addListener(new kg.e(this, 22));
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

    public final void V0(boolean z10) {
        sb sbVar;
        if (!this.f44608r0) {
            ArrayList arrayList = this.f44603n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f44602n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f44600k0.b();
                arrayList.clear();
                this.m0.clear();
                S0();
            }
            this.f44608r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f44594f);
            tL_channels_getAdminLog.f22063q = this.f44613v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f44612u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f44615w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f44615w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f44615w0.n(i10)));
                }
            }
            c1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 3));
            if (z10 && (sbVar = this.E) != null) {
                sbVar.l();
            }
        }
    }

    public final void W0() {
        if (this.f44610s0) {
            return;
        }
        this.f44610s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f44594f);
        tL_channels_getAdminLog.f22063q = this.f44613v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f44612u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f44615w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f44615w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f44615w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 0));
    }

    public final void X0(boolean z10) {
        int i10;
        long j10;
        lb lbVar = this.v;
        if (lbVar != null && this.f44616x != null && lbVar.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.s1 s1Var = null;
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
                        s1Var = childAt;
                        i11 = R;
                    } else {
                        if (top <= i10) {
                        }
                        i10 = childAt.getTop();
                        s1Var = childAt;
                        i11 = R;
                    }
                }
            }
            if (s1Var != null) {
                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                    j10 = s1Var.getMessageObject().eventId;
                } else if (s1Var instanceof org.telegram.ui.Cells.v0) {
                    j10 = s1Var.getMessageObject().eventId;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
                this.N0 = i11;
                this.O0 = (this.v.getMeasuredHeight() - s1Var.getBottom()) - this.v.getPaddingBottom();
            }
        }
    }

    public final int Y0(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (s1Var = this.J0) != null && (textLayoutBlocks = s1Var.f25048c4) != null) {
                i10 = (int) s1Var.f25247q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var2 = this.J0;
                if (s1Var2 != null && s1Var2.f25287t1) {
                    i10 = s1Var2.f25186m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = this.J0;
            if (s1Var3 != null) {
                s1Var3.f25374ye = 0;
                s1Var3.f25388ze = null;
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
            org.telegram.ui.Cells.s1 s1Var4 = this.J0;
            if (s1Var4 != null) {
                s1Var4.f25374ye = 0;
                s1Var4.f25388ze = null;
            }
        }
        return 0;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.Z0(org.telegram.messenger.MessageObject):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.De));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23643se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23623re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23698vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23473je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23680uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23304ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23774zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23756yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23773zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23699vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23738xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23719wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23681ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23697vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23679ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23642sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23660tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23622rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23508lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23586pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23546nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23568od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23640sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23548nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23492kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23620rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23472jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23602qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23455id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23436hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23434hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23364dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23417gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23345cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23325bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23398fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23362db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Za));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ya));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23601qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23616r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Va));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ua));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23755yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23737xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23641sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23435hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23399fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23381ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23527mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23509lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23491kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23471jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23659ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23363dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23619ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23563o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23543n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23523m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23505l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23487k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23468j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23451i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    public final void c1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f44613v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f44615w0 == null && this.f44612u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f44594f.megagroup) {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.L.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        } else {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.s1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.y6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 1));
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, null, false, null);
        this.I = poVar;
        hl hlVar = poVar.h;
        if (hlVar != null) {
            hlVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        hl hlVar2 = poVar.f31670r;
        if (hlVar2 != null) {
            hlVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        poVar.f31663k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, org.telegram.ui.Components.kb1.h(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.po poVar2 = this.I;
        TLRPC.Chat chat = this.f44594f;
        poVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        kb kbVar = new kb(this, context);
        this.fragmentView = kbVar;
        this.X = kbVar;
        kbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.U(org.telegram.ui.ActionBar.y6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        fh.e p10 = gh.c.p(this.resourceProvider);
        ch.b bVar = this.f44590c;
        kVar.I(bVar, p10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, org.telegram.ui.Components.kb1.i(-1, -2, 17));
        this.H.setOnTouchListener(new ei.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.l6(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.y6.f23390f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, org.telegram.ui.Components.kb1.x(54, 54, 17, 16, 20, 16, -4));
        bi.md mdVar = new bi.md(context, 10);
        this.L = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        bi.md mdVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.y6.f23454ic;
        org.telegram.ui.ActionBar.f7.V(mdVar2, i11, null);
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, org.telegram.ui.Components.kb1.x(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, org.telegram.ui.Components.kb1.h(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        lb lbVar = new lb(this, context);
        this.v = lbVar;
        lbVar.setOnItemClickListener(new f(this, 8));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        lb lbVar2 = this.v;
        sb sbVar = new sb(this, context);
        this.E = sbVar;
        lbVar2.setAdapter(sbVar);
        this.v.setClipToPadding(false);
        lb lbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.e;
        lbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        lb lbVar4 = this.v;
        mb mbVar = new mb(this, this.v, this.resourceProvider);
        this.C0 = mbVar;
        lbVar4.setItemAnimator(mbVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        ig.a0 a0Var = new ig.a0(this);
        this.f44616x = a0Var;
        a0Var.k1(1);
        this.f44616x.m1(true);
        this.v.setLayoutManager(this.f44616x);
        org.telegram.ui.Components.ql0 ql0Var = new org.telegram.ui.Components.ql0(this.v, this.f44616x);
        this.f44618y = ql0Var;
        ql0Var.h = new ab(this);
        ql0Var.f31938i = this.L0;
        this.X.addView(this.v, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.v.setOnScrollListener(new i3(this));
        this.glassEngine.b(this.v);
        int i14 = this.f44596g0;
        if (i14 != -1) {
            this.f44616x.h1(i14, this.f44597h0);
            this.f44596g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f44588b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44602n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f44602n, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        View view2 = new View(context);
        this.f44607r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.l6(this.f44607r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.f23390f2));
        this.f44602n.addView(this.f44607r, org.telegram.ui.Components.kb1.i(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f44609s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f44609s.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f44602n.addView(this.f44609s, org.telegram.ui.Components.kb1.i(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.M = v0Var;
        v0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
        lh.e eVar = new lh.e(context, bVar, gh.c.b(u6Var), u6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        lh.e eVar2 = this.G;
        eh.d c10 = eVar2.f17031n.c(eVar2, null, false);
        c10.v(eVar2.f17032r);
        org.telegram.messenger.wh.s(c10, AndroidUtilities.dp(22.0f), 6.0f);
        eVar2.v = c10;
        this.X.addView(this.G, org.telegram.ui.Components.kb1.h(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final wb f38569b;

            {
                this.f38569b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f38569b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.f44612u0, wbVar.f44615w0, wbVar.f44594f.megagroup);
                            g0Var.S(wbVar.f44611t0);
                            g0Var.f28342g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f38569b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f44594f.megagroup) {
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        wbVar2.showDialog(e2Var);
                        return;
                    default:
                        wb wbVar3 = this.f38569b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.g5.o(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f22602a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(this.F, org.telegram.ui.ActionBar.y6.Ae, null);
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        this.G.f17030f.add(this.F);
        this.G.d(false);
        this.G.f17028b[4] = new View.OnClickListener(this) {
            public final wb f38569b;

            {
                this.f38569b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f38569b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.f44612u0, wbVar.f44615w0, wbVar.f44594f.megagroup);
                            g0Var.S(wbVar.f44611t0);
                            g0Var.f28342g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f38569b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f44594f.megagroup) {
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        wbVar2.showDialog(e2Var);
                        return;
                    default:
                        wb wbVar3 = this.f38569b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.g5.o(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f22602a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44587a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f44587a0.setVisibility(4);
        this.f44587a0.setFocusable(true);
        this.f44587a0.setFocusableInTouchMode(true);
        this.f44587a0.setClickable(true);
        this.f44587a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f44587a0, org.telegram.ui.Components.kb1.i(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f44589b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f44589b0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.f7.t(this.f44589b0, org.telegram.ui.ActionBar.y6.f23739xe, null, PorterDuff.Mode.MULTIPLY);
        this.f44587a0.addView(this.f44589b0, org.telegram.ui.Components.kb1.i(48, 48, 53));
        this.f44589b0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f38569b;

            {
                this.f38569b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f38569b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.f44612u0, wbVar.f44615w0, wbVar.f44594f.megagroup);
                            g0Var.S(wbVar.f44611t0);
                            g0Var.f28342g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f38569b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f44594f.megagroup) {
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        wbVar2.showDialog(e2Var);
                        return;
                    default:
                        wb wbVar3 = this.f38569b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.g5.o(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f22602a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f44591c0 = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23757ye, null);
        this.f44591c0.setTextSize(15);
        this.f44591c0.setTypeface(AndroidUtilities.bold());
        this.f44587a0.addView(this.f44591c0, org.telegram.ui.Components.kb1.h(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f44608r0 && this.f44603n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f44602n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f44602n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        lb lbVar5 = this.v;
        lbVar5.W1 = true;
        lbVar5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f44614w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f44614w, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject messageObject;
        int i10;
        lb lbVar = this.v;
        if (lbVar == null) {
            return;
        }
        int childCount = lbVar.getChildCount();
        int measuredHeight = this.v.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.s1 s1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.v.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                t1Var.f25436f = y3;
                t1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                int top = s1Var2.getTop();
                s1Var2.getBottom();
                if (top >= 0) {
                    i10 = 0;
                } else {
                    i10 = -top;
                }
                int measuredHeight2 = s1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                s1Var2.d4(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = s1Var2.getMessageObject();
                if (this.f44592d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    this.f44592d0.setTranslationX(photoImage.getImageX());
                    this.f44592d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f44592d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) childAt;
                v0Var2.Y((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (v0Var2.J()) {
                    v0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        s1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                mb mbVar = this.C0;
                if ((mbVar == null || (!mbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        k0 k0Var = this.f44592d0;
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
        if (s1Var != null) {
            if (s1Var instanceof org.telegram.ui.Cells.s1) {
                messageObject = s1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.v0) s1Var).getMessageObject();
            }
            this.M.W(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.s1) && !(view2 instanceof org.telegram.ui.Cells.v0)) {
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
                U0(true ^ this.Q);
            }
            int bottom2 = view.getBottom() - this.v.getPaddingTop();
            if (bottom2 > this.M.getMeasuredHeight() && bottom2 < this.M.getMeasuredHeight() * 2) {
                this.M.setTranslationY(((-v0Var.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        U0(true);
        this.M.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.s1 s1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            lb lbVar = this.v;
            if (lbVar != null) {
                lbVar.g1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(R0(true), this.f44593e0, this.f44592d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject messageObject4 = s1Var4.getMessageObject();
                            if (this.f44592d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = s1Var4.getPhotoImage();
                                this.f44592d0.setTranslationX(photoImage.getImageX());
                                this.f44592d0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f44592d0.invalidate();
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
                if (this.f44592d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f44592d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            lb lbVar2 = this.v;
            if (lbVar2 != null) {
                int childCount2 = lbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.v.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject3 = (s1Var3 = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                s1Var3.e1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    s1Var3.invalidate();
                                }
                            }
                        } else {
                            s1Var3.o4(false, true, false);
                        }
                    }
                }
            }
        } else if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                lb lbVar3 = this.v;
                if (lbVar3 != null) {
                    int childCount3 = lbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.v.getChildAt(i14);
                        if ((childAt3 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                s1Var2.s4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.U(org.telegram.ui.ActionBar.y6.s0());
                this.f44607r.invalidate();
                bi.md mdVar = this.L;
                if (mdVar != null) {
                    mdVar.invalidate();
                }
                this.v.g1();
            }
        } else {
            lb lbVar4 = this.v;
            if (lbVar4 != null) {
                int childCount4 = lbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.v.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                s1Var.e1(null, true);
                            }
                        } else {
                            s1Var.o4(false, true, false);
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

    public final void e1() {
        boolean z10;
        lb lbVar = this.v;
        if (lbVar != null) {
            int childCount = lbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.v.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.q()) {
                            s1Var.setDrawSelectionBackground(false);
                            s1Var.L3(false, true);
                            s1Var.N3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            za zaVar = this.I0;
                            if (zaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(zaVar);
                            }
                            za zaVar2 = new za(this, 0);
                            this.I0 = zaVar2;
                            AndroidUtilities.runOnUIThread(zaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f44613v0)) {
                            s1Var.U3(this.f44613v0);
                        } else {
                            s1Var.U3(null);
                        }
                        if (this.v.getScrollState() == 0) {
                            z11 = false;
                        }
                        s1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    v0Var.setMessageObject(v0Var.getMessageObject());
                    if (this.v.getScrollState() == 0) {
                        z11 = false;
                    }
                    v0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23323bb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23343cb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23453ib));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23400fd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23470jb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23717wb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23754yb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23736xb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23587pe));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fe));
        View view = this.f44607r;
        int i10 = org.telegram.ui.ActionBar.y6.f23509lc;
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.L, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f44614w;
        if (undoView != null) {
            undoView.d(0, true);
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
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetNewWallpapper);
        V0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f44594f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ya(this, 4)), this.classGuid);
        setBulletinDelegate(new fi.k8(6));
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
        this.f44617x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.y91 y91Var = tbVar.v;
            if (y91Var != null) {
                y91Var.c(false);
            }
            tbVar.F = true;
        }
        UndoView undoView = this.f44614w;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f44598i0 = true;
        this.f44599j0 = true;
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f5929a) {
            c2.b m10 = c2.b.m();
            if (m10.f5929a) {
                int i10 = f5.F;
                ((v4) m10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f44595f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.y91 y91Var = tbVar.v;
            if (y91Var != null) {
                y91Var.c(true);
            }
            tbVar.F = false;
        }
        this.f44598i0 = false;
        P0(false);
        if (this.f44599j0) {
            this.f44599j0 = false;
            sb sbVar = this.E;
            if (sbVar != null) {
                sbVar.l();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f44609s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23454ic, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f44617x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f44617x0.lock();
        }
    }
}
