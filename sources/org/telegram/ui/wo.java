package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wo extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.q90 G;
    public org.telegram.ui.Cells.q8 H;
    public org.telegram.ui.Cells.d9 I;
    public org.telegram.ui.Cells.z6 J;
    public vo K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public pa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.l4 R;
    public org.telegram.ui.Cells.v8 S;
    public org.telegram.ui.Cells.d9 T;
    public so U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ei.e2 f42909a;
    public boolean f42910a0;
    public EditTextBoldCursor f42911b;
    public boolean f42912b0;
    public org.telegram.ui.Cells.d9 f42913c;
    public boolean f42914c0;
    public org.telegram.ui.Cells.l4 d;
    public boolean f42915d0;
    public org.telegram.ui.Cells.l4 e;
    public org.telegram.ui.Cells.z6 f42916e0;
    public qo f42917f;
    public ArrayList f42918f0;
    public org.telegram.ui.Cells.r4 f42919g0;
    public ai.r h;
    public int f42920h0;
    public String f42921i0;
    public eh f42922j0;
    public boolean f42923k0;
    public TLRPC.TL_chatInviteExported f42924l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.u0 f42925n;
    public boolean f42926n0;
    public HashMap f42927o0;
    public org.telegram.ui.Components.l70 f42928p0;
    public lo f42929q0;
    public org.telegram.ui.Components.as f42930r;
    public ValueAnimator f42931r0;
    public LinearLayout f42932s;
    public Boolean f42933s0;
    public boolean f42934t0;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 f42935w;
    public LinearLayout f42936x;
    public LinearLayout f42937y;

    public final void V() {
        if (!this.V && this.f42909a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f42925n.setEnabled(false);
            this.f42925n.setAlpha(0.5f);
            return;
        }
        this.f42925n.setEnabled(true);
        this.f42925n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f42917f.setVisibility(0);
        } else {
            this.f42917f.setVisibility(8);
        }
        eh ehVar = this.f42922j0;
        if (ehVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ehVar);
            this.f42922j0 = null;
            this.f42921i0 = null;
            if (this.f42920h0 != 0) {
                getConnectionsManager().cancelRequest(this.f42920h0, true);
            }
        }
        this.f42923k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f42910a0) {
                            this.f42917f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f42917f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f42917f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21214p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f42917f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f42917f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21214p7);
                        return false;
                    }
                }
            } else {
                this.f42917f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f42917f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21214p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f42917f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f42917f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21214p7);
                return false;
            }
            this.f42917f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f42917f.setTextColorByKey(org.telegram.ui.ActionBar.h6.F6);
            this.f42921i0 = str;
            eh ehVar2 = new eh(12, this, str);
            this.f42922j0 = ehVar2;
            AndroidUtilities.runOnUIThread(ehVar2, 300L);
            return true;
        }
        if (this.f42910a0) {
            this.f42917f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f42917f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f42917f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21214p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ei.o3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f46309v0 = this.f42910a0;
        k0Var.H0 = new lo(this, 0);
        showDialog(k0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f42929q0);
        }
        if (this.f42930r != null) {
            ValueAnimator valueAnimator = this.f42931r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f42930r.f24710c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f42931r0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 7));
            ValueAnimator valueAnimator2 = this.f42931r0;
            float f12 = this.f42930r.f24710c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f42931r0.setInterpolator(org.telegram.ui.Components.bs.f25024f);
            this.f42931r0.start();
        }
    }

    public final void b0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.J == null) {
            return;
        }
        String str = null;
        int i19 = 8;
        if (!this.V && !this.f42914c0 && getUserConfig().isPremium()) {
            this.f42913c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.d9 d9Var = this.f42913c;
            int i20 = org.telegram.ui.ActionBar.h6.f21214p7;
            d9Var.setTag(Integer.valueOf(i20));
            this.f42913c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            this.f42937y.setVisibility(8);
            this.f42917f.setVisibility(8);
            this.J.setVisibility(8);
            this.f42916e0.setVisibility(0);
            if (this.f42915d0) {
                this.f42919g0.setVisibility(0);
                this.f42936x.setVisibility(8);
            } else {
                this.f42919g0.setVisibility(8);
                this.f42936x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var2 = this.f42913c;
            int i21 = org.telegram.ui.ActionBar.h6.B6;
            d9Var2.setTag(Integer.valueOf(i21));
            this.f42913c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
            if (this.f42926n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f42916e0.setVisibility(8);
            this.f42936x.setVisibility(8);
            this.f42937y.setVisibility(0);
            this.f42919g0.setVisibility(8);
            if (this.f42910a0) {
                org.telegram.ui.Cells.d9 d9Var3 = this.f42913c;
                if (this.V) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                d9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.l4 l4Var = this.d;
                if (this.V) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.d9 d9Var4 = this.f42913c;
                if (this.V) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                d9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.d;
                if (this.V) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.E;
            if (this.V) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.F;
            if (this.V) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            LinearLayout linearLayout3 = this.f42937y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.q90 q90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f42924l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            q90Var.setLink(str);
            this.G.c(this.f42924l0, this.Z);
            qo qoVar = this.f42917f;
            if (!this.V && qoVar.f22150a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            qoVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Z));
            org.telegram.ui.Cells.d9 d9Var5 = this.I;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            d9Var5.setText(LocaleController.getString(i15));
        }
        boolean z10 = true;
        this.v.a(!this.V);
        this.f42935w.a(this.V);
        this.f42909a.clearFocus();
        so soVar = this.U;
        if (soVar != null) {
            if (this.f42910a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            soVar.setVisibility(i18);
            so soVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f42910a0) {
                z10 = false;
            }
            soVar2.c(z10);
        }
        vo voVar = this.K;
        if (voVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            voVar.setVisibility(i19);
        }
        V();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 4));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.h6.f21328v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
        this.f42930r = asVar;
        this.f42925n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        this.h = new ai.r(context);
        oo ooVar = new oo(this, context, this.h, this.resourceProvider);
        this.fragmentView = ooVar;
        ooVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        org.telegram.ui.Components.xo0 xo0Var = (org.telegram.ui.Components.xo0) this.fragmentView;
        xo0Var.setFillViewport(true);
        xo0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(xo0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f42926n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f42910a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42932s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f42932s, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.e = l4Var;
        l4Var.setHeight(46);
        if (this.f42910a0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f42932s.addView(this.e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f42935w = i6Var;
        if (this.f42910a0) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f42932s.addView(this.f42935w, w7.z5.n(-1, -2));
        this.f42935w.setOnClickListener(new no(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.f42910a0) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f42932s.addView(this.v, w7.z5.n(-1, -2));
        this.v.setOnClickListener(new no(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        this.J = z6Var;
        this.h.addView(z6Var, w7.z5.n(-1, -2));
        if (z11) {
            this.f42935w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f42937y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f42937y, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.f42937y.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f42937y.addView(this.E, w7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42911b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f42911b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f42911b;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f42911b;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42911b.setMaxLines(1);
        this.f42911b.setLines(1);
        this.f42911b.setEnabled(false);
        this.f42911b.setBackground(null);
        this.f42911b.setPadding(0, 0, 0, 0);
        this.f42911b.setSingleLine(true);
        this.f42911b.setInputType(163840);
        this.f42911b.setImeOptions(6);
        this.E.addView(this.f42911b, w7.z5.n(-2, 36));
        ei.e2 e2Var = new ei.e2(this, context, 3);
        this.f42909a = e2Var;
        e2Var.setTextSize(1, 18.0f);
        this.f42909a.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.f42909a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42909a.setMaxLines(1);
        this.f42909a.setLines(1);
        this.f42909a.setBackground(null);
        this.f42909a.setPadding(0, 0, 0, 0);
        this.f42909a.setSingleLine(true);
        this.f42909a.setInputType(163872);
        this.f42909a.setImeOptions(6);
        this.f42909a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f42909a.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42909a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42909a.setCursorWidth(1.5f);
        this.E.addView(this.f42909a, w7.z5.n(-1, 36));
        this.f42909a.addTextChangedListener(new o0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f42937y.addView(this.F, w7.z5.n(-1, -2));
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = q90Var;
        q90Var.setDelegate(new po(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        qo qoVar = new qo(this, context, this.resourceProvider);
        this.f42917f = qoVar;
        qoVar.setBottomPadding(6);
        this.h.addView(this.f42917f, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.f42913c = d9Var;
        d9Var.setImportantForAccessibility(1);
        this.h.addView(this.f42913c, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.f42919g0 = r4Var;
        this.h.addView(r4Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f42936x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f42936x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        this.f42916e0 = z6Var2;
        this.h.addView(z6Var2, w7.z5.n(-1, -2));
        ai.r rVar = this.h;
        vo voVar = new vo(this, context);
        this.K = voVar;
        rVar.addView(voVar, w7.z5.n(-1, -2));
        vo voVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        voVar2.setVisibility(i10);
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.H = q8Var;
        q8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new no(this, 3));
        this.h.addView(this.H, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.I = d9Var2;
        this.h.addView(d9Var2, w7.z5.n(-1, -2));
        so soVar = new so(this, context, this.X, context);
        this.U = soVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f42910a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        soVar.c(z10);
        so soVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.d9 d9Var3 = soVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(soVar2.f25861n);
        boolean isPublic = ChatObject.isPublic(soVar2.f25861n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            d9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.il, false), new org.telegram.ui.Components.yt(19, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            d9Var3.setText(LocaleController.getString(i11));
        }
        this.h.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.Q);
        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context, 23);
        this.R = l4Var3;
        l4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
        this.S = v8Var;
        v8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f42912b0, false);
        this.S.setOnClickListener(new no(this, 4));
        this.Q.addView(this.S, w7.z5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        if (this.f42910a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f42909a.setText(publicUsername);
            this.f42909a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20280id == this.Z) {
                this.Y = chatFull;
                this.f42924l0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var != null && d5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20935a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        int i10 = org.telegram.ui.ActionBar.h6.f20955b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21082i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f21214p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42909a, 4, null, null, null, null, i14));
        ei.e2 e2Var = this.f42909a;
        int i15 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f42932s;
        int i16 = org.telegram.ui.ActionBar.h6.f20993d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42937y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42911b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42911b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42917f, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42917f, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42917f, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21345w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42913c, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42913c, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42913c, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42916e0, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42919g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21065h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.h6.f21047g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.h6.f21066h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.h6.f21398z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42935w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42935w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42935w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42935w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42935w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.h6.f21381y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f21244r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21156m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ei.e2 e2Var;
        super.onBecomeFullyVisible();
        if (this.f42926n0 && (e2Var = this.f42909a) != null) {
            e2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f42909a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ai.r rVar = this.h;
        if (rVar != null) {
            rVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f42924l0 = tL_chatInviteExported;
            org.telegram.ui.Components.q90 q90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            q90Var.setLink(str);
            this.G.c(this.f42924l0, this.Z);
        }
    }
}
