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
import rg.w1;
import tg.b0;
import tg.i;
public final class vy0 implements View.OnClickListener {
    public final int f38633a;
    public final Object f38634b;
    public final Object f38635c;

    public vy0(int i10, Object obj, Object obj2) {
        this.f38633a = i10;
        this.f38634b = obj;
        this.f38635c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i10;
        long j3;
        cf.c cVar;
        qg.j2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i11 = 0;
        switch (this.f38633a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f38634b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f38635c;
                long j12 = profileActivity.f31513e1;
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
                o21 o21Var = (o21) this.f38634b;
                Context context = (Context) this.f38635c;
                StringBuilder sb2 = new StringBuilder();
                String obj = o21Var.f36094a[0].getText().toString();
                String obj2 = o21Var.f36094a[3].getText().toString();
                String obj3 = o21Var.f36094a[2].getText().toString();
                String obj4 = o21Var.f36094a[1].getText().toString();
                String obj5 = o21Var.f36094a[4].getText().toString();
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
                        org.telegram.ui.Components.ui0 ui0Var = new org.telegram.ui.Components.ui0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ui0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        o21Var.showDialog(ui0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                v51 v51Var = (v51) this.f38634b;
                Context context2 = (Context) this.f38635c;
                if (v51Var.f32580w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    rv0 rv0Var = new rv0(8, v51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.f23785a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19169j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19133h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context2, null);
                        dd0Var.setTextColor(w02);
                        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        dd0Var.setItemCount(5);
                        org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(context2, null);
                        dd0Var2.setItemCount(5);
                        dd0Var2.setTextColor(w02);
                        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.dd0 dd0Var3 = new org.telegram.ui.Components.dd0(context2, null);
                        dd0Var3.setItemCount(5);
                        dd0Var3.setTextColor(w02);
                        dd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, dd0Var, dd0Var2, dd0Var3, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
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
                        w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(dd0Var, w7.y5.l(0.5f, 0, 270));
                        dd0Var.setMinValue(0);
                        dd0Var.setMaxValue(365);
                        dd0Var.setWrapSelectorWheel(false);
                        dd0Var.setFormatter(new es(11));
                        ai.r5 r5Var = new ai.r5(dd0Var, dd0Var2, dd0Var3, 17);
                        dd0Var.setOnValueChangedListener(r5Var);
                        dd0Var2.setMinValue(0);
                        dd0Var2.setMaxValue(23);
                        linearLayout.addView(dd0Var2, w7.y5.l(0.2f, 0, 270));
                        dd0Var2.setFormatter(new es(12));
                        dd0Var2.setOnValueChangedListener(r5Var);
                        dd0Var3.setMinValue(0);
                        dd0Var3.setMaxValue(59);
                        dd0Var3.setValue(0);
                        dd0Var3.setFormatter(new es(13));
                        linearLayout.addView(dd0Var3, w7.y5.l(0.3f, 0, 270));
                        dd0Var3.setOnValueChangedListener(r5Var);
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
                                dd0Var3.setValue(calendar.get(12));
                                dd0Var2.setValue(calendar.get(11));
                                dd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, dd0Var, dd0Var2, dd0Var3);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                        a3Var = a3Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(dd0Var, dd0Var2, dd0Var3, calendar, rv0Var, a3Var2, 1));
                        a3Var.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18627a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                    }
                    a3Var.f18627a.setOnHideListener(new ei.e0(v51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f18627a;
                    f3Var2.show();
                    v51Var.f32580w = f3Var2;
                    v51Var.c(false);
                    return;
                }
                return;
            case 3:
                t71 t71Var = (t71) this.f38634b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.f38635c;
                if (t71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(t71Var.f37606a0.values()));
                    t71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f38634b;
                ((AlertDialog$Builder) this.f38635c).f18622a.L0.run();
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
                p81 p81Var = sessionsActivity.f31740a;
                if (p81Var != null) {
                    p81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.t7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f38634b;
                editTextBoldCursor.setText(yh.v7.M0(((Long) this.f38635c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                za1 za1Var = ((ea1) this.f38634b).f33246d0;
                za1Var.getOrCreateStoryViewer().C(za1Var.getParentActivity(), ((wa1) this.f38635c).b(), za1Var.f40066z0, ai.u9.a(za1Var.S));
                return;
            case 7:
                ia1 ia1Var = (ia1) this.f38634b;
                kg.f fVar = (kg.f) this.f38635c;
                int i12 = ia1Var.f34482c;
                ja1 ja1Var = ia1Var.d;
                org.telegram.ui.Components.s00 s00Var = ia1Var.f34480a;
                if (s00Var.f28014c) {
                    ArrayList arrayList = ja1Var.f34774n;
                    ig.g gVar = ja1Var.f34772c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((ia1) arrayList.get(i13)).f34480a.f28014c || !((ia1) arrayList.get(i13)).f34480a.f28013b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    ja1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        return;
                    }
                    s00Var.setChecked(true ^ s00Var.f28013b);
                    fVar.f13629n = s00Var.f28013b;
                    ja1Var.f34771b.z();
                    if (ja1Var.f34775r.f35324c > 0 && i12 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i12)).f13629n = s00Var.f28013b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                uy uyVar = (uy) this.f38635c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new rv0(10, (hb1) this.f38634b, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
                    return;
                }
                return;
            case 9:
                ae1 ae1Var = (ae1) this.f38634b;
                Context context3 = (Context) this.f38635c;
                if (ae1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(ae1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.r(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19169j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.y5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i11 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i11);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i11++;
                    }
                    cc1 cc1Var = new cc1(context3, ae1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(cc1Var, w7.y5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    cc1Var.y1(ae1Var.fragmentView.getMeasuredWidth());
                    ae1Var.showDialog(a3Var3.f18627a);
                    return;
                }
                return;
            case 10:
                si1 si1Var = (si1) this.f38634b;
                Context context4 = (Context) this.f38635c;
                tg.m1 m1Var = si1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    si1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, si1Var.f37295a, null, 4, new ai.a1());
                TLRPC.User user = si1Var.f37301c;
                if (user != null) {
                    j3 = user.f18443id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = si1Var.d;
                if (user2 != null) {
                    j11 = user2.f18443id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(2);
                si1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 11:
                ci.d dVar = (ci.d) this.f38634b;
                int[] iArr = (int[]) this.f38635c;
                if (!dVar.N && (cVar = jj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = cVar.l();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6034c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", l4);
                        t0Var.f6177b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46635a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new ij1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f38634b;
                kVar.f38957b = true;
                ((x) this.f38635c).run();
                kVar.f38963w.Y2.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f38634b;
                Context context5 = (Context) this.f38635c;
                if (!xVar.f41294n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f41294n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f41294n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f41294n.f().addView(nVar, w7.y5.c(-1.0f, -1));
                    pg.u uVar = xVar.f41294n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.e5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.qr.f27715f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f41294n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.m2 m2Var = (qg.m2) this.f38634b;
                ci.hd hdVar = (ci.hd) this.f38635c;
                qg.j2[] j2VarArr = m2Var.H;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.I != null && (j10 = m2Var.j(m2Var.f41793n0, m2Var.f41794o0)) != null) {
                    hdVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.un.d0((zn) this.f38635c, 41026, new org.telegram.ui.web.b1((qh.c) this.f38634b, 7), null);
                return;
            case 16:
                rg.j0.V((rg.j0) this.f38634b, (Context) this.f38635c);
                return;
            case 17:
                tg.s0 s0Var = (tg.s0) this.f38634b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f38635c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.f43456a0;
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
                        tg.s.a(chat2.f18296id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(s0Var, 11));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.f38634b;
                ArrayList arrayList5 = (ArrayList) this.f38635c;
                HashSet hashSet2 = m1Var3.f43414h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.f43419n0.remove(l10);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, 5), null);
                m1Var3.i0(true, true);
                m1Var3.X();
                return;
            case 19:
                tg.m1.S((tg.m1) this.f38634b, (TLRPC.User) this.f38635c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f38634b;
                final vg.a aVar = (vg.a) this.f38635c;
                if (eVar2.d) {
                    if (!aVar.f44550a.N) {
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
                                        AndroidUtilities.runOnUIThread(new w1(b0Var, 7), 200L);
                                        b0Var.f43350r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f43980n, eVar3.f43978c, new c(eVar3, 1));
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
                                        AndroidUtilities.runOnUIThread(new w1(b0Var, 7), 200L);
                                        b0Var.f43350r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj8, eVar3.f43980n, eVar3.f43978c, new c(eVar3, 1));
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
                ((tg.b0) eVar2).f43350r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f38635c;
                vg.f fVar2 = ((vg.g) this.f38634b).f44578s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).f43463a;
                    a0Var.f43323c0.remove(chat3);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.web.b1) this.f38634b).run((TLRPC.TL_payments_checkedGiftCode) this.f38635c);
                return;
            case 23:
                ((org.telegram.ui.web.b1) this.f38634b).run((TLRPC.Chat) this.f38635c);
                return;
            case 24:
                xh.c.P((xh.c) this.f38634b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f38635c);
                return;
            case 25:
                xh.i4 i4Var = (xh.i4) this.f38634b;
                i4Var.getClass();
                if (((yh.j7) this.f38635c).f47572f > 0) {
                    i4Var.presentFragment(new yh.v7());
                    return;
                }
                return;
            case 26:
                xh.h4.P((xh.h4) this.f38634b, (xh.g4) this.f38635c);
                return;
            case 27:
                xh.m4 m4Var = (xh.m4) this.f38634b;
                ei.r4 r4Var = (ei.r4) this.f38635c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.f47650l;
                        int size5 = arrayList7.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size5) {
                                Object obj8 = arrayList7.get(i15);
                                i15++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i16 = savedStarGift.msg_id;
                                if (i16 != 0) {
                                    if (i16 == longValue) {
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
                yh.l5 l5Var = ((xh.j4) this.f38634b).f46200c.Y;
                l5Var.e = !l5Var.e;
                ((org.telegram.messenger.kk) this.f38635c).run();
                l5Var.i(true);
                return;
            default:
                yh.g.X((yh.g) this.f38634b, (Context) this.f38635c, view);
                return;
        }
    }
}
