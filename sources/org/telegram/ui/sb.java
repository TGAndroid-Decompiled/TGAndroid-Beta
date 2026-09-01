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
public final class sb extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static int U0 = 10;
    public static final int[] V0 = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public HashMap A0;
    public hb B;
    public boolean B0;
    public UndoView C;
    public final db C0;
    public k D;
    public ib D0;
    public c2.y E;
    public final ArrayList E0;
    public ob F;
    public final a0.h F0;
    public TextView G;
    public bb G0;
    public xg.e H;
    public int H0;
    public FrameLayout I;
    public int I0;
    public org.telegram.ui.Components.bo J;
    public va J0;
    public LinearLayout K;
    public org.telegram.ui.Cells.t1 K0;
    public ImageView L;
    public int L0;
    public hg.q M;
    public final rb M0;
    public org.telegram.ui.Cells.v0 N;
    public long N0;
    public org.telegram.ui.ActionBar.w0 O;
    public int O0;
    public long P;
    public int P0;
    public boolean Q;
    public lf.e0 Q0;
    public boolean R;
    public final ArrayList R0;
    public AnimatorSet S;
    public final ArrayList S0;
    public boolean T;
    public final RectF T0;
    public final int[] U;
    public boolean V;
    public boolean W;
    public xg.f X;
    public pb Y;
    public MessageObject Z;
    public final tg.e f41184a;
    public TLRPC.ChannelParticipant f41185a0;
    public final og.a f41186b;
    public FrameLayout f41187b0;
    public final tg.d f41188c;
    public ImageView f41189c0;
    public final tg.d d;
    public org.telegram.ui.ActionBar.l5 f41190d0;
    public final og.a f41191e;
    public l0 f41192e0;
    public final og.a f41193f;
    public o4 f41194f0;
    public TextureView f41195g0;
    public final be.b h;
    public int f41196h0;
    public int f41197i0;
    public boolean f41198j0;
    public boolean f41199k0;
    public final a0.h f41200l0;
    public final a0.h m0;
    public final og.e f41201n;
    public final HashMap f41202n0;
    public final ArrayList f41203o0;
    public final ArrayList f41204p0;
    public final HashSet f41205q0;
    public final int f41206r;
    public boolean f41207r0;
    public final TLRPC.Chat f41208s;
    public boolean f41209s0;
    public boolean f41210t0;
    public ArrayList f41211u0;
    public final ArrayList v;
    public TLRPC.TL_channelAdminLogEventsFilter f41212v0;
    public FrameLayout f41213w;
    public String f41214w0;
    public View f41215x;
    public a0.h f41216x0;
    public RadialProgressView f41217y;
    public final AnimationNotificationsLocker f41218y0;
    public final HashMap f41219z0;

    public sb(TLRPC.Chat chat) {
        super(null);
        be.b bVar = new be.b(true);
        this.h = bVar;
        this.v = new ArrayList();
        this.U = new int[]{2};
        this.f41196h0 = -1;
        this.f41197i0 = 0;
        this.f41198j0 = true;
        this.f41199k0 = false;
        this.f41200l0 = new a0.h();
        this.m0 = new a0.h();
        this.f41202n0 = new HashMap();
        this.f41203o0 = new ArrayList();
        this.f41204p0 = new ArrayList();
        this.f41205q0 = new HashSet();
        this.f41212v0 = null;
        this.f41214w0 = "";
        this.f41218y0 = new AnimationNotificationsLocker(V0);
        this.f41219z0 = new HashMap();
        this.C0 = new db(this);
        this.E0 = new ArrayList();
        this.F0 = new a0.h();
        this.H0 = Integer.MAX_VALUE;
        this.I0 = -1;
        this.M0 = new rb(this);
        this.O0 = -1;
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new RectF();
        ?? obj = new Object();
        this.f41184a = obj;
        og.a aVar = new og.a(obj);
        this.f41186b = aVar;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            og.e eVar = new og.e(false);
            this.f41201n = eVar;
            tg.d dVar = new tg.d(obj);
            this.d = dVar;
            dVar.v = new va(this, 3);
            dVar.d = eVar;
            dVar.f48090e = -3;
            dVar.f48091f = obj;
            og.a aVar2 = new og.a(dVar);
            this.f41193f = aVar2;
            aVar2.f16755f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                tg.d dVar2 = new tg.d(obj);
                this.f41188c = dVar2;
                dVar2.v = new va(this, 3);
                dVar2.d = eVar;
                dVar2.f48090e = -2;
                dVar2.f48091f = obj;
                og.a aVar3 = new og.a(dVar2);
                this.f41191e = aVar3;
                aVar3.f16755f = LiteMode.isEnabled(262144);
                this.f41206r = 0;
            } else {
                this.f41188c = null;
                this.f41191e = aVar2;
                this.f41206r = AndroidUtilities.dp(48.0f);
            }
        } else {
            this.f41201n = null;
            this.f41206r = 0;
            this.f41188c = null;
            this.d = null;
            this.f41191e = new og.a(obj);
            this.f41193f = new og.a(obj);
        }
        aVar.f16753c = bVar;
        this.f41191e.f16753c = bVar;
        this.f41193f.f16753c = bVar;
        this.f41208s = chat;
    }

    public static void A0(sb sbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        MessagesController messagesController = sbVar.getMessagesController();
        TLRPC.Chat chat = sbVar.f41208s;
        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.f20843id);
        org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(sbVar.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, hashMap, sbVar, chatFull.f20844id, false, ChatObject.isChannel(chat));
        u60Var.f31567g0 = new eb(sbVar);
        u60Var.show();
    }

    public static org.telegram.ui.ActionBar.k G0(sb sbVar) {
        return sbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k H0(sb sbVar) {
        return sbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k I0(sb sbVar) {
        return sbVar.actionBar;
    }

    public static int J0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static void K0(sb sbVar) {
        if (sbVar.B != null && !sbVar.f41203o0.isEmpty()) {
            sbVar.D.h1(sbVar.f41204p0.size() - 1, (-100000) - sbVar.B.getPaddingTop());
        }
    }

    public static int L0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static t01 S0(CharSequence charSequence) {
        org.telegram.ui.Components.oq[] oqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.oq oqVar : (org.telegram.ui.Components.oq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.oq.class)) {
                if (oqVar != null) {
                    Drawable drawable = oqVar.drawable;
                    if (drawable instanceof t01) {
                        return (t01) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void U(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        a0.h hVar = sbVar.f41200l0;
        int i10 = 0;
        sbVar.D0.N = false;
        sbVar.X0(false);
        MessagesController.getInstance(sbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(sbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = sbVar.f41203o0;
        boolean z4 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f20875id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.P = Math.min(sbVar.P, tL_channelAdminLogEvent.f20875id);
                MessageObject messageObject2 = new MessageObject(sbVar.currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) sbVar.f41202n0, sbVar.f41208s, sbVar.U, false);
                if (messageObject2.contentType >= 0) {
                    hVar.k(messageObject2, tL_channelAdminLogEvent.f20875id);
                }
                z4 = true;
            }
        }
        arrayList.size();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                sbVar.m0.k(messageObject3, messageObject3.getRealId());
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
            MediaDataController.getInstance(sbVar.currentAccount).loadReplyMessagesForMessages(arrayList2, -sbVar.f41208s.f20843id, 0, 0L, new va(sbVar, 1), sbVar.getClassGuid(), null);
        }
        sbVar.R0();
        sbVar.f41209s0 = false;
        if (!z4) {
            sbVar.f41207r0 = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(sbVar.f41213w, false, 0.3f, true);
        sbVar.B.setEmptyView(sbVar.I);
        ob obVar = sbVar.F;
        if (obVar != null) {
            obVar.l();
        }
        org.telegram.ui.ActionBar.w0 w0Var = sbVar.O;
        if (w0Var != null) {
            if (sbVar.f41204p0.isEmpty() && TextUtils.isEmpty(sbVar.f41214w0)) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
    }

    public static void V(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        boolean z4;
        boolean z10;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && sbVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, sbVar.getParentActivity(), sbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            Rect rect = new Rect();
            sbVar.getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(sbVar.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(sbVar.getParentActivity(), sbVar.getResourceProvider()), k7.c6.n(-1, 8));
                } else {
                    Activity parentActivity = sbVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, sbVar.getResourceProvider(), z4, z10);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.g((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        g1Var.c(sbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7), sbVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    g1Var.setOnClickListener(new oh.o5(sbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 1));
                }
                i11++;
                arrayList4 = arrayList;
            }
            ab abVar = new ab(0, sbVar.Y.getContext(), sbVar);
            abVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.c6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            abVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            bb bbVar = new bb(sbVar, abVar);
            sbVar.G0 = bbVar;
            bbVar.f22218e = true;
            bbVar.f22217c = 220;
            bbVar.setOutsideTouchable(true);
            sbVar.G0.setClippingEnabled(true);
            sbVar.G0.setAnimationStyle(R.style.PopupContextAnimation);
            sbVar.G0.setFocusable(true);
            abVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            sbVar.G0.setInputMethodMode(2);
            sbVar.G0.setSoftInputMode(48);
            sbVar.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f10)) - abVar.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
            if (left < AndroidUtilities.dp(6.0f)) {
                left = AndroidUtilities.dp(6.0f);
            } else if (left > (sbVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - abVar.getMeasuredWidth()) {
                left = (sbVar.B.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - abVar.getMeasuredWidth();
            }
            if (AndroidUtilities.isTablet()) {
                int[] iArr = new int[2];
                sbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = sbVar.Y.getHeight();
            int dp = AndroidUtilities.dp(48.0f) + abVar.getMeasuredHeight();
            int R = sbVar.Y.R();
            if (R > AndroidUtilities.dp(20.0f)) {
                height += R;
            }
            if (dp < height) {
                int y10 = (int) (sbVar.B.getY() + view.getTop() + f11);
                if ((dp - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f)) {
                    i10 = (AndroidUtilities.dp(240.0f) - dp) + y10;
                } else {
                    i10 = y10;
                }
                if (i10 < sbVar.B.getY() + AndroidUtilities.dp(24.0f)) {
                    i10 = (int) (sbVar.B.getY() + AndroidUtilities.dp(24.0f));
                } else {
                    int i12 = height - dp;
                    if (i10 > i12 - AndroidUtilities.dp(8.0f)) {
                        i10 = i12 - AndroidUtilities.dp(8.0f);
                    }
                }
            } else if (!sbVar.inBubbleMode) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            abVar.setMaxHeight(height - i10);
            sbVar.G0.showAtLocation(sbVar.B, 51, left, i10);
            sbVar.G0.b();
        }
    }

    public static void W(org.telegram.ui.sb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.W(org.telegram.ui.sb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void X(sb sbVar, int i10) {
        int i11;
        RectF rectF;
        tg.d dVar = sbVar.f41188c;
        tg.d dVar2 = sbVar.d;
        ArrayList arrayList = sbVar.S0;
        og.e eVar = sbVar.f41201n;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            if (k7.x8.a(i10, 2)) {
                ArrayList arrayList2 = sbVar.R0;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, sbVar.Y.getMeasuredWidth(), sbVar.B.getY() + sbVar.B.getPaddingTop());
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
                int a2 = lf.l0.a(arrayList2, i11, arrayList);
                int measuredWidth = sbVar.Y.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f10 = measuredWidth;
                    rectF2.left = k7.o.a(rectF2.left, 0.0f, f10);
                    rectF2.top = Math.max(sbVar.B.getY(), rectF2.top);
                    rectF2.right = k7.o.a(rectF2.right, 0.0f, f10);
                    rectF2.bottom = Math.min(sbVar.B.getY() + sbVar.B.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            pb pbVar = sbVar.Y;
            Objects.requireNonNull(pbVar);
            if (eVar.e(new ua(pbVar, 0), sbVar.Y.getWidth(), sbVar.Y.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = sbVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                sbVar.Y.invalidate();
                Iterator it = sbVar.h.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    public static void Y(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = sbVar.f41200l0;
        sbVar.f41210t0 = false;
        sbVar.D0.N = false;
        sbVar.X0(false);
        MessagesController.getInstance(sbVar.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(sbVar.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z4 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f20875id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.P = Math.min(sbVar.P, tL_channelAdminLogEvent2.f20875id);
                MessageObject messageObject = new MessageObject(sbVar.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) hashMap, sbVar.f41208s, sbVar.U, false);
                if (messageObject.contentType >= 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f20875id))) {
                    sbVar.f41203o0.add(0, messageObject);
                    hVar.k(messageObject, tL_channelAdminLogEvent2.f20875id);
                    z4 = true;
                }
            }
        }
        if (sbVar.F != null && z4) {
            sbVar.R0();
            sbVar.F.l();
        }
    }

    public static void Z(sb sbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat = sbVar.f41208s;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            sbVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            sbVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            sbVar.f41211u0 = tL_channels_channelParticipants.participants;
            if (chat != null && (chatFull = sbVar.getMessagesController().getChatFull(chat.f20843id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = sbVar.getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = sbVar.getMessagesController().getPeer(channelParticipant.user_id);
                long j10 = sbVar.getMessagesController().telegramAntispamUserId;
                if (sbVar.getMessagesController().getUser(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f20984id.add(tL_inputUser);
                    ConnectionsManager.getInstance(sbVar.currentAccount).sendRequest(tL_users_getUsers, new qa(sbVar, 2));
                }
                sbVar.f41211u0.add(0, channelParticipant);
            }
            Dialog dialog = sbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.h0) {
                ((org.telegram.ui.Components.h0) dialog).S(sbVar.f41211u0);
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

    public static int l0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int m0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int n0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int o0(sb sbVar) {
        return sbVar.classGuid;
    }

    public static void p0(org.telegram.ui.sb r6, android.os.Bundle r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.p0(org.telegram.ui.sb, android.os.Bundle, long):void");
    }

    public static int q0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int r0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int s0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int t0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int u0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static void v0(sb sbVar, MessageObject messageObject) {
        if (sbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            d2Var.Q = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            d2Var.Q = LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        sbVar.showDialog(d2Var);
    }

    public static int w0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int x0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int y0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int z0(sb sbVar) {
        return sbVar.classGuid;
    }

    public final MessageObject N0(long j10, long j11, ArrayList arrayList, boolean z4, boolean z10) {
        MessageObject messageObject;
        MessageObject messageObject2;
        String str;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f41204p0;
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
            tL_message.dialog_id = -this.f41208s.f20843id;
            tL_message.f20864id = -1;
            try {
                tL_message.date = ((MessageObject) arrayList.get(0)).messageOwner.date;
            } catch (Exception e6) {
                FileLog.e(e6);
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
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new n8(1)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l10 = (Long) obj;
                sb sbVar = sb.this;
                sbVar.getClass();
                if (l10.longValue() < 0) {
                    TLRPC.Chat chat = sbVar.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                    if (chat == null) {
                        return null;
                    }
                    return chat.title;
                }
                return UserObject.getForcedFirstName(sbVar.getMessagesController().getUser(l10));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new lh.c1(1)).limit(4L).toArray());
        if (z10) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(str, arrayList.size(), join), "un1", user));
        if (z10 && arrayList.size() > 1) {
            t01 S0 = S0(messageObject2.messageText);
            if (S0 == null) {
                if (z4) {
                    i11 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i11 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                S0 = new t01(LocaleController.getString(i11));
                Typeface bold = AndroidUtilities.bold();
                org.telegram.ui.Components.j6 j6Var = S0.f41418a;
                j6Var.u(bold);
                j6Var.t(AndroidUtilities.dp(10.0f));
                if (S0.f41420c != -1) {
                    S0.f41420c = -1;
                    S0.invalidateSelf();
                }
                S0.a(503316480);
            } else {
                org.telegram.ui.Components.j6 j6Var2 = S0.f41418a;
                if (z4) {
                    i10 = R.string.EventLogDeletedMultipleMessagesHide;
                } else {
                    i10 = R.string.EventLogDeletedMultipleMessagesShow;
                }
                j6Var2.q(LocaleController.getString(i10), false, true);
            }
            S0.setBounds(0, 0, S0.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(0, S0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject2.messageText = spannableStringBuilder;
        if (arrayList.size() > 0) {
            messageObject = (MessageObject) l.d.i(1, arrayList);
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
        if (kVar != null && !this.f41198j0) {
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
                if (L0 <= i10 && !this.f41209s0 && !this.f41207r0) {
                    V0(false);
                }
            }
        }
    }

    public final boolean P0(android.view.View r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.P0(android.view.View, float, float):boolean");
    }

    public final TextureView Q0(boolean z4) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f41192e0 == null) {
            l0 l0Var = new l0(this, getParentActivity(), 4);
            this.f41192e0 = l0Var;
            l0Var.setOutlineProvider(new hg.j1(6));
            this.f41192e0.setClipToOutline(true);
            this.f41192e0.setWillNotDraw(false);
            this.f41192e0.setVisibility(4);
            o4 o4Var = new o4(getParentActivity());
            this.f41194f0 = o4Var;
            o4Var.setBackgroundColor(0);
            if (z4) {
                this.f41192e0.addView(this.f41194f0, k7.c6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f41195g0 = textureView;
            textureView.setOpaque(false);
            this.f41194f0.addView(this.f41195g0, k7.c6.c(-1.0f, -1));
        }
        if (this.f41192e0.getParent() == null) {
            pb pbVar = this.Y;
            l0 l0Var2 = this.f41192e0;
            int i10 = AndroidUtilities.roundMessageSize;
            pbVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f41192e0.setVisibility(4);
        this.f41194f0.setDrawingReady(false);
        return this.f41195g0;
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
            ArrayList arrayList4 = this.f41203o0;
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
                        MessageObject messageObject3 = (MessageObject) l.d.i(1, arrayList3);
                        if (TextUtils.isEmpty(this.f41214w0) && arrayList3.size() > 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Long valueOf = Long.valueOf(messageObject3.eventId);
                        HashSet hashSet = this.f41205q0;
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
                            ob obVar = this.F;
                            if (z4) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            obVar.m(i10 + size);
                            ob obVar2 = this.F;
                            if (z4) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            obVar2.m(size + i11 + 1);
                        }
                        long j12 = messageObject2.eventId;
                        arrayList = arrayList3;
                        arrayList2.add(N0(j12, messageObject2.currentEvent.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z10));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        MessageObject messageObject4 = (MessageObject) l.d.i(1, arrayList5);
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
                ArrayList arrayList6 = this.f41204p0;
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
                    this.S.addListener(new s5(this, 14));
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
        if (Build.VERSION.SDK_INT >= 31 && this.f41201n != null) {
            lf.e0 e0Var = this.Q0;
            if (e0Var.f12417c == 0) {
                e0Var.invalidate();
            }
            e0Var.f12417c = i10 | e0Var.f12417c;
        }
    }

    public final void V0(boolean z4) {
        ob obVar;
        if (!this.f41209s0) {
            ArrayList arrayList = this.f41203o0;
            if (z4) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f41213w;
                if (frameLayout != null) {
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                    this.I.setVisibility(4);
                    this.B.setEmptyView(null);
                }
                this.f41200l0.b();
                arrayList.clear();
                this.f41202n0.clear();
                R0();
            }
            this.f41209s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41208s);
            tL_channels_getAdminLog.f20878q = this.f41214w0;
            tL_channels_getAdminLog.limit = 50;
            if (!z4 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.P;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41212v0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f41216x0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f41216x0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41216x0.n(i10)));
                }
            }
            c1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new qa(this, 4));
            if (z4 && (obVar = this.F) != null) {
                obVar.l();
            }
        }
    }

    public final void W0() {
        if (this.f41210t0) {
            return;
        }
        this.f41210t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.f41208s);
        tL_channels_getAdminLog.f20878q = this.f41214w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41212v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f41216x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f41216x0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f41216x0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new qa(this, 1));
    }

    public final void X0(boolean z4) {
        int i10;
        long j10;
        hb hbVar = this.B;
        if (hbVar != null && this.D != null && hbVar.getChildCount() > 0) {
            if (z4) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.t1 t1Var = null;
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
                this.N0 = j10;
                this.O0 = i11;
                this.P0 = (this.B.getMeasuredHeight() - t1Var.getBottom()) - this.B.getPaddingBottom();
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
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.K0) != null && (textLayoutBlocks = t1Var.Z3) != null) {
                i10 = (int) t1Var.f23958n4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var2 = this.K0;
                if (t1Var2 != null && t1Var2.f23998q1) {
                    i10 = t1Var2.f23899j2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = this.K0;
            if (t1Var3 != null) {
                t1Var3.te = 0;
                t1Var3.f24065ue = null;
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
            org.telegram.ui.Cells.t1 t1Var4 = this.K0;
            if (t1Var4 != null) {
                t1Var4.te = 0;
                t1Var4.f24065ue = null;
            }
        }
        return 0;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.Z0(org.telegram.messenger.MessageObject):void");
    }

    public final void c1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41214w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            this.M.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoLogFound)));
        } else if (this.f41216x0 == null && this.f41212v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            if (this.f41208s.megagroup) {
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
                arrayList.add(new org.telegram.ui.Cells.t1(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.k6.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 15));
        org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(context, null, false, null);
        this.J = boVar;
        il ilVar = boVar.h;
        if (ilVar != null) {
            ilVar.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        il ilVar2 = boVar.f25683r;
        if (ilVar2 != null) {
            ilVar2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        boVar.f25673h0 = true;
        this.J.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.J, 0, k7.c6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 0);
        this.O = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        org.telegram.ui.Components.bo boVar2 = this.J;
        TLRPC.Chat chat = this.f41208s;
        boVar2.setTitle(chat.title);
        this.J.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.J.setChatAvatar(chat);
        gb gbVar = new gb(this, context);
        this.fragmentView = gbVar;
        this.Y = gbVar;
        lf.e0 e0Var = new lf.e0(context, new wa(this));
        this.Q0 = e0Var;
        this.Y.addView(e0Var);
        vg.i iVar = new vg.i(this.Y);
        pb pbVar = this.Y;
        og.a aVar = this.f41191e;
        aVar.d = iVar;
        aVar.f16754e = pbVar;
        og.a aVar2 = this.f41193f;
        aVar2.d = iVar;
        aVar2.f16754e = pbVar;
        og.a aVar3 = this.f41186b;
        aVar3.d = iVar;
        aVar3.f16754e = pbVar;
        pbVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.Y.V(org.telegram.ui.ActionBar.k6.r0());
        this.actionBar.M(aVar, sg.b.n(this.resourceProvider), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, k7.c6.e(-1, -2, 17));
        this.I.setOnTouchListener(new org.telegram.ui.ActionBar.s2(6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.x5(this.M, this.Y, AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.f21692f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, k7.c6.t(54, 54, 17, 16, 20, 16, -4));
        hg.q qVar = new hg.q(context, 8);
        this.M = qVar;
        qVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        hg.q qVar2 = this.M;
        int i11 = org.telegram.ui.ActionBar.k6.ic;
        qVar2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.M.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.K.addView(this.M, k7.c6.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, k7.c6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        hb hbVar = new hb(this, context);
        this.B = hbVar;
        hbVar.setOnItemClickListener(new h(this, 9));
        this.B.setTag(1);
        this.B.setVerticalScrollBarEnabled(true);
        hb hbVar2 = this.B;
        ob obVar = new ob(this, context);
        this.F = obVar;
        hbVar2.setAdapter(obVar);
        this.B.setClipToPadding(false);
        hb hbVar3 = this.B;
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f41206r;
        hbVar3.setPadding(0, AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + i13, 0, AndroidUtilities.dp(60.0f) + i13 + AndroidUtilities.navigationBarHeight);
        hb hbVar4 = this.B;
        ib ibVar = new ib(this, this.B, this.resourceProvider);
        this.D0 = ibVar;
        hbVar4.setItemAnimator(ibVar);
        this.D0.Q = true;
        this.B.setLayoutAnimation(null);
        k kVar = new k(this);
        this.D = kVar;
        kVar.j1(1);
        this.D.l1(true);
        this.B.setLayoutManager(this.D);
        c2.y yVar = new c2.y(this.B, this.D);
        this.E = yVar;
        yVar.h = new wa(this);
        yVar.f2211i = this.M0;
        this.Y.addView(this.B, k7.c6.c(-1.0f, -1));
        this.B.setOnScrollListener(new l3(this));
        int i14 = this.f41196h0;
        if (i14 != -1) {
            this.D.h1(i14, this.f41197i0);
            this.f41196h0 = -1;
        }
        ?? view = new View(context);
        this.X = view;
        view.setup(aVar3);
        this.X.setFadeZoneTop(AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.X.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.X.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.X.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.Y.addView(this.X, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41213w = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.f41213w, k7.c6.e(-1, -1, 51));
        View view2 = new View(context);
        this.f41215x = view2;
        view2.setBackground(new org.telegram.ui.ActionBar.x5(this.f41215x, this.Y, AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.f21692f2));
        this.f41213w.addView(this.f41215x, k7.c6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41217y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.f41217y.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f41213w.addView(this.f41217y, k7.c6.e(32, 32, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        this.N = v0Var;
        v0Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, k7.c6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        xg.e eVar = new xg.e(context, aVar, g6Var, sg.b.b(g6Var));
        this.H = eVar;
        eVar.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.H.c(4, true, false);
        xg.e eVar2 = this.H;
        qg.b c3 = eVar2.f50571n.c(eVar2, null, false);
        c3.n(eVar2.f50572r);
        c3.p(AndroidUtilities.dp(22.0f));
        c3.o(AndroidUtilities.dp(6.0f));
        eVar2.f50573s = c3;
        this.Y.addView(this.H, k7.c6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final sb f43591b;

            {
                this.f43591b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        sb sbVar = this.f43591b;
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(sbVar, sbVar.f41212v0, sbVar.f41216x0, sbVar.f41208s.megagroup);
                            h0Var.S(sbVar.f41211u0);
                            h0Var.f27341d0 = new wa(sbVar);
                            sbVar.showDialog(h0Var);
                            return;
                        }
                        return;
                    case 1:
                        sb sbVar2 = this.f43591b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar2.getParentActivity());
                        if (sbVar2.f41208s.megagroup) {
                            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.O = string;
                        sbVar2.showDialog(d2Var);
                        return;
                    default:
                        sb sbVar3 = this.f43591b;
                        if (sbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(sbVar3.O.getSearchField());
                            sbVar3.showDialog(org.telegram.ui.Components.z4.p(sbVar3.getParentActivity(), new ta(sbVar3, 0), null).f21207a);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ae, false));
        this.G.setText(LocaleController.getString(R.string.SETTINGS));
        this.G.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.H.getContainer().addView(this.G, k7.c6.e(-2, -2, 17));
        xg.e eVar3 = this.H;
        eVar3.f50570f.add(this.G);
        this.H.d(false);
        xg.e eVar4 = this.H;
        eVar4.f50567b[4] = new View.OnClickListener(this) {
            public final sb f43591b;

            {
                this.f43591b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        sb sbVar = this.f43591b;
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(sbVar, sbVar.f41212v0, sbVar.f41216x0, sbVar.f41208s.megagroup);
                            h0Var.S(sbVar.f41211u0);
                            h0Var.f27341d0 = new wa(sbVar);
                            sbVar.showDialog(h0Var);
                            return;
                        }
                        return;
                    case 1:
                        sb sbVar2 = this.f43591b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar2.getParentActivity());
                        if (sbVar2.f41208s.megagroup) {
                            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.O = string;
                        sbVar2.showDialog(d2Var);
                        return;
                    default:
                        sb sbVar3 = this.f43591b;
                        if (sbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(sbVar3.O.getSearchField());
                            sbVar3.showDialog(org.telegram.ui.Components.z4.p(sbVar3.getParentActivity(), new ta(sbVar3, 0), null).f21207a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41187b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f41187b0.setVisibility(4);
        this.f41187b0.setFocusable(true);
        this.f41187b0.setFocusableInTouchMode(true);
        this.f41187b0.setClickable(true);
        this.f41187b0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.Y.addView(this.f41187b0, k7.c6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f41189c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f41189c0.setImageResource(R.drawable.msg_calendar);
        this.f41189c0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22025xe, false), PorterDuff.Mode.MULTIPLY));
        this.f41187b0.addView(this.f41189c0, k7.c6.e(48, 48, 53));
        this.f41189c0.setOnClickListener(new View.OnClickListener(this) {
            public final sb f43591b;

            {
                this.f43591b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        sb sbVar = this.f43591b;
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.h0 h0Var = new org.telegram.ui.Components.h0(sbVar, sbVar.f41212v0, sbVar.f41216x0, sbVar.f41208s.megagroup);
                            h0Var.S(sbVar.f41211u0);
                            h0Var.f27341d0 = new wa(sbVar);
                            sbVar.showDialog(h0Var);
                            return;
                        }
                        return;
                    case 1:
                        sb sbVar2 = this.f43591b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar2.getParentActivity());
                        if (sbVar2.f41208s.megagroup) {
                            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail));
                        } else {
                            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.EventLogInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.O = string;
                        sbVar2.showDialog(d2Var);
                        return;
                    default:
                        sb sbVar3 = this.f43591b;
                        if (sbVar3.getParentActivity() != null) {
                            AndroidUtilities.hideKeyboard(sbVar3.O.getSearchField());
                            sbVar3.showDialog(org.telegram.ui.Components.z4.p(sbVar3.getParentActivity(), new ta(sbVar3, 0), null).f21207a);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f41190d0 = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22044ye, false));
        this.f41190d0.setTextSize(15);
        this.f41190d0.setTypeface(AndroidUtilities.bold());
        this.f41187b0.addView(this.f41190d0, k7.c6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.f41209s0 && this.f41203o0.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41213w, true, 0.3f, true);
            this.B.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.f41213w, false, 0.3f, true);
            this.B.setEmptyView(this.I);
        }
        hb hbVar5 = this.B;
        hbVar5.V1 = true;
        hbVar5.W1 = 1;
        UndoView undoView = new UndoView(context);
        this.C = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.Y.addView(this.C, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        c1();
        return this.fragmentView;
    }

    public final void d1() {
        MessageObject messageObject;
        int i10;
        hb hbVar = this.B;
        if (hbVar == null) {
            return;
        }
        int childCount = hbVar.getChildCount();
        int measuredHeight = this.B.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z4 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z10 = false;
        org.telegram.ui.Cells.t1 t1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.B.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                float y10 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                u1Var.f24190f = y10;
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
                t1Var2.b4(i10, measuredHeight2 - i10, (this.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.B.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject2 = t1Var2.getMessageObject();
                if (this.f41192e0 != null && messageObject2.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject2)) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    this.f41192e0.setTranslationX(photoImage.getImageX());
                    this.f41192e0.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.f41192e0.invalidate();
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
                    if ((childAt instanceof org.telegram.ui.Cells.t1) || (childAt instanceof org.telegram.ui.Cells.v0)) {
                        t1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                ib ibVar = this.D0;
                if ((ibVar == null || (!ibVar.a0(childAt) && !this.D0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.v0) && ((org.telegram.ui.Cells.v0) childAt).getMessageObject().isDateObject) {
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
        l0 l0Var = this.f41192e0;
        if (l0Var != null) {
            if (!z10) {
                l0Var.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.W) {
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
            this.N.T(messageObject.messageOwner.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof org.telegram.ui.Cells.t1) && !(view2 instanceof org.telegram.ui.Cells.v0)) {
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
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Cells.t1 t1Var2;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var3;
        MessageObject messageObject3;
        boolean z4;
        if (i10 == NotificationCenter.emojiLoaded) {
            hb hbVar = this.B;
            if (hbVar != null) {
                hbVar.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(Q0(true), this.f41194f0, this.f41192e0, true);
                int childCount = this.B.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.B.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt;
                            MessageObject messageObject4 = t1Var4.getMessageObject();
                            if (this.f41192e0 != null && messageObject4.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject4)) {
                                ImageReceiver photoImage = t1Var4.getPhotoImage();
                                this.f41192e0.setTranslationX(photoImage.getImageX());
                                this.f41192e0.setTranslationY(photoImage.getImageY() + t1Var4.getTop() + this.fragmentView.getPaddingTop());
                                this.fragmentView.invalidate();
                                this.f41192e0.invalidate();
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
                if (this.f41192e0 != null) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (!z4) {
                        this.f41192e0.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                        this.fragmentView.invalidate();
                        if (playingMessageObject != null && playingMessageObject.isRoundVideo() && (this.W || PipRoundVideoView.C != null)) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    } else {
                        MediaController.getInstance().setCurrentVideoVisible(true);
                    }
                }
            }
            hb hbVar2 = this.B;
            if (hbVar2 != null) {
                int childCount2 = hbVar2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.B.getChildAt(i13);
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
                hb hbVar3 = this.B;
                if (hbVar3 != null) {
                    int childCount3 = hbVar3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.B.getChildAt(i14);
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
                this.Y.V(org.telegram.ui.ActionBar.k6.r0());
                this.f41215x.invalidate();
                hg.q qVar = this.M;
                if (qVar != null) {
                    qVar.invalidate();
                }
                this.B.f1();
            }
        } else {
            hb hbVar4 = this.B;
            if (hbVar4 != null) {
                int childCount4 = hbVar4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.B.getChildAt(i15);
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
        boolean z4;
        hb hbVar = this.B;
        if (hbVar != null) {
            int childCount = hbVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.B.getChildAt(i10);
                boolean z10 = true;
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.s()) {
                            t1Var.setDrawSelectionBackground(false);
                            t1Var.J3(false, true);
                            t1Var.L3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.getRealId() == this.H0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        t1Var.setHighlighted(z4);
                        if (this.H0 != Integer.MAX_VALUE) {
                            va vaVar = this.J0;
                            if (vaVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(vaVar);
                            }
                            va vaVar2 = new va(this, 0);
                            this.J0 = vaVar2;
                            AndroidUtilities.runOnUIThread(vaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f41214w0)) {
                            t1Var.S3(this.f41214w0);
                        } else {
                            t1Var.S3(null);
                        }
                        if (this.B.getScrollState() == 0) {
                            z10 = false;
                        }
                        t1Var.setSpoilersSuppressed(z10);
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
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Nd));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21930s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.f21981v8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar2, 64, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.f21946t8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar3, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J.getTitleTextView(), 4, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.k6.f21638c2, org.telegram.ui.ActionBar.k6.f21655d2}, org.telegram.ui.ActionBar.k6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21752i8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21769j8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21787k8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21805l8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21823m8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21841n8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21859o8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21818m3, org.telegram.ui.ActionBar.k6.f21891q3}, null, org.telegram.ui.ActionBar.k6.f21916ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21836n3, org.telegram.ui.ActionBar.k6.f21909r3}, null, org.telegram.ui.ActionBar.k6.f21665dc));
        Drawable[] k10 = org.telegram.ui.ActionBar.k6.f21818m3.k();
        int i13 = org.telegram.ui.ActionBar.k6.f21947ta;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21891q3.k(), null, i13));
        Drawable[] k11 = org.telegram.ui.ActionBar.k6.f21854o3.k();
        int i14 = org.telegram.ui.ActionBar.k6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21926s3.k(), null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21872p3, org.telegram.ui.ActionBar.k6.f21942t3}, null, org.telegram.ui.ActionBar.k6.Ba));
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.f21925s2;
        int i15 = org.telegram.ui.ActionBar.k6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, new Class[]{org.telegram.ui.Cells.v0.class}, textPaint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 2, new Class[]{org.telegram.ui.Cells.v0.class}, org.telegram.ui.ActionBar.k6.f21925s2, null, null, org.telegram.ui.ActionBar.k6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21996w4, org.telegram.ui.ActionBar.k6.f21892q4, org.telegram.ui.ActionBar.k6.f22015x4, org.telegram.ui.ActionBar.k6.f21977v4, org.telegram.ui.ActionBar.k6.f21959u4, org.telegram.ui.ActionBar.k6.C4}, null, org.telegram.ui.ActionBar.k6.f21791kc));
        int i16 = org.telegram.ui.ActionBar.k6.f21809lc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.v0.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21826mc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21683ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21701fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.k6.f21720gc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.k6.f21737hc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22033y3}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22051z3}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21932sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.O3, org.telegram.ui.ActionBar.k6.S3, org.telegram.ui.ActionBar.k6.W3}, null, org.telegram.ui.ActionBar.k6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.P3, org.telegram.ui.ActionBar.k6.T3, org.telegram.ui.ActionBar.k6.X3}, null, org.telegram.ui.ActionBar.k6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.M3, org.telegram.ui.ActionBar.k6.Q3, org.telegram.ui.ActionBar.k6.U3}, null, org.telegram.ui.ActionBar.k6.f22023xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.N3, org.telegram.ui.ActionBar.k6.R3, org.telegram.ui.ActionBar.k6.V3}, null, org.telegram.ui.ActionBar.k6.f22042yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21602a4, org.telegram.ui.ActionBar.k6.f21621b4, org.telegram.ui.ActionBar.k6.Z3}, null, org.telegram.ui.ActionBar.k6.f22057zc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21676e4}, null, org.telegram.ui.ActionBar.k6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21694f4}, null, org.telegram.ui.ActionBar.k6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21639c4}, null, org.telegram.ui.ActionBar.k6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21657d4}, null, org.telegram.ui.ActionBar.k6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21712g4}, null, org.telegram.ui.ActionBar.k6.Cc));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.k6.f21748i4};
        int i17 = org.telegram.ui.ActionBar.k6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i17));
        Drawable[] drawableArr2 = {org.telegram.ui.ActionBar.k6.f21730h4, org.telegram.ui.ActionBar.k6.B4, org.telegram.ui.ActionBar.k6.D4};
        int i18 = org.telegram.ui.ActionBar.k6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.I4, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.J4, null, org.telegram.ui.ActionBar.k6.Wa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.G4, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.H4, null, org.telegram.ui.ActionBar.k6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.O4}, null, org.telegram.ui.ActionBar.k6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.P4}, null, org.telegram.ui.ActionBar.k6.f21913r7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.Q4}, null, org.telegram.ui.ActionBar.k6.f21898qa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.f21619b2, null, null, org.telegram.ui.ActionBar.k6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21765j4}, null, org.telegram.ui.ActionBar.k6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.J2, null, null, org.telegram.ui.ActionBar.k6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.K2, null, null, org.telegram.ui.ActionBar.k6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.T1, null, null, org.telegram.ui.ActionBar.k6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.Q2, null, null, org.telegram.ui.ActionBar.k6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Rc));
        int i19 = org.telegram.ui.ActionBar.k6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.k6.f21609ab;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21628bb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21646cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21664db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21682eb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21611ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21700fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21630bd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21648cd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21719gb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21666dd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21736hb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21684ed));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21755ib));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21702fd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21772jb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21738hd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21756id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21773jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21917rb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21792kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21845nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21863od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21844nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21882pd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21808lb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21948tb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21933sd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21966ub));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21950td));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21984vb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21968ud));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22003wb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22005wd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22041yb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22024xd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21986vd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22022xb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22043yd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.U1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21757ie));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21967uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21774je));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21985vc));
        Drawable[] drawableArr3 = org.telegram.ui.ActionBar.k6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.k6.f21919re));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[0]}, null, org.telegram.ui.ActionBar.k6.f21934se));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr3[1]}, null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21883pe));
        Drawable[] drawableArr4 = org.telegram.ui.ActionBar.k6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[0]}, null, org.telegram.ui.ActionBar.k6.f21901qe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr4[1]}, null, org.telegram.ui.ActionBar.k6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Ae));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41217y, 2048, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.k6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.k6.De));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.k6.Ee));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f41215x, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 536870912, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        int i21 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i22));
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
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f41208s);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new qa(this, 0)), this.classGuid);
        setBulletinDelegate(new hg.w(5));
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
        this.f41218y0.unlock();
    }

    @Override
    public final void onPause() {
        super.onPause();
        pb pbVar = this.Y;
        if (pbVar != null) {
            org.telegram.ui.Components.p81 p81Var = pbVar.v;
            if (p81Var != null) {
                p81Var.c(false);
            }
            pbVar.C = true;
        }
        UndoView undoView = this.C;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f41198j0 = true;
        this.f41199k0 = true;
        cb.m mVar = cb.m.f2423e;
        if (mVar != null && mVar.f2424a) {
            cb.m l10 = cb.m.l();
            if (l10.f2424a) {
                int i10 = e5.C;
                ((u4) l10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.f41195g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        pb pbVar = this.Y;
        if (pbVar != null) {
            org.telegram.ui.Components.p81 p81Var = pbVar.v;
            if (p81Var != null) {
                p81Var.c(true);
            }
            pbVar.C = false;
        }
        this.f41198j0 = false;
        O0(false);
        if (this.f41199k0) {
            this.f41199k0 = false;
            ob obVar = this.F;
            if (obVar != null) {
                obVar.l();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.f41218y0.unlock();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        if (z4) {
            this.f41218y0.lock();
        }
    }
}
