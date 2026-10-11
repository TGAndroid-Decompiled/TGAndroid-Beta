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
import tg.a0;
import tg.i;
public final class uy0 implements View.OnClickListener {
    public final int f42795a;
    public final Object f42796b;
    public final Object f42797c;

    public uy0(int i10, Object obj, Object obj2) {
        this.f42795a = i10;
        this.f42796b = obj;
        this.f42797c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i10;
        long j3;
        ci.u5 u5Var;
        qg.k2 j10;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.z2 z2Var = null;
        int i11 = 0;
        switch (this.f42795a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f42796b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f42797c;
                long j12 = profileActivity.f34271e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                nq nqVar = new nq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                nqVar.X0 = new lz0(profileActivity, chat, nqVar);
                profileActivity.presentFragment(nqVar);
                return;
            case 1:
                m21 m21Var = (m21) this.f42796b;
                Context context = (Context) this.f42797c;
                StringBuilder sb2 = new StringBuilder();
                String obj = m21Var.f39793a[0].getText().toString();
                String obj2 = m21Var.f39793a[3].getText().toString();
                String obj3 = m21Var.f39793a[2].getText().toString();
                String obj4 = m21Var.f39793a[1].getText().toString();
                String obj5 = m21Var.f39793a[4].getText().toString();
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
                    if (m21Var.v == 2) {
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
                        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        qj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        m21Var.showDialog(qj0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                y51 y51Var = (y51) this.f42796b;
                Context context2 = (Context) this.f42797c;
                if (y51Var.f37572w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    js0 js0Var = new js0(10, y51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.f26605a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false);
                        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false);
                        int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context2, null);
                        z2Var2.a();
                        org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context2, null);
                        vd0Var.setTextColor(x02);
                        vd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        vd0Var.setItemCount(5);
                        org.telegram.ui.Components.vd0 vd0Var2 = new org.telegram.ui.Components.vd0(context2, null);
                        vd0Var2.setItemCount(5);
                        vd0Var2.setTextColor(x02);
                        vd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.vd0 vd0Var3 = new org.telegram.ui.Components.vd0(context2, null);
                        vd0Var3.setItemCount(5);
                        vd0Var3.setTextColor(x02);
                        vd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, vd0Var, vd0Var2, vd0Var3, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        y3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.q4 q4Var = new ai.q4(context2, 17);
                        linearLayout.addView(vd0Var, w7.x5.l(0.5f, 0, 270));
                        vd0Var.setMinValue(0);
                        vd0Var.setMaxValue(365);
                        vd0Var.setWrapSelectorWheel(false);
                        vd0Var.setFormatter(new ig(18));
                        ai.r5 r5Var = new ai.r5(vd0Var, vd0Var2, vd0Var3, 17);
                        vd0Var.setOnValueChangedListener(r5Var);
                        vd0Var2.setMinValue(0);
                        vd0Var2.setMaxValue(23);
                        linearLayout.addView(vd0Var2, w7.x5.l(0.2f, 0, 270));
                        vd0Var2.setFormatter(new ig(19));
                        vd0Var2.setOnValueChangedListener(r5Var);
                        vd0Var3.setMinValue(0);
                        vd0Var3.setMaxValue(59);
                        vd0Var3.setValue(0);
                        vd0Var3.setFormatter(new ig(20));
                        linearLayout.addView(vd0Var3, w7.x5.l(0.3f, 0, 270));
                        vd0Var3.setOnValueChangedListener(r5Var);
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
                                vd0Var3.setValue(calendar.get(12));
                                vd0Var2.setValue(calendar.get(11));
                                vd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, vd0Var, vd0Var2, vd0Var3);
                        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        q4Var.setGravity(17);
                        q4Var.setTextColor(x04);
                        q4Var.setTextSize(1, 14.0f);
                        q4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x05, x06, x06));
                        q4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        q4Var.setOnClickListener(new org.telegram.ui.Components.m0(vd0Var, vd0Var2, vd0Var3, calendar, js0Var, z2Var2, 1));
                        z2Var2.b(y3Var);
                        org.telegram.ui.ActionBar.e3 e3Var = z2Var2.f21710a;
                        e3Var.show();
                        e3Var.setBackgroundColor(x03);
                        e3Var.fixNavigationBar(x03);
                        z2Var = z2Var2;
                    }
                    z2Var.f21710a.setOnHideListener(new ei.e0(y51Var, zArr, 11));
                    org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f21710a;
                    e3Var2.show();
                    y51Var.f37572w = e3Var2;
                    y51Var.c(false);
                    return;
                }
                return;
            case 3:
                w71 w71Var = (w71) this.f42796b;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f42797c;
                if (w71Var.Z.g() != 0) {
                    vcVar.run(new ArrayList(w71Var.f43231a0.values()));
                    w71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f42796b;
                ((AlertDialog$Builder) this.f42797c).f20368a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i10 = 7;
                } else if (num.intValue() == 1) {
                    i10 = 90;
                } else if (num.intValue() == 2) {
                    i10 = 183;
                } else if (num.intValue() == 3) {
                    i10 = 365;
                } else {
                    i10 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i10;
                sessionsActivity.v = i10;
                t81 t81Var = sessionsActivity.f34501a;
                if (t81Var != null) {
                    t81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.v7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f42796b;
                editTextBoldCursor.setText(yh.p7.N0(((Long) this.f42797c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                ab1 ab1Var = ((fa1) this.f42796b).f37620d0;
                ab1Var.getOrCreateStoryViewer().C(ab1Var.getParentActivity(), ((xa1) this.f42797c).b(), ab1Var.f35996z0, ai.v9.a(ab1Var.S));
                return;
            case 7:
                ja1 ja1Var = (ja1) this.f42796b;
                kg.f fVar = (kg.f) this.f42797c;
                int i12 = ja1Var.f38964c;
                ka1 ka1Var = ja1Var.d;
                org.telegram.ui.Components.j10 j10Var = ja1Var.f38962a;
                if (j10Var.f27512c) {
                    ArrayList arrayList = ka1Var.f39253n;
                    ig.g gVar = ka1Var.f39250c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((ja1) arrayList.get(i13)).f38962a.f27512c || !((ja1) arrayList.get(i13)).f38962a.f27511b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    ka1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(j10Var);
                        return;
                    }
                    j10Var.setChecked(true ^ j10Var.f27511b);
                    fVar.f14851n = j10Var.f27511b;
                    ka1Var.f39249b.z();
                    if (ka1Var.f39254r.f39883c > 0 && i12 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i12)).f14851n = j10Var.f27511b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                sy syVar = (sy) this.f42797c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar.getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new js0(12, (ib1) this.f42796b, syVar));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                syVar.showDialog(a2Var);
                TextView textView2 = (TextView) a2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
                    return;
                }
                return;
            case 9:
                be1 be1Var = (be1) this.f42796b;
                Context context3 = (Context) this.f42797c;
                if (be1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 z2Var3 = new org.telegram.ui.ActionBar.z2(be1Var.getParentActivity(), null);
                    z2Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
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
                    dc1 dc1Var = new dc1(context3, be1Var, arrayList2, new ArrayList(), z2Var3);
                    linearLayout2.addView(dc1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    dc1Var.y1(be1Var.fragmentView.getMeasuredWidth());
                    be1Var.showDialog(z2Var3.f21710a);
                    return;
                }
                return;
            case 10:
                ui1 ui1Var = (ui1) this.f42796b;
                Context context4 = (Context) this.f42797c;
                tg.m1 m1Var = ui1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    ui1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, ui1Var.f42577a, null, 4, new ai.a1());
                TLRPC.User user = ui1Var.f42583c;
                if (user != null) {
                    j3 = user.f20179id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = ui1Var.d;
                if (user2 != null) {
                    j11 = user2.f20179id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new hh.b(2);
                ui1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.f42797c;
                if (!((ci.d) this.f42796b).N) {
                    k2Var.dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f42797c;
                if (!((org.telegram.ui.Wallet.b2) this.f42796b).f34686m) {
                    j2Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Wallet.a4 a4Var = (org.telegram.ui.Wallet.a4) this.f42796b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f42797c;
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
                ((Runnable) this.f42796b).run();
                ((org.telegram.ui.Wallet.k2[]) this.f42797c)[0].dismiss();
                return;
            case 15:
                org.telegram.ui.Wallet.c5.Y((org.telegram.ui.Wallet.c5) this.f42796b, (Context) this.f42797c, view);
                return;
            case 16:
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f42796b;
                TextView textView4 = (TextView) this.f42797c;
                a2Var2.c(!a2Var2.b(), true);
                if (!a2Var2.b()) {
                    i11 = 8;
                }
                textView4.setVisibility(i11);
                return;
            case 17:
                ci.d dVar = (ci.d) this.f42796b;
                int[] iArr = (int[]) this.f42797c;
                if (!dVar.N && (u5Var = lj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = u5Var.h();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f6536c).h;
                        b8.e eVar = new b8.e(t0Var, (String) u5Var.f6066c, "/tg-wear-auth/answer", h);
                        t0Var.f6689b.d(0, eVar);
                        n6.m.n(eVar, y8.j0.f51875a).addOnSuccessListener(new z6(u5Var, dVar, iArr, 24)).addOnFailureListener(new kj1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 18:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f42796b;
                kVar.f43555b = true;
                ((x) this.f42797c).run();
                kVar.f43562w.W2.N(true);
                return;
            case 19:
                pg.x xVar = (pg.x) this.f42796b;
                Context context5 = (Context) this.f42797c;
                if (!xVar.f45871n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f45871n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f45871n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f45871n.f().addView(nVar, w7.x5.d(-1.0f, -1));
                    pg.u uVar = xVar.f45871n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.c5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.is.f27451f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.s0(nVar, 11));
                    duration.start();
                    xVar.f45871n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 20:
                qg.n2 n2Var = (qg.n2) this.f42796b;
                ci.ed edVar = (ci.ed) this.f42797c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.f46527n0, n2Var.f46528o0)) != null) {
                    edVar.run(j10);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.lo.g0((zn) this.f42797c, 41026, new ii.q1((qh.c) this.f42796b, 10), null);
                return;
            case 22:
                rg.j0.W((rg.j0) this.f42796b, (Context) this.f42797c);
                return;
            case 23:
                tg.r0 r0Var = (tg.r0) this.f42796b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f42797c;
                ArrayList arrayList3 = r0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.c0 c0Var = r0Var.f48471a0;
                    if (!c0Var.N) {
                        c0Var.setLoading(true);
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
                        tg.r.a(chat2.f20032id, arrayList4, new ai.f4(r0Var, chat2, arrayList4, hashSet, 17), new ii.q1(r0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                tg.m1 m1Var3 = (tg.m1) this.f42796b;
                ArrayList arrayList5 = (ArrayList) this.f42797c;
                HashSet hashSet2 = m1Var3.f48429h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.f48434n0.remove(l4);
                }
                m1Var3.X();
                m1Var3.Z.b(true, hashSet2, new tg.z0(m1Var3, 5), null);
                m1Var3.j0(true, true);
                m1Var3.Y();
                return;
            case 25:
                tg.m1.T((tg.m1) this.f42796b, (TLRPC.User) this.f42797c, view);
                return;
            case 26:
                final ug.e eVar2 = (ug.e) this.f42796b;
                final vg.a aVar = (vg.a) this.f42797c;
                if (eVar2.d) {
                    if (!aVar.f49650a.N) {
                        aVar.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar.b(false);
                                        a0 a0Var = (a0) eVar2;
                                        AndroidUtilities.runOnUIThread(new x1(a0Var, 11), 200L);
                                        a0Var.f48356r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f49012n, eVar3.f49009c, new c(eVar3, 1));
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
                                        a0 a0Var = (a0) eVar2;
                                        AndroidUtilities.runOnUIThread(new x1(a0Var, 11), 200L);
                                        a0Var.f48356r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f49012n, eVar3.f49009c, new c(eVar3, 1));
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
                ((tg.a0) eVar2).f48356r.dismiss();
                return;
            case 27:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f42797c;
                vg.f fVar2 = ((vg.g) this.f42796b).v;
                if (fVar2 != null) {
                    tg.z zVar = ((tg.t) fVar2).f48478a;
                    zVar.f48521c0.remove(chat3);
                    zVar.b0(true, true);
                    return;
                }
                return;
            case 28:
                ((ii.q1) this.f42796b).run((TLRPC.TL_payments_checkedGiftCode) this.f42797c);
                return;
            default:
                ((ii.q1) this.f42796b).run((TLRPC.Chat) this.f42797c);
                return;
        }
    }
}
