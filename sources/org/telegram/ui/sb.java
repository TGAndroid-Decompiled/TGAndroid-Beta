package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class sb extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static int Q0 = 10;
    public static final int[] R0 = {org.telegram.messenger.zs.T, org.telegram.messenger.zs.f19683s, org.telegram.messenger.zs.f19690t, org.telegram.messenger.zs.D, org.telegram.messenger.zs.G0};
    public boolean A0;
    public final fb B0;
    public ib C0;
    public org.telegram.ui.Components.vj0 D;
    public final ArrayList D0;
    public pb E;
    public final a0.h E0;
    public TextView F;
    public db F0;
    public bh.h G;
    public int G0;
    public FrameLayout H;
    public int H0;
    public org.telegram.ui.Components.sn I;
    public ua I0;
    public LinearLayout J;
    public org.telegram.ui.Cells.q1 J0;
    public ImageView K;
    public int K0;
    public ag.j3 L;
    public final rb L0;
    public org.telegram.ui.Cells.s0 M;
    public long M0;
    public org.telegram.ui.ActionBar.t0 N;
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
    public bh.i W;
    public qb X;
    public org.telegram.messenger.jj Y;
    public TLRPC.ChannelParticipant Z;
    public final hi.g f41425a;
    public FrameLayout f41426a0;
    public final tg.b f41427b;
    public ImageView f41428b0;
    public final tg.b f41429c;
    public org.telegram.ui.ActionBar.u5 f41430c0;
    public final tg.f d;
    public l0 f41431d0;
    public final int e;
    public k4 f41432e0;
    public final TLRPC.Chat f41433f;
    public TextureView f41434f0;
    public int f41435g0;
    public final ArrayList h;
    public int f41436h0;
    public boolean f41437i0;
    public boolean f41438j0;
    public final a0.h f41439k0;
    public final a0.h f41440l0;
    public final HashMap m0;
    public FrameLayout f41441n;
    public final ArrayList f41442n0;
    public final ArrayList f41443o0;
    public final HashSet f41444p0;
    public boolean f41445q0;
    public View f41446r;
    public boolean f41447r0;
    public RadialProgressView f41448s;
    public boolean f41449s0;
    public ArrayList f41450t0;
    public TLRPC.TL_channelAdminLogEventsFilter f41451u0;
    public String f41452v0;
    public ag.b1 f41453w;
    public a0.h f41454w0;
    public UndoView f41455x;
    public final e2.f f41456x0;
    public dh.f f41457y;
    public final HashMap f41458y0;
    public HashMap f41459z0;

    public sb(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.T = new int[]{2};
        this.f41435g0 = -1;
        this.f41436h0 = 0;
        this.f41437i0 = true;
        this.f41438j0 = false;
        this.f41439k0 = new a0.h();
        this.f41440l0 = new a0.h();
        this.m0 = new HashMap();
        this.f41442n0 = new ArrayList();
        this.f41443o0 = new ArrayList();
        this.f41444p0 = new HashSet();
        this.f41451u0 = null;
        this.f41452v0 = "";
        this.f41456x0 = new e2.f(R0);
        this.f41458y0 = new HashMap();
        this.B0 = new fb(this);
        this.D0 = new ArrayList();
        this.E0 = new a0.h();
        this.G0 = Integer.MAX_VALUE;
        this.H0 = -1;
        this.L0 = new rb(this);
        this.N0 = -1;
        this.P0 = new RectF();
        ei.r rVar = this.glassEngine;
        rVar.f6670a = new va(this);
        rVar.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
        ?? obj = new Object();
        this.f41425a = obj;
        tg.b bVar = new tg.b(obj);
        this.f41427b = bVar;
        bVar.h = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.f()) {
            tg.f fVar = new tg.f(false);
            this.d = fVar;
            this.glassEngine.a(fVar);
            hi.f fVar2 = new hi.f(obj);
            fVar2.d = fVar;
            fVar2.e = -3;
            fVar2.f7719f = obj;
            if (org.telegram.messenger.sc.e(262144)) {
                hi.f fVar3 = new hi.f(obj);
                fVar3.d = fVar;
                fVar3.e = -2;
                fVar3.f7719f = obj;
                tg.b bVar2 = new tg.b(fVar3);
                this.f41429c = bVar2;
                bVar2.h = this.glassEngine;
                if (org.telegram.messenger.sc.e(262144)) {
                    L2 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.i0.L(48.0f);
                }
                bVar2.f48698b = L2;
                bVar2.f48699c = L2;
                bVar2.f48702i = true;
                this.e = 0;
            } else {
                tg.b bVar3 = new tg.b(fVar2);
                this.f41429c = bVar3;
                bVar3.h = this.glassEngine;
                if (org.telegram.messenger.sc.e(262144)) {
                    L = org.telegram.messenger.i0.L(8.0f);
                } else {
                    L = org.telegram.messenger.i0.L(48.0f);
                }
                bVar3.f48698b = L;
                bVar3.f48699c = L;
                this.e = org.telegram.messenger.i0.L(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            tg.b bVar4 = new tg.b(obj);
            this.f41429c = bVar4;
            bVar4.h = this.glassEngine;
        }
        this.f41433f = chat;
    }

    public static int A0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int B0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int C0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int D0(sb sbVar) {
        return sbVar.classGuid;
    }

    public static void E0(sb sbVar, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        org.telegram.messenger.vp messagesController = sbVar.getMessagesController();
        TLRPC.Chat chat = sbVar.f41433f;
        TLRPC.ChatFull M0 = messagesController.M0(chat.f19793id);
        org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(sbVar.X.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, M0, hashMap, sbVar, M0.f19794id, false, org.telegram.messenger.w3.T(chat));
        c60Var.a2 = new gb(sbVar);
        c60Var.show();
    }

    public static org.telegram.ui.ActionBar.l K0(sb sbVar) {
        return sbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l L0(sb sbVar) {
        return sbVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l M0(sb sbVar) {
        return sbVar.actionBar;
    }

    public static int N0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static void O0(sb sbVar) {
        if (sbVar.f41453w != null && !sbVar.f41442n0.isEmpty()) {
            sbVar.f41457y.h1(sbVar.f41443o0.size() - 1, (-100000) - sbVar.f41453w.getPaddingTop());
        }
    }

    public static int P0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static iy0 W0(CharSequence charSequence) {
        org.telegram.ui.Components.dq[] dqVarArr;
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.dq dqVar : (org.telegram.ui.Components.dq[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.dq.class)) {
                if (dqVar != null) {
                    Drawable drawable = dqVar.f25505c;
                    if (drawable instanceof iy0) {
                        return (iy0) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void Y(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        org.telegram.messenger.jj jjVar;
        a0.h hVar = sbVar.f41439k0;
        int i10 = 0;
        sbVar.C0.N = false;
        sbVar.a1(false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).V3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).P3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = sbVar.f41442n0;
        boolean z10 = false;
        for (int i11 = 0; i11 < tL_channels_adminLogResults.events.size(); i11++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i11);
            if (hVar.h(tL_channelAdminLogEvent.f19825id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.O = Math.min(sbVar.O, tL_channelAdminLogEvent.f19825id);
                org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(sbVar.currentAccount, tL_channelAdminLogEvent, arrayList, sbVar.m0, sbVar.f41433f, sbVar.T, false);
                if (jjVar2.U >= 0) {
                    hVar.k(jjVar2, tL_channelAdminLogEvent.f19825id);
                }
                z10 = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(size);
            if (jjVar3 != null && jjVar3.U != 0 && jjVar3.M1() >= 0) {
                sbVar.f41440l0.k(jjVar3, jjVar3.M1());
            }
            if (jjVar3 != null && (message = jjVar3.f16337k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (size != i12) {
                                jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
                                if (jjVar.U != 1 && jjVar.M1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i12++;
                        } else {
                            jjVar = null;
                            break;
                        }
                    }
                    if (jjVar != null) {
                        jjVar3.C = jjVar;
                    }
                }
                arrayList2.add(jjVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.ui.b0(sbVar.currentAccount).X0(arrayList2, -sbVar.f41433f.f19793id, 0, 0L, new ua(sbVar, 1), sbVar.getClassGuid(), null);
        }
        sbVar.V0();
        sbVar.f41447r0 = false;
        if (!z10) {
            sbVar.f41445q0 = true;
        }
        org.telegram.messenger.i0.Y3(sbVar.f41441n, false, 0.3f, true, true);
        sbVar.f41453w.setEmptyView(sbVar.H);
        pb pbVar = sbVar.E;
        if (pbVar != null) {
            pbVar.f();
        }
        org.telegram.ui.ActionBar.t0 t0Var = sbVar.N;
        if (t0Var != null) {
            if (sbVar.f41443o0.isEmpty() && TextUtils.isEmpty(sbVar.f41452v0)) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
        }
    }

    public static void Z(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && sbVar.getParentActivity() != null) {
            int i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232561, 0, sbVar.getParentActivity(), sbVar.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
            Rect rect = new Rect();
            sbVar.getParentActivity().getResources().getDrawable(2131232561).mutate().getPadding(rect);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, sbVar.getResourceProvider());
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                if (arrayList4.get(i11) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.h1(sbVar.getParentActivity(), sbVar.getResourceProvider()), w7.b6.o(-1, 8));
                } else {
                    Activity parentActivity = sbVar.getParentActivity();
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
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, parentActivity, sbVar.getResourceProvider(), z10, z11);
                    b1Var.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
                    b1Var.j((CharSequence) arrayList2.get(i11), ((Integer) arrayList3.get(i11)).intValue(), null);
                    if (((Integer) arrayList4.get(i11)).intValue() == 35) {
                        b1Var.d(sbVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21170q7), sbVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21153p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                    b1Var.setOnClickListener(new ya(sbVar, i11, arrayList4, (Integer) arrayList4.get(i11), 0));
                }
                i11++;
                arrayList4 = arrayList;
            }
            cb cbVar = new cb(0, sbVar.X.getContext(), sbVar);
            cbVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            cbVar.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            db dbVar = new db(sbVar, cbVar);
            sbVar.F0 = dbVar;
            dbVar.e = true;
            dbVar.f20456c = 220;
            dbVar.setOutsideTouchable(true);
            sbVar.F0.setClippingEnabled(true);
            sbVar.F0.setAnimationStyle(2131755192);
            sbVar.F0.setFocusable(true);
            cbVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
            sbVar.F0.setInputMethodMode(2);
            sbVar.F0.setSoftInputMode(48);
            sbVar.F0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f7)) - cbVar.getMeasuredWidth()) + rect.left) - org.telegram.messenger.i0.L(28.0f);
            if (left < org.telegram.messenger.i0.L(6.0f)) {
                left = org.telegram.messenger.i0.L(6.0f);
            } else if (left > (sbVar.f41453w.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f)) - cbVar.getMeasuredWidth()) {
                left = (sbVar.f41453w.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f)) - cbVar.getMeasuredWidth();
            }
            if (org.telegram.messenger.i0.Q1()) {
                int[] iArr = new int[2];
                sbVar.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = sbVar.X.getHeight();
            int L = org.telegram.messenger.i0.L(48.0f) + cbVar.getMeasuredHeight();
            int Q = sbVar.X.Q();
            if (Q > org.telegram.messenger.i0.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                int y3 = (int) (sbVar.f41453w.getY() + view.getTop() + f10);
                if ((L - rect.top) - rect.bottom > org.telegram.messenger.i0.L(240.0f)) {
                    i10 = (org.telegram.messenger.i0.L(240.0f) - L) + y3;
                } else {
                    i10 = y3;
                }
                if (i10 < sbVar.f41453w.getY() + org.telegram.messenger.i0.L(24.0f)) {
                    i10 = (int) (sbVar.f41453w.getY() + org.telegram.messenger.i0.L(24.0f));
                } else {
                    int i12 = height - L;
                    if (i10 > i12 - org.telegram.messenger.i0.L(8.0f)) {
                        i10 = i12 - org.telegram.messenger.i0.L(8.0f);
                    }
                }
            } else if (!sbVar.inBubbleMode) {
                i10 = org.telegram.messenger.i0.f16020m;
            }
            cbVar.setMaxHeight(height - i10);
            sbVar.F0.showAtLocation(sbVar.f41453w, 51, left, i10);
            sbVar.F0.b();
        }
    }

    public static void a0(org.telegram.ui.sb r22, int r23, java.util.ArrayList r24, java.lang.Integer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.a0(org.telegram.ui.sb, int, java.util.ArrayList, java.lang.Integer):void");
    }

    public static void b0(sb sbVar, int i10) {
        tg.f fVar = sbVar.d;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                gi.a e = sbVar.glassEngine.e();
                e.b(sbVar.f41453w.getY(), sbVar.X.getWidth(), sbVar.f41453w.getY() + sbVar.f41453w.getHeight());
                fVar.h(e);
            }
            qb qbVar = sbVar.X;
            Objects.requireNonNull(qbVar);
            fVar.e(new sa(qbVar, 0), sbVar.X.getWidth(), sbVar.X.getHeight());
        }
    }

    public static void c0(sb sbVar, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        a0.h hVar = sbVar.f41439k0;
        sbVar.f41449s0 = false;
        sbVar.C0.N = false;
        sbVar.a1(false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).V3(tL_channels_adminLogResults.users, false);
        org.telegram.messenger.vp.r1(sbVar.currentAccount).P3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_channels_adminLogResults.events.size(); i10++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i10);
            if (hVar.h(tL_channelAdminLogEvent2.f19825id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                sbVar.O = Math.min(sbVar.O, tL_channelAdminLogEvent2.f19825id);
                org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(sbVar.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, sbVar.f41433f, sbVar.T, false);
                if (jjVar.U >= 0 && (((tL_channelAdminLogEvent = jjVar.J1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !hVar.d(tL_channelAdminLogEvent2.f19825id))) {
                    sbVar.f41442n0.add(0, jjVar);
                    hVar.k(jjVar, tL_channelAdminLogEvent2.f19825id);
                    z10 = true;
                }
            }
        }
        if (sbVar.E != null && z10) {
            sbVar.V0();
            sbVar.E.f();
        }
    }

    public static void d0(sb sbVar, TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull M0;
        TLRPC.Chat chat = sbVar.f41433f;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            sbVar.getMessagesController().V3(tL_channels_channelParticipants.users, false);
            sbVar.getMessagesController().P3(tL_channels_channelParticipants.chats, false);
            sbVar.f41450t0 = tL_channels_channelParticipants.participants;
            if (chat != null && (M0 = sbVar.getMessagesController().M0(chat.f19793id)) != null && M0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = sbVar.getMessagesController().f18785f5;
                channelParticipant.peer = sbVar.getMessagesController().y1(channelParticipant.user_id);
                long j10 = sbVar.getMessagesController().f18785f5;
                if (sbVar.getMessagesController().Z1(Long.valueOf(j10)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j10;
                    tL_users_getUsers.f19936id.add(tL_inputUser);
                    ConnectionsManager.getInstance(sbVar.currentAccount).sendRequest(tL_users_getUsers, new ta(sbVar, 1));
                }
                sbVar.f41450t0.add(0, channelParticipant);
            }
            Dialog dialog = sbVar.visibleDialog;
            if (dialog instanceof org.telegram.ui.Components.i0) {
                ((org.telegram.ui.Components.i0) dialog).e1(sbVar.f41450t0);
            }
        }
    }

    public static void d1(int i10, org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        if (i10 <= 0) {
            TLRPC.ReplyMarkup replyMarkup = jjVar.f16337k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = jjVar.f16337k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            jjVar.f16337k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = org.telegram.messenger.cd.G(i10, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        jjVar.i5();
    }

    public static CharSequence e1(SpannableStringBuilder spannableStringBuilder) {
        int t10 = org.telegram.messenger.i0.t(spannableStringBuilder, "\n\n");
        if (t10 >= 0 && Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.j();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.i0.L(8.0f)), t10 + 1, t10 + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int p0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int q0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int r0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int s0(sb sbVar) {
        return sbVar.classGuid;
    }

    public static void t0(org.telegram.ui.sb r5, android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.t0(org.telegram.ui.sb, android.os.Bundle, long):void");
    }

    public static int u0(sb sbVar) {
        return sbVar.currentAccount;
    }

    public static int v0(sb sbVar) {
        return sbVar.currentAccount;
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

    public static void z0(sb sbVar, org.telegram.messenger.jj jjVar) {
        if (sbVar.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        if (jjVar.D == 3) {
            x1Var.T = org.telegram.messenger.cd.L0(2131748194, null);
        } else {
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131748222, jjVar.F0().mime_type);
        }
        sbVar.showDialog(x1Var);
    }

    public final org.telegram.messenger.jj R0(long j10, long j11, ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        String str;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f41443o0;
            jjVar = null;
            if (i10 < arrayList2.size()) {
                jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i10);
                if (jjVar2 != null && jjVar2.U == 1 && jjVar2.H0 == j10) {
                    break;
                }
                i10++;
            } else {
                jjVar2 = null;
                break;
            }
        }
        if (jjVar2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f41433f.f19793id;
            tL_message.f19814id = -1;
            try {
                tL_message.date = ((org.telegram.messenger.jj) arrayList.get(0)).f16337k.date;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            jjVar2 = new org.telegram.messenger.jj(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
        jjVar2.U = 1;
        if (z11 && arrayList.size() > 1) {
            jjVar2.H0 = j10;
        } else {
            jjVar2.H0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new k2.f(7)).distinct().map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long l4 = (Long) obj;
                sb sbVar = sb.this;
                sbVar.getClass();
                if (l4.longValue() < 0) {
                    TLRPC.Chat L0 = sbVar.getMessagesController().L0(Long.valueOf(-l4.longValue()));
                    if (L0 == null) {
                        return null;
                    }
                    return L0.title;
                }
                return org.telegram.messenger.h20.k(sbVar.getMessagesController().Z1(l4));
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new xa(0)).limit(4L).toArray());
        if (z11) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.jj.D5(org.telegram.messenger.cd.G(arrayList.size(), str, join), "un1", Z1));
        if (z11 && arrayList.size() > 1) {
            iy0 W0 = W0(jjVar2.v);
            int i11 = 2131751036;
            if (W0 == null) {
                if (z10) {
                    i11 = 2131751037;
                }
                W0 = new iy0(org.telegram.messenger.cd.L0(i11, null));
                Typeface o10 = org.telegram.messenger.i0.o();
                org.telegram.ui.Components.e6 e6Var = W0.f38374a;
                e6Var.x(o10);
                e6Var.w(org.telegram.messenger.i0.L(10.0f));
                if (W0.f38376c != -1) {
                    W0.f38376c = -1;
                    W0.invalidateSelf();
                }
                W0.a(503316480);
            } else {
                org.telegram.ui.Components.e6 e6Var2 = W0.f38374a;
                if (z10) {
                    i11 = 2131751037;
                }
                e6Var2.t(org.telegram.messenger.cd.L0(i11, null), false, true);
            }
            W0.setBounds(0, 0, W0.getIntrinsicWidth(), org.telegram.messenger.i0.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(0, W0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        jjVar2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
        }
        if (jjVar != null) {
            long j12 = jjVar.T;
            a0.h hVar = this.E0;
            if (!hVar.d(j12)) {
                long j13 = jjVar.T;
                int i12 = Q0;
                Q0 = i12 + 1;
                hVar.k(Integer.valueOf(i12), j13);
            }
            jjVar2.f16339k1 = ((Integer) hVar.f(jjVar.T)).intValue();
        }
        return jjVar2;
    }

    public final void S0(boolean z10) {
        int abs;
        dh.f fVar = this.f41457y;
        if (fVar != null && !this.f41437i0) {
            int L0 = fVar.L0();
            int i10 = 1;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.f41457y.N0() - L0) + 1;
            }
            if (abs > 0) {
                this.E.getClass();
                if (z10) {
                    i10 = 4;
                }
                if (L0 <= i10 && !this.f41447r0 && !this.f41445q0) {
                    Y0(false);
                }
            }
        }
    }

    public final boolean T0(android.view.View r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.T0(android.view.View, float, float):boolean");
    }

    public final TextureView U0(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.f41431d0 == null) {
            l0 l0Var = new l0(this, getParentActivity(), 4);
            this.f41431d0 = l0Var;
            l0Var.setOutlineProvider(new bi.d2(7));
            this.f41431d0.setClipToOutline(true);
            this.f41431d0.setWillNotDraw(false);
            this.f41431d0.setVisibility(4);
            k4 k4Var = new k4(getParentActivity());
            this.f41432e0 = k4Var;
            k4Var.setBackgroundColor(0);
            if (z10) {
                this.f41431d0.addView(this.f41432e0, w7.b6.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f41434f0 = textureView;
            textureView.setOpaque(false);
            this.f41432e0.addView(this.f41434f0, w7.b6.c(-1.0f, -1));
        }
        if (this.f41431d0.getParent() == null) {
            qb qbVar = this.X;
            l0 l0Var2 = this.f41431d0;
            int i10 = org.telegram.messenger.i0.f16030u;
            qbVar.addView(l0Var2, 1, new FrameLayout.LayoutParams(i10, i10));
        }
        this.f41431d0.setVisibility(4);
        this.f41432e0.setDrawingReady(false);
        return this.f41434f0;
    }

    public final void V0() {
        long j10;
        org.telegram.messenger.jj jjVar;
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
            ArrayList arrayList4 = this.f41442n0;
            if (i12 < arrayList4.size()) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList4.get(i12);
                if (jjVar2 != null && (tL_channelAdminLogEvent2 = jjVar2.J1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j10 = tL_channelAdminLogEvent2.user_id;
                } else {
                    j10 = 0;
                }
                if (jjVar2.f16339k1 <= 0) {
                    int i13 = Q0;
                    Q0 = i13 + 1;
                    jjVar2.f16339k1 = i13;
                }
                int i14 = i12 + 1;
                if (i14 < arrayList4.size()) {
                    jjVar = (org.telegram.messenger.jj) arrayList4.get(i14);
                } else {
                    jjVar = null;
                }
                if (jjVar != null && (tL_channelAdminLogEvent = jjVar.J1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j11 = tL_channelAdminLogEvent.user_id;
                } else {
                    j11 = 0;
                }
                if (j10 != 0) {
                    arrayList3.add(jjVar2);
                } else {
                    arrayList2.add(jjVar2);
                }
                if (j10 != j11 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = jjVar2.f16337k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((org.telegram.messenger.jj) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((org.telegram.messenger.jj) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) i0.a.g(1, arrayList3);
                        if (TextUtils.isEmpty(this.f41452v0) && arrayList3.size() > 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Long valueOf = Long.valueOf(jjVar3.T);
                        HashSet hashSet = this.f41444p0;
                        if (!hashSet.contains(valueOf) && z11) {
                            d1(arrayList3.size() - 1, jjVar3);
                            arrayList2.add(jjVar3);
                        } else {
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                d1(0, (org.telegram.messenger.jj) arrayList3.get(i15));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = jjVar3.f16337k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z10 != z12) {
                            jjVar3.K1 = true;
                            pb pbVar = this.E;
                            if (z10) {
                                i10 = arrayList3.size() - 1;
                            } else {
                                i10 = 0;
                            }
                            pbVar.g(i10 + size);
                            pb pbVar2 = this.E;
                            if (z10) {
                                i11 = arrayList3.size() - 1;
                            } else {
                                i11 = 0;
                            }
                            pbVar2.g(size + i11 + 1);
                        }
                        long j12 = jjVar2.T;
                        arrayList = arrayList3;
                        arrayList2.add(R0(j12, jjVar2.J1.user_id, arrayList3, hashSet.contains(Long.valueOf(j12)), z11));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) i0.a.g(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(R0(jjVar4.T, jjVar4.J1.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i12 = i14;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.f41443o0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void X0(boolean z10) {
        if (this.M.getTag() != null && !this.P) {
            if (!this.S || this.Q) {
                this.M.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.R = animatorSet;
                    animatorSet.setDuration(150L);
                    this.R.playTogether(ObjectAnimator.ofFloat(this.M, "alpha", 0.0f));
                    this.R.addListener(new s9(this, 12));
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

    public final void Y0(boolean z10) {
        pb pbVar;
        if (!this.f41447r0) {
            ArrayList arrayList = this.f41442n0;
            if (z10) {
                this.O = Long.MAX_VALUE;
                FrameLayout frameLayout = this.f41441n;
                if (frameLayout != null) {
                    org.telegram.messenger.i0.Y3(frameLayout, true, 0.3f, true, true);
                    this.H.setVisibility(4);
                    this.f41453w.setEmptyView(null);
                }
                this.f41439k0.b();
                arrayList.clear();
                this.m0.clear();
                V0();
            }
            this.f41447r0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = org.telegram.messenger.vp.h1(this.f41433f);
            tL_channels_getAdminLog.f19828q = this.f41452v0;
            tL_channels_getAdminLog.limit = 50;
            if (!z10 && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.O;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41451u0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.f41454w0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i10 = 0; i10 < this.f41454w0.m(); i10++) {
                    tL_channels_getAdminLog.admins.add(org.telegram.messenger.vp.r1(this.currentAccount).p1((TLRPC.User) this.f41454w0.n(i10)));
                }
            }
            f1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ta(this, 3));
            if (z10 && (pbVar = this.E) != null) {
                pbVar.f();
            }
        }
    }

    public final void Z0() {
        if (this.f41449s0) {
            return;
        }
        this.f41449s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = org.telegram.messenger.vp.h1(this.f41433f);
        tL_channels_getAdminLog.f19828q = this.f41452v0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.f41451u0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.f41454w0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i10 = 0; i10 < this.f41454w0.m(); i10++) {
                tL_channels_getAdminLog.admins.add(org.telegram.messenger.vp.r1(this.currentAccount).p1((TLRPC.User) this.f41454w0.n(i10)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ta(this, 0));
    }

    public final void a1(boolean z10) {
        int i10;
        long j10;
        ag.b1 b1Var = this.f41453w;
        if (b1Var != null && this.f41457y != null && b1Var.getChildCount() > 0) {
            if (z10) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            org.telegram.ui.Cells.q1 q1Var = null;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f41453w.getChildCount(); i12++) {
                View childAt = this.f41453w.getChildAt(i12);
                this.f41453w.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z10) {
                        if (top >= i10) {
                        }
                        i10 = childAt.getTop();
                        q1Var = childAt;
                        i11 = R;
                    } else {
                        if (top <= i10) {
                        }
                        i10 = childAt.getTop();
                        q1Var = childAt;
                        i11 = R;
                    }
                }
            }
            if (q1Var != null) {
                if (q1Var instanceof org.telegram.ui.Cells.q1) {
                    j10 = q1Var.getMessageObject().T;
                } else if (q1Var instanceof org.telegram.ui.Cells.s0) {
                    j10 = q1Var.getMessageObject().T;
                } else {
                    j10 = 0;
                }
                this.M0 = j10;
                this.N0 = i11;
                this.O0 = (this.f41453w.getMeasuredHeight() - q1Var.getBottom()) - this.f41453w.getPaddingBottom();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21232tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21213sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20955ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20992gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20974ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21045jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21026id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21319ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21335zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21302xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21317yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21284we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21300xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21266ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21282wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21249ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21231te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21247uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21212se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21229tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21193re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21210sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21176qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21159pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21142oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21157pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21123ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21140oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21103me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21121nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21046je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21084le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21066ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21027ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21044jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21025ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20991ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21007hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20973fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20937de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20897bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20918ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20899be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20971fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20952ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21318yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21301xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21283wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21248ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21230td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21173qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21187r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21281wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21211sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21192rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21175qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21158pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21141od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21122nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21102md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21083ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20990gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21316yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20878ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21156pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21228tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21209sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21191rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21139ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21174qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21227ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21190ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21136o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21117n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21097m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21078l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21060k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21040j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21022i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    public final int b1(org.telegram.messenger.jj jjVar) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i10;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.hj hjVar;
        if (!TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(jjVar.f16394z) && (q1Var = this.J0) != null && (hjVar = q1Var.f22615k3) != null) {
                i10 = (int) q1Var.f22701r3;
                charSequence = jjVar.f16394z;
                arrayList = hjVar.e;
            } else {
                CharSequence charSequence2 = jjVar.v;
                arrayList = jjVar.f16397z2;
                org.telegram.ui.Cells.q1 q1Var2 = this.J0;
                if (q1Var2 != null && q1Var2.f22725t1) {
                    i10 = q1Var2.U1 + org.telegram.messenger.i0.L(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.q1 q1Var3 = this.J0;
            if (q1Var3 != null) {
                q1Var3.Rc = 0;
                q1Var3.Sc = null;
            }
            if (arrayList != null && charSequence != null) {
                int Y = org.telegram.messenger.jj.Y(this.H0, charSequence.toString(), null);
                if (Y >= 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
                        String charSequence3 = gjVar.e.getText().toString();
                        int i12 = gjVar.f15718n;
                        if (Y > i12) {
                            if (Y - i12 > charSequence3.length() - 1) {
                                lineTop = i10 + ((int) (gjVar.o(arrayList) + gjVar.f15717f + gjVar.f15721w));
                            } else {
                                lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(Y - gjVar.f15718n)) + gjVar.o(arrayList) + i10 + gjVar.f15717f;
                            }
                            Point point = org.telegram.messenger.i0.f16026q;
                            float f10 = point.y;
                            float f11 = 0.5f;
                            if (this.X.getKeyboardHeight() > org.telegram.messenger.i0.L(20.0f)) {
                                f7 = 0.7f;
                            } else {
                                f7 = 0.5f;
                            }
                            if (lineTop > f10 * f7) {
                                float f12 = point.y;
                                if (this.X.getKeyboardHeight() > org.telegram.messenger.i0.L(20.0f)) {
                                    f11 = 0.7f;
                                }
                                return (int) (lineTop - (f12 * f11));
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
        } else {
            org.telegram.ui.Cells.q1 q1Var4 = this.J0;
            if (q1Var4 != null) {
                q1Var4.Rc = 0;
                q1Var4.Sc = null;
            }
        }
        return 0;
    }

    public final void c1(org.telegram.messenger.jj r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.c1(org.telegram.messenger.jj):void");
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 8; i10++) {
                arrayList.add(new org.telegram.ui.Cells.q1(context, this.currentAccount));
            }
        }
        this.U = false;
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.t6.K(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 22));
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, null);
        this.I = snVar;
        kl klVar = snVar.h;
        if (klVar != null) {
            klVar.setTextSizePx(org.telegram.messenger.i0.L(17.5f));
        }
        kl klVar2 = snVar.f30287r;
        if (klVar2 != null) {
            klVar2.setTextSizePx(org.telegram.messenger.i0.L(13.5f));
        }
        snVar.f30281l0 = true;
        this.I.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        this.actionBar.addView(this.I, 0, w7.b6.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 1);
        this.N = a2;
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.N.setSearchPaddingStart(7);
        this.I.setEnabled(false);
        org.telegram.ui.Components.sn snVar2 = this.I;
        TLRPC.Chat chat = this.f41433f;
        snVar2.setTitle(chat.title);
        this.I.setSubtitle(org.telegram.messenger.cd.L0(2131751075, null));
        this.I.setChatAvatar(chat);
        hb hbVar = new hb(this, context);
        this.fragmentView = hbVar;
        this.X = hbVar;
        hbVar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        this.X.U(org.telegram.ui.ActionBar.t6.s0());
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        xg.c p5 = w7.b9.p(this.resourceProvider);
        tg.b bVar = this.f41429c;
        lVar.M(bVar, p5, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setVisibility(4);
        this.X.addView(this.H, w7.b6.e(-1, -2, 17));
        this.H.setOnTouchListener(new org.telegram.ui.ActionBar.n2(6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.J = linearLayout;
        linearLayout.setBackground(new org.telegram.ui.ActionBar.g6(this.L, this.X, org.telegram.messenger.i0.L(12.0f), org.telegram.ui.ActionBar.t6.f20962f2));
        this.J.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.K.setImageResource(2131231612);
        this.K.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.K.setVisibility(8);
        this.J.addView(this.K, w7.b6.t(54, 54, 17, 16, 20, 16, -4));
        ag.j3 j3Var = new ag.j3(context, 7);
        this.L = j3Var;
        j3Var.setTextSize(1, 14.0f);
        this.L.setGravity(17);
        ag.j3 j3Var2 = this.L;
        int i11 = org.telegram.ui.ActionBar.t6.Wc;
        org.telegram.ui.ActionBar.a7.V(j3Var2, i11, null);
        this.L.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f));
        this.J.addView(this.L, w7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        this.H.addView(this.J, w7.b6.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        ag.b1 b1Var = new ag.b1(this, context, 4);
        this.f41453w = b1Var;
        b1Var.setOnItemClickListener(new e(this, 7));
        this.f41453w.setTag(1);
        this.f41453w.setVerticalScrollBarEnabled(true);
        ag.b1 b1Var2 = this.f41453w;
        pb pbVar = new pb(this, context);
        this.E = pbVar;
        b1Var2.setAdapter(pbVar);
        this.f41453w.setClipToPadding(false);
        ag.b1 b1Var3 = this.f41453w;
        int i12 = org.telegram.messenger.i0.f16020m;
        int i13 = this.e;
        b1Var3.setPadding(0, org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + i13, 0, org.telegram.messenger.i0.L(60.0f) + i13 + org.telegram.messenger.i0.f16021n);
        ag.b1 b1Var4 = this.f41453w;
        ib ibVar = new ib(this, this.f41453w, this.resourceProvider);
        this.C0 = ibVar;
        b1Var4.setItemAnimator(ibVar);
        this.C0.Q = true;
        this.f41453w.setLayoutAnimation(null);
        dh.f fVar = new dh.f(this);
        this.f41457y = fVar;
        fVar.j1(1);
        this.f41457y.l1(true);
        this.f41453w.setLayoutManager(this.f41457y);
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(this.f41453w, this.f41457y);
        this.D = vj0Var;
        vj0Var.h = new va(this);
        vj0Var.f31277i = this.L0;
        this.X.addView(this.f41453w, w7.b6.c(-1.0f, -1));
        this.f41453w.setOnScrollListener(new h3(this));
        this.glassEngine.b(this.f41453w);
        int i14 = this.f41435g0;
        if (i14 != -1) {
            this.f41457y.h1(i14, this.f41436h0);
            this.f41435g0 = -1;
        }
        bh.i iVar = new bh.i(context);
        this.W = iVar;
        iVar.setup(this.f41427b);
        this.W.setFadeZoneTop(org.telegram.messenger.i0.L(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m);
        this.W.setFadeHeightTop(org.telegram.messenger.i0.L(60.0f));
        this.W.setFadeZoneBottom(org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(44.0f) + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.f16021n);
        this.W.setFadeHeightBottom(org.telegram.messenger.i0.L(60.0f));
        this.X.addView(this.W, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f41441n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.X.addView(this.f41441n, w7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.f41446r = view;
        view.setBackground(new org.telegram.ui.ActionBar.g6(this.f41446r, this.X, org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.f20962f2));
        this.f41441n.addView(this.f41446r, w7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41448s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(28.0f));
        this.f41448s.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f41441n.addView(this.f41448s, w7.b6.e(32, 32, 17));
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
        this.M = s0Var;
        s0Var.setAlpha(0.0f);
        this.M.setImportantForAccessibility(2);
        this.X.addView(this.M, w7.b6.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.X.addView(this.actionBar);
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        bh.h hVar = new bh.h(context, p6Var, bVar, w7.b9.b(p6Var));
        this.G = hVar;
        hVar.setTotalVisibilityFactor(1.0f);
        this.G.setTranslationY(-org.telegram.messenger.i0.f16021n);
        this.G.c(4, true, false);
        bh.h hVar2 = this.G;
        vg.f c10 = hVar2.f2790n.c(hVar2, null, false);
        c10.o(hVar2.f2791r);
        org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(22.0f), 6.0f);
        hVar2.f2792s = c10;
        this.X.addView(this.G, w7.b6.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final sb f44058b;

            {
                this.f44058b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i15 = r2;
                sb sbVar = this.f44058b;
                switch (i15) {
                    case 0:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(sbVar, sbVar.f41451u0, sbVar.f41454w0, sbVar.f41433f.megagroup);
                            i0Var.e1(sbVar.f41450t0);
                            i0Var.Y1 = new va(sbVar);
                            sbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        boolean z10 = sbVar.f41433f.megagroup;
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        if (z10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750978, null));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131750976, null);
                        sbVar.showDialog(x1Var);
                        return;
                    default:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.messenger.i0.v1(sbVar.N.getSearchField());
                            sbVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(sbVar.getParentActivity(), new ra(sbVar, 0), null).f11587b);
                            return;
                        }
                        return;
                }
            }
        });
        this.F.setTextSize(1, 15.0f);
        this.F.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(this.F, org.telegram.ui.ActionBar.t6.f21160pf, null);
        this.F.setText(org.telegram.messenger.cd.L0(2131746000, null));
        this.F.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        this.G.getContainer().addView(this.F, w7.b6.e(-2, -2, 17));
        this.G.f2789f.add(this.F);
        this.G.d(false);
        this.G.f2787b[4] = new View.OnClickListener(this) {
            public final sb f44058b;

            {
                this.f44058b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i15 = r2;
                sb sbVar = this.f44058b;
                switch (i15) {
                    case 0:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(sbVar, sbVar.f41451u0, sbVar.f41454w0, sbVar.f41433f.megagroup);
                            i0Var.e1(sbVar.f41450t0);
                            i0Var.Y1 = new va(sbVar);
                            sbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        boolean z10 = sbVar.f41433f.megagroup;
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        if (z10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750978, null));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131750976, null);
                        sbVar.showDialog(x1Var);
                        return;
                    default:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.messenger.i0.v1(sbVar.N.getSearchField());
                            sbVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(sbVar.getParentActivity(), new ra(sbVar, 0), null).f11587b);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41426a0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.f41426a0.setVisibility(4);
        this.f41426a0.setFocusable(true);
        this.f41426a0.setFocusableInTouchMode(true);
        this.f41426a0.setClickable(true);
        this.f41426a0.setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, 0);
        this.X.addView(this.f41426a0, w7.b6.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.f41428b0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.f41428b0.setImageResource(2131232075);
        org.telegram.ui.ActionBar.a7.t(this.f41428b0, org.telegram.ui.ActionBar.t6.f21104mf, null, PorterDuff.Mode.MULTIPLY);
        this.f41426a0.addView(this.f41428b0, w7.b6.e(48, 48, 53));
        this.f41428b0.setOnClickListener(new View.OnClickListener(this) {
            public final sb f44058b;

            {
                this.f44058b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i15 = r2;
                sb sbVar = this.f44058b;
                switch (i15) {
                    case 0:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.ui.Components.i0 i0Var = new org.telegram.ui.Components.i0(sbVar, sbVar.f41451u0, sbVar.f41454w0, sbVar.f41433f.megagroup);
                            i0Var.e1(sbVar.f41450t0);
                            i0Var.Y1 = new va(sbVar);
                            sbVar.showDialog(i0Var);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        boolean z10 = sbVar.f41433f.megagroup;
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        if (z10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750978, null));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131750977, null));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131750976, null);
                        sbVar.showDialog(x1Var);
                        return;
                    default:
                        if (sbVar.getParentActivity() != null) {
                            org.telegram.messenger.i0.v1(sbVar.N.getSearchField());
                            sbVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(sbVar.getParentActivity(), new ra(sbVar, 0), null).f11587b);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f41430c0 = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21124nf, null);
        this.f41430c0.setTextSize(15);
        this.f41430c0.setTypeface(org.telegram.messenger.i0.o());
        this.f41426a0.addView(this.f41430c0, w7.b6.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.E.D(true);
        if (this.f41447r0 && this.f41442n0.isEmpty()) {
            org.telegram.messenger.i0.Y3(this.f41441n, true, 0.3f, true, true);
            this.f41453w.setEmptyView(null);
        } else {
            org.telegram.messenger.i0.Y3(this.f41441n, false, 0.3f, true, true);
            this.f41453w.setEmptyView(this.H);
        }
        ag.b1 b1Var5 = this.f41453w;
        b1Var5.W1 = true;
        b1Var5.X1 = 1;
        UndoView undoView = new UndoView(context);
        this.f41455x = undoView;
        undoView.setAdditionalTranslationY(org.telegram.messenger.i0.L(51.0f));
        this.X.addView(this.f41455x, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        f1();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.jj messageObject2;
        org.telegram.ui.Cells.q1 q1Var3;
        org.telegram.messenger.jj messageObject3;
        boolean z10;
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            ag.b1 b1Var = this.f41453w;
            if (b1Var != null) {
                b1Var.g1();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f19622h2) {
            if (((org.telegram.messenger.jj) objArr[0]).h4()) {
                MediaController.B().p0(U0(true), this.f41432e0, this.f41431d0, true);
                int childCount = this.f41453w.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        View childAt = this.f41453w.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt;
                            org.telegram.messenger.jj messageObject4 = q1Var4.getMessageObject();
                            if (this.f41431d0 != null && messageObject4.h4() && MediaController.B().I(messageObject4)) {
                                ImageReceiver photoImage = q1Var4.getPhotoImage();
                                this.f41431d0.setTranslationX(photoImage.K0);
                                this.f41431d0.setTranslationY(q1Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.L0);
                                this.fragmentView.invalidate();
                                this.f41431d0.invalidate();
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
                if (this.f41431d0 != null) {
                    org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                    if (!z10) {
                        this.f41431d0.setTranslationY((-org.telegram.messenger.i0.f16030u) - 100);
                        this.fragmentView.invalidate();
                        if (jjVar != null && jjVar.h4() && (this.V || PipRoundVideoView.F != null)) {
                            MediaController.B().k0(false);
                        }
                    } else {
                        MediaController.B().k0(true);
                    }
                }
            }
            ag.b1 b1Var2 = this.f41453w;
            if (b1Var2 != null) {
                int childCount2 = b1Var2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = this.f41453w.getChildAt(i13);
                    if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject3 = (q1Var3 = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null) {
                        if (!org.telegram.messenger.jj.R4(messageObject3.f16337k) && !messageObject3.I3()) {
                            if (messageObject3.h4()) {
                                q1Var3.n0(null, false);
                                if (!MediaController.B().I(messageObject3) && messageObject3.f16299b0 != 0.0f) {
                                    messageObject3.F5();
                                    q1Var3.invalidate();
                                }
                            }
                        } else {
                            q1Var3.K3(false, true, false);
                        }
                    }
                }
            }
        } else if (i10 != org.telegram.messenger.zs.f19610f2 && i10 != org.telegram.messenger.zs.f19616g2) {
            if (i10 == org.telegram.messenger.zs.f19604e2) {
                Integer num = (Integer) objArr[0];
                ag.b1 b1Var3 = this.f41453w;
                if (b1Var3 != null) {
                    int childCount3 = b1Var3.getChildCount();
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt3 = this.f41453w.getChildAt(i14);
                        if ((childAt3 instanceof org.telegram.ui.Cells.q1) && (messageObject2 = (q1Var2 = (org.telegram.ui.Cells.q1) childAt3).getMessageObject()) != null && messageObject2.f1() == num.intValue()) {
                            org.telegram.messenger.jj jjVar2 = MediaController.B().f14482u0;
                            if (jjVar2 != null) {
                                messageObject2.f16299b0 = jjVar2.f16299b0;
                                messageObject2.f16322g0 = jjVar2.f16322g0;
                                messageObject2.f16326h0 = jjVar2.f16326h0;
                                q1Var2.O3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i10 == org.telegram.messenger.zs.f19735z4 && this.fragmentView != null) {
                this.X.U(org.telegram.ui.ActionBar.t6.s0());
                this.f41446r.invalidate();
                ag.j3 j3Var = this.L;
                if (j3Var != null) {
                    j3Var.invalidate();
                }
                this.f41453w.g1();
            }
        } else {
            ag.b1 b1Var4 = this.f41453w;
            if (b1Var4 != null) {
                int childCount4 = b1Var4.getChildCount();
                for (int i15 = 0; i15 < childCount4; i15++) {
                    View childAt4 = this.f41453w.getChildAt(i15);
                    if ((childAt4 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt4).getMessageObject()) != null) {
                        if (!org.telegram.messenger.jj.R4(messageObject.f16337k) && !messageObject.I3()) {
                            if (messageObject.h4() && !MediaController.B().I(messageObject)) {
                                q1Var.n0(null, true);
                            }
                        } else {
                            q1Var.K3(false, true, false);
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

    public final void f1() {
        if (this.L == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41452v0)) {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f));
            this.L.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748218, null)));
        } else if (this.f41454w0 == null && this.f41451u0 == null) {
            this.K.setVisibility(0);
            this.L.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
            if (this.f41433f.megagroup) {
                ag.j3 j3Var = this.L;
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751013, null));
                e1(W2);
                j3Var.setText(W2);
                return;
            }
            ag.j3 j3Var2 = this.L;
            SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751012, null));
            e1(W22);
            j3Var2.setText(W22);
        } else {
            this.K.setVisibility(8);
            this.L.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(3.0f));
            this.L.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748217, null)));
        }
    }

    public final void g1() {
        org.telegram.ui.Cells.s0 s0Var;
        org.telegram.messenger.jj messageObject;
        int i10;
        ag.b1 b1Var = this.f41453w;
        if (b1Var == null) {
            return;
        }
        int childCount = b1Var.getChildCount();
        int measuredHeight = this.f41453w.getMeasuredHeight();
        int i11 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z11 = false;
        org.telegram.ui.Cells.q1 q1Var = null;
        View view = null;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.f41453w.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) childAt;
                float y3 = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY();
                int backgroundSizeY = this.X.getBackgroundSizeY();
                y1Var.f23613f = y3;
                y1Var.h = backgroundSizeY;
            } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int top = q1Var2.getTop();
                q1Var2.getBottom();
                if (top >= 0) {
                    i10 = 0;
                } else {
                    i10 = -top;
                }
                int measuredHeight2 = q1Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                q1Var2.w3(i10, measuredHeight2 - i10, (this.X.getHeightWithKeyboard() - org.telegram.messenger.i0.L(48.0f)) - this.f41453w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getMeasuredWidth(), this.X.getBackgroundSizeY(), 0, 0, 0);
                org.telegram.messenger.jj messageObject2 = q1Var2.getMessageObject();
                if (this.f41431d0 != null && messageObject2.h4() && MediaController.B().I(messageObject2)) {
                    ImageReceiver photoImage = q1Var2.getPhotoImage();
                    this.f41431d0.setTranslationX(photoImage.K0);
                    this.f41431d0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.L0);
                    this.fragmentView.invalidate();
                    this.f41431d0.invalidate();
                    z11 = true;
                }
            } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) childAt;
                s0Var2.g0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.X.getBackgroundTranslationY(), this.X.getBackgroundSizeY());
                if (s0Var2.R()) {
                    s0Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.f41453w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i11) {
                    if ((childAt instanceof org.telegram.ui.Cells.q1) || (childAt instanceof org.telegram.ui.Cells.s0)) {
                        q1Var = childAt;
                    }
                    i11 = bottom;
                    view2 = childAt;
                }
                ib ibVar = this.C0;
                if ((ibVar == null || (!ibVar.a0(childAt) && !this.C0.Z(childAt))) && (childAt instanceof org.telegram.ui.Cells.s0) && ((org.telegram.ui.Cells.s0) childAt).getMessageObject().f16334j0) {
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
        l0 l0Var = this.f41431d0;
        if (l0Var != null) {
            if (!z11) {
                l0Var.setTranslationY((-org.telegram.messenger.i0.f16030u) - 100);
                this.fragmentView.invalidate();
                org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                if (jjVar != null && jjVar.h4() && this.V) {
                    MediaController.B().k0(false);
                }
            } else {
                MediaController.B().k0(true);
            }
        }
        if (q1Var != null) {
            if (q1Var instanceof org.telegram.ui.Cells.q1) {
                messageObject = q1Var.getMessageObject();
            } else {
                messageObject = ((org.telegram.ui.Cells.s0) q1Var).getMessageObject();
            }
            this.M.e0(messageObject.f16337k.date, false, true);
        }
        this.P = false;
        if (!(view2 instanceof org.telegram.ui.Cells.q1) && !(view2 instanceof org.telegram.ui.Cells.s0)) {
            z10 = true;
        }
        this.Q = z10;
        if (view != null) {
            if (view.getTop() <= this.f41453w.getPaddingTop() && !this.Q) {
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
                X0(true ^ this.Q);
            }
            int bottom2 = view.getBottom() - this.f41453w.getPaddingTop();
            if (bottom2 > this.M.getMeasuredHeight() && bottom2 < this.M.getMeasuredHeight() * 2) {
                this.M.setTranslationY(((-s0Var.getMeasuredHeight()) * 2) + bottom2);
                return;
            }
            this.M.setTranslationY(0.0f);
            return;
        }
        X0(true);
        this.M.setTranslationY(0.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21064kc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21101mc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21082lc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20938df));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41453w, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21250uf));
        View view = this.f41446r;
        int i10 = org.telegram.ui.ActionBar.t6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.c7(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    public final void h1() {
        boolean z10;
        ag.b1 b1Var = this.f41453w;
        if (b1Var != null) {
            int childCount = b1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f41453w.getChildAt(i10);
                boolean z11 = true;
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.u()) {
                            q1Var.setDrawSelectionBackground(false);
                            q1Var.f3(false, true);
                            q1Var.h3(false, false, true);
                        }
                        if (this.G0 != Integer.MAX_VALUE && messageObject.M1() == this.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        q1Var.setHighlighted(z10);
                        if (this.G0 != Integer.MAX_VALUE) {
                            ua uaVar = this.I0;
                            if (uaVar != null) {
                                org.telegram.messenger.i0.r(uaVar);
                            }
                            ua uaVar2 = new ua(this, 0);
                            this.I0 = uaVar2;
                            org.telegram.messenger.i0.h3(uaVar2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.f41452v0)) {
                            q1Var.o3(this.f41452v0);
                        } else {
                            q1Var.o3(null);
                        }
                        if (this.f41453w.getScrollState() == 0) {
                            z11 = false;
                        }
                        q1Var.setSpoilersSuppressed(z11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                    s0Var.setMessageObject(s0Var.getMessageObject());
                    if (this.f41453w.getScrollState() == 0) {
                        z11 = false;
                    }
                    s0Var.setSpoilersSuppressed(z11);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f41455x;
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
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19622h2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19616g2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19610f2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19604e2);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19735z4);
        Y0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.vp.h1(this.f41433f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ta(this, 4)), this.classGuid);
        setBulletinDelegate(new mg.u(4));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19622h2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19616g2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19610f2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19604e2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19735z4);
        this.f41456x0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        qb qbVar = this.X;
        if (qbVar != null) {
            org.telegram.ui.Components.z71 z71Var = qbVar.f31060w;
            if (z71Var != null) {
                z71Var.c(false);
            }
            qbVar.F = true;
        }
        UndoView undoView = this.f41455x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f41437i0 = true;
        this.f41438j0 = true;
        ac.a aVar = ac.a.e;
        if (aVar != null && aVar.f362a) {
            ac.a n10 = ac.a.n();
            if (n10.f362a) {
                int i10 = a5.F;
                ((r4) n10.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.B().p0(this.f41434f0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        qb qbVar = this.X;
        if (qbVar != null) {
            org.telegram.ui.Components.z71 z71Var = qbVar.f31060w;
            if (z71Var != null) {
                z71Var.c(true);
            }
            qbVar.F = false;
        }
        this.f41437i0 = false;
        S0(false);
        if (this.f41438j0) {
            this.f41438j0 = false;
            pb pbVar = this.E;
            if (pbVar != null) {
                pbVar.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f41448s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wc, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f41456x0.e();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        if (z10) {
            this.f41456x0.d();
        }
    }
}
