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
public final class yb extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final kb B0;
    public ob C0;
    public final ArrayList D0;
    public ub E;
    public final a0.i E0;
    public TextView F;
    public ib F0;
    public jh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.wo I;
    public bb I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.u1 J0;
    public ImageView K;
    public int K0;
    public ai.q4 L;
    public final xb L0;
    public org.telegram.ui.Cells.w0 M;
    public long M0;
    public org.telegram.ui.ActionBar.u0 N;
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
    public vb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final fh.e f44410a;
    public FrameLayout f44411a0;
    public final ah.c f44412b;
    public ImageView f44413b0;
    public final ah.c f44414c;
    public org.telegram.ui.ActionBar.h5 f44415c0;
    public final ah.h d;
    public k0 f44416d0;
    public final int f44417e;
    public l4 f44418e0;
    public final TLRPC.Chat f44419f;
    public TextureView f44420f0;
    public int f44421g0;
    public final ArrayList h;
    public int f44422h0;
    public boolean f44423i0;
    public boolean f44424j0;
    public final a0.i f44425k0;
    public final a0.i f44426l0;
    public final HashMap m0;
    public FrameLayout f44427n;
    public final ArrayList f44428n0;
    public final ArrayList f44429o0;
    public final HashSet f44430p0;
    public boolean f44431q0;
    public View f44432r;
    public boolean f44433r0;
    public RadialProgressView f44434s;
    public boolean f44435s0;
    public ArrayList f44436t0;
    public TLRPC.TL_channelAdminLogEventsFilter f44437u0;
    public nb v;
    public String f44438v0;
    public UndoView f44439w;
    public a0.i f44440w0;
    public gg.a0 f44441x;
    public final AnimationNotificationsLocker f44442x0;
    public org.telegram.ui.Components.zl0 f44443y;
    public final HashMap f44444y0;
    public HashMap f44445z0;

    public yb(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f44421g0 = -1;
        this.f44422h0 = 0;
        this.f44423i0 = true;
        this.f44424j0 = false;
        this.f44425k0 = new a0.i();
        this.f44426l0 = new a0.i();
        this.m0 = new HashMap();
        this.f44428n0 = new ArrayList();
        this.f44429o0 = new ArrayList();
        this.f44430p0 = new HashSet();
        this.f44437u0 = null;
        this.f44438v0 = "";
        this.f44442x0 = new AnimationNotificationsLocker(R0);
        this.f44444y0 = new HashMap();
        this.B0 = new kb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.i();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new xb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        li.e eVar = this.glassEngine;
        eVar.f15354a = new cb(this);
        eVar.f15357e = new mi.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f44410a = obj;
        ah.c cVar = new ah.c(obj);
        this.f44412b = cVar;
        cVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.d = hVar;
            fh.d dVar = new fh.d(obj);
            dVar.d = hVar;
            dVar.f9935e = -3;
            dVar.f9936f = obj;
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj);
                dVar2.d = hVar;
                dVar2.f9935e = -2;
                dVar2.f9936f = obj;
                ah.c cVar2 = new ah.c(dVar2);
                this.f44414c = cVar2;
                cVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                cVar2.f544b = dp2;
                cVar2.f545c = dp2;
                cVar2.f549i = LiteMode.isEnabled(262144);
                this.f44417e = 0;
            } else {
                ah.c cVar3 = new ah.c(dVar);
                this.f44414c = cVar3;
                cVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                cVar3.f544b = dp;
                cVar3.f545c = dp;
                this.f44417e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.f44417e = 0;
            ah.c cVar4 = new ah.c(obj);
            this.f44414c = cVar4;
            cVar4.h = this.glassEngine;
        }
        this.f44419f = chat;
    }

    public static void A0(yb ybVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = ybVar.getMessagesController();
        TLRPC.Chat chat = ybVar.f44419f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f19803id);
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(ybVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, ybVar, chatFull.f19804id, false, ChatObject.isChannel(chat));
        w70Var.f32330j0 = new lb(ybVar);
        w70Var.show();
    }

    public static org.telegram.ui.ActionBar.k G0(yb ybVar) {
        return ybVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k H0(yb ybVar) {
        return ybVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k I0(yb ybVar) {
        return ybVar.actionBar;
    }

    public static void K0(yb ybVar) {
        if (ybVar.v != null && !ybVar.f44428n0.isEmpty()) {
            ybVar.f44441x.h1(ybVar.f44429o0.size() - 1, (-100000) - ybVar.v.getPaddingTop());
        }
    }

    public static int L0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static l11 S0(CharSequence charSequence) {
        org.telegram.ui.Components.gr[] grVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.gr grVar : (org.telegram.ui.Components.gr[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.gr.class)) {
                if (grVar != null) {
                    Drawable drawable = grVar.drawable;
                    if (drawable instanceof l11) {
                        return (l11) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(yb ybVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.i iVar = ybVar.f44425k0;
        int i10 = 0;
        ybVar.C0.N = false;
        ybVar.W0(false);
        MessagesController.getInstance(ybVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ybVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = ybVar.f44428n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (iVar.h(tL_channelAdminLogEvent.f19835id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                ybVar.O = Math.min(ybVar.O, tL_channelAdminLogEvent.f19835id);
                MessageObject messageObject2 = new MessageObject(ybVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) ybVar.m0, ybVar.f44419f, ybVar.T, false);
                if (messageObject2.contentType >= 0) {
                    iVar.k(messageObject2, tL_channelAdminLogEvent.f19835id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                ybVar.f44426l0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(ybVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -ybVar.f44419f.f19803id, 0, 0L, new bb(ybVar, 1), ybVar.getClassGuid(), null);
        }
        ybVar.R0();
        ybVar.f44433r0 = false;
        if (!z10) {
            ybVar.f44431q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(ybVar.f44427n, false, 0.3f, true);
        ybVar.v.setEmptyView(ybVar.H);
        ub ubVar = ybVar.E;
        if (ubVar != null) {
            ubVar.l();
        }
        org.telegram.ui.ActionBar.u0 u0Var = ybVar.N;
        if (u0Var != null) {
            if (ybVar.f44429o0.isEmpty() && TextUtils.isEmpty(ybVar.f44438v0)) {
                i10 = 8;
            }
            u0Var.setVisibility(i10);
        }
    }

    public static void V(yb ybVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && ybVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, ybVar.getParentActivity(), ybVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            ybVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(ybVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(ybVar.getParentActivity(), ybVar.getResourceProvider()), w7.w5.n(-1, 8));
                } else {
                    Activity parentActivity = ybVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, parentActivity, ybVar.getResourceProvider(), z10, z11);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        e1Var.c(ybVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7), ybVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20781p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    e1Var.setOnClickListener(new ai.u7(ybVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            hb hbVar = new hb(0, ybVar.X.getContext(), ybVar);
            hbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.w5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            hbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            ib ibVar = new ib(ybVar, hbVar);
            ybVar.F0 = ibVar;
            ibVar.f21147e = true;
            ibVar.f21146c = 220;
            ibVar.setOutsideTouchable(true);
            ybVar.F0.setClippingEnabled(true);
            ybVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            ybVar.F0.setFocusable(true);
            hbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            ybVar.F0.setInputMethodMode(2);
            ybVar.F0.setSoftInputMode(48);
            ybVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - hbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (ybVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - hbVar.getMeasuredWidth()) {
                left = (ybVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - hbVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                ybVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = ybVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + hbVar.getMeasuredHeight();
            int R = ybVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y3 = (int) (ybVar.v.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < ybVar.v.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (ybVar.v.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!ybVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            hbVar.setMaxHeight(height - i10);
            ybVar.F0.showAtLocation(ybVar.v, 51, left, i10);
            ybVar.F0.b();
        }
    }

    public static void W(org.telegram.ui.yb r21, int r22, java.util.ArrayList r23, java.lang.Integer r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yb.W(org.telegram.ui.yb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(yb ybVar, int i10) {
        int i11;
        ah.h hVar = ybVar.d;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            if (w7.f0.a(i10, 4)) {
                li.e eVar = ybVar.glassEngine;
                mi.a aVar = eVar.f15369r;
                mi.a aVar2 = eVar.f15368q;
                if (aVar == aVar2) {
                    aVar.getClass();
                } else {
                    aVar.f16195b = 0;
                    int i12 = aVar2.f16195b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        RectF rectF = (RectF) aVar2.f16194a.get(i13);
                        aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    }
                }
                float y3 = ybVar.v.getY();
                float width = ybVar.X.getWidth();
                float y10 = ybVar.v.getY() + ybVar.v.getHeight();
                int i14 = 0;
                while (true) {
                    i11 = aVar.f16195b;
                    if (i14 >= i11) {
                        break;
                    }
                    RectF rectF2 = (RectF) aVar.f16194a.get(i14);
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
                ArrayList arrayList = hVar.f583i;
                hVar.f584j = i11;
                while (hVar.f584j > arrayList.size()) {
                    arrayList.add(new ah.g(hVar));
                }
                for (int i15 = 0; i15 < hVar.f584j; i15++) {
                    ah.g.a((ah.g) arrayList.get(i15), aVar.b(i15));
                }
            }
            vb vbVar = ybVar.X;
            Objects.requireNonNull(vbVar);
            hVar.e(new za(vbVar, 0), ybVar.X.getWidth(), ybVar.X.getHeight());
        }
    }

    public static void Y(yb ybVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.i iVar = ybVar.f44425k0;
        ybVar.f44435s0 = false;
        ybVar.C0.N = false;
        ybVar.W0(false);
        MessagesController.getInstance(ybVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ybVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (iVar.h(tL_channelAdminLogEvent2.f19835id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                ybVar.O = Math.min(ybVar.O, tL_channelAdminLogEvent2.f19835id);
                MessageObject messageObject = new MessageObject(ybVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, ybVar.f44419f, ybVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !iVar.d(tL_channelAdminLogEvent2.f19835id))) {
                    ybVar.f44428n0.add(0, messageObject);
                    iVar.k(messageObject, tL_channelAdminLogEvent2.f19835id);
                    z10 = true;
                }
            }
        }
        if (ybVar.E != null && z10) {
            ybVar.R0();
            ybVar.E.l();
        }
    }

    public static void Z(yb ybVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = ybVar.f44419f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            ybVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            ybVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            ybVar.f44436t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = ybVar.getMessagesController().getChatFull(chat.f19803id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = ybVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = ybVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j3 = ybVar.getMessagesController().telegramAntispamUserId;
                if (ybVar.getMessagesController().getUser(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f19944id.add(tL_inputUser);
                    ConnectionsManager.getInstance(ybVar.currentAccount).sendRequest(tL_users_getUsers, new ab(ybVar, 1));
                }
                ybVar.f44436t0.add(0, channelParticipant);
            }
            Dialog dialog = ybVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).T(ybVar.f44436t0);
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
            if (!com.google.android.gms.internal.vision.e2.t(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            ah.e.l();
            spannableStringBuilder.setSpan(ah.e.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int l0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int m0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int n0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int o0(yb ybVar) {
        return ybVar.classGuid;
    }

    public static void p0(org.telegram.ui.yb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yb.p0(org.telegram.ui.yb, android.os.Bundle, long):void");
    }

    public static int q0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int r0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int s0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int t0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int u0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static void v0(yb ybVar, MessageObject messageObject) {
        if (ybVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ybVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            a2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            a2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        ybVar.showDialog(a2Var);
    }

    public static int w0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int x0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int y0(yb ybVar) {
        return ybVar.currentAccount;
    }

    public static int z0(yb ybVar) {
        return ybVar.classGuid;
    }

    public final MessageObject N0(long j3, long j10, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f44429o0;
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
            tL_message.dialog_id = -this.f44419f.f19803id;
            tL_message.f19824id = -1;
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
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new n8(1)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                yb ybVar = yb.this;
                ybVar.getClass();
                if (l4.longValue() < 0) {
                    TLRPC.Chat chat = ybVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(ybVar.getMessagesController().getUser(l4));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new eb(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            l11 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new l11(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.q6 q6Var = S0.f39616a;
                q6Var.x(bold);
                q6Var.w(AndroidUtilities.dp(10.0f));
                if (S0.f39618c != -1) {
                    S0.f39618c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.q6 q6Var2 = S0.f39616a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                q6Var2.t(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.gr(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
        gg.a0 a0Var = this.f44441x;
        if (a0Var != null && !this.f44423i0) {
            int L0 = a0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f44441x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f44433r0 && !this.f44431q0) {
                    U0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yb.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f44416d0 == null) {
            k0 k0Var = new k0(this, getParentActivity(), 4);
            this.f44416d0 = k0Var;
            k0Var.setOutlineProvider(new ai.l2(8));
            this.f44416d0.setClipToOutline(true);
            this.f44416d0.setWillNotDraw(false);
            this.f44416d0.setVisibility(4);
            l4 l4Var = new l4(getParentActivity());
            this.f44418e0 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f44416d0.addView(this.f44418e0, w7.w5.d(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f44420f0 = textureView;
            textureView.setOpaque(false);
            this.f44418e0.addView(this.f44420f0, w7.w5.d(-1.0f, -1));
        }
        if (this.f44416d0.getParent() == null) {
            vb vbVar = this.X;
            k0 k0Var2 = this.f44416d0;
            int i10 = AndroidUtilities.roundMessageSize;
            vbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f44416d0.setVisibility(4);
        this.f44418e0.setDrawingReady(false);
        return this.f44420f0;
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
            ArrayList arrayList4 = this.f44428n0;
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
                        if (TextUtils.isEmpty(this.f44438v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f44430p0;
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
                            ub ubVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            ubVar.m(i10 + size);
                            ub ubVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            ubVar2.m(size + i11 + 1);
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
                ArrayList arrayList6 = this.f44429o0;
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
                    this.R.addListener(new w4(this, 15));
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
        ub ubVar;
        if (!this.f44433r0) {
            ArrayList arrayList = this.f44428n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f44427n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f44425k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f44433r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f44419f);
            tL_channels_getAdminLog.f19838q = this.f44438v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f44437u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f44440w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f44440w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f44440w0.n(i10)));
                }
            }
            b1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ab(this, 3));
            if (z10 && (ubVar = this.E) != null) {
                ubVar.l();
            }
        }
    }

    public final void V0() {
        if (this.f44435s0) {
            return;
        }
        this.f44435s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f44419f);
        tL_channels_getAdminLog.f19838q = this.f44438v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f44437u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f44440w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f44440w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f44440w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ab(this, 0));
    }

    public final void W0(boolean z10) {
        int i10;
        long j3;
        nb nbVar = this.v;
        if (nbVar != null && this.f44441x != null && nbVar.getChildCount() > 0) {
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
            if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.J0) != null && (textLayoutBlocks = u1Var.f22915c4) != null) {
                i10 = (int) u1Var.f23109q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var2 = this.J0;
                if (u1Var2 != null && u1Var2.f23151t1) {
                    i10 = u1Var2.f23051m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = this.J0;
            if (u1Var3 != null) {
                u1Var3.f23223xe = 0;
                u1Var3.f23237ye = null;
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
                u1Var4.f23223xe = 0;
                u1Var4.f23237ye = null;
            }
        }
        return 0;
    }

    public final void Y0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yb.Y0(org.telegram.messenger.MessageObject):void");
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f44438v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f44440w0 == null && this.f44437u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f44419f.megagroup) {
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
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject messageObject;
        int i10;
        nb nbVar = this.v;
        if (nbVar == null) {
            return;
        }
        int childCount = nbVar.getChildCount();
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
                v1Var.f23307f = y3;
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
                if (this.f44416d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = u1Var2.getPhotoImage();
                    this.f44416d0.setTranslationX(photoImage.getImageX());
                    this.f44416d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f44416d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) childAt;
                w0Var2.a0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (w0Var2.K()) {
                    w0Var2.invalidate();
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
                ob obVar = this.C0;
                if ((obVar == null || (!obVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
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
        k0 k0Var = this.f44416d0;
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
            this.M.X(messageObject.messageOwner.date, false, true);
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
                this.M.setTranslationY(((-w0Var.getMeasuredHeight()) * 2) + bottom2);
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
        org.telegram.ui.ActionBar.h6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        hg.c.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 29));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(context, null, false, null);
        this.I = woVar;
        ql qlVar = woVar.h;
        if (qlVar != null) {
            qlVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        ql qlVar2 = woVar.f32519r;
        if (qlVar2 != null) {
            qlVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        woVar.f32512k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.w5.a(-1.0f, 54.0f, 0.0f, 52.0f, 0.0f, -2, 51));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.wo woVar2 = this.I;
        TLRPC.Chat chat = this.f44419f;
        woVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        mb mbVar = new mb(this, context);
        this.fragmentView = mbVar;
        this.X = mbVar;
        mbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.h6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        dh.e o9 = eh.b.o(this.resourceProvider);
        ah.c cVar = this.f44414c;
        kVar.N(cVar, o9, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.w5.e(-1, -2, 17));
        this.H.setOnTouchListener(new bi.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.f20593f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.w5.t(54, 54, 17, 16, 20, 16, -4));
        ai.q4 q4Var = new ai.q4(context, 9);
        this.L = q4Var;
        q4Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ai.q4 q4Var2 = this.L;
        int i11 = org.telegram.ui.ActionBar.h6.f20657ic;
        q4Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.w5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.w5.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -2, 17));
        nb nbVar = new nb(this, context);
        this.v = nbVar;
        nbVar.setOnItemClickListener(new g(this, 9));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        nb nbVar2 = this.v;
        ub ubVar = new ub(this, context);
        this.E = ubVar;
        nbVar2.setAdapter(ubVar);
        this.v.setClipToPadding(false);
        nb nbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f44417e;
        nbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        nb nbVar4 = this.v;
        ob obVar = new ob(this, this.v, this.resourceProvider);
        this.C0 = obVar;
        nbVar4.setItemAnimator(obVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        gg.a0 a0Var = new gg.a0(this);
        this.f44441x = a0Var;
        a0Var.j1(1);
        this.f44441x.l1(true);
        this.v.setLayoutManager(this.f44441x);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(this.v, this.f44441x);
        this.f44443y = zl0Var;
        zl0Var.h = new cb(this);
        zl0Var.f33437i = this.L0;
        this.X.addView(this.v, w7.w5.d(-1.0f, -1));
        this.v.setOnScrollListener(new i3(this));
        this.glassEngine.a(this.v);
        int i14 = this.f44421g0;
        if (i14 != -1) {
            this.f44441x.h1(i14, this.f44422h0);
            this.f44421g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f44412b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.w5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44427n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f44427n, w7.w5.e(-1, -1, 51));
        View view2 = new View(context);
        this.f44432r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.t5(this.f44432r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f20593f2));
        this.f44427n.addView(this.f44432r, w7.w5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f44434s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f44434s.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f44427n.addView(this.f44434s, w7.w5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.w5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -2, 49));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        jh.e eVar = new jh.e(cVar, context, eh.b.b(c6Var), c6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        jh.e eVar2 = this.G;
        ch.d c10 = eVar2.f14179n.c(eVar2, null, false);
        c10.o(eVar2.f14180r);
        c10.q(AndroidUtilities.dp(22.0f));
        c10.p(AndroidUtilities.dp(6.0f));
        eVar2.f14181s = c10;
        this.X.addView(this.G, w7.w5.a(56.0f, 54.0f, 0.0f, 0.0f, 3.0f, -1, 80));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final yb f37700b;

            {
                this.f37700b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        yb ybVar = this.f37700b;
                        if (ybVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(ybVar, ybVar.f44437u0, ybVar.f44440w0, ybVar.f44419f.megagroup);
                            g0Var.T(ybVar.f44436t0);
                            g0Var.f26205g0 = new cb(ybVar);
                            ybVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        yb ybVar2 = this.f37700b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ybVar2.getParentActivity());
                        if (ybVar2.f44419f.megagroup) {
                            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        ybVar2.showDialog(a2Var);
                        return;
                    default:
                        yb ybVar3 = this.f37700b;
                        if (ybVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ybVar3.N.getSearchField());
                            ybVar3.showDialog(org.telegram.ui.Components.g5.o(ybVar3.getParentActivity(), new ya(ybVar3, 0), null).f21485a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ae, false));
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.w5.e(-2, -2, 17));
        this.G.f14178f.add(this.F);
        this.G.d(false);
        this.G.f14175b[4] = new View.OnClickListener(this) {
            public final yb f37700b;

            {
                this.f37700b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        yb ybVar = this.f37700b;
                        if (ybVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(ybVar, ybVar.f44437u0, ybVar.f44440w0, ybVar.f44419f.megagroup);
                            g0Var.T(ybVar.f44436t0);
                            g0Var.f26205g0 = new cb(ybVar);
                            ybVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        yb ybVar2 = this.f37700b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ybVar2.getParentActivity());
                        if (ybVar2.f44419f.megagroup) {
                            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        ybVar2.showDialog(a2Var);
                        return;
                    default:
                        yb ybVar3 = this.f37700b;
                        if (ybVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ybVar3.N.getSearchField());
                            ybVar3.showDialog(org.telegram.ui.Components.g5.o(ybVar3.getParentActivity(), new ya(ybVar3, 0), null).f21485a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44411a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f44411a0.setVisibility(4);
        this.f44411a0.setFocusable(true);
        this.f44411a0.setFocusableInTouchMode(true);
        this.f44411a0.setClickable(true);
        this.f44411a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f44411a0, w7.w5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f44413b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f44413b0.setImageResource(R.drawable.msg_calendar);
        this.f44413b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20937xe, false), PorterDuff.Mode.MULTIPLY));
        this.f44411a0.addView(this.f44413b0, w7.w5.e(48, 48, 53));
        this.f44413b0.setOnClickListener(new View.OnClickListener(this) {
            public final yb f37700b;

            {
                this.f37700b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        yb ybVar = this.f37700b;
                        if (ybVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(ybVar, ybVar.f44437u0, ybVar.f44440w0, ybVar.f44419f.megagroup);
                            g0Var.T(ybVar.f44436t0);
                            g0Var.f26205g0 = new cb(ybVar);
                            ybVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        yb ybVar2 = this.f37700b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ybVar2.getParentActivity());
                        if (ybVar2.f44419f.megagroup) {
                            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        ybVar2.showDialog(a2Var);
                        return;
                    default:
                        yb ybVar3 = this.f37700b;
                        if (ybVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ybVar3.N.getSearchField());
                            ybVar3.showDialog(org.telegram.ui.Components.g5.o(ybVar3.getParentActivity(), new ya(ybVar3, 0), null).f21485a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f44415c0 = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20953ye, false));
        this.f44415c0.setTextSize(15);
        this.f44415c0.setTypeface(AndroidUtilities.bold());
        this.f44411a0.addView(this.f44415c0, w7.w5.a(-2.0f, 108.0f, 0.0f, 0.0f, 0.0f, -1, 19));
        this.E.D(true);
        if (this.f44433r0 && this.f44428n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f44427n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f44427n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        nb nbVar5 = this.v;
        nbVar5.W1 = true;
        nbVar5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f44439w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f44439w, w7.w5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        b1();
        return this.fragmentView;
    }

    public final void d1() {
        boolean z10;
        nb nbVar = this.v;
        if (nbVar != null) {
            int childCount = nbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.v.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.u()) {
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
                            bb bbVar = this.I0;
                            if (bbVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(bbVar);
                            }
                            bb bbVar2 = new bb(this, 0);
                            this.I0 = bbVar2;
                            AndroidUtilities.runOnUIThread(bbVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f44438v0)) {
                            u1Var.S3(this.f44438v0);
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
            nb nbVar = this.v;
            if (nbVar != null) {
                nbVar.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f44418e0, this.f44416d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt;
                            MessageObject messageObject4 = u1Var4.getMessageObject();
                            if (this.f44416d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = u1Var4.getPhotoImage();
                                this.f44416d0.setTranslationX(photoImage.getImageX());
                                this.f44416d0.setTranslationY(photoImage.getImageY() + u1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f44416d0.invalidate();
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
                if (this.f44416d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f44416d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            nb nbVar2 = this.v;
            if (nbVar2 != null) {
                int childCount2 = nbVar2.getChildCount();
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
                nb nbVar3 = this.v;
                if (nbVar3 != null) {
                    int childCount3 = nbVar3.getChildCount();
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
                this.X.V(org.telegram.ui.ActionBar.h6.s0());
                this.f44432r.invalidate();
                ai.q4 q4Var = this.L;
                if (q4Var != null) {
                    q4Var.invalidate();
                }
                this.v.f1();
            }
        } else {
            nb nbVar4 = this.v;
            if (nbVar4 != null) {
                int childCount4 = nbVar4.getChildCount();
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f20895v8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f20859t8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f20539c2, org.telegram.ui.ActionBar.h6.f20556d2}, org.telegram.ui.ActionBar.h6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f20813r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20653i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20671j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20690k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20708l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20727m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20747n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20765o8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20722m3, org.telegram.ui.ActionBar.h6.f20797q3}, null, org.telegram.ui.ActionBar.h6.f20823ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20742n3, org.telegram.ui.ActionBar.h6.f20816r3}, null, org.telegram.ui.ActionBar.h6.f20566dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.h6.f20722m3.k();
        int i13 = org.telegram.ui.ActionBar.h6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f20797q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.h6.f20760o3.k();
        int i14 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f20835s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20760o3, org.telegram.ui.ActionBar.h6.f20835s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20760o3, org.telegram.ui.ActionBar.h6.f20835s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20760o3, org.telegram.ui.ActionBar.h6.f20835s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20760o3, org.telegram.ui.ActionBar.h6.f20835s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20778p3, org.telegram.ui.ActionBar.h6.f20854t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.h6.f20834s2;
        int i15 = org.telegram.ui.ActionBar.h6.f20657ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.h6.f20834s2, null, null, org.telegram.ui.ActionBar.h6.f20675jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20909w4, org.telegram.ui.ActionBar.h6.f20798q4, org.telegram.ui.ActionBar.h6.f20928x4, org.telegram.ui.ActionBar.h6.f20891v4, org.telegram.ui.ActionBar.h6.f20873u4, org.telegram.ui.ActionBar.h6.C4}, null, org.telegram.ui.ActionBar.h6.f20694kc));
        int i16 = org.telegram.ui.ActionBar.h6.f20712lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20731mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20602fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f20637hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20961z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f20844sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O3, org.telegram.ui.ActionBar.h6.S3, org.telegram.ui.ActionBar.h6.W3}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P3, org.telegram.ui.ActionBar.h6.T3, org.telegram.ui.ActionBar.h6.X3}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20501a4, org.telegram.ui.ActionBar.h6.f20521b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.f20970zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20578e4}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20595f4}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20541c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20558d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20614g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.h6.f20649i4};
        int i17 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.h6.f20630h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i18 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.J4, null, org.telegram.ui.ActionBar.h6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f20820r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f20803qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.f20519b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20667j4}, null, org.telegram.ui.ActionBar.h6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.J2, null, null, org.telegram.ui.ActionBar.h6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.K2, null, null, org.telegram.ui.ActionBar.h6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.T1, null, null, org.telegram.ui.ActionBar.h6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.Q2, null, null, org.telegram.ui.ActionBar.h6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Rc));
        int i19 = org.telegram.ui.ActionBar.h6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.f20508ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20528bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20565db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20584eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20510ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20601fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20530bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20620gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20567dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20636hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20585ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20656ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20603fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20674jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20638hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20658id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20804qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20676jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20824rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20695kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20750nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20843sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20769od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20787pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20711lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20861tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20845sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20880ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20863td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20897vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20882ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20916wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20918wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20951yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20936xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20899vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20969zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20935xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20952yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20971zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20659ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20881uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20677je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20898vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.h6.f20826re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.h6.f20846se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20788pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.h6.f20807qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44434s, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44432r, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i21 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439w, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f44439w;
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f44419f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ab(this, 4)), this.classGuid);
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
        this.f44442x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        vb vbVar = this.X;
        if (vbVar != null) {
            org.telegram.ui.Components.x91 x91Var = vbVar.v;
            if (x91Var != null) {
                x91Var.c(false);
            }
            vbVar.F = true;
        }
        UndoView undoView = this.f44439w;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f44423i0 = true;
        this.f44424j0 = true;
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.f7946e;
        if (mVar != null && mVar.f7947a) {
            com.google.firebase.messaging.m m10 = com.google.firebase.messaging.m.m();
            if (m10.f7947a) {
                int i10 = f5.F;
                ((u4) m10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f44420f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        vb vbVar = this.X;
        if (vbVar != null) {
            org.telegram.ui.Components.x91 x91Var = vbVar.v;
            if (x91Var != null) {
                x91Var.c(true);
            }
            vbVar.F = false;
        }
        this.f44423i0 = false;
        O0(false);
        if (this.f44424j0) {
            this.f44424j0 = false;
            ub ubVar = this.E;
            if (ubVar != null) {
                ubVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f44442x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f44442x0.lock();
        }
    }
}
