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
public final class wb extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final ib B0;
    public mb C0;
    public final ArrayList D0;
    public sb E;
    public final a0.i E0;
    public TextView F;
    public gb F0;
    public jh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.ho I;
    public za I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.u1 J0;
    public ImageView K;
    public int K0;
    public ai.p4 L;
    public final vb L0;
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
    public tb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final fh.e f42036a;
    public FrameLayout f42037a0;
    public final ah.c f42038b;
    public ImageView f42039b0;
    public final ah.c f42040c;
    public org.telegram.ui.ActionBar.i5 f42041c0;
    public final ah.i d;
    public k0 f42042d0;
    public final int f42043e;
    public l4 f42044e0;
    public final TLRPC.Chat f42045f;
    public TextureView f42046f0;
    public int f42047g0;
    public final ArrayList h;
    public int f42048h0;
    public boolean f42049i0;
    public boolean f42050j0;
    public final a0.i f42051k0;
    public final a0.i f42052l0;
    public final HashMap m0;
    public FrameLayout f42053n;
    public final ArrayList f42054n0;
    public final ArrayList f42055o0;
    public final HashSet f42056p0;
    public boolean f42057q0;
    public View f42058r;
    public boolean f42059r0;
    public RadialProgressView f42060s;
    public boolean f42061s0;
    public ArrayList f42062t0;
    public TLRPC.TL_channelAdminLogEventsFilter f42063u0;
    public lb v;
    public String f42064v0;
    public UndoView f42065w;
    public a0.i f42066w0;
    public gg.b0 f42067x;
    public final AnimationNotificationsLocker f42068x0;
    public org.telegram.ui.Components.bl0 f42069y;
    public final HashMap f42070y0;
    public HashMap f42071z0;

    public wb(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f42047g0 = -1;
        this.f42048h0 = 0;
        this.f42049i0 = true;
        this.f42050j0 = false;
        this.f42051k0 = new a0.i();
        this.f42052l0 = new a0.i();
        this.m0 = new HashMap();
        this.f42054n0 = new ArrayList();
        this.f42055o0 = new ArrayList();
        this.f42056p0 = new HashSet();
        this.f42063u0 = null;
        this.f42064v0 = "";
        this.f42068x0 = new AnimationNotificationsLocker(R0);
        this.f42070y0 = new HashMap();
        this.B0 = new ib(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.i();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new vb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        li.p pVar = this.glassEngine;
        pVar.f15671a = new ab(this);
        pVar.d = new ni.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f42036a = obj;
        ah.c cVar = new ah.c(obj);
        this.f42038b = cVar;
        cVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i();
            this.d = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(obj);
            dVar.d = iVar;
            dVar.f9862e = -3;
            dVar.f9863f = obj;
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj);
                dVar2.d = iVar;
                dVar2.f9862e = -2;
                dVar2.f9863f = obj;
                ah.c cVar2 = new ah.c(dVar2);
                this.f42040c = cVar2;
                cVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                cVar2.f456b = dp2;
                cVar2.f457c = dp2;
                cVar2.f461i = LiteMode.isEnabled(262144);
                this.f42043e = 0;
            } else {
                ah.c cVar3 = new ah.c(dVar);
                this.f42040c = cVar3;
                cVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                cVar3.f456b = dp;
                cVar3.f457c = dp;
                this.f42043e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.f42043e = 0;
            ah.c cVar4 = new ah.c(obj);
            this.f42040c = cVar4;
            cVar4.h = this.glassEngine;
        }
        this.f42045f = chat;
    }

    public static void A0(wb wbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = wbVar.getMessagesController();
        TLRPC.Chat chat = wbVar.f42045f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f20047id);
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(wbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, wbVar, chatFull.f20048id, false, ChatObject.isChannel(chat));
        f70Var.f26414j0 = new jb(wbVar);
        f70Var.show();
    }

    public static org.telegram.ui.ActionBar.k G0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k H0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k I0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static void K0(wb wbVar) {
        if (wbVar.v != null && !wbVar.f42054n0.isEmpty()) {
            wbVar.f42067x.h1(wbVar.f42055o0.size() - 1, (-100000) - wbVar.v.getPaddingTop());
        }
    }

    public static int L0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static void S(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.i iVar = wbVar.f42051k0;
        int i10 = 0;
        wbVar.C0.N = false;
        wbVar.W0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = wbVar.f42054n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (iVar.h(tL_channelAdminLogEvent.f20079id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent.f20079id);
                MessageObject messageObject2 = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f42045f, wbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    iVar.k(messageObject2, tL_channelAdminLogEvent.f20079id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                wbVar.f42052l0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(wbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -wbVar.f42045f.f20047id, 0, 0L, new za(wbVar, 1), wbVar.getClassGuid(), null);
        }
        wbVar.R0();
        wbVar.f42059r0 = false;
        if (!z10) {
            wbVar.f42057q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(wbVar.f42053n, false, 0.3f, true);
        wbVar.v.setEmptyView(wbVar.H);
        sb sbVar = wbVar.E;
        if (sbVar != null) {
            sbVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = wbVar.N;
        if (v0Var != null) {
            if (wbVar.f42055o0.isEmpty() && TextUtils.isEmpty(wbVar.f42064v0)) {
                i10 = 8;
            }
            v0Var.setVisibility(i10);
        }
    }

    public static d11 S0(CharSequence charSequence) {
        org.telegram.ui.Components.rq[] rqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.rq rqVar : (org.telegram.ui.Components.rq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.rq.class)) {
                if (rqVar != null) {
                    Drawable drawable = rqVar.drawable;
                    if (drawable instanceof d11) {
                        return (d11) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void T(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && wbVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, wbVar.getParentActivity(), wbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            wbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(wbVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(wbVar.getParentActivity(), wbVar.getResourceProvider()), w7.z5.n(-1, 8));
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
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, parentActivity, wbVar.getResourceProvider(), z10, z11);
                    f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    f1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        f1Var.c(wbVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7), wbVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21049p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    f1Var.setOnClickListener(new ai.t7(wbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            fb fbVar = new fb(0, wbVar.X.getContext(), wbVar);
            fbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            fbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            gb gbVar = new gb(wbVar, fbVar);
            wbVar.F0 = gbVar;
            gbVar.f21417e = true;
            gbVar.f21416c = 220;
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
            int R = wbVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
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

    public static void U(org.telegram.ui.wb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.U(org.telegram.ui.wb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void W(wb wbVar, int i10) {
        ah.i iVar = wbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                ni.a e7 = wbVar.glassEngine.e();
                e7.b(wbVar.v.getY(), wbVar.X.getWidth(), wbVar.v.getY() + wbVar.v.getHeight());
                iVar.h(e7);
            }
            tb tbVar = wbVar.X;
            Objects.requireNonNull(tbVar);
            iVar.e(new xa(tbVar, 0), wbVar.X.getWidth(), wbVar.X.getHeight());
        }
    }

    public static void X(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.i iVar = wbVar.f42051k0;
        wbVar.f42061s0 = false;
        wbVar.C0.N = false;
        wbVar.W0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (iVar.h(tL_channelAdminLogEvent2.f20079id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.O = Math.min(wbVar.O, tL_channelAdminLogEvent2.f20079id);
                MessageObject messageObject = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, wbVar.f42045f, wbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !iVar.d(tL_channelAdminLogEvent2.f20079id))) {
                    wbVar.f42054n0.add(0, messageObject);
                    iVar.k(messageObject, tL_channelAdminLogEvent2.f20079id);
                    z10 = true;
                }
            }
        }
        if (wbVar.E != null && z10) {
            wbVar.R0();
            wbVar.E.l();
        }
    }

    public static void Y(wb wbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = wbVar.f42045f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            wbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            wbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            wbVar.f42062t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = wbVar.getMessagesController().getChatFull(chat.f20047id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = wbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = wbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j3 = wbVar.getMessagesController().telegramAntispamUserId;
                if (wbVar.getMessagesController().getUser(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f20188id.add(tL_inputUser);
                    ConnectionsManager.getInstance(wbVar.currentAccount).sendRequest(tL_users_getUsers, new ya(wbVar, 1));
                }
                wbVar.f42062t0.add(0, channelParticipant);
            }
            Dialog dialog = wbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).Q(wbVar.f42062t0);
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

    public static CharSequence a1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.gms.internal.vision.e2.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            ah.f.l();
            spannableStringBuilder.setSpan(ah.f.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int l0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int m0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int n0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int o0(wb wbVar) {
        return wbVar.classGuid;
    }

    public static void p0(org.telegram.ui.wb r6, android.os.Bundle r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.p0(org.telegram.ui.wb, android.os.Bundle, long):void");
    }

    public static int q0(wb wbVar) {
        return wbVar.currentAccount;
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

    public static void v0(wb wbVar, MessageObject messageObject) {
        if (wbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        wbVar.showDialog(b2Var);
    }

    public static int w0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int x0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int y0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static int z0(wb wbVar) {
        return wbVar.classGuid;
    }

    public final MessageObject N0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f42055o0;
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
            tL_message.dialog_id = -this.f42045f.f20047id;
            tL_message.f20068id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e7) {
                FileLog.e(e7);
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
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new m8(1)).distinct().map(new Function() {
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
            d11 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new d11(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.o6 o6Var = S0.f35603a;
                o6Var.u(bold);
                o6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f35605c != -1) {
                    S0.f35605c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.o6 o6Var2 = S0.f35603a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                o6Var2.q(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.rq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) hg.c.g(1, arrayList);
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
        gg.b0 b0Var = this.f42067x;
        if (b0Var != null && !this.f42049i0) {
            int L0 = b0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f42067x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f42059r0 && !this.f42057q0) {
                    U0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f42042d0 == null) {
            k0 k0Var = new k0(this, getParentActivity(), 4);
            this.f42042d0 = k0Var;
            k0Var.setOutlineProvider(new ai.k2(8));
            this.f42042d0.setClipToOutline(true);
            this.f42042d0.setWillNotDraw(false);
            this.f42042d0.setVisibility(4);
            l4 l4Var = new l4(getParentActivity());
            this.f42044e0 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f42042d0.addView(this.f42044e0, w7.z5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f42046f0 = textureView;
            textureView.setOpaque(false);
            this.f42044e0.addView(this.f42046f0, w7.z5.c(-1.0f, -1));
        }
        if (this.f42042d0.getParent() == null) {
            tb tbVar = this.X;
            k0 k0Var2 = this.f42042d0;
            int i10 = AndroidUtilities.roundMessageSize;
            tbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f42042d0.setVisibility(4);
        this.f42044e0.setDrawingReady(false);
        return this.f42046f0;
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
            ArrayList arrayList4 = this.f42054n0;
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
                        MessageObject messageObject3 = (MessageObject) hg.c.g(1, arrayList3);
                        if (TextUtils.isEmpty(this.f42064v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f42056p0;
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
                        long j11 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j11, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j11)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) hg.c.g(1, arrayList5);
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
                ArrayList arrayList6 = this.f42055o0;
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
        sb sbVar;
        if (!this.f42059r0) {
            ArrayList arrayList = this.f42054n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f42053n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f42051k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f42059r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f42045f);
            tL_channels_getAdminLog.f20082q = this.f42064v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f42063u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f42066w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f42066w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f42066w0.n(i10)));
                }
            }
            b1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 3));
            if (z10 && (sbVar = this.E) != null) {
                sbVar.l();
            }
        }
    }

    public final void V0() {
        if (this.f42061s0) {
            return;
        }
        this.f42061s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f42045f);
        tL_channels_getAdminLog.f20082q = this.f42064v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f42063u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f42066w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f42066w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f42066w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ya(this, 0));
    }

    public final void W0(boolean z10) {
        int i10;
        long j3;
        lb lbVar = this.v;
        if (lbVar != null && this.f42067x != null && lbVar.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.u1 u1Var = null;
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
                        u1Var = childAt;
                        i11 = R;
                    } else {
                        if (top <= i10) {
                        }
                        i10 = childAt.getTop();
                        u1Var = childAt;
                        i11 = R;
                    }
                }
            }
            if (u1Var != null) {
                if (u1Var instanceof org.telegram.ui.Cells.u1) {
                    j3 = u1Var.getMessageObject().eventId;
                } else if (u1Var instanceof org.telegram.ui.Cells.w0) {
                    j3 = u1Var.getMessageObject().eventId;
                } else {
                    j3 = 0;
                }
                this.M0 = j3;
                this.N0 = i11;
                this.O0 = (this.v.getMeasuredHeight() - u1Var.getBottom()) - this.v.getPaddingBottom();
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
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.J0) != null && (textLayoutBlocks = u1Var.f23159c4) != null) {
                i10 = (int) u1Var.f23355q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var2 = this.J0;
                if (u1Var2 != null && u1Var2.f23398t1) {
                    i10 = u1Var2.f23297m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = this.J0;
            if (u1Var3 != null) {
                u1Var3.f23469xe = 0;
                u1Var3.f23484ye = null;
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
            org.telegram.ui.Cells.u1 u1Var4 = this.J0;
            if (u1Var4 != null) {
                u1Var4.f23469xe = 0;
                u1Var4.f23484ye = null;
            }
        }
        return 0;
    }

    public final void Y0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.Y0(org.telegram.messenger.MessageObject):void");
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f42064v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f42066w0 == null && this.f42063u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f42045f.megagroup) {
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
        org.telegram.ui.Cells.u1 u1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.v.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.v1) {
                org.telegram.ui.Cells.v1 v1Var = (org.telegram.ui.Cells.v1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                v1Var.f23552f = y3;
                v1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int top = u1Var2.getTop();
                u1Var2.getBottom();
                if (top >= 0) {
                    i10 = 0;
                } else {
                    i10 = -top;
                }
                int measuredHeight2 = u1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                u1Var2.b4(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = u1Var2.getMessageObject();
                if (this.f42042d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = u1Var2.getPhotoImage();
                    this.f42042d0.setTranslationX(photoImage.getImageX());
                    this.f42042d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f42042d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.U((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var.H()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.u1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        u1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                mb mbVar = this.C0;
                if ((mbVar == null || (!mbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
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
        k0 k0Var = this.f42042d0;
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
        if (u1Var != null) {
            if (u1Var instanceof org.telegram.ui.Cells.u1) {
                messageObject = u1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.w0) u1Var).getMessageObject();
            }
            this.M.R(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.u1) && !(view2 instanceof org.telegram.ui.Cells.w0)) {
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
                arrayList.add(new org.telegram.ui.Cells.u1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.i6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        hg.c.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 28));
        org.telegram.ui.Components.ho hoVar = new org.telegram.ui.Components.ho(context, null, false, null);
        this.I = hoVar;
        hl hlVar = hoVar.h;
        if (hlVar != null) {
            hlVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        hl hlVar2 = hoVar.f27293r;
        if (hlVar2 != null) {
            hlVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        hoVar.f27286k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.z5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.ho hoVar2 = this.I;
        TLRPC.Chat chat = this.f42045f;
        hoVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        kb kbVar = new kb(this, context);
        this.fragmentView = kbVar;
        this.X = kbVar;
        kbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.i6.r0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        dh.e p5 = eh.b.p(this.resourceProvider);
        ah.c cVar = this.f42040c;
        kVar.J(cVar, p5, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.z5.e(-1, -2, 17));
        this.H.setOnTouchListener(new bi.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.u5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.f20860f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.z5.t(54, 54, 17, 16, 20, 16, -4));
        ai.p4 p4Var = new ai.p4(context, 9);
        this.L = p4Var;
        p4Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ai.p4 p4Var2 = this.L;
        int i11 = org.telegram.ui.ActionBar.i6.f20924ic;
        p4Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.z5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        lb lbVar = new lb(this, context);
        this.v = lbVar;
        lbVar.setOnItemClickListener(new g(this, 8));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        lb lbVar2 = this.v;
        sb sbVar = new sb(this, context);
        this.E = sbVar;
        lbVar2.setAdapter(sbVar);
        this.v.setClipToPadding(false);
        lb lbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f42043e;
        lbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        lb lbVar4 = this.v;
        mb mbVar = new mb(this, this.v, this.resourceProvider);
        this.C0 = mbVar;
        lbVar4.setItemAnimator(mbVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(this);
        this.f42067x = b0Var;
        b0Var.j1(1);
        this.f42067x.l1(true);
        this.v.setLayoutManager(this.f42067x);
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(this.v, this.f42067x);
        this.f42069y = bl0Var;
        bl0Var.h = new ab(this);
        bl0Var.f25020i = this.L0;
        this.X.addView(this.v, w7.z5.c(-1.0f, -1));
        this.v.setOnScrollListener(new i3(this));
        this.glassEngine.b(this.v);
        int i14 = this.f42047g0;
        if (i14 != -1) {
            this.f42067x.h1(i14, this.f42048h0);
            this.f42047g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f42038b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42053n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f42053n, w7.z5.e(-1, -1, 51));
        View view2 = new View(context);
        this.f42058r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.u5(this.f42058r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.f20860f2));
        this.f42053n.addView(this.f42058r, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f42060s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f42060s.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f42053n.addView(this.f42060s, w7.z5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.z5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.d6 d6Var = this.resourceProvider;
        jh.e eVar = new jh.e(cVar, context, eh.b.b(d6Var), d6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        jh.e eVar2 = this.G;
        ch.d c10 = eVar2.f14146n.c(eVar2, null, false);
        c10.w(eVar2.f14147r);
        c10.y(AndroidUtilities.dp(22.0f));
        c10.x(AndroidUtilities.dp(6.0f));
        eVar2.f14148s = c10;
        this.X.addView(this.G, w7.z5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final wb f35741b;

            {
                this.f35741b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f35741b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.f42063u0, wbVar.f42066w0, wbVar.f42045f.megagroup);
                            g0Var.Q(wbVar.f42062t0);
                            g0Var.f26654g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f35741b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f42045f.megagroup) {
                            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                        b2Var.R = string;
                        wbVar2.showDialog(b2Var);
                        return;
                    default:
                        wb wbVar3 = this.f35741b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.e5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f20383a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.z5.e(-2, -2, 17));
        jh.e eVar3 = this.G;
        eVar3.f14145f.add(this.F);
        this.G.d(false);
        jh.e eVar4 = this.G;
        eVar4.f14142b[4] = new View.OnClickListener(this) {
            public final wb f35741b;

            {
                this.f35741b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f35741b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.f42063u0, wbVar.f42066w0, wbVar.f42045f.megagroup);
                            g0Var.Q(wbVar.f42062t0);
                            g0Var.f26654g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f35741b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f42045f.megagroup) {
                            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                        b2Var.R = string;
                        wbVar2.showDialog(b2Var);
                        return;
                    default:
                        wb wbVar3 = this.f35741b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.e5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f20383a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f42037a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f42037a0.setVisibility(4);
        this.f42037a0.setFocusable(true);
        this.f42037a0.setFocusableInTouchMode(true);
        this.f42037a0.setClickable(true);
        this.f42037a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f42037a0, w7.z5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f42039b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f42039b0.setImageResource(R.drawable.msg_calendar);
        this.f42039b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21204xe, false), PorterDuff.Mode.MULTIPLY));
        this.f42037a0.addView(this.f42039b0, w7.z5.e(48, 48, 53));
        this.f42039b0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f35741b;

            {
                this.f35741b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f35741b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(wbVar, wbVar.f42063u0, wbVar.f42066w0, wbVar.f42045f.megagroup);
                            g0Var.Q(wbVar.f42062t0);
                            g0Var.f26654g0 = new ab(wbVar);
                            wbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f35741b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f42045f.megagroup) {
                            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20377a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                        b2Var.R = string;
                        wbVar2.showDialog(b2Var);
                        return;
                    default:
                        wb wbVar3 = this.f35741b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.N.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.e5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f20383a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f42041c0 = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21222ye, false));
        this.f42041c0.setTextSize(15);
        this.f42041c0.setTypeface(AndroidUtilities.bold());
        this.f42037a0.addView(this.f42041c0, w7.z5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f42059r0 && this.f42054n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f42053n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f42053n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        lb lbVar5 = this.v;
        lbVar5.Y1 = true;
        lbVar5.Z1 = 1;
        UndoView undoView = new UndoView(context);
        this.f42065w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f42065w, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        b1();
        return this.fragmentView;
    }

    public final void d1() {
        boolean z10;
        lb lbVar = this.v;
        if (lbVar != null) {
            int childCount = lbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.v.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            u1Var.setDrawSelectionBackground(false);
                            u1Var.J3(false, true);
                            u1Var.L3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            za zaVar = this.I0;
                            if (zaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(zaVar);
                            }
                            za zaVar2 = new za(this, 0);
                            this.I0 = zaVar2;
                            AndroidUtilities.runOnUIThread(zaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f42064v0)) {
                            u1Var.S3(this.f42064v0);
                        } else {
                            u1Var.S3(null);
                        }
                        if (this.v.getScrollState() == 0) {
                            z11 = false;
                        }
                        u1Var.setSpoilersSuppressed(z11);
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
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.u1 u1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.u1 u1Var3;
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
                MediaController.getInstance().setTextureView(Q0(true), this.f42044e0, this.f42042d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt;
                            MessageObject messageObject4 = u1Var4.getMessageObject();
                            if (this.f42042d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = u1Var4.getPhotoImage();
                                this.f42042d0.setTranslationX(photoImage.getImageX());
                                this.f42042d0.setTranslationY(photoImage.getImageY() + u1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f42042d0.invalidate();
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
                if (this.f42042d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f42042d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
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
                    if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject3 = (u1Var3 = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                u1Var3.e1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    u1Var3.invalidate();
                                }
                            }
                        } else {
                            u1Var3.m4(false, true, false);
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
                        if ((childAt3 instanceof org.telegram.ui.Cells.u1) && (messageObject2 = (u1Var2 = (org.telegram.ui.Cells.u1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                u1Var2.q4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.V(org.telegram.ui.ActionBar.i6.r0());
                this.f42058r.invalidate();
                ai.p4 p4Var = this.L;
                if (p4Var != null) {
                    p4Var.invalidate();
                }
                this.v.g1();
            }
        } else {
            lb lbVar4 = this.v;
            if (lbVar4 != null) {
                int childCount4 = lbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.v.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                u1Var.e1(null, true);
                            }
                        } else {
                            u1Var.m4(false, true, false);
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21109s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.f21164v8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.f21128t8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.i6.f20805c2, org.telegram.ui.ActionBar.i6.f20823d2}, org.telegram.ui.ActionBar.i6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20920i8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20938j8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20958k8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20976l8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20995m8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21015n8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21032o8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20990m3, org.telegram.ui.ActionBar.i6.f21065q3}, null, org.telegram.ui.ActionBar.i6.f21091ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21010n3, org.telegram.ui.ActionBar.i6.f21084r3}, null, org.telegram.ui.ActionBar.i6.f20833dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.i6.f20990m3.k();
        int i13 = org.telegram.ui.ActionBar.i6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.f21065q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.i6.f21027o3.k();
        int i14 = org.telegram.ui.ActionBar.i6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.f21104s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21046p3, org.telegram.ui.ActionBar.i6.f21123t3}, null, org.telegram.ui.ActionBar.i6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.f21103s2;
        int i15 = org.telegram.ui.ActionBar.i6.f20924ic;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.i6.f21103s2, null, null, org.telegram.ui.ActionBar.i6.f20942jc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21178w4, org.telegram.ui.ActionBar.i6.f21066q4, org.telegram.ui.ActionBar.i6.f21195x4, org.telegram.ui.ActionBar.i6.f21160v4, org.telegram.ui.ActionBar.i6.f21142u4, org.telegram.ui.ActionBar.i6.C4}, null, org.telegram.ui.ActionBar.i6.f20962kc));
        int i16 = org.telegram.ui.ActionBar.i6.f20980lc;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20999mc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20869fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.i6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.i6.f20905hc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21230z3}, null, org.telegram.ui.ActionBar.i6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f21113sc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.O3, org.telegram.ui.ActionBar.i6.S3, org.telegram.ui.ActionBar.i6.W3}, null, org.telegram.ui.ActionBar.i6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.P3, org.telegram.ui.ActionBar.i6.T3, org.telegram.ui.ActionBar.i6.X3}, null, org.telegram.ui.ActionBar.i6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.M3, org.telegram.ui.ActionBar.i6.Q3, org.telegram.ui.ActionBar.i6.U3}, null, org.telegram.ui.ActionBar.i6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.N3, org.telegram.ui.ActionBar.i6.R3, org.telegram.ui.ActionBar.i6.V3}, null, org.telegram.ui.ActionBar.i6.f21220yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20768a4, org.telegram.ui.ActionBar.i6.f20788b4, org.telegram.ui.ActionBar.i6.Z3}, null, org.telegram.ui.ActionBar.i6.f21239zc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20845e4}, null, org.telegram.ui.ActionBar.i6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20862f4}, null, org.telegram.ui.ActionBar.i6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20807c4}, null, org.telegram.ui.ActionBar.i6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20825d4}, null, org.telegram.ui.ActionBar.i6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20880g4}, null, org.telegram.ui.ActionBar.i6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.i6.f20916i4};
        int i17 = org.telegram.ui.ActionBar.i6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.i6.f20898h4, org.telegram.ui.ActionBar.i6.B4, org.telegram.ui.ActionBar.i6.D4};
        int i18 = org.telegram.ui.ActionBar.i6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.J4, null, org.telegram.ui.ActionBar.i6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.H4, null, org.telegram.ui.ActionBar.i6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.O4}, null, org.telegram.ui.ActionBar.i6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.P4}, null, org.telegram.ui.ActionBar.i6.f21088r7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.Q4}, null, org.telegram.ui.ActionBar.i6.f21071qa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.f20786b2, null, null, org.telegram.ui.ActionBar.i6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20934j4}, null, org.telegram.ui.ActionBar.i6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.J2, null, null, org.telegram.ui.ActionBar.i6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.K2, null, null, org.telegram.ui.ActionBar.i6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.T1, null, null, org.telegram.ui.ActionBar.i6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.Q2, null, null, org.telegram.ui.ActionBar.i6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Rc));
        int i19 = org.telegram.ui.ActionBar.i6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.i6.f20775ab;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20795bb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20832db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20851eb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20777ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20868fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20815cd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20887gb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20834dd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20904hb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20852ed));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20923ib));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20870fd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20941jb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20906hd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20925id));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21072qb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20943jd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21092rb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20963kd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21018nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21112sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21036od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21055pd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20979lb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21094rd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21130tb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21114sd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21149ub));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21132td));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21166vb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21151ud));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21185wb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21186wd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21219yb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21203xd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21168vd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21238zb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21202xb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21221yd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21240zd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20926ie));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21150uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20944je));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21167vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.i6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.i6.f21095re));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.i6.f21115se));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.i6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.i6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21056pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.i6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.i6.f21075qe));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.i6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42060s, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.i6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.i6.De));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42058r, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.Fi));
        int i21 = org.telegram.ui.ActionBar.i6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.i6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42065w, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f42065w;
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f42045f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ya(this, 4)), this.classGuid);
        setBulletinDelegate(new ci.z8(6));
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
        this.f42068x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.k91 k91Var = tbVar.v;
            if (k91Var != null) {
                k91Var.c(false);
            }
            tbVar.F = true;
        }
        UndoView undoView = this.f42065w;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42049i0 = true;
        this.f42050j0 = true;
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f7901e;
        if (mVar != null && mVar.f7902a) {
            com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k();
            if (k10.f7902a) {
                int i10 = d5.F;
                ((s4) k10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f42046f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        tb tbVar = this.X;
        if (tbVar != null) {
            org.telegram.ui.Components.k91 k91Var = tbVar.v;
            if (k91Var != null) {
                k91Var.c(true);
            }
            tbVar.F = false;
        }
        this.f42049i0 = false;
        O0(false);
        if (this.f42050j0) {
            this.f42050j0 = false;
            sb sbVar = this.E;
            if (sbVar != null) {
                sbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f42068x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f42068x0.lock();
        }
    }
}
