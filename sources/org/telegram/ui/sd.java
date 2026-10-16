package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sd extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.h50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.yj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.w90 P;
    public org.telegram.ui.Cells.j6 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public org.telegram.messenger.voip.p0 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.u0 f39760a;
    public boolean f39761a0;
    public org.telegram.ui.Components.ds f39762b;
    public boolean f39763b0;
    public org.telegram.ui.Components.vu f39764c;
    public TLRPC.TL_chatInviteExported f39765c0;
    public org.telegram.ui.Cells.a7 d;
    public boolean f39766d0;
    public bi.k5 e;
    public org.telegram.ui.Cells.e9 f39767e0;
    public di.p6 f39768f;
    public final ArrayList f39769f0;
    public org.telegram.ui.Cells.s4 f39770g0;
    public pd h;
    public final int f39771h0;
    public final long f39772i0;
    public boolean f39773j0;
    public final Boolean f39774k0;
    public TLRPC.InputFile f39775l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f39776n;
    public TLRPC.VideoSize f39777n0;
    public String f39778o0;
    public double f39779p0;
    public boolean f39780q0;
    public qd f39781r;
    public boolean f39782r0;
    public final org.telegram.ui.Components.k9 f39783s;
    public Integer f39784s0;
    public Utilities.Callback2 f39785t0;
    public org.telegram.ui.ActionBar.a2 f39786u0;
    public final org.telegram.ui.Components.i50 v;
    public final id f39787v0;
    public EditTextBoldCursor f39788w;
    public ValueAnimator f39789w0;
    public TLRPC.FileLocation f39790x;
    public TLRPC.FileLocation f39791y;

    public sd(Bundle bundle) {
        super(bundle);
        this.f39769f0 = new ArrayList();
        this.f39773j0 = true;
        this.f39787v0 = new id(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f39771h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39774k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f39783s = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            this.v = new org.telegram.ui.Components.i50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new hd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39773j0 = z10;
            this.f39761a0 = !z10;
            if (!z10 && !this.f39766d0) {
                this.f39766d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new hd(this, 0));
            }
        }
        this.f39772i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(sd sdVar, org.telegram.ui.ActionBar.a2 a2Var) {
        sdVar.f39782r0 = false;
        sdVar.f39780q0 = false;
        if (sdVar.f39784s0 != null) {
            ConnectionsManager.getInstance(sdVar.currentAccount).cancelRequest(sdVar.f39784s0.intValue(), true);
            sdVar.f39784s0 = null;
        }
        sdVar.g0(false);
        a2Var.dismiss();
    }

    public static void V(sd sdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(sdVar.currentAccount).sendRequest(tL_channels_updateUsername, new hd(sdVar, 1), 64);
    }

    public static void W(sd sdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(sdVar.currentAccount).getInputChannel(sdVar.f39772i0);
        sdVar.W = ConnectionsManager.getInstance(sdVar.currentAccount).sendRequest(tL_channels_checkUsername, new fa(sdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(sd sdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(sdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(sdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.y0(8, sdVar, currentChannel));
        sdVar.showDialog(a2Var);
    }

    public static void Y(sd sdVar) {
        if (sdVar.f39786u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new b1(sdVar, 12));
        sdVar.f39786u0 = alertDialog$Builder.o();
    }

    @Override
    public final void E(float f7) {
        qd qdVar = this.f39781r;
        if (qdVar == null) {
            return;
        }
        qdVar.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        qd qdVar = this.f39781r;
        if (qdVar == null) {
            return;
        }
        qdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        int i15;
        float f11;
        float f12;
        int i16;
        float f13;
        float f14;
        int i17;
        float f15;
        float f16;
        float f17;
        float f18;
        int i18;
        int i19;
        int i20;
        sd sdVar = this;
        org.telegram.ui.Components.vu vuVar = sdVar.f39764c;
        if (vuVar != null) {
            vuVar.o();
        }
        sdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        sdVar.actionBar.setAllowOverlayTitle(true);
        sdVar.actionBar.setActionBarMenuOnItemClick(new nd(sdVar));
        org.telegram.ui.ActionBar.y n10 = sdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.g6.f19935v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ds dsVar = new org.telegram.ui.Components.ds(mutate, new org.telegram.ui.Components.gq(org.telegram.ui.ActionBar.g6.x0(null, i21, false)));
        sdVar.f39762b = dsVar;
        sdVar.f39760a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), dsVar);
        int i22 = sdVar.f39771h0;
        if (i22 == 0) {
            sdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            od odVar = new od(0, context, sdVar);
            odVar.setOnTouchListener(new ci.d(2));
            sdVar.fragmentView = odVar;
            int i23 = org.telegram.ui.ActionBar.g6.f19601d6;
            odVar.setTag(Integer.valueOf(i23));
            sdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            sdVar.K = linearLayout;
            linearLayout.setOrientation(1);
            odVar.addView(sdVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            sdVar.K.addView(frameLayout, w7.z5.n(-1, -2));
            bi.k5 k5Var = new bi.k5(sdVar, context, 5);
            sdVar.e = k5Var;
            k5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.k9 k9Var = sdVar.f39783s;
            k9Var.n(5L, null, null);
            sdVar.e.setImageDrawable(k9Var);
            bi.k5 k5Var2 = sdVar.e;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i24 = i14 | 48;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = 16.0f;
            }
            if (z11) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.addView(k5Var2, w7.z5.a(64.0f, f7, 12.0f, f10, 12.0f, 64, i24));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            di.p6 p6Var = new di.p6(sdVar, context, paint, 2);
            sdVar.f39768f = p6Var;
            p6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            di.p6 p6Var2 = sdVar.f39768f;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i25 = i15 | 48;
            if (z12) {
                f11 = 0.0f;
            } else {
                f11 = 16.0f;
            }
            if (z12) {
                f12 = 16.0f;
            } else {
                f12 = 0.0f;
            }
            frameLayout.addView(p6Var2, w7.z5.a(64.0f, f11, 12.0f, f12, 12.0f, 64, i25));
            sdVar.f39768f.setOnClickListener(new kd(sdVar, 1));
            sdVar.J = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            pd pdVar = new pd(sdVar, context, 0);
            sdVar.h = pdVar;
            pdVar.setScaleType(ImageView.ScaleType.CENTER);
            sdVar.h.setAnimation(sdVar.J);
            sdVar.h.setEnabled(false);
            sdVar.h.setClickable(false);
            sdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            pd pdVar2 = sdVar.h;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
            if (z13) {
                f13 = 0.0f;
            } else {
                f13 = 15.0f;
            }
            if (z13) {
                f14 = 15.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.addView(pdVar2, w7.z5.a(64.0f, f13, 12.0f, f14, 12.0f, 64, i26));
            qd qdVar = new qd(sdVar, context, 0);
            sdVar.f39781r = qdVar;
            qdVar.setSize(AndroidUtilities.dp(30.0f));
            sdVar.f39781r.setProgressColor(-1);
            sdVar.f39781r.setNoProgress(false);
            qd qdVar2 = sdVar.f39781r;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i27 = i17 | 48;
            if (z14) {
                f15 = 0.0f;
            } else {
                f15 = 16.0f;
            }
            if (z14) {
                f16 = 16.0f;
            } else {
                f16 = 0.0f;
            }
            frameLayout.addView(qdVar2, w7.z5.a(64.0f, f15, 12.0f, f16, 12.0f, 64, i27));
            sdVar.e0(false, false);
            org.telegram.ui.Components.vu vuVar2 = new org.telegram.ui.Components.vu(context, odVar, this, 0, false, null);
            sdVar = this;
            sdVar.f39764c = vuVar2;
            vuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = sdVar.E;
            if (str != null) {
                sdVar.f39764c.setText(str);
                sdVar.E = null;
            }
            sdVar.f39764c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            sdVar.f39764c.getEditText().setSingleLine(true);
            sdVar.f39764c.getEditText().setImeOptions(5);
            sdVar.f39764c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(sdVar) {
                public final sd f37682b;

                {
                    this.f37682b = sdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            sd sdVar2 = this.f37682b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(sdVar2.f39764c.getEditText().getText())) {
                                    sdVar2.f39788w.requestFocus();
                                    return true;
                                }
                            } else {
                                sdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (u0Var = this.f37682b.f39760a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.vu vuVar3 = sdVar.f39764c;
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                f17 = 5.0f;
            } else {
                f17 = 96.0f;
            }
            if (z15) {
                f18 = 96.0f;
            } else {
                f18 = 5.0f;
            }
            frameLayout.addView(vuVar3, w7.z5.a(-2.0f, f17, 0.0f, f18, 0.0f, -1, 16));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            sdVar.f39788w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            sdVar.f39788w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = sdVar.f39788w;
            int i28 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i28, false));
            sdVar.f39788w.setBackgroundDrawable(null);
            sdVar.f39788w.setLineColors(sdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19728k6), sdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19745l6), sdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19822p7));
            sdVar.f39788w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = sdVar.f39788w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            sdVar.f39788w.setInputType(180225);
            sdVar.f39788w.setImeOptions(6);
            sdVar.f39788w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            sdVar.f39788w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            sdVar.f39788w.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i28, false));
            sdVar.f39788w.setCursorSize(AndroidUtilities.dp(20.0f));
            sdVar.f39788w.setCursorWidth(1.5f);
            sdVar.K.addView(sdVar.f39788w, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            sdVar.f39788w.setOnEditorActionListener(new TextView.OnEditorActionListener(sdVar) {
                public final sd f37682b;

                {
                    this.f37682b = sdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            sd sdVar2 = this.f37682b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(sdVar2.f39764c.getEditText().getText())) {
                                    sdVar2.f39788w.requestFocus();
                                    return true;
                                }
                            } else {
                                sdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (u0Var = this.f37682b.f39760a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            sdVar.f39788w.addTextChangedListener(new rd(0));
            TextView textView = new TextView(context);
            sdVar.T = textView;
            textView.setTextSize(1, 15.0f);
            sdVar.T.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F6, false));
            TextView textView2 = sdVar.T;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            sdVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = sdVar.K;
            TextView textView3 = sdVar.T;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, w7.z5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            sdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            sdVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(sdVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = sdVar.getMessagesController();
            long j10 = sdVar.f39772i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            sdVar.I = z10;
            org.telegram.ui.ActionBar.k kVar = sdVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = sdVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.g6.f19543a7;
            view.setTag(Integer.valueOf(i29));
            sdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i29, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            sdVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = sdVar.G;
            int i30 = org.telegram.ui.ActionBar.g6.f19601d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i30, false));
            org.telegram.ui.Cells.m4 m4Var3 = sdVar.G;
            if (sdVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            m4Var3.setText(LocaleController.getString(i11));
            sdVar.K.addView(sdVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            sdVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            sdVar.F.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i30, false));
            sdVar.K.addView(sdVar.F, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            sdVar.Q = j6Var;
            j6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
            Boolean bool = sdVar.f39774k0;
            if (bool != null && !bool.booleanValue()) {
                sdVar.f39761a0 = true;
            }
            if (sdVar.I) {
                sdVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !sdVar.f39761a0);
            } else {
                sdVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !sdVar.f39761a0);
            }
            sdVar.Q.setOnClickListener(new kd(sdVar, 2));
            if (bool == null || bool.booleanValue()) {
                sdVar.F.addView(sdVar.Q, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            sdVar.R = j6Var2;
            j6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
            if (bool != null && bool.booleanValue()) {
                sdVar.f39761a0 = false;
            }
            if (sdVar.I) {
                sdVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, sdVar.f39761a0);
            } else {
                sdVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, sdVar.f39761a0);
            }
            sdVar.R.setOnClickListener(new kd(sdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                sdVar.F.addView(sdVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
            sdVar.d = a7Var;
            sdVar.K.addView(a7Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            sdVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            sdVar.M.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i30, false));
            sdVar.K.addView(sdVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            sdVar.V = m4Var4;
            sdVar.M.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            sdVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            sdVar.M.addView(sdVar.N, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            sdVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(sdVar.currentAccount).linkPrefix + "/");
            sdVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = sdVar.H;
            int i31 = org.telegram.ui.ActionBar.g6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = sdVar.H;
            int i32 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i32, false));
            sdVar.H.setMaxLines(1);
            sdVar.H.setLines(1);
            sdVar.H.setEnabled(false);
            sdVar.H.setBackgroundDrawable(null);
            sdVar.H.setPadding(0, 0, 0, 0);
            sdVar.H.setSingleLine(true);
            sdVar.H.setInputType(163840);
            sdVar.H.setImeOptions(6);
            sdVar.N.addView(sdVar.H, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            sdVar.f39788w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            sdVar.f39788w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i31, false));
            sdVar.f39788w.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i32, false));
            sdVar.f39788w.setMaxLines(1);
            sdVar.f39788w.setLines(1);
            sdVar.f39788w.setBackgroundDrawable(null);
            sdVar.f39788w.setPadding(0, 0, 0, 0);
            sdVar.f39788w.setSingleLine(true);
            sdVar.f39788w.setInputType(163872);
            sdVar.f39788w.setImeOptions(6);
            sdVar.f39788w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            sdVar.f39788w.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i32, false));
            sdVar.f39788w.setCursorSize(AndroidUtilities.dp(20.0f));
            sdVar.f39788w.setCursorWidth(1.5f);
            sdVar.N.addView(sdVar.f39788w, w7.z5.n(-1, 36));
            sdVar.f39788w.addTextChangedListener(new n0(sdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            sdVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            sdVar.M.addView(sdVar.O, w7.z5.n(-1, -2));
            org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(context, sdVar, null, true, ChatObject.isChannel(sdVar.getMessagesController().getChat(Long.valueOf(j10))));
            sdVar.P = w90Var;
            w90Var.b(true);
            sdVar.P.d(0, null, false);
            sdVar.O.addView(sdVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(sdVar, context, 3);
            sdVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
            sdVar.U.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K6, false));
            sdVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.y1 y1Var2 = sdVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            y1Var2.setGravity(i12);
            sdVar.U.setVisibility(8);
            sdVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = sdVar.M;
            org.telegram.ui.Cells.y1 y1Var3 = sdVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(y1Var3, w7.z5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            sdVar.S = e9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.g6.f19563b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, i33, i34));
            sdVar.K.addView(sdVar.S, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            sdVar.f39770g0 = s4Var;
            sdVar.K.addView(s4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            sdVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i30, false));
            sdVar.L.setOrientation(1);
            sdVar.K.addView(sdVar.L, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            sdVar.f39767e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, i34));
            sdVar.K.addView(sdVar.f39767e0, w7.z5.n(-1, -2));
            sdVar.h0();
        }
        return sdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.U.setVisibility(0);
        } else {
            this.U.setVisibility(8);
        }
        org.telegram.messenger.voip.p0 p0Var = this.Y;
        if (p0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p0Var);
            this.Y = null;
            this.X = null;
            if (this.W != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
            }
        }
        this.Z = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.y1 y1Var = this.U;
                        int i11 = org.telegram.ui.ActionBar.g6.f19822p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.g6.f19822p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.g6.f19822p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.g6.f19822p7;
                y1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.g6.F6;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            this.X = str;
            org.telegram.messenger.voip.p0 p0Var2 = new org.telegram.messenger.voip.p0(29, this, str);
            this.Y = p0Var2;
            AndroidUtilities.runOnUIThread(p0Var2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.g6.f19822p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.a2 a2Var = this.f39786u0;
            if (a2Var != null) {
                try {
                    a2Var.dismiss();
                    this.f39786u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f39782r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.a2 a2Var2 = this.f39786u0;
            if (a2Var2 != null) {
                try {
                    a2Var2.dismiss();
                    this.f39786u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39773j0);
            Boolean bool = this.f39774k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39775l0 != null || this.m0 != null || this.f39777n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f39775l0, this.m0, this.f39777n0, this.f39779p0, this.f39778o0, this.f39790x, this.f39791y, null);
            }
            sd sdVar = new sd(bundle);
            sdVar.f39785t0 = this.f39785t0;
            presentFragment(sdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null && i50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if ((i50Var == null || dialog != i50Var.f25500c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39776n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39776n.cancel();
            this.f39776n = null;
        }
        if (z11) {
            this.f39776n = new AnimatorSet();
            if (z10) {
                this.f39781r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39776n;
                pd pdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(pdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39781r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39776n;
                pd pdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39781r, property2, 0.0f));
            }
            this.f39776n.setDuration(180L);
            this.f39776n.addListener(new ah.p0(28, this, z10));
            this.f39776n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f39781r.setAlpha(1.0f);
            this.f39781r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39781r.setAlpha(0.0f);
            this.f39781r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f45223v0 = true;
        j0Var.H0 = new id(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39787v0);
        }
        if (this.f39762b != null) {
            ValueAnimator valueAnimator = this.f39789w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f39762b.f24174c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39789w0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 4));
            ValueAnimator valueAnimator2 = this.f39789w0;
            float f12 = this.f39762b.f24174c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f39789w0.setInterpolator(org.telegram.ui.Components.es.f24465f);
            this.f39789w0.start();
        }
    }

    @Override
    public final jv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39764c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        org.telegram.ui.Components.vu vuVar = this.f39764c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.vu vuVar2 = this.f39764c;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.vu vuVar3 = this.f39764c;
        int i13 = org.telegram.ui.ActionBar.g6.f19728k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.vu vuVar4 = this.f39764c;
        int i14 = org.telegram.ui.ActionBar.g6.f19745l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39788w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39788w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39788w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39788w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.g6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.a7 a7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.g6.f19563b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(a7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.g6.f19822p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.f19952w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39767e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.g6.f19690i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39770g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19673h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.f19655g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.f19674h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.g6.f20005z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.g6.f19988y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f19852r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final void h0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        if (this.d == null) {
            return;
        }
        String str = null;
        int i16 = 8;
        if (!this.f39761a0 && !this.f39773j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.g6.f19822p7;
            e9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f39766d0) {
                this.f39770g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var2 = this.S;
                e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
                this.f39767e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var3 = this.S;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(e9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19563b7));
                this.f39770g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f39767e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.g6.B6;
            e9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
            this.d.setVisibility(0);
            this.f39767e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var5 = this.S;
            e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(e9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
            this.M.setVisibility(0);
            this.f39770g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.e9 e9Var6 = this.S;
                if (this.f39761a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                e9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.m4 m4Var = this.V;
                if (this.f39761a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.e9 e9Var7 = this.S;
                if (this.f39761a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                e9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.V;
                if (this.f39761a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f39761a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f39761a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f39761a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.w90 w90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39765c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            w90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f39761a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f39761a0);
        this.R.a(this.f39761a0);
        this.f39788w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39788w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vu vuVar = this.f39764c;
        if (vuVar == null || !vuVar.e) {
            return true;
        }
        if (z10) {
            vuVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39771h0 == 1 && !this.f39763b0 && this.f39765c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39772i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.f39765c0 = chatFull.exported_invite;
            }
            if (this.f39765c0 == null) {
                this.f39763b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new hd(this, 3));
            }
        }
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.f25498a = this;
            i50Var.f25499b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39784s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39784s0.intValue(), true);
            this.f39784s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.vu vuVar = this.f39764c;
        if (vuVar != null) {
            vuVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.vu vuVar = this.f39764c;
        if (vuVar != null) {
            vuVar.r();
        }
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.j(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.vu vuVar = this.f39764c;
        if (vuVar != null) {
            vuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.k();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f39771h0 != 1) {
            this.f39764c.requestFocus();
            org.telegram.ui.Components.qu quVar = this.f39764c.f30318a;
            quVar.requestFocus();
            AndroidUtilities.showKeyboard(quVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39771h0 == 0) {
            org.telegram.ui.Components.i50 i50Var = this.v;
            if (i50Var != null) {
                i50Var.f25501f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.vu vuVar = this.f39764c;
                if (vuVar != null) {
                    vuVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39771h0 == 0) {
            org.telegram.ui.Components.i50 i50Var = this.v;
            if (i50Var != null && (str = i50Var.f25501f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.vu vuVar = this.f39764c;
            if (vuVar != null) {
                String obj = vuVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }
}
