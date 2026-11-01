package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class re0 extends org.telegram.ui.Components.av0 {
    public final ImageView f41067a;
    public final vh.d f41068b;
    public final rh.v[] f41069c;
    public Bundle d;
    public String e;
    public boolean f41070f;
    public String h;
    public String f41071n;
    public long f41072r;
    public int f41073s;
    public final gf0 f41074w;

    public re0(gf0 gf0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        this.f41074w = gf0Var;
        this.f41069c = r4;
        this.f41073s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.i0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.b6.o(-1, 200));
        kg.g gVar = new kg.g(context, 3);
        frameLayout.addView(gVar, w7.b6.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f41067a = imageView;
        imageView.setImageResource(2131231245);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        p6Var = ((org.telegram.ui.ActionBar.k2) gf0Var).resourceProvider;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        frameLayout.addView(imageView, w7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        kg.h hVar = new kg.h(context, 1, 1, 3);
        hVar.setStarParticlesView(gVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i12 = org.telegram.ui.ActionBar.t6.Ak;
        canvas.drawColor(i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false)));
        hVar.setBackgroundBitmap(createBitmap);
        lg.h hVar2 = hVar.f11920b;
        hVar2.f11898z = i12;
        hVar2.A = org.telegram.ui.ActionBar.t6.zk;
        hVar2.b();
        frameLayout.addView(hVar, w7.b6.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.dd.L0(2131745983, null));
        org.telegram.messenger.m5.m(textView, i10, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        p6Var2 = ((org.telegram.ui.ActionBar.k2) gf0Var).resourceProvider;
        rh.v vVar = new rh.v(1, context, p6Var2);
        vVar.a(2131231832, org.telegram.messenger.dd.L0(2131745997, null), org.telegram.messenger.dd.L0(2131745999, null));
        addView(r4[0], w7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        p6Var3 = ((org.telegram.ui.ActionBar.k2) gf0Var).resourceProvider;
        rh.v vVar2 = new rh.v(1, context, p6Var3);
        vVar2.a(2131231795, org.telegram.messenger.dd.L0(2131745995, null), org.telegram.messenger.dd.L0(2131745996, null));
        addView(r4[1], w7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        p6Var4 = ((org.telegram.ui.ActionBar.k2) gf0Var).resourceProvider;
        rh.v vVar3 = new rh.v(1, context, p6Var4);
        rh.v[] vVarArr = {vVar, vVar2, vVar3};
        vVar3.a(2131231801, org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131745990, null), new me0(this, 1)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)), org.telegram.messenger.dd.L0(2131745994, null));
        addView(vVarArr[2], w7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), w7.b6.p(0, 0, 1.0f, 119));
        vh.d i13 = org.telegram.messenger.a30.i(24, context, null, true);
        this.f41068b = i13;
        i13.setLoading(true);
        addView(i13, w7.b6.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void n(org.telegram.ui.re0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re0.n(org.telegram.ui.re0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void g() {
        int i10;
        if (this.f41073s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.k2) this.f41074w).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41073s, true);
            this.f41073s = -1;
        }
        this.f41070f = false;
        this.f41068b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j10;
        int i10;
        boolean z11;
        String H;
        String H2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String i02 = org.telegram.messenger.dd.i0(2131750530, string);
        if (bundle == null) {
            string2 = null;
        } else {
            string2 = bundle.getString("product");
        }
        if (bundle == null) {
            string3 = null;
        } else {
            string3 = bundle.getString("phoneFormated");
        }
        if (bundle == null) {
            string4 = null;
        } else {
            string4 = bundle.getString("phoneHash");
        }
        if (bundle == null) {
            string5 = null;
        } else {
            string5 = bundle.getString("support_email_email");
        }
        if (bundle == null) {
            string6 = null;
        } else {
            string6 = bundle.getString("support_email_subject");
        }
        if (bundle == null) {
            string7 = null;
        } else {
            string7 = bundle.getString("currency");
        }
        if (bundle == null) {
            j10 = 0;
        } else {
            j10 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i10 = 0;
        } else {
            i10 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(i02);
        rh.v[] vVarArr = this.f41069c;
        if (isEmpty) {
            vVarArr[0].f47570c.setText(org.telegram.messenger.dd.L0(2131745999, null));
            z11 = false;
        } else {
            z11 = false;
            vVarArr[0].f47570c.setText(org.telegram.messenger.dd.a0(null, null, 2131745998, i02));
        }
        rh.v vVar = vVarArr[2];
        if (i10 == 7) {
            H = org.telegram.messenger.dd.L0(2131745994, null);
        } else {
            H = org.telegram.messenger.dd.H(',', "SMSFee3TextDays", i10);
        }
        vVar.setSubtitle(H);
        this.f41067a.setOnClickListener(new org.telegram.messenger.video.h(this, string5, string6, string3, 10));
        vh.d dVar = this.f41068b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (org.telegram.messenger.v2.b()) {
            if (!TextUtils.isEmpty(string7) && j10 > 0) {
                boolean z12 = z11;
                dVar.setVisibility(z12 ? 1 : 0);
                dVar.setLoading(z12);
                Object[] objArr = new Object[1];
                objArr[z12 ? 1 : 0] = org.telegram.messenger.u1.i().f(j10, string7);
                dVar.i(org.telegram.messenger.dd.a0(null, null, 2131745984, objArr), z12, true);
                if (i10 == 7) {
                    H2 = org.telegram.messenger.dd.L0(2131745988, null);
                } else {
                    H2 = org.telegram.messenger.dd.H(',', "SMSFeePurchaseTextDays", i10);
                }
                dVar.g(H2, z12);
                dVar.setOnClickListener(new ne0(this, string7, j10, string4, string3, i10));
                return;
            }
            boolean z13 = z11;
            dVar.setVisibility(z13 ? 1 : 0);
            dVar.setLoading(z13);
            dVar.setEnabled(z13);
            dVar.i(org.telegram.messenger.dd.L0(2131743938, null), z13, true);
            return;
        }
        int i11 = z11;
        String str = string4;
        int i12 = i10;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(i11);
        dVar.setLoading(true);
        i2.g1 g1Var = new i2.g1(this, string2, str, string3, i12, 18);
        if (!org.telegram.messenger.u1.i().k()) {
            org.telegram.messenger.u1.i().f18347i.add(g1Var);
        } else {
            g1Var.run();
        }
    }

    public final void o() {
        int i10;
        if (!this.f41070f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f41072r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f41071n;
        i10 = ((org.telegram.ui.ActionBar.k2) this.f41074w).currentAccount;
        this.f41073s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new k(this, 15), 1096);
    }
}
