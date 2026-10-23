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
    public ei.e2 f42910a;
    public boolean f42911a0;
    public EditTextBoldCursor f42912b;
    public boolean f42913b0;
    public org.telegram.ui.Cells.d9 f42914c;
    public boolean f42915c0;
    public org.telegram.ui.Cells.l4 d;
    public boolean f42916d0;
    public org.telegram.ui.Cells.l4 e;
    public org.telegram.ui.Cells.z6 f42917e0;
    public qo f42918f;
    public ArrayList f42919f0;
    public org.telegram.ui.Cells.r4 f42920g0;
    public ai.r h;
    public int f42921h0;
    public String f42922i0;
    public eh f42923j0;
    public boolean f42924k0;
    public TLRPC.TL_chatInviteExported f42925l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.u0 f42926n;
    public boolean f42927n0;
    public HashMap f42928o0;
    public org.telegram.ui.Components.l70 f42929p0;
    public lo f42930q0;
    public org.telegram.ui.Components.as f42931r;
    public ValueAnimator f42932r0;
    public LinearLayout f42933s;
    public Boolean f42934s0;
    public boolean f42935t0;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 f42936w;
    public LinearLayout f42937x;
    public LinearLayout f42938y;

    public final void V() {
        if (!this.V && this.f42910a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f42926n.setEnabled(false);
            this.f42926n.setAlpha(0.5f);
            return;
        }
        this.f42926n.setEnabled(true);
        this.f42926n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f42918f.setVisibility(0);
        } else {
            this.f42918f.setVisibility(8);
        }
        eh ehVar = this.f42923j0;
        if (ehVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ehVar);
            this.f42923j0 = null;
            this.f42922i0 = null;
            if (this.f42921h0 != 0) {
                getConnectionsManager().cancelRequest(this.f42921h0, true);
            }
        }
        this.f42924k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f42911a0) {
                            this.f42918f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f42918f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f42918f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21215p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f42918f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f42918f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21215p7);
                        return false;
                    }
                }
            } else {
                this.f42918f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f42918f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21215p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f42918f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f42918f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21215p7);
                return false;
            }
            this.f42918f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f42918f.setTextColorByKey(org.telegram.ui.ActionBar.h6.F6);
            this.f42922i0 = str;
            eh ehVar2 = new eh(12, this, str);
            this.f42923j0 = ehVar2;
            AndroidUtilities.runOnUIThread(ehVar2, 300L);
            return true;
        }
        if (this.f42911a0) {
            this.f42918f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f42918f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f42918f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f21215p7);
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
        k0Var.f46310v0 = this.f42911a0;
        k0Var.H0 = new lo(this, 0);
        showDialog(k0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f42930q0);
        }
        if (this.f42931r != null) {
            ValueAnimator valueAnimator = this.f42932r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f42931r.f24711c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f42932r0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 7));
            ValueAnimator valueAnimator2 = this.f42932r0;
            float f12 = this.f42931r.f24711c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f42932r0.setInterpolator(org.telegram.ui.Components.bs.f25025f);
            this.f42932r0.start();
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
        if (!this.V && !this.f42915c0 && getUserConfig().isPremium()) {
            this.f42914c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.d9 d9Var = this.f42914c;
            int i20 = org.telegram.ui.ActionBar.h6.f21215p7;
            d9Var.setTag(Integer.valueOf(i20));
            this.f42914c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            this.f42938y.setVisibility(8);
            this.f42918f.setVisibility(8);
            this.J.setVisibility(8);
            this.f42917e0.setVisibility(0);
            if (this.f42916d0) {
                this.f42920g0.setVisibility(0);
                this.f42937x.setVisibility(8);
            } else {
                this.f42920g0.setVisibility(8);
                this.f42937x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var2 = this.f42914c;
            int i21 = org.telegram.ui.ActionBar.h6.B6;
            d9Var2.setTag(Integer.valueOf(i21));
            this.f42914c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
            if (this.f42927n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f42917e0.setVisibility(8);
            this.f42937x.setVisibility(8);
            this.f42938y.setVisibility(0);
            this.f42920g0.setVisibility(8);
            if (this.f42911a0) {
                org.telegram.ui.Cells.d9 d9Var3 = this.f42914c;
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
                org.telegram.ui.Cells.d9 d9Var4 = this.f42914c;
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
            LinearLayout linearLayout3 = this.f42938y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.q90 q90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f42925l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            q90Var.setLink(str);
            this.G.c(this.f42925l0, this.Z);
            qo qoVar = this.f42918f;
            if (!this.V && qoVar.f22151a.length() != 0) {
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
        this.f42936w.a(this.V);
        this.f42910a.clearFocus();
        so soVar = this.U;
        if (soVar != null) {
            if (this.f42911a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            soVar.setVisibility(i18);
            so soVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f42911a0) {
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
        int i13 = org.telegram.ui.ActionBar.h6.f21329v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
        this.f42931r = asVar;
        this.f42926n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        this.h = new ai.r(context);
        oo ooVar = new oo(this, context, this.h, this.resourceProvider);
        this.fragmentView = ooVar;
        ooVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        org.telegram.ui.Components.xo0 xo0Var = (org.telegram.ui.Components.xo0) this.fragmentView;
        xo0Var.setFillViewport(true);
        xo0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(xo0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f42927n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f42911a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42933s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f42933s, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.e = l4Var;
        l4Var.setHeight(46);
        if (this.f42911a0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f42933s.addView(this.e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f42936w = i6Var;
        if (this.f42911a0) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f42933s.addView(this.f42936w, w7.z5.n(-1, -2));
        this.f42936w.setOnClickListener(new no(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.f42911a0) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f42933s.addView(this.v, w7.z5.n(-1, -2));
        this.v.setOnClickListener(new no(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        this.J = z6Var;
        this.h.addView(z6Var, w7.z5.n(-1, -2));
        if (z11) {
            this.f42936w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f42938y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f42938y, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.f42938y.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f42938y.addView(this.E, w7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42912b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f42912b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f42912b;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f42912b;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42912b.setMaxLines(1);
        this.f42912b.setLines(1);
        this.f42912b.setEnabled(false);
        this.f42912b.setBackground(null);
        this.f42912b.setPadding(0, 0, 0, 0);
        this.f42912b.setSingleLine(true);
        this.f42912b.setInputType(163840);
        this.f42912b.setImeOptions(6);
        this.E.addView(this.f42912b, w7.z5.n(-2, 36));
        ei.e2 e2Var = new ei.e2(this, context, 3);
        this.f42910a = e2Var;
        e2Var.setTextSize(1, 18.0f);
        this.f42910a.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.f42910a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42910a.setMaxLines(1);
        this.f42910a.setLines(1);
        this.f42910a.setBackground(null);
        this.f42910a.setPadding(0, 0, 0, 0);
        this.f42910a.setSingleLine(true);
        this.f42910a.setInputType(163872);
        this.f42910a.setImeOptions(6);
        this.f42910a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f42910a.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42910a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42910a.setCursorWidth(1.5f);
        this.E.addView(this.f42910a, w7.z5.n(-1, 36));
        this.f42910a.addTextChangedListener(new o0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f42938y.addView(this.F, w7.z5.n(-1, -2));
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = q90Var;
        q90Var.setDelegate(new po(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        qo qoVar = new qo(this, context, this.resourceProvider);
        this.f42918f = qoVar;
        qoVar.setBottomPadding(6);
        this.h.addView(this.f42918f, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.f42914c = d9Var;
        d9Var.setImportantForAccessibility(1);
        this.h.addView(this.f42914c, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.f42920g0 = r4Var;
        this.h.addView(r4Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f42937x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f42937x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        this.f42917e0 = z6Var2;
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
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f42911a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        soVar.c(z10);
        so soVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.d9 d9Var3 = soVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(soVar2.f25862n);
        boolean isPublic = ChatObject.isPublic(soVar2.f25862n);
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
        v8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f42913b0, false);
        this.S.setOnClickListener(new no(this, 4));
        this.Q.addView(this.S, w7.z5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        if (this.f42911a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f42910a.setText(publicUsername);
            this.f42910a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20281id == this.Z) {
                this.Y = chatFull;
                this.f42925l0 = chatFull.exported_invite;
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        int i10 = org.telegram.ui.ActionBar.h6.f20956b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21083i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f21215p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42910a, 4, null, null, null, null, i14));
        ei.e2 e2Var = this.f42910a;
        int i15 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(e2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f42933s;
        int i16 = org.telegram.ui.ActionBar.h6.f20994d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42938y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42912b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42912b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42918f, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42918f, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42918f, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21346w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42914c, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42914c, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42914c, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42917e0, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42937x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42920g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21066h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.h6.f21048g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.h6.f21067h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.h6.f21399z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42936w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42937x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.h6.f21382y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42937x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42937x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42937x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f21245r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21157m6));
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
        if (this.f42927n0 && (e2Var = this.f42910a) != null) {
            e2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f42910a);
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
            this.f42925l0 = tL_chatInviteExported;
            org.telegram.ui.Components.q90 q90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            q90Var.setLink(str);
            this.G.c(this.f42925l0, this.Z);
        }
    }
}
