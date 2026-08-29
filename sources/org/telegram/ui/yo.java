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
public final class yo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A;
    public LinearLayout B;
    public org.telegram.ui.Components.r80 C;
    public org.telegram.ui.Cells.m8 D;
    public org.telegram.ui.Cells.y8 E;
    public org.telegram.ui.Cells.x6 F;
    public xo G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ia K;
    public ArrayList L;
    public LinearLayout M;
    public org.telegram.ui.Cells.k4 N;
    public org.telegram.ui.Cells.q8 O;
    public org.telegram.ui.Cells.y8 P;
    public uo Q;
    public boolean R;
    public boolean S;
    public TLRPC.Chat T;
    public TLRPC.ChatFull U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ig.f f44915a;
    public org.telegram.ui.Cells.x6 f44916a0;
    public EditTextBoldCursor f44917b;
    public ArrayList f44918b0;
    public org.telegram.ui.Cells.y8 f44919c;
    public org.telegram.ui.Cells.q4 f44920c0;
    public org.telegram.ui.Cells.k4 d;
    public int f44921d0;
    public org.telegram.ui.Cells.k4 f44922e;
    public String f44923e0;
    public so f44924f;
    public vf f44925f0;
    public boolean f44926g0;
    public bg.y3 h;
    public TLRPC.TL_chatInviteExported f44927h0;
    public boolean f44928i0;
    public boolean f44929j0;
    public HashMap f44930k0;
    public org.telegram.ui.Components.n60 f44931l0;
    public no m0;
    public org.telegram.ui.ActionBar.w0 f44932n;
    public ValueAnimator f44933n0;
    public Boolean f44934o0;
    public boolean f44935p0;
    public org.telegram.ui.Components.ir f44936r;
    public LinearLayout f44937s;
    public org.telegram.ui.Cells.g6 v;
    public org.telegram.ui.Cells.g6 f44938w;
    public LinearLayout f44939x;
    public LinearLayout f44940y;

    public final void V() {
        if (!this.R && this.f44915a.length() <= 0) {
            ArrayList arrayList = this.J;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f44932n.setEnabled(false);
            this.f44932n.setAlpha(0.5f);
            return;
        }
        this.f44932n.setEnabled(true);
        this.f44932n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f44924f.setVisibility(0);
        } else {
            this.f44924f.setVisibility(8);
        }
        vf vfVar = this.f44925f0;
        if (vfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vfVar);
            this.f44925f0 = null;
            this.f44923e0 = null;
            if (this.f44921d0 != 0) {
                getConnectionsManager().cancelRequest(this.f44921d0, true);
            }
        }
        this.f44926g0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.W) {
                            this.f44924f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f44924f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f44924f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23279p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f44924f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f44924f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23279p7);
                        return false;
                    }
                }
            } else {
                this.f44924f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f44924f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23279p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f44924f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f44924f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23279p7);
                return false;
            }
            this.f44924f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f44924f.setTextColorByKey(org.telegram.ui.ActionBar.g6.F6);
            this.f44923e0 = str;
            vf vfVar2 = new vf(18, this, str);
            this.f44925f0 = vfVar2;
            AndroidUtilities.runOnUIThread(vfVar2, 300L);
            return true;
        }
        if (this.W) {
            this.f44924f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f44924f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f44924f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23279p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.V);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new nh.l3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.f3417r0 = this.W;
        v0Var.D0 = new no(this, 0);
        showDialog(v0Var);
    }

    public final void a0(boolean z10) {
        float f9;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
        }
        if (this.f44936r != null) {
            ValueAnimator valueAnimator = this.f44933n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f44936r.f29455c;
            float f11 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f44933n0 = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 7));
            ValueAnimator valueAnimator2 = this.f44933n0;
            float f12 = this.f44936r.f29455c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f44933n0.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.f44933n0.start();
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
        if (this.F == null) {
            return;
        }
        String str = null;
        int i19 = 8;
        if (!this.R && !this.Y && getUserConfig().isPremium()) {
            this.f44919c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.y8 y8Var = this.f44919c;
            int i20 = org.telegram.ui.ActionBar.g6.f23279p7;
            y8Var.setTag(Integer.valueOf(i20));
            this.f44919c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            this.f44940y.setVisibility(8);
            this.f44924f.setVisibility(8);
            this.F.setVisibility(8);
            this.f44916a0.setVisibility(0);
            if (this.Z) {
                this.f44920c0.setVisibility(0);
                this.f44939x.setVisibility(8);
            } else {
                this.f44920c0.setVisibility(8);
                this.f44939x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var2 = this.f44919c;
            int i21 = org.telegram.ui.ActionBar.g6.B6;
            y8Var2.setTag(Integer.valueOf(i21));
            this.f44919c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            if (this.f44929j0) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
            this.f44916a0.setVisibility(8);
            this.f44939x.setVisibility(8);
            this.f44940y.setVisibility(0);
            this.f44920c0.setVisibility(8);
            if (this.W) {
                org.telegram.ui.Cells.y8 y8Var3 = this.f44919c;
                if (this.R) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                y8Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.k4 k4Var = this.d;
                if (this.R) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                k4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.y8 y8Var4 = this.f44919c;
                if (this.R) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                y8Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.k4 k4Var2 = this.d;
                if (this.R) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                k4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.A;
            if (this.R) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.B;
            if (this.R) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            this.M.setVisibility(0);
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            LinearLayout linearLayout3 = this.f44940y;
            if (this.R) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.r80 r80Var = this.C;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f44927h0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            r80Var.setLink(str);
            this.C.c(this.f44927h0, this.V);
            so soVar = this.f44924f;
            if (!this.R && soVar.f26011a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            soVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.V);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.V));
            org.telegram.ui.Cells.y8 y8Var5 = this.E;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            y8Var5.setText(LocaleController.getString(i15));
        }
        boolean z10 = true;
        this.v.a(!this.R);
        this.f44938w.a(this.R);
        this.f44915a.clearFocus();
        uo uoVar = this.Q;
        if (uoVar != null) {
            if (this.W && !this.R) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            uoVar.setVisibility(i18);
            uo uoVar2 = this.Q;
            TLRPC.ChatFull chatFull2 = this.U;
            uoVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.W) ? false : false);
        }
        xo xoVar = this.G;
        if (xoVar != null) {
            if (!this.R && !this.J.isEmpty()) {
                i19 = 0;
            }
            xoVar.setVisibility(i19);
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
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 18));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
        this.f44936r = irVar;
        this.f44932n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), irVar);
        this.h = new bg.y3(context);
        qo qoVar = new qo(this, context, this.h, this.resourceProvider);
        this.fragmentView = qoVar;
        qoVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.un0 un0Var = (org.telegram.ui.Components.un0) this.fragmentView;
        un0Var.setFillViewport(true);
        un0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(un0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f44929j0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.W) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44937s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f44937s, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 23);
        this.f44922e = k4Var;
        k4Var.setHeight(46);
        if (this.W) {
            this.f44922e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f44922e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f44937s.addView(this.f44922e);
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
        this.f44938w = g6Var;
        if (this.W) {
            g6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.R);
        } else {
            g6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.R);
        }
        this.f44937s.addView(this.f44938w, i7.f6.n(-1, -2));
        this.f44938w.setOnClickListener(new po(this, 1));
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
        this.v = g6Var2;
        if (this.W) {
            g6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.R);
        } else {
            g6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.R);
        }
        this.f44937s.addView(this.v, i7.f6.n(-1, -2));
        this.v.setOnClickListener(new po(this, 2));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        this.F = x6Var;
        this.h.addView(x6Var, i7.f6.n(-1, -2));
        if (z11) {
            this.f44938w.setVisibility(8);
            this.v.setVisibility(8);
            this.F.setVisibility(8);
            this.f44922e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f44940y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f44940y, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context, 23);
        this.d = k4Var2;
        this.f44940y.addView(k4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.A = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f44940y.addView(this.A, i7.f6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44917b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f44917b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f44917b;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f44917b;
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f44917b.setMaxLines(1);
        this.f44917b.setLines(1);
        this.f44917b.setEnabled(false);
        this.f44917b.setBackground(null);
        this.f44917b.setPadding(0, 0, 0, 0);
        this.f44917b.setSingleLine(true);
        this.f44917b.setInputType(163840);
        this.f44917b.setImeOptions(6);
        this.A.addView(this.f44917b, i7.f6.n(-2, 36));
        ig.f fVar = new ig.f(this, context, 4);
        this.f44915a = fVar;
        fVar.setTextSize(1, 18.0f);
        this.f44915a.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f44915a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f44915a.setMaxLines(1);
        this.f44915a.setLines(1);
        this.f44915a.setBackground(null);
        this.f44915a.setPadding(0, 0, 0, 0);
        this.f44915a.setSingleLine(true);
        this.f44915a.setInputType(163872);
        this.f44915a.setImeOptions(6);
        this.f44915a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f44915a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f44915a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f44915a.setCursorWidth(1.5f);
        this.A.addView(this.f44915a, i7.f6.n(-1, 36));
        this.f44915a.addTextChangedListener(new p0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.B = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f44940y.addView(this.B, i7.f6.n(-1, -2));
        org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(context, this, null, true, ChatObject.isChannel(this.T));
        this.C = r80Var;
        r80Var.setDelegate(new ro(this, context));
        this.C.d(0, null, false);
        this.B.addView(this.C);
        so soVar = new so(this, context, this.resourceProvider);
        this.f44924f = soVar;
        soVar.setBottomPadding(6);
        this.h.addView(this.f44924f, i7.f6.n(-2, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.f44919c = y8Var;
        y8Var.setImportantForAccessibility(1);
        this.h.addView(this.f44919c, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        this.f44920c0 = q4Var;
        this.h.addView(q4Var, i7.f6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f44939x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f44939x, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (b) null);
        this.f44916a0 = x6Var2;
        this.h.addView(x6Var2, i7.f6.n(-1, -2));
        bg.y3 y3Var = this.h;
        xo xoVar = new xo(this, context);
        this.G = xoVar;
        y3Var.addView(xoVar, i7.f6.n(-1, -2));
        xo xoVar2 = this.G;
        if (!this.R && !this.J.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        xoVar2.setVisibility(i10);
        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
        this.D = m8Var;
        m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.D.setOnClickListener(new po(this, 3));
        this.h.addView(this.D, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.E = y8Var2;
        this.h.addView(y8Var2, i7.f6.n(-1, -2));
        uo uoVar = new uo(this, context, this.T, context);
        this.Q = uoVar;
        TLRPC.ChatFull chatFull = this.U;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.W) {
            z10 = true;
        } else {
            z10 = false;
        }
        uoVar.c(z10);
        uo uoVar2 = this.Q;
        TLRPC.ChatFull chatFull2 = this.U;
        org.telegram.ui.Cells.y8 y8Var3 = uoVar2.f28814e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(uoVar2.f28816n);
        boolean isPublic = ChatObject.isPublic(uoVar2.f28816n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            y8Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.il, false), new org.telegram.ui.Components.gt(21, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            y8Var3.setText(LocaleController.getString(i11));
        }
        this.h.addView(this.Q);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.M = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.M);
        org.telegram.ui.Cells.k4 k4Var3 = new org.telegram.ui.Cells.k4(context, 23);
        this.N = k4Var3;
        k4Var3.setHeight(46);
        this.N.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.M.addView(this.N, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.O = q8Var;
        q8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.X, false);
        this.O.setOnClickListener(new po(this, 4));
        this.M.addView(this.O, i7.f6.n(-1, -2));
        this.P = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        if (this.W && !ChatObject.isMegagroup(this.T)) {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.M.addView(this.P, i7.f6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.T, true);
        if (!this.R && publicUsername != null) {
            this.f44928i0 = true;
            this.f44915a.setText(publicUsername);
            this.f44915a.setSelection(publicUsername.length());
            this.f44928i0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22393id == this.V) {
                this.U = chatFull;
                this.f44927h0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.V) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
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
        f fVar = new f(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        int i10 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44915a, 4, null, null, null, null, i14));
        ig.f fVar2 = this.f44915a;
        int i15 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(fVar2, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f44937s;
        int i16 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44940y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44922e, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44917b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44917b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44924f, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44924f, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44924f, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23401w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44919c, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44919c, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44919c, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44916a0, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44939x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44920c0, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.g6.f23118g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.g6.f23135h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44938w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44938w, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44938w, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44938w, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44938w, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44939x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.g6.f23433y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44939x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44939x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44939x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23305r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ig.f fVar;
        super.onBecomeFullyVisible();
        if (this.f44929j0 && (fVar = this.f44915a) != null) {
            fVar.requestFocus();
            AndroidUtilities.showKeyboard(this.f44915a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo.onFragmentCreate():boolean");
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
        bg.y3 y3Var = this.h;
        if (y3Var != null) {
            y3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.U;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f44927h0 = tL_chatInviteExported;
            org.telegram.ui.Components.r80 r80Var = this.C;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            r80Var.setLink(str);
            this.C.c(this.f44927h0, this.V);
        }
    }
}
