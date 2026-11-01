package rh;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.messenger.xe;
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
    public final int f47532a;
    public final Object f47533b;
    public final Object f47534c;

    public u1(int i10, Object obj, Object obj2) {
        this.f47532a = i10;
        this.f47533b = obj;
        this.f47534c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        th.v2 v2Var;
        int i10 = this.f47532a;
        CharSequence charSequence = null;
        Object obj = this.f47534c;
        Object obj2 = this.f47533b;
        switch (i10) {
            case 0:
                gf.f.t(((e4) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                return;
            case 1:
                ((e4) obj2).o2((CharSequence) obj);
                return;
            case 2:
                b3 b3Var = (b3) obj2;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                if (b3Var.E.getAlpha() >= 1.0f && !b3Var.f46682h0 && !b3Var.f46684j0 && b3Var.f46677d0 != null) {
                    new t0(b3Var.getContext(), p6Var, b3Var.W, b3Var.f46676c0, b3Var.f46677d0, true).show();
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
                    if (i11 != e20.f15506s0) {
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            launchActivity.O0(i11);
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        TL_stories.StoryItem u10 = wp.r1(i11).O1().u(s0Var.f49435c, s0Var.f49434b);
                        if (u10 == null) {
                            u10 = s0Var.f49433a;
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
                th.o7 o7Var = z2Var.f49769s0;
                if (e6Var.f48942b != null) {
                    Bundle bundle = new Bundle();
                    if (e6Var.f48942b.longValue() >= 0) {
                        bundle.putLong("user_id", e6Var.f48942b.longValue());
                    } else {
                        bundle.putLong("chat_id", -e6Var.f48942b.longValue());
                    }
                    if (e6Var.e && (num = e6Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        o7Var.V(new un(bundle));
                        return;
                    }
                    o7Var.V(new ProfileActivity(bundle, null));
                    return;
                }
                wb Q = new cc(z2Var.L0, z2Var.f49739k0).Q(2131624011, 36, dd.L0(2131744683, null));
                Q.f32195a = 3;
                Q.k(true);
                return;
            case 6:
                th.z2 z2Var2 = (th.z2) obj2;
                ((th.f7) z2Var2.f49797z1).h(new kg.i1(z2Var2.f49769s0.f49317f, 14, false));
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                return;
            case 7:
                th.z2 z2Var3 = ((th.u2) obj2).f49526x;
                cv alert = ((th.l6) obj).getAlert();
                if (alert != null && (v2Var = z2Var3.f49797z1) != null) {
                    ((th.f7) v2Var).h(alert);
                    z2Var3.f49710c1.a();
                    return;
                }
                return;
            case 8:
                vh.k2 k2Var = (vh.k2) obj2;
                k2Var.e((xe) obj, false);
                k2Var.F.o();
                return;
            case 9:
                vh.t5 t5Var = (vh.t5) obj2;
                vh.r0 r0Var = (vh.r0) obj;
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
                r0Var.run();
                return;
            case 10:
                vh.o8 o8Var = (vh.o8) obj2;
                new vh.c6((Context) obj, o8Var.f51626c, true, o8Var.f51694x0, new vh.z6(o8Var, 20), o8Var.f51619a).show();
                return;
            case 11:
                xh.i.A0((xh.i) obj2, (Context) obj);
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
                    T2.presentFragment(ProfileActivity.A4(connectedbotstarref.bot_id));
                    return;
                }
                return;
        }
    }
}
