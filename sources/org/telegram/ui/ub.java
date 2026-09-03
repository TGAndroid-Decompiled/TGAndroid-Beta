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
import java.util.Iterator;
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
public final class ub extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static int U0 = 10;
    public static final int[] V0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public HashMap A0;
    public jb B;
    public boolean B0;
    public UndoView C;
    public final fb C0;
    public k D;
    public kb D0;
    public c2.z E;
    public final ArrayList E0;
    public qb F;
    public final a0.h F0;
    public TextView G;
    public db G0;
    public wg.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.yn J;
    public xa J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.s1 K0;
    public ImageView L;
    public int L0;
    public gg.q M;
    public final tb M0;
    public org.telegram.ui.Cells.v0 N;
    public long N0;
    public org.telegram.ui.ActionBar.w0 O;
    public int O0;
    public long P;
    public int P0;
    public boolean Q;
    public kf.e0 Q0;
    public boolean R;
    public final ArrayList R0;
    public AnimatorSet S;
    public final ArrayList S0;
    public boolean T;
    public final RectF T0;
    public final int[] U;
    public boolean V;
    public boolean W;
    public wg.f X;
    public rb Y;
    public MessageObject Z;
    public final sg.e f38729a;
    public TLRPC.ChannelParticipant f38730a0;
    public final ng.a f38731b;
    public FrameLayout f38732b0;
    public final sg.d f38733c;
    public ImageView f38734c0;
    public final sg.d d;
    public org.telegram.ui.ActionBar.k5 f38735d0;
    public final ng.a e;
    public n0 f38736e0;
    public final ng.a f38737f;
    public q4 f38738f0;
    public TextureView f38739g0;
    public final be.b h;
    public int f38740h0;
    public int f38741i0;
    public boolean f38742j0;
    public boolean f38743k0;
    public final a0.h f38744l0;
    public final a0.h m0;
    public final ng.e f38745n;
    public final HashMap f38746n0;
    public final ArrayList f38747o0;
    public final ArrayList f38748p0;
    public final HashSet f38749q0;
    public final int f38750r;
    public boolean f38751r0;
    public final TLRPC.Chat f38752s;
    public boolean f38753s0;
    public boolean f38754t0;
    public ArrayList f38755u0;
    public final ArrayList v;
    public TLRPC.TL_channelAdminLogEventsFilter f38756v0;
    public FrameLayout f38757w;
    public String f38758w0;
    public View f38759x;
    public a0.h f38760x0;
    public RadialProgressView f38761y;
    public final AnimationNotificationsLocker f38762y0;
    public final HashMap f38763z0;

    public ub(TLRPC.Chat chat) {
        super(null);
        be.b bVar = new be.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.U = new int[]{2};
        this.f38740h0 = -1;
        this.f38741i0 = 0;
        this.f38742j0 = true;
        this.f38743k0 = false;
        this.f38744l0 = new a0.h();
        this.m0 = new a0.h();
        this.f38746n0 = new HashMap();
        this.f38747o0 = new ArrayList();
        this.f38748p0 = new ArrayList();
        this.f38749q0 = new HashSet();
        this.f38756v0 = null;
        this.f38758w0 = "";
        this.f38762y0 = new AnimationNotificationsLocker(V0);
        this.f38763z0 = new HashMap();
        this.C0 = new fb(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = Integer.MAX_VALUE;
        this.I0 = -1;
        this.M0 = new tb(this);
        this.O0 = -1;
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new RectF();
        ?? obj = new Object();
        this.f38729a = obj;
        ng.a aVar = new ng.a(obj);
        this.f38731b = aVar;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ng.e eVar = new ng.e(false);
            this.f38745n = eVar;
            sg.d dVar = new sg.d(obj);
            this.d = dVar;
            dVar.v = new xa(this, 3);
            dVar.d = eVar;
            dVar.e = -3;
            dVar.f44378f = obj;
            ng.a aVar2 = new ng.a(dVar);
            this.f38737f = aVar2;
            aVar2.f14952f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                sg.d dVar2 = new sg.d(obj);
                this.f38733c = dVar2;
                dVar2.v = new xa(this, 3);
                dVar2.d = eVar;
                dVar2.e = -2;
                dVar2.f44378f = obj;
                ng.a aVar3 = new ng.a(dVar2);
                this.e = aVar3;
                aVar3.f14952f = LiteMode.isEnabled(262144);
                this.f38750r = 0;
            } else {
                this.f38733c = null;
                this.e = aVar2;
                this.f38750r = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.f38745n = null;
            this.f38750r = 0;
            this.f38733c = null;
            this.d = null;
            this.e = new ng.a(obj);
            this.f38737f = new ng.a(obj);
        }
        aVar.f14951c = bVar;
        this.e.f14951c = bVar;
        this.f38737f.f14951c = bVar;
        this.f38752s = chat;
    }

    public static void A0(ub ubVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = ubVar.getMessagesController();
        TLRPC.Chat chat = ubVar.f38752s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f19159id);
        org.telegram.ui.Components.t60 t60Var = new org.telegram.ui.Components.t60(ubVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, ubVar, chatFull.f19160id, false, ChatObject.isChannel(chat));
        t60Var.f28915g0 = new gb(ubVar);
        t60Var.show();
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

    public static int J0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static void K0(ub ubVar) {
        if (ubVar.B != null && !ubVar.f38747o0.isEmpty()) {
            ubVar.D.h1(ubVar.f38748p0.size() - 1, (-100000) - ubVar.B.getPaddingTop());
        }
    }

    public static int L0(ub ubVar) {
        return ubVar.currentAccount;
    }

    public static y01 S0(CharSequence charSequence) {
        org.telegram.ui.Components.lq[] lqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.lq lqVar : (org.telegram.ui.Components.lq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.lq.class)) {
                if (lqVar != null) {
                    Drawable drawable = lqVar.drawable;
                    if (drawable instanceof y01) {
                        return (y01) drawable;
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
        a0.h hVar = ubVar.f38744l0;
        int i10 = 0;
        ubVar.D0.N = false;
        ubVar.X0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = ubVar.f38747o0;
        boolean z4 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f19191id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                ubVar.P = Math.min(ubVar.P, tL_channelAdminLogEvent.f19191id);
                MessageObject messageObject2 = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) ubVar.f38746n0, ubVar.f38752s, ubVar.U, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f19191id);
                }
                z4 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                ubVar.m0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(ubVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -ubVar.f38752s.f19159id, 0, 0L, new xa(ubVar, 1), ubVar.getClassGuid(), null);
        }
        ubVar.R0();
        ubVar.f38753s0 = false;
        if (!z4) {
            ubVar.f38751r0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(ubVar.f38757w, false, 0.3f, true);
        ubVar.B.setEmptyView(ubVar.I);
        qb qbVar = ubVar.F;
        if (qbVar != null) {
            qbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = ubVar.O;
        if (w0Var != null) {
            if (ubVar.f38748p0.isEmpty() && TextUtils.isEmpty(ubVar.f38758w0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        boolean z4;
        boolean z10;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && ubVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, ubVar.getParentActivity(), ubVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            ubVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(ubVar.getParentActivity(), ubVar.getResourceProvider()), k7.b6.n(-1, 8));
                } else {
                    Activity parentActivity = ubVar.getParentActivity();
                    if (i11 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i11 == size - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, ubVar.getResourceProvider(), z4, z10);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        g1Var.c(ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7), ubVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20097p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    g1Var.setOnClickListener(new nh.o5(ubVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            cb cbVar = new cb(0, ubVar.Y.getContext(), ubVar);
            cbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            cbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            db dbVar = new db(ubVar, cbVar);
            ubVar.G0 = dbVar;
            dbVar.e = true;
            dbVar.f20492c = 220;
            dbVar.setOutsideTouchable(true);
            ubVar.G0.setClippingEnabled(true);
            ubVar.G0.setAnimationStyle(R.style.PopupContextAnimation);
            ubVar.G0.setFocusable(true);
            cbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            ubVar.G0.setInputMethodMode(2);
            ubVar.G0.setSoftInputMode(48);
            ubVar.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f10)) - cbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (ubVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - cbVar.getMeasuredWidth()) {
                left = (ubVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - cbVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                ubVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = ubVar.Y.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + cbVar.getMeasuredHeight();
            int R = ubVar.Y.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y10 = (int) (ubVar.B.getY() + view.getTop() + f11);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y10;
                } else {
                    i10 = y10;
                }
                if (i10 < ubVar.B.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (ubVar.B.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!ubVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            cbVar.setMaxHeight(height - i10);
            ubVar.G0.showAtLocation(ubVar.B, 51, left, i10);
            ubVar.G0.b();
        }
    }

    public static void W(org.telegram.ui.ub r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.W(org.telegram.ui.ub, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(ub ubVar, int i10) {
        int i11;
        RectF rectF;
        sg.d dVar = ubVar.f38733c;
        sg.d dVar2 = ubVar.d;
        ArrayList arrayList = ubVar.S0;
        ng.e eVar = ubVar.f38745n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            if (k7.w8.a(i10, 2)) {
                ArrayList arrayList2 = ubVar.R0;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, ubVar.Y.getMeasuredWidth(), ubVar.B.getY() + ubVar.B.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.d(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.d(arrayList2, i11, AndroidUtilities.dp(8.0f));
                    }
                } else {
                    i11 = 0;
                }
                int a2 = kf.m0.a(i11, arrayList2, arrayList);
                int measuredWidth = ubVar.Y.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f10 = measuredWidth;
                    rectF2.left = k7.n.a(rectF2.left, 0.0f, f10);
                    rectF2.top = Math.max(ubVar.B.getY(), rectF2.top);
                    rectF2.right = k7.n.a(rectF2.right, 0.0f, f10);
                    rectF2.bottom = Math.min(ubVar.B.getY() + ubVar.B.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            rb rbVar = ubVar.Y;
            Objects.requireNonNull(rbVar);
            if (eVar.e(new wa(rbVar, 0), ubVar.Y.getWidth(), ubVar.Y.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = ubVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                ubVar.Y.invalidate();
                Iterator it = ubVar.h.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    public static void Y(ub ubVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = ubVar.f38744l0;
        ubVar.f38754t0 = false;
        ubVar.D0.N = false;
        ubVar.X0(false);
        MessagesController.getInstance(ubVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(ubVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z4 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f19191id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                ubVar.P = Math.min(ubVar.P, tL_channelAdminLogEvent2.f19191id);
                MessageObject messageObject = new MessageObject(ubVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, ubVar.f38752s, ubVar.U, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f19191id))) {
                    ubVar.f38747o0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f19191id);
                    z4 = true;
                }
            }
        }
        if (ubVar.F != null && z4) {
            ubVar.R0();
            ubVar.F.l();
        }
    }

    public static void Z(ub ubVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = ubVar.f38752s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            ubVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            ubVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            ubVar.f38755u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = ubVar.getMessagesController().getChatFull(chat.f19159id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = ubVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = ubVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = ubVar.getMessagesController().telegramAntispamUserId;
                if (ubVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f19300id.add(tL_inputUser);
                    ConnectionsManager.getInstance(ubVar.currentAccount).sendRequest(tL_users_getUsers, new sa(ubVar, 2));
                }
                ubVar.f38755u0.add(0, channelParticipant);
            }
            Dialog dialog = ubVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.h0) {
                ((org.telegram.ui.Components.h0) dialog).S(ubVar.f38755u0);
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

    public static CharSequence b1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!e2.c.s(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.y.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.y.f(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            d2Var.Q = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            d2Var.Q = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        ubVar.showDialog(d2Var);
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

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z4, boolean z10) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f38748p0;
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
            tL_message.dialog_id = -this.f38752s.f19159id;
            tL_message.f19180id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j11));
        messageObject2.contentType = 1;
        if (z10 && arrayList.size() > 1) {
            messageObject2.actionDeleteGroupEventId = j10;
        } else {
            messageObject2.actionDeleteGroupEventId = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new p8(1)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                ub ubVar = ub.this;
                ubVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat chat = ubVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(ubVar.getMessagesController().getUser(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new kh.c1(1)).limit(4L).toArray());
        if (z10) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z10 && arrayList.size() > 1) {
            y01 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z4) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new y01(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.j6 j6Var = S0.f40108a;
                j6Var.u(bold);
                j6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f40110c != -1) {
                    S0.f40110c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.j6 j6Var2 = S0.f40108a;
                if (z4) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                j6Var2.q(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) kf.k0.i(1, arrayList);
        }
        if (messageObject != null) {
            long j12 = messageObject.eventId;
            a0.h hVar = this.F0;
            if (!hVar.d(j12)) {
                long j13 = messageObject.eventId;
                int i13 = U0;
                U0 = i13 + 1;
                hVar.k(Integer.valueOf(i13), j13);
            }
            messageObject2.stableId = ((Integer) hVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void O0(boolean z4) {
        int abs;
        k kVar = this.D;
        if (kVar != null && !this.f38742j0) {
            int L0 = kVar.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.D.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.F.getClass();
                if (z4) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f38753s0 && !this.f38751r0) {
                    V0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z4) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f38736e0 == null) {
            n0 n0Var = new n0(this, getParentActivity(), 4);
            this.f38736e0 = n0Var;
            n0Var.setOutlineProvider(new gg.j1(6));
            this.f38736e0.setClipToOutline(true);
            this.f38736e0.setWillNotDraw(false);
            this.f38736e0.setVisibility(4);
            q4 q4Var = new q4(getParentActivity());
            this.f38738f0 = q4Var;
            q4Var.setBackgroundColor(0);
            if (z4) {
                this.f38736e0.addView(this.f38738f0, k7.b6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f38739g0 = textureView;
            textureView.setOpaque(false);
            this.f38738f0.addView(this.f38739g0, k7.b6.c(-1.0f, -1));
        }
        if (this.f38736e0.getParent() == null) {
            rb rbVar = this.Y;
            n0 n0Var2 = this.f38736e0;
            int i10 = AndroidUtilities.roundMessageSize;
            rbVar.addView(n0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f38736e0.setVisibility(4);
        this.f38738f0.setDrawingReady(false);
        return this.f38739g0;
    }

    public final void R0() {
        long j10;
        MessageObject messageObject;
        long j11;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList4 = this.f38747o0;
            if (i12 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
                }
                if (messageObject2.stableId <= 0) {
                    int i13 = U0;
                    U0 = i13 + 1;
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
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((MessageObject) arrayList3.get(size2)).contentType == 1; size2--) {
                        arrayList5.add((MessageObject) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        MessageObject messageObject3 = (MessageObject) kf.k0.i(1, arrayList3);
                        if (TextUtils.isEmpty(this.f38758w0) && arrayList3.size() > 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f38749q0;
                        if (!hashSet.contains(valueOf) && z10) {
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
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z4 != z11) {
                            messageObject3.forceUpdate = true;
                            qb qbVar = this.F;
                            if (z4) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            qbVar.m(i10 + size);
                            qb qbVar2 = this.F;
                            if (z4) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            qbVar2.m(size + i11 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z10));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) kf.k0.i(1, arrayList5);
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
                ArrayList arrayList6 = this.f38748p0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void T0(boolean z4) {
        if (this.N.getTag() != null && !this.Q) {
            if (!this.T || this.R) {
                this.N.setTag(null);
                if (z4) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.S = animatorSet;
                    animatorSet.setDuration(150L);
                    this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
                    this.S.addListener(new u5(this, 14));
                    this.S.setStartDelay(500L);
                    this.S.start();
                    return;
                }
                AnimatorSet animatorSet2 = this.S;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
            }
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f38745n != null) {
            kf.e0 e0Var = this.Q0;
            if (e0Var.f10417c == 0) {
                e0Var.invalidate();
            }
            e0Var.f10417c = i10 | e0Var.f10417c;
        }
    }

    public final void V0(boolean z4) {
        qb qbVar;
        if (!this.f38753s0) {
            ArrayList arrayList = this.f38747o0;
            if (z4) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f38757w;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.I.setVisibility(4);
                    this.B.setEmptyView(null);
                }
                this.f38744l0.b();
                arrayList.clear();
                this.f38746n0.clear();
                R0();
            }
            this.f38753s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f38752s);
            tL_channels_getAdminLog.f19194q = this.f38758w0;
            tL_channels_getAdminLog.limit = 50;
            if (!z4 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.P;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f38756v0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f38760x0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f38760x0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f38760x0.n(i10)));
                }
            }
            c1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new sa(this, 4));
            if (z4 && (qbVar = this.F) != null) {
                qbVar.l();
            }
        }
    }

    public final void W0() {
        if (this.f38754t0) {
            return;
        }
        this.f38754t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f38752s);
        tL_channels_getAdminLog.f19194q = this.f38758w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f38756v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f38760x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f38760x0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f38760x0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new sa(this, 1));
    }

    public final void X0(boolean z4) {
        int i10;
        long j10;
        jb jbVar = this.B;
        if (jbVar != null && this.D != null && jbVar.getChildCount() > 0) {
            if (z4) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.s1 s1Var = null;
            int i11 = -1;
            for (int i12 = 0; i12 < this.B.getChildCount(); i12++) {
                View childAt = this.B.getChildAt(i12);
                this.B.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z4) {
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
                this.N0 = j10;
                this.O0 = i11;
                this.P0 = (this.B.getMeasuredHeight() - s1Var.getBottom()) - this.B.getPaddingBottom();
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
        float f10;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (s1Var = this.K0) != null && (textLayoutBlocks = s1Var.Z3) != null) {
                i10 = (int) s1Var.f22095n4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var2 = this.K0;
                if (s1Var2 != null && s1Var2.f22135q1) {
                    i10 = s1Var2.f22036j2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = this.K0;
            if (s1Var3 != null) {
                s1Var3.te = 0;
                s1Var3.f22202ue = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.I0)) >= 0) {
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
                        float f11 = AndroidUtilities.displaySize.y;
                        float f12 = 0.5f;
                        if (this.Y.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                            f10 = 0.7f;
                        } else {
                            f10 = 0.5f;
                        }
                        if (lineTop > f11 * f10) {
                            float f13 = AndroidUtilities.displaySize.y;
                            if (this.Y.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                                f12 = 0.7f;
                            }
                            return (int) (lineTop - (f13 * f12));
                        }
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            org.telegram.ui.Cells.s1 s1Var4 = this.K0;
            if (s1Var4 != null) {
                s1Var4.te = 0;
                s1Var4.f22202ue = null;
            }
        }
        return 0;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ub.Z0(org.telegram.messenger.MessageObject):void");
    }

    public final void c1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f38758w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.M.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f38760x0 == null && this.f38756v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f38752s.megagroup) {
                this.M.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.M.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.M.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.s1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.j6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 15));
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, null, false, null);
        this.J = ynVar;
        kl klVar = ynVar.h;
        if (klVar != null) {
            klVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        kl klVar2 = ynVar.f31076r;
        if (klVar2 != null) {
            klVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        ynVar.f31066h0 = true;
        this.J.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.J, 0, k7.b6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 0);
        this.O = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.yn ynVar2 = this.J;
        TLRPC.Chat chat = this.f38752s;
        ynVar2.setTitle(chat.title);
        this.J.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.J.setChatAvatar(chat);
        ib ibVar = new ib(this, context);
        this.fragmentView = ibVar;
        this.Y = ibVar;
        kf.e0 e0Var = new kf.e0(context, new ya(this));
        this.Q0 = e0Var;
        this.Y.addView(e0Var);
        ug.i iVar = new ug.i(this.Y);
        rb rbVar = this.Y;
        ng.a aVar = this.e;
        aVar.d = iVar;
        aVar.e = rbVar;
        ng.a aVar2 = this.f38737f;
        aVar2.d = iVar;
        aVar2.e = rbVar;
        ng.a aVar3 = this.f38731b;
        aVar3.d = iVar;
        aVar3.e = rbVar;
        rbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.Y.V(org.telegram.ui.ActionBar.j6.r0());
        this.actionBar.M(aVar, rg.b.o(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, k7.b6.e(-1, -2, 17));
        this.I.setOnTouchListener(new oh.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.M, this.Y, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.f19913f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, k7.b6.t(54, 54, 17, 16, 20, 16, -4));
        gg.q qVar = new gg.q(context, 8);
        this.M = qVar;
        qVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        gg.q qVar2 = this.M;
        int i11 = org.telegram.ui.ActionBar.j6.ic;
        qVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.K.addView(this.M, k7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, k7.b6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        jb jbVar = new jb(this, context);
        this.B = jbVar;
        jbVar.setOnItemClickListener(new h(this, 9));
        this.B.setTag(1);
        this.B.setVerticalScrollBarEnabled(true);
        jb jbVar2 = this.B;
        qb qbVar = new qb(this, context);
        this.F = qbVar;
        jbVar2.setAdapter(qbVar);
        this.B.setClipToPadding(false);
        jb jbVar3 = this.B;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f38750r;
        jbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        jb jbVar4 = this.B;
        kb kbVar = new kb(this, this.B, this.resourceProvider);
        this.D0 = kbVar;
        jbVar4.setItemAnimator(kbVar);
        this.D0.Q = true;
        this.B.setLayoutAnimation(null);
        k kVar = new k(this);
        this.D = kVar;
        kVar.j1(1);
        this.D.l1(true);
        this.B.setLayoutManager(this.D);
        c2.z zVar = new c2.z(this.B, this.D);
        this.E = zVar;
        zVar.h = new ya(this);
        zVar.f2066i = this.M0;
        this.Y.addView(this.B, k7.b6.c(-1.0f, -1));
        this.B.setOnScrollListener(new n3(this));
        int i14 = this.f38740h0;
        if (i14 != -1) {
            this.D.h1(i14, this.f38741i0);
            this.f38740h0 = -1;
        }
        ?? view = new View(context);
        this.X = view;
        view.setup(aVar3);
        this.X.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.X.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.X.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.X.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.Y.addView(this.X, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f38757w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.f38757w, k7.b6.e(-1, -1, 51));
        View view2 = new View(context);
        this.f38759x = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.w5(this.f38759x, this.Y, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f19913f2));
        this.f38757w.addView(this.f38759x, k7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38761y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f38761y.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f38757w.addView(this.f38761y, k7.b6.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.N = v0Var;
        v0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, k7.b6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        wg.e eVar = new wg.e(context, aVar, f6Var, rg.b.b(f6Var));
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.H.c(4, true, false);
        wg.e eVar2 = this.H;
        pg.b c3 = eVar2.f46627n.c(eVar2, null, false);
        c3.n(eVar2.f46628r);
        c3.p(AndroidUtilities.dp(22.0f));
        c3.o(AndroidUtilities.dp(6.0f));
        eVar2.f46629s = c3;
        this.Y.addView(this.H, k7.b6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ub f32539b;

            {
                this.f32539b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ub ubVar = this.f32539b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.f38756v0, ubVar.f38760x0, ubVar.f38752s.megagroup);
                            h0Var.S(ubVar.f38755u0);
                            h0Var.f25279d0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            return;
                        }
                        return;
                    case 1:
                        ub ubVar2 = this.f32539b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.f38752s.megagroup) {
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string;
                        ubVar2.showDialog(d2Var);
                        return;
                    default:
                        ub ubVar3 = this.f32539b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.O.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.z4.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).f19500a);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ae, false));
        this.G.setText(LocaleController.getString(R.string.SETTINGS));
        this.G.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.H.getContainer().addView(this.G, k7.b6.e(-2, -2, 17));
        wg.e eVar3 = this.H;
        eVar3.f46626f.add(this.G);
        this.H.d(false);
        wg.e eVar4 = this.H;
        eVar4.f46624b[4] = new View.OnClickListener(this) {
            public final ub f32539b;

            {
                this.f32539b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ub ubVar = this.f32539b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.f38756v0, ubVar.f38760x0, ubVar.f38752s.megagroup);
                            h0Var.S(ubVar.f38755u0);
                            h0Var.f25279d0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            return;
                        }
                        return;
                    case 1:
                        ub ubVar2 = this.f32539b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.f38752s.megagroup) {
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string;
                        ubVar2.showDialog(d2Var);
                        return;
                    default:
                        ub ubVar3 = this.f32539b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.O.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.z4.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).f19500a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f38732b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f38732b0.setVisibility(4);
        this.f38732b0.setFocusable(true);
        this.f38732b0.setFocusableInTouchMode(true);
        this.f38732b0.setClickable(true);
        this.f38732b0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.Y.addView(this.f38732b0, k7.b6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f38734c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f38734c0.setImageResource(R.drawable.msg_calendar);
        this.f38734c0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20246xe, false), PorterDuff.Mode.MULTIPLY));
        this.f38732b0.addView(this.f38734c0, k7.b6.e(48, 48, 53));
        this.f38734c0.setOnClickListener(new View.OnClickListener(this) {
            public final ub f32539b;

            {
                this.f32539b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ub ubVar = this.f32539b;
                        if (ubVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(ubVar, ubVar.f38756v0, ubVar.f38760x0, ubVar.f38752s.megagroup);
                            h0Var.S(ubVar.f38755u0);
                            h0Var.f25279d0 = new ya(ubVar);
                            ubVar.showDialog(h0Var);
                            return;
                        }
                        return;
                    case 1:
                        ub ubVar2 = this.f32539b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar2.getParentActivity());
                        if (ubVar2.f38752s.megagroup) {
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string;
                        ubVar2.showDialog(d2Var);
                        return;
                    default:
                        ub ubVar3 = this.f32539b;
                        if (ubVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(ubVar3.O.getSearchField());
                            ubVar3.showDialog(org.telegram.ui.Components.z4.p(ubVar3.getParentActivity(), new va(ubVar3, 0), null).f19500a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f38735d0 = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20264ye, false));
        this.f38735d0.setTextSize(15);
        this.f38735d0.setTypeface(AndroidUtilities.bold());
        this.f38732b0.addView(this.f38735d0, k7.b6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.f38753s0 && this.f38747o0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f38757w, true, 0.3f, true);
            this.B.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f38757w, false, 0.3f, true);
            this.B.setEmptyView(this.I);
        }
        jb jbVar5 = this.B;
        jbVar5.V1 = true;
        jbVar5.W1 = 1;
        UndoView undoView = new UndoView(context);
        this.C = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.Y.addView(this.C, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        MessageObject messageObject;
        int i10;
        jb jbVar = this.B;
        if (jbVar == null) {
            return;
        }
        int childCount = jbVar.getChildCount();
        int measuredHeight = this.B.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z4 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z10 = false;
        org.telegram.ui.Cells.s1 s1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.B.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                t1Var.f22318f = y10;
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
                s1Var2.b4(i10, measuredHeight2 - i10, (this.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.B.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = s1Var2.getMessageObject();
                if (this.f38736e0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    this.f38736e0.setTranslationX(photoImage.getImageX());
                    this.f38736e0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f38736e0.invalidate();
                    z10 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                v0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (v0Var.I()) {
                    v0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.B.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.s1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        s1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                kb kbVar = this.D0;
                if ((kbVar == null || (!kbVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        n0 n0Var = this.f38736e0;
        if (n0Var != null) {
            if (!z10) {
                n0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.W) {
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
            this.N.T(messageObject.messageOwner.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof org.telegram.ui.Cells.s1) && !(view2 instanceof org.telegram.ui.Cells.v0)) {
            z4 = true;
        }
        this.R = z4;
        if (view != null) {
            if (view.getTop() <= this.B.getPaddingTop() && !this.R) {
                if (view.getAlpha() != 0.0f) {
                    view.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                if (this.N.getTag() == null) {
                    this.N.setTag(1);
                }
                if (this.N.getAlpha() != 1.0f) {
                    this.N.setAlpha(1.0f);
                }
                this.Q = true;
            } else {
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                T0(true ^ this.R);
            }
            int bottom2 = view.getBottom() - this.B.getPaddingTop();
            if (bottom2 > this.N.getMeasuredHeight() && bottom2 < this.N.getMeasuredHeight() * 2) {
                org.telegram.ui.Cells.v0 v0Var2 = this.N;
                v0Var2.setTranslationY(((-v0Var2.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.N.setTranslationY(0.0f);
            return;
        }
        T0(true);
        this.N.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.s1 s1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var3;
        MessageObject messageObject3;
        boolean z4;
        if (i10 == NotificationCenter.emojiLoaded) {
            jb jbVar = this.B;
            if (jbVar != null) {
                jbVar.e1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f38738f0, this.f38736e0, true);
                int childCount = this.B.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.B.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject messageObject4 = s1Var4.getMessageObject();
                            if (this.f38736e0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = s1Var4.getPhotoImage();
                                this.f38736e0.setTranslationX(photoImage.getImageX());
                                this.f38736e0.setTranslationY(photoImage.getImageY() + s1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f38736e0.invalidate();
                                z4 = true;
                                break;
                            }
                        }
                        i12++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (this.f38736e0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z4) {
                        this.f38736e0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.W || PipRoundVideoView.C != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            jb jbVar2 = this.B;
            if (jbVar2 != null) {
                int childCount2 = jbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.B.getChildAt(i13);
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
                            s1Var3.m4(false, true, false);
                        }
                    }
                }
            }
        } else if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                jb jbVar3 = this.B;
                if (jbVar3 != null) {
                    int childCount3 = jbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.B.getChildAt(i14);
                        if ((childAt3 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = (s1Var2 = (org.telegram.ui.Cells.s1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                s1Var2.q4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.Y.V(org.telegram.ui.ActionBar.j6.r0());
                this.f38759x.invalidate();
                gg.q qVar = this.M;
                if (qVar != null) {
                    qVar.invalidate();
                }
                this.B.e1();
            }
        } else {
            jb jbVar4 = this.B;
            if (jbVar4 != null) {
                int childCount4 = jbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.B.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                s1Var.e1(null, true);
                            }
                        } else {
                            s1Var.m4(false, true, false);
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
        boolean z4;
        jb jbVar = this.B;
        if (jbVar != null) {
            int childCount = jbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.B.getChildAt(i10);
                boolean z10 = true;
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            s1Var.setDrawSelectionBackground(false);
                            s1Var.J3(false, true);
                            s1Var.L3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.getRealId() == this.H0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        s1Var.setHighlighted(z4);
                        if (this.H0 != Integer.MAX_VALUE) {
                            xa xaVar = this.J0;
                            if (xaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(xaVar);
                            }
                            xa xaVar2 = new xa(this, 0);
                            this.J0 = xaVar2;
                            AndroidUtilities.runOnUIThread(xaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f38758w0)) {
                            s1Var.S3(this.f38758w0);
                        } else {
                            s1Var.S3(null);
                        }
                        if (this.B.getScrollState() == 0) {
                            z10 = false;
                        }
                        s1Var.setSpoilersSuppressed(z10);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    v0Var.setMessageObject(v0Var.getMessageObject());
                    if (this.B.getScrollState() == 0) {
                        z10 = false;
                    }
                    v0Var.setSpoilersSuppressed(z10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20202v8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f20167t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.f19860c2, org.telegram.ui.ActionBar.j6.f19877d2}, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19973i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19990j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20008k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20026l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20044m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20062n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20080o8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20039m3, org.telegram.ui.ActionBar.j6.f20112q3}, null, org.telegram.ui.ActionBar.j6.f20136ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20057n3, org.telegram.ui.ActionBar.j6.f20129r3}, null, org.telegram.ui.ActionBar.j6.f19887dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.j6.f20039m3.k();
        int i13 = org.telegram.ui.ActionBar.j6.f20168ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.f20112q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.j6.f20075o3.k();
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.f20147s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20093p3, org.telegram.ui.ActionBar.j6.f20163t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.f20146s2;
        int i15 = org.telegram.ui.ActionBar.j6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.j6.f20146s2, null, null, org.telegram.ui.ActionBar.j6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20217w4, org.telegram.ui.ActionBar.j6.f20113q4, org.telegram.ui.ActionBar.j6.f20236x4, org.telegram.ui.ActionBar.j6.f20198v4, org.telegram.ui.ActionBar.j6.f20180u4, org.telegram.ui.ActionBar.j6.C4}, null, org.telegram.ui.ActionBar.j6.f20012kc));
        int i16 = org.telegram.ui.ActionBar.j6.f20030lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20047mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19904ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19922fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.f19941gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.f19958hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20253y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20271z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20153sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O3, org.telegram.ui.ActionBar.j6.S3, org.telegram.ui.ActionBar.j6.W3}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P3, org.telegram.ui.ActionBar.j6.T3, org.telegram.ui.ActionBar.j6.X3}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.f20244xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.f20262yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19824a4, org.telegram.ui.ActionBar.j6.f19843b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.f20277zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19897e4}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19915f4}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19861c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19879d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19933g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.f19969i4};
        int i17 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.j6.f19951h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i18 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.J4, null, org.telegram.ui.ActionBar.j6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.f20133r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.f20119qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.f19841b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19986j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.Q2, null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i19 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.f19831ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19850bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19868cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19886db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19903eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19833ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19921fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19852bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19870cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19940gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19888dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19957hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19905ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19976ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19923fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19993jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19959hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19977id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19994jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20137rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20013kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20066nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20084od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20065nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20103pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20029lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20169tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20154sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20187ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20171td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20205vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20189ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20224wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20226wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20261yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20245xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20207vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20243xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20263yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19978ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20188uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19995je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20206vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.f20139re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.f20155se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20104pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.j6.f20122qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38761y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 8, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38759x, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i21 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.C;
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
        V0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f38752s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new sa(this, 0)), this.classGuid);
        setBulletinDelegate(new gg.w(5));
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
        this.f38762y0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        rb rbVar = this.Y;
        if (rbVar != null) {
            org.telegram.ui.Components.o81 o81Var = rbVar.v;
            if (o81Var != null) {
                o81Var.c(false);
            }
            rbVar.C = true;
        }
        UndoView undoView = this.C;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38742j0 = true;
        this.f38743k0 = true;
        cb.m mVar = cb.m.e;
        if (mVar != null && mVar.f2255a) {
            cb.m l10 = cb.m.l();
            if (l10.f2255a) {
                int i10 = g5.C;
                ((w4) l10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f38739g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        rb rbVar = this.Y;
        if (rbVar != null) {
            org.telegram.ui.Components.o81 o81Var = rbVar.v;
            if (o81Var != null) {
                o81Var.c(true);
            }
            rbVar.C = false;
        }
        this.f38742j0 = false;
        O0(false);
        if (this.f38743k0) {
            this.f38743k0 = false;
            qb qbVar = this.F;
            if (qbVar != null) {
                qbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.f38762y0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        if (z4) {
            this.f38762y0.lock();
        }
    }
}
