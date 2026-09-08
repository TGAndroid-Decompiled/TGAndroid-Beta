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
import sg.p0;
import ug.c0;
import ug.j;
public final class wy0 implements View.OnClickListener {
    public final int f42541a;
    public final Object f42542b;
    public final Object f42543c;

    public wy0(int i10, Object obj, Object obj2) {
        this.f42541a = i10;
        this.f42542b = obj;
        this.f42543c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        org.telegram.ui.Components.vc0 vc0Var;
        long j3;
        cf.c cVar;
        rg.l2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i10 = 0;
        switch (this.f42541a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f42542b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f42543c;
                long j12 = profileActivity.f33915e1;
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
                q21 q21Var = (q21) this.f42542b;
                Context context = (Context) this.f42543c;
                StringBuilder sb2 = new StringBuilder();
                String obj = q21Var.f39708a[0].getText().toString();
                String obj2 = q21Var.f39708a[3].getText().toString();
                String obj3 = q21Var.f39708a[2].getText().toString();
                String obj4 = q21Var.f39708a[1].getText().toString();
                String obj5 = q21Var.f39708a[4].getText().toString();
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
                        org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ji0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        q21Var.showDialog(ji0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                y51 y51Var = (y51) this.f42542b;
                Context context2 = (Context) this.f42543c;
                if (y51Var.f36344w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    qv0 qv0Var = new qv0(8, y51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.f25584a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20761h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20780i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(context2, null);
                        vc0Var2.setTextColor(w02);
                        vc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
                        vc0Var2.setItemCount(5);
                        org.telegram.ui.Components.vc0 vc0Var3 = new org.telegram.ui.Components.vc0(context2, null);
                        vc0Var3.setItemCount(5);
                        vc0Var3.setTextColor(w02);
                        vc0Var3.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.vc0 vc0Var4 = new org.telegram.ui.Components.vc0(context2, null);
                        vc0Var4.setItemCount(5);
                        vc0Var4.setTextColor(w02);
                        vc0Var4.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, vc0Var2, vc0Var3, vc0Var4, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new ci.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.c4 c4Var = new bi.c4(context2, 17);
                        linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                        vc0Var2.setMinValue(0);
                        vc0Var2.setMaxValue(365);
                        vc0Var2.setWrapSelectorWheel(false);
                        vc0Var2.setFormatter(new org.telegram.ui.Components.f(6));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(vc0Var2, vc0Var3, vc0Var4, 17);
                        vc0Var2.setOnValueChangedListener(aVar);
                        vc0Var3.setMinValue(0);
                        vc0Var3.setMaxValue(23);
                        linearLayout.addView(vc0Var3, w7.x5.l(0.2f, 0, 270));
                        vc0Var3.setFormatter(new org.telegram.ui.Components.f(7));
                        vc0Var3.setOnValueChangedListener(aVar);
                        vc0Var4.setMinValue(0);
                        vc0Var4.setMaxValue(59);
                        vc0Var4.setValue(0);
                        vc0Var4.setFormatter(new org.telegram.ui.Components.f(8));
                        linearLayout.addView(vc0Var4, w7.x5.l(0.3f, 0, 270));
                        vc0Var4.setOnValueChangedListener(aVar);
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
                                vc0Var4.setValue(calendar.get(12));
                                vc0Var3.setValue(calendar.get(11));
                                vc0Var = vc0Var2;
                                vc0Var.setValue(timeInMillis);
                            } else {
                                vc0Var = vc0Var2;
                            }
                        } else {
                            vc0Var = vc0Var2;
                        }
                        org.telegram.ui.Components.vc0 vc0Var5 = vc0Var;
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, vc0Var5, vc0Var3, vc0Var4);
                        c4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        c4Var.setGravity(17);
                        c4Var.setTextColor(w04);
                        c4Var.setTextSize(1, 14.0f);
                        c4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        c4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        c4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(c4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        c4Var.setOnClickListener(new org.telegram.ui.Components.n0(vc0Var5, vc0Var3, vc0Var4, calendar, qv0Var, a3Var2, 1));
                        a3Var2.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.f20231a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var2;
                    }
                    a3Var.f20231a.setOnHideListener(new fi.e0(y51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f20231a;
                    f3Var2.show();
                    y51Var.f36344w = f3Var2;
                    y51Var.c(false);
                    return;
                }
                return;
            case 3:
                w71 w71Var = (w71) this.f42542b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.f42543c;
                if (w71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(w71Var.f41816a0.values()));
                    w71Var.dismiss();
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f42542b;
                ((AlertDialog$Builder) this.f42543c).f20225a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i10 = 7;
                } else if (num.intValue() == 1) {
                    i10 = 90;
                } else if (num.intValue() == 2) {
                    i10 = 183;
                } else if (num.intValue() == 3) {
                    i10 = 365;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i10;
                sessionsActivity.v = i10;
                t81 t81Var = sessionsActivity.f34145a;
                if (t81Var != null) {
                    t81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new bi.c7(8));
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f42542b;
                editTextBoldCursor.setText(zh.v7.M0(((Long) this.f42543c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 6:
                bb1 bb1Var = ((ga1) this.f42542b).f36639d0;
                bb1Var.getOrCreateStoryViewer().C(bb1Var.getParentActivity(), ((ya1) this.f42543c).b(), bb1Var.f34752z0, bi.d9.a(bb1Var.S));
                return;
            case 7:
                ka1 ka1Var = (ka1) this.f42542b;
                lg.f fVar = (lg.f) this.f42543c;
                int i11 = ka1Var.f38018c;
                la1 la1Var = ka1Var.d;
                org.telegram.ui.Components.s00 s00Var = ka1Var.f38016a;
                if (s00Var.f30166c) {
                    ArrayList arrayList = la1Var.f38283n;
                    jg.g gVar = la1Var.f38280c;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            if (i12 == i11 || !((ka1) arrayList.get(i12)).f38016a.f30166c || !((ka1) arrayList.get(i12)).f38016a.f30165b) {
                                i12++;
                            }
                        } else {
                            i10 = 1;
                        }
                    }
                    la1Var.f();
                    if (i10 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        return;
                    }
                    s00Var.setChecked(!s00Var.f30165b);
                    fVar.f15475n = s00Var.f30165b;
                    la1Var.f38279b.z();
                    if (la1Var.f38284r.f38923c > 0 && i11 < gVar.d.size()) {
                        ((lg.f) gVar.d.get(i11)).f15475n = s00Var.f30165b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                uy uyVar = (uy) this.f42543c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new qv0(10, (jb1) this.f42542b, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                    return;
                }
                return;
            case 9:
                be1 be1Var = (be1) this.f42542b;
                Context context3 = (Context) this.f42543c;
                if (be1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(be1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.w1.q(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new ci.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i10 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i10);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i10++;
                    }
                    dc1 dc1Var = new dc1(context3, be1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(dc1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    dc1Var.w1(be1Var.fragmentView.getMeasuredWidth());
                    be1Var.showDialog(a3Var3.f20231a);
                    return;
                }
                return;
            case 10:
                ui1 ui1Var = (ui1) this.f42542b;
                Context context4 = (Context) this.f42543c;
                ug.n1 n1Var = ui1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    ui1Var.M = null;
                }
                ug.n1 n1Var2 = new ug.n1(context4, ui1Var.f41134a, null, 4, new bi.s0());
                TLRPC.User user = ui1Var.f41140c;
                if (user != null) {
                    j3 = user.f20043id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = ui1Var.d;
                if (user2 != null) {
                    j11 = user2.f20043id;
                }
                long[] jArr = {j3, j11};
                for (int i13 = 0; i13 < 2; i13++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i13]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new ih.b(2);
                ui1Var.M = n1Var2;
                n1Var2.show();
                return;
            case 11:
                di.d dVar = (di.d) this.f42542b;
                int[] iArr = (int[]) this.f42543c;
                if (!dVar.N && (cVar = lj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j15 = cVar.j();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f4985c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/answer", j15);
                        t0Var.f5138b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f49639a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new kj1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f42542b;
                lVar.f42186b = true;
                ((x) this.f42543c).run();
                lVar.f42193w.Y2.N(true);
                return;
            case 13:
                qg.x xVar = (qg.x) this.f42542b;
                Context context5 = (Context) this.f42543c;
                if (!xVar.f44648n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f44648n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f44648n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(xVar, context5, createBitmap);
                    xVar.f44648n.f().addView(nVar, w7.x5.c(-1.0f, -1));
                    qg.u uVar = xVar.f44648n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new di.e5(uVar, 4));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.pr.f29493f);
                    duration.addUpdateListener(new ki.a(nVar, 13));
                    duration.start();
                    xVar.f44648n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 14:
                rg.o2 o2Var = (rg.o2) this.f42542b;
                di.hd hdVar = (di.hd) this.f42543c;
                rg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j10 = o2Var.j(o2Var.f45423n0, o2Var.f45424o0)) != null) {
                    hdVar.run(j10);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.tn.d0((co) this.f42543c, 41026, new org.telegram.ui.web.b1((rh.c) this.f42542b, 7), null);
                return;
            case 16:
                sg.k0.V((sg.k0) this.f42542b, (Context) this.f42543c);
                return;
            case 17:
                ug.t0 t0Var2 = (ug.t0) this.f42542b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f42543c;
                ArrayList arrayList3 = t0Var2.X;
                if (!arrayList3.isEmpty()) {
                    ug.e0 e0Var = t0Var2.f47237a0;
                    if (!e0Var.N) {
                        e0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            Object obj6 = arrayList3.get(i10);
                            i10++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        ug.t.a(chat2.f19896id, arrayList4, new bi.r3(t0Var2, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(t0Var2, 11));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ug.n1 n1Var3 = (ug.n1) this.f42542b;
                ArrayList arrayList5 = (ArrayList) this.f42543c;
                HashSet hashSet2 = n1Var3.f47192h0;
                int size4 = arrayList5.size();
                while (i10 < size4) {
                    Object obj7 = arrayList5.get(i10);
                    i10++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var3.f47197n0.remove(l4);
                }
                n1Var3.W();
                n1Var3.Z.b(true, hashSet2, new ug.b1(n1Var3, 5), null);
                n1Var3.i0(true, true);
                n1Var3.X();
                return;
            case 19:
                ug.n1.S((ug.n1) this.f42542b, (TLRPC.User) this.f42543c, view);
                return;
            case 20:
                final vg.e eVar2 = (vg.e) this.f42542b;
                final wg.a aVar2 = (wg.a) this.f42543c;
                if (eVar2.d) {
                    if (!aVar2.f48523a.N) {
                        aVar2.b(true);
                        String str2 = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj8) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj8;
                                        aVar2.b(false);
                                        c0 c0Var = (c0) eVar2;
                                        AndroidUtilities.runOnUIThread(new p0(c0Var, 10), 200L);
                                        c0Var.f47126r.dismiss();
                                        return;
                                    default:
                                        aVar2.b(false);
                                        e eVar3 = eVar2;
                                        j.c((TLRPC.TL_error) obj8, eVar3.f47836n, eVar3.f47833c, new c(eVar3, 1));
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
                                        aVar2.b(false);
                                        c0 c0Var = (c0) eVar2;
                                        AndroidUtilities.runOnUIThread(new p0(c0Var, 10), 200L);
                                        c0Var.f47126r.dismiss();
                                        return;
                                    default:
                                        aVar2.b(false);
                                        e eVar3 = eVar2;
                                        j.c((TLRPC.TL_error) obj8, eVar3.f47836n, eVar3.f47833c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.p(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((ug.c0) eVar2).f47126r.dismiss();
                return;
            case 21:
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f42543c;
                wg.f fVar2 = ((wg.g) this.f42542b).f48554s;
                if (fVar2 != null) {
                    ug.b0 b0Var = ((ug.v) fVar2).f47244a;
                    b0Var.f47098c0.remove(chat3);
                    b0Var.a0(true, true);
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.web.b1) this.f42542b).run((TLRPC.TL_payments_checkedGiftCode) this.f42543c);
                return;
            case 23:
                ((org.telegram.ui.web.b1) this.f42542b).run((TLRPC.Chat) this.f42543c);
                return;
            case 24:
                yh.c.P((yh.c) this.f42542b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f42543c);
                return;
            case 25:
                yh.g4 g4Var = (yh.g4) this.f42542b;
                g4Var.getClass();
                if (((zh.j7) this.f42543c).f52145f > 0) {
                    g4Var.presentFragment(new zh.v7());
                    return;
                }
                return;
            case 26:
                yh.f4.P((yh.f4) this.f42542b, (yh.e4) this.f42543c);
                return;
            case 27:
                yh.k4 k4Var = (yh.k4) this.f42542b;
                fi.s4 s4Var = (fi.s4) this.f42543c;
                HashSet hashSet3 = k4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = k4Var.Y.f52132l;
                        int size5 = arrayList7.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size5) {
                                Object obj8 = arrayList7.get(i14);
                                i14++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i15 = savedStarGift.msg_id;
                                if (i15 != 0) {
                                    if (i15 == longValue) {
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
                    s4Var.run(arrayList6);
                    k4Var.dismiss();
                    return;
                }
                return;
            case 28:
                zh.j5 j5Var = ((yh.h4) this.f42542b).f50360c.Y;
                j5Var.f52126e = !j5Var.f52126e;
                ((org.telegram.messenger.kk) this.f42543c).run();
                j5Var.i(true);
                return;
            default:
                zh.g.X((zh.g) this.f42542b, (Context) this.f42543c, view);
                return;
        }
    }
}
