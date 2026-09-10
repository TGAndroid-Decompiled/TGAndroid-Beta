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
public final class wb extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static int X0 = 10;
    public static final int[] Y0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public a0.i A0;
    public final AnimationNotificationsLocker B0;
    public final HashMap C0;
    public HashMap D0;
    public lb E;
    public boolean E0;
    public UndoView F;
    public final ib F0;
    public fg.a0 G;
    public mb G0;
    public org.telegram.ui.Components.yk0 H;
    public final ArrayList H0;
    public sb I;
    public final a0.i I0;
    public TextView J;
    public gb J0;
    public ih.e K;
    public int K0;
    public FrameLayout L;
    public int L0;
    public org.telegram.ui.Components.jo M;
    public ya M0;
    public LinearLayout N;
    public org.telegram.ui.Cells.t1 N0;
    public ImageView O;
    public int O0;
    public di.h P;
    public final vb P0;
    public org.telegram.ui.Cells.w0 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.w0 R;
    public int R0;
    public long S;
    public int S0;
    public boolean T;
    public xf.c0 T0;
    public boolean U;
    public final ArrayList U0;
    public AnimatorSet V;
    public final ArrayList V0;
    public boolean W;
    public final RectF W0;
    public final int[] X;
    public boolean Y;
    public boolean Z;
    public final eh.e f37789a;
    public ih.f f37790a0;
    public final zg.a f37791b;
    public tb f37792b0;
    public final eh.d f37793c;
    public MessageObject f37794c0;
    public final eh.d d;
    public TLRPC.ChannelParticipant f37795d0;
    public final zg.a e;
    public FrameLayout f37796e0;
    public final zg.a f37797f;
    public ImageView f37798f0;
    public org.telegram.ui.ActionBar.l5 f37799g0;
    public final pe.b h;
    public k0 f37800h0;
    public m4 f37801i0;
    public TextureView f37802j0;
    public int f37803k0;
    public int f37804l0;
    public boolean m0;
    public final zg.e f37805n;
    public boolean f37806n0;
    public final a0.i f37807o0;
    public final a0.i f37808p0;
    public final HashMap f37809q0;
    public final int f37810r;
    public final ArrayList f37811r0;
    public final TLRPC.Chat f37812s;
    public final ArrayList f37813s0;
    public final HashSet f37814t0;
    public boolean f37815u0;
    public final ArrayList v;
    public boolean f37816v0;
    public FrameLayout f37817w;
    public boolean f37818w0;
    public View f37819x;
    public ArrayList f37820x0;
    public RadialProgressView f37821y;
    public TLRPC.TL_channelAdminLogEventsFilter f37822y0;
    public String f37823z0;

    public wb(TLRPC.Chat chat) {
        super(null);
        pe.b bVar = new pe.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.X = new int[]{2};
        this.f37803k0 = -1;
        this.f37804l0 = 0;
        this.m0 = true;
        this.f37806n0 = false;
        this.f37807o0 = new a0.i();
        this.f37808p0 = new a0.i();
        this.f37809q0 = new HashMap();
        this.f37811r0 = new ArrayList();
        this.f37813s0 = new ArrayList();
        this.f37814t0 = new HashSet();
        this.f37822y0 = null;
        this.f37823z0 = "";
        this.B0 = new AnimationNotificationsLocker(Y0);
        this.C0 = new HashMap();
        this.F0 = new ib(this);
        this.H0 = new ArrayList();
        this.I0 = new a0.i();
        this.K0 = Integer.MAX_VALUE;
        this.L0 = -1;
        this.P0 = new vb(this);
        this.R0 = -1;
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new RectF();
        ?? obj = new Object();
        this.f37789a = obj;
        zg.a aVar = new zg.a(obj);
        this.f37791b = aVar;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            zg.e eVar = new zg.e(false);
            this.f37805n = eVar;
            eh.d dVar = new eh.d(obj);
            this.d = dVar;
            dVar.v = new ya(this, 3);
            dVar.d = eVar;
            dVar.e = -3;
            dVar.f7521f = obj;
            zg.a aVar2 = new zg.a(dVar);
            this.f37797f = aVar2;
            aVar2.f48083f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                eh.d dVar2 = new eh.d(obj);
                this.f37793c = dVar2;
                dVar2.v = new ya(this, 3);
                dVar2.d = eVar;
                dVar2.e = -2;
                dVar2.f7521f = obj;
                zg.a aVar3 = new zg.a(dVar2);
                this.e = aVar3;
                aVar3.f48083f = LiteMode.isEnabled(262144);
                this.f37810r = 0;
            } else {
                this.f37793c = null;
                this.e = aVar2;
                this.f37810r = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.f37805n = null;
            this.f37810r = 0;
            this.f37793c = null;
            this.d = null;
            this.e = new zg.a(obj);
            this.f37797f = new zg.a(obj);
        }
        aVar.f48082c = bVar;
        this.e.f48082c = bVar;
        this.f37797f.f48082c = bVar;
        this.f37812s = chat;
    }

    public static void A0(wb wbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = wbVar.getMessagesController();
        TLRPC.Chat chat = wbVar.f37812s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f17195id);
        org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(wbVar.f37792b0.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, wbVar, chatFull.f17196id, false, ChatObject.isChannel(chat));
        a70Var.f21409j0 = new jb(wbVar);
        a70Var.show();
    }

    public static org.telegram.ui.ActionBar.l G0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l H0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l I0(wb wbVar) {
        return wbVar.actionBar;
    }

    public static void K0(wb wbVar) {
        if (wbVar.E != null && !wbVar.f37811r0.isEmpty()) {
            wbVar.G.h1(wbVar.f37813s0.size() - 1, (-100000) - wbVar.E.getPaddingTop());
        }
    }

    public static int L0(wb wbVar) {
        return wbVar.currentAccount;
    }

    public static q11 S0(CharSequence charSequence) {
        org.telegram.ui.Components.uq[] uqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.uq uqVar : (org.telegram.ui.Components.uq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.uq.class)) {
                if (uqVar != null) {
                    Drawable drawable = uqVar.drawable;
                    if (drawable instanceof q11) {
                        return (q11) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.i iVar = wbVar.f37807o0;
        int i10 = 0;
        wbVar.G0.N = false;
        wbVar.X0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = wbVar.f37811r0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (iVar.h(tL_channelAdminLogEvent.f17227id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.S = Math.min(wbVar.S, tL_channelAdminLogEvent.f17227id);
                MessageObject messageObject2 = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) wbVar.f37809q0, wbVar.f37812s, wbVar.X, false);
                if (messageObject2.contentType >= 0) {
                    iVar.k(messageObject2, tL_channelAdminLogEvent.f17227id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                wbVar.f37808p0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(wbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -wbVar.f37812s.f17195id, 0, 0L, new ya(wbVar, 1), wbVar.getClassGuid(), null);
        }
        wbVar.R0();
        wbVar.f37816v0 = false;
        if (!z10) {
            wbVar.f37815u0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(wbVar.f37817w, false, 0.3f, true);
        wbVar.E.setEmptyView(wbVar.L);
        sb sbVar = wbVar.I;
        if (sbVar != null) {
            sbVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = wbVar.R;
        if (w0Var != null) {
            if (wbVar.f37813s0.isEmpty() && TextUtils.isEmpty(wbVar.f37823z0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && wbVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, wbVar.getParentActivity(), wbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            wbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(wbVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(wbVar.getParentActivity(), wbVar.getResourceProvider()), w7.a6.n(-1, 8));
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
                    g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        g1Var.c(wbVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7), wbVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    g1Var.setOnClickListener(new cb(wbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 0));
                }
                i11++;
                arrayList4 = arrayList;
            }
            fb fbVar = new fb(0, wbVar.f37792b0.getContext(), wbVar);
            fbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            fbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            gb gbVar = new gb(wbVar, fbVar);
            wbVar.J0 = gbVar;
            gbVar.e = true;
            gbVar.f18535c = 220;
            gbVar.setOutsideTouchable(true);
            wbVar.J0.setClippingEnabled(true);
            wbVar.J0.setAnimationStyle(R.style.PopupContextAnimation);
            wbVar.J0.setFocusable(true);
            fbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            wbVar.J0.setInputMethodMode(2);
            wbVar.J0.setSoftInputMode(48);
            wbVar.J0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - fbVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (wbVar.E.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - fbVar.getMeasuredWidth()) {
                left = (wbVar.E.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - fbVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                wbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = wbVar.f37792b0.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + fbVar.getMeasuredHeight();
            int R = wbVar.f37792b0.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y3 = (int) (wbVar.E.getY() + view.getTop() + f10);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < wbVar.E.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (wbVar.E.getY() + AndroidUtilities.dp(24.0f));
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
            wbVar.J0.showAtLocation(wbVar.E, 51, left, i10);
            wbVar.J0.b();
        }
    }

    public static void W(org.telegram.ui.wb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.W(org.telegram.ui.wb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(wb wbVar, int i10) {
        int i11;
        RectF rectF;
        eh.d dVar = wbVar.f37793c;
        eh.d dVar2 = wbVar.d;
        ArrayList arrayList = wbVar.V0;
        zg.e eVar = wbVar.f37805n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            if (w7.c0.a(i10, 2)) {
                ArrayList arrayList2 = wbVar.U0;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, wbVar.f37792b0.getMeasuredWidth(), wbVar.E.getY() + wbVar.E.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.d(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.d(i11, AndroidUtilities.dp(8.0f), arrayList2);
                    }
                } else {
                    i11 = 0;
                }
                int a2 = xf.f0.a(i11, arrayList2, arrayList);
                int measuredWidth = wbVar.f37792b0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.q.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(wbVar.E.getY(), rectF2.top);
                    rectF2.right = w7.q.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(wbVar.E.getY() + wbVar.E.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            tb tbVar = wbVar.f37792b0;
            Objects.requireNonNull(tbVar);
            if (eVar.e(new xa(tbVar, 0), wbVar.f37792b0.getWidth(), wbVar.f37792b0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.l lVar = wbVar.actionBar;
                if (lVar != null) {
                    lVar.invalidate();
                }
                wbVar.f37792b0.invalidate();
                Iterator it = wbVar.h.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    public static void Y(wb wbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.i iVar = wbVar.f37807o0;
        wbVar.f37818w0 = false;
        wbVar.G0.N = false;
        wbVar.X0(false);
        MessagesController.getInstance(wbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(wbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (iVar.h(tL_channelAdminLogEvent2.f17227id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                wbVar.S = Math.min(wbVar.S, tL_channelAdminLogEvent2.f17227id);
                MessageObject messageObject = new MessageObject(wbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, wbVar.f37812s, wbVar.X, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !iVar.d(tL_channelAdminLogEvent2.f17227id))) {
                    wbVar.f37811r0.add(0, messageObject);
                    iVar.k(messageObject, tL_channelAdminLogEvent2.f17227id);
                    z10 = true;
                }
            }
        }
        if (wbVar.I != null && z10) {
            wbVar.R0();
            wbVar.I.l();
        }
    }

    public static void Z(wb wbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = wbVar.f37812s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            wbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            wbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            wbVar.f37820x0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = wbVar.getMessagesController().getChatFull(chat.f17195id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = wbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = wbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j3 = wbVar.getMessagesController().telegramAntispamUserId;
                if (wbVar.getMessagesController().getUser(Long.valueOf(j3)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j3;
                    tL_users_getUsers.f17336id.add(tL_inputUser);
                    ConnectionsManager.getInstance(wbVar.currentAccount).sendRequest(tL_users_getUsers, new sa(wbVar, 2));
                }
                wbVar.f37820x0.add(0, channelParticipant);
            }
            Dialog dialog = wbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).S(wbVar.f37820x0);
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
            if (!com.google.android.gms.internal.vision.e2.u(spannableStringBuilder)) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
            }
            ah.b.j();
            spannableStringBuilder.setSpan(ah.b.g(AndroidUtilities.dp(8.0f)), charSequenceIndexOf + 1, charSequenceIndexOf + 2, 33);
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            d2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            d2Var.T = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        wbVar.showDialog(d2Var);
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
            ArrayList arrayList2 = this.f37813s0;
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
            tL_message.dialog_id = -this.f37812s.f17195id;
            tL_message.f17216id = -1;
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
        }).filter(new bb(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z11 && arrayList.size() > 1) {
            q11 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z10) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new q11(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.n6 n6Var = S0.f35950a;
                n6Var.u(bold);
                n6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f35952c != -1) {
                    S0.f35952c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.n6 n6Var2 = S0.f35950a;
                if (z10) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                n6Var2.q(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) hc.b.i(1, arrayList);
        }
        if (messageObject != null) {
            long j11 = messageObject.eventId;
            a0.i iVar = this.I0;
            if (!iVar.d(j11)) {
                long j12 = messageObject.eventId;
                int i13 = X0;
                X0 = i13 + 1;
                iVar.k(Integer.valueOf(i13), j12);
            }
            messageObject2.stableId = ((Integer) iVar.f(messageObject.eventId)).intValue();
        }
        return messageObject2;
    }

    public final void O0(boolean z10) {
        int abs;
        fg.a0 a0Var = this.G;
        if (a0Var != null && !this.m0) {
            int L0 = a0Var.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.G.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.I.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f37816v0 && !this.f37815u0) {
                    V0(false);
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
        if (this.f37800h0 == null) {
            k0 k0Var = new k0(this, getParentActivity(), 4);
            this.f37800h0 = k0Var;
            k0Var.setOutlineProvider(new bi.g(7));
            this.f37800h0.setClipToOutline(true);
            this.f37800h0.setWillNotDraw(false);
            this.f37800h0.setVisibility(4);
            m4 m4Var = new m4(getParentActivity());
            this.f37801i0 = m4Var;
            m4Var.setBackgroundColor(0);
            if (z10) {
                this.f37800h0.addView(this.f37801i0, w7.a6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f37802j0 = textureView;
            textureView.setOpaque(false);
            this.f37801i0.addView(this.f37802j0, w7.a6.c(-1.0f, -1));
        }
        if (this.f37800h0.getParent() == null) {
            tb tbVar = this.f37792b0;
            k0 k0Var2 = this.f37800h0;
            int i10 = AndroidUtilities.roundMessageSize;
            tbVar.addView(k0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f37800h0.setVisibility(4);
        this.f37801i0.setDrawingReady(false);
        return this.f37802j0;
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
        this.H0.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList4 = this.f37811r0;
            if (i12 < arrayList4.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                if (messageObject2 != null && (tL_channelAdminLogEvent2 = messageObject2.currentEvent) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j3 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j3 = 0;
                }
                if (messageObject2.stableId <= 0) {
                    int i13 = X0;
                    X0 = i13 + 1;
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
                        MessageObject messageObject3 = (MessageObject) hc.b.i(1, arrayList3);
                        if (TextUtils.isEmpty(this.f37823z0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f37814t0;
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
                            sb sbVar = this.I;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            sbVar.m(i10 + size);
                            sb sbVar2 = this.I;
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
                        MessageObject messageObject4 = (MessageObject) hc.b.i(1, arrayList5);
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
                ArrayList arrayList6 = this.f37813s0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void T0(boolean z10) {
        if (this.Q.getTag() != null && !this.T) {
            if (!this.W || this.U) {
                this.Q.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.V = animatorSet;
                    animatorSet.setDuration(150L);
                    this.V.playTogether(ObjectAnimator.ofFloat(this.Q, "alpha", 0.0f));
                    this.V.addListener(new org.telegram.ui.Cells.v5(this, 5));
                    this.V.setStartDelay(500L);
                    this.V.start();
                    return;
                }
                AnimatorSet animatorSet2 = this.V;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.V = null;
                }
                this.Q.setAlpha(0.0f);
            }
        }
    }

    public final void U0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f37805n != null) {
            xf.c0 c0Var = this.T0;
            if (c0Var.f45098c == 0) {
                c0Var.invalidate();
            }
            c0Var.f45098c = i10 | c0Var.f45098c;
        }
    }

    public final void V0(boolean z10) {
        sb sbVar;
        if (!this.f37816v0) {
            ArrayList arrayList = this.f37811r0;
            if (z10) {
                this.S = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f37817w;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.L.setVisibility(4);
                    this.E.setEmptyView(null);
                }
                this.f37807o0.b();
                arrayList.clear();
                this.f37809q0.clear();
                R0();
            }
            this.f37816v0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f37812s);
            tL_channels_getAdminLog.f17230q = this.f37823z0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.S;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f37822y0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.A0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.A0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.A0.n(i10)));
                }
            }
            c1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new sa(this, 4));
            if (z10 && (sbVar = this.I) != null) {
                sbVar.l();
            }
        }
    }

    public final void W0() {
        if (this.f37818w0) {
            return;
        }
        this.f37818w0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f37812s);
        tL_channels_getAdminLog.f17230q = this.f37823z0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f37822y0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.A0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.A0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.A0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new sa(this, 1));
    }

    public final void X0(boolean z10) {
        int i10;
        long j3;
        lb lbVar = this.E;
        if (lbVar != null && this.G != null && lbVar.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.t1 t1Var = null;
            int i11 = -1;
            for (int i12 = 0; i12 < this.E.getChildCount(); i12++) {
                View childAt = this.E.getChildAt(i12);
                this.E.getClass();
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
                this.Q0 = j3;
                this.R0 = i11;
                this.S0 = (this.E.getMeasuredHeight() - t1Var.getBottom()) - this.E.getPaddingBottom();
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
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.N0) != null && (textLayoutBlocks = t1Var.f20086c4) != null) {
                i10 = (int) t1Var.f20281q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var2 = this.N0;
                if (t1Var2 != null && t1Var2.f20324t1) {
                    i10 = t1Var2.f20223m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = this.N0;
            if (t1Var3 != null) {
                t1Var3.f20380we = 0;
                t1Var3.f20395xe = null;
            }
            if (arrayList != null && charSequence != null && (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), null, this.L0)) >= 0) {
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
                        if (this.f37792b0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                            f7 = 0.7f;
                        } else {
                            f7 = 0.5f;
                        }
                        if (lineTop > f10 * f7) {
                            float f12 = AndroidUtilities.displaySize.y;
                            if (this.f37792b0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
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
            org.telegram.ui.Cells.t1 t1Var4 = this.N0;
            if (t1Var4 != null) {
                t1Var4.f20380we = 0;
                t1Var4.f20395xe = null;
            }
        }
        return 0;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.Z0(org.telegram.messenger.MessageObject):void");
    }

    public final void c1() {
        if (this.P == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f37823z0)) {
            this.O.setVisibility(8);
            this.P.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.P.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.A0 == null && this.f37822y0 == null) {
            this.O.setVisibility(0);
            this.P.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f37812s.megagroup) {
                this.P.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
            } else {
                this.P.setText(b1(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
            }
        } else {
            this.O.setVisibility(8);
            this.P.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.P.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFoundFiltered)));
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.Y = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.j6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 28));
        org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(context, null, false, null);
        this.M = joVar;
        nl nlVar = joVar.h;
        if (nlVar != null) {
            nlVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        nl nlVar2 = joVar.f24474r;
        if (nlVar2 != null) {
            nlVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        joVar.f24467k0 = true;
        this.M.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.M, 0, w7.a6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 1);
        this.R = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.R.setSearchPaddingStart(7);
        this.M.setEnabled(false);
        org.telegram.ui.Components.jo joVar2 = this.M;
        TLRPC.Chat chat = this.f37812s;
        joVar2.setTitle(chat.title);
        this.M.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.M.setChatAvatar(chat);
        kb kbVar = new kb(this, context);
        this.fragmentView = kbVar;
        this.f37792b0 = kbVar;
        xf.c0 c0Var = new xf.c0(context, new za(this));
        this.T0 = c0Var;
        this.f37792b0.addView(c0Var);
        gh.k kVar = new gh.k(this.f37792b0);
        tb tbVar = this.f37792b0;
        zg.a aVar = this.e;
        aVar.d = kVar;
        aVar.e = tbVar;
        zg.a aVar2 = this.f37797f;
        aVar2.d = kVar;
        aVar2.e = tbVar;
        zg.a aVar3 = this.f37791b;
        aVar3.d = kVar;
        aVar3.e = tbVar;
        tbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.f37792b0.V(org.telegram.ui.ActionBar.j6.r0());
        this.actionBar.M(aVar, dh.c.o(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setVisibility(4);
        this.f37792b0.addView(this.L, w7.a6.e(-1, -2, 17));
        this.L.setOnTouchListener(new ai.h(7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.w5(this.P, this.f37792b0, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.f17960f2));
        this.N.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.O.setImageResource(R.drawable.large_log_actions);
        this.O.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.O.setVisibility(8);
        this.N.addView(this.O, w7.a6.t(54, 54, 17, 16, 20, 16, -4));
        di.h hVar = new di.h(context, 8);
        this.P = hVar;
        hVar.setTextSize(1, 14.0f);
        this.P.setGravity(17);
        di.h hVar2 = this.P;
        int i11 = org.telegram.ui.ActionBar.j6.f18023ic;
        hVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.P.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.N.addView(this.P, w7.a6.t(-2, -2, 17, 0, 0, 0, 0));
        this.L.addView(this.N, w7.a6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        lb lbVar = new lb(this, context);
        this.E = lbVar;
        lbVar.setOnItemClickListener(new g(this, 9));
        this.E.setTag(1);
        this.E.setVerticalScrollBarEnabled(true);
        lb lbVar2 = this.E;
        sb sbVar = new sb(this, context);
        this.I = sbVar;
        lbVar2.setAdapter(sbVar);
        this.E.setClipToPadding(false);
        lb lbVar3 = this.E;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f37810r;
        lbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        lb lbVar4 = this.E;
        mb mbVar = new mb(this, this.E, this.resourceProvider);
        this.G0 = mbVar;
        lbVar4.setItemAnimator(mbVar);
        this.G0.Q = true;
        this.E.setLayoutAnimation(null);
        fg.a0 a0Var = new fg.a0(this);
        this.G = a0Var;
        a0Var.j1(1);
        this.G.l1(true);
        this.E.setLayoutManager(this.G);
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(this.E, this.G);
        this.H = yk0Var;
        yk0Var.h = new za(this);
        yk0Var.f29448i = this.P0;
        this.f37792b0.addView(this.E, w7.a6.c(-1.0f, -1));
        this.E.setOnScrollListener(new j3(this));
        int i14 = this.f37803k0;
        if (i14 != -1) {
            this.G.h1(i14, this.f37804l0);
            this.f37803k0 = -1;
        }
        ?? view = new View(context);
        this.f37790a0 = view;
        view.setup(aVar3);
        this.f37790a0.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.f37790a0.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.f37790a0.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.f37790a0.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.f37792b0.addView(this.f37790a0, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f37817w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.f37792b0.addView(this.f37817w, w7.a6.e(-1, -1, 51));
        View view2 = new View(context);
        this.f37819x = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.w5(this.f37819x, this.f37792b0, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.f17960f2));
        this.f37817w.addView(this.f37819x, w7.a6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37821y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f37821y.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f37817w.addView(this.f37821y, w7.a6.e(32, 32, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        this.Q = w0Var;
        w0Var.setAlpha(0.0f);
        this.Q.setImportantForAccessibility(2);
        this.f37792b0.addView(this.Q, w7.a6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.f37792b0.addView(this.actionBar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        ih.e eVar = new ih.e(context, dh.c.b(f6Var), f6Var, aVar);
        this.K = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.K.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.K.c(4, true, false);
        ih.e eVar2 = this.K;
        bh.d c10 = eVar2.f10611n.c(eVar2, null, false);
        c10.n(eVar2.f10612r);
        c10.p(AndroidUtilities.dp(22.0f));
        c10.o(AndroidUtilities.dp(6.0f));
        eVar2.f10613s = c10;
        this.f37792b0.addView(this.K, w7.a6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final wb f31875b;

            {
                this.f31875b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f31875b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(wbVar, wbVar.f37822y0, wbVar.A0, wbVar.f37812s.megagroup);
                            i0Var.S(wbVar.f37820x0);
                            i0Var.f23843g0 = new za(wbVar);
                            wbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f31875b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f37812s.megagroup) {
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        wbVar2.showDialog(d2Var);
                        return;
                    default:
                        wb wbVar3 = this.f31875b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.R.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.d5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f17571a);
                            return;
                        }
                        return;
                }
            }
        });
        this.J.setTextSize(1, 15.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ae, false));
        this.J.setText(LocaleController.getString(R.string.SETTINGS));
        this.J.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.K.getContainer().addView(this.J, w7.a6.e(-2, -2, 17));
        ih.e eVar3 = this.K;
        eVar3.f10610f.add(this.J);
        this.K.d(false);
        ih.e eVar4 = this.K;
        eVar4.f10608b[4] = new View.OnClickListener(this) {
            public final wb f31875b;

            {
                this.f31875b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f31875b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(wbVar, wbVar.f37822y0, wbVar.A0, wbVar.f37812s.megagroup);
                            i0Var.S(wbVar.f37820x0);
                            i0Var.f23843g0 = new za(wbVar);
                            wbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f31875b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f37812s.megagroup) {
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        wbVar2.showDialog(d2Var);
                        return;
                    default:
                        wb wbVar3 = this.f31875b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.R.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.d5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f17571a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f37796e0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f37796e0.setVisibility(4);
        this.f37796e0.setFocusable(true);
        this.f37796e0.setFocusableInTouchMode(true);
        this.f37796e0.setClickable(true);
        this.f37796e0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.f37792b0.addView(this.f37796e0, w7.a6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f37798f0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f37798f0.setImageResource(R.drawable.msg_calendar);
        this.f37798f0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18296xe, false), PorterDuff.Mode.MULTIPLY));
        this.f37796e0.addView(this.f37798f0, w7.a6.e(48, 48, 53));
        this.f37798f0.setOnClickListener(new View.OnClickListener(this) {
            public final wb f31875b;

            {
                this.f31875b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        wb wbVar = this.f31875b;
                        if (wbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(wbVar, wbVar.f37822y0, wbVar.A0, wbVar.f37812s.megagroup);
                            i0Var.S(wbVar.f37820x0);
                            i0Var.f23843g0 = new za(wbVar);
                            wbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        wb wbVar2 = this.f31875b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar2.getParentActivity());
                        if (wbVar2.f37812s.megagroup) {
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        wbVar2.showDialog(d2Var);
                        return;
                    default:
                        wb wbVar3 = this.f31875b;
                        if (wbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(wbVar3.R.getSearchField());
                            wbVar3.showDialog(org.telegram.ui.Components.d5.p(wbVar3.getParentActivity(), new wa(wbVar3, 0), null).f17571a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f37799g0 = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18314ye, false));
        this.f37799g0.setTextSize(15);
        this.f37799g0.setTypeface(AndroidUtilities.bold());
        this.f37796e0.addView(this.f37799g0, w7.a6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.I.D(true);
        if (this.f37816v0 && this.f37811r0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f37817w, true, 0.3f, true);
            this.E.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f37817w, false, 0.3f, true);
            this.E.setEmptyView(this.L);
        }
        lb lbVar5 = this.E;
        lbVar5.Y1 = true;
        lbVar5.Z1 = 1;
        UndoView undoView = new UndoView(context);
        this.F = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.f37792b0.addView(this.F, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        MessageObject messageObject;
        int i10;
        lb lbVar = this.E;
        if (lbVar == null) {
            return;
        }
        int childCount = lbVar.getChildCount();
        int measuredHeight = this.E.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.t1 t1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.E.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.f37792b0.getBackgroundTranslationY();
                int backgroundSizeY = this.f37792b0.getBackgroundSizeY();
                u1Var.f20473f = y3;
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
                t1Var2.b4(i10, measuredHeight2 - i10, (this.f37792b0.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.E.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.f37792b0.getBackgroundTranslationY(), this.f37792b0.getMeasuredWidth(), this.f37792b0.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = t1Var2.getMessageObject();
                if (this.f37800h0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    this.f37800h0.setTranslationX(photoImage.getImageX());
                    this.f37800h0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f37800h0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                w0Var.W((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.f37792b0.getBackgroundTranslationY(), this.f37792b0.getBackgroundSizeY());
                if (w0Var.J()) {
                    w0Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.E.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.w0)) {
                        t1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                mb mbVar = this.G0;
                if ((mbVar == null || (!mbVar.a0(childAt) && !this.G0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.w0) && ((org.telegram.ui.Cells.w0) childAt).getMessageObject().isDateObject) {
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
        k0 k0Var = this.f37800h0;
        if (k0Var != null) {
            if (!z11) {
                k0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.Z) {
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
            this.Q.T(messageObject.messageOwner.date, false, true);
        }
        this.T = false;
        if (!(view2 instanceof org.telegram.ui.Cells.t1) && !(view2 instanceof org.telegram.ui.Cells.w0)) {
            z10 = true;
        }
        this.U = z10;
        if (view != null) {
            if (view.getTop() <= this.E.getPaddingTop() && !this.U) {
                if (view.getAlpha() != 0.0f) {
                    view.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.V;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.V = null;
                }
                if (this.Q.getTag() == null) {
                    this.Q.setTag(1);
                }
                if (this.Q.getAlpha() != 1.0f) {
                    this.Q.setAlpha(1.0f);
                }
                this.T = true;
            } else {
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                T0(true ^ this.U);
            }
            int bottom2 = view.getBottom() - this.E.getPaddingTop();
            if (bottom2 > this.Q.getMeasuredHeight() && bottom2 < this.Q.getMeasuredHeight() * 2) {
                org.telegram.ui.Cells.w0 w0Var2 = this.Q;
                w0Var2.setTranslationY(((-w0Var2.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.Q.setTranslationY(0.0f);
            return;
        }
        T0(true);
        this.Q.setTranslationY(0.0f);
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
            lb lbVar = this.E;
            if (lbVar != null) {
                lbVar.e1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f37801i0, this.f37800h0, true);
                int childCount = this.E.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.E.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt;
                            MessageObject messageObject4 = t1Var4.getMessageObject();
                            if (this.f37800h0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = t1Var4.getPhotoImage();
                                this.f37800h0.setTranslationX(photoImage.getImageX());
                                this.f37800h0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f37800h0.invalidate();
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
                if (this.f37800h0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z10) {
                        this.f37800h0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.Z || PipRoundVideoView.F != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            lb lbVar2 = this.E;
            if (lbVar2 != null) {
                int childCount2 = lbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.E.getChildAt(i13);
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
                lb lbVar3 = this.E;
                if (lbVar3 != null) {
                    int childCount3 = lbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.E.getChildAt(i14);
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
                this.f37792b0.V(org.telegram.ui.ActionBar.j6.r0());
                this.f37819x.invalidate();
                di.h hVar = this.P;
                if (hVar != null) {
                    hVar.invalidate();
                }
                this.E.e1();
            }
        } else {
            lb lbVar4 = this.E;
            if (lbVar4 != null) {
                int childCount4 = lbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.E.getChildAt(i15);
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

    public final void e1() {
        boolean z10;
        lb lbVar = this.E;
        if (lbVar != null) {
            int childCount = lbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.E.getChildAt(i10);
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
                        if (this.K0 != Integer.MAX_VALUE && messageObject.getRealId() == this.K0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t1Var.setHighlighted(z10);
                        if (this.K0 != Integer.MAX_VALUE) {
                            ya yaVar = this.M0;
                            if (yaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(yaVar);
                            }
                            ya yaVar2 = new ya(this, 0);
                            this.M0 = yaVar2;
                            AndroidUtilities.runOnUIThread(yaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f37823z0)) {
                            t1Var.S3(this.f37823z0);
                        } else {
                            t1Var.S3(null);
                        }
                        if (this.E.getScrollState() == 0) {
                            z11 = false;
                        }
                        t1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    w0Var.setMessageObject(w0Var.getMessageObject());
                    if (this.E.getScrollState() == 0) {
                        z11 = false;
                    }
                    w0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Nd));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f18256v8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f18220t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.j6.f17906c2, org.telegram.ui.ActionBar.j6.f17924d2}, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18019i8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18037j8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18057k8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18075l8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18093m8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18112n8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18128o8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18088m3, org.telegram.ui.ActionBar.j6.f18159q3}, null, org.telegram.ui.ActionBar.j6.f18184ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18107n3, org.telegram.ui.ActionBar.j6.f18177r3}, null, org.telegram.ui.ActionBar.j6.f17934dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.j6.f18088m3.k();
        int i13 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f18159q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.j6.f18123o3.k();
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f18196s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18123o3, org.telegram.ui.ActionBar.j6.f18196s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18141p3, org.telegram.ui.ActionBar.j6.f18215t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.f18195s2;
        int i15 = org.telegram.ui.ActionBar.j6.f18023ic;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, new Class[]{org.telegram.ui.Cells.w0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 2, new Class[]{org.telegram.ui.Cells.w0.class}, org.telegram.ui.ActionBar.j6.f18195s2, null, null, org.telegram.ui.ActionBar.j6.f18041jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18269w4, org.telegram.ui.ActionBar.j6.f18160q4, org.telegram.ui.ActionBar.j6.f18287x4, org.telegram.ui.ActionBar.j6.f18252v4, org.telegram.ui.ActionBar.j6.f18234u4, org.telegram.ui.ActionBar.j6.C4}, null, org.telegram.ui.ActionBar.j6.f18061kc));
        int i16 = org.telegram.ui.ActionBar.j6.f18079lc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18097mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17969fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.j6.f18004hc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18322z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f18205sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O3, org.telegram.ui.ActionBar.j6.S3, org.telegram.ui.ActionBar.j6.W3}, null, org.telegram.ui.ActionBar.j6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P3, org.telegram.ui.ActionBar.j6.T3, org.telegram.ui.ActionBar.j6.X3}, null, org.telegram.ui.ActionBar.j6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.M3, org.telegram.ui.ActionBar.j6.Q3, org.telegram.ui.ActionBar.j6.U3}, null, org.telegram.ui.ActionBar.j6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.N3, org.telegram.ui.ActionBar.j6.R3, org.telegram.ui.ActionBar.j6.V3}, null, org.telegram.ui.ActionBar.j6.f18312yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17869a4, org.telegram.ui.ActionBar.j6.f17889b4, org.telegram.ui.ActionBar.j6.Z3}, null, org.telegram.ui.ActionBar.j6.f18331zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17944e4}, null, org.telegram.ui.ActionBar.j6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17962f4}, null, org.telegram.ui.ActionBar.j6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17908c4}, null, org.telegram.ui.ActionBar.j6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17926d4}, null, org.telegram.ui.ActionBar.j6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f17980g4}, null, org.telegram.ui.ActionBar.j6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.f18015i4};
        int i17 = org.telegram.ui.ActionBar.j6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.j6.f17997h4, org.telegram.ui.ActionBar.j6.B4, org.telegram.ui.ActionBar.j6.D4};
        int i18 = org.telegram.ui.ActionBar.j6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.J4, null, org.telegram.ui.ActionBar.j6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.H4, null, org.telegram.ui.ActionBar.j6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.O4}, null, org.telegram.ui.ActionBar.j6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.P4}, null, org.telegram.ui.ActionBar.j6.f18181r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Q4}, null, org.telegram.ui.ActionBar.j6.f18165qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.f17887b2, null, null, org.telegram.ui.ActionBar.j6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18033j4}, null, org.telegram.ui.ActionBar.j6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.J2, null, null, org.telegram.ui.ActionBar.j6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.K2, null, null, org.telegram.ui.ActionBar.j6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.T1, null, null, org.telegram.ui.ActionBar.j6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.Q2, null, null, org.telegram.ui.ActionBar.j6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Rc));
        int i19 = org.telegram.ui.ActionBar.j6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.f17876ab;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17896bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17933db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17950eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17878ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17968fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17916cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17986gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17935dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18003hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17951ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18022ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17970fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18040jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18005hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18024id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18166qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18042jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18185rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18062kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18115nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18204sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18132od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18150pd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18078lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18187rd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18222tb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18206sd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18241ub));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18224td));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18258vb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18243ud));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18276wb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18277wd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18311yb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18295xd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18260vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18330zb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18294xb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18313yd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18332zd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.j6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18025ie));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18242uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18043je));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18259vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.j6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.f18188re));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.j6.f18207se));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18151pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.j6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.j6.f18169qe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.j6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37821y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.j6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.j6.De));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.j6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37819x, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i21 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.F;
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f37812s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new sa(this, 0)), this.classGuid);
        setBulletinDelegate(new bi.fa(6));
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
        this.B0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        tb tbVar = this.f37792b0;
        if (tbVar != null) {
            org.telegram.ui.Components.y81 y81Var = tbVar.v;
            if (y81Var != null) {
                y81Var.c(false);
            }
            tbVar.F = true;
        }
        UndoView undoView = this.F;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.m0 = true;
        this.f37806n0 = true;
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
        if (mVar != null && mVar.f6100a) {
            com.google.firebase.messaging.m k10 = com.google.firebase.messaging.m.k();
            if (k10.f6100a) {
                int i10 = c5.F;
                ((s4) k10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f37802j0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        tb tbVar = this.f37792b0;
        if (tbVar != null) {
            org.telegram.ui.Components.y81 y81Var = tbVar.v;
            if (y81Var != null) {
                y81Var.c(true);
            }
            tbVar.F = false;
        }
        this.m0 = false;
        O0(false);
        if (this.f37806n0) {
            this.f37806n0 = false;
            sb sbVar = this.I;
            if (sbVar != null) {
                sbVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.B0.lock();
        }
    }
}
