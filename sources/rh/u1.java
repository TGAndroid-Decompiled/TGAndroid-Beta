package rh;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class u1 implements View.OnClickListener {
    public final int f47524a;
    public final Object f47525b;
    public final Object f47526c;

    public u1(int i10, Object obj, Object obj2) {
        this.f47524a = i10;
        this.f47525b = obj;
        this.f47526c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        th.v2 v2Var;
        int i10 = this.f47524a;
        CharSequence charSequence = null;
        Object obj = this.f47526c;
        Object obj2 = this.f47525b;
        switch (i10) {
            case 0:
                gf.f.t(((e4) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                return;
            case 1:
                ((e4) obj2).o2((CharSequence) obj);
                return;
            case 2:
                a3 a3Var = (a3) obj2;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                if (a3Var.E.getAlpha() >= 1.0f && !a3Var.f46618h0 && !a3Var.f46620j0 && a3Var.f46613d0 != null) {
                    new t0(a3Var.getContext(), p6Var, a3Var.W, a3Var.f46612c0, a3Var.f46613d0, true).show();
                    return;
                }
                return;
            case 3:
                gf.f.r((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
            case 4:
                th.s0 s0Var = (th.s0) obj2;
                Context context = (Context) obj;
                if (s0Var != null) {
                    int i11 = s0Var.e;
                    if (i11 != d20.f15147s0) {
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            launchActivity.O0(i11);
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        TL_stories.StoryItem u10 = vp.r1(i11).O1().u(s0Var.f49421c, s0Var.f49420b);
                        if (u10 == null) {
                            u10 = s0Var.f49419a;
                        }
                        if (u10 != null) {
                            T.getOrCreateStoryViewer().P(i11, context, u10, null);
                            org.telegram.messenger.i0.h3(new r5.a(9), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                th.z2 z2Var = (th.z2) obj2;
                th.e6 e6Var = (th.e6) obj;
                th.o7 o7Var = z2Var.f49755s0;
                if (e6Var.f48928b != null) {
                    Bundle bundle = new Bundle();
                    if (e6Var.f48928b.longValue() >= 0) {
                        bundle.putLong("user_id", e6Var.f48928b.longValue());
                    } else {
                        bundle.putLong("chat_id", -e6Var.f48928b.longValue());
                    }
                    if (e6Var.e && (num = e6Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        o7Var.V(new un(bundle));
                        return;
                    }
                    o7Var.V(new ProfileActivity(bundle, null));
                    return;
                }
                wb Q = new cc(z2Var.L0, z2Var.f49725k0).Q(2131624011, 36, cd.L0(2131744683, null));
                Q.f32129a = 3;
                Q.k(true);
                return;
            case 6:
                th.z2 z2Var2 = (th.z2) obj2;
                ((th.f7) z2Var2.f49783z1).h(new kg.i1(z2Var2.f49755s0.f49303f, 14, false));
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                return;
            case 7:
                th.z2 z2Var3 = ((th.u2) obj2).f49512x;
                cv alert = ((th.l6) obj).getAlert();
                if (alert != null && (v2Var = z2Var3.f49783z1) != null) {
                    ((th.f7) v2Var).h(alert);
                    z2Var3.f49696c1.a();
                    return;
                }
                return;
            case 8:
                vh.k2 k2Var = (vh.k2) obj2;
                k2Var.e((we) obj, false);
                k2Var.F.o();
                return;
            case 9:
                vh.t5 t5Var = (vh.t5) obj2;
                vh.d1 d1Var = (vh.d1) obj;
                org.telegram.ui.Cells.m3 m3Var = t5Var.Q1;
                try {
                    charSequence = ((ClipboardManager) t5Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(t5Var.getContext());
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (charSequence != null) {
                    m3Var.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.k3 k3Var = m3Var.d;
                    k3Var.setSelection(0, k3Var.getText().length());
                }
                d1Var.run();
                return;
            case 10:
                vh.o8 o8Var = (vh.o8) obj2;
                new vh.c6((Context) obj, o8Var.f51611c, true, o8Var.f51679x0, new vh.z6(o8Var, 20), o8Var.f51604a).show();
                return;
            case 11:
                xh.i.z0((xh.i) obj2, (Context) obj);
                return;
            case 12:
                xh.m2 m2Var = (xh.m2) obj2;
                xh.e0 e0Var = (xh.e0) obj;
                if (e0Var.c()) {
                    e0Var.a();
                } else {
                    File file = e0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = e0Var.d;
                        org.telegram.messenger.i0.t2(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                    }
                }
                z60 z60Var = m2Var.O0;
                if (z60Var != null) {
                    z60Var.u();
                    m2Var.O0 = null;
                    return;
                }
                return;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.z2) obj2).dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.z4(connectedbotstarref.bot_id));
                    return;
                }
                return;
        }
    }
}
