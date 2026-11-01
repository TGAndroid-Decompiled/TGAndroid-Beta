package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o10;
import org.telegram.ui.ox0;
import rh.h5;
import rh.l5;
import w7.b6;
import w7.e6;
public final class z2 extends o10 implements vs {
    public final long R;
    public FrameLayout S;
    public lg.q T;
    public bn U;
    public ph.o3 V;

    public z2(long j10) {
        this.R = j10;
        this.M = true;
        this.L = org.telegram.messenger.i0.L(60.0f);
    }

    public static void A0(z2 z2Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, z2Var.resourceProvider);
        String L0 = dd.L0(2131749017, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749016, i20.p(user)));
        alertDialog$Builder.k(dd.L0(2131749015, null), new org.telegram.ui.web.k0(27, z2Var, connectedbotstarref));
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void B0(z2 z2Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, z2Var.getParentActivity(), null);
        x1Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = wp.r1(z2Var.currentAccount).i1(z2Var.R);
        editconnectedstarrefbot.revoked = true;
        z2Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new h5(10, z2Var, x1Var));
    }

    public static void C0(z2 z2Var, Context context, int i10) {
        ph.o3 o3Var = z2Var.V;
        if (o3Var != null) {
            Object obj = o3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                J0(context, z2Var.currentAccount, (TL_payments.starRefProgram) obj, z2Var.R, z2Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                K0(context, z2Var.currentAccount, (TL_payments.connectedBotStarRef) obj, z2Var.R, z2Var.resourceProvider);
            }
        }
    }

    public static void D0(z2 z2Var, TLObject tLObject, org.telegram.ui.ActionBar.x1 x1Var) {
        long j10 = z2Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            rh.o d = rh.r.g(z2Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.f47280a;
            wp.r1(i10).V3(connectedstarrefbots.users, false);
            for (int i11 = 0; i11 < connectedstarrefbots.connected_bots.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i11);
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i12)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i12);
                            d.f47282c = Math.max(d.f47282c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            at.f(i10).k(at.L3, Long.valueOf(d.f47281b));
            d.a();
            rh.p e = rh.r.g(z2Var.currentAccount).e(j10);
            e.f47311c = 0;
            e.d = false;
            e.f47314i = false;
            e.f47312f = 0L;
            e.f47315j = null;
            e.h = false;
            e.a();
            z2Var.V.O(true);
        }
        x1Var.dismiss();
    }

    public static boolean E0(z2 z2Var, Context context, View view, int i10) {
        ph.o3 o3Var = z2Var.V;
        if (o3Var != null) {
            Object obj = o3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User Z1 = wp.r1(z2Var.currentAccount).Z1(Long.valueOf(connectedbotstarref.bot_id));
                z60 H = z60.H(z2Var, view);
                H.l(2131232071, dd.L0(2131746723, null), new vh.r0(27, z2Var, Z1), Z1.bot_has_main_app);
                H.l(2131232071, dd.L0(2131752912, null), new vh.r0(28, z2Var, connectedbotstarref), !Z1.bot_has_main_app);
                H.c(2131232203, dd.L0(2131751762, null), new l5(z2Var, connectedbotstarref, Z1, 25), false);
                H.m(2131232194, new p2(z2Var, context, Z1, connectedbotstarref, 0), dd.L0(2131749015, null), !connectedbotstarref.revoked, true);
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int F0(z2 z2Var) {
        return z2Var.currentAccount;
    }

    public static int G0(z2 z2Var) {
        return z2Var.currentAccount;
    }

    public static void J0(android.content.Context r34, int r35, final org.telegram.tgnet.tl.TL_payments.starRefProgram r36, long r37, org.telegram.ui.ActionBar.p6 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z2.J0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.p6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.z2 K0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, p6 p6Var) {
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i14;
        org.telegram.ui.ActionBar.z2 z2Var;
        char c10;
        String G;
        char c11;
        String G2;
        int i15;
        LinearLayout linearLayout2;
        String str;
        String G3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        String str2;
        int i16;
        int i17;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, p6Var, false);
        TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f11 = m5.f(context, 1);
        f11.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int L = org.telegram.messenger.i0.L(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = t6.kk;
        } else {
            i11 = t6.Ci;
        }
        Drawable L2 = t6.L(L, t6.w0(i11, p6Var));
        if (connectedbotstarref.revoked) {
            i12 = t6.kk;
        } else {
            i12 = t6.Ci;
        }
        w6 N = a7.N(i12);
        view.setBackground(L2);
        a7.k(view, L2, N, null, p6Var);
        frameLayout.addView(view, b6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i13 = 2131232205;
        } else {
            i13 = 2131232199;
        }
        imageView.setImageResource(i13);
        if (connectedbotstarref.revoked) {
            f7 = 2.0f;
        } else {
            f7 = 1.8f;
        }
        imageView.setScaleX(f7);
        if (connectedbotstarref.revoked) {
            f10 = 2.0f;
        } else {
            f10 = 1.8f;
        }
        imageView.setScaleY(f10);
        frameLayout.addView(imageView, b6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int L3 = org.telegram.messenger.i0.L(50.0f);
            int i18 = t6.f21002h5;
            Drawable d02 = t6.d0(L3, t6.w0(i18, p6Var));
            w6 N2 = a7.N(i18);
            frameLayout2.setBackground(d02);
            a7.k(frameLayout2, d02, N2, null, p6Var);
            frameLayout.addView(frameLayout2, b6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setTextSize(1, 12.0f);
            int L4 = org.telegram.messenger.i0.L(9.5f);
            if (connectedbotstarref.revoked) {
                i16 = t6.kk;
            } else {
                i16 = t6.ik;
            }
            Drawable d03 = t6.d0(L4, t6.w0(i16, p6Var));
            if (connectedbotstarref.revoked) {
                i17 = t6.kk;
            } else {
                i17 = t6.ik;
            }
            w6 N3 = a7.N(i17);
            textView.setBackground(d03);
            a7.k(textView, d03, N3, null, p6Var);
            textView.setTextColor(-1);
            textView.setPadding(org.telegram.messenger.i0.L(6.66f), 0, org.telegram.messenger.i0.L(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            dq dqVar = new dq(2131231969, 0);
            dqVar.H = 0.937f;
            dqVar.I = 0.937f;
            dqVar.f25568r = -org.telegram.messenger.i0.L(1.33f);
            dqVar.f25569s = org.telegram.messenger.i0.L(1.0f);
            dqVar.G = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, b6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f11.addView(frameLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i19 = t6.G6;
        a7.V(textView2, i19, p6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(dd.L0(2131752482, null));
        textView2.setTypeface(org.telegram.messenger.i0.o());
        f11.addView(textView2, b6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int L5 = org.telegram.messenger.i0.L(28.0f);
        int i20 = t6.f20873a7;
        ShapeDrawable d04 = t6.d0(L5, t6.w0(i20, p6Var));
        w6 N4 = a7.N(i20);
        linearLayout3.setBackground(d04);
        a7.k(linearLayout3, d04, N4, null, p6Var);
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        r8 r8Var = new r8((p6) null);
        linearLayout3.addView(g9Var, b6.o(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        a7.V(textView3, i19, p6Var);
        textView3.setText(o5.l(i10, connectedbotstarref.bot_id));
        r8Var.r(Z1);
        g9Var.e(Z1, r8Var);
        linearLayout3.addView(textView3, b6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i21 = t6.f21186r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView2, i21, p6Var, mode);
        imageView2.setImageResource(2131232694);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, b6.t(-2, -2, 16, 5, 0, 8, 0));
        f11.addView(linearLayout3, b6.t(-2, 28, 1, 4, 0, 4, 0));
        e6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        a7.V(textView4, i19, p6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(org.telegram.messenger.i0.W2(dd.L0(2131752484, null)));
            i14 = i21;
            z2Var = k10;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j10 < 0) {
                String J0 = i.J0(connectedbotstarref.commission_permille);
                String p5 = i20.p(Z1);
                int i22 = connectedbotstarref.duration_months;
                i14 = i21;
                z2Var = k10;
                if (i22 <= 0) {
                    G2 = dd.L0(2131752501, null);
                    c11 = 0;
                } else if (i22 < 12 || i22 % 12 != 0) {
                    c11 = 0;
                    G2 = dd.G(i22, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c11 = 0;
                    G2 = dd.G(i22 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr = new Object[3];
                objArr[c11] = J0;
                objArr[1] = p5;
                objArr[2] = G2;
                m5.q(null, null, 2131752485, objArr, textView4);
            } else {
                i14 = i21;
                z2Var = k10;
                String J02 = i.J0(connectedbotstarref.commission_permille);
                String p9 = i20.p(Z1);
                int i23 = connectedbotstarref.duration_months;
                if (i23 <= 0) {
                    G = dd.L0(2131752501, null);
                    c10 = 0;
                } else if (i23 < 12 || i23 % 12 != 0) {
                    c10 = 0;
                    G = dd.G(i23, "ChannelAffiliateProgramJoinText_Months", new Object[0]);
                } else {
                    c10 = 0;
                    G = dd.G(i23 / 12, "ChannelAffiliateProgramJoinText_Years", new Object[0]);
                }
                Object[] objArr2 = new Object[3];
                objArr2[c10] = J02;
                objArr2[1] = p9;
                objArr2[2] = G;
                m5.q(null, null, 2131752483, objArr2, textView4);
            }
        }
        f11.addView(textView4, b6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            a7.V(textView5, i19, p6Var);
            textView5.setTextSize(1, 14.0f);
            m5.l(textView5, 17, null, 2131752486);
            f11.addView(textView5, b6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable d05 = t6.d0(org.telegram.messenger.i0.L(28.0f), t6.w0(i20, p6Var));
            w6 N5 = a7.N(i20);
            linearLayout4.setBackground(d05);
            a7.k(linearLayout4, d05, N5, null, p6Var);
            g9 g9Var2 = new g9(context);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
            r8 r8Var2 = new r8((p6) null);
            linearLayout4.addView(g9Var2, b6.o(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            a7.V(textView6, i19, p6Var);
            if (j10 >= 0) {
                TLRPC.User Z12 = wp.r1(i10).Z1(Long.valueOf(j10));
                r8Var2.r(Z12);
                g9Var2.e(Z12, r8Var2);
                textView6.setText(i20.p(Z12));
                i15 = i20;
            } else {
                i15 = i20;
                TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
                r8Var2.q(L0);
                g9Var2.e(L0, r8Var2);
                if (L0 == null) {
                    str2 = "";
                } else {
                    str2 = L0.title;
                }
                textView6.setText(str2);
            }
            linearLayout4.addView(textView6, b6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            a7.t(imageView3, i14, p6Var, mode);
            imageView3.setImageResource(2131230873);
            linearLayout4.addView(imageView3, b6.t(-2, -2, 16, 2, 0, 5, 0));
            f11.addView(linearLayout4, b6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i15 = i20;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        a7.V(textView7, i19, p6Var);
        int L6 = org.telegram.messenger.i0.L(8.0f);
        int i24 = i15;
        int w02 = t6.w0(i24, p6Var);
        int w03 = t6.w0(i24, p6Var);
        int i25 = t6.f21021i6;
        int w9 = t6.w(w03, t6.w0(i25, p6Var));
        org.telegram.ui.Cells.y k02 = t6.k0(L6, L6, L6, L6, w02, w9, w9);
        w6 N6 = a7.N(i24);
        w6 q6 = a7.q(i24, i25);
        textView7.setBackground(k02);
        a7.k(textView7, k02, N6, q6, p6Var);
        textView7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.66f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.66f));
        String str3 = connectedbotstarref.url;
        if (str3 != null && str3.startsWith("https://")) {
            str = connectedbotstarref.url.substring(8);
        } else {
            str = connectedbotstarref.url;
        }
        textView7.setText(str);
        f11.addView(textView7, b6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        vh.d dVar = new vh.d(context, p6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new dq(2131232103, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) dd.L0(2131752492, null));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(dd.L0(2131752487, null), false, true);
        }
        f11.addView(dVar, b6.o(-1, 48));
        p80 p80Var = new p80(context, p6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            G3 = dd.a0(null, null, 2131752490, i20.p(Z1));
        } else {
            G3 = dd.G((int) j11, "ChannelAffiliateProgramLinkOpened", i20.p(Z1));
        }
        p80Var.setText(G3);
        p80Var.setGravity(17);
        p80Var.setTextSize(1, 12.0f);
        a7.V(p80Var, t6.B6, p6Var);
        a7.H(p80Var, t6.Uc, p6Var);
        f11.addView(p80Var, b6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
        z2Var2.N = f11;
        ox0 ox0Var = new ox0(connectedbotstarref, z2Var2, p6Var, Z1, 29);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new rh.s(ox0Var, 26));
        }
        s2 s2Var = new s2(connectedbotstarref, i10, z2Var2, context, j10, p6Var, ox0Var);
        org.telegram.ui.ActionBar.z2 z2Var3 = z2Var2;
        dVar.setOnClickListener(s2Var);
        z2Var3.setOnDismissListener(new jg.z(6));
        if (linearLayout2 != null) {
            rh.r.g(i10).n();
            rh.r.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            s2 s2Var2 = new s2(i10, z2Var3, p6Var, linearLayout5, j10, context, connectedbotstarref);
            z2Var3 = z2Var3;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(s2Var2);
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new rh.u1(13, z2Var3, connectedbotstarref2));
        z2Var3.Q(t6.f21002h5);
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (!org.telegram.messenger.i0.Q1() && T != null && !org.telegram.messenger.i0.u1(T)) {
            z2Var3.a0(T);
        }
        z2Var3.show();
        return z2Var3;
    }

    public final void I0(java.util.ArrayList r17, org.telegram.ui.Components.q51 r18) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z2.I0(java.util.ArrayList, org.telegram.ui.Components.q51):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        bn bnVar = new bn(context, 27);
        this.U = bnVar;
        a7.i(t6.f21020i5, bnVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        lg.q qVar = new lg.q(context, 1, 3);
        this.T = qVar;
        qVar.setImportantForAccessibility(4);
        lg.h hVar = this.T.f11920b;
        hVar.f11898z = t6.Tk;
        hVar.A = t6.Uk;
        hVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, b6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(dd.L0(2131752472, null), org.telegram.messenger.i0.W2(dd.L0(2131752473, null)), this.S, null);
        this.f40007c.setOnItemClickListener(new mg.q0(24, this, context));
        this.f40007c.setOnItemLongClickListener(new org.telegram.ui.web.k0(28, this, context));
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f40007c.setItemAnimator(jVar);
        this.f40007c.setOnScrollListener(new cu0(this, 29));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ph.o3 o3Var;
        int i12 = at.L3;
        long j10 = this.R;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                ph.o3 o3Var2 = this.V;
                if (o3Var2 != null) {
                    o3Var2.O(true);
                }
                rh.r.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == at.K3 && ((Long) objArr[0]).longValue() == j10 && (o3Var = this.V) != null) {
            o3Var.O(true);
        }
    }

    @Override
    public final s4.g0 k0() {
        ph.o3 o3Var = new ph.o3(this, this.f40007c, getParentActivity(), this.currentAccount, this.classGuid, new n1(this, 1), getResourceProvider(), 5);
        this.V = o3Var;
        return o3Var;
    }

    @Override
    public final kg.g2 m0() {
        kg.g gVar = new kg.g(getParentActivity(), 5);
        gVar.c();
        return gVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        at.f(this.currentAccount).c(this, at.L3);
        at.f(this.currentAccount).c(this, at.K3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        at.f(this.currentAccount).n(this, at.L3);
        at.f(this.currentAccount).n(this, at.K3);
    }

    @Override
    public final void onPause() {
        super.onPause();
        lg.q qVar = this.T;
        if (qVar != null) {
            qVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        lg.q qVar = this.T;
        if (qVar != null) {
            qVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }
}
