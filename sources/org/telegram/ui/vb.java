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
public final class vb extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static int Q0 = 10;
    public static final int[] R0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public boolean A0;
    public final hb B0;
    public lb C0;
    public final ArrayList D0;
    public rb E;
    public final a0.h E0;
    public TextView F;
    public fb F0;
    public kh.e G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.oo I;
    public ya I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.u1 J0;
    public ImageView K;
    public int K0;
    public ai.vd L;
    public final ub L0;
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
    public kh.f W;
    public sb X;
    public MessageObject Y;
    public TLRPC.ChannelParticipant Z;
    public final gh.e f42164a;
    public FrameLayout f42165a0;
    public final bh.b f42166b;
    public ImageView f42167b0;
    public final bh.b f42168c;
    public org.telegram.ui.ActionBar.j5 f42169c0;
    public final bh.f d;
    public m0 f42170d0;
    public final int e;
    public o4 f42171e0;
    public final TLRPC.Chat f42172f;
    public TextureView f42173f0;
    public int f42174g0;
    public final ArrayList h;
    public int f42175h0;
    public boolean f42176i0;
    public boolean f42177j0;
    public final a0.h f42178k0;
    public final a0.h f42179l0;
    public final HashMap m0;
    public FrameLayout f42180n;
    public final ArrayList f42181n0;
    public final ArrayList f42182o0;
    public final HashSet f42183p0;
    public boolean f42184q0;
    public View f42185r;
    public boolean f42186r0;
    public RadialProgressView f42187s;
    public boolean f42188s0;
    public ArrayList f42189t0;
    public TLRPC.TL_channelAdminLogEventsFilter f42190u0;
    public kb v;
    public String f42191v0;
    public UndoView f42192w;
    public a0.h f42193w0;
    public hg.a0 f42194x;
    public final AnimationNotificationsLocker f42195x0;
    public org.telegram.ui.Components.ml0 f42196y;
    public final HashMap f42197y0;
    public HashMap f42198z0;

    public vb(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f42174g0 = -1;
        this.f42175h0 = 0;
        this.f42176i0 = true;
        this.f42177j0 = false;
        this.f42178k0 = new a0.h();
        this.f42179l0 = new a0.h();
        this.m0 = new HashMap();
        this.f42181n0 = new ArrayList();
        this.f42182o0 = new ArrayList();
        this.f42183p0 = new HashSet();
        this.f42190u0 = null;
        this.f42191v0 = "";
        this.f42195x0 = new AnimationNotificationsLocker(R0);
        this.f42197y0 = new HashMap();
        this.B0 = new hb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new ub(this);
        this.N0 = -1;
        this.P0 = new RectF();
        ni.e eVar = this.glassEngine;
        eVar.f17482a = new za(this);
        eVar.e = new oi.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f42164a = obj;
        bh.b bVar = new bh.b(obj);
        this.f42166b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.d = fVar;
            gh.d dVar = new gh.d(obj);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f11059f = obj;
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f11059f = obj;
                bh.b bVar2 = new bh.b(dVar2);
                this.f42168c = bVar2;
                bVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                bVar2.f4356b = dp2;
                bVar2.f4357c = dp2;
                bVar2.f4360i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                bh.b bVar3 = new bh.b(dVar);
                this.f42168c = bVar3;
                bVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                bVar3.f4356b = dp;
                bVar3.f4357c = dp;
                this.e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            bh.b bVar4 = new bh.b(obj);
            this.f42168c = bVar4;
            bVar4.h = this.glassEngine;
        }
        this.f42172f = chat;
    }

    public static void A0(vb vbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = vbVar.getMessagesController();
        TLRPC.Chat chat = vbVar.f42172f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f20280id);
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(vbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, vbVar, chatFull.f20281id, false, ChatObject.isChannel(chat));
        l70Var.f28083j0 = new ib(vbVar);
        l70Var.show();
    }

    public static org.telegram.ui.ActionBar.k G0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k H0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k I0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static int J0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static void K0(vb vbVar) {
        if (vbVar.v != null && !vbVar.f42181n0.isEmpty()) {
            vbVar.f42194x.h1(vbVar.f42182o0.size() - 1, (-100000) - vbVar.v.getPaddingTop());
        }
    }

    public static int L0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static n01 S0(CharSequence charSequence) {
        org.telegram.ui.Components.yq[] yqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.yq yqVar : (org.telegram.ui.Components.yq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.yq.class)) {
                if (yqVar != null) {
                    Drawable drawable = yqVar.drawable;
                    if (drawable instanceof n01) {
                        return (n01) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(vb vbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = vbVar.f42178k0;
        int i10 = 0;
        vbVar.C0.N = false;
        vbVar.W0(false);
        MessagesController.getInstance(vbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(vbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = vbVar.f42181n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f20312id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                vbVar.O = Math.min(vbVar.O, tL_channelAdminLogEvent.f20312id);
                MessageObject messageObject2 = new MessageObject(vbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42172f, vbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f20312id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                vbVar.f42179l0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(vbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -vbVar.f42172f.f20280id, 0, 0L, new ya(vbVar, 1), vbVar.getClassGuid(), null);
        }
        vbVar.R0();
        vbVar.f42186r0 = false;
        if (!z10) {
            vbVar.f42184q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(vbVar.f42180n, false, 0.3f, true);
        vbVar.v.setEmptyView(vbVar.H);
        rb rbVar = vbVar.E;
        if (rbVar != null) {
            rbVar.l();
        }
        org.telegram.ui.ActionBar.u0 u0Var = vbVar.N;
        if (u0Var != null) {
            if (vbVar.f42182o0.isEmpty() && TextUtils.isEmpty(vbVar.f42191v0)) {
                i10 = 8;
            }
            u0Var.setVisibility(i10);
        }
    }

    public static void V(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && vbVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, vbVar.getParentActivity(), vbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            vbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(vbVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(vbVar.getParentActivity(), vbVar.getResourceProvider()), w7.z5.n(-1, 8));
                } else {
                    Activity parentActivity = vbVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, parentActivity, vbVar.getResourceProvider(), z10, z11);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        e1Var.c(vbVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21232q7), vbVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21215p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    e1Var.setOnClickListener(new ci.d6(vbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            eb ebVar = new eb(0, vbVar.X.getContext(), vbVar);
            ebVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            ebVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            fb fbVar = new fb(vbVar, ebVar);
            vbVar.F0 = fbVar;
            fbVar.e = true;
            fbVar.f21581c = 220;
            fbVar.setOutsideTouchable(true);
            vbVar.F0.setClippingEnabled(true);
            vbVar.F0.setAnimationStyle(R.style.PopupContextAnimation);
            vbVar.F0.setFocusable(true);
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            vbVar.F0.setInputMethodMode(2);
            vbVar.F0.setSoftInputMode(48);
            vbVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - ebVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (vbVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - ebVar.getMeasuredWidth()) {
                left = (vbVar.v.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - ebVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                vbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = vbVar.X.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + ebVar.getMeasuredHeight();
            int R = vbVar.X.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y3 = (int) (vbVar.v.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < vbVar.v.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (vbVar.v.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!vbVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            ebVar.setMaxHeight(height - i10);
            vbVar.F0.showAtLocation(vbVar.v, 51, left, i10);
            vbVar.F0.b();
        }
    }

    public static void W(org.telegram.ui.vb r21, int r22, java.util.ArrayList r23, java.lang.Integer r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb.W(org.telegram.ui.vb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(vb vbVar, int i10) {
        int i11;
        bh.f fVar = vbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (w7.j6.a(i10, 4)) {
                ni.e eVar = vbVar.glassEngine;
                oi.a aVar = eVar.f17496r;
                oi.a aVar2 = eVar.f17495q;
                if (aVar == aVar2) {
                    aVar.getClass();
                } else {
                    aVar.f17753b = 0;
                    int i12 = aVar2.f17753b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        RectF rectF = (RectF) aVar2.f17752a.get(i13);
                        aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    }
                }
                float y3 = vbVar.v.getY();
                float width = vbVar.X.getWidth();
                float y10 = vbVar.v.getY() + vbVar.v.getHeight();
                int i14 = 0;
                while (true) {
                    i11 = aVar.f17753b;
                    if (i14 >= i11) {
                        break;
                    }
                    RectF rectF2 = (RectF) aVar.f17752a.get(i14);
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
                ArrayList arrayList = fVar.f4390i;
                fVar.f4391j = i11;
                while (fVar.f4391j > arrayList.size()) {
                    arrayList.add(new bh.e(fVar));
                }
                for (int i15 = 0; i15 < fVar.f4391j; i15++) {
                    bh.e.a((bh.e) arrayList.get(i15), aVar.b(i15));
                }
            }
            sb sbVar = vbVar.X;
            Objects.requireNonNull(sbVar);
            fVar.e(new wa(sbVar, 0), vbVar.X.getWidth(), vbVar.X.getHeight());
        }
    }

    public static void Y(vb vbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = vbVar.f42178k0;
        vbVar.f42188s0 = false;
        vbVar.C0.N = false;
        vbVar.W0(false);
        MessagesController.getInstance(vbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(vbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f20312id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                vbVar.O = Math.min(vbVar.O, tL_channelAdminLogEvent2.f20312id);
                MessageObject messageObject = new MessageObject(vbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, vbVar.f42172f, vbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f20312id))) {
                    vbVar.f42181n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f20312id);
                    z10 = true;
                }
            }
        }
        if (vbVar.E != null && z10) {
            vbVar.R0();
            vbVar.E.l();
        }
    }

    public static void Z(vb vbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = vbVar.f42172f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            vbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            vbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            vbVar.f42189t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = vbVar.getMessagesController().getChatFull(chat.f20280id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = vbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = vbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = vbVar.getMessagesController().telegramAntispamUserId;
                if (vbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f20421id.add(tL_inputUser);
                    ConnectionsManager.getInstance(vbVar.currentAccount).sendRequest(tL_users_getUsers, new xa(vbVar, 1));
                }
                vbVar.f42189t0.add(0, channelParticipant);
            }
            Dialog dialog = vbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).T(vbVar.f42189t0);
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

    public static org.telegram.ui.ActionBar.k a0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static CharSequence a1(SpannableStringBuilder spannableStringBuilder) {
        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilder, "\n\n");
        if (charSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static org.telegram.ui.ActionBar.k b0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k d0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k f0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k g0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k j0(vb vbVar) {
        return vbVar.actionBar;
    }

    public static int l0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int m0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int n0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int o0(vb vbVar) {
        return vbVar.classGuid;
    }

    public static void p0(org.telegram.ui.vb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb.p0(org.telegram.ui.vb, android.os.Bundle, long):void");
    }

    public static int q0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int r0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int s0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int t0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int u0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static void v0(vb vbVar, MessageObject messageObject) {
        if (vbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        vbVar.showDialog(b2Var);
    }

    public static int w0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int x0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int y0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static int z0(vb vbVar) {
        return vbVar.classGuid;
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f42182o0;
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
            tL_message.dialog_id = -this.f42172f.f20280id;
            tL_message.f20301id = -1;
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
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new k2.f(2)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                vb vbVar = vb.this;
                vbVar.getClass();
                if (l4.longValue() < 0) {
                    TLRPC.Chat chat = vbVar.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(vbVar.getMessagesController().getUser(l4));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new bb(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            n01 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new n01(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.p6 p6Var = S0.f39389a;
                p6Var.x(bold);
                p6Var.w(AndroidUtilities.dp(10.0f));
                if (S0.f39391c != -1) {
                    S0.f39391c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.p6 p6Var2 = S0.f39389a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                p6Var2.t(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) i2.e.h(1, arrayList);
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

    public final void O0(boolean z10) {
        int abs;
        hg.a0 a0Var = this.f42194x;
        if (a0Var != null && !this.f42176i0) {
            int L0 = a0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f42194x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f42186r0 && !this.f42184q0) {
                    U0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f42170d0 == null) {
            m0 m0Var = new m0(this, getParentActivity(), 4);
            this.f42170d0 = m0Var;
            m0Var.setOutlineProvider(new ci.o1(8));
            this.f42170d0.setClipToOutline(true);
            this.f42170d0.setWillNotDraw(false);
            this.f42170d0.setVisibility(4);
            o4 o4Var = new o4(getParentActivity());
            this.f42171e0 = o4Var;
            o4Var.setBackgroundColor(0);
            if (z10) {
                this.f42170d0.addView(this.f42171e0, w7.z5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f42173f0 = textureView;
            textureView.setOpaque(false);
            this.f42171e0.addView(this.f42173f0, w7.z5.c(-1.0f, -1));
        }
        if (this.f42170d0.getParent() == null) {
            sb sbVar = this.X;
            m0 m0Var2 = this.f42170d0;
            int i10 = AndroidUtilities.roundMessageSize;
            sbVar.addView(m0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f42170d0.setVisibility(4);
        this.f42171e0.setDrawingReady(false);
        return this.f42173f0;
    }

    public final void R0() {
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
            ArrayList arrayList4 = this.f42181n0;
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
                        MessageObject messageObject3 = (MessageObject) i2.e.h(1, arrayList3);
                        if (TextUtils.isEmpty(this.f42191v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f42183p0;
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
                            rb rbVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            rbVar.m(i10 + size);
                            rb rbVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            rbVar2.m(size + i11 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) i2.e.h(1, arrayList5);
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
                ArrayList arrayList6 = this.f42182o0;
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
                    this.R.addListener(new m.a(this, 20));
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
        rb rbVar;
        if (!this.f42186r0) {
            ArrayList arrayList = this.f42181n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f42180n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f42178k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f42186r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f42172f);
            tL_channels_getAdminLog.f20315q = this.f42191v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f42190u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f42193w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f42193w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f42193w0.n(i10)));
                }
            }
            b1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new xa(this, 3));
            if (z10 && (rbVar = this.E) != null) {
                rbVar.l();
            }
        }
    }

    public final void V0() {
        if (this.f42188s0) {
            return;
        }
        this.f42188s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f42172f);
        tL_channels_getAdminLog.f20315q = this.f42191v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f42190u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f42193w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f42193w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f42193w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new xa(this, 0));
    }

    public final void W0(boolean z10) {
        int i10;
        long j10;
        kb kbVar = this.v;
        if (kbVar != null && this.f42194x != null && kbVar.getChildCount() > 0) {
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
                    j10 = u1Var.getMessageObject().eventId;
                } else if (u1Var instanceof org.telegram.ui.Cells.w0) {
                    j10 = u1Var.getMessageObject().eventId;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
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
            if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.J0) != null && (textLayoutBlocks = u1Var.f23254c4) != null) {
                i10 = (int) u1Var.f23449q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var2 = this.J0;
                if (u1Var2 != null && u1Var2.f23491t1) {
                    i10 = u1Var2.f23391m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = this.J0;
            if (u1Var3 != null) {
                u1Var3.f23564xe = 0;
                u1Var3.f23578ye = null;
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
                u1Var4.f23564xe = 0;
                u1Var4.f23578ye = null;
            }
        }
        return 0;
    }

    public final void Y0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb.Y0(org.telegram.messenger.MessageObject):void");
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f42191v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f42193w0 == null && this.f42190u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f42172f.megagroup) {
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
        kb kbVar = this.v;
        if (kbVar == null) {
            return;
        }
        int childCount = kbVar.getChildCount();
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
                v1Var.f23629f = y3;
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
                if (this.f42170d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = u1Var2.getPhotoImage();
                    this.f42170d0.setTranslationX(photoImage.getImageX());
                    this.f42170d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f42170d0.invalidate();
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
                lb lbVar = this.C0;
                if ((lbVar == null || (!lbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
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
        m0 m0Var = this.f42170d0;
        if (m0Var != null) {
            if (!z11) {
                m0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
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
        i2.e.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 1));
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, null);
        this.I = ooVar;
        dl dlVar = ooVar.h;
        if (dlVar != null) {
            dlVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        dl dlVar2 = ooVar.f29110r;
        if (dlVar2 != null) {
            dlVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        ooVar.f29103k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.z5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.oo ooVar2 = this.I;
        TLRPC.Chat chat = this.f42172f;
        ooVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        jb jbVar = new jb(this, context);
        this.fragmentView = jbVar;
        this.X = jbVar;
        jbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.V(org.telegram.ui.ActionBar.h6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        eh.e o10 = fh.c.o(this.resourceProvider);
        bh.b bVar = this.f42168c;
        kVar.M(bVar, o10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.z5.e(-1, -2, 17));
        this.H.setOnTouchListener(new di.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.u5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.f21026f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.z5.t(54, 54, 17, 16, 20, 16, -4));
        ai.vd vdVar = new ai.vd(context, 10);
        this.L = vdVar;
        vdVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ai.vd vdVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.h6.f21088ic;
        vdVar2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.z5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        kb kbVar = new kb(this, context);
        this.v = kbVar;
        kbVar.setOnItemClickListener(new g(this, 9));
        this.v.setTag(1);
        this.v.setVerticalScrollBarEnabled(true);
        kb kbVar2 = this.v;
        rb rbVar = new rb(this, context);
        this.E = rbVar;
        kbVar2.setAdapter(rbVar);
        this.v.setClipToPadding(false);
        kb kbVar3 = this.v;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.e;
        kbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        kb kbVar4 = this.v;
        lb lbVar = new lb(this, this.v, this.resourceProvider);
        this.C0 = lbVar;
        kbVar4.setItemAnimator(lbVar);
        this.C0.Q = true;
        this.v.setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(this);
        this.f42194x = a0Var;
        a0Var.j1(1);
        this.f42194x.l1(true);
        this.v.setLayoutManager(this.f42194x);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(this.v, this.f42194x);
        this.f42196y = ml0Var;
        ml0Var.h = new za(this);
        ml0Var.f28552i = this.L0;
        this.X.addView(this.v, w7.z5.c(-1.0f, -1));
        this.v.setOnScrollListener(new k3(this));
        this.glassEngine.a(this.v);
        int i14 = this.f42174g0;
        if (i14 != -1) {
            this.f42194x.h1(i14, this.f42175h0);
            this.f42174g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f42166b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42180n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f42180n, w7.z5.e(-1, -1, 51));
        View view2 = new View(context);
        this.f42185r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.u5(this.f42185r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.f21026f2));
        this.f42180n.addView(this.f42185r, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f42187s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f42187s.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f42180n.addView(this.f42187s, w7.z5.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.M = w0Var;
        w0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.z5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.d6 d6Var = this.resourceProvider;
        kh.e eVar = new kh.e(context, bVar, fh.c.b(d6Var), d6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        kh.e eVar2 = this.G;
        dh.d c10 = eVar2.f15073n.c(eVar2, null, false);
        c10.o(eVar2.f15074r);
        c10.q(AndroidUtilities.dp(22.0f));
        c10.p(AndroidUtilities.dp(6.0f));
        eVar2.f15075s = c10;
        this.X.addView(this.G, w7.z5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final vb f35925b;

            {
                this.f35925b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        vb vbVar = this.f35925b;
                        if (vbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(vbVar, vbVar.f42190u0, vbVar.f42193w0, vbVar.f42172f.megagroup);
                            g0Var.T(vbVar.f42189t0);
                            g0Var.f26457g0 = new za(vbVar);
                            vbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        vb vbVar2 = this.f35925b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar2.getParentActivity());
                        if (vbVar2.f42172f.megagroup) {
                            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                        b2Var.R = string;
                        vbVar2.showDialog(b2Var);
                        return;
                    default:
                        vb vbVar3 = this.f35925b;
                        if (vbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(vbVar3.N.getSearchField());
                            vbVar3.showDialog(org.telegram.ui.Components.f5.o(vbVar3.getParentActivity(), new va(vbVar3, 0), null).f20617a);
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
        this.G.getContainer().addView(this.F, w7.z5.e(-2, -2, 17));
        this.G.f15072f.add(this.F);
        this.G.d(false);
        this.G.f15070b[4] = new View.OnClickListener(this) {
            public final vb f35925b;

            {
                this.f35925b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        vb vbVar = this.f35925b;
                        if (vbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(vbVar, vbVar.f42190u0, vbVar.f42193w0, vbVar.f42172f.megagroup);
                            g0Var.T(vbVar.f42189t0);
                            g0Var.f26457g0 = new za(vbVar);
                            vbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        vb vbVar2 = this.f35925b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar2.getParentActivity());
                        if (vbVar2.f42172f.megagroup) {
                            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                        b2Var.R = string;
                        vbVar2.showDialog(b2Var);
                        return;
                    default:
                        vb vbVar3 = this.f35925b;
                        if (vbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(vbVar3.N.getSearchField());
                            vbVar3.showDialog(org.telegram.ui.Components.f5.o(vbVar3.getParentActivity(), new va(vbVar3, 0), null).f20617a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f42165a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f42165a0.setVisibility(4);
        this.f42165a0.setFocusable(true);
        this.f42165a0.setFocusableInTouchMode(true);
        this.f42165a0.setClickable(true);
        this.f42165a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f42165a0, w7.z5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f42167b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f42167b0.setImageResource(R.drawable.msg_calendar);
        this.f42167b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21372xe, false), PorterDuff.Mode.MULTIPLY));
        this.f42165a0.addView(this.f42167b0, w7.z5.e(48, 48, 53));
        this.f42167b0.setOnClickListener(new View.OnClickListener(this) {
            public final vb f35925b;

            {
                this.f35925b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        vb vbVar = this.f35925b;
                        if (vbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(vbVar, vbVar.f42190u0, vbVar.f42193w0, vbVar.f42172f.megagroup);
                            g0Var.T(vbVar.f42189t0);
                            g0Var.f26457g0 = new za(vbVar);
                            vbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        vb vbVar2 = this.f35925b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar2.getParentActivity());
                        if (vbVar2.f42172f.megagroup) {
                            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                        b2Var.R = string;
                        vbVar2.showDialog(b2Var);
                        return;
                    default:
                        vb vbVar3 = this.f35925b;
                        if (vbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(vbVar3.N.getSearchField());
                            vbVar3.showDialog(org.telegram.ui.Components.f5.o(vbVar3.getParentActivity(), new va(vbVar3, 0), null).f20617a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f42169c0 = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21389ye, false));
        this.f42169c0.setTextSize(15);
        this.f42169c0.setTypeface(AndroidUtilities.bold());
        this.f42165a0.addView(this.f42169c0, w7.z5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f42186r0 && this.f42181n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f42180n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f42180n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        kb kbVar5 = this.v;
        kbVar5.W1 = true;
        kbVar5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f42192w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f42192w, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        b1();
        return this.fragmentView;
    }

    public final void d1() {
        boolean z10;
        kb kbVar = this.v;
        if (kbVar != null) {
            int childCount = kbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.v.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.t()) {
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
                            ya yaVar = this.I0;
                            if (yaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(yaVar);
                            }
                            ya yaVar2 = new ya(this, 0);
                            this.I0 = yaVar2;
                            AndroidUtilities.runOnUIThread(yaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f42191v0)) {
                            u1Var.S3(this.f42191v0);
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
            kb kbVar = this.v;
            if (kbVar != null) {
                kbVar.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f42171e0, this.f42170d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt;
                            MessageObject messageObject4 = u1Var4.getMessageObject();
                            if (this.f42170d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = u1Var4.getPhotoImage();
                                this.f42170d0.setTranslationX(photoImage.getImageX());
                                this.f42170d0.setTranslationY(photoImage.getImageY() + u1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f42170d0.invalidate();
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
                if (this.f42170d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f42170d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            kb kbVar2 = this.v;
            if (kbVar2 != null) {
                int childCount2 = kbVar2.getChildCount();
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
                kb kbVar3 = this.v;
                if (kbVar3 != null) {
                    int childCount3 = kbVar3.getChildCount();
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
                this.f42185r.invalidate();
                ai.vd vdVar = this.L;
                if (vdVar != null) {
                    vdVar.invalidate();
                }
                this.v.f1();
            }
        } else {
            kb kbVar4 = this.v;
            if (kbVar4 != null) {
                int childCount4 = kbVar4.getChildCount();
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
        int i10 = org.telegram.ui.ActionBar.h6.f21273s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21329v8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f21292t8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f20971c2, org.telegram.ui.ActionBar.h6.f20990d2}, org.telegram.ui.ActionBar.h6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21245r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21085i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21103j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21123k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21140l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21159m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21179n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21199o8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21154m3, org.telegram.ui.ActionBar.h6.f21229q3}, null, org.telegram.ui.ActionBar.h6.f21255ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21174n3, org.telegram.ui.ActionBar.h6.f21248r3}, null, org.telegram.ui.ActionBar.h6.f20999dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.h6.f21154m3.k();
        int i13 = org.telegram.ui.ActionBar.h6.f21294ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21229q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.h6.f21194o3.k();
        int i14 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21268s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21194o3, org.telegram.ui.ActionBar.h6.f21268s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21194o3, org.telegram.ui.ActionBar.h6.f21268s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21194o3, org.telegram.ui.ActionBar.h6.f21268s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21194o3, org.telegram.ui.ActionBar.h6.f21268s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21212p3, org.telegram.ui.ActionBar.h6.f21287t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.h6.f21267s2;
        int i15 = org.telegram.ui.ActionBar.h6.f21088ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.h6.f21267s2, null, null, org.telegram.ui.ActionBar.h6.f21107jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21344w4, org.telegram.ui.ActionBar.h6.f21230q4, org.telegram.ui.ActionBar.h6.f21362x4, org.telegram.ui.ActionBar.h6.f21325v4, org.telegram.ui.ActionBar.h6.f21308u4, org.telegram.ui.ActionBar.h6.C4}, null, org.telegram.ui.ActionBar.h6.f21127kc));
        int i16 = org.telegram.ui.ActionBar.h6.f21144lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21163mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21016ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f21053gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21396z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21277sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O3, org.telegram.ui.ActionBar.h6.S3, org.telegram.ui.ActionBar.h6.W3}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P3, org.telegram.ui.ActionBar.h6.T3, org.telegram.ui.ActionBar.h6.X3}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.f21370xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20933a4, org.telegram.ui.ActionBar.h6.f20953b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21009e4}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21028f4}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20973c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20992d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21045g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.h6.f21081i4};
        int i17 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.h6.f21064h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i18 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.J4, null, org.telegram.ui.ActionBar.h6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f21252r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f21235qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.f20951b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21099j4}, null, org.telegram.ui.ActionBar.h6.Gc));
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
        int i20 = org.telegram.ui.ActionBar.h6.f20940ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20960bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20980cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21015eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20942ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21034fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20962bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20982cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21052gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21070hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21017ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21087ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21035fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21106jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21071hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21089id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21236qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21108jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21256rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21128kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21184nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21276sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21202od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21182nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21220pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21143lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21258rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21295tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21314ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21297td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21332vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21316ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21350wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21352wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21387yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21371xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21334vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21404zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21369xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21388yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21405zd));
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21090ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21315uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21109je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21333vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.h6.f21259re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.h6.f21278se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.h6.f21239qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42187s, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42185r, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i21 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42192w, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f42192w;
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f42172f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new xa(this, 4)), this.classGuid);
        setBulletinDelegate(new ei.o8(6));
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
        this.f42195x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        sb sbVar = this.X;
        if (sbVar != null) {
            org.telegram.ui.Components.h91 h91Var = sbVar.v;
            if (h91Var != null) {
                h91Var.c(false);
            }
            sbVar.F = true;
        }
        UndoView undoView = this.f42192w;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42176i0 = true;
        this.f42177j0 = true;
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4489a) {
            c2.b m10 = c2.b.m();
            if (m10.f4489a) {
                int i10 = h5.F;
                ((x4) m10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f42173f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        sb sbVar = this.X;
        if (sbVar != null) {
            org.telegram.ui.Components.h91 h91Var = sbVar.v;
            if (h91Var != null) {
                h91Var.c(true);
            }
            sbVar.F = false;
        }
        this.f42176i0 = false;
        O0(false);
        if (this.f42177j0) {
            this.f42177j0 = false;
            rb rbVar = this.E;
            if (rbVar != null) {
                rbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f42195x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f42195x0.lock();
        }
    }
}
