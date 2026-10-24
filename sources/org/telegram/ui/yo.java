package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class yo extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.p90 H;
    public org.telegram.ui.Cells.r8 I;
    public org.telegram.ui.Cells.e9 J;
    public org.telegram.ui.Cells.b7 K;
    public xo L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public pa P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.l4 S;
    public org.telegram.ui.Cells.w8 T;
    public org.telegram.ui.Cells.e9 U;
    public uo V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public ei.e2 f43899a;
    public long f43900a0;
    public EditTextBoldCursor f43901b;
    public boolean f43902b0;
    public org.telegram.ui.Cells.e9 f43903c;
    public boolean f43904c0;
    public org.telegram.ui.Cells.l4 d;
    public boolean f43905d0;
    public org.telegram.ui.Cells.l4 e;
    public boolean f43906e0;
    public so f43907f;
    public org.telegram.ui.Cells.b7 f43908f0;
    public ArrayList f43909g0;
    public ai.r h;
    public org.telegram.ui.Cells.r4 f43910h0;
    public int f43911i0;
    public String f43912j0;
    public eh f43913k0;
    public boolean f43914l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.ActionBar.u0 f43915n;
    public boolean f43916n0;
    public boolean f43917o0;
    public HashMap f43918p0;
    public org.telegram.ui.Components.k70 f43919q0;
    public org.telegram.ui.Components.yr f43920r;
    public no f43921r0;
    public org.telegram.ui.Components.cq f43922s;
    public ValueAnimator f43923s0;
    public Boolean f43924t0;
    public boolean f43925u0;
    public LinearLayout v;
    public org.telegram.ui.Cells.j6 f43926w;
    public org.telegram.ui.Cells.j6 f43927x;
    public LinearLayout f43928y;

    public static org.telegram.ui.ActionBar.g6 U(yo yoVar) {
        return yoVar.resourceProvider;
    }

    public final void W() {
        if (!this.W && this.f43899a.length() <= 0) {
            ArrayList arrayList = this.O;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f43915n.setEnabled(false);
            this.f43915n.setAlpha(0.5f);
            return;
        }
        this.f43915n.setEnabled(true);
        this.f43915n.setAlpha(1.0f);
    }

    public final boolean X(String str) {
        if (str != null && str.length() > 0) {
            this.f43907f.setVisibility(0);
        } else {
            this.f43907f.setVisibility(8);
        }
        eh ehVar = this.f43913k0;
        if (ehVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ehVar);
            this.f43913k0 = null;
            this.f43912j0 = null;
            if (this.f43911i0 != 0) {
                getConnectionsManager().cancelRequest(this.f43911i0, true);
            }
        }
        this.f43914l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f43902b0) {
                            this.f43907f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f43907f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21405p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f43907f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21405p7);
                        return false;
                    }
                }
            } else {
                this.f43907f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21405p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f43907f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21405p7);
                return false;
            }
            this.f43907f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
            this.f43912j0 = str;
            eh ehVar2 = new eh(13, this, str);
            this.f43913k0 = ehVar2;
            AndroidUtilities.runOnUIThread(ehVar2, 300L);
            return true;
        }
        if (this.f43902b0) {
            this.f43907f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f43907f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f43907f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21405p7);
        return false;
    }

    public final void Y(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.f43900a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ei.o3(6, this, z10)), this.classGuid);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo.Z():void");
    }

    public final void a0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f46725v0 = this.f43902b0;
        j0Var.H0 = new no(this, 0);
        showDialog(j0Var);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21238g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21536w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final void b0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f43921r0);
        }
        if (this.f43920r != null) {
            ValueAnimator valueAnimator = this.f43923s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f43920r.f33027c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f43923s0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 7));
            ValueAnimator valueAnimator2 = this.f43923s0;
            float f12 = this.f43920r.f33027c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f43923s0.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            this.f43923s0.start();
        }
    }

    public final void c0() {
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
        if (this.K == null) {
            return;
        }
        String str = null;
        int i19 = 8;
        if (!this.W && !this.f43905d0 && getUserConfig().isPremium()) {
            this.f43903c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.f43903c;
            int i20 = org.telegram.ui.ActionBar.k6.f21405p7;
            e9Var.setTag(Integer.valueOf(i20));
            org.telegram.ui.ActionBar.r6.W(this.f43903c.getTextView(), i20, null);
            this.E.setVisibility(8);
            this.f43907f.setVisibility(8);
            this.K.setVisibility(8);
            this.f43908f0.setVisibility(0);
            if (this.f43906e0) {
                this.f43910h0.setVisibility(0);
                this.f43928y.setVisibility(8);
            } else {
                this.f43910h0.setVisibility(8);
                this.f43928y.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var2 = this.f43903c;
            int i21 = org.telegram.ui.ActionBar.k6.B6;
            e9Var2.setTag(Integer.valueOf(i21));
            org.telegram.ui.ActionBar.r6.W(this.f43903c.getTextView(), i21, null);
            if (this.f43917o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f43908f0.setVisibility(8);
            this.f43928y.setVisibility(8);
            this.E.setVisibility(0);
            this.f43910h0.setVisibility(8);
            if (this.f43902b0) {
                org.telegram.ui.Cells.e9 e9Var3 = this.f43903c;
                if (this.W) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                e9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.l4 l4Var = this.d;
                if (this.W) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.e9 e9Var4 = this.f43903c;
                if (this.W) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                e9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.d;
                if (this.W) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.F;
            if (this.W) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.G;
            if (this.W) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            LinearLayout linearLayout3 = this.E;
            if (this.W) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.p90 p90Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            p90Var.setLink(str);
            this.H.c(this.m0, this.f43900a0);
            so soVar = this.f43907f;
            if (!this.W && soVar.f22339a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            soVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.f43900a0);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43900a0));
            org.telegram.ui.Cells.e9 e9Var5 = this.J;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            e9Var5.setText(LocaleController.getString(i15));
        }
        boolean z10 = true;
        this.f43926w.a(!this.W);
        this.f43927x.a(this.W);
        this.f43899a.clearFocus();
        uo uoVar = this.V;
        if (uoVar != null) {
            if (this.f43902b0 && !this.W) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            uoVar.setVisibility(i18);
            uo uoVar2 = this.V;
            TLRPC.ChatFull chatFull2 = this.Z;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f43902b0) {
                z10 = false;
            }
            uoVar2.c(z10);
        }
        xo xoVar = this.L;
        if (xoVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i19 = 0;
            }
            xoVar.setVisibility(i19);
        }
        W();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 4));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.k6.f21519v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        this.f43922s = cqVar;
        org.telegram.ui.Components.yr yrVar = new org.telegram.ui.Components.yr(mutate, cqVar);
        this.f43920r = yrVar;
        org.telegram.ui.ActionBar.u0 i14 = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), yrVar);
        this.f43915n = i14;
        org.telegram.ui.ActionBar.r6.z(i14, mutate, i13, null, mode);
        this.h = new ai.r(context);
        qo qoVar = new qo(this, context, this.h, this.resourceProvider);
        this.fragmentView = qoVar;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, qoVar, null);
        org.telegram.ui.Components.ap0 ap0Var = (org.telegram.ui.Components.ap0) this.fragmentView;
        ap0Var.setFillViewport(true);
        ap0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(ap0Var);
        this.h.setOrientation(1);
        boolean z12 = this.f43917o0;
        if (z12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f43902b0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.v, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.e = l4Var;
        l4Var.setHeight(46);
        if (this.f43902b0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.v.addView(this.e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.f43927x = j6Var;
        if (this.f43902b0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.W);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.W);
        }
        this.v.addView(this.f43927x, w7.z5.n(-1, -2));
        this.f43927x.setOnClickListener(new po(this, 1));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.f43926w = j6Var2;
        if (this.f43902b0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.W);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.W);
        }
        this.v.addView(this.f43926w, w7.z5.n(-1, -2));
        this.f43926w.setOnClickListener(new po(this, 2));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        this.K = b7Var;
        this.h.addView(b7Var, w7.z5.n(-1, -2));
        if (z12) {
            this.f43927x.setVisibility(8);
            this.f43926w.setVisibility(8);
            this.K.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.E, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.E.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, w7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43901b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f43901b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f43901b;
        int i15 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor2, i15, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f43901b;
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor3, i16, null);
        this.f43901b.setMaxLines(1);
        this.f43901b.setLines(1);
        this.f43901b.setEnabled(false);
        this.f43901b.setBackground(null);
        this.f43901b.setPadding(0, 0, 0, 0);
        this.f43901b.setSingleLine(true);
        this.f43901b.setInputType(163840);
        this.f43901b.setImeOptions(6);
        this.F.addView(this.f43901b, w7.z5.n(-2, 36));
        ei.e2 e2Var = new ei.e2(this, context, 3);
        this.f43899a = e2Var;
        e2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.F(this.f43899a, i15, null);
        org.telegram.ui.ActionBar.r6.W(this.f43899a, i16, null);
        this.f43899a.setMaxLines(1);
        this.f43899a.setLines(1);
        this.f43899a.setBackground(null);
        this.f43899a.setPadding(0, 0, 0, 0);
        this.f43899a.setSingleLine(true);
        this.f43899a.setInputType(163872);
        this.f43899a.setImeOptions(6);
        this.f43899a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        org.telegram.ui.ActionBar.r6.x(this.f43899a, i16, null);
        this.f43899a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f43899a.setCursorWidth(1.5f);
        this.F.addView(this.f43899a, w7.z5.n(-1, 36));
        this.f43899a.addTextChangedListener(new n0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, w7.z5.n(-1, -2));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, this, null, true, ChatObject.isChannel(this.Y));
        this.H = p90Var;
        p90Var.setDelegate(new ro(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        so soVar = new so(this, context, this.resourceProvider);
        this.f43907f = soVar;
        soVar.setBottomPadding(6);
        this.h.addView(this.f43907f, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f43903c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.f43903c, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.f43910h0 = r4Var;
        this.h.addView(r4Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f43928y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f43928y, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        this.f43908f0 = b7Var2;
        this.h.addView(b7Var2, w7.z5.n(-1, -2));
        ai.r rVar = this.h;
        xo xoVar = new xo(this, context);
        this.L = xoVar;
        rVar.addView(xoVar, w7.z5.n(-1, -2));
        xo xoVar2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        xoVar2.setVisibility(i10);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.I = r8Var;
        r8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.I.setOnClickListener(new po(this, 3));
        this.h.addView(this.I, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.J = e9Var2;
        this.h.addView(e9Var2, w7.z5.n(-1, -2));
        uo uoVar = new uo(this, context, this.Y, context);
        this.V = uoVar;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f43902b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        uoVar.c(z10);
        uo uoVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.e9 e9Var3 = uoVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(uoVar2.f25628n);
        boolean isPublic = ChatObject.isPublic(uoVar2.f25628n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            StringBuilder sb2 = new StringBuilder("@");
            z11 = false;
            sb2.append(DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id))));
            String sb3 = sb2.toString();
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            e9Var3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(i12, sb3), org.telegram.ui.ActionBar.k6.il, null, new org.telegram.ui.Components.wt(19, chatFull2, this)));
        } else {
            z11 = false;
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            e9Var3.setText(LocaleController.getString(i11));
        }
        this.h.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.R);
        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context, 23);
        this.S = l4Var3;
        l4Var3.setHeight(46);
        this.S.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.R.addView(this.S, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.T = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f43904c0, z11);
        this.T.setOnClickListener(new po(this, 4));
        this.R.addView(this.T, w7.z5.n(-1, -2));
        this.U = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (this.f43902b0 && !ChatObject.isMegagroup(this.Y)) {
            this.U.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.U.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.R.addView(this.U, w7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.Y, true);
        if (!this.W && publicUsername != null) {
            this.f43916n0 = true;
            this.f43899a.setText(publicUsername);
            this.f43899a.setSelection(publicUsername.length());
            this.f43916n0 = false;
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20345id == this.f43900a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                c0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.f43900a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                if (h5Var != null && h5Var.getLastFragment() == this) {
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
        int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21405p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        LinearLayout linearLayout = this.v;
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43928y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43910h0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43926w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43927x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
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
        if (this.f43917o0 && (e2Var = this.f43899a) != null) {
            e2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f43899a);
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
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            org.telegram.ui.Components.p90 p90Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            p90Var.setLink(str);
            this.H.c(this.m0, this.f43900a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.cq cqVar = this.f43922s;
            if (cqVar != null) {
                cqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21519v8, false));
            }
            org.telegram.ui.Cells.r4 r4Var = this.f43910h0;
            if (r4Var != null && r4Var.getChildCount() > 0 && (this.f43910h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f43910h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21256h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f43928y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f43928y.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.f22742n, nVar.f22741f);
                        nVar.f22738a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.k70 k70Var = this.f43919q0;
            if (k70Var != null) {
                k70Var.updateColors();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
