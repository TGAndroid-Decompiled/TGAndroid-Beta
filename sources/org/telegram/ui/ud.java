package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class ud implements View.OnClickListener {
    public final int f42116a;
    public final Object f42117b;
    public final Object f42118c;

    public ud(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f42116a = i10;
        this.f42118c = k2Var;
        this.f42117b = context;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int N;
        int[] iArr;
        String G;
        int b10;
        int i12;
        String G2;
        int length;
        View view2;
        int i13 = this.f42116a;
        int i14 = -1;
        int i15 = 2;
        ?? r11 = 0;
        s4.c1 c1Var = null;
        boolean z10 = true;
        Object obj = this.f42118c;
        Object obj2 = this.f42117b;
        switch (i13) {
            case 0:
                gf.f.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 1:
                un unVar = (un) obj2;
                if (unVar.getMediaDataController().V1(((org.telegram.messenger.jj) obj).F0())) {
                    unVar.Y7();
                    UndoView undoView = unVar.M3;
                    if (undoView != null) {
                        long j10 = unVar.f42297j6;
                        int i16 = UndoView.f24237i0;
                        undoView.j(83, j10, new j4(unVar, 1));
                    }
                }
                unVar.I7(true);
                return;
            case 2:
                un.l0((un) obj2, (String) obj);
                return;
            case 3:
                un.c0((un) obj2, (org.telegram.ui.Components.z60) obj);
                return;
            case 4:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) obj2;
                boolean z11 = !c2Var.b();
                c2Var.c(z11, true);
                ((AtomicBoolean) obj).set(z11);
                return;
            case 5:
                un.q1((un) obj, (Context) obj2);
                return;
            case 6:
                oo ooVar = (oo) obj;
                Context context = (Context) obj2;
                l2.f fVar = new l2.f(context, (org.telegram.ui.ActionBar.p6) null);
                ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21616u0 = false;
                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, org.telegram.ui.ActionBar.t6.f21114n5, 23, 15, false, null);
                p4Var.setHeight(47);
                p4Var.setText(org.telegram.messenger.cd.L0(2131752233, "ChatHistory"));
                f7.addView(p4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f7.addView(linearLayout, w7.b6.o(-1, -2));
                View[] viewArr = new org.telegram.ui.Cells.l6[2];
                int i17 = 0;
                while (i17 < i15) {
                    View l6Var = new org.telegram.ui.Cells.l6(context, true);
                    viewArr[i17] = l6Var;
                    l6Var.setTag(Integer.valueOf(i17));
                    org.telegram.ui.ActionBar.a7.R(viewArr[i17], org.telegram.ui.ActionBar.t6.N0(false), r11, org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6), r11);
                    if (i17 == 0) {
                        viewArr[i17].b(org.telegram.messenger.cd.L0(2131752228, "ChatHistoryVisible"), org.telegram.messenger.cd.L0(2131752227, "ChatHistoryVisibleInfo"), true, !ooVar.J0);
                    } else if (org.telegram.messenger.w3.T(ooVar.f40343w0)) {
                        viewArr[i17].b(org.telegram.messenger.cd.L0(2131752232, "ChatHistoryHidden"), org.telegram.messenger.cd.L0(2131752231, "ChatHistoryHiddenInfo"), false, ooVar.J0);
                    } else {
                        viewArr[i17].b(org.telegram.messenger.cd.L0(2131752232, "ChatHistoryHidden"), org.telegram.messenger.cd.L0(2131752230, "ChatHistoryHiddenInfo2"), false, ooVar.J0);
                    }
                    linearLayout.addView(viewArr[i17], w7.b6.o(-1, -2));
                    viewArr[i17].setOnClickListener(new x(ooVar, viewArr, fVar, 8));
                    i17++;
                    i15 = 2;
                    r11 = 0;
                }
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
                z2Var.N = f7;
                ooVar.showDialog(z2Var);
                return;
            case 7:
                oo.Y((oo) obj2, (FrameLayout) obj, view);
                return;
            case 8:
                iq.Z((iq) obj2, (l2.f) obj, view);
                return;
            case 9:
                new kg.i1(42, ((org.telegram.ui.Components.g0) obj2).getContext(), (org.telegram.ui.ActionBar.p6) obj).show();
                return;
            case 10:
                final org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) obj2;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                org.telegram.ui.Cells.m3 m3Var = zVar.T1;
                org.telegram.ui.Cells.m3 m3Var2 = zVar.S1;
                org.telegram.ui.Components.ep epVar = zVar.V1;
                vh.d dVar = zVar.Y1;
                if (!dVar.Q) {
                    if (!dVar.f51052c0) {
                        if (zVar.Z1 == null) {
                            zVar.d1();
                            return;
                        }
                        return;
                    }
                    dVar.setLoading(true);
                    if (zVar.f32853b2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = epVar.f25836a.f23919q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.f32853b2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = zVar.Z1.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = m3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = m3Var.getText().toString();
                        ConnectionsManager.getInstance(zVar.f21583a).sendRequestTyped(updatetone, new a3.b(1), new org.telegram.messenger.j20() {
                            @Override
                            public final void a(Object obj3, Object obj4) {
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                switch (r3) {
                                    case 0:
                                        z zVar2 = zVar;
                                        zVar2.Y1.setLoading(false);
                                        if (aiComposeTone != null) {
                                            f fVar2 = zVar2.f32855d2;
                                            if (fVar2 != null) {
                                                fVar2.a(aiComposeTone);
                                            }
                                            zVar2.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            org.telegram.ui.Cells.f1.s(zVar2.X1, p6Var, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        z zVar3 = zVar;
                                        FrameLayout frameLayout = zVar3.X1;
                                        zVar3.Y1.setLoading(false);
                                        if (aiComposeTone != null) {
                                            zVar3.dismiss();
                                            f fVar3 = zVar3.f32854c2;
                                            if (fVar3 != null) {
                                                fVar3.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                            if (equalsIgnoreCase) {
                                                g0.t1(new cc(frameLayout, p6Var2), zVar3.f21583a);
                                                return;
                                            } else {
                                                org.telegram.ui.Cells.f1.s(frameLayout, p6Var2, tL_error, false);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                    createtone.display_author = epVar.f25836a.f23919q;
                    createtone.emoji_id = zVar.Z1.longValue();
                    createtone.title = m3Var2.getText().toString();
                    createtone.prompt = m3Var.getText().toString();
                    ConnectionsManager.getInstance(zVar.f21583a).sendRequestTyped(createtone, new a3.b(1), new org.telegram.messenger.j20() {
                        @Override
                        public final void a(Object obj3, Object obj4) {
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                            switch (r3) {
                                case 0:
                                    z zVar2 = zVar;
                                    zVar2.Y1.setLoading(false);
                                    if (aiComposeTone != null) {
                                        f fVar2 = zVar2.f32855d2;
                                        if (fVar2 != null) {
                                            fVar2.a(aiComposeTone);
                                        }
                                        zVar2.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        org.telegram.ui.Cells.f1.s(zVar2.X1, p6Var, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    z zVar3 = zVar;
                                    FrameLayout frameLayout = zVar3.X1;
                                    zVar3.Y1.setLoading(false);
                                    if (aiComposeTone != null) {
                                        zVar3.dismiss();
                                        f fVar3 = zVar3.f32854c2;
                                        if (fVar3 != null) {
                                            fVar3.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                        if (equalsIgnoreCase) {
                                            g0.t1(new cc(frameLayout, p6Var2), zVar3.f21583a);
                                            return;
                                        } else {
                                            org.telegram.ui.Cells.f1.s(frameLayout, p6Var2, tL_error, false);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                }
                return;
            case 11:
                ((org.telegram.messenger.q20) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 12:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj2;
                org.telegram.ui.Components.p4 p4Var2 = (org.telegram.ui.Components.p4) obj;
                t0Var.U(null, null);
                t0Var.O(p4Var2.d, false);
                t0Var.setupPopupRadialSelectors(p4Var2.f29282f);
                t0Var.H(p4Var2.e);
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                boolean z12 = !zArr[0];
                zArr[0] = z12;
                ((org.telegram.ui.Cells.c2) view).c(z12, true);
                ((kp) obj).run();
                return;
            case 14:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f20134a.N0.run();
                ((cu) obj).onClick(null, intValue);
                return;
            case 15:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) obj2).f11587b).f21621x0.run();
                ((org.telegram.messenger.q20) obj).a(null);
                return;
            case 16:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 17:
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().f14472q0;
                int i18 = 0;
                while (true) {
                    if (i18 < 3) {
                        if (f10 - 0.1f <= fArr[i18]) {
                            i14 = i18;
                        } else {
                            i18++;
                        }
                    }
                }
                int i19 = i14 + 1;
                if (i19 >= 3) {
                    i19 = 0;
                }
                MediaController.B().m0(true, fArr[i19]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - w7Var.G2 > 300) {
                    int i20 = org.telegram.messenger.vp.e1().getInt("speedhint", 0) + 1;
                    if (i20 > 2) {
                        i20 = -10;
                    }
                    org.telegram.messenger.vp.e1().edit().putInt("speedhint", i20).apply();
                    if (i20 >= 0 && w7Var.f21586b != null) {
                        ij ijVar = new ij(5, 1, w7Var.getContext(), null, false);
                        w7Var.F2 = ijVar;
                        ijVar.setExtraTranslationY(org.telegram.messenger.i0.L(6.0f));
                        w7Var.F2.setText(org.telegram.messenger.cd.L0(2131745287, null));
                        w7Var.f32074u1.addView(w7Var.F2, w7.b6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        w7Var.F2.f(w7Var.L1, true);
                    }
                }
                w7Var.G2 = currentTimeMillis;
                return;
            case 18:
                org.telegram.ui.Components.w7 w7Var2 = (org.telegram.ui.Components.w7) obj2;
                w7Var2.getClass();
                ((org.telegram.ui.Components.z60) obj).u();
                w7Var2.P0(6);
                return;
            case 19:
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) obj;
                org.telegram.ui.Components.w7 w7Var3 = (org.telegram.ui.Components.w7) ((org.telegram.ui.Components.o7) obj2).F;
                int i21 = w7Var3.f21583a;
                LaunchActivity launchActivity = w7Var3.f32079w2;
                ArrayList arrayList = (ArrayList) org.telegram.messenger.vp.r1(i21).f18930w.get(0);
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                if (i10 > 10 && !TextUtils.isEmpty(h90Var.getText().toString())) {
                    String charSequence = h90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof ay) {
                        ay ayVar = (ay) launchActivity.M().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) ayVar.getMessagesController().f18930w.get(0);
                        if (arrayList2 != null) {
                            i11 = arrayList2.size();
                        } else {
                            i11 = 0;
                        }
                        if (!ayVar.f35831l2 && (i11 > 10 || ayVar.K)) {
                            z10 = false;
                        }
                        if (!z10) {
                            if (!ayVar.f35822j2) {
                                ayVar.f35896y = 3;
                                ayVar.X.f26588r.setText(charSequence);
                                ayVar.X.f26588r.setSelection(charSequence.length());
                            } else {
                                ayVar.X.f26588r.setText(charSequence);
                                ayVar.X.f26588r.setSelection(charSequence.length());
                                kx kxVar = ayVar.C0;
                                if (kxVar != null && (N = kxVar.N(3)) >= 0 && ayVar.C0.getTabsView().getCurrentTabId() != N) {
                                    ayVar.C0.getTabsView().d(N, N);
                                }
                            }
                            w7Var3.dismiss();
                            return;
                        }
                    }
                    ay ayVar2 = new ay(null);
                    ayVar2.f35840n2 = charSequence;
                    ayVar2.f35896y = 3;
                    launchActivity.u0(ayVar2, false, false);
                    w7Var3.dismiss();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) obj2;
                ((boolean[]) obj)[0] = true;
                o8Var.J.z1(o8Var.Y);
                o8Var.S.dismiss();
                return;
            case 21:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.z60 z60Var = ncVar.W0;
                if (z60Var != null && z60Var.D()) {
                    ncVar.W0.u();
                    ncVar.W0 = null;
                    return;
                }
                ncVar.f28748c1.e(true);
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(frameLayout, new th.b(), ncVar.U0);
                ncVar.W0 = F;
                F.f32941s = 0;
                F.p(13, org.telegram.messenger.i0.L(200.0f), org.telegram.messenger.cd.L0(2131744160, null));
                ncVar.W0.k();
                for (int i22 : ncVar.f28747b1) {
                    if (i22 == 0) {
                        G = org.telegram.messenger.cd.L0(2131744161, null);
                    } else if (i22 == Integer.MAX_VALUE) {
                        G = org.telegram.messenger.cd.L0(2131744159, null);
                    } else {
                        G = org.telegram.messenger.cd.G(i22, "Seconds", new Object[0]);
                    }
                    ncVar.W0.c(0, G, new ag.d3(ncVar, i22, 27), false);
                    if (ncVar.f28746a1 == i22) {
                        ncVar.W0.L();
                    }
                }
                ncVar.W0.Z();
                return;
            case 22:
                org.telegram.ui.Components.bl.V((org.telegram.ui.Components.bl) obj2, (org.telegram.ui.ActionBar.p6) obj);
                return;
            case 23:
                org.telegram.ui.Components.yk ykVar = (org.telegram.ui.Components.yk) obj2;
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) obj;
                org.telegram.ui.Components.bl blVar = ykVar.f32752b;
                org.telegram.ui.Components.bi biVar = blVar.f30947b;
                un unVar2 = (un) biVar.W1;
                if (unVar2.c()) {
                    org.telegram.ui.Components.s4.L(org.telegram.ui.Components.bl.X(blVar), unVar2.a(), new org.telegram.ui.Components.f2(7, ykVar, alVar), blVar.f30946a);
                    return;
                } else {
                    org.telegram.ui.Components.s4.Z(biVar.D3, biVar.W0() + 1, biVar.a1(), new org.telegram.ui.Components.vg(4, ykVar, alVar));
                    return;
                }
            case 24:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) ((fg.j) obj2).e;
                w71 w71Var = jnVar.f27445s;
                View F2 = w71Var.F((org.telegram.ui.Components.hn) obj);
                if (F2 != null) {
                    c1Var = w71Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - jnVar.f27447t0) >= 0 && b10 < jnVar.K.length) {
                    org.telegram.ui.Components.jn.R(jnVar, b10);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) obj2;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj;
                un unVar3 = snVar.G;
                if (snVar.T) {
                    unVar3.showDialog(org.telegram.ui.Components.s4.U(snVar.getContext(), unVar3.h, p6Var2).f20134a);
                    return;
                }
                org.telegram.ui.Components.on onVar = snVar.e;
                if (unVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = unVar3.e;
                    if (chat != null && !org.telegram.messenger.w3.y(13, chat)) {
                        if (snVar.f30266a.f7021f && unVar3.getParentActivity() != null && unVar3.fragmentView != null && unVar3.f42374p8 != null) {
                            if (unVar3.C2 == null) {
                                org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, unVar3.getParentActivity(), unVar3.f42477xa, true);
                                unVar3.C2 = q30Var;
                                q30Var.setAlpha(0.0f);
                                unVar3.C2.setVisibility(4);
                                unVar3.C2.setShowingDuration(4000L);
                                unVar3.l1.addView(unVar3.C2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i23 = unVar3.f42374p8.ttl_period;
                            if (i23 > 86400) {
                                G2 = org.telegram.messenger.cd.G(i23 / 86400, "Days", new Object[0]);
                            } else if (i23 >= 3600) {
                                G2 = org.telegram.messenger.cd.G(i23 / 3600, "Hours", new Object[0]);
                            } else if (i23 >= 60) {
                                G2 = org.telegram.messenger.cd.G(i23 / 60, "Minutes", new Object[0]);
                            } else {
                                G2 = org.telegram.messenger.cd.G(i23, "Seconds", new Object[0]);
                            }
                            unVar3.C2.setText(org.telegram.messenger.cd.a0("AutoDeleteSetInfo", null, 2131753844, G2));
                            unVar3.C2.f(unVar3.f42355o1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = unVar3.f42374p8;
                    TLRPC.UserFull userFull = unVar3.f42385q8;
                    if (userFull != null) {
                        i12 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i12 = chatFull.ttl_period;
                    } else {
                        i12 = 0;
                    }
                    m4.n0 n0Var = new m4.n0(snVar.getContext(), null, new org.telegram.ui.Components.pn(snVar, r4), true, 0, snVar.f30272d0);
                    n0Var.t(i12);
                    org.telegram.ui.Components.qn qnVar = new org.telegram.ui.Components.qn(snVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12863a);
                    org.telegram.ui.ActionBar.k1[] k1VarArr = {qnVar};
                    qnVar.e = true;
                    qnVar.f20456c = 220;
                    qnVar.setOutsideTouchable(true);
                    k1VarArr[0].setClippingEnabled(true);
                    k1VarArr[0].setAnimationStyle(2131755192);
                    k1VarArr[0].setFocusable(true);
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12863a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
                    k1VarArr[0].setInputMethodMode(2);
                    k1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    k1VarArr[0].showAtLocation(onVar, 0, (int) (snVar.getX() + onVar.getX()), (int) onVar.getY());
                    unVar3.o8(false, true, 0.2f);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) obj2;
                un unVar4 = (un) obj;
                if (dpVar.f25486m1 != null) {
                    dpVar.f25486m1 = null;
                    dpVar.dismiss();
                    org.telegram.messenger.g4.f(dpVar.f21583a).a(unVar4.a(), true, false);
                    return;
                }
                dpVar.dismiss();
                return;
            case 27:
                org.telegram.ui.Components.cr crVar = (org.telegram.ui.Components.cr) obj2;
                crVar.R1 = org.telegram.messenger.vp.r1(crVar.f21583a).i1(org.telegram.messenger.jj.C1((TLRPC.Peer) obj));
                crVar.dismiss();
                return;
            case 28:
                org.telegram.ui.Components.lr lrVar = (org.telegram.ui.Components.lr) obj2;
                String str = (String) obj;
                if (lrVar.f28169b == null && (view2 = lrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        lrVar.f28169b = (EditText) findFocus;
                    }
                }
                if (lrVar.f28169b != null) {
                    try {
                        lrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = lrVar.f28169b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = lrVar.f28169b.getText();
                    if (lrVar.f28169b.getSelectionEnd() == lrVar.f28169b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + lrVar.f28169b.getSelectionStart();
                    }
                    if (lrVar.f28169b.getSelectionStart() != -1 && lrVar.f28169b.getSelectionEnd() != -1) {
                        EditText editText2 = lrVar.f28169b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), lrVar.f28169b.getSelectionEnd(), str));
                        EditText editText3 = lrVar.f28169b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        lrVar.f28169b.setText(str);
                        EditText editText4 = lrVar.f28169b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = lrVar.f28169b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.vr vrVar = (org.telegram.ui.Components.vr) obj2;
                org.telegram.ui.Components.ur urVar = (org.telegram.ui.Components.ur) obj;
                vrVar.X0();
                urVar.f31016f = !urVar.f31016f;
                urVar.f31019j.P1.O(true);
                vrVar.I0();
                return;
        }
    }

    public ud(int i10, Object obj, Object obj2) {
        this.f42116a = i10;
        this.f42117b = obj;
        this.f42118c = obj2;
    }
}
