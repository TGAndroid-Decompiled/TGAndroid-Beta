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
public final class vb extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Cells.t1 J0;
    public ImageView K;
    public int K0;
    public ai.wd L;
    public final ub L0;
    public org.telegram.ui.Cells.v0 M;
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
    public final gh.e f42678a;
    public FrameLayout f42679a0;
    public final bh.b f42680b;
    public ImageView f42681b0;
    public final bh.b f42682c;
    public org.telegram.ui.ActionBar.n5 f42683c0;
    public final bh.f d;
    public l0 f42684d0;
    public final int e;
    public n4 f42685e0;
    public final TLRPC.Chat f42686f;
    public TextureView f42687f0;
    public int f42688g0;
    public final ArrayList h;
    public int f42689h0;
    public boolean f42690i0;
    public boolean f42691j0;
    public final a0.h f42692k0;
    public final a0.h f42693l0;
    public final HashMap m0;
    public FrameLayout f42694n;
    public final ArrayList f42695n0;
    public final ArrayList f42696o0;
    public final HashSet f42697p0;
    public boolean f42698q0;
    public View f42699r;
    public boolean f42700r0;
    public RadialProgressView f42701s;
    public boolean f42702s0;
    public ArrayList f42703t0;
    public TLRPC.TL_channelAdminLogEventsFilter f42704u0;
    public kb v;
    public String f42705v0;
    public UndoView f42706w;
    public a0.h f42707w0;
    public hg.a0 f42708x;
    public final AnimationNotificationsLocker f42709x0;
    public org.telegram.ui.Components.pl0 f42710y;
    public final HashMap f42711y0;
    public HashMap f42712z0;

    public vb(TLRPC.Chat chat) {
        super(null);
        int dp;
        int dp2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f42688g0 = -1;
        this.f42689h0 = 0;
        this.f42690i0 = true;
        this.f42691j0 = false;
        this.f42692k0 = new a0.h();
        this.f42693l0 = new a0.h();
        this.m0 = new HashMap();
        this.f42695n0 = new ArrayList();
        this.f42696o0 = new ArrayList();
        this.f42697p0 = new HashSet();
        this.f42704u0 = null;
        this.f42705v0 = "";
        this.f42709x0 = new AnimationNotificationsLocker(R0);
        this.f42711y0 = new HashMap();
        this.B0 = new hb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new ub(this);
        this.N0 = -1;
        this.P0 = new RectF();
        ni.e eVar = this.glassEngine;
        eVar.f17545a = new za(this);
        eVar.e = new oi.b(AndroidUtilities.dp(48.0f));
        ?? obj = new Object();
        this.f42678a = obj;
        bh.b bVar = new bh.b(obj);
        this.f42680b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.d = fVar;
            gh.d dVar = new gh.d(obj);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f11078f = obj;
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f11078f = obj;
                bh.b bVar2 = new bh.b(dVar2);
                this.f42682c = bVar2;
                bVar2.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(48.0f);
                }
                bVar2.f4363b = dp2;
                bVar2.f4364c = dp2;
                bVar2.f4367i = LiteMode.isEnabled(262144);
                this.e = 0;
            } else {
                bh.b bVar3 = new bh.b(dVar);
                this.f42682c = bVar3;
                bVar3.h = this.glassEngine;
                if (LiteMode.isEnabled(262144)) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                bVar3.f4363b = dp;
                bVar3.f4364c = dp;
                this.e = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            bh.b bVar4 = new bh.b(obj);
            this.f42682c = bVar4;
            bVar4.h = this.glassEngine;
        }
        this.f42686f = chat;
    }

    public static void A0(vb vbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = vbVar.getMessagesController();
        TLRPC.Chat chat = vbVar.f42686f;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f20343id);
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(vbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, vbVar, chatFull.f20344id, false, ChatObject.isChannel(chat));
        m70Var.f28587j0 = new ib(vbVar);
        m70Var.show();
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
        if (vbVar.v != null && !vbVar.f42695n0.isEmpty()) {
            vbVar.f42708x.h1(vbVar.f42696o0.size() - 1, (-100000) - vbVar.v.getPaddingTop());
        }
    }

    public static int L0(vb vbVar) {
        return vbVar.currentAccount;
    }

    public static r01 S0(CharSequence charSequence) {
        org.telegram.ui.Components.xq[] xqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.xq xqVar : (org.telegram.ui.Components.xq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.xq.class)) {
                if (xqVar != null) {
                    Drawable drawable = xqVar.drawable;
                    if (drawable instanceof r01) {
                        return (r01) drawable;
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
        a0.h hVar = vbVar.f42692k0;
        int i10 = 0;
        vbVar.C0.N = false;
        vbVar.W0(false);
        MessagesController.getInstance(vbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(vbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = vbVar.f42695n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f20375id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                vbVar.O = Math.min(vbVar.O, tL_channelAdminLogEvent.f20375id);
                MessageObject messageObject2 = new MessageObject(vbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42686f, vbVar.T, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f20375id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                vbVar.f42693l0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(vbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -vbVar.f42686f.f20343id, 0, 0L, new ya(vbVar, 1), vbVar.getClassGuid(), null);
        }
        vbVar.R0();
        vbVar.f42700r0 = false;
        if (!z10) {
            vbVar.f42698q0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(vbVar.f42694n, false, 0.3f, true);
        vbVar.v.setEmptyView(vbVar.H);
        rb rbVar = vbVar.E;
        if (rbVar != null) {
            rbVar.l();
        }
        org.telegram.ui.ActionBar.u0 u0Var = vbVar.N;
        if (u0Var != null) {
            if (vbVar.f42696o0.isEmpty() && TextUtils.isEmpty(vbVar.f42705v0)) {
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
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, vbVar.getResourceProvider());
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
                    e1Var.j((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        e1Var.d(vbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21421q7), vbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21404p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    e1Var.setOnClickListener(new ci.c6(vbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
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
            fbVar.f21631c = 220;
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
            int Q = vbVar.X.Q();
            if (Q > AndroidUtilities.dp(20.0f)) {
                height += Q;
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
                oi.a aVar = eVar.f17559r;
                oi.a aVar2 = eVar.f17558q;
                if (aVar == aVar2) {
                    aVar.getClass();
                } else {
                    aVar.f17816b = 0;
                    int i12 = aVar2.f17816b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        RectF rectF = (RectF) aVar2.f17815a.get(i13);
                        aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    }
                }
                float y3 = vbVar.v.getY();
                float width = vbVar.X.getWidth();
                float y10 = vbVar.v.getY() + vbVar.v.getHeight();
                int i14 = 0;
                while (true) {
                    i11 = aVar.f17816b;
                    if (i14 >= i11) {
                        break;
                    }
                    RectF rectF2 = (RectF) aVar.f17815a.get(i14);
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
                ArrayList arrayList = fVar.f4393i;
                fVar.f4394j = i11;
                while (fVar.f4394j > arrayList.size()) {
                    arrayList.add(new bh.e(fVar));
                }
                for (int i15 = 0; i15 < fVar.f4394j; i15++) {
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
        a0.h hVar = vbVar.f42692k0;
        vbVar.f42702s0 = false;
        vbVar.C0.N = false;
        vbVar.W0(false);
        MessagesController.getInstance(vbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(vbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f20375id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                vbVar.O = Math.min(vbVar.O, tL_channelAdminLogEvent2.f20375id);
                MessageObject messageObject = new MessageObject(vbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, vbVar.f42686f, vbVar.T, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f20375id))) {
                    vbVar.f42695n0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f20375id);
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
        TLRPC.Chat chat = vbVar.f42686f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            vbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            vbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            vbVar.f42703t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = vbVar.getMessagesController().getChatFull(chat.f20343id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = vbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = vbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = vbVar.getMessagesController().telegramAntispamUserId;
                if (vbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f20484id.add(tL_inputUser);
                    ConnectionsManager.getInstance(vbVar.currentAccount).sendRequest(tL_users_getUsers, new xa(vbVar, 1));
                }
                vbVar.f42703t0.add(0, channelParticipant);
            }
            Dialog dialog = vbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.g0) {
                ((org.telegram.ui.Components.g0) dialog).S(vbVar.f42703t0);
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
            if (!com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
        }
        return spannableStringBuilder;
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        vbVar.showDialog(c2Var);
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
            ArrayList arrayList2 = this.f42696o0;
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
            tL_message.dialog_id = -this.f42686f.f20343id;
            tL_message.f20364id = -1;
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
            r01 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new r01(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.p6 p6Var = S0.f40959a;
                p6Var.x(bold);
                p6Var.w(AndroidUtilities.dp(10.0f));
                if (S0.f40961c != -1) {
                    S0.f40961c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.p6 p6Var2 = S0.f40959a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                p6Var2.t(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) i2.o1.i(1, arrayList);
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
        hg.a0 a0Var = this.f42708x;
        if (a0Var != null && !this.f42690i0) {
            int L0 = a0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f42708x.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f42700r0 && !this.f42698q0) {
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
        if (this.f42684d0 == null) {
            l0 l0Var = new l0(this, getParentActivity(), 4);
            this.f42684d0 = l0Var;
            l0Var.setOutlineProvider(new ci.n1(8));
            this.f42684d0.setClipToOutline(true);
            this.f42684d0.setWillNotDraw(false);
            this.f42684d0.setVisibility(4);
            n4 n4Var = new n4(getParentActivity());
            this.f42685e0 = n4Var;
            n4Var.setBackgroundColor(0);
            if (z10) {
                this.f42684d0.addView(this.f42685e0, w7.z5.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f42687f0 = textureView;
            textureView.setOpaque(false);
            this.f42685e0.addView(this.f42687f0, w7.z5.c(-1.0f, -1));
        }
        if (this.f42684d0.getParent() == null) {
            sb sbVar = this.X;
            l0 l0Var2 = this.f42684d0;
            int i10 = AndroidUtilities.roundMessageSize;
            sbVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f42684d0.setVisibility(4);
        this.f42685e0.setDrawingReady(false);
        return this.f42687f0;
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
            ArrayList arrayList4 = this.f42695n0;
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
                        MessageObject messageObject3 = (MessageObject) i2.o1.i(1, arrayList3);
                        if (TextUtils.isEmpty(this.f42705v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f42697p0;
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
                        MessageObject messageObject4 = (MessageObject) i2.o1.i(1, arrayList5);
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
                ArrayList arrayList6 = this.f42696o0;
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
        if (!this.f42700r0) {
            ArrayList arrayList = this.f42695n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f42694n;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.H.setVisibility(4);
                    this.v.setEmptyView(null);
                }
                this.f42692k0.b();
                arrayList.clear();
                this.m0.clear();
                R0();
            }
            this.f42700r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f42686f);
            tL_channels_getAdminLog.f20378q = this.f42705v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f42704u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f42707w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f42707w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f42707w0.n(i10)));
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
        if (this.f42702s0) {
            return;
        }
        this.f42702s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f42686f);
        tL_channels_getAdminLog.f20378q = this.f42705v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f42704u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f42707w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f42707w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f42707w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new xa(this, 0));
    }

    public final void W0(boolean z10) {
        int i10;
        long j10;
        kb kbVar = this.v;
        if (kbVar != null && this.f42708x != null && kbVar.getChildCount() > 0) {
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
                    j10 = t1Var.getMessageObject().eventId;
                } else if (t1Var instanceof org.telegram.ui.Cells.v0) {
                    j10 = t1Var.getMessageObject().eventId;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
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
            if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.J0) != null && (textLayoutBlocks = t1Var.f23341c4) != null) {
                i10 = (int) t1Var.f23536q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var2 = this.J0;
                if (t1Var2 != null && t1Var2.f23578t1) {
                    i10 = t1Var2.f23478m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = this.J0;
            if (t1Var3 != null) {
                t1Var3.f23651xe = 0;
                t1Var3.f23665ye = null;
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
                t1Var4.f23651xe = 0;
                t1Var4.f23665ye = null;
            }
        }
        return 0;
    }

    public final void Y0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb.Y0(org.telegram.messenger.MessageObject):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.De));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21428qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21467se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21448re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21522vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21298je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21504uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21279ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21129ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21594zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21577yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21593zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21523vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21560xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21541wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21505ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21521vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21486td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21503ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21484tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21447rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21332lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21409pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21371nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21391od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21465sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21373nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21317kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21445rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21297jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21425qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21278id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21260hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21259hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21241gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21171cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21151bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21223fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21131ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21204eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Za));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ya));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21424qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21441r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Va));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ua));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21559xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21466sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21242gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21205ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21352mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21333lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21316kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21296jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21483ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21188dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21444ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21388o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21368n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21348m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21329l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21312k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21292j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21274i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    public final void b1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f42705v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.L.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f42707w0 == null && this.f42704u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f42686f.megagroup) {
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
        org.telegram.ui.Cells.v0 v0Var;
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
        org.telegram.ui.Cells.t1 t1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.v.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                u1Var.f23724f = y3;
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
                t1Var2.a4(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.v.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = t1Var2.getMessageObject();
                if (this.f42684d0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    this.f42684d0.setTranslationX(photoImage.getImageX());
                    this.f42684d0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f42684d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) childAt;
                v0Var2.Z((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (v0Var2.J()) {
                    v0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.v.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        t1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                lb lbVar = this.C0;
                if ((lbVar == null || (!lbVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        l0 l0Var = this.f42684d0;
        if (l0Var != null) {
            if (!z11) {
                l0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
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
                messageObject = ((org.telegram.ui.Cells.v0) t1Var).getMessageObject();
            }
            this.M.W(messageObject.messageOwner.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.t1) && !(view2 instanceof org.telegram.ui.Cells.v0)) {
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
                this.M.setTranslationY(((-v0Var.getMeasuredHeight()) * 2) + bottom2);
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
        org.telegram.ui.ActionBar.k6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 1));
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, null);
        this.I = ooVar;
        el elVar = ooVar.h;
        if (elVar != null) {
            elVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        el elVar2 = ooVar.f29269r;
        if (elVar2 != null) {
            elVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        ooVar.f29262k0 = true;
        this.I.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.I, 0, w7.z5.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.oo ooVar2 = this.I;
        TLRPC.Chat chat = this.f42686f;
        ooVar2.setTitle(chat.title);
        this.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.I.setChatAvatar(chat);
        jb jbVar = new jb(this, context);
        this.fragmentView = jbVar;
        this.X = jbVar;
        jbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.X.U(org.telegram.ui.ActionBar.k6.s0());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        eh.e o10 = fh.c.o(this.resourceProvider);
        bh.b bVar = this.f42682c;
        kVar.L(bVar, o10, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.z5.e(-1, -2, 17));
        this.H.setOnTouchListener(new di.d(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.x5(this.L, this.X, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.f21215f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(R.drawable.large_log_actions);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.z5.t(54, 54, 17, 16, 20, 16, -4));
        ai.wd wdVar = new ai.wd(context, 10);
        this.L = wdVar;
        wdVar.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ai.wd wdVar2 = this.L;
        int i11 = org.telegram.ui.ActionBar.k6.f21277ic;
        org.telegram.ui.ActionBar.r6.W(wdVar2, i11, null);
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.J.addView(this.L, w7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.z5.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        kb kbVar = new kb(this, context);
        this.v = kbVar;
        kbVar.setOnItemClickListener(new f(this, 9));
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
        this.f42708x = a0Var;
        a0Var.j1(1);
        this.f42708x.l1(true);
        this.v.setLayoutManager(this.f42708x);
        org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(this.v, this.f42708x);
        this.f42710y = pl0Var;
        pl0Var.h = new za(this);
        pl0Var.f29593i = this.L0;
        this.X.addView(this.v, w7.z5.c(-1.0f, -1));
        this.v.setOnScrollListener(new j3(this));
        this.glassEngine.a(this.v);
        int i14 = this.f42688g0;
        if (i14 != -1) {
            this.f42708x.h1(i14, this.f42689h0);
            this.f42688g0 = -1;
        }
        ?? view = new View(context);
        this.W = view;
        view.setup(this.f42680b);
        this.W.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.W.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.W.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.W.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.X.addView(this.W, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42694n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f42694n, w7.z5.e(-1, -1, 51));
        View view2 = new View(context);
        this.f42699r = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.x5(this.f42699r, this.X, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.f21215f2));
        this.f42694n.addView(this.f42699r, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f42701s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f42701s.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f42694n.addView(this.f42701s, w7.z5.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.M = v0Var;
        v0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.z5.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        kh.e eVar = new kh.e(context, bVar, fh.c.b(g6Var), g6Var);
        this.G = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.G.c(4, true, false);
        kh.e eVar2 = this.G;
        dh.d c10 = eVar2.f15119n.c(eVar2, null, false);
        c10.o(eVar2.f15120r);
        c10.q(AndroidUtilities.dp(22.0f));
        c10.p(AndroidUtilities.dp(6.0f));
        eVar2.f15121s = c10;
        this.X.addView(this.G, w7.z5.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final vb f36319b;

            {
                this.f36319b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        vb vbVar = this.f36319b;
                        if (vbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(vbVar, vbVar.f42704u0, vbVar.f42707w0, vbVar.f42686f.megagroup);
                            g0Var.S(vbVar.f42703t0);
                            g0Var.f26490g0 = new za(vbVar);
                            vbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        vb vbVar2 = this.f36319b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar2.getParentActivity());
                        if (vbVar2.f42686f.megagroup) {
                            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.R = string;
                        vbVar2.showDialog(c2Var);
                        return;
                    default:
                        vb vbVar3 = this.f36319b;
                        if (vbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(vbVar3.N.getSearchField());
                            vbVar3.showDialog(org.telegram.ui.Components.f5.p(vbVar3.getParentActivity(), new va(vbVar3, 0), null).f20728a);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.W(this.F, org.telegram.ui.ActionBar.k6.Ae, null);
        this.F.setText(LocaleController.getString(R.string.SETTINGS));
        this.F.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.z5.e(-2, -2, 17));
        this.G.f15118f.add(this.F);
        this.G.d(false);
        this.G.f15116b[4] = new View.OnClickListener(this) {
            public final vb f36319b;

            {
                this.f36319b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        vb vbVar = this.f36319b;
                        if (vbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(vbVar, vbVar.f42704u0, vbVar.f42707w0, vbVar.f42686f.megagroup);
                            g0Var.S(vbVar.f42703t0);
                            g0Var.f26490g0 = new za(vbVar);
                            vbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        vb vbVar2 = this.f36319b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar2.getParentActivity());
                        if (vbVar2.f42686f.megagroup) {
                            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.R = string;
                        vbVar2.showDialog(c2Var);
                        return;
                    default:
                        vb vbVar3 = this.f36319b;
                        if (vbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(vbVar3.N.getSearchField());
                            vbVar3.showDialog(org.telegram.ui.Components.f5.p(vbVar3.getParentActivity(), new va(vbVar3, 0), null).f20728a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f42679a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f42679a0.setVisibility(4);
        this.f42679a0.setFocusable(true);
        this.f42679a0.setFocusableInTouchMode(true);
        this.f42679a0.setClickable(true);
        this.f42679a0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.X.addView(this.f42679a0, w7.z5.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f42681b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f42681b0.setImageResource(R.drawable.msg_calendar);
        org.telegram.ui.ActionBar.r6.t(this.f42681b0, org.telegram.ui.ActionBar.k6.f21561xe, null, PorterDuff.Mode.MULTIPLY);
        this.f42679a0.addView(this.f42681b0, w7.z5.e(48, 48, 53));
        this.f42681b0.setOnClickListener(new View.OnClickListener(this) {
            public final vb f36319b;

            {
                this.f36319b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        vb vbVar = this.f36319b;
                        if (vbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(vbVar, vbVar.f42704u0, vbVar.f42707w0, vbVar.f42686f.megagroup);
                            g0Var.S(vbVar.f42703t0);
                            g0Var.f26490g0 = new za(vbVar);
                            vbVar.showDialog(g0Var);
                            return;
                        }
                        return;
                    case 1:
                        vb vbVar2 = this.f36319b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar2.getParentActivity());
                        if (vbVar2.f42686f.megagroup) {
                            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        c2Var.R = string;
                        vbVar2.showDialog(c2Var);
                        return;
                    default:
                        vb vbVar3 = this.f36319b;
                        if (vbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(vbVar3.N.getSearchField());
                            vbVar3.showDialog(org.telegram.ui.Components.f5.p(vbVar3.getParentActivity(), new va(vbVar3, 0), null).f20728a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f42683c0 = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21578ye, null);
        this.f42683c0.setTextSize(15);
        this.f42683c0.setTypeface(AndroidUtilities.bold());
        this.f42679a0.addView(this.f42683c0, w7.z5.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f42700r0 && this.f42695n0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f42694n, true, 0.3f, true);
            this.v.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f42694n, false, 0.3f, true);
            this.v.setEmptyView(this.H);
        }
        kb kbVar5 = this.v;
        kbVar5.W1 = true;
        kbVar5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f42706w = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.X.addView(this.f42706w, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            t1Var.setDrawSelectionBackground(false);
                            t1Var.I3(false, true);
                            t1Var.K3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.getRealId() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            ya yaVar = this.I0;
                            if (yaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(yaVar);
                            }
                            ya yaVar2 = new ya(this, 0);
                            this.I0 = yaVar2;
                            AndroidUtilities.runOnUIThread(yaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f42705v0)) {
                            t1Var.R3(this.f42705v0);
                        } else {
                            t1Var.R3(null);
                        }
                        if (this.v.getScrollState() == 0) {
                            z11 = false;
                        }
                        t1Var.setSpoilersSuppressed(z11);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.t1 t1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var3;
        MessageObject messageObject3;
        boolean z10;
        if (i10 == NotificationCenter.emojiLoaded) {
            kb kbVar = this.v;
            if (kbVar != null) {
                kbVar.g1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f42685e0, this.f42684d0, true);
                int childCount = this.v.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.v.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt;
                            MessageObject messageObject4 = t1Var4.getMessageObject();
                            if (this.f42684d0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = t1Var4.getPhotoImage();
                                this.f42684d0.setTranslationX(photoImage.getImageX());
                                this.f42684d0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f42684d0.invalidate();
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
                if (this.f42684d0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f42684d0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
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
                    if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject3 = (t1Var3 = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null) {
                        if (!messageObject3.isVoice() && !messageObject3.isMusic()) {
                            if (messageObject3.isRoundVideo()) {
                                t1Var3.d1(null, false);
                                if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                    messageObject3.resetPlayingProgress();
                                    t1Var3.invalidate();
                                }
                            }
                        } else {
                            t1Var3.l4(false, true, false);
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
                        if ((childAt3 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = (t1Var2 = (org.telegram.ui.Cells.t1) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                            MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject2 != null) {
                                messageObject2.audioProgress = playingMessageObject2.audioProgress;
                                messageObject2.audioProgressSec = playingMessageObject2.audioProgressSec;
                                messageObject2.audioPlayerDuration = playingMessageObject2.audioPlayerDuration;
                                t1Var2.p4();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.didSetNewWallpapper && this.fragmentView != null) {
                this.X.U(org.telegram.ui.ActionBar.k6.s0());
                this.f42699r.invalidate();
                ai.wd wdVar = this.L;
                if (wdVar != null) {
                    wdVar.invalidate();
                }
                this.v.g1();
            }
        } else {
            kb kbVar4 = this.v;
            if (kbVar4 != null) {
                int childCount4 = kbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.v.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt4).getMessageObject()) != null) {
                        if (!messageObject.isVoice() && !messageObject.isMusic()) {
                            if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                                t1Var.d1(null, true);
                            }
                        } else {
                            t1Var.l4(false, true, false);
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21149bb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21169cb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21206ed));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21276ib));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21224fd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21295jb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21539wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21576yb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21558xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pe));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fe));
        View view = this.f42699r;
        int i10 = org.telegram.ui.ActionBar.k6.f21333lc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f42706w;
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
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        U0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f42686f);
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
        this.f42709x0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        sb sbVar = this.X;
        if (sbVar != null) {
            org.telegram.ui.Components.o91 o91Var = sbVar.v;
            if (o91Var != null) {
                o91Var.c(false);
            }
            sbVar.F = true;
        }
        UndoView undoView = this.f42706w;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f42690i0 = true;
        this.f42691j0 = true;
        c2.b bVar = c2.b.e;
        if (bVar != null && bVar.f4493a) {
            c2.b m10 = c2.b.m();
            if (m10.f4493a) {
                int i10 = g5.F;
                ((w4) m10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f42687f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        sb sbVar = this.X;
        if (sbVar != null) {
            org.telegram.ui.Components.o91 o91Var = sbVar.v;
            if (o91Var != null) {
                o91Var.c(true);
            }
            sbVar.F = false;
        }
        this.f42690i0 = false;
        O0(false);
        if (this.f42691j0) {
            this.f42691j0 = false;
            rb rbVar = this.E;
            if (rbVar != null) {
                rbVar.l();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f42701s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21277ic, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f42709x0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f42709x0.lock();
        }
    }
}
