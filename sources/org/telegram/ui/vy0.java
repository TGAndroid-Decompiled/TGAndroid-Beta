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
import java.util.Iterator;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rg.q1;
import tg.b0;
import tg.i;
public final class vy0 implements View.OnClickListener {
    public final int f38634a;
    public final Object f38635b;
    public final Object f38636c;

    public vy0(int i10, Object obj, Object obj2) {
        this.f38634a = i10;
        this.f38635b = obj;
        this.f38636c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i10;
        int i11;
        long j3;
        cf.c cVar;
        qg.k2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i12 = 0;
        switch (this.f38634a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f38635b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f38636c;
                long j12 = profileActivity.f31574e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                nq nqVar = new nq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                nqVar.X0 = new nz0(profileActivity, chat, nqVar);
                profileActivity.presentFragment(nqVar);
                return;
            case 1:
                o21 o21Var = (o21) this.f38635b;
                Context context = (Context) this.f38636c;
                StringBuilder sb2 = new StringBuilder();
                String obj = o21Var.f36189a[0].getText().toString();
                String obj2 = o21Var.f36189a[3].getText().toString();
                String obj3 = o21Var.f36189a[2].getText().toString();
                String obj4 = o21Var.f36189a[1].getText().toString();
                String obj5 = o21Var.f36189a[4].getText().toString();
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
                    if (o21Var.v == 2) {
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
                        StringBuilder u10 = a4.a.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        wi0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        o21Var.showDialog(wi0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                y51 y51Var = (y51) this.f38635b;
                Context context2 = (Context) this.f38636c;
                if (y51Var.f33553w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    rv0 rv0Var = new rv0(8, y51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.d5.f23562a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19216j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19199i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(context2, null);
                        fd0Var.setTextColor(w02);
                        fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        fd0Var.setItemCount(5);
                        org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(context2, null);
                        fd0Var2.setItemCount(5);
                        fd0Var2.setTextColor(w02);
                        fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.fd0 fd0Var3 = new org.telegram.ui.Components.fd0(context2, null);
                        fd0Var3.setItemCount(5);
                        fd0Var3.setTextColor(w02);
                        fd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context2, fd0Var, fd0Var2, fd0Var3, 3);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        v3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                        fd0Var.setMinValue(0);
                        fd0Var.setMaxValue(365);
                        fd0Var.setWrapSelectorWheel(false);
                        fd0Var.setFormatter(new es(13));
                        ai.r5 r5Var = new ai.r5(fd0Var, fd0Var2, fd0Var3, 17);
                        fd0Var.setOnValueChangedListener(r5Var);
                        fd0Var2.setMinValue(0);
                        fd0Var2.setMaxValue(23);
                        linearLayout.addView(fd0Var2, w7.y5.l(0.2f, 0, 270));
                        fd0Var2.setFormatter(new es(14));
                        fd0Var2.setOnValueChangedListener(r5Var);
                        fd0Var3.setMinValue(0);
                        fd0Var3.setMaxValue(59);
                        fd0Var3.setValue(0);
                        fd0Var3.setFormatter(new es(15));
                        linearLayout.addView(fd0Var3, w7.y5.l(0.3f, 0, 270));
                        fd0Var3.setOnValueChangedListener(r5Var);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j14 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            i10 = w04;
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                fd0Var3.setValue(calendar.get(12));
                                fd0Var2.setValue(calendar.get(11));
                                fd0Var.setValue(timeInMillis);
                            }
                        } else {
                            i10 = w04;
                        }
                        org.telegram.ui.Components.d5.g(null, null, 0L, 0L, 0, fd0Var, fd0Var2, fd0Var3);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(i10);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                        a3Var = a3Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(fd0Var, fd0Var2, fd0Var3, calendar, rv0Var, a3Var2, 1));
                        a3Var.b(v3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18674a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                    }
                    a3Var.f18674a.setOnHideListener(new ei.e0(y51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f18674a;
                    f3Var2.show();
                    y51Var.f33553w = f3Var2;
                    y51Var.c(false);
                    return;
                }
                return;
            case 3:
                w71 w71Var = (w71) this.f38635b;
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f38636c;
                if (w71Var.Z.g() != 0) {
                    scVar.run(new ArrayList(w71Var.f38711a0.values()));
                    w71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f38635b;
                ((AlertDialog$Builder) this.f38636c).f18669a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i11 = 7;
                } else if (num.intValue() == 1) {
                    i11 = 90;
                } else if (num.intValue() == 2) {
                    i11 = 183;
                } else if (num.intValue() == 3) {
                    i11 = 365;
                } else {
                    i11 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i11;
                sessionsActivity.v = i11;
                t81 t81Var = sessionsActivity.f31801a;
                if (t81Var != null) {
                    t81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.t7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f38635b;
                editTextBoldCursor.setText(yh.w7.M0(((Long) this.f38636c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                bb1 bb1Var = ((ga1) this.f38635b).f33875d0;
                bb1Var.getOrCreateStoryViewer().C(bb1Var.getParentActivity(), ((ya1) this.f38636c).b(), bb1Var.f32365z0, ai.u9.a(bb1Var.S));
                return;
            case 7:
                ka1 ka1Var = (ka1) this.f38635b;
                kg.f fVar = (kg.f) this.f38636c;
                int i13 = ka1Var.f35099c;
                la1 la1Var = ka1Var.d;
                org.telegram.ui.Components.s00 s00Var = ka1Var.f35097a;
                if (s00Var.f28084c) {
                    ArrayList arrayList = la1Var.f35411n;
                    ig.g gVar = la1Var.f35409c;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            if (i14 == i13 || !((ka1) arrayList.get(i14)).f35097a.f28084c || !((ka1) arrayList.get(i14)).f35097a.f28083b) {
                                i14++;
                            }
                        } else {
                            i12 = 1;
                        }
                    }
                    la1Var.f();
                    if (i12 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        return;
                    }
                    s00Var.setChecked(true ^ s00Var.f28083b);
                    fVar.f13628n = s00Var.f28083b;
                    la1Var.f35408b.z();
                    if (la1Var.f35412r.f35971c > 0 && i13 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i13)).f13628n = s00Var.f28083b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                uy uyVar = (uy) this.f38636c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new rv0(10, (jb1) this.f38635b, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
                    return;
                }
                return;
            case 9:
                ce1 ce1Var = (ce1) this.f38635b;
                Context context3 = (Context) this.f38636c;
                if (ce1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(ce1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.l0.p(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19216j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.y5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i12 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i12);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i12++;
                    }
                    ec1 ec1Var = new ec1(context3, ce1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(ec1Var, w7.y5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ec1Var.y1(ce1Var.fragmentView.getMeasuredWidth());
                    ce1Var.showDialog(a3Var3.f18674a);
                    return;
                }
                return;
            case 10:
                ti1 ti1Var = (ti1) this.f38635b;
                Context context4 = (Context) this.f38636c;
                tg.m1 m1Var = ti1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    ti1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, ti1Var.f37792a, null, 4, new ai.a1());
                TLRPC.User user = ti1Var.f37798c;
                if (user != null) {
                    j3 = user.f18490id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = ti1Var.d;
                if (user2 != null) {
                    j11 = user2.f18490id;
                }
                long[] jArr = {j3, j11};
                for (int i15 = 0; i15 < 2; i15++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i15]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(2);
                ti1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                ci.d dVar = (ci.d) this.f38635b;
                int[] iArr = (int[]) this.f38636c;
                if (!dVar.N && (cVar = kj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] p5 = cVar.p();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6033c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", p5);
                        t0Var.f6176b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46703a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new jj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f38635b;
                kVar.f38978b = true;
                ((x) this.f38636c).run();
                kVar.f38984w.Y2.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f38635b;
                Context context5 = (Context) this.f38636c;
                if (!xVar.f41357n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f41357n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f41357n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f41357n.f().addView(nVar, w7.y5.c(-1.0f, -1));
                    pg.u uVar = xVar.f41357n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.e5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.qr.f27653f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f41357n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.n2 n2Var = (qg.n2) this.f38635b;
                ci.hd hdVar = (ci.hd) this.f38636c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.f41861n0, n2Var.f41862o0)) != null) {
                    hdVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.un.d0((zn) this.f38636c, 41026, new org.telegram.ui.web.b1((qh.c) this.f38635b, 7), null);
                return;
            case 16:
                rg.j0.V((rg.j0) this.f38635b, (Context) this.f38636c);
                return;
            case 17:
                tg.s0 s0Var = (tg.s0) this.f38635b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f38636c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f43521a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i12 < size3) {
                            Object obj6 = arrayList3.get(i12);
                            i12++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.s.a(chat2.f18343id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(s0Var, 11));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.f38635b;
                ArrayList arrayList5 = (ArrayList) this.f38636c;
                HashSet hashSet2 = m1Var3.f43479h0;
                int size4 = arrayList5.size();
                while (i12 < size4) {
                    Object obj7 = arrayList5.get(i12);
                    i12++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.f43484n0.remove(l4);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.i0(true, true);
                m1Var3.X();
                return;
            case 19:
                tg.m1.S((tg.m1) this.f38635b, (TLRPC.User) this.f38636c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f38635b;
                final vg.a aVar = (vg.a) this.f38636c;
                if (eVar2.d) {
                    if (!aVar.f44616a.N) {
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
                                        AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
                                        b0Var.f43415r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f44045n, eVar3.f44043c, new c(eVar3, 1));
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
                                        AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
                                        b0Var.f43415r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f44045n, eVar3.f44043c, new c(eVar3, 1));
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
                ((tg.b0) eVar2).f43415r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f38636c;
                vg.f fVar2 = ((vg.g) this.f38635b).f44644s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).f43528a;
                    a0Var.f43388c0.remove(chat3);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.web.b1) this.f38635b).run((TLRPC.TL_payments_checkedGiftCode) this.f38636c);
                return;
            case 23:
                ((org.telegram.ui.web.b1) this.f38635b).run((TLRPC.Chat) this.f38636c);
                return;
            case 24:
                xh.c.P((xh.c) this.f38635b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f38636c);
                return;
            case 25:
                xh.i4 i4Var = (xh.i4) this.f38635b;
                i4Var.getClass();
                if (((yh.k7) this.f38636c).f47681f > 0) {
                    i4Var.presentFragment(new yh.w7());
                    return;
                }
                return;
            case 26:
                xh.h4.P((xh.h4) this.f38635b, (xh.g4) this.f38636c);
                return;
            case 27:
                xh.m4 m4Var = (xh.m4) this.f38635b;
                ei.r4 r4Var = (ei.r4) this.f38636c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.f47711l;
                        int size5 = arrayList7.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size5) {
                                Object obj8 = arrayList7.get(i16);
                                i16++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i17 = savedStarGift.msg_id;
                                if (i17 != 0) {
                                    if (i17 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList6.add(savedStarGift);
                        }
                    }
                    r4Var.run(arrayList6);
                    m4Var.dismiss();
                    return;
                }
                return;
            case 28:
                yh.l5 l5Var = ((xh.j4) this.f38635b).f46268c.Y;
                l5Var.e = !l5Var.e;
                ((org.telegram.messenger.jk) this.f38636c).run();
                l5Var.i(true);
                return;
            default:
                yh.g.X((yh.g) this.f38635b, (Context) this.f38636c, view);
                return;
        }
    }
}
