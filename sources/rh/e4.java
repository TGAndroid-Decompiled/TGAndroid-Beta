package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.sl;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aj0;
import org.telegram.ui.d01;
import org.telegram.ui.mb;
import org.telegram.ui.no;
import org.telegram.ui.ox0;
import org.telegram.ui.sl0;
import org.telegram.ui.xv0;
import org.telegram.ui.zt;
public class e4 extends ha implements vs {
    public static final int f46811s3 = 0;
    public String A2;
    public TL_stars.TL_starGiftUnique B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public n3 H2;
    public boolean I2;
    public o2 J2;
    public final int[] K2;
    public kg.f L2;
    public int M2;
    public String N2;
    public ph.p3 O2;
    public final long P1;
    public dq P2;
    public final jg.b1 Q1;
    public boolean Q2;
    public final l2 R1;
    public h2 R2;
    public final xz S1;
    public Float S2;
    public final View T1;
    public f4.d T2;
    public ph.w0 U1;
    public ValueAnimator U2;
    public ph.w0 V1;
    public dq V2;
    public final n2 W1;
    public boolean W2;
    public final y3 X1;
    public TL_wallet.nftItem X2;
    public final m2 Y1;
    public org.telegram.ui.Wallet.i5 Y2;
    public final p80 Z1;
    public org.telegram.ui.Wallet.j5 Z2;
    public final xy0 a2;
    public TL_wallet.walletTransaction f46812a3;
    public final p80 f46813b2;
    public View f46814b3;
    public final vh.d f46815c2;
    public ph.u1 f46816c3;
    public final FrameLayout f46817d2;
    public boolean f46818d3;
    public final p80 f46819e2;
    public Boolean f46820e3;
    public final FrameLayout f46821f2;
    public boolean f46822f3;
    public final View f46823g2;
    public ArrayList f46824g3;
    public final FrameLayout f46825h2;
    public ArrayList f46826h3;
    public a4 f46827i2;
    public ArrayList f46828i3;
    public boolean f46829j2;
    public boolean f46830j3;
    public final m2 f46831k2;
    public TLRPC.PaymentForm f46832k3;
    public final xh.h[] f46833l2;
    public final dq[] f46834l3;
    public final View f46835m2;
    public final w0 f46836m3;
    public final LinearLayout f46837n2;
    public int f46838n3;
    public final ep f46839o2;
    public Boolean f46840o3;
    public final TextView f46841p2;
    public boolean f46842p3;
    public final LinearLayout f46843q2;
    public vh.p2 f46844q3;
    public final ep f46845r2;
    public View f46846r3;
    public boolean f46847s2;
    public final m2 f46848t2;
    public final TextView f46849u2;
    public final m2 f46850v2;
    public boolean f46851w2;
    public TL_stars.SavedStarGift f46852x2;
    public w5 f46853y2;
    public kj f46854z2;

    public e4(Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, View view) {
        super(context, null, false, false, p6Var);
        this.f46829j2 = false;
        this.K2 = new int[2];
        this.M2 = -1;
        this.N2 = "";
        this.T2 = new f4.d(0, 0);
        this.W2 = true;
        this.f46834l3 = new dq[1];
        this.f46836m3 = new w0(this, 11);
        this.f46842p3 = true;
        this.f21584a = i10;
        this.P1 = j10;
        this.f26730r1 = Math.max(0.05f, org.telegram.messenger.i0.L(82.0f) / (org.telegram.messenger.i0.f16172q.y + org.telegram.messenger.i0.f16166m));
        this.f21621x = true;
        this.f21587b = new org.telegram.ui.Components.voip.j0(this, context, 5);
        jg.b1 b1Var = new jg.b1(this, context);
        this.Q1 = b1Var;
        l2 l2Var = new l2(this, context);
        this.R1 = l2Var;
        l2Var.setAdapter(new mg.s(this, context, 9));
        v2();
        View view2 = new View(context);
        this.T1 = view2;
        int i11 = org.telegram.ui.ActionBar.t6.f21002h5;
        org.telegram.ui.ActionBar.a7.i(i11, view2, p6Var);
        FrameLayout.LayoutParams e = w7.b6.e(-1, 50, 80);
        int i12 = this.f21616t0;
        e.rightMargin = i12;
        e.leftMargin = i12;
        this.f21587b.addView(view2, e);
        this.f21587b.addView(l2Var, w7.b6.e(-1, -1, 119));
        Q(i11);
        org.telegram.messenger.i0.E2(this.f26724k1);
        b1Var.addView(this.f26724k1, w7.b6.e(-1, -1, 119));
        m2 m2Var = new m2(this, context, 0);
        this.Y1 = m2Var;
        m2Var.setOrientation(1);
        m2Var.setPadding(org.telegram.messenger.i0.L(14.0f) + this.f21616t0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f) + this.f21616t0, org.telegram.messenger.i0.L(68.0f));
        b1Var.addView(m2Var, w7.b6.e(-1, -1, 55));
        p80 p80Var = new p80(context, p6Var);
        this.Z1 = p80Var;
        int i13 = org.telegram.ui.ActionBar.t6.f21170q5;
        org.telegram.ui.ActionBar.a7.V(p80Var, i13, p6Var);
        p80Var.setTextSize(1, 12.0f);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setDisablePaddingsOffsetY(true);
        m2Var.addView(p80Var, w7.b6.t(-2, -2, 1, 4, -2, 4, 16));
        p80Var.setVisibility(8);
        xy0 xy0Var = new xy0(context, p6Var);
        this.a2 = xy0Var;
        m2Var.addView(xy0Var, w7.b6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        p80 p80Var2 = new p80(context, p6Var);
        this.f46813b2 = p80Var2;
        org.telegram.ui.ActionBar.a7.V(p80Var2, i13, p6Var);
        p80Var2.setTextSize(1, 12.0f);
        p80Var2.setGravity(17);
        p80Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        int i14 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.H(p80Var2, i14, p6Var);
        p80Var2.setDisablePaddingsOffsetY(true);
        p80Var2.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        m2Var.addView(p80Var2, w7.b6.t(-2, -2, 1, 4, 2, 4, 8));
        p80Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46843q2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout.setOrientation(0);
        int i15 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 21, 21);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, p6Var);
        ep epVar = new ep(24, context, p6Var);
        this.f46845r2 = epVar;
        int i16 = org.telegram.ui.ActionBar.t6.f21004h7;
        int i17 = org.telegram.ui.ActionBar.t6.f21040j7;
        int i18 = org.telegram.ui.ActionBar.t6.f21060k7;
        epVar.b(i16, i17, i18);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(epVar, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i19 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(textView, i19, p6Var);
        sc.e.u(textView, 1, 14.0f, null, 2131750398);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        m2Var.addView(linearLayout, w7.b6.t(-2, -2, 1, 0, -4, 0, 4));
        w7.e6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new v0(this, 19));
        linearLayout.setVisibility(8);
        m2 m2Var2 = new m2(this, context, 1);
        this.f46831k2 = m2Var2;
        m2Var2.setOrientation(1);
        m2Var2.setPadding(org.telegram.messenger.i0.L(4.0f) + this.f21616t0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(4.0f) + this.f21616t0, org.telegram.messenger.i0.L(66.0f));
        b1Var.addView(m2Var2, w7.b6.e(-1, -1, 55));
        this.f46833l2 = r8;
        xh.h hVar = new xh.h(context, p6Var, false);
        hVar.a(2131231820, dd.L0(2131749874, null), dd.L0(2131749584, null));
        m2Var2.addView(r8[0], w7.b6.o(-1, -2));
        xh.h hVar2 = new xh.h(context, p6Var, false);
        hVar2.a(2131231816, dd.L0(2131749868, null), dd.L0(2131749582, null));
        m2Var2.addView(r8[1], w7.b6.o(-1, -2));
        xh.h hVar3 = new xh.h(context, p6Var, false);
        xh.h[] hVarArr = {hVar, hVar2, hVar3};
        hVar3.a(2131231923, dd.L0(2131749579, null), dd.L0(2131749580, null));
        m2Var2.addView(hVarArr[2], w7.b6.o(-1, -2));
        View view3 = new View(context);
        this.f46835m2 = view3;
        int i20 = org.telegram.ui.ActionBar.t6.f20931d7;
        org.telegram.ui.ActionBar.a7.i(i20, view3, p6Var);
        m2Var2.addView(view3, w7.b6.n(1.0f / org.telegram.messenger.i0.f16171p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46837n2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 6, 6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.a7.k(linearLayout2, a03, null, N2, p6Var);
        ep epVar2 = new ep(24, context, p6Var);
        this.f46839o2 = epVar2;
        epVar2.b(i16, i17, i18);
        epVar2.setDrawUnchecked(true);
        epVar2.a(false, false);
        epVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(epVar2, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f46841p2 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i19, p6Var);
        sc.e.u(textView2, 1, 14.0f, null, 2131750406);
        linearLayout2.addView(textView2, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        m2Var2.addView(linearLayout2, w7.b6.t(-2, -2, 1, 0, 0, 0, 4));
        w7.e6.b(linearLayout2, 0.025f, 1.5f);
        m2 m2Var3 = new m2(this, context, 2);
        this.f46848t2 = m2Var3;
        m2Var3.setOrientation(1);
        m2Var3.setPadding(org.telegram.messenger.i0.L(4.0f) + this.f21616t0, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f) + this.f21616t0, org.telegram.messenger.i0.L(66.0f));
        b1Var.addView(m2Var3, w7.b6.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.f46849u2 = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i19, p6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        m2Var3.addView(textView3, w7.b6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView4, i19, p6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.m5.l(textView4, 17, null, 2131749843);
        m2Var3.addView(textView4, w7.b6.t(-1, -2, 7, 20, 6, 20, 24));
        xh.h hVar4 = new xh.h(context, p6Var, false);
        hVar4.a(2131231820, dd.L0(2131749849, null), dd.L0(2131749850, null));
        m2Var3.addView(r6[0], w7.b6.o(-1, -2));
        xh.h hVar5 = new xh.h(context, p6Var, false);
        hVar5.a(2131231798, dd.L0(2131749847, null), dd.L0(2131749848, null));
        m2Var3.addView(r6[1], w7.b6.o(-1, -2));
        xh.h hVar6 = new xh.h(context, p6Var, false);
        xh.h[] hVarArr2 = {hVar4, hVar5, hVar6};
        hVar6.a(2131231910, dd.L0(2131749845, null), dd.L0(2131749846, null));
        m2Var3.addView(hVarArr2[2], w7.b6.o(-1, -2));
        m2 m2Var4 = new m2(this, context, 3);
        this.f46850v2 = m2Var4;
        m2Var4.setOrientation(1);
        m2Var4.setPadding(org.telegram.messenger.i0.L(4.0f) + this.f21616t0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f) + this.f21616t0, org.telegram.messenger.i0.L(92.0f));
        b1Var.addView(m2Var4, w7.b6.e(-1, -1, 55));
        xh.h hVar7 = new xh.h(context, p6Var, false);
        hVar7.a(2131231820, dd.L0(2131749794, null), dd.L0(2131749795, null));
        m2Var4.addView(r8[0], w7.b6.o(-1, -2));
        xh.h hVar8 = new xh.h(context, p6Var, false);
        hVar8.a(2131231872, dd.L0(2131749792, null), dd.L0(2131749793, null));
        m2Var4.addView(r8[1], w7.b6.o(-1, -2));
        xh.h hVar9 = new xh.h(context, p6Var, false);
        xh.h[] hVarArr3 = {hVar7, hVar8, hVar9};
        hVar9.a(2131231794, dd.L0(2131749790, null), dd.L0(2131749791, null));
        m2Var4.addView(hVarArr3[2], w7.b6.o(-1, -2));
        m2Var.setAlpha(1.0f);
        m2Var2.setAlpha(0.0f);
        m2Var3.setAlpha(0.0f);
        m2Var4.setAlpha(0.0f);
        y3 y3Var = new y3(context, p6Var, new w0(this, 12), new v0(this, 20), new v0(this, 21), new v0(this, 22), new v0(this, 23), new v0(this, 24), new v0(this, 25), new v0(this, 26));
        this.X1 = y3Var;
        y3Var.M.f46675c.setOnClickListener(new v0(this, 17));
        int i21 = this.f21616t0;
        y3Var.setPadding(i21, 0, i21, 0);
        b1Var.addView(y3Var, w7.b6.e(-1, -2, 55));
        dh.f fVar = this.f26723j1;
        this.G1 = true;
        fVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46817d2 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(i11, frameLayout, p6Var);
        View view4 = new View(context);
        this.f46823g2 = view4;
        org.telegram.ui.ActionBar.a7.i(i20, view4, p6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.f16171p, 55));
        vh.d i22 = a30.i(24, context, p6Var, true);
        this.f46815c2 = i22;
        i22.i(dd.L0(2131747847, null), false, true);
        i22.g(null, false);
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.i0.L(14.0f) + this.f21616t0;
        d.rightMargin = org.telegram.messenger.i0.L(14.0f) + this.f21616t0;
        frameLayout.addView(i22, d);
        b1Var.addView(frameLayout, w7.b6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46821f2 = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(i11, frameLayout2, p6Var);
        p80 p80Var3 = new p80(context, null);
        this.f46819e2 = p80Var3;
        p80Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var3, i14, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var3, i14, p6Var);
        p80Var3.setGravity(17);
        frameLayout2.addView(p80Var3, w7.b6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        b1Var.addView(frameLayout2, w7.b6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.f26724k1.setOnScrollListener(new cu0(this, 18));
        linearLayout2.setOnClickListener(new v0(this, 18));
        xz xzVar = new xz(context);
        this.S1 = xzVar;
        b1Var.addView(xzVar, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f46825h2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.i0.L(6.0f) + this.f21616t0, 0, org.telegram.messenger.i0.L(6.0f) + this.f21616t0, 0);
        b1Var.addView(frameLayout3, w7.b6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.i0.E2(this.l1);
        b1Var.addView(this.l1, w7.b6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        n2 n2Var = new n2(context);
        this.W1 = n2Var;
        b1Var.addView(n2Var, w7.b6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.i0.m2(new ph.h1(n2Var, 10), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i0.a.k(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return dd.L0(2131750201, null);
        }
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return dd.L0(2131749628, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return dd.L0(2131749629, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return dd.L0(2131749631, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return dd.L0(2131749630, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i10 <= 0) {
                return "<0.1%";
            }
            return xh.i.J0(i10);
        } else {
            return "";
        }
    }

    public static boolean K1(int i10, long j10) {
        if (j10 >= 0) {
            if (e20.i(i10).e() == j10) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.w3.w(5, wp.r1(i10).L0(Long.valueOf(-j10)));
    }

    public static boolean L1(int i10, long j10) {
        if (j10 >= 0) {
            if (e20.i(i10).e() != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
        if (L0 == null || !L0.creator) {
            return false;
        }
        return true;
    }

    public static boolean M1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        int i11 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
        if (i11 == 0) {
            return false;
        }
        if (i11 > 0) {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(o10));
            if (Z1 != null) {
                TLRPC.EmojiStatus emojiStatus = Z1.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f20022id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-o10));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = L0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f20022id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c2(org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f20390a = true;
        T.showAsSheet(k2Var, obj);
    }

    public static void d1(e4 e4Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        u5 F;
        TLRPC.Message message;
        vh.d dVar = e4Var.f46815c2;
        if (!dVar.Q) {
            TL_stars.InputSavedStarGift B1 = e4Var.B1();
            kj kjVar = e4Var.f46854z2;
            if (kjVar != null && (message = kjVar.f16690k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z10 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z10 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = e4Var.f46852x2;
                if (savedStarGift != null) {
                    z10 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z12 = z10;
            dVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z12;
            savestargift.stargift = B1;
            if (e4Var.f46852x2 != null && (F = e6.y(e4Var.f21584a, false).F(e4Var.P1, false)) != null) {
                F.m(e4Var.f46852x2, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(e4Var.f21584a).sendRequest(savestargift, new oh.g(e4Var, z11, document2, z12, savestargift));
        }
    }

    public static void e1(final e4 e4Var) {
        int i10;
        long j10;
        long j11;
        long j12;
        String L0;
        final long e = e20.i(e4Var.f21584a).e();
        final TL_stars.InputSavedStarGift B1 = e4Var.B1();
        if (B1 != null) {
            kj kjVar = e4Var.f46854z2;
            if (kjVar != null) {
                i10 = kjVar.f16690k.date;
                boolean P3 = kjVar.P3();
                TLRPC.Message message = e4Var.f46854z2.f16690k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j12 = org.telegram.messenger.o5.o(peer);
                        } else if (P3) {
                            j12 = kj.B0(message);
                        } else {
                            j12 = e;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j10 = org.telegram.messenger.o5.o(peer2);
                        } else if (P3) {
                            j10 = e;
                        } else {
                            j10 = kj.B0(e4Var.f46854z2.f16690k);
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = e4Var.f46852x2;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = org.telegram.messenger.o5.o(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = e4Var.f46852x2.convert_stars;
                    j12 = e4Var.P1;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (wp.r1(e4Var.f21584a).F6 - (ConnectionsManager.getInstance(e4Var.f21584a).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
            String L02 = dd.L0(2131750235, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L02;
            if (!i20.A(j10) && j10 != 2666000) {
                L0 = org.telegram.messenger.o5.t(j10);
            } else {
                L0 = dd.L0(2131744967, null);
            }
            x1Var.T = org.telegram.messenger.i0.W2(dd.G(max, "Gift2ConvertText2", L0, dd.H(',', "Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(dd.L0(2131750242, null), new org.telegram.ui.ActionBar.u1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    e4 e4Var2 = e4.this;
                    TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                    long j15 = j14;
                    long j16 = e;
                    long j17 = j13;
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.f18945b, null);
                    x1Var3.r(500L);
                    TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                    convertstargift.stargift = inputSavedStarGift;
                    ConnectionsManager.getInstance(e4Var2.f21584a).sendRequest(convertstargift, new h1(e4Var2, x1Var3, j15, j16, j17));
                }
            });
            i0.a.s(null, 2131752589, alertDialog$Builder, null);
        }
    }

    public static void f1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            x1Var.dismiss();
            e4Var.G2 = true;
            e4Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        x1Var.dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            wb Q = cc.a0(T).Q(2131624011, 36, dd.L0(2131748567, null));
            Q.f32211t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new no(1), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void g1(e4 e4Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        e4Var.B2 = tL_starGiftUnique;
        e4Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new dq(2131231180, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new dq(2131231164, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static void h1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, kj kjVar) {
        x1Var.dismiss();
        e4Var.E2 = true;
        e4Var.i2(kjVar, null);
        super.show();
    }

    public static void i1(e4 e4Var, boolean z10) {
        int i10;
        Object obj;
        ph.w0 w0Var;
        ph.w0 w0Var2;
        ph.w0 w0Var3;
        int D1 = e4Var.D1();
        if (D1 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + D1;
            int i12 = e4Var.M2;
            if (i12 >= 0 && (!z10 ? i12 < D1 : i12 > D1)) {
                i11 = i12;
            }
            w5 w5Var = e4Var.f46853y2;
            if (w5Var != null && i11 >= 0 && i11 < w5Var.e()) {
                obj = e4Var.f46853y2.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    w0Var = e4Var.V1;
                } else {
                    w0Var = e4Var.U1;
                }
                if (w0Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            w0Var3 = e4Var.V1;
                        } else {
                            w0Var3 = e4Var.U1;
                        }
                        if (u1(w0Var3.f46852x2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            w0Var2 = e4Var.V1;
                        } else {
                            w0Var2 = e4Var.U1;
                        }
                        if (v1(w0Var2.B2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                ph.w0 w0Var4 = new ph.w0(e4Var, e4Var.getContext(), e4Var.f21584a, e4Var.P1, e4Var.I0, e4Var.Q1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    w0Var4.j2((TL_stars.SavedStarGift) obj, e4Var.f46853y2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    w0Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, e4Var.f46853y2);
                }
                org.telegram.messenger.i0.E2(w0Var4.f21587b);
                if (z10) {
                    e4Var.V1 = w0Var4;
                } else {
                    e4Var.U1 = w0Var4;
                }
            }
        }
    }

    public static void k1(xy0 xy0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String L0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            L0 = dd.L0(2131750396, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            L0 = dd.L0(2131750389, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            L0 = dd.L0(2131750397, null);
        } else {
            return;
        }
        String str = L0;
        Integer[] numArr = new Integer[1];
        xy0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean u1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f20022id == starGift2.f20022id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f20022id == starGift2.f20022id && savedStarGift.date == savedStarGift2.date) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean v1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f20022id == tL_starGiftUnique2.f20022id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final TL_stars.InputSavedStarGift B1() {
        TLRPC.Message message;
        long B0;
        TLRPC.Message message2;
        long B02;
        TLRPC.Message message3;
        long j10 = this.P1;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = wp.r1(this.f21584a).i1(j10);
            kj kjVar = this.f46854z2;
            if (kjVar != null && (message3 = kjVar.f16690k) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                } else if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
            }
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.B2 != null && !TextUtils.isEmpty(this.A2)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.A2;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        kj kjVar2 = this.f46854z2;
        if (kjVar2 != null && (message2 = kjVar2.f16690k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                wp r12 = wp.r1(this.f21584a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = org.telegram.messenger.o5.o(peer);
                } else {
                    B02 = kj.B0(this.f46854z2.f16690k);
                }
                tL_inputSavedStarGiftChat2.peer = r12.i1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (kjVar2 != null && (message = kjVar2.f16690k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                wp r13 = wp.r1(this.f21584a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = org.telegram.messenger.o5.o(peer2);
                } else {
                    B0 = kj.B0(this.f46854z2.f16690k);
                }
                tL_inputSavedStarGiftChat3.peer = r13.i1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        kj kjVar3 = this.f46854z2;
        if (kjVar3 != null) {
            TLRPC.Message message4 = kjVar3.f16690k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = kjVar3.f1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.f46852x2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.B2 != null && !TextUtils.isEmpty(this.A2)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.A2;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if ((y12 instanceof TL_stars.TL_starGiftUnique) && y12.slug != null) {
            return wp.r1(this.f21584a).U2 + "/nft/" + y12.slug;
        }
        return null;
    }

    public final int D1() {
        int indexOf;
        w5 w5Var = this.f46853y2;
        if (w5Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null) {
                indexOf = w5Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
                if (tL_starGiftUnique != null) {
                    indexOf = w5Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift y12 = y1();
            for (int i10 = 0; i10 < this.f46853y2.e(); i10++) {
                Object obj = this.f46853y2.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.f46852x2;
                    if (savedStarGift2 != null) {
                        if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (y12 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (y12 != starGift) {
                            if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.f20022id == starGift.f20022id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.B2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void E0(int i10) {
        super.E0(i10);
        org.telegram.messenger.i0.t3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z10) {
        int i10;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + D1;
        int i12 = this.M2;
        if (i12 >= 0 && (!z10 ? i12 < D1 : i12 > D1)) {
            i11 = i12;
        }
        w5 w5Var = this.f46853y2;
        if (w5Var != null && i11 >= 0 && i11 < w5Var.e()) {
            obj = this.f46853y2.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z10) {
        int i10;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + D1;
        int i12 = this.M2;
        if (i12 >= 0 && (!z10 ? i12 < D1 : i12 > D1)) {
            i11 = i12;
        }
        w5 w5Var = this.f46853y2;
        if (w5Var != null && i11 >= 0 && i11 < w5Var.e()) {
            obj = this.f46853y2.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    @Override
    public final boolean H() {
        if (this.T2.c(4)) {
            boolean z10 = this.X1.M.f46682h0;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override
    public final boolean I() {
        if (this.T2.c(4) && this.X1.M.f46682h0) {
            return false;
        }
        return this.f21591c0;
    }

    public final boolean I1(boolean z10) {
        if (E1(z10) == null && F1(z10) == null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        if (this.T2.c(4)) {
            boolean z10 = this.X1.M.f46682h0;
        }
        return false;
    }

    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, org.telegram.ui.Wallet.u1 u1Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (u1Var != null) {
                u1Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f46842p3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.f21584a).sendRequest(getstargiftwithdrawalurl, new org.telegram.messenger.s6(this, u1Var, twoStepVerificationActivity, z10, 6));
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        kg.f fVar = new kg.f(this, 9);
        this.L2 = fVar;
        return fVar;
    }

    @Override
    public final int N0() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    public final void N1() {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.N1():void");
    }

    @Override
    public final CharSequence O0() {
        return this.N2;
    }

    public final void O1() {
        h2 h2Var = this.R2;
        if (h2Var != null && !h2Var.I) {
            h2Var.dismiss();
        }
        String C1 = C1();
        h2 h2Var2 = new h2(this, getContext(), C1, C1, this.I0);
        this.R2 = h2Var2;
        h2Var2.f29480k2 = new r2.y(this, 2);
        h2Var2.show();
    }

    public final void P1() {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.P1():void");
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        int L2;
        int i14;
        int i15;
        int i16;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            cc.b0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.f21584a).sendRequest(new TL_account.getPassword(), new a2(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            cc.d0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String L0 = dd.L0(2131749909, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i17 = org.telegram.ui.ActionBar.t6.f21038j5;
            org.telegram.ui.ActionBar.a7.V(textView, i17, null);
            textView.setTextSize(1, 16.0f);
            if (dd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131749913, null)));
            linearLayout.addView(textView, w7.b6.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231624);
            if (dd.X) {
                i11 = org.telegram.messenger.i0.L(11.0f);
            } else {
                i11 = 0;
            }
            int L3 = org.telegram.messenger.i0.L(9.0f);
            if (dd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(11.0f);
            }
            imageView.setPadding(i11, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.t(imageView, i17, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.a7.V(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            if (dd.X) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            textView2.setText(org.telegram.messenger.i0.W2(dd.L0(2131749912, null)));
            if (dd.X) {
                linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                linearLayout2.addView(textView2, w7.b6.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231624);
            if (dd.X) {
                i13 = org.telegram.messenger.i0.L(11.0f);
            } else {
                i13 = 0;
            }
            int L4 = org.telegram.messenger.i0.L(9.0f);
            if (dd.X) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.i0.L(11.0f);
            }
            imageView2.setPadding(i13, L4, L2, 0);
            org.telegram.ui.ActionBar.a7.t(imageView2, i17, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.a7.V(textView3, i17, null);
            textView3.setTextSize(1, 16.0f);
            if (dd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            textView3.setText(org.telegram.messenger.i0.W2(dd.L0(2131749911, null)));
            if (dd.X) {
                linearLayout3.addView(textView3, w7.b6.o(-1, -2));
                i15 = 5;
                linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
            } else {
                i15 = 5;
                linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
                linearLayout3.addView(textView3, w7.b6.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(dd.L0(2131749908, null), new org.telegram.utils.twidget.t(this, 27));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.a7.V(textView4, i17, null);
                textView4.setTextSize(1, 16.0f);
                if (dd.X) {
                    i16 = i15;
                } else {
                    i16 = 3;
                }
                org.telegram.messenger.m5.l(textView4, i16 | 48, null, 2131749910);
                linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(dd.L0(2131747847, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(x1Var);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.R1():void");
    }

    public final void S1() {
        if (e20.i(this.f21584a).q() && (M1(this.f21584a, H1()) || this.Q2)) {
            t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.f46849u2.setText(dd.a0(null, null, 2131749842, i0.a.k(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131749844, null));
        if (!e20.i(this.f21584a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new dq(2131232242, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        vh.d dVar = this.f46815c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new v0(this, 4));
        this.X1.setWearPreview(wp.r1(this.f21584a).d2(o10));
        s2(2, true, null);
    }

    public final void T1(boolean z10) {
        int i10;
        kj kjVar = this.f46854z2;
        int i11 = 0;
        if (kjVar != null) {
            TLRPC.Message message = kjVar.f16690k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        if (i10 > ConnectionsManager.getInstance(this.f21584a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String L0 = dd.L0(2131749786, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = dd.a0(null, null, 2131749787, dd.x(i10, true));
            i0.a.w(null, 2131747847, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.I0);
            String L02 = dd.L0(2131749801, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
            x1Var2.R = L02;
            x1Var2.T = dd.L0(2131749802, null);
            i0.a.w(null, 2131747847, alertDialog$Builder2, null);
            return;
        }
        y3 y3Var = this.X1;
        if (z10) {
            y3Var.M.a(this.f21584a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                b3 b3Var = y3Var.M;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    b3Var.getClass();
                } else {
                    while (true) {
                        z2[] z2VarArr = b3Var.f46687n;
                        if (i11 >= z2VarArr.length) {
                            break;
                        }
                        z2 z2Var = z2VarArr[i11];
                        TL_stars.StarGift starGift = z2Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            z2Var.a(H12, true);
                            break;
                        }
                        i11++;
                    }
                    b3Var.d(true);
                }
            }
        }
        b3 b3Var2 = y3Var.M;
        b3 b3Var3 = y3Var.M;
        b3Var2.setOnCraft(new b1(this, 1));
        if (this.O2 == null) {
            ph.p3 p3Var = new ph.p3(this.f21584a, H1.gift_id);
            this.O2 = p3Var;
            p3Var.a();
        }
        b3Var3.setOnAddGift(new d2(this, H1, 1));
        b3Var3.setOnClose(new w0(this, 23));
        s2(4, true, null);
    }

    public final void U1(long j10) {
        vh.p2 p2Var = this.f46844q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.f46844q3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null && !i20.A(j10)) {
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == e20.i(this.f21584a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            T.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void V1(boolean z10, gf.e eVar, Runnable runnable) {
        int i10;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        ag.v0 v0Var = new ag.v0(this, twoStepVerificationActivity, z10, 11);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.f34136b0 = v0Var;
        twoStepVerificationActivity.f34134a0 = z1();
        twoStepVerificationActivity.x0(new v41(this, runnable, eVar, twoStepVerificationActivity));
    }

    public final void W1() {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.W1():void");
    }

    public final void X1(long j10, long j11, boolean z10, r20 r20Var) {
        String str;
        TLRPC.User user;
        String a02;
        CharSequence L0;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User Z1 = wp.r1(this.f21584a).Z1(Long.valueOf(j10));
            str = i20.k(Z1);
            user = Z1;
        } else {
            TLRPC.Chat L02 = wp.r1(this.f21584a).L0(Long.valueOf(-j10));
            if (L02 == null) {
                str = "";
                user = L02;
            } else {
                str = L02.title;
                user = L02;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new d3(getContext(), H1, user), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, this.I0);
        textView.setTextSize(1, 16.0f);
        if (j11 > 0) {
            a02 = dd.K("Gift2TransferPriceText", (int) j11, ',', z1(), org.telegram.messenger.o5.t(j10));
        } else {
            a02 = dd.a0(null, null, 2131749922, z1(), str);
        }
        textView.setText(org.telegram.messenger.i0.W2(a02));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        xy0 xy0Var = new xy0(getContext(), this.I0);
        k1(xy0Var, e6.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(xy0Var, e6.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(xy0Var, e6.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
            long j12 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.u1.i().h(H1.value_currency);
            i10.getClass();
            xy0Var.c(dd.L0(2131749600, null), sc.e.h("~", org.telegram.messenger.u1.g(str2, h, j12, true)), null, null);
        }
        linearLayout.addView(xy0Var, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        alertDialog$Builder.o(linearLayout);
        if (j11 > 0) {
            L0 = h8.T0(dd.a0(null, null, 2131749929, Integer.valueOf((int) j11)));
        } else {
            L0 = dd.L0(2131749930, null);
        }
        alertDialog$Builder.k(L0, new d0(r20Var, 1));
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.Z0 = z10;
        x1Var.show();
    }

    public final void Y1(long j10, r20 r20Var) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.f46852x2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j11 = savedStarGift.transfer_stars;
        } else {
            kj kjVar = this.f46854z2;
            if (kjVar != null && (message = kjVar.f16690k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j11 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        X1(j10, j11, true, r20Var);
    }

    @Override
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i10;
        vh.p2 p2Var = this.f46844q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.f46844q3 = null;
        }
        if (this.U2 == null && (B1 = B1()) != null) {
            kj kjVar = this.f46854z2;
            long j13 = this.P1;
            if (kjVar != null) {
                TLRPC.MessageAction messageAction = kjVar.f16690k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f20022id;
                    j12 = tL_messageActionStarGift.upgrade_stars;
                    z10 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j10 = 0;
                    z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (org.telegram.messenger.o5.o(tL_messageActionStarGift.from_id) != this.f46854z2.Z0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.f46852x2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j11 = starGift.f20022id;
                    j12 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j13 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.f46852x2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f46841p2;
            if (z10) {
                if (z12) {
                    i10 = 2131750407;
                } else {
                    i10 = 2131750408;
                }
                textView.setText(dd.L0(i10, null));
            } else if (z11) {
                textView.setText(dd.L0(2131750405, null));
            } else {
                textView.setText(dd.L0(2131750406, null));
            }
            if (!z10 && j12 > j10 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            ep epVar = this.f46839o2;
            epVar.a(z14, false);
            ArrayList arrayList = this.f46824g3;
            if (arrayList != null && (j12 > j10 || this.f46832k3 != null)) {
                a2();
                return;
            }
            if (arrayList == null) {
                e6.y(this.f21584a, false).K(j11, new w1(this, 2));
            }
            if (j12 <= j10 && this.f46832k3 == null) {
                this.f46830j3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = wp.r1(this.f21584a).i1(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = epVar.f25895a.f23920q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u10 = xh.m2.u(this.I0, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_payments_getPaymentForm, new f2(this, 0));
            }
        }
    }

    public final void a2() {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.a2():void");
    }

    public final void b2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.X2 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            Context context = getContext();
            int i10 = this.f21584a;
            mg.i2[] i2VarArr = {new mg.i2(context, i10, org.telegram.messenger.y1.a(i10).b(), 3, this.I0)};
            mg.i2 i2Var = i2VarArr[0];
            i2Var.f13155r2 = dd.L0(2131749923, null);
            da daVar = i2Var.l1;
            if (daVar != null) {
                daVar.setTitle(i2Var.O0());
            }
            mg.e2 e2Var = i2Var.T1;
            if (e2Var != null) {
                e2Var.setText(i2Var.O0());
            }
            mg.i2 i2Var2 = i2VarArr[0];
            i2Var2.f13162y2 = true;
            i2Var2.o1(false, true);
            mg.i2 i2Var3 = i2VarArr[0];
            i2Var3.f13157t2 = new d01(27, this, i2VarArr);
            i2Var3.show();
        }
    }

    public final SpannableStringBuilder d2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.o5.r(wp.r1(this.f21584a).d2(org.telegram.messenger.o5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.i0.T2(dd.a0(null, null, 2131750052, sc.e.h("@", r10)), new x1(this, r10, 8));
            }
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.G3) {
            if (this.f46853y2 == ((v5) objArr[1])) {
                b3 b3Var = this.X1.M;
                if (b3Var == null || !b3Var.f46682h0) {
                    v2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.T2.c(4) && this.X1.M.f46682h0) {
            return;
        }
        ph.p3 p3Var = this.O2;
        if (p3Var != null) {
            p3Var.b();
            this.O2 = null;
        }
        n3 n3Var = this.H2;
        if (n3Var != null) {
            n3Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return d2(starGift.released_by);
        }
        return null;
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w5 w5Var) {
        boolean z10;
        boolean z11;
        n3 n3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.A2 = str;
        this.B2 = tL_starGiftUnique;
        this.f46853y2 = w5Var;
        if (tL_starGiftUnique.resell_amount != null && !K1(this.f21584a, org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C2 = z10;
        if (!this.I2 && (n3Var = this.H2) != null && n3Var.f47255o && (tL_starGiftUnique2 = n3Var.f47252l) != null && tL_starGiftUnique2.f20022id != tL_starGiftUnique.f20022id) {
            n3Var.a();
            this.H2 = null;
            y3 y3Var = this.X1;
            y3Var.f47730b.setAlpha(1.0f);
            y3Var.f47732c.setAlpha(0.0f);
        }
        this.W1.b(this.f21584a, this.f46852x2);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f46812a3;
        p80 p80Var = this.Z1;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(dd.L0(2131750190, null), new x1(this, str3, 3)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            p80Var.setVisibility(0);
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21170q5, this.I0);
        } else {
            p80Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f46812a3;
        p80 p80Var2 = this.f46813b2;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(dd.L0(2131750190, null), new x1(this, str3, 4)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
            p80Var2.setVisibility(0);
        } else {
            p80Var2.setVisibility(8);
        }
        w2();
        if (this.C2) {
            l2(tL_starGiftUnique);
            this.f46815c2.setOnClickListener(new v0(this, 12));
        }
        if (this.W2) {
            s2(0, false, null);
            this.f26723j1.n0(1);
            this.W2 = false;
        }
        v2();
    }

    public final void i2(org.telegram.messenger.kj r59, rh.w5 r60) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.i2(org.telegram.messenger.kj, rh.w5):void");
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String L0;
        boolean z10;
        n3 n3Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        e4 e4Var;
        ox0 ox0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            L0 = dd.L0(2131750396, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            L0 = dd.L0(2131750389, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            L0 = dd.L0(2131750397, null);
            z10 = false;
        } else {
            return;
        }
        if (!this.I2 && ((n3Var = this.H2) == null || !n3Var.f47255o)) {
            boolean[] zArr = new boolean[1];
            ec[] ecVarArr = new ec[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                e4Var = this;
                ox0Var = new ox0(this, zArr, starGiftAttribute2, ecVarArr, 17);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                e4Var = this;
                ox0Var = null;
            }
            ecVarArr[0] = (ec) ((uy0) e4Var.a2.e(L0, starGiftAttribute2.name, G1, ox0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        s3 s3Var = new s3(getContext(), this.I0, new b1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        xy0 xy0Var = this.a2;
        tableRow.addView(new wy0(xy0Var, L0), layoutParams);
        tableRow.addView(new uy0(xy0Var, s3Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        xy0Var.addView(tableRow);
        n3 n3Var2 = this.H2;
        if (n3Var2 != null) {
            if (!z10) {
                n3Var2.d = s3Var;
            }
            if (z10) {
                n3Var2.f47246c = s3Var;
            }
            if (z10) {
                n3Var2.f47245b = s3Var;
            }
        }
    }

    public final void j2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, rh.w5 r37) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.j2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, rh.w5):void");
    }

    @Override
    public cc k() {
        return new cc(this.f46825h2, this.I0);
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r36, boolean r37, org.telegram.tgnet.TLObject r38, org.telegram.tgnet.TLRPC.TL_textWithEntities r39) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l1(LinearLayout linearLayout, int i10, int i11, int i12, String str, boolean z10) {
        int i13;
        int i14;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i10);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i12, p6Var, mode);
        if (i11 < 15) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i11 < 15) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        linearLayout.addView(imageView, w7.b6.t(i11, i11, 16, i13, 0, i14, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i15 = org.telegram.ui.ActionBar.t6.f21186r5;
        org.telegram.ui.ActionBar.a7.V(textView, i15, this.I0);
        textView.setText(str);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232249);
            org.telegram.ui.ActionBar.a7.t(imageView2, i15, this.I0, mode);
            linearLayout.addView(imageView2, w7.b6.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        sf.a resellAmount = tL_starGiftUnique.getResellAmount(sf.b.f48267a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        vh.d dVar = this.f46815c2;
        if (z10) {
            dVar.i(h8.s1(h8.V0(dd.a0(null, null, 2131746163, tL_starGiftUnique.getResellAmount(sf.b.f48268b).d()), true), true), !this.W2, true);
            dVar.g(h8.T0(dd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.W2);
            return;
        }
        dVar.i(h8.T0(dd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.W2, true);
        dVar.g(null, !this.W2);
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            e6.y(this.f21584a, false).P(x1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.I2 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.f46852x2;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f19815id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.f46853y2);
                    this.f46824g3 = null;
                    this.I2 = false;
                    w5 w5Var = this.f46853y2;
                    if (w5Var != null) {
                        w5Var.d();
                    } else {
                        e6.y(this.f21584a, false).P(this.P1);
                    }
                    org.telegram.messenger.i0.g3(runnable);
                    return;
                }
            }
            if (this.f46853y2 == null) {
                e6.y(this.f21584a, false).P(x1());
            }
            this.I2 = true;
            this.f46852x2 = null;
            this.f46851w2 = false;
            kj kjVar = new kj(this.f21584a, message, false, false);
            kjVar.K5();
            i2(kjVar, this.f46853y2);
            this.f46824g3 = null;
            this.I2 = false;
            org.telegram.messenger.i0.g3(runnable);
            return;
        }
        e6.y(this.f21584a, false).P(x1());
        dismiss();
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = e20.i(this.f21584a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.X1.setWalletDisplayed(z10);
        w2();
    }

    public final boolean n1() {
        int i10;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        kj kjVar = this.f46854z2;
        if (kjVar != null) {
            TLRPC.MessageAction messageAction = kjVar.f16690k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean P3 = kjVar.P3();
                if (kj.B0(this.f46854z2.f16690k) == e20.i(this.f21584a).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = wp.r1(this.f21584a).F6 - (ConnectionsManager.getInstance(this.f21584a).getCurrentTime() - this.f46854z2.f16690k.date);
                if (((z10 || (P3 && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !L1(this.f21584a, org.telegram.messenger.o5.o(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null) {
                int currentTime2 = wp.r1(this.f21584a).F6 - (ConnectionsManager.getInstance(this.f21584a).getCurrentTime() - savedStarGift.date);
                int i11 = this.f21584a;
                long j10 = this.P1;
                if (L1(i11, j10)) {
                    int i12 = this.f46852x2.flags;
                    if (j10 < 0) {
                        i10 = 2048;
                    } else {
                        i10 = 8;
                    }
                    if ((i10 & i12) != 0 && (i12 & 16) != 0 && (i12 & 2) != 0 && currentTime2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.f46849u2.setText(dd.a0(null, null, 2131749842, i0.a.k(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131749844, null));
        if (o10 == e20.i(this.f21584a).e() && !e20.i(this.f21584a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new dq(2131232242, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        vh.d dVar = this.f46815c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new v0(this, 27));
        this.X1.setWearPreview(wp.r1(this.f21584a).d2(o10));
        s2(2, false, null);
        this.f46847s2 = true;
    }

    public final boolean o1() {
        int i10;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.f21584a, org.telegram.messenger.o5.o(H1.owner_id))) {
            return false;
        }
        kj kjVar = this.f46854z2;
        if (kjVar != null) {
            TLRPC.Message message = kjVar.f16690k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.f21584a).getCurrentTime();
        if (i10 <= 0 || currentTime < i10) {
            return false;
        }
        return true;
    }

    public final void o2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null && H1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = B1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u10 = xh.m2.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_payments_getPaymentForm, new mb(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 13));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.f21584a).c(this, at.G3);
    }

    @Override
    public final void onBackPressed() {
        y3 y3Var;
        b3 b3Var;
        if (this.T2.c(4) && (y3Var = this.X1) != null && (b3Var = y3Var.M) != null) {
            if (b3Var.f46682h0) {
                return;
            }
            if (b3Var.f46683i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f46847s2 && this.T2.f6825b > 0 && !this.f46815c2.Q && !this.f46822f3) {
            kj kjVar = this.f46854z2;
            if (kjVar != null) {
                i2(kjVar, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f46852x2;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.f46853y2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
                    if (tL_starGiftUnique != null) {
                        h2(this.A2, tL_starGiftUnique, this.f46853y2);
                    }
                }
            }
            s2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f21584a).n(this, at.G3);
    }

    public final boolean p1() {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.p1():boolean");
    }

    public final void p2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        fc fcVar;
        float primaryHorizontal;
        int i10;
        vh.p2 p2Var = this.f46844q3;
        if ((p2Var == null || !p2Var.V || this.f46846r3 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.u5) {
                    org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) view;
                    primaryHorizontal = (u5Var.getRightDrawableWidth() / 2.0f) + u5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.u5) {
                    layout = ((org.telegram.ui.ActionBar.u5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        fc[] fcVarArr = (fc[]) spanned.getSpans(0, spanned.length(), fc.class);
                        if (fcVarArr != null && fcVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(fcVarArr[fcVarArr.length - 1])) + view.getPaddingLeft() + (fcVar.a() / 2.0f);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(r5);
            jg.b1 b1Var = this.Q1;
            b1Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            vh.p2 p2Var2 = this.f46844q3;
            if (p2Var2 != null) {
                p2Var2.e(true);
                this.f46844q3 = null;
            }
            vh.p2 p2Var3 = new vh.p2(getContext(), 3);
            p2Var3.p(!z10);
            p2Var3.s(charSequence);
            p2Var3.m(0.0f, (iArr2[0] + primaryHorizontal) - (org.telegram.messenger.i0.L(16.0f) + this.f21616t0));
            float L = (iArr2[1] - org.telegram.messenger.i0.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            p2Var3.setTranslationY(L + org.telegram.messenger.i0.L(i10 + 4.33f));
            p2Var3.d = 3000L;
            p2Var3.setPadding(org.telegram.messenger.i0.L(16.0f) + this.f21616t0, 0, org.telegram.messenger.i0.L(16.0f) + this.f21616t0, 0);
            p2Var3.f51755l0 = new ph.p(p2Var3, 1);
            p2Var3.u();
            b1Var.addView(p2Var3, w7.b6.c(100.0f, -1));
            this.f46844q3 = p2Var3;
            this.f46846r3 = view;
        }
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String L0 = dd.L0(2131750275, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = dd.L0(2131750276, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(dd.L0(2131747821, null), new c2(this, H1, 1));
        }
        i0.a.s(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(64.0f);
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i13, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout, L2, N, null, p6Var);
        f7.addView(frameLayout, w7.b6.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624289, 42, 42, null);
        frameLayout.addView((View) imageView, w7.b6.r(64, 64, 17));
        imageView.d();
        TextView b10 = w7.g6.b(context, 20.0f, org.telegram.ui.ActionBar.t6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i11 = 2131750014;
        } else {
            i11 = 2131749920;
        }
        b10.setText(dd.L0(i11, null));
        f7.addView(b10, w7.b6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i12 = 2131750015;
        } else {
            i12 = 2131749921;
        }
        b11.setText(dd.a0(null, null, i12, dd.c0(Math.max(10, i10))));
        f7.addView(b11, w7.b6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.I0);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(dd.L0(2131747847, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final void r0() {
        vh.p2 p2Var = this.f46844q3;
        if (p2Var != null) {
            p2Var.e(true);
            this.f46844q3 = null;
        }
    }

    public final void r1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, gf.e eVar, mg.i2 i2Var) {
        TL_wallet.nftItem nftitem = this.X2;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            eVar.d();
            sl slVar = new sl(this, eVar, i2Var, j10, H1, nftitem, 2);
            if (stargiftdepositpayload != null) {
                slVar.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = wp.r1(this.f21584a).i1(j10);
            depositstargift.slug = H1.slug;
            ConnectionsManager.getInstance(this.f21584a).sendRequestTyped(depositstargift, new a3.b(1), new aj0(this, eVar, i2Var, slVar, 3));
        }
    }

    public final void r2(boolean z10, org.telegram.ui.ActionBar.x1 x1Var, gf.e eVar, Runnable runnable) {
        eVar.d();
        e20 i10 = e20.i(this.f21584a);
        TL_account.tmpPassword tmppassword = i10.f15534y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.f21584a).getCurrentTime() + 60) {
            i10.f15534y = null;
            i10.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i10.f15534y;
        if (tmppassword2 == null) {
            V1(z10, eVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z10, new org.telegram.ui.Wallet.u1(this, z10, eVar, runnable, x1Var));
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            Q(org.telegram.ui.ActionBar.t6.f21002h5);
            y3 y3Var = this.X1;
            if (y3Var != null) {
                y3Var.l();
            }
            dq dqVar = this.V2;
            if (dqVar != null) {
                Drawable drawable = dqVar.f25565c;
                if (drawable instanceof z3) {
                    ((z3) drawable).d.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0));
                    vh.d dVar = this.f46815c2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s1(final long j10, final r20 r20Var) {
        TLRPC.Message message;
        long o10;
        long j11;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j11 = savedStarGift.transfer_stars;
                o10 = this.P1;
            } else {
                kj kjVar = this.f46854z2;
                if (kjVar != null && (message = kjVar.f16690k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        o10 = org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.gift.owner_id);
                        j11 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (j11 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = B1;
                transferstargift.to_id = wp.r1(this.f21584a).i1(j10);
                final long j12 = o10;
                ConnectionsManager.getInstance(this.f21584a).sendRequest(transferstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z10 = tLObject instanceof TLRPC.Updates;
                        e4 e4Var = e4.this;
                        if (z10) {
                            wp.r1(e4Var.f21584a).L3((TLRPC.Updates) tLObject, false);
                        }
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.n0(e4Var, r20Var, tL_error, tLObject, j10, j12));
                    }
                });
                return;
            }
            final long j13 = o10;
            e6 y3 = e6.y(this.f21584a, false);
            if (!y3.e) {
                y3.r(new ag.a3(this, y3, j10, r20Var, 15));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = B1;
            tL_inputInvoiceStarGiftTransfer.to_id = wp.r1(this.f21584a).i1(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u10 = xh.m2.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final e4 e4Var = e4.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j14 = j10;
                    final long j15 = j13;
                    final r20 r20Var2 = r20Var;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            TLObject tLObject2 = tLObject;
                            boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                            e4 e4Var2 = e4.this;
                            r20 r20Var3 = r20Var2;
                            if (z10) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                int i10 = 0;
                                wp.r1(e4Var2.f21584a).V3(paymentForm.users, false);
                                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                                tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer2;
                                ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                                int size = arrayList.size();
                                long j16 = 0;
                                while (i10 < size) {
                                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                    i10++;
                                    j16 += tL_labeledPrice.amount;
                                }
                                ConnectionsManager.getInstance(e4Var2.f21584a).sendRequest(tL_payments_sendStarsForm, new h1(e4Var2, j14, j15, r20Var3, j16));
                                return;
                            }
                            TLRPC.TL_error tL_error2 = tL_error;
                            r20Var3.a(tL_error2);
                            wb Y = e4Var2.k().Y(tL_error2);
                            Y.f32211t = true;
                            Y.j();
                        }
                    });
                }
            });
        }
    }

    public final void s2(int r12, boolean r13, org.telegram.ui.xv0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: rh.e4.s2(int, boolean, org.telegram.ui.xv0):void");
    }

    @Override
    public final void show() {
        kj kjVar;
        TLRPC.Message message;
        if (wp.r1(this.f21584a).u2()) {
            org.telegram.ui.b.b(this.f21584a);
            return;
        }
        if (this.A2 != null && this.B2 == null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
            x1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.A2;
            ConnectionsManager.getInstance(this.f21584a).sendRequest(getuniquestargift, new sl0(25, this, x1Var));
        } else if (this.f46852x2 == null && (kjVar = this.f46854z2) != null && (message = kjVar.f16690k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
                        x1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f19890id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_messages_getMessages, new ag.p0(this, tL_messageActionStarGift, x1Var2, 18));
                        return;
                    } else if (B1() != null) {
                        org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, getContext(), null);
                        x1Var3.r(500L);
                        e6.y(this.f21584a, false).M(B1(), new d01(28, this, x1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        vh.d dVar = this.f46815c2;
        if (!dVar.Q && (B1 = B1()) != null) {
            kj kjVar = this.f46854z2;
            String str = null;
            long j11 = 0;
            if (kjVar != null) {
                TLRPC.MessageAction messageAction = kjVar.f16690k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f46852x2;
                if (savedStarGift != null) {
                    j10 = savedStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0 || this.f46832k3 != null) {
                dVar.setLoading(true);
                ep epVar = this.f46839o2;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = epVar.f25895a.f23920q;
                    upgradestargift.stargift = B1;
                    ConnectionsManager.getInstance(this.f21584a).sendRequest(upgradestargift, new sl0(27, this, B1));
                    return;
                }
                int i11 = 0;
                e6 y3 = e6.y(this.f21584a, false);
                if (!y3.e) {
                    y3.r(new n(5, this, y3));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f46832k3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = wp.r1(this.f21584a).i1(this.P1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = epVar.f25895a.f23920q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f46832k3.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_payments_sendStarsForm, new c70(this, str, B1, j11, 3));
            }
        }
    }

    public final void t2(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        wp.d1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.f21584a, H1());
        boolean z12 = !M1;
        boolean M12 = M1(this.f21584a, H1());
        vh.d dVar = this.f46815c2;
        if (M12) {
            wp.r1(this.f21584a).d5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long x12 = x1();
            if (x12 >= 0) {
                if (!e20.i(this.f21584a).q()) {
                    wb P = k().P(2131624214, org.telegram.messenger.i0.x2(dd.L0(2131750432, null), new w0(this, 2)));
                    P.f32211t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                wp r12 = wp.r1(this.f21584a);
                dVar.setLoading(true);
                wp.r1(this.f21584a).G0().a(x12, new zt(this, r12, x12, 3));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.f20022id;
            wp.r1(this.f21584a).d5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        ph.k kVar = this.X1.I[1];
        if (!M1) {
            i10 = 2131231102;
        } else {
            i10 = 2131231103;
        }
        if (!M1) {
            i11 = 2131750431;
        } else {
            i11 = 2131750434;
        }
        kVar.b(i10, dd.L0(i11, null), true);
        if (this.f46847s2) {
            dismiss();
            return;
        }
        xv0 xv0Var = new xv0(6, this, z11);
        if (this.T2.c(0)) {
            xv0Var.run();
        } else {
            s2(0, true, xv0Var);
        }
        dVar.i(dd.L0(2131747847, null), !this.W2, true);
        dVar.g(null, !this.W2);
        dVar.setOnClickListener(new v0(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.f46821f2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f46825h2;
        FrameLayout frameLayout3 = this.f46817d2;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.T2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final void v2() {
        boolean I1 = I1(false);
        l2 l2Var = this.R1;
        l2Var.setPosition(I1 ? 1 : 0);
        l2Var.D(false);
        if (this.f46853y2 != null && !I1(true) && this.f46853y2.e() < this.f46853y2.c()) {
            this.f46853y2.b();
        }
    }

    public final int w1() {
        if (this.T2.d(1)) {
            return this.f46831k2.getMeasuredHeight();
        }
        if (this.T2.d(2)) {
            return this.f46848t2.getMeasuredHeight();
        }
        if (this.T2.d(3)) {
            return this.f46850v2.getMeasuredHeight();
        }
        if (this.T2.d(4)) {
            return 0;
        }
        return this.Y1.getMeasuredHeight();
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.X2;
        LinearLayout linearLayout = this.f46843q2;
        if (nftitem != null && H1 != null) {
            this.Z1.setVisibility(8);
            this.f46813b2.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (H1.host_id != null) {
                z10 = true;
            }
            this.f46845r2.a(z10, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final long x1() {
        TLRPC.Peer peer;
        kj kjVar = this.f46854z2;
        if (kjVar != null) {
            TLRPC.Message message = kjVar.f16690k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return org.telegram.messenger.o5.o(peer2);
                    }
                    if (kjVar.P3()) {
                        return kj.B0(this.f46854z2.f16690k);
                    }
                    return e20.i(this.f21584a).e();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return org.telegram.messenger.o5.o(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return org.telegram.messenger.o5.o(peer3);
                    }
                    return 0L;
                } else {
                    return 0L;
                }
            }
            return 0L;
        }
        TL_stars.SavedStarGift savedStarGift = this.f46852x2;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return org.telegram.messenger.o5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.P1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
        if (tL_starGiftUnique != null) {
            return org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift y1() {
        kj kjVar = this.f46854z2;
        if (kjVar != null) {
            TLRPC.Message message = kjVar.f16690k;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f46852x2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String z1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) y12;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i0.a.k(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }
}
