package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class zn implements View.OnClickListener {
    public final int f44023a;
    public final long f44024b;
    public final Object f44025c;
    public final Object d;

    public zn(Object obj, Object obj2, long j10, int i10) {
        this.f44023a = i10;
        this.f44025c = obj;
        this.d = obj2;
        this.f44024b = j10;
    }

    @Override
    public final void onClick(View view) {
        Activity W;
        int i10 = this.f44023a;
        long j10 = this.f44024b;
        Object obj = this.d;
        Object obj2 = this.f44025c;
        switch (i10) {
            case 0:
                final oo ooVar = (oo) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, ooVar.getParentActivity(), null);
                    x1Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !ooVar.M.d();
                    if (ooVar.M.getCheckBox().F == null) {
                        ooVar.M.setChecked(z10);
                    }
                    org.telegram.messenger.i3 G0 = ooVar.getMessagesController().G0();
                    final long j11 = this.f44024b;
                    G0.a(j11, new org.telegram.messenger.r20() {
                        @Override
                        public final void a(Object obj3) {
                            int i11;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            oo ooVar2 = oo.this;
                            TLRPC.Chat chat = ooVar2.f40232w0;
                            int i12 = chat.level;
                            int i13 = tL_premium_boostsStatus.level;
                            if (i12 != i13) {
                                chat.level = i13;
                                ooVar2.getMessagesController().N3(ooVar2.f40232w0, false);
                            }
                            Switch checkBox = ooVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < ooVar2.getMessagesController().B4) {
                                i11 = 2131232512;
                            } else {
                                i11 = 0;
                            }
                            checkBox.setIcon(i11);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
                            if (z11 && tL_premium_boostsStatus.level < ooVar2.getMessagesController().B4) {
                                ooVar2.M.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.i3 G02 = ooVar2.getMessagesController().G0();
                                long j12 = j11;
                                G02.b(j12, tL_premium_boostsStatus, new ko(ooVar2, x1Var2, tL_premium_boostsStatus, j12, 0));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ooVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.wp.h1(ooVar2.f40232w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            ooVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            x1Var2.dismiss();
                            ooVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new org.telegram.messenger.voip.u0(3, ooVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((org.telegram.ui.Components.pr) obj).run(-j10);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((org.telegram.ui.Components.pr) obj).run(-j10);
                return;
            case 3:
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) obj2;
                Context context = (Context) obj;
                a0.h hVar = m60Var.W1;
                if ((m60Var.f28382d2 != null || !hVar.i()) && (W = org.telegram.messenger.i0.W(context)) != null) {
                    if (m60Var.f28382d2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < hVar.m(); i11++) {
                            arrayList.add(Long.valueOf(hVar.j(i11)));
                        }
                        hy hyVar = (hy) m60Var.f28382d2.f41458b;
                        ArrayList arrayList2 = hyVar.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        hyVar.e0();
                        gy gyVar = hyVar.f37885f;
                        if (gyVar != null) {
                            gyVar.a();
                        }
                        m60Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = org.telegram.messenger.dd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                    x1Var2.R = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < hVar.m(); i12++) {
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(m60Var.f21584a).Z1(Long.valueOf(hVar.j(i12)));
                        if (Z1 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            sb2.append("**");
                        }
                    }
                    TLRPC.Chat L0 = org.telegram.messenger.wp.r1(m60Var.f21584a).L0(Long.valueOf(j10));
                    if (hVar.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(hVar.m(), "AddManyMembersAlertNamesText", L0.title)));
                        String format = String.format("%d", Integer.valueOf(hVar.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        x1Var2.T = spannableStringBuilder;
                    } else {
                        x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("AddMembersAlertNamesText", null, 2131754399, sb2, L0.title));
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754486, null), new org.telegram.ui.Components.px(m60Var, 6));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 4:
                zx zxVar = (zx) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.v2) obj).getHasUnread();
                long j12 = this.f44024b;
                if (hasUnread) {
                    zxVar.v4(j12);
                } else {
                    zxVar.getMessagesController().i3(j12, null, 0L);
                }
                zxVar.finishPreviewFragment();
                return;
            case 5:
                qm0 qm0Var = (qm0) obj2;
                qm0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l4 = qm0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    qm0Var.m0 = true;
                    qm0Var.f40825f[0].setText("");
                    qm0Var.m0 = false;
                    qm0Var.H0 = 0L;
                    qm0Var.R0();
                } else {
                    qm0Var.f40825f[0].setText(org.telegram.messenger.dd.D0().q(this.f44024b, false, true, true, qm0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = qm0Var.f40825f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                rh.e4 e4Var = (rh.e4) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.f20390a = true;
                    ph.r3 r3Var = new ph.r3(e4Var.P1, str, this.f44024b, e4Var.I0);
                    r3Var.e = new rh.w1(e4Var, 0);
                    Q.showAsSheet(r3Var, obj3);
                    return;
                }
                return;
        }
    }
}
