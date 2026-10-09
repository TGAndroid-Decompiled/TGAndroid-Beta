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
public final class vy0 implements View.OnClickListener {
    public final int f43007a;
    public final Object f43008b;
    public final Object f43009c;

    public vy0(int i10, Object obj, Object obj2) {
        this.f43007a = i10;
        this.f43008b = obj;
        this.f43009c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        long j3;
        ci.u5 u5Var;
        qg.l2 j10;
        int i10 = 8;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        long j11 = 0;
        int i11 = 0;
        switch (this.f43007a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f43008b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f43009c;
                long j12 = profileActivity.f34243e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                nq nqVar = new nq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                nqVar.X0 = new mz0(profileActivity, chat, nqVar);
                profileActivity.presentFragment(nqVar);
                return;
            case 1:
                n21 n21Var = (n21) this.f43008b;
                Context context = (Context) this.f43009c;
                StringBuilder sb2 = new StringBuilder();
                String obj = n21Var.f40050a[0].getText().toString();
                String obj2 = n21Var.f40050a[3].getText().toString();
                String obj3 = n21Var.f40050a[2].getText().toString();
                String obj4 = n21Var.f40050a[1].getText().toString();
                String obj5 = n21Var.f40050a[4].getText().toString();
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
                    if (n21Var.v == 2) {
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
                        org.telegram.ui.Components.oj0 oj0Var = new org.telegram.ui.Components.oj0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        oj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        n21Var.showDialog(oj0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                z51 z51Var = (z51) this.f43008b;
                Context context2 = (Context) this.f43009c;
                if (z51Var.f37908w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ls0 ls0Var = new ls0(9, z51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.f26593a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false);
                        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false);
                        int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var.setTextColor(x02);
                        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        ud0Var.setItemCount(5);
                        org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var2.setItemCount(5);
                        ud0Var2.setTextColor(x02);
                        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.ud0 ud0Var3 = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var3.setItemCount(5);
                        ud0Var3.setTextColor(x02);
                        ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, ud0Var, ud0Var2, ud0Var3, 3);
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
                        linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                        ud0Var.setMinValue(0);
                        ud0Var.setMaxValue(365);
                        ud0Var.setWrapSelectorWheel(false);
                        ud0Var.setFormatter(new nr(16));
                        ai.r5 r5Var = new ai.r5(ud0Var, ud0Var2, ud0Var3, 17);
                        ud0Var.setOnValueChangedListener(r5Var);
                        ud0Var2.setMinValue(0);
                        ud0Var2.setMaxValue(23);
                        linearLayout.addView(ud0Var2, w7.x5.l(0.2f, 0, 270));
                        ud0Var2.setFormatter(new nr(17));
                        ud0Var2.setOnValueChangedListener(r5Var);
                        ud0Var3.setMinValue(0);
                        ud0Var3.setMaxValue(59);
                        ud0Var3.setValue(0);
                        ud0Var3.setFormatter(new nr(18));
                        linearLayout.addView(ud0Var3, w7.x5.l(0.3f, 0, 270));
                        ud0Var3.setOnValueChangedListener(r5Var);
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
                                ud0Var3.setValue(calendar.get(12));
                                ud0Var2.setValue(calendar.get(11));
                                ud0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, ud0Var, ud0Var2, ud0Var3);
                        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        q4Var.setGravity(17);
                        q4Var.setTextColor(x04);
                        q4Var.setTextSize(1, 14.0f);
                        q4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x05, x06, x06));
                        q4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        q4Var.setOnClickListener(new org.telegram.ui.Components.m0(ud0Var, ud0Var2, ud0Var3, calendar, ls0Var, a3Var2, 1));
                        a3Var2.b(y3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.f20380a;
                        f3Var.show();
                        f3Var.setBackgroundColor(x03);
                        f3Var.fixNavigationBar(x03);
                        a3Var = a3Var2;
                    }
                    a3Var.f20380a.setOnHideListener(new ei.e0(z51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f20380a;
                    f3Var2.show();
                    z51Var.f37908w = f3Var2;
                    z51Var.c(false);
                    return;
                }
                return;
            case 3:
                x71 x71Var = (x71) this.f43008b;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.f43009c;
                if (x71Var.Z.g() != 0) {
                    wcVar.run(new ArrayList(x71Var.f43841a0.values()));
                    x71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f43008b;
                ((AlertDialog$Builder) this.f43009c).f20374a.L0.run();
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
                u81 u81Var = sessionsActivity.f34473a;
                if (u81Var != null) {
                    u81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.v7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f43008b;
                editTextBoldCursor.setText(yh.p7.N0(((Long) this.f43009c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                bb1 bb1Var = ((ga1) this.f43008b).f37956d0;
                bb1Var.getOrCreateStoryViewer().C(bb1Var.getParentActivity(), ((ya1) this.f43009c).b(), bb1Var.f36237z0, ai.v9.a(bb1Var.S));
                return;
            case 7:
                ka1 ka1Var = (ka1) this.f43008b;
                kg.f fVar = (kg.f) this.f43009c;
                int i12 = ka1Var.f39200c;
                la1 la1Var = ka1Var.d;
                org.telegram.ui.Components.i10 i10Var = ka1Var.f39198a;
                if (i10Var.f27183c) {
                    ArrayList arrayList = la1Var.f39491n;
                    ig.g gVar = la1Var.f39488c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((ka1) arrayList.get(i13)).f39198a.f27183c || !((ka1) arrayList.get(i13)).f39198a.f27182b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    la1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(i10Var);
                        return;
                    }
                    i10Var.setChecked(!i10Var.f27182b);
                    fVar.f14852n = i10Var.f27182b;
                    la1Var.f39487b.z();
                    if (la1Var.f39492r.f40148c > 0 && i12 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i12)).f14852n = i10Var.f27182b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ty tyVar = (ty) this.f43009c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ls0(11, (jb1) this.f43008b, tyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                tyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                    return;
                }
                return;
            case 9:
                ce1 ce1Var = (ce1) this.f43008b;
                Context context3 = (Context) this.f43009c;
                if (ce1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(ce1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.i6.F.size();
                    while (i11 < size2) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) org.telegram.ui.ActionBar.i6.F.get(i11);
                        TLRPC.TL_theme tL_theme = h6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(h6Var);
                        }
                        i11++;
                    }
                    ec1 ec1Var = new ec1(context3, ce1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(ec1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ec1Var.y1(ce1Var.fragmentView.getMeasuredWidth());
                    ce1Var.showDialog(a3Var3.f20380a);
                    return;
                }
                return;
            case 10:
                wi1 wi1Var = (wi1) this.f43008b;
                Context context4 = (Context) this.f43009c;
                tg.m1 m1Var = wi1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    wi1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, wi1Var.f43624a, null, 4, new ai.a1());
                TLRPC.User user = wi1Var.f43630c;
                if (user != null) {
                    j3 = user.f20185id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = wi1Var.d;
                if (user2 != null) {
                    j11 = user2.f20185id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new hh.b(2);
                wi1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f43009c;
                if (!((ci.d) this.f43008b).N) {
                    i2Var.dismiss();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f43009c;
                if (!((org.telegram.ui.Wallet.z1) this.f43008b).f35703m) {
                    h2Var.dismiss();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Wallet.x3 x3Var = (org.telegram.ui.Wallet.x3) this.f43008b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f43009c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    x3Var.dismiss();
                    org.telegram.ui.Wallet.r8 r8Var = new org.telegram.ui.Wallet.r8();
                    r8Var.g0(nftitem);
                    U.presentFragment(r8Var);
                    return;
                }
                return;
            case 14:
                ((Runnable) this.f43008b).run();
                ((org.telegram.ui.Wallet.i2[]) this.f43009c)[0].dismiss();
                return;
            case 15:
                org.telegram.ui.Wallet.z4.Y((org.telegram.ui.Wallet.z4) this.f43008b, (Context) this.f43009c, view);
                return;
            case 16:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f43008b;
                TextView textView4 = (TextView) this.f43009c;
                a2Var.c(!a2Var.b(), true);
                if (a2Var.b()) {
                    i10 = 0;
                }
                textView4.setVisibility(i10);
                return;
            case 17:
                ci.d dVar = (ci.d) this.f43008b;
                int[] iArr = (int[]) this.f43009c;
                if (!dVar.N && (u5Var = nj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = u5Var.h();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f6537c).h;
                        b8.e eVar = new b8.e(t0Var, (String) u5Var.f6067c, "/tg-wear-auth/answer", h);
                        t0Var.f6690b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f51786a).addOnSuccessListener(new a7(u5Var, dVar, iArr, 24)).addOnFailureListener(new mj1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 18:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f43008b;
                kVar.f43365b = true;
                ((y) this.f43009c).run();
                kVar.f43372w.W2.N(true);
                return;
            case 19:
                pg.x xVar = (pg.x) this.f43008b;
                Context context5 = (Context) this.f43009c;
                if (!xVar.f45835n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f45835n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f45835n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f45835n.f().addView(nVar, w7.x5.d(-1.0f, -1));
                    pg.u uVar = xVar.f45835n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.c5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.hs.f27118f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f45835n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 20:
                qg.o2 o2Var = (qg.o2) this.f43008b;
                ci.ed edVar = (ci.ed) this.f43009c;
                qg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j10 = o2Var.j(o2Var.f46489n0, o2Var.f46490o0)) != null) {
                    edVar.run(j10);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.lo.g0((zn) this.f43009c, 41026, new ii.q1((qh.c) this.f43008b, 10), null);
                return;
            case 22:
                rg.j0.W((rg.j0) this.f43008b, (Context) this.f43009c);
                return;
            case 23:
                tg.s0 s0Var = (tg.s0) this.f43008b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f43009c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f48405a0;
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
                        tg.s.a(chat2.f20038id, arrayList4, new ai.f4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, 14));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                tg.m1 m1Var3 = (tg.m1) this.f43008b;
                ArrayList arrayList5 = (ArrayList) this.f43009c;
                HashSet hashSet2 = m1Var3.f48360h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.f48365n0.remove(l4);
                }
                m1Var3.X();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.j0(true, true);
                m1Var3.Y();
                return;
            case 25:
                tg.m1.T((tg.m1) this.f43008b, (TLRPC.User) this.f43009c, view);
                return;
            case 26:
                final ug.e eVar2 = (ug.e) this.f43008b;
                final vg.a aVar = (vg.a) this.f43009c;
                if (eVar2.d) {
                    if (!aVar.f49561a.N) {
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
                                        b0Var.f48294r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f48923n, eVar3.f48920c, new c(eVar3, 1));
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
                                        b0Var.f48294r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f48923n, eVar3.f48920c, new c(eVar3, 1));
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
                ((tg.b0) eVar2).f48294r.dismiss();
                return;
            case 27:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f43009c;
                vg.f fVar2 = ((vg.g) this.f43008b).v;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).f48412a;
                    a0Var.f48266c0.remove(chat3);
                    a0Var.b0(true, true);
                    return;
                }
                return;
            case 28:
                ((ii.q1) this.f43008b).run((TLRPC.TL_payments_checkedGiftCode) this.f43009c);
                return;
            default:
                ((ii.q1) this.f43008b).run((TLRPC.Chat) this.f43009c);
                return;
        }
    }
}
