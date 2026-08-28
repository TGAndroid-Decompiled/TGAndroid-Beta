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
public final class vo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A;
    public LinearLayout B;
    public org.telegram.ui.Components.e80 C;
    public org.telegram.ui.Cells.p8 D;
    public org.telegram.ui.Cells.b9 E;
    public org.telegram.ui.Cells.z6 F;
    public uo G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ja K;
    public ArrayList L;
    public LinearLayout M;
    public org.telegram.ui.Cells.m4 N;
    public org.telegram.ui.Cells.t8 O;
    public org.telegram.ui.Cells.b9 P;
    public ro Q;
    public boolean R;
    public boolean S;
    public TLRPC.Chat T;
    public TLRPC.ChatFull U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public fg.g f43524a;
    public org.telegram.ui.Cells.z6 f43525a0;
    public EditTextBoldCursor f43526b;
    public ArrayList f43527b0;
    public org.telegram.ui.Cells.b9 f43528c;
    public org.telegram.ui.Cells.s4 f43529c0;
    public org.telegram.ui.Cells.m4 d;
    public int f43530d0;
    public org.telegram.ui.Cells.m4 f43531e;
    public String f43532e0;
    public po f43533f;
    public rd f43534f0;
    public boolean f43535g0;
    public gh.m h;
    public TLRPC.TL_chatInviteExported f43536h0;
    public boolean f43537i0;
    public boolean f43538j0;
    public HashMap f43539k0;
    public org.telegram.ui.Components.a60 f43540l0;
    public ko m0;
    public org.telegram.ui.ActionBar.w0 f43541n;
    public ValueAnimator f43542n0;
    public Boolean f43543o0;
    public boolean f43544p0;
    public org.telegram.ui.Components.fr f43545r;
    public LinearLayout f43546s;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 f43547w;
    public LinearLayout f43548x;
    public LinearLayout f43549y;

    public final void U() {
        if (!this.R && this.f43524a.length() <= 0) {
            ArrayList arrayList = this.J;
            if (arrayList != null) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i9);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f43541n.setEnabled(false);
            this.f43541n.setAlpha(0.5f);
            return;
        }
        this.f43541n.setEnabled(true);
        this.f43541n.setAlpha(1.0f);
    }

    public final boolean V(String str) {
        if (str != null && str.length() > 0) {
            this.f43533f.setVisibility(0);
        } else {
            this.f43533f.setVisibility(8);
        }
        rd rdVar = this.f43534f0;
        if (rdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rdVar);
            this.f43534f0 = null;
            this.f43532e0 = null;
            if (this.f43530d0 != 0) {
                getConnectionsManager().cancelRequest(this.f43530d0, true);
            }
        }
        this.f43535g0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i9 = 0; i9 < str.length(); i9++) {
                    char charAt = str.charAt(i9);
                    if (i9 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.W) {
                            this.f43533f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f43533f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f43533f.setTextColorByKey(org.telegram.ui.ActionBar.f6.f23212p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f43533f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f43533f.setTextColorByKey(org.telegram.ui.ActionBar.f6.f23212p7);
                        return false;
                    }
                }
            } else {
                this.f43533f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f43533f.setTextColorByKey(org.telegram.ui.ActionBar.f6.f23212p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f43533f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f43533f.setTextColorByKey(org.telegram.ui.ActionBar.f6.f23212p7);
                return false;
            }
            this.f43533f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f43533f.setTextColorByKey(org.telegram.ui.ActionBar.f6.F6);
            this.f43532e0 = str;
            rd rdVar2 = new rd(21, this, str);
            this.f43534f0 = rdVar2;
            AndroidUtilities.runOnUIThread(rdVar2, 300L);
            return true;
        }
        if (this.W) {
            this.f43533f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f43533f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f43533f.setTextColorByKey(org.telegram.ui.ActionBar.f6.f23212p7);
        return false;
    }

    public final void W(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.V);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new kh.o3(6, this, z10)), this.classGuid);
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vo.X():void");
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f50548r0 = this.W;
        j0Var.D0 = new ko(this, 0);
        showDialog(j0Var);
    }

    public final void Z(boolean z10) {
        float f10;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
        }
        if (this.f43545r != null) {
            ValueAnimator valueAnimator = this.f43542n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f43545r.f28558c;
            float f12 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f43542n0 = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 7));
            ValueAnimator valueAnimator2 = this.f43542n0;
            float f13 = this.f43545r.f28558c;
            if (z10) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f43542n0.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.f43542n0.start();
        }
    }

    public final void a0() {
        int i9;
        int i10;
        int i11;
        int i12;
        int dp;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.F == null) {
            return;
        }
        String str = null;
        int i18 = 8;
        if (!this.R && !this.Y && getUserConfig().isPremium()) {
            this.f43528c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.b9 b9Var = this.f43528c;
            int i19 = org.telegram.ui.ActionBar.f6.f23212p7;
            b9Var.setTag(Integer.valueOf(i19));
            this.f43528c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
            this.f43549y.setVisibility(8);
            this.f43533f.setVisibility(8);
            this.F.setVisibility(8);
            this.f43525a0.setVisibility(0);
            if (this.Z) {
                this.f43529c0.setVisibility(0);
                this.f43548x.setVisibility(8);
            } else {
                this.f43529c0.setVisibility(8);
                this.f43548x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var2 = this.f43528c;
            int i20 = org.telegram.ui.ActionBar.f6.B6;
            b9Var2.setTag(Integer.valueOf(i20));
            this.f43528c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i20, false));
            if (this.f43538j0) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
            this.f43525a0.setVisibility(8);
            this.f43548x.setVisibility(8);
            this.f43549y.setVisibility(0);
            this.f43529c0.setVisibility(8);
            if (this.W) {
                org.telegram.ui.Cells.b9 b9Var3 = this.f43528c;
                if (this.R) {
                    i15 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i15 = R.string.ChannelUsernameHelp;
                }
                b9Var3.setText(LocaleController.getString(i15));
                org.telegram.ui.Cells.m4 m4Var = this.d;
                if (this.R) {
                    i16 = R.string.ChannelInviteLinkTitle;
                } else {
                    i16 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i16));
            } else {
                org.telegram.ui.Cells.b9 b9Var4 = this.f43528c;
                if (this.R) {
                    i9 = R.string.MegaPrivateLinkHelp;
                } else {
                    i9 = R.string.MegaUsernameHelp;
                }
                b9Var4.setText(LocaleController.getString(i9));
                org.telegram.ui.Cells.m4 m4Var2 = this.d;
                if (this.R) {
                    i10 = R.string.ChannelInviteLinkTitle;
                } else {
                    i10 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i10));
            }
            LinearLayout linearLayout = this.A;
            if (this.R) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            LinearLayout linearLayout2 = this.B;
            if (this.R) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
            this.M.setVisibility(0);
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            LinearLayout linearLayout3 = this.f43549y;
            if (this.R) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.e80 e80Var = this.C;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f43536h0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            e80Var.setLink(str);
            this.C.c(this.f43536h0, this.V);
            po poVar = this.f43533f;
            if (!this.R && poVar.f24152a.length() != 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            poVar.setVisibility(i13);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.V);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.V));
            org.telegram.ui.Cells.b9 b9Var5 = this.E;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i14 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i14 = R.string.ManageLinksInfoHelp;
            }
            b9Var5.setText(LocaleController.getString(i14));
        }
        boolean z10 = true;
        this.v.a(!this.R);
        this.f43547w.a(this.R);
        this.f43524a.clearFocus();
        ro roVar = this.Q;
        if (roVar != null) {
            if (this.W && !this.R) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            roVar.setVisibility(i17);
            ro roVar2 = this.Q;
            TLRPC.ChatFull chatFull2 = this.U;
            roVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.W) ? false : false);
        }
        uo uoVar = this.G;
        if (uoVar != null) {
            if (!this.R && !this.J.isEmpty()) {
                i18 = 0;
            }
            uoVar.setVisibility(i18);
        }
        U();
    }

    @Override
    public final View createView(Context context) {
        int i9;
        boolean z10;
        int i10;
        int i11;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 26));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = org.telegram.ui.ActionBar.f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i12, false)));
        this.f43545r = frVar;
        this.f43541n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        this.h = new gh.m(context);
        no noVar = new no(this, context, this.h, this.resourceProvider);
        this.fragmentView = noVar;
        noVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.in0 in0Var = (org.telegram.ui.Components.in0) this.fragmentView;
        in0Var.setFillViewport(true);
        in0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(in0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f43538j0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.W) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43546s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f43546s, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.f43531e = m4Var;
        m4Var.setHeight(46);
        if (this.W) {
            this.f43531e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f43531e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f43546s.addView(this.f43531e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f43547w = i6Var;
        if (this.W) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.R);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.R);
        }
        this.f43546s.addView(this.f43547w, g7.e6.n(-1, -2));
        this.f43547w.setOnClickListener(new mo(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.W) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.R);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.R);
        }
        this.f43546s.addView(this.v, g7.e6.n(-1, -2));
        this.v.setOnClickListener(new mo(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        this.F = z6Var;
        this.h.addView(z6Var, g7.e6.n(-1, -2));
        if (z11) {
            this.f43547w.setVisibility(8);
            this.v.setVisibility(8);
            this.F.setVisibility(8);
            this.f43531e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f43549y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f43549y, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f43549y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.A = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f43549y.addView(this.A, g7.e6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43526b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f43526b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f43526b;
        int i13 = org.telegram.ui.ActionBar.f6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f43526b;
        int i14 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.f43526b.setMaxLines(1);
        this.f43526b.setLines(1);
        this.f43526b.setEnabled(false);
        this.f43526b.setBackground(null);
        this.f43526b.setPadding(0, 0, 0, 0);
        this.f43526b.setSingleLine(true);
        this.f43526b.setInputType(163840);
        this.f43526b.setImeOptions(6);
        this.A.addView(this.f43526b, g7.e6.n(-2, 36));
        fg.g gVar = new fg.g(this, context, 4);
        this.f43524a = gVar;
        gVar.setTextSize(1, 18.0f);
        this.f43524a.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        this.f43524a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.f43524a.setMaxLines(1);
        this.f43524a.setLines(1);
        this.f43524a.setBackground(null);
        this.f43524a.setPadding(0, 0, 0, 0);
        this.f43524a.setSingleLine(true);
        this.f43524a.setInputType(163872);
        this.f43524a.setImeOptions(6);
        this.f43524a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f43524a.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.f43524a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f43524a.setCursorWidth(1.5f);
        this.A.addView(this.f43524a, g7.e6.n(-1, 36));
        this.f43524a.addTextChangedListener(new o0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.B = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f43549y.addView(this.B, g7.e6.n(-1, -2));
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, this, null, true, ChatObject.isChannel(this.T));
        this.C = e80Var;
        e80Var.setDelegate(new oo(this, context));
        this.C.d(0, null, false);
        this.B.addView(this.C);
        po poVar = new po(this, context, this.resourceProvider);
        this.f43533f = poVar;
        poVar.setBottomPadding(6);
        this.h.addView(this.f43533f, g7.e6.n(-2, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.f43528c = b9Var;
        b9Var.setImportantForAccessibility(1);
        this.h.addView(this.f43528c, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f43529c0 = s4Var;
        this.h.addView(s4Var, g7.e6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f43548x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f43548x, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        this.f43525a0 = z6Var2;
        this.h.addView(z6Var2, g7.e6.n(-1, -2));
        gh.m mVar = this.h;
        uo uoVar = new uo(this, context);
        this.G = uoVar;
        mVar.addView(uoVar, g7.e6.n(-1, -2));
        uo uoVar2 = this.G;
        if (!this.R && !this.J.isEmpty()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        uoVar2.setVisibility(i9);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
        this.D = p8Var;
        p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.D.setOnClickListener(new mo(this, 3));
        this.h.addView(this.D, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.E = b9Var2;
        this.h.addView(b9Var2, g7.e6.n(-1, -2));
        ro roVar = new ro(this, context, this.T, context);
        this.Q = roVar;
        TLRPC.ChatFull chatFull = this.U;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.W) {
            z10 = true;
        } else {
            z10 = false;
        }
        roVar.c(z10);
        ro roVar2 = this.Q;
        TLRPC.ChatFull chatFull2 = this.U;
        org.telegram.ui.Cells.b9 b9Var3 = roVar2.f32640e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(roVar2.f32642n);
        boolean isPublic = ChatObject.isPublic(roVar2.f32642n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            b9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i11, str), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.il, false), new org.telegram.ui.Components.zq(24, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i10 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i10 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i10 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            b9Var3.setText(LocaleController.getString(i10));
        }
        this.h.addView(this.Q);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.M = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.M);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.N = m4Var3;
        m4Var3.setHeight(46);
        this.N.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.M.addView(this.N, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.O = t8Var;
        t8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.X, false);
        this.O.setOnClickListener(new mo(this, 4));
        this.M.addView(this.O, g7.e6.n(-1, -2));
        this.P = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        if (this.W && !ChatObject.isMegagroup(this.T)) {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.M.addView(this.P, g7.e6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.T, true);
        if (!this.R && publicUsername != null) {
            this.f43537i0 = true;
            this.f43524a.setText(publicUsername);
            this.f43524a.setSelection(publicUsername.length());
            this.f43537i0 = false;
        }
        a0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.V) {
                this.U = chatFull;
                this.f43536h0 = chatFull.exported_invite;
                a0();
            }
        } else if (i9 == NotificationCenter.dialogDeleted) {
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
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        int i9 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.F, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4096, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4096, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43524a, 4, null, null, null, null, i13));
        fg.g gVar = this.f43524a;
        int i14 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, 8388608, null, null, null, null, i14));
        LinearLayout linearLayout = this.f43546s;
        int i15 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43549y, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43531e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43526b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43526b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 4096, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43533f, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43533f, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43533f, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23334w6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43528c, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43528c, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43528c, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43525a0, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43548x, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43529c0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4096, null, null, null, null, i11));
        int i17 = org.telegram.ui.ActionBar.f6.f23056g7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.f6.f23074h7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i19 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43547w, 4096, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43547w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43547w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43547w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43547w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43548x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i13));
        int i20 = org.telegram.ui.ActionBar.f6.f23369y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43548x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43548x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43548x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.f23242r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4096, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        fg.g gVar;
        super.onBecomeFullyVisible();
        if (this.f43538j0 && (gVar = this.f43524a) != null) {
            gVar.requestFocus();
            AndroidUtilities.showKeyboard(this.f43524a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        gh.m mVar = this.h;
        if (mVar != null) {
            mVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i12);
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
            this.f43536h0 = tL_chatInviteExported;
            org.telegram.ui.Components.e80 e80Var = this.C;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            e80Var.setLink(str);
            this.C.c(this.f43536h0, this.V);
        }
    }
}
