package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import qg.q0;
import sg.b0;
import sg.i;
public final class w71 implements View.OnClickListener {
    public final int f37741a;
    public final Object f37742b;
    public final Object f37743c;

    public w71(int i10, Object obj, Object obj2) {
        this.f37741a = i10;
        this.f37742b = obj;
        this.f37743c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        long j3;
        bi.u6 u6Var;
        pg.k2 j10;
        TL_stars.SavedStarGift savedStarGift;
        long j11 = 0;
        xh.o0 o0Var = null;
        int i11 = 0;
        switch (this.f37741a) {
            case 0:
                z71 z71Var = (z71) this.f37742b;
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f37743c;
                if (z71Var.Z.g() != 0) {
                    scVar.run(new ArrayList(z71Var.f39223a0.values()));
                    z71Var.dismiss();
                    return;
                }
                return;
            case 1:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f37742b;
                ((AlertDialog$Builder) this.f37743c).f17528a.L0.run();
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
                v81 v81Var = sessionsActivity.f30608a;
                if (v81Var != null) {
                    v81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new bi.g1(4));
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f37742b;
                editTextBoldCursor.setText(xh.z7.M0(((Long) this.f37743c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 3:
                fb1 fb1Var = ((ka1) this.f37742b).f34316d0;
                fb1Var.getOrCreateStoryViewer().C(fb1Var.getParentActivity(), ((cb1) this.f37743c).b(), fb1Var.f32774z0, zh.s5.a(fb1Var.S));
                return;
            case 4:
                oa1 oa1Var = (oa1) this.f37742b;
                jg.f fVar = (jg.f) this.f37743c;
                int i12 = oa1Var.f35450c;
                pa1 pa1Var = oa1Var.d;
                org.telegram.ui.Components.z00 z00Var = oa1Var.f35448a;
                if (z00Var.f29553c) {
                    ArrayList arrayList = pa1Var.f35756n;
                    hg.g gVar = pa1Var.f35754c;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            if (i13 == i12 || !((oa1) arrayList.get(i13)).f35448a.f29553c || !((oa1) arrayList.get(i13)).f35448a.f29552b) {
                                i13++;
                            }
                        } else {
                            i11 = 1;
                        }
                    }
                    pa1Var.f();
                    if (i11 != 0) {
                        AndroidUtilities.shakeView(z00Var);
                        return;
                    }
                    z00Var.setChecked(!z00Var.f29552b);
                    fVar.f11924n = z00Var.f29552b;
                    pa1Var.f35753b.z();
                    if (pa1Var.f35757r.f36314c > 0 && i12 < gVar.d.size()) {
                        ((jg.f) gVar.d.get(i12)).f11924n = z00Var.f29552b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                wy wyVar = (wy) this.f37743c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new fz0(5, (nb1) this.f37742b, wyVar));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                wyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                    return;
                }
                return;
            case 6:
                fe1 fe1Var = (fe1) this.f37742b;
                Context context = (Context) this.f37743c;
                if (fe1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(fe1Var.getParentActivity(), null);
                    c3Var.a();
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.a2.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                    linearLayout.addView(textView2, w7.a6.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new ai.h(2));
                    c3Var.b(linearLayout);
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
                    hc1 hc1Var = new hc1(context, fe1Var, arrayList2, new ArrayList(), c3Var);
                    linearLayout.addView(hc1Var, w7.a6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    hc1Var.w1(fe1Var.fragmentView.getMeasuredWidth());
                    fe1Var.showDialog(c3Var.f17571a);
                    return;
                }
                return;
            case 7:
                zi1 zi1Var = (zi1) this.f37742b;
                Context context2 = (Context) this.f37743c;
                sg.p1 p1Var = zi1Var.M;
                if (p1Var != null) {
                    p1Var.dismiss();
                    zi1Var.M = null;
                }
                sg.p1 p1Var2 = new sg.p1(context2, zi1Var.f39356a, null, 4, new org.telegram.ui.Components.bq0());
                TLRPC.User user = zi1Var.f39362c;
                if (user != null) {
                    j3 = user.f17342id;
                } else {
                    j3 = 0;
                }
                TLRPC.User user2 = zi1Var.d;
                if (user2 != null) {
                    j11 = user2.f17342id;
                }
                long[] jArr = {j3, j11};
                for (int i14 = 0; i14 < 2; i14++) {
                    p1Var2.C0.add(Long.valueOf(jArr[i14]));
                }
                p1Var2.h0(false, true);
                p1Var2.D0 = new gh.b(2);
                zi1Var.M = p1Var2;
                p1Var2.show();
                return;
            case 8:
                bi.d dVar = (bi.d) this.f37742b;
                int[] iArr = (int[]) this.f37743c;
                if (!dVar.N && (u6Var = pj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] i15 = u6Var.i();
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f4808c).h;
                        b8.e eVar = new b8.e(t0Var, (String) u6Var.f3721c, "/tg-wear-auth/answer", i15);
                        t0Var.f4951b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46530a).addOnSuccessListener(new a7(u6Var, dVar, iArr, 24)).addOnFailureListener(new oj1(dVar, 0));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f37742b;
                lVar.f37998b = true;
                ((y) this.f37743c).run();
                lVar.f38004w.Y2.N(true);
                return;
            case 10:
                pg.n2 n2Var = (pg.n2) this.f37742b;
                bi.we weVar = (bi.we) this.f37743c;
                pg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j10 = n2Var.j(n2Var.f40192n0, n2Var.f40193o0)) != null) {
                    weVar.run(j10);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.zn.d0((eo) this.f37743c, 41026, new org.telegram.ui.web.y1((ph.c) this.f37742b, 3), null);
                return;
            case 12:
                qg.k0.V((qg.k0) this.f37742b, (Context) this.f37743c);
                return;
            case 13:
                sg.u0 u0Var = (sg.u0) this.f37742b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37743c;
                ArrayList arrayList3 = u0Var.X;
                if (!arrayList3.isEmpty()) {
                    sg.d0 d0Var = u0Var.f42010a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i11 < size3) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        sg.s.a(chat.f17195id, arrayList4, new gg.u1(u0Var, chat, arrayList4, hashSet, 14), new org.telegram.ui.web.y1(u0Var, 7));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                sg.p1 p1Var3 = (sg.p1) this.f37742b;
                ArrayList arrayList5 = (ArrayList) this.f37743c;
                HashSet hashSet2 = p1Var3.f41974h0;
                int size4 = arrayList5.size();
                while (i11 < size4) {
                    Object obj2 = arrayList5.get(i11);
                    i11++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    p1Var3.f41979n0.remove(l4);
                }
                p1Var3.W();
                p1Var3.Z.b(true, hashSet2, new sg.d1(p1Var3, 5), null);
                p1Var3.i0(true, true);
                p1Var3.X();
                return;
            case 15:
                sg.p1.S((sg.p1) this.f37742b, (TLRPC.User) this.f37743c, view);
                return;
            case 16:
                final tg.e eVar2 = (tg.e) this.f37742b;
                final ug.a aVar = (ug.a) this.f37743c;
                if (eVar2.d) {
                    if (!aVar.f42665a.N) {
                        aVar.b(true);
                        String str = eVar2.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new q0(b0Var, 14), 200L);
                                        b0Var.f41875r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj3, eVar3.f42157n, eVar3.f42155c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar2;
                                        AndroidUtilities.runOnUIThread(new q0(b0Var, 14), 200L);
                                        b0Var.f41875r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar3 = eVar2;
                                        i.c((TLRPC.TL_error) obj3, eVar3.f42157n, eVar3.f42155c, new c(eVar3, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new sg.o(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((sg.b0) eVar2).f41875r.dismiss();
                return;
            case 17:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f37743c;
                ug.f fVar2 = ((ug.g) this.f37742b).f42693s;
                if (fVar2 != null) {
                    sg.a0 a0Var = ((sg.u) fVar2).f42009a;
                    a0Var.f41848c0.remove(chat2);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.web.y1) this.f37742b).run((TLRPC.TL_payments_checkedGiftCode) this.f37743c);
                return;
            case 19:
                ((org.telegram.ui.web.y1) this.f37742b).run((TLRPC.Chat) this.f37743c);
                return;
            case 20:
                wh.c.P((wh.c) this.f37742b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f37743c);
                return;
            case 21:
                wh.h4 h4Var = (wh.h4) this.f37742b;
                h4Var.getClass();
                if (((xh.n7) this.f37743c).f45777f > 0) {
                    h4Var.presentFragment(new xh.z7());
                    return;
                }
                return;
            case 22:
                wh.g4.P((wh.g4) this.f37742b, (wh.f4) this.f37743c);
                return;
            case 23:
                wh.l4 l4Var = (wh.l4) this.f37742b;
                di.v4 v4Var = (di.v4) this.f37743c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = l4Var.Y.f45761l;
                        int size5 = arrayList7.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size5) {
                                Object obj3 = arrayList7.get(i16);
                                i16++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
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
                    v4Var.run(arrayList6);
                    l4Var.dismiss();
                    return;
                }
                return;
            case 24:
                xh.n5 n5Var = ((wh.i4) this.f37742b).f44152c.Y;
                n5Var.e = !n5Var.e;
                ((org.telegram.messenger.sk) this.f37743c).run();
                n5Var.i(true);
                return;
            case 25:
                xh.h.X((xh.h) this.f37742b, (Context) this.f37743c, view);
                return;
            case 26:
                xh.a0 a0Var2 = (xh.a0) this.f37742b;
                Context context3 = (Context) this.f37743c;
                String[] strArr = new String[6];
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    int[] iArr2 = xh.a0.f45211w0;
                    if (i18 < 6) {
                        strArr[i18] = LocaleController.formatPluralString("GiftOfferHours", iArr2[i18] / 3600, new Object[0]);
                        if (iArr2[i18] == a0Var2.f45224n0) {
                            i19 = i18;
                        }
                        i18++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(a0Var2, 17);
                        Pattern pattern = org.telegram.ui.Components.d5.f22289a;
                        gg.o2 b10 = gg.o2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context3, (org.telegram.ui.ActionBar.f6) null, false);
                            h3Var.fixNavigationBar();
                            h3Var.applyBottomPadding = false;
                            LinearLayout linearLayout2 = new LinearLayout(context3);
                            linearLayout2.setOrientation(0);
                            linearLayout2.setWeightSum(1.0f);
                            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context3, null);
                            dd0Var.setAllItemsCount(6);
                            dd0Var.setItemCount(Math.min(6, 8));
                            dd0Var.setTextColor(w02);
                            dd0Var.setGravity(17);
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(5);
                            dd0Var.setValue(i19);
                            linearLayout2.addView(dd0Var, w7.a6.l(1.0f, 0, 432));
                            dd0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            org.telegram.ui.Components.v4 v4Var2 = new org.telegram.ui.Components.v4(context3, dd0Var);
                            v4Var2.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context3);
                            TextView textView3 = new TextView(context3);
                            textView3.setText(string);
                            textView3.setTextColor(w02);
                            textView3.setTextSize(1, 20.0f);
                            textView3.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView3, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView3.setOnTouchListener(new ai.h(10));
                            v4Var2.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            v4Var2.addView(linearLayout2, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.d dVar2 = new bi.d(context3, null, true);
                            dVar2.g(LocaleController.getString(R.string.Select), false, true);
                            dVar2.setOnClickListener(new org.telegram.ui.Components.l2(r0, 1));
                            v4Var2.addView(dVar2, w7.a6.t(-1, 48, 0, 16, 12, 16, 12));
                            h3Var.customView = v4Var2;
                            h3Var.show();
                            h3Var.setOnDismissListener(new di.h0(7, y1Var, dd0Var));
                            h3Var.setBackgroundColor(w03);
                            h3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
                            return;
                        }
                        return;
                    }
                }
            case 27:
                xh.i0 i0Var = (xh.i0) this.f37742b;
                nj0 nj0Var = (nj0) this.f37743c;
                bi.d dVar3 = i0Var.f45526f;
                if (dVar3.W && !dVar3.N) {
                    AndroidUtilities.hideKeyboard(i0Var.f45525c);
                    dVar3.setLoading(true);
                    nj0Var.run(i0Var.E);
                    return;
                }
                return;
            case 28:
                xh.s0 s0Var = (xh.s0) this.f37742b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList8 = (ArrayList) this.f37743c;
                xh.m0 m0Var = s0Var.f46013o0;
                int i20 = s0Var.C0;
                if (i20 == 2) {
                    m0Var.setPreviewingAttributes(arrayList8);
                    s0Var.S(1);
                    return;
                } else if (i20 == 1) {
                    xh.o0 o0Var2 = new xh.o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                    s0Var.f46020v0 = o0Var2;
                    m0Var.setPreviewAttributes(o0Var2);
                    s0Var.S(2);
                    return;
                } else {
                    return;
                }
            default:
                xh.o0 o0Var3 = (xh.o0) this.f37743c;
                xh.s0 s0Var2 = ((xh.n0) this.f37742b).N;
                int i21 = s0Var2.C0;
                xh.m0 m0Var2 = s0Var2.f46013o0;
                if (i21 == 1) {
                    s0Var2.f46020v0 = new xh.o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    s0Var2.S(2);
                }
                int i22 = s0Var2.f46009j0.f45948r;
                xh.o0 o0Var4 = s0Var2.f46020v0;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.f45786a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.f45788c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.f45787b;
                    if (i22 == 1) {
                        o0Var = new xh.o0(o0Var3.f45786a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i22 == 2) {
                        o0Var = new xh.o0(stargiftattributebackdrop, o0Var3.f45787b, stargiftattributemodel);
                    } else if (i22 == 0) {
                        o0Var = new xh.o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.f45788c);
                    }
                }
                s0Var2.f46020v0 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                s0Var2.U();
                return;
        }
    }
}
