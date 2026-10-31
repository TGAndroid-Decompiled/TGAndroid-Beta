package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class xe implements View.OnClickListener {
    public final int f43565a;
    public final un f43566b;

    public xe(un unVar, int i10) {
        this.f43565a = i10;
        this.f43566b = unVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f43565a;
        org.telegram.messenger.jj jjVar = null;
        String str = null;
        int i12 = 0;
        un unVar = this.f43566b;
        switch (i11) {
            case 0:
                un unVar2 = this.f43566b;
                kg.q0.w1(unVar2, unVar2.R1, unVar2.S1, unVar2.f42297j6, false);
                return;
            case 1:
                unVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", unVar.f42389r);
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (unVar.Y3 != null) {
                    unVar.ec(!unVar.Uc.f7021f);
                    return;
                }
                return;
            case 3:
                unVar.Cb(!unVar.C0.N);
                return;
            case 4:
                ek ekVar = unVar.W1;
                if (ekVar != null) {
                    ekVar.setReversed(true);
                    unVar.W1.getAdapter().f55657k0 = true;
                    unVar.u7();
                }
                unVar.f42259g3.setVisibility(8);
                unVar.f42270h3.setVisibility(8);
                unVar.B3 = true;
                unVar.C3 = null;
                unVar.D3 = null;
                unVar.f42291j0.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745774, null));
                unVar.f42291j0.setSearchFieldCaption(org.telegram.messenger.cd.L0(2131745783, null));
                org.telegram.messenger.i0.J3(unVar.f42291j0.getSearchField());
                unVar.f42291j0.n();
                return;
            case 5:
                if (unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t0 t0Var = unVar.f42291j0;
                    if (t0Var != null) {
                        org.telegram.messenger.i0.v1(t0Var.getSearchField());
                    }
                    unVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(unVar.getParentActivity(), new fl(unVar), unVar.f42477xa).f11587b);
                    return;
                }
                return;
            case 6:
                unVar.I7(true);
                return;
            case 7:
                org.telegram.messenger.jj jjVar2 = unVar.f42421t5;
                if (jjVar2 != null) {
                    unVar.Z9(jjVar2, false, false);
                    gf.f.q(unVar.getParentActivity(), Uri.parse(unVar.f42421t5.R0), true, false, false, null, null, false, unVar.getMessagesController().f18777e6, false);
                    return;
                }
                return;
            case 8:
                if (org.telegram.messenger.i0.g(unVar.f42421t5.U0)) {
                    org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.f42477xa));
                    return;
                }
                return;
            case 9:
                if (org.telegram.messenger.i0.g(unVar.f42421t5.V0)) {
                    org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.f42477xa));
                    return;
                }
                return;
            case 10:
                if (unVar.l1 != null && unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, unVar.l1.getContext(), null, false);
                    Activity parentActivity = unVar.getParentActivity();
                    sn snVar = unVar.f42477xa;
                    final dg0 dg0Var = new dg0(parentActivity, 10);
                    LinearLayout e = org.telegram.messenger.m5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.cd.L0(2131745272, null));
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    int i13 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(textView, i13, snVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(parentActivity, snVar);
                    p80Var.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description1"), snVar, null));
                    org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, snVar);
                    org.telegram.ui.ActionBar.a7.V(p80Var, i13, snVar);
                    p80Var.setTextSize(1, 14.0f);
                    p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    p80Var.setOnLinkPressListener(new org.telegram.ui.Components.o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var2.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description2"), snVar, null));
                    org.telegram.ui.ActionBar.a7.V(p80Var2, i13, snVar);
                    p80Var2.setTextSize(1, 14.0f);
                    p80Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    p80Var2.setOnLinkPressListener(new org.telegram.ui.Components.o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var3 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var3.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description3"), snVar, null));
                    org.telegram.ui.ActionBar.a7.V(p80Var3, i13, snVar);
                    p80Var3.setTextSize(1, 14.0f);
                    p80Var3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    p80Var3.setOnLinkPressListener(new org.telegram.ui.Components.o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                                case 1:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                                default:
                                    clickableSpan.onClick(dg0Var);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i14 = org.telegram.ui.ActionBar.t6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.t6.w0(i14, snVar));
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
                    org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(parentActivity, paint);
                    q2Var.setOnClickListener(new z7(parentActivity, 3));
                    q2Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                    q2Var.setText(org.telegram.messenger.cd.L0(2131745273, null));
                    org.telegram.ui.ActionBar.a7.V(q2Var, i14, snVar);
                    int i15 = org.telegram.ui.ActionBar.t6.f21001h5;
                    org.telegram.ui.Cells.y e7 = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i15, snVar), 4.0f);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                    org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i15);
                    q2Var.setBackground(e7);
                    org.telegram.ui.ActionBar.a7.k(q2Var, e7, N, f7, snVar);
                    q2Var.setTextSize(1, 14.0f);
                    q2Var.setGravity(16);
                    org.telegram.ui.Components.p80 p80Var4 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var4.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description4"), snVar, null));
                    p80Var4.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.a7.V(p80Var4, i13, snVar);
                    p80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(textView);
                    p80Var.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var, w7.b6.t(-1, -2, 0, 0, 18, 0, 0));
                    p80Var2.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var2, w7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    p80Var3.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var3, w7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(q2Var, w7.b6.t(-2, 34, 1, 22, 14, 22, 0));
                    p80Var4.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var4, w7.b6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(dg0Var.getContext());
                    scrollView.addView(e);
                    dg0Var.addView(scrollView, w7.b6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    k10.N = dg0Var;
                    k10.show();
                    return;
                }
                return;
            case 11:
                unVar.finishPreviewFragment();
                return;
            case 12:
                unVar.getClass();
                unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 28, true));
                return;
            case 13:
                un unVar3 = this.f43566b;
                long j10 = unVar3.f42297j6;
                TLRPC.User user = unVar3.f42243f;
                TLRPC.Chat chat = unVar3.e;
                TLRPC.EncryptedChat encryptedChat = unVar3.h;
                if (unVar3.f42194b2.getTag(2131296585) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.s4.i0(unVar3, j10, user, chat, encryptedChat, z10, unVar3.f42374p8, new sg(unVar3, 2), unVar3.f42477xa);
                return;
            case 14:
                un.p0(unVar);
                return;
            case 15:
                if (unVar.f42382q4 != null) {
                    org.telegram.messenger.x00 x00Var = unVar.getMessagesController().f18891r7;
                    long j11 = unVar.e.f19793id;
                    TLRPC.TL_forumTopic tL_forumTopic = unVar.f42382q4;
                    int i16 = tL_forumTopic.f19845id;
                    tL_forumTopic.closed = false;
                    x00Var.z(i16, j11, false);
                }
                unVar.md();
                unVar.Bc(false);
                unVar.ld(true);
                return;
            case 16:
                long j12 = unVar.f42297j6;
                if (unVar.h != null) {
                    j12 = unVar.f42243f.f19942id;
                }
                unVar.f42428tc = false;
                unVar.getMessagesController().h2(j12, unVar.f42243f, unVar.e);
                unVar.ld(true);
                unVar.Ic(true);
                return;
            case 17:
                un unVar4 = this.f43566b;
                unVar4.P4 = true;
                if (unVar4.T9() && !unVar4.f42445v4) {
                    unVar4.k((int) unVar4.f42394r4, 0, true, 0, true, 0);
                    return;
                }
                int i17 = unVar4.X4;
                if (i17 != 0) {
                    if (!unVar4.T4.isEmpty()) {
                        if (i17 == ((Integer) i0.a.g(1, unVar4.T4)).intValue()) {
                            i12 = ((Integer) unVar4.T4.get(0)).intValue() + 1;
                            unVar4.f42183a5 = true;
                        } else {
                            unVar4.f42183a5 = false;
                            i12 = i17 - 1;
                        }
                    }
                    unVar4.Z4 = i12;
                    if (!unVar4.f42183a5) {
                        i12 = -i12;
                    }
                    unVar4.k(i17, 0, true, 0, true, i12);
                    unVar4.Oc();
                    return;
                }
                return;
            case 18:
                unVar.ya(false);
                return;
            case 19:
                un.g1(unVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", unVar.a());
                unVar.presentFragment(new oo(bundle2));
                return;
            case 21:
                un.N0(unVar);
                return;
            case 22:
                un.G1(unVar);
                return;
            case 23:
                un.p1(unVar);
                return;
            case 24:
                unVar.ra(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = unVar.f42333m6;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (jjVar == null && sparseArrayArr[i18].size() != 0) {
                        jjVar = (org.telegram.messenger.jj) unVar.E6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    unVar.f42347n6[i18].clear();
                    unVar.f42360o6[i18].clear();
                }
                unVar.p9();
                if (jjVar != null && ((i10 = jjVar.f16337k.f19814id) > 0 || (i10 < 0 && unVar.h != null))) {
                    unVar.Ub(jjVar);
                }
                unVar.Sc(0, true);
                unVar.sd(false);
                unVar.fd();
                return;
            case 26:
                un.P0(unVar);
                return;
            case 27:
                un unVar5 = this.f43566b;
                org.telegram.messenger.jj jjVar3 = unVar5.F5;
                if (jjVar3 != null) {
                    unVar5.k(jjVar3.f1(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (unVar.S9()) {
                    str = "";
                }
                unVar.Ba(str);
                return;
            default:
                unVar.Y7();
                unVar.M3.m(unVar.f42297j6, org.telegram.messenger.cd.L0(2131752880, null), 18);
                return;
        }
    }
}
