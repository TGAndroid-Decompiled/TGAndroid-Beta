package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rg.x1;
import tg.b0;
import tg.i;
public final class xy0 implements View.OnClickListener {
    public final int f44205a;
    public final Object f44206b;
    public final Object f44207c;

    public xy0(int i10, Object obj, Object obj2) {
        this.f44205a = i10;
        this.f44206b = obj;
        this.f44207c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        long j3;
        ci.u5 u5Var;
        qg.l2 j10;
        int i10 = 8;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        long j11 = 0;
        int i11 = 0;
        switch (this.f44205a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f44206b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44207c;
                long j12 = profileActivity.f34082e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                qq qqVar = new qq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                qqVar.X0 = new oz0(profileActivity, chat, qqVar);
                profileActivity.presentFragment(qqVar);
                return;
            case 1:
                q21 q21Var = (q21) this.f44206b;
                Context context = (Context) this.f44207c;
                StringBuilder sb2 = new StringBuilder();
                String obj = q21Var.f41152a[0].getText().toString();
                String obj2 = q21Var.f41152a[3].getText().toString();
                String obj3 = q21Var.f41152a[2].getText().toString();
                String obj4 = q21Var.f41152a[1].getText().toString();
                String obj5 = q21Var.f41152a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj4)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                    }
                    if (q21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder v = a1.g.v(str);
                        v.append(sb2.toString());
                        org.telegram.ui.Components.rj0 rj0Var = new org.telegram.ui.Components.rj0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        rj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        q21Var.showDialog(rj0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                c61 c61Var = (c61) this.f44206b;
                Context context2 = (Context) this.f44207c;
                if (c61Var.f39123w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ns0 ns0Var = new ns0(9, c61Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.f26278a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false);
                        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20651i6, false);
                        int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(context2, null);
                        yd0Var.setTextColor(x02);
                        yd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        yd0Var.setItemCount(5);
                        org.telegram.ui.Components.yd0 yd0Var2 = new org.telegram.ui.Components.yd0(context2, null);
                        yd0Var2.setItemCount(5);
                        yd0Var2.setTextColor(x02);
                        yd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.yd0 yd0Var3 = new org.telegram.ui.Components.yd0(context2, null);
                        yd0Var3.setItemCount(5);
                        yd0Var3.setTextColor(x02);
                        yd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, yd0Var, yd0Var2, yd0Var3, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        y3Var.addView(frameLayout, w7.w5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.w5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, w7.w5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.q4 q4Var = new ai.q4(context2, 17);
                        linearLayout.addView(yd0Var, w7.w5.l(0.5f, 0, 270));
                        yd0Var.setMinValue(0);
                        yd0Var.setMaxValue(365);
                        yd0Var.setWrapSelectorWheel(false);
                        yd0Var.setFormatter(new qr(16));
                        ai.r5 r5Var = new ai.r5(yd0Var, yd0Var2, yd0Var3, 17);
                        yd0Var.setOnValueChangedListener(r5Var);
                        yd0Var2.setMinValue(0);
                        yd0Var2.setMaxValue(23);
                        linearLayout.addView(yd0Var2, w7.w5.l(0.2f, 0, 270));
                        yd0Var2.setFormatter(new qr(17));
                        yd0Var2.setOnValueChangedListener(r5Var);
                        yd0Var3.setMinValue(0);
                        yd0Var3.setMaxValue(59);
                        yd0Var3.setValue(0);
                        yd0Var3.setFormatter(new qr(18));
                        linearLayout.addView(yd0Var3, w7.w5.l(0.3f, 0, 270));
                        yd0Var3.setOnValueChangedListener(r5Var);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j14 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                yd0Var3.setValue(calendar.get(12));
                                yd0Var2.setValue(calendar.get(11));
                                yd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, yd0Var, yd0Var2, yd0Var3);
                        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        q4Var.setGravity(17);
                        q4Var.setTextColor(x04);
                        q4Var.setTextSize(1, 14.0f);
                        q4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x05, x06, x06));
                        q4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(q4Var, w7.w5.t(-1, 48, 83, 16, 15, 16, 16));
                        q4Var.setOnClickListener(new org.telegram.ui.Components.m0(yd0Var, yd0Var2, yd0Var3, calendar, ns0Var, z2Var2, 1));
                        z2Var2.b(y3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var2.f21485a;
                        e3Var.show();
                        e3Var.setBackgroundColor(x03);
                        e3Var.fixNavigationBar(x03);
                        z2Var = z2Var2;
                    }
                    z2Var.f21485a.setOnHideListener(new ei.e0(c61Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f21485a;
                    e3Var2.show();
                    c61Var.f39123w = e3Var2;
                    c61Var.c(false);
                    return;
                }
                return;
            case 3:
                a81 a81Var = (a81) this.f44206b;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f44207c;
                if (a81Var.Z.g() != 0) {
                    vcVar.run(new ArrayList(a81Var.f35726a0.values()));
                    a81Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f44206b;
                ((AlertDialog$Builder) this.f44207c).f20142a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i11 = 7;
                } else if (num.intValue() == 1) {
                    i11 = 90;
                } else if (num.intValue() == 2) {
                    i11 = 183;
                } else if (num.intValue() == 3) {
                    i11 = 365;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i11;
                sessionsActivity.v = i11;
                w81 w81Var = sessionsActivity.f34312a;
                if (w81Var != null) {
                    w81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.v7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f44206b;
                editTextBoldCursor.setText(yh.p7.N0(((Long) this.f44207c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                db1 db1Var = ((ia1) this.f44206b).f38827d0;
                db1Var.getOrCreateStoryViewer().C(db1Var.getParentActivity(), ((ab1) this.f44207c).b(), db1Var.f36759z0, ai.v9.a(db1Var.S));
                return;
            case 7:
                ma1 ma1Var = (ma1) this.f44206b;
                kg.f fVar = (kg.f) this.f44207c;
                int i12 = ma1Var.f39984c;
                na1 na1Var = ma1Var.d;
                org.telegram.ui.Components.l10 l10Var = ma1Var.f39982a;
                if (l10Var.f27976c) {
                    ArrayList arrayList = na1Var.f40344n;
                    ig.g gVar = na1Var.f40341c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((ma1) arrayList.get(i13)).f39982a.f27976c || !((ma1) arrayList.get(i13)).f39982a.f27975b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    na1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(l10Var);
                        return;
                    }
                    l10Var.setChecked(!l10Var.f27975b);
                    fVar.f14849n = l10Var.f27975b;
                    na1Var.f40340b.z();
                    if (na1Var.f40345r.f40894c > 0 && i12 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i12)).f14849n = l10Var.f27975b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                vy vyVar = (vy) this.f44207c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vyVar.getParentActivity());
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ns0(11, (lb1) this.f44206b, vyVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                vyVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                    return;
                }
                return;
            case 9:
                ee1 ee1Var = (ee1) this.f44206b;
                Context context3 = (Context) this.f44207c;
                if (ee1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var3 = new org.telegram.ui.ActionBar.z2(ee1Var.getParentActivity(), null);
                    z2Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.v0.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.w5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    z2Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.h6.F.size();
                    while (i11 < size2) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) org.telegram.ui.ActionBar.h6.F.get(i11);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(g6Var);
                        }
                        i11++;
                    }
                    gc1 gc1Var = new gc1(context3, ee1Var, arrayList2, new ArrayList(), z2Var3);
                    linearLayout2.addView(gc1Var, w7.w5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    gc1Var.y1(ee1Var.fragmentView.getMeasuredWidth());
                    ee1Var.showDialog(z2Var3.f21485a);
                    return;
                }
                return;
            case 10:
                xi1 xi1Var = (xi1) this.f44206b;
                Context context4 = (Context) this.f44207c;
                tg.m1 m1Var = xi1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    xi1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, xi1Var.f43983a, null, 4, new ai.a1());
                TLRPC.User user = xi1Var.f43989c;
                if (user != null) {
                    j3 = user.f19950id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = xi1Var.d;
                if (user2 != null) {
                    j11 = user2.f19950id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new hh.b(2);
                xi1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.f44207c;
                if (!((ci.d) this.f44206b).N) {
                    k2Var.dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f44207c;
                if (!((org.telegram.ui.Wallet.b2) this.f44206b).f34497m) {
                    j2Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Wallet.a4 a4Var = (org.telegram.ui.Wallet.a4) this.f44206b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f44207c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    a4Var.dismiss();
                    org.telegram.ui.Wallet.u8 u8Var = new org.telegram.ui.Wallet.u8();
                    u8Var.g0(nftitem);
                    U.presentFragment(u8Var);
                    return;
                }
                return;
            case 14:
                ((Runnable) this.f44206b).run();
                ((org.telegram.ui.Wallet.k2[]) this.f44207c)[0].dismiss();
                return;
            case 15:
                org.telegram.ui.Wallet.c5.Y((org.telegram.ui.Wallet.c5) this.f44206b, (Context) this.f44207c, view);
                return;
            case 16:
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f44206b;
                TextView textView4 = (TextView) this.f44207c;
                a2Var2.c(!a2Var2.b(), true);
                if (a2Var2.b()) {
                    i10 = 0;
                }
                textView4.setVisibility(i10);
                return;
            case 17:
                ci.d dVar = (ci.d) this.f44206b;
                int[] iArr = (int[]) this.f44207c;
                if (!dVar.N && (u5Var = oj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] i15 = u5Var.i();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f6535c).h;
                        b8.e eVar = new b8.e(t0Var, (String) u5Var.f6065c, "/tg-wear-auth/answer", i15);
                        t0Var.f6688b.d(0, eVar);
                        n6.m.n(eVar, y8.j0.f52020a).addOnSuccessListener(new d7(u5Var, dVar, iArr, 24)).addOnFailureListener(new nj1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 18:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f44206b;
                kVar.f43310b = true;
                ((y) this.f44207c).run();
                kVar.f43317w.W2.N(true);
                return;
            case 19:
                pg.x xVar = (pg.x) this.f44206b;
                Context context5 = (Context) this.f44207c;
                if (!xVar.f45729n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f45729n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f45729n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f45729n.f().addView(nVar, w7.w5.d(-1.0f, -1));
                    pg.u uVar = xVar.f45729n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.c5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.js.f27634f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.s0(nVar, 11));
                    duration.start();
                    xVar.f45729n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 20:
                qg.o2 o2Var = (qg.o2) this.f44206b;
                ci.ed edVar = (ci.ed) this.f44207c;
                qg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j10 = o2Var.j(o2Var.f46436n0, o2Var.f46437o0)) != null) {
                    edVar.run(j10);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.no.g0((eo) this.f44207c, 41026, new ii.q1((qh.c) this.f44206b, 10), null);
                return;
            case 22:
                rg.j0.W((rg.j0) this.f44206b, (Context) this.f44207c);
                return;
            case 23:
                tg.s0 s0Var = (tg.s0) this.f44206b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f44207c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f48645a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i11 < size3) {
                            Object obj6 = arrayList3.get(i11);
                            i11++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.r.a(chat2.f19803id, arrayList4, new ai.f4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                tg.m1 m1Var3 = (tg.m1) this.f44206b;
                ArrayList arrayList5 = (ArrayList) this.f44207c;
                HashSet hashSet2 = m1Var3.f48601h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.f48606n0.remove(l4);
                }
                m1Var3.X();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.j0(true, true);
                m1Var3.Y();
                return;
            case 25:
                tg.m1.T((tg.m1) this.f44206b, (TLRPC.User) this.f44207c, view);
                return;
            case 26:
                final ug.e eVar2 = (ug.e) this.f44206b;
                final vg.a aVar = (vg.a) this.f44207c;
                if (eVar2.d) {
                    if (!aVar.f49799a.N) {
                        aVar.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new x1(b0Var, 11), 200L);
                                        b0Var.f48535r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f49161n, eVar3.f49158c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new x1(b0Var, 11), 200L);
                                        b0Var.f48535r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f49161n, eVar3.f49158c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((tg.b0) eVar2).f48535r.dismiss();
                return;
            case 27:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f44207c;
                vg.f fVar2 = ((vg.g) this.f44206b).v;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.t) fVar2).f48648a;
                    a0Var.f48507c0.remove(chat3);
                    a0Var.b0(true, true);
                    return;
                }
                return;
            case 28:
                ((ii.q1) this.f44206b).run((TLRPC.TL_payments_checkedGiftCode) this.f44207c);
                return;
            default:
                ((ii.q1) this.f44206b).run((TLRPC.Chat) this.f44207c);
                return;
        }
    }
}
