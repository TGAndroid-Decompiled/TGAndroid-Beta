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
import tg.c0;
import tg.k;
public final class xy0 implements View.OnClickListener {
    public final int f39724a;
    public final Object f39725b;
    public final Object f39726c;

    public xy0(int i10, Object obj, Object obj2) {
        this.f39724a = i10;
        this.f39725b = obj;
        this.f39726c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        x51 x51Var;
        org.telegram.ui.Components.u3 u3Var;
        int i10;
        long j3;
        cf.c cVar;
        qg.m2 j10;
        TL_stars.SavedStarGift savedStarGift;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.b3 b3Var = null;
        long j11 = 0;
        int i11 = 0;
        switch (this.f39724a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f39725b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f39726c;
                long j12 = profileActivity.f31282e1;
                long j13 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                pq pqVar = new pq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                pqVar.X0 = new pz0(profileActivity, chat, pqVar);
                profileActivity.presentFragment(pqVar);
                return;
            case 1:
                q21 q21Var = (q21) this.f39725b;
                Context context = (Context) this.f39726c;
                StringBuilder sb2 = new StringBuilder();
                String obj = q21Var.f36781a[0].getText().toString();
                String obj2 = q21Var.f36781a[3].getText().toString();
                String obj3 = q21Var.f36781a[2].getText().toString();
                String obj4 = q21Var.f36781a[1].getText().toString();
                String obj5 = q21Var.f36781a[4].getText().toString();
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
                        StringBuilder u10 = a4.a.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ki0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        q21Var.showDialog(ki0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                x51 x51Var2 = (x51) this.f39725b;
                Context context2 = (Context) this.f39726c;
                if (x51Var2.f33318w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    tv0 tv0Var = new tv0(7, x51Var2, zArr);
                    Pattern pattern = org.telegram.ui.Components.c5.f22931a;
                    if (context2 == null) {
                        x51Var = x51Var2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18969j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18933h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.b3 b3Var2 = new org.telegram.ui.ActionBar.b3(context2, null);
                        b3Var2.a();
                        org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context2, null);
                        uc0Var.setTextColor(w02);
                        uc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        uc0Var.setItemCount(5);
                        org.telegram.ui.Components.uc0 uc0Var2 = new org.telegram.ui.Components.uc0(context2, null);
                        uc0Var2.setItemCount(5);
                        uc0Var2.setTextColor(w02);
                        uc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.uc0 uc0Var3 = new org.telegram.ui.Components.uc0(context2, null);
                        uc0Var3.setItemCount(5);
                        uc0Var3.setTextColor(w02);
                        uc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.u3 u3Var2 = new org.telegram.ui.Components.u3(context2, uc0Var, uc0Var2, uc0Var3, 3);
                        u3Var2.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        u3Var2.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        u3Var2.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(uc0Var, w7.x5.l(0.5f, 0, 270));
                        uc0Var.setMinValue(0);
                        uc0Var.setMaxValue(365);
                        uc0Var.setWrapSelectorWheel(false);
                        uc0Var.setFormatter(new gs(9));
                        ai.r5 r5Var = new ai.r5(uc0Var, uc0Var2, uc0Var3, 17);
                        uc0Var.setOnValueChangedListener(r5Var);
                        uc0Var2.setMinValue(0);
                        uc0Var2.setMaxValue(23);
                        linearLayout.addView(uc0Var2, w7.x5.l(0.2f, 0, 270));
                        uc0Var2.setFormatter(new gs(10));
                        uc0Var2.setOnValueChangedListener(r5Var);
                        uc0Var3.setMinValue(0);
                        uc0Var3.setMaxValue(59);
                        uc0Var3.setValue(0);
                        uc0Var3.setFormatter(new gs(11));
                        linearLayout.addView(uc0Var3, w7.x5.l(0.3f, 0, 270));
                        uc0Var3.setOnValueChangedListener(r5Var);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j14 = currentTimeMillis * 1000;
                            x51Var = x51Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            u3Var = u3Var2;
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                uc0Var3.setValue(calendar.get(12));
                                uc0Var2.setValue(calendar.get(11));
                                uc0Var.setValue(timeInMillis);
                            }
                        } else {
                            x51Var = x51Var2;
                            u3Var = u3Var2;
                        }
                        org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, uc0Var, uc0Var2, uc0Var3);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        org.telegram.ui.Components.u3 u3Var3 = u3Var;
                        u3Var3.addView(p4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(uc0Var, uc0Var2, uc0Var3, calendar, tv0Var, b3Var2, 1));
                        b3Var2.b(u3Var3);
                        org.telegram.ui.ActionBar.g3 g3Var = b3Var2.f18470a;
                        g3Var.show();
                        g3Var.setBackgroundColor(w03);
                        g3Var.fixNavigationBar(w03);
                        b3Var = b3Var2;
                    }
                    b3Var.f18470a.setOnHideListener(new ei.e0(x51Var, zArr, 11));
                    org.telegram.ui.ActionBar.g3 g3Var2 = b3Var.f18470a;
                    g3Var2.show();
                    x51Var.f33318w = g3Var2;
                    x51Var.c(false);
                    return;
                }
                return;
            case 3:
                v71 v71Var = (v71) this.f39725b;
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.f39726c;
                if (v71Var.Z.g() != 0) {
                    rcVar.run(new ArrayList(v71Var.f38320a0.values()));
                    v71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f39725b;
                ((AlertDialog$Builder) this.f39726c).f18446a.L0.run();
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
                r81 r81Var = sessionsActivity.f31509a;
                if (r81Var != null) {
                    r81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.t7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f39725b;
                editTextBoldCursor.setText(yh.y7.M0(((Long) this.f39726c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                ab1 ab1Var = ((fa1) this.f39725b).f33603d0;
                ab1Var.getOrCreateStoryViewer().C(ab1Var.getParentActivity(), ((xa1) this.f39726c).b(), ab1Var.f31816z0, ai.u9.a(ab1Var.S));
                return;
            case 7:
                ja1 ja1Var = (ja1) this.f39725b;
                kg.f fVar = (kg.f) this.f39726c;
                int i12 = ja1Var.f34831c;
                ka1 ka1Var = ja1Var.d;
                org.telegram.ui.Components.s00 s00Var = ja1Var.f34829a;
                if (s00Var.f27731c) {
                    ArrayList arrayList = ka1Var.f35177n;
                    ig.g gVar = ka1Var.f35175c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((ja1) arrayList.get(i13)).f34829a.f27731c || !((ja1) arrayList.get(i13)).f34829a.f27730b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    ka1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        return;
                    }
                    s00Var.setChecked(!s00Var.f27730b);
                    fVar.f13631n = s00Var.f27730b;
                    ka1Var.f35174b.z();
                    if (ka1Var.f35178r.f35743c > 0 && i12 < gVar.d.size()) {
                        ((kg.f) gVar.d.get(i12)).f13631n = s00Var.f27730b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                wy wyVar = (wy) this.f39726c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
                alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new tv0(9, (ib1) this.f39725b, wyVar));
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                wyVar.showDialog(c2Var);
                TextView textView2 = (TextView) c2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                    return;
                }
                return;
            case 9:
                ce1 ce1Var = (ce1) this.f39725b;
                Context context3 = (Context) this.f39726c;
                if (ce1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b3 b3Var3 = new org.telegram.ui.ActionBar.b3(ce1Var.getParentActivity(), null);
                    b3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.w1.q(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18969j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    b3Var3.b(linearLayout2);
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
                    ec1 ec1Var = new ec1(context3, ce1Var, arrayList2, new ArrayList(), b3Var3);
                    linearLayout2.addView(ec1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ec1Var.y1(ce1Var.fragmentView.getMeasuredWidth());
                    ce1Var.showDialog(b3Var3.f18470a);
                    return;
                }
                return;
            case 10:
                ti1 ti1Var = (ti1) this.f39725b;
                Context context4 = (Context) this.f39726c;
                tg.n1 n1Var = ti1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    ti1Var.M = null;
                }
                tg.n1 n1Var2 = new tg.n1(context4, ti1Var.f37756a, null, 4, new ai.a1());
                TLRPC.User user = ti1Var.f37762c;
                if (user != null) {
                    j3 = user.f18268id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = ti1Var.d;
                if (user2 != null) {
                    j11 = user2.f18268id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new hh.b(2);
                ti1Var.M = n1Var2;
                n1Var2.show();
                return;
            case 11:
                ci.d dVar = (ci.d) this.f39725b;
                int[] iArr = (int[]) this.f39726c;
                if (!dVar.N && (cVar = kj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] m10 = cVar.m();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6034c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", m10);
                        t0Var.f6177b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46403a).addOnSuccessListener(new c7(cVar, dVar, iArr, 24)).addOnFailureListener(new jj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f39725b;
                kVar.f38844b = true;
                ((x) this.f39726c).run();
                kVar.f38850w.Y2.N(true);
                return;
            case 13:
                pg.x xVar = (pg.x) this.f39725b;
                Context context5 = (Context) this.f39726c;
                if (!xVar.f41061n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f41061n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f41061n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.f41061n.f().addView(nVar, w7.x5.c(-1.0f, -1));
                    pg.u uVar = xVar.f41061n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.e5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.qr.f27380f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, 11));
                    duration.start();
                    xVar.f41061n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                qg.p2 p2Var = (qg.p2) this.f39725b;
                ci.hd hdVar = (ci.hd) this.f39726c;
                qg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j10 = p2Var.j(p2Var.f41593n0, p2Var.f41594o0)) != null) {
                    hdVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.un.d0((bo) this.f39726c, 41026, new org.telegram.ui.web.b1((qh.c) this.f39725b, 7), null);
                return;
            case 16:
                rg.j0.V((rg.j0) this.f39725b, (Context) this.f39726c);
                return;
            case 17:
                tg.t0 t0Var2 = (tg.t0) this.f39725b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f39726c;
                ArrayList arrayList3 = t0Var2.X;
                if (!arrayList3.isEmpty()) {
                    tg.e0 e0Var = t0Var2.f43245a0;
                    if (!e0Var.N) {
                        e0Var.setLoading(true);
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
                        tg.t.a(chat2.f18121id, arrayList4, new ai.e4(t0Var2, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(t0Var2, 11));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                tg.n1 n1Var3 = (tg.n1) this.f39725b;
                ArrayList arrayList5 = (ArrayList) this.f39726c;
                HashSet hashSet2 = n1Var3.f43204h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj7 = arrayList5.get(i11);
                    i11++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var3.f43209n0.remove(l4);
                }
                n1Var3.W();
                n1Var3.Z.b(true, hashSet2, new tg.b1(n1Var3, 5), null);
                n1Var3.i0(true, true);
                n1Var3.X();
                return;
            case 19:
                tg.n1.S((tg.n1) this.f39725b, (TLRPC.User) this.f39726c, view);
                return;
            case 20:
                final ug.e eVar2 = (ug.e) this.f39725b;
                final vg.a aVar = (vg.a) this.f39726c;
                if (eVar2.d) {
                    if (!aVar.f44320a.N) {
                        aVar.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar.b(false);
                                        c0 c0Var = (c0) eVar2;
                                        AndroidUtilities.runOnUIThread(new w1(c0Var, 7), 200L);
                                        c0Var.f43139r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        k.c((TLRPC.TL_error) obj8, eVar3.f43745n, eVar3.f43743c, new c(eVar3, 1));
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
                                        c0 c0Var = (c0) eVar2;
                                        AndroidUtilities.runOnUIThread(new w1(c0Var, 7), 200L);
                                        c0Var.f43139r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        k.c((TLRPC.TL_error) obj8, eVar3.f43745n, eVar3.f43743c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.q(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((tg.c0) eVar2).f43139r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f39726c;
                vg.f fVar2 = ((vg.g) this.f39725b).f44348s;
                if (fVar2 != null) {
                    tg.b0 b0Var = ((tg.v) fVar2).f43252a;
                    b0Var.f43112c0.remove(chat3);
                    b0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.web.b1) this.f39725b).run((TLRPC.TL_payments_checkedGiftCode) this.f39726c);
                return;
            case 23:
                ((org.telegram.ui.web.b1) this.f39725b).run((TLRPC.Chat) this.f39726c);
                return;
            case 24:
                xh.c.P((xh.c) this.f39725b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f39726c);
                return;
            case 25:
                xh.h4 h4Var = (xh.h4) this.f39725b;
                h4Var.getClass();
                if (((yh.m7) this.f39726c).f47494f > 0) {
                    h4Var.presentFragment(new yh.y7());
                    return;
                }
                return;
            case 26:
                xh.g4.P((xh.g4) this.f39725b, (xh.f4) this.f39726c);
                return;
            case 27:
                xh.l4 l4Var = (xh.l4) this.f39725b;
                ei.r4 r4Var = (ei.r4) this.f39726c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = l4Var.Y.f47521l;
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
                    l4Var.dismiss();
                    return;
                }
                return;
            case 28:
                yh.n5 n5Var = ((xh.i4) this.f39725b).f45952c.Y;
                n5Var.e = !n5Var.e;
                ((org.telegram.messenger.kk) this.f39726c).run();
                n5Var.i(true);
                return;
            default:
                yh.g.X((yh.g) this.f39725b, (Context) this.f39726c, view);
                return;
        }
    }
}
