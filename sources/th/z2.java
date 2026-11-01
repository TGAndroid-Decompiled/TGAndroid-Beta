package th;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.uz;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pd;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.cl0;
import org.telegram.ui.hk;
import org.telegram.ui.ky;
import org.telegram.ui.mb0;
import org.telegram.ui.nc;
import org.telegram.ui.ps0;
import org.telegram.ui.tk;
import org.telegram.ui.un;
import org.telegram.ui.yw0;
import rh.h8;
public abstract class z2 extends vu0 implements vs {
    public org.telegram.ui.Components.e6 A0;
    public boolean A1;
    public long A2;
    public final i1 A3;
    public org.telegram.ui.Components.t5 B0;
    public e5 B1;
    public boolean B2;
    public final ArrayList B3;
    public org.telegram.ui.Components.t5 C0;
    public boolean C1;
    public boolean C2;
    public final ArrayList C3;
    public boolean D0;
    public boolean D1;
    public boolean D2;
    public boolean D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public long F0;
    public b2 F1;
    public q30 F2;
    public final ew F3;
    public long G0;
    public a G1;
    public final ps0 G2;
    public final org.telegram.ui.Components.t5 G3;
    public boolean H0;
    public d1 H1;
    public boolean H2;
    public final org.telegram.ui.Components.t5 H3;
    public boolean I0;
    public e1 I1;
    public z1 I2;
    public final org.telegram.ui.Components.t5 I3;
    public boolean J0;
    public a1 J1;
    public FrameLayout J2;
    public float J3;
    public boolean K0;
    public t1 K1;
    public cl0 K2;
    public final Path K3;
    public final g2 L0;
    public bh.k L1;
    public boolean L2;
    public boolean L3;
    public final FrameLayout M0;
    public vh.p2 M1;
    public v1 M2;
    public ValueAnimator M3;
    public final ag.c2 N0;
    public ValueAnimator N1;
    public float N2;
    public float N3;
    public final ImageReceiver O0;
    public nj0 O1;
    public boolean O2;
    public final ImageReceiver P0;
    public LinearLayout P1;
    public boolean P2;
    public final ArrayList Q0;
    public TextView Q1;
    public boolean Q2;
    public Runnable R0;
    public TextView R1;
    public boolean R2;
    public final e2 S0;
    public o6 S1;
    public boolean S2;
    public final ky T0;
    public ViewPropertyAnimator T1;
    public boolean T2;
    public e3 U0;
    public final vg.f U1;
    public final ImageReceiver U2;
    public float V0;
    public final vg.f V1;
    public sg.d V2;
    public final r8 W0;
    public final Paint W1;
    public final ImageReceiver W2;
    public final w2 X0;
    public int X1;
    public org.telegram.ui.Components.f5 X2;
    public final p6 Y0;
    public ValueAnimator Y1;
    public boolean Y2;
    public j6.m Z0;
    public float Z1;
    public boolean Z2;
    public int f49705a1;
    public float a2;
    public nj0 f49706a3;
    public org.telegram.ui.ActionBar.b1 f49707b1;
    public float f49708b2;
    public boolean f49709b3;
    public u2 f49710c1;
    public int f49711c2;
    public float f49712c3;
    public TL_stories.PeerStories f49713d1;
    public boolean f49714d2;
    public boolean f49715d3;
    public final ArrayList f49716e1;
    public boolean f49717e2;
    public float f49718e3;
    public final ImageView f49719f0;
    public final ArrayList f49720f1;
    public boolean f49721f2;
    public int f49722f3;
    public final ImageView f49723g0;
    public final x2 f49724g1;
    public boolean f49725g2;
    public int f49726g3;
    public final bg0 f49727h0;
    public final rf.b0 f49728h1;
    public int f49729h2;
    public int f49730h3;
    public final fi0 f49731i0;
    public ArrayList f49732i1;
    public final int f49733i2;
    public i1 f49734i3;
    public final ImageView f49735j0;
    public int f49736j1;
    public TextView f49737j2;
    public float f49738j3;
    public final org.telegram.ui.ActionBar.p6 f49739k0;
    public long f49740k1;
    public oh.b f49741k2;
    public boolean f49742k3;
    public final t6 f49743l0;
    public boolean l1;
    public int f49744l2;
    public li.k f49745l3;
    public final b2 m0;
    public boolean f49746m1;
    public int f49747m2;
    public org.telegram.ui.ActionBar.b1 f49748m3;
    public j5 f49749n0;
    public boolean f49750n1;
    public boolean f49751n2;
    public org.telegram.ui.ActionBar.b1 f49752n3;
    public vh.p2 f49753o0;
    public boolean f49754o1;
    public ih.c f49755o2;
    public final tg.b f49756o3;
    public vh.p2 f49757p0;
    public boolean f49758p1;
    public boolean f49759p2;
    public final hi.a f49760p3;
    public vh.p2 f49761q0;
    public long f49762q1;
    public float f49763q2;
    public final hi.f f49764q3;
    public int f49765r0;
    public final float f49766r1;
    public ag.v f49767r2;
    public final wg.b f49768r3;
    public final o7 f49769s0;
    public int f49770s1;
    public e50 f49771s2;
    public TL_stories.TL_premium_boostsStatus f49772s3;
    public final k2 f49773t0;
    public boolean f49774t1;
    public int f49775t2;
    public org.telegram.messenger.h3 f49776t3;
    public final p1 f49777u0;
    public int f49778u1;
    public boolean f49779u2;
    public long f49780u3;
    public final View f49781v0;
    public int f49782v1;
    public final k2.t0 f49783v2;
    public long f49784v3;
    public final ImageView f49785w0;
    public int f49786w1;
    public final e2.f f49787w2;
    public boolean f49788w3;
    public final LinearLayout f49789x0;
    public final y2 f49790x1;
    public final org.telegram.ui.Components.t5 f49791x2;
    public TLRPC.TL_channels_sendAsPeers f49792x3;
    public final b2 f49793y0;
    public final j2.f f49794y1;
    public final org.telegram.ui.Components.t5 f49795y2;
    public final i1 y3;
    public org.telegram.ui.Components.e6 f49796z0;
    public v2 f49797z1;
    public float f49798z2;
    public int f49799z3;

    public z2(Context context, final o7 o7Var, x2 x2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null);
        this.K0 = true;
        this.Q0 = new ArrayList();
        this.f49705a1 = -5;
        this.f49766r1 = 1.0f;
        y2 y2Var = new y2(this);
        this.f49790x1 = y2Var;
        this.Z1 = -1.0f;
        this.a2 = -1.0f;
        this.f49708b2 = -1.0f;
        this.f49733i2 = ConnectionsManager.generateClassGuid();
        this.f49791x2 = new org.telegram.ui.Components.t5(this);
        this.f49795y2 = new org.telegram.ui.Components.t5(this);
        ps0 ps0Var = new ps0();
        this.G2 = ps0Var;
        this.N2 = 1.0f;
        this.y3 = new i1(this, 4);
        this.A3 = new i1(this, 11);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new ew(this, 27);
        this.G3 = new org.telegram.ui.Components.t5(this);
        this.H3 = new org.telegram.ui.Components.t5(this);
        this.I3 = new org.telegram.ui.Components.t5(this);
        this.K3 = new Path();
        ps0Var.E = new s9.g(this);
        ?? obj = new Object();
        obj.f10771g = new ArrayList();
        this.f49783v2 = obj;
        this.f49787w2 = new e2.f((int[]) null);
        this.f49716e1 = new ArrayList();
        this.f49720f1 = new ArrayList();
        ag.c2 c2Var = new ag.c2(this, 7);
        this.N0 = c2Var;
        c2Var.A0 = false;
        c2Var.f14425z1 = true;
        c2Var.f14421y = true;
        c2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U2 = imageReceiver;
        imageReceiver.f14425z1 = true;
        imageReceiver.f14421y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.W2 = imageReceiver2;
        imageReceiver2.f14425z1 = true;
        imageReceiver2.f14421y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.O0 = imageReceiver3;
        imageReceiver3.f14425z1 = true;
        imageReceiver3.f14421y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.P0 = imageReceiver4;
        imageReceiver4.f14425z1 = true;
        imageReceiver4.f14421y = true;
        imageReceiver4.h0(0);
        c2Var.f14366a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.W0 = new r8((org.telegram.ui.ActionBar.p6) null);
        this.f49769s0 = o7Var;
        this.f49724g1 = x2Var;
        this.f49794y1 = x2Var.f49615g;
        this.B1 = wp.r1(e20.f15506s0).O1();
        x2Var.f49619l.setColor(-16777216);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f49739k0 = p6Var;
        setClipChildren(false);
        e2 e2Var = new e2(this, context, this.L0, p6Var, o7Var);
        this.S0 = e2Var;
        wg.b bVar = new wg.b(p6Var, org.telegram.ui.ActionBar.t6.Ge, 0.8f);
        this.f49768r3 = bVar;
        hi.c cVar = new hi.c();
        cVar.a(i0.b.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && uz.e()) {
            hi.f fVar = new hi.f(cVar);
            this.f49764q3 = fVar;
            fVar.l(org.telegram.messenger.i0.L(8.0f));
            this.f49760p3 = fVar;
        } else {
            this.f49764q3 = null;
            this.f49760p3 = cVar;
        }
        zg.h hVar = new zg.h(this);
        hi.a aVar = this.f49760p3;
        tg.b bVar2 = new tg.b(aVar, aVar, aVar);
        bVar2.h = hVar;
        bVar2.f48713i = this;
        this.f49756o3 = bVar2;
        this.U1 = bVar2.c(this, bVar, false);
        vg.f c10 = bVar2.c(this, bVar, false);
        this.V1 = c10;
        c10.t(org.telegram.messenger.i0.L(32.0f));
        g2 g2Var = new g2(this, context, x2Var, o7Var);
        this.L0 = g2Var;
        g2Var.setClipChildren(false);
        this.T0 = new ky(this.f49744l2, g2Var);
        g2Var.addView(e2Var, w7.b6.c(-1.0f, -1));
        k2 k2Var = new k2(this, getContext(), o7Var.D, o7Var, p6Var);
        this.f49773t0 = k2Var;
        k2Var.f49127b0.setOnClickListener(new k1(this, 10));
        ImageView imageView = new ImageView(context);
        this.f49785w0 = imageView;
        imageView.setImageDrawable(x2Var.f49620m);
        int L = org.telegram.messenger.i0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new k1(this, 11));
        imageView.setContentDescription(dd.L0(2131745477, null));
        w7.e6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(x2Var.f49621n);
        imageView2.setPadding(L, L, L, L);
        b2 b2Var = new b2(this, getContext(), 1);
        this.f49793y0 = b2Var;
        org.telegram.ui.Components.e6 e6Var = this.A0;
        if (e6Var != null) {
            e6Var.setCallback(b2Var);
        }
        b2Var.setWillNotDraw(false);
        b2Var.setOnClickListener(new k1(this, 12));
        b2 b2Var2 = new b2(this, getContext(), 2);
        this.m0 = b2Var2;
        org.telegram.ui.Components.e6 e6Var2 = this.f49796z0;
        if (e6Var2 != null) {
            e6Var2.setCallback(b2Var2);
        }
        b2Var2.setWillNotDraw(false);
        b2Var2.setOnClickListener(new k1(this, 13));
        b2Var2.setOnLongClickListener(new org.telegram.ui.Components.b0(7, this, o7Var));
        j5 j5Var = new j5(context, x2Var);
        this.f49749n0 = j5Var;
        j5Var.setPadding(L, L, L, L);
        b2Var2.addView(this.f49749n0, w7.b6.e(40, 40, 3));
        b2Var.addView(imageView2, w7.b6.e(40, 40, 3));
        w7.e6.b(b2Var2, 0.3f, 5.0f);
        w7.e6.b(b2Var, 0.3f, 5.0f);
        c2Var.f14425z1 = true;
        c2Var.H0(g2Var);
        rf.b0 b0Var = new rf.b0(10);
        this.f49728h1 = b0Var;
        g2Var.setOutlineProvider(b0Var);
        g2Var.setClipToOutline(true);
        addView(g2Var);
        w2 w2Var = new w2(context, y2Var);
        this.X0 = w2Var;
        w2Var.setOnClickListener(new View.OnClickListener(this) {
            public final z2 f49001b;

            {
                this.f49001b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                int i11 = r3;
                o7 o7Var2 = o7Var;
                z2 z2Var = this.f49001b;
                switch (i11) {
                    case 0:
                        long j10 = e20.i(z2Var.f49744l2).f15524n;
                        long j11 = z2Var.f49740k1;
                        if (j10 == j11) {
                            Bundle i12 = org.telegram.ui.Cells.f1.i(1, "type");
                            i12.putLong("dialog_id", z2Var.f49740k1);
                            o7Var2.V(new n90(i12, null));
                            return;
                        } else if (j11 > 0) {
                            o7Var2.V(ProfileActivity.A4(j11));
                            return;
                        } else {
                            o7Var2.V(un.ma(j11));
                            return;
                        }
                    default:
                        if (z2Var.f49790x1.j()) {
                            o7Var2.c0();
                            if (!o7.D1) {
                                wp.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bg0 bg0Var = z2Var.f49727h0;
                            if (!o7.D1) {
                                i10 = 2131748329;
                            } else {
                                i10 = 2131743874;
                            }
                            bg0Var.setContentDescription(dd.L0(i10, null));
                            return;
                        }
                        z2Var.a1(true);
                        return;
                }
            }
        });
        g2Var.addView(w2Var, w7.b6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.M0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49789x0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.b6.r(40, 40, 5));
        linearLayout.addView(b2Var, w7.b6.r(40, 40, 5));
        linearLayout.addView(b2Var2, w7.b6.r(40, 40, 5));
        addView(linearLayout, w7.b6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f49719f0 = imageView3;
        imageView3.setImageDrawable(x2Var.f49624q);
        imageView3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(-1, 1, -1));
        imageView3.setContentDescription(dd.L0(2131754839, null));
        g2Var.addView(imageView3, w7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f49723g0 = imageView4;
        imageView4.setImageDrawable(x2Var.f49625r);
        imageView4.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.t6.h0(-1, 1, -1));
        imageView4.setContentDescription(dd.L0(2131754808, null));
        g2Var.addView(imageView4, w7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new rh.s(o7Var, 12));
        imageView3.setOnClickListener(new bi.c(this, p6Var, o7Var, context, x2Var, 13));
        bg0 bg0Var = new bg0(context, 20);
        this.f49727h0 = bg0Var;
        g2Var.addView(bg0Var, w7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f49731i0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        bg0Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f49735j0 = imageView6;
        imageView6.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        imageView6.setImageDrawable(x2Var.f49627t);
        bg0Var.addView(imageView6);
        imageView6.setVisibility(8);
        t6 t6Var = new t6(context);
        this.f49743l0 = t6Var;
        t6Var.setOnClickListener(new k1(this, 2));
        g2Var.addView(t6Var, w7.b6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        bg0Var.setOnClickListener(new View.OnClickListener(this) {
            public final z2 f49001b;

            {
                this.f49001b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                int i11 = r3;
                o7 o7Var2 = o7Var;
                z2 z2Var = this.f49001b;
                switch (i11) {
                    case 0:
                        long j10 = e20.i(z2Var.f49744l2).f15524n;
                        long j11 = z2Var.f49740k1;
                        if (j10 == j11) {
                            Bundle i12 = org.telegram.ui.Cells.f1.i(1, "type");
                            i12.putLong("dialog_id", z2Var.f49740k1);
                            o7Var2.V(new n90(i12, null));
                            return;
                        } else if (j11 > 0) {
                            o7Var2.V(ProfileActivity.A4(j11));
                            return;
                        } else {
                            o7Var2.V(un.ma(j11));
                            return;
                        }
                    default:
                        if (z2Var.f49790x1.j()) {
                            o7Var2.c0();
                            if (!o7.D1) {
                                wp.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bg0 bg0Var2 = z2Var.f49727h0;
                            if (!o7.D1) {
                                i10 = 2131748329;
                            } else {
                                i10 = 2131743874;
                            }
                            bg0Var2.setContentDescription(dd.L0(i10, null));
                            return;
                        }
                        z2Var.a1(true);
                        return;
                }
            }
        });
        this.Y0 = new p6(this, x2Var);
        g2Var.addView(k2Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f49781v0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        p1 p1Var = new p1(this, context, o7Var, o7Var.f49353w, view, frameLayout, o7Var);
        this.f49777u0 = p1Var;
        g2Var.addView(view, w7.b6.e(-1, 200, 87));
        g2Var.addView(p1Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        g2Var.addView(frameLayout, w7.b6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.i0.L(20.0f);
        int o10 = i0.b.o(-1, 100);
        bg0Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o10, o10));
        int L3 = org.telegram.messenger.i0.L(20.0f);
        int o11 = i0.b.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o11, o11));
        int L4 = org.telegram.messenger.i0.L(20.0f);
        int o12 = i0.b.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.t6.k0(L4, L4, L4, L4, 0, o12, o12));
        int L5 = org.telegram.messenger.i0.L(20.0f);
        int o13 = i0.b.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.k0(L5, L5, L5, L5, 0, o13, o13));
        int L6 = org.telegram.messenger.i0.L(20.0f);
        int o14 = i0.b.o(-1, 100);
        b2Var2.setBackground(org.telegram.ui.ActionBar.t6.k0(L6, L6, L6, L6, 0, o14, o14));
        int L7 = org.telegram.messenger.i0.L(20.0f);
        int o15 = i0.b.o(-1, 100);
        b2Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L7, L7, L7, L7, 0, o15, o15));
        t9 t9Var = k2Var.W;
        View n10 = t9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.i0.E2(n10);
            addView(n10);
        }
        t9Var.D = new tk(this, 2);
        t9Var.S(this);
    }

    public static void T0(d5 d5Var, ImageReceiver imageReceiver, String str) {
        if (d5Var.f48896s) {
            imageReceiver.u0(null, null, jc.g(d5Var.f48893f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(jc.g(d5Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(z2 z2Var, ValueAnimator valueAnimator) {
        float f7;
        t6 t6Var = z2Var.f49743l0;
        z2Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w2 w2Var = z2Var.X0;
        w2Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        w2Var.setAlpha(1.0f - z2Var.N3);
        ImageView imageView = z2Var.f49719f0;
        imageView.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        imageView.setAlpha(1.0f - z2Var.N3);
        ImageView imageView2 = z2Var.f49723g0;
        imageView2.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        imageView2.setAlpha(1.0f - z2Var.N3);
        bg0 bg0Var = z2Var.f49727h0;
        bg0Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
        bg0Var.setAlpha((1.0f - z2Var.N3) * z2Var.N2);
        b2 b2Var = z2Var.F1;
        if (b2Var != null) {
            b2Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * z2Var.N3);
            z2Var.F1.setAlpha(1.0f - z2Var.N3);
        }
        if (t6Var != null) {
            t6Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var.N3);
            t6Var.setAlpha(1.0f - z2Var.N3);
        }
        z2Var.f49773t0.setAlpha(1.0f - z2Var.N3);
        v2 v2Var = z2Var.f49797z1;
        if (v2Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((f7) v2Var).d.V;
        }
        float hideInterfaceAlpha = z2Var.getHideInterfaceAlpha();
        b2 b2Var2 = z2Var.m0;
        if (b2Var2 != null) {
            b2Var2.setAlpha((1.0f - z2Var.N3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = z2Var.f49785w0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - z2Var.N3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        b2 b2Var3 = z2Var.f49793y0;
        if (b2Var3 != null) {
            b2Var3.setAlpha((1.0f - z2Var.N3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        t1 t1Var = z2Var.K1;
        if (t1Var != null) {
            t1Var.setAlpha(1.0f - z2Var.N3);
            z2Var.invalidate();
        }
        z2Var.L0.invalidate();
    }

    public static void Y(z2 z2Var, boolean z10) {
        org.telegram.ui.ActionBar.b1 b1Var = z2Var.f49748m3;
        if (b1Var != null && z2Var.f49745l3 != null && b1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(o7.B1 - 0.2f) < 0.05f) {
                    z2Var.f49748m3.setSubtext(dd.L0(2131743600, null));
                } else if (Math.abs(o7.B1 - 0.5f) < 0.05f) {
                    z2Var.f49748m3.setSubtext(dd.L0(2131743602, null));
                } else if (Math.abs(o7.B1 - 1.0f) < 0.05f) {
                    z2Var.f49748m3.setSubtext(dd.L0(2131743603, null));
                } else if (Math.abs(o7.B1 - 1.5f) < 0.05f) {
                    z2Var.f49748m3.setSubtext(dd.L0(2131743604, null));
                } else if (Math.abs(o7.B1 - 2.0f) < 0.05f) {
                    z2Var.f49748m3.setSubtext(dd.L0(2131743601, null));
                } else {
                    org.telegram.ui.ActionBar.b1 b1Var2 = z2Var.f49748m3;
                    b1Var2.setSubtext(dd.a0(null, null, 2131743605, jh.g.a(o7.B1) + "x"));
                }
            }
            z2Var.f49745l3.L(z10, o7.B1);
        }
    }

    public static void Z(z2 z2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!z2Var.G0() && !z2Var.f49790x1.f49678f) {
            if (e20.i(z2Var.f49744l2).q()) {
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232392, dd.L0(2131744905, null), false, z2Var.f49739k0).setOnClickListener(new k1(z2Var, 8));
                return;
            }
            Drawable drawable = z2Var.getContext().getDrawable(2131232168);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            yw0 yw0Var = new yw0(z2Var.getContext().getDrawable(2131232380), drawable, 2);
            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232392, dd.L0(2131744905, null), false, z2Var.f49739k0);
            c10.setOnClickListener(new k1(z2Var, 9));
            c10.setIcon(yw0Var);
        }
    }

    public static void b0(z2 z2Var) {
        y2 y2Var = z2Var.f49790x1;
        TL_stories.StoryItem storyItem = y2Var.f49675a;
        if ((storyItem == null && y2Var.f49676b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = y2Var.h();
        boolean z10 = y2Var.e;
        if (h != null && h.exists()) {
            MediaController.d0(h.toString(), z2Var.getContext(), z10 ? 1 : 0, null, null, new nc(8, z2Var, z10));
            return;
        }
        z2Var.Y0();
    }

    public static void c0(z2 z2Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User Z1 = wp.r1(z2Var.f49744l2).Z1(Long.valueOf(j10));
            str = Z1.first_name;
            z10 = Z1.stories_hidden;
            user = Z1;
        } else {
            TLRPC.Chat L0 = wp.r1(z2Var.f49744l2).L0(Long.valueOf(-j10));
            str = L0.title;
            z10 = L0.stories_hidden;
            user = L0;
        }
        org.telegram.messenger.i0.h3(new hf(z2Var, wp.r1(z2Var.f49744l2), j10, !z10, str, user), 200L);
    }

    public static void d0(z2 z2Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z2Var.getContext(), z2Var.f49739k0);
        if (z2Var.G0()) {
            i10 = 2131751565;
        } else {
            i10 = 2131751488;
        }
        String L0 = dd.L0(i10, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        if (z2Var.G0()) {
            i11 = 2131751566;
        } else {
            i11 = 2131751489;
        }
        x1Var.T = dd.L0(i11, null);
        alertDialog$Builder.k(dd.L0(2131751599, null), new f1(z2Var, 2));
        alertDialog$Builder.h(dd.L0(2131752589, null), new m1(0));
        ((f7) z2Var.f49797z1).h(x1Var);
        x1Var.i();
    }

    public static void f0(z2 z2Var) {
        String str;
        wb K;
        org.telegram.ui.ActionBar.p6 p6Var = z2Var.f49739k0;
        g2 g2Var = z2Var.L0;
        if (z2Var.f49758p1) {
            return;
        }
        if (z2Var.f49750n1) {
            if (z2Var.f49772s3 != null && z2Var.f49776t3 != null) {
                kg.q0.w1(new kg.q1(z2Var, 10), z2Var.f49772s3, z2Var.f49776t3, z2Var.f49740k1, true);
                return;
            }
            o7 o7Var = z2Var.f49769s0;
            if (o7Var != null) {
                o7Var.f49329k1 = true;
                o7Var.d0();
            }
            wp.r1(z2Var.f49744l2).G0().a(z2Var.f49740k1, new l1(z2Var, 0));
            return;
        }
        t1 t1Var = z2Var.K1;
        int i10 = -z2Var.f49705a1;
        z2Var.f49705a1 = i10;
        org.telegram.messenger.i0.F3(i10, t1Var, null);
        org.telegram.messenger.t2.APP_ERROR.a();
        if (z2Var.f49740k1 >= 0) {
            str = i20.p(wp.r1(z2Var.f49744l2).Z1(Long.valueOf(z2Var.f49740k1)));
        } else {
            str = "";
        }
        if (wp.r1(z2Var.f49744l2).A3()) {
            K = new cc(g2Var, p6Var).Q(2131624214, 36, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131743784, str)));
        } else {
            K = new cc(g2Var, p6Var).K(2131624214, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131743784, str)), dd.L0(2131743785, null), new i1(z2Var, 5));
        }
        K.j();
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.f49744l2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.f49791x2.f30530c;
        f4 f4Var = this.f49769s0.f49356x;
        if (f4Var == null) {
            f7 = 0.0f;
        } else {
            f7 = f4Var.f48978f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        o7 o7Var;
        if (!this.f49790x1.f49678f || (o7Var = this.f49769s0) == null || o7Var.A0 == null || B0(true)) {
            return 0L;
        }
        return o7Var.A0.j();
    }

    public static void h0(z2 z2Var) {
        y2 y2Var = z2Var.f49790x1;
        if (y2Var.f49675a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f20037id = y2Var.f49675a.f20032id;
        tL_stories_exportStoryLink.peer = wp.r1(z2Var.f49744l2).i1(z2Var.f49740k1);
        ConnectionsManager.getInstance(z2Var.f49744l2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.J2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(dd.L0(2131744479, null));
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f49739k0;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        TextView textView2 = new TextView(getContext());
        w7.e6.a(textView2);
        textView2.setText(dd.L0(2131754230, null));
        int i11 = org.telegram.ui.ActionBar.t6.Gi;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
        textView2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView2, k02, N, h, p6Var);
        textView2.setOnClickListener(new k1(this, 3));
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        linearLayout.addView(textView2, w7.b6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.b6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.L0.addView(frameLayout);
        this.J2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        s0 s0Var;
        TLRPC.Peer i10;
        s0 s0Var2;
        long e = e20.i(this.f49744l2).e();
        int i11 = (this.f49740k1 > 0L ? 1 : (this.f49740k1 == 0L ? 0 : -1));
        o7 o7Var = this.f49769s0;
        if (i11 < 0 && (s0Var2 = o7Var.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = s0Var2.i();
                TLRPC.Chat L0 = wp.r1(this.f49744l2).L0(Long.valueOf(-this.f49740k1));
                if (o7Var.A0.l() || org.telegram.messenger.w3.w(14, L0)) {
                    if (i12 == null || this.f49740k1 == org.telegram.messenger.o5.o(i12) || org.telegram.messenger.o5.o(i12) == e20.i(this.f49744l2).e()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && o7Var != null && (s0Var = o7Var.A0) != null && s0Var.l()) {
            if (!z10 || (i10 = o7Var.A0.i()) == null || this.f49740k1 == org.telegram.messenger.o5.o(i10) || org.telegram.messenger.o5.o(i10) == e || this.f49740k1 == e) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        k2.t0 t0Var = this.f49783v2;
        org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) t0Var.e;
        if (k4Var != null && ((SurfaceView) t0Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.i0.z0((SurfaceView) t0Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (k4Var != null && (textureView = (TextureView) t0Var.f10770f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            g2 g2Var = this.L0;
            canvas.scale(i10 / g2Var.getMeasuredWidth(), i11 / g2Var.getMeasuredHeight());
            this.N0.h(canvas, null);
            canvas.restore();
        }
    }

    public final void D0(vh.u6 u6Var, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        v2 v2Var = this.f49797z1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        vh.w6 w6Var = new vh.w6(i10, context, this.f49739k0);
        w6Var.W0(u6Var);
        hk hkVar = w6Var.f52118i1;
        if (hkVar != null) {
            for (View view : hkVar.getViewPages()) {
                if (view instanceof vh.r6) {
                    ((vh.r6) view).f(false);
                }
            }
        }
        w6Var.Q0(true);
        w6Var.K1 = new org.telegram.ui.web.k0(18, this, storyItem);
        ((f7) v2Var).h(w6Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: th.z2.E0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        g2 g2Var = this.L0;
        float x11 = view.getX() + g2Var.getX() + x10;
        float y3 = view.getY() + g2Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean G0() {
        x4 x4Var;
        o7 o7Var = this.f49769s0;
        if (o7Var != null && (x4Var = o7Var.O0) != null && x4Var.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User Z1;
        if (!G0() || (Z1 = wp.r1(this.f49744l2).Z1(Long.valueOf(this.f49769s0.O0.d))) == null || !Z1.bot || !Z1.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean I0();

    public final void J0(sg.o0 o0Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        y2 y2Var = this.f49790x1;
        TL_stories.StoryItem storyItem = y2Var.f49675a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && o0Var == null) {
            j0();
            this.B1.j0(this.f49740k1, y2Var.f49675a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(this.f49744l2).f18670r.get("❤");
            if (tL_availableReaction != null) {
                this.Y2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = sg.k0.a();
                jc b10 = jc.b(document);
                ImageReceiver imageReceiver = this.U2;
                imageReceiver.q0(b10, a2, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.Z2 = true;
                this.B1.j0(this.f49740k1, y2Var.f49675a, sg.o0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.B1.j0(this.f49740k1, y2Var.f49675a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = y2Var.f49675a;
        b2 b2Var = this.m0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.f49749n0.setReaction(sg.o0.d(reaction));
            b2Var.setContentDescription(dd.L0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.f49749n0.setReaction(null);
            b2Var.setContentDescription(dd.L0(2131754851, null));
            z11 = false;
        }
        if (this.f49746m1 && z10) {
            TL_stories.StoryItem storyItem3 = y2Var.f49675a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = y2Var.f49675a.views;
            int i11 = storyViews.reactions_count;
            if (z11) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i12 = i11 + i10;
            storyViews.reactions_count = i12;
            if (i12 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = y2Var.f49675a;
        sg.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        s0 s0Var;
        boolean z10;
        if (this.f49792x3 == null) {
            o7 o7Var = this.f49769s0;
            if (o7Var != null && (s0Var = o7Var.A0) != null) {
                TLRPC.GroupCall groupCall = s0Var.f49440w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers L1 = wp.r1(this.f49744l2).L1(this.f49740k1, true);
            this.f49792x3 = L1;
            t1 t1Var = this.K1;
            if (t1Var != null && L1 != null) {
                t1Var.O1(true);
            }
        }
    }

    public final boolean L0() {
        t1 t1Var = this.K1;
        if (t1Var == null) {
            return false;
        }
        boolean z10 = t1Var.f23823z2;
        if (z10) {
            t1Var.q1();
        }
        org.telegram.messenger.i0.h3(new i1(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        l1 l1Var;
        int i10;
        long j10;
        long j11;
        int i11;
        wp.d1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.K1.getTextWithEntities();
        long e = e20.i(this.f49744l2).e();
        TLRPC.Peer i12 = this.f49769s0.A0.i();
        if (i12 != null) {
            e = org.telegram.messenger.o5.o(i12);
        }
        Context context = getContext();
        int i13 = this.f49744l2;
        String s10 = org.telegram.messenger.o5.s(i13, this.f49740k1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.f49780u3;
        l1 l1Var2 = new l1(this, 1);
        b bVar = new b();
        int i14 = 0;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, (org.telegram.ui.ActionBar.p6) bVar, false);
        z2Var.O();
        z2Var.f21618v0 = false;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        z2Var.N = f7;
        int[] iArr = wp.r1(i13).Y6;
        Spannable j02 = kj.j0(textWithEntities, false, false, new TextPaint());
        if (j02 != null) {
            l1Var = l1Var2;
            i10 = ((org.telegram.ui.Components.o5[]) j02.getSpans(0, j02.length(), org.telegram.ui.Components.o5.class)).length + ((org.telegram.messenger.h6[]) j02.getSpans(0, j02.length(), org.telegram.messenger.h6.class)).length;
        } else {
            l1Var = l1Var2;
            i10 = 0;
        }
        if (j12 <= 0) {
            j10 = 100;
        } else {
            j10 = j12;
        }
        int max = (int) Math.max(messageMinPrice, j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i15 = length * 7;
                i11 = i14;
                int i16 = iArr[i15];
                Spannable spannable = j02;
                int i17 = iArr[i15 + 2];
                j11 = messageMinPrice;
                if (i10 <= iArr[i15 + 3] && spannable.length() <= i17) {
                    max = Math.max(max, i16);
                    break;
                }
                length--;
                i14 = i11;
                j02 = spannable;
                messageMinPrice = j11;
            } else {
                j11 = messageMinPrice;
                i11 = i14;
                break;
            }
        }
        long[] jArr = new long[1];
        jArr[i11] = max;
        vh.d dVar = new vh.d(context, null, true);
        ?? obj = new Object();
        obj.f49022c = e;
        obj.f49023f = textWithEntities;
        obj.f49024g = jArr[i11];
        c0 c0Var = new c0(i13, context, true);
        LinearLayout f10 = org.telegram.messenger.m5.f(context, i11);
        org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(context, dd.L0(2131748824, null), bVar);
        f10.addView(j0Var, w7.b6.q(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        org.telegram.ui.Components.voip.j0 j0Var2 = new org.telegram.ui.Components.voip.j0(context, dd.L0(2131748825, null), bVar);
        f10.addView(j0Var2, w7.b6.q(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        org.telegram.ui.Components.voip.j0 j0Var3 = new org.telegram.ui.Components.voip.j0(context, dd.L0(2131748826, null), bVar);
        f10.addView(j0Var3, w7.b6.q(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        n nVar = new n(context, bVar, r0);
        l1 l1Var3 = l1Var;
        long j13 = j11;
        r20[] r20VarArr = {new org.telegram.ui.Wallet.q4(jArr, dVar, new dq[1], (h0) obj, c0Var, i13, j0Var, j0Var2, j0Var3, nVar, new boolean[]{true})};
        c0Var.set(obj);
        int i18 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i19 = wp.r1(i13).Z6;
        ArrayList arrayList = new ArrayList();
        int i20 = 0;
        while (true) {
            if (i20 >= i18) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i20] >= j13) {
                if (i20 > 0 && arrayList.isEmpty() && iArr3[i20] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
                }
                int i21 = iArr3[i20];
                if (i21 > i19) {
                    arrayList.add(Integer.valueOf(i19));
                    break;
                }
                arrayList.add(Integer.valueOf(i21));
                if (iArr3[i20] == i19) {
                    break;
                }
            }
            i20++;
            iArr2 = iArr3;
            i18 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i0.a.g(1, arrayList)).intValue() < i19) {
            arrayList.add(Integer.valueOf(i19));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            iArr4[i22] = ((Integer) arrayList.get(i22)).intValue();
        }
        nVar.f47617e0 = iArr4;
        nVar.setValue((int) jArr[0]);
        f7.addView(nVar, w7.b6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        r20VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f7.addView(f10, w7.b6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i23 = org.telegram.ui.ActionBar.t6.f21038j5;
        TextView b10 = w7.g6.b(context, 20.0f, i23, true, bVar);
        org.telegram.messenger.m5.l(b10, 17, null, 2131748821);
        f7.addView(b10, w7.b6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.g6.b(context, 14.0f, i23, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.m5.q(null, null, 2131748822, new Object[]{s10}, b11);
        f7.addView(b11, w7.b6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f7.addView(c0Var, w7.b6.t(-2, -2, 17, 42, 22, 42, 20));
        f7.addView(dVar, w7.b6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        z2Var.show();
        dVar.setOnClickListener(new rh.e7(l1Var3, jArr, z2Var));
    }

    public final void N0() {
        if (this.K1 == null) {
            return;
        }
        r0();
        this.f49767r2.a2.g0();
        this.f49767r2.x1(-1, true);
        ag.v vVar = this.f49767r2;
        vVar.Q1 = this.f49740k1;
        vVar.d1();
        this.f49767r2.Z0().setText(this.K1.getFieldText());
        ((f7) this.f49797z1).h(this.f49767r2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j10 = this.f49740k1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog R0 = wp.r1(this.f49744l2).R0(this.f49740k1);
        if (R0 != null) {
            bundle.putInt("message_id", R0.top_message);
        }
        this.f49769s0.V(new un(bundle));
    }

    public final void P0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: th.z2.P0(long):void");
    }

    public final void Q0(android.net.Uri r18) {
        throw new UnsupportedOperationException("Method not decompiled: th.z2.Q0(android.net.Uri):void");
    }

    public final void R0(long j10, boolean z10) {
        int i10;
        int i11;
        y2 y2Var;
        if (this.f49774t1 != z10) {
            this.f49774t1 = z10;
            fi0 fi0Var = this.f49731i0;
            int i12 = 0;
            if (z10) {
                if (this.f49769s0.f49304a && Build.VERSION.SDK_INT < 33) {
                    o7 o7Var = ((f7) this.f49797z1).d;
                    o7Var.l1 = true;
                    o7Var.d0();
                    ew ewVar = this.F3;
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.h3(ewVar, 100L);
                }
                P0(j10);
                e1();
                fi0Var.setAnimation(this.f49724g1.f49628u);
                this.f49774t1 = true;
                this.X0.f49574a.getImageReceiver().O0(true, true);
                if (this.f49790x1.f49675a != null) {
                    f8.b("StoryViewer displayed story dialogId=" + this.f49740k1 + " storyId=" + y2Var.f49675a.f20032id + " " + y2.c(y2Var));
                }
            } else {
                n0();
                fi0Var.a();
                this.U0 = null;
                this.f49779u2 = false;
                this.f49791x2.e(true, 0.0f);
                this.L0.invalidate();
                invalidate();
                o0();
                o7 o7Var2 = ((f7) this.f49797z1).d;
                o7Var2.I0 = false;
                o7Var2.d0();
            }
            if (this.f49774t1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.N0.h0(i10);
            if (this.f49774t1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.O0.h0(i11);
            if (this.f49774t1) {
                i12 = 2;
            }
            this.P0.h0(i12);
            if (this.l1 || this.f49746m1) {
                e5 e5Var = this.B1;
                long j11 = this.f49740k1;
                boolean z11 = this.f49774t1;
                a0.h hVar = e5Var.f48927m;
                x7 x7Var = (x7) hVar.f(j11);
                if (x7Var == null) {
                    x7Var = new x7(e5Var.f48918a, j11, e5Var);
                    hVar.k(x7Var, j11);
                }
                x7Var.b(z11);
            }
        }
    }

    public final void S0(int i10, long j10) {
        if (this.f49740k1 != j10) {
            y2 y2Var = this.f49790x1;
            y2Var.f49676b = null;
            y2Var.f49675a = null;
        }
        this.f49740k1 = j10;
        this.f49732i1 = null;
        m0(i10);
        TL_stories.PeerStories peerStories = this.f49769s0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.B1.V(peerStories, true);
            return;
        }
        e5 e5Var = this.B1;
        TL_stories.PeerStories y3 = e5Var.y(j10);
        if (y3 == null) {
            y3 = e5Var.z(j10);
        } else {
            z10 = false;
        }
        e5Var.V(y3, z10);
    }

    public final void U0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.f49784v3 && this.f49788w3 == z11) {
            return;
        }
        this.f49784v3 = j10;
        this.f49788w3 = z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        w2 w2Var = this.X0;
        if (i10 >= 0) {
            if (this.l1 && !z11) {
                w2Var.f49575b.l(dd.L0(2131745658, null), false);
                w2Var.f49575b.i(null);
                return;
            }
            TLRPC.User Z1 = wp.r1(this.f49744l2).Z1(Long.valueOf(j10));
            if (Z1 != null && Z1.verified) {
                Drawable mutate = getContext().getDrawable(2131232791).mutate();
                mutate.setAlpha(255);
                eq eqVar = new eq(mutate, null);
                eqVar.f25909x = true;
                int L = org.telegram.messenger.i0.L(16.0f);
                int L2 = org.telegram.messenger.i0.L(16.0f);
                eqVar.h = L;
                eqVar.f25905n = L2;
                w2Var.f49575b.i(eqVar);
            } else {
                w2Var.f49575b.i(null);
            }
            if (Z1 != null) {
                w2Var.f49575b.l(org.telegram.messenger.k6.m(org.telegram.messenger.i0.D2(org.telegram.messenger.i5.p(Z1)), w2Var.f49575b.getPaint().getFontMetricsInt(), false, null, 0), false);
                return;
            }
            w2Var.f49575b.l(null, false);
            return;
        }
        TLRPC.Chat L0 = wp.r1(this.f49744l2).L0(Long.valueOf(-j10));
        og.c cVar = w2Var.f49575b;
        og.c cVar2 = w2Var.f49575b;
        if (L0 == null) {
            str = "";
        } else {
            str = L0.title;
        }
        cVar.l(org.telegram.messenger.i0.D2(str), false);
        if (L0 != null && L0.verified) {
            Drawable mutate2 = getContext().getDrawable(2131232791).mutate();
            mutate2.setAlpha(255);
            eq eqVar2 = new eq(mutate2, null);
            eqVar2.f25909x = true;
            int L3 = org.telegram.messenger.i0.L(16.0f);
            int L4 = org.telegram.messenger.i0.L(16.0f);
            eqVar2.h = L3;
            eqVar2.f25905n = L4;
            cVar2.i(eqVar2);
            return;
        }
        cVar2.i(null);
    }

    public final void V0(float f7, float f10, e3 e3Var) {
        this.V0 = f7;
        this.f49738j3 = 1.0f / f10;
        if (this.U0 != e3Var) {
            this.U0 = e3Var;
            if (e3Var != null) {
                ImageReceiver imageReceiver = e3Var.f48912a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    ag.c2 c2Var = this.N0;
                    c2Var.f14373c0 = null;
                    c2Var.Z0.setShader(null);
                    c2Var.N0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void W0(boolean z10) {
        boolean z11;
        y2 y2Var = this.f49790x1;
        if (y2Var.f49675a != null) {
            o7 o7Var = this.f49769s0;
            if (o7Var.f49317f != null) {
                String e = y2Var.e();
                TLRPC.Chat chat = null;
                if (z10) {
                    org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(3, this.f49739k0);
                    if (this.f49746m1) {
                        chat = wp.r1(this.f49744l2).L0(Long.valueOf(-this.f49740k1));
                    }
                    if (wp.r1(this.f49744l2).T4() && ((!this.f49746m1 && !i20.A(this.f49740k1)) || org.telegram.messenger.w3.t0(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z1 z1Var = new z1(this, o7Var.f49317f.getContext(), e, e, z11, a0Var);
                    this.I2 = z1Var;
                    z1Var.a2 = true;
                    TL_stories.StoryItem storyItem = y2Var.f49675a;
                    storyItem.dialogId = this.f49740k1;
                    z1Var.f29505x2 = storyItem;
                    z1Var.f29480k2 = new n2.u(this, 26);
                    ((f7) this.f49797z1).h(z1Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.I1.startActivityForResult(Intent.createChooser(intent, dd.L0(2131744864, null)), 500);
            }
        }
    }

    public final void X0() {
        g2 g2Var = this.L0;
        org.telegram.ui.ActionBar.p6 p6Var = this.f49739k0;
        org.telegram.messenger.m5.o(null, 2131743858, new cc(g2Var, p6Var), p6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f49739k0);
        String L0 = dd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        alertDialog$Builder.k(dd.L0(2131747847, null), null);
        x1Var.T = dd.L0(2131747233, null);
        ((f7) this.f49797z1).h(x1Var);
    }

    public final void Z0(boolean z10) {
        if (this.f49709b3 != z10) {
            y2 y2Var = this.f49790x1;
            if (y2Var.f49675a != null) {
                this.f49709b3 = z10;
                if (z10) {
                    this.f49706a3.setVisibility(0);
                }
                this.f49706a3.setStoryItem(y2Var.f49675a);
                o7 o7Var = ((f7) this.f49797z1).d;
                o7Var.f49338p1 = z10;
                o7Var.d0();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f49712c3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f49706a3.setTransitionProgress(this.f49712c3);
                    ofFloat.addUpdateListener(new j1(this, 1));
                    ofFloat.addListener(new q1(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(gr.f26524g);
                    ofFloat.start();
                    return;
                }
                if (this.f49706a3.getReactionsWindow() != null) {
                    this.f49706a3.getReactionsWindow().e();
                }
                this.f49706a3.animate().alpha(0.0f).setDuration(150L).setListener(new r1(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z10) {
        int i10;
        if (this.f49757p0 == null) {
            vh.p2 p2Var = new vh.p2(getContext(), 1);
            p2Var.l(1.0f, -56.0f);
            this.f49757p0 = p2Var;
            p2Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
            this.L0.addView(this.f49757p0, w7.b6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        vh.p2 p2Var2 = this.f49757p0;
        if (z10) {
            i10 = 2131744626;
        } else {
            i10 = 2131744483;
        }
        p2Var2.s(dd.L0(i10, null));
        this.f49757p0.u();
    }

    public final boolean b1(boolean z10) {
        if (this.f49769s0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.f49770s1 < getStoriesCount() - 1) {
                this.f49770s1++;
                d1(false);
                return true;
            }
        } else {
            int i10 = this.f49770s1;
            if (i10 > 0) {
                this.f49770s1 = i10 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!wp.r1(this.f49744l2).T4()) {
            return;
        }
        File h = this.f49790x1.h();
        if (h != null && h.exists()) {
            z1 z1Var = this.I2;
            if (z1Var != null) {
                z1Var.dismiss();
            }
            org.telegram.messenger.i0.h3(new i1(this, 8), 120L);
            return;
        }
        Y0();
    }

    public final void d1(boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: th.z2.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        s0 s0Var;
        boolean z10;
        int i12 = at.f14805v5;
        long j10 = 0;
        o7 o7Var = this.f49769s0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != at.f14819x5 || o7Var.O0 != objArr[0])) {
            if (i10 == at.f14746m3) {
                d1(false);
                return;
            } else if (i10 == at.f14726i4) {
                this.f49773t0.f49127b0.invalidate();
                return;
            } else if (i10 == at.D5) {
                p0(true);
                return;
            } else if (i10 == at.f14683b3) {
                j4.w o10 = wp.r1(this.f49744l2).O1().o();
                if (o10 != null && o10.a(this.f49744l2, 1) && this.f49797z1 != null) {
                    kg.q1 q1Var = new kg.q1(this, 10);
                    Context W = org.telegram.messenger.i0.W(getContext());
                    if (W == null) {
                        W = LaunchActivity.I1;
                    }
                    ((f7) this.f49797z1).h(new kg.q0(o10.b(), this.f49744l2, W, q1Var, null));
                    return;
                }
                return;
            } else if (i10 == at.f14725i3) {
                TL_account.RequirementToContact H2 = wp.r1(this.f49744l2).H2(this.f49740k1);
                if (this.f49740k1 >= 0 && !e20.i(this.f49744l2).q() && (H2 instanceof TL_account.requirementToContactPremium)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f49754o1 != z10 || this.f49762q1 != org.telegram.messenger.o5.k(H2)) {
                    this.f49754o1 = z10;
                    this.f49762q1 = org.telegram.messenger.o5.k(H2);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i10 == at.T) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f49740k1 == (-((TLRPC.ChatFull) obj).f19795id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i10 == at.G2) {
                long longValue = ((Long) objArr[0]).longValue();
                if (o7Var != null && (s0Var = o7Var.A0) != null && s0Var.g() == longValue) {
                    d1(false);
                    t1 t1Var = this.K1;
                    if (t1Var != null) {
                        t1Var.F(true);
                        this.K1.O1(true);
                        p0(true);
                    }
                    p1 p1Var = this.f49777u0;
                    if (p1Var != null) {
                        s0 s0Var2 = p1Var.P;
                        if (s0Var2 != null) {
                            j10 = s0Var2.j();
                        }
                        if (p1Var.H != j10) {
                            p1Var.e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == at.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            } else {
                return;
            }
        }
        v2 v2Var = this.f49797z1;
        if (v2Var == null || !((f7) v2Var).d.H0) {
            if (this.f49774t1) {
                h1();
                if (this.f49736j1 == 0) {
                    if (!this.f49751n2) {
                        this.f49751n2 = true;
                        ((f7) this.f49797z1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.f49770s1;
                ArrayList arrayList = this.f49716e1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f49720f1;
                if (i13 >= arrayList2.size() + size) {
                    this.f49770s1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.l1 || this.f49746m1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = o7Var.Q0;
            if (peerStories != null) {
                this.B1.V(peerStories, true);
            } else {
                long j11 = this.f49740k1;
                if (j11 != 0) {
                    e5 e5Var = this.B1;
                    TL_stories.PeerStories y3 = e5Var.y(j11);
                    if (y3 == null) {
                        y3 = e5Var.z(j11);
                        z11 = true;
                    }
                    e5Var.V(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.b1 b1Var = this.f49707b1;
            if (b1Var != null) {
                ViewPropertyAnimator animate = b1Var.animate();
                if (this.B1.M(this.f49740k1) && this.f49790x1.e && !uz.b()) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        pd pdVar;
        Canvas canvas2;
        org.telegram.ui.Components.e6 e6Var;
        org.telegram.ui.Components.e6 e6Var2;
        j1();
        if (this.f49746m1 && (e6Var2 = this.f49796z0) != null) {
            e6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(40.0f));
        }
        if (this.f49746m1 && (e6Var = this.A0) != null) {
            e6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f49715d3;
        LinearLayout linearLayout = this.f49789x0;
        b2 b2Var = this.m0;
        if (z10) {
            float measuredWidth = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.i0.L(24.0f);
            float f7 = L / 2.0f;
            float T1 = org.telegram.messenger.i0.T1(this.f49722f3, measuredWidth - f7, gr.f26524g.getInterpolation(this.f49718e3));
            float T12 = org.telegram.messenger.i0.T1(this.f49726g3, measuredHeight - f7, this.f49718e3);
            int W1 = org.telegram.messenger.i0.W1(this.f49718e3, this.f49730h3, L);
            if (this.Y2) {
                org.telegram.ui.Components.f5 f5Var = this.X2;
                if (f5Var != null) {
                    float f10 = W1;
                    f5Var.setBounds((int) T1, (int) T12, (int) (T1 + f10), (int) (T12 + f10));
                    this.X2.draw(canvas);
                }
            } else {
                float f11 = W1;
                ImageReceiver imageReceiver = this.W2;
                imageReceiver.y0(T1, T12, f11, f11);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.Z2) {
            float measuredWidth2 = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.i0.L(120.0f);
            if (!this.Y2) {
                float f12 = L2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.U2;
                imageReceiver2.y0(f14, f15, f12, f12);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.B() != null && imageReceiver2.B().A()) {
                    this.Z2 = false;
                }
            } else {
                sg.d dVar = this.V2;
                if (dVar != null) {
                    float f16 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.V2.b(canvas);
                    if (this.V2.c()) {
                        this.V2.d(this);
                        this.V2 = null;
                        this.Z2 = false;
                    }
                } else {
                    this.Z2 = false;
                }
            }
        }
        t1 t1Var = this.K1;
        if (t1Var != null) {
            pd pdVar2 = t1Var.f23818y1;
            pd pdVar3 = t1Var.f23822z1;
            if (t1Var.getAlpha() != 0.0f && (pdVar = t1Var.f23701e1) != null && pdVar.getParent() != null && t1Var.f23701e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(t1Var.f23701e1.getX() + pdVar2.getX() + pdVar3.getX() + t1Var.getX(), t1Var.f23701e1.getY() + pdVar2.getY() + pdVar3.getY() + t1Var.getY());
                if (t1Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, t1Var.getMeasuredWidth(), t1Var.getMeasuredHeight(), (int) (t1Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                t1Var.f23701e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        nj0 nj0Var;
        nj0 nj0Var2;
        hi.f fVar;
        float L;
        float f7;
        if (view == this.M2) {
            canvas.save();
            canvas.clipRect(0.0f, this.M2.getY(), getMeasuredWidth(), this.M2.getY() + this.M2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        t1 t1Var = this.K1;
        Paint paint = this.W1;
        b2 b2Var = this.m0;
        x2 x2Var = this.f49724g1;
        if (view == t1Var) {
            float f10 = this.Z1;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            y2 y2Var = this.f49790x1;
            if (i10 > 0 && !y2Var.f49678f) {
                x2Var.f49619l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x2Var.f49619l);
            }
            RectF rectF = x2Var.h;
            RectF rectF2 = x2Var.f49616i;
            RectF rectF3 = x2Var.f49617j;
            rectF.set(this.K1.getX(), this.K1.getY() + this.K1.getAnimatedTop() + org.telegram.messenger.i0.L(1.33f), this.K1.getX() + this.K1.getMeasuredWidth(), this.K1.getY() + this.K1.getMeasuredHeight());
            float L2 = org.telegram.messenger.i0.L(40.0f);
            if (!y2Var.f49678f) {
                if (this.B2) {
                    L2 += org.telegram.messenger.i0.L(46.0f);
                }
                if (this.C2 && this.f49746m1) {
                    L2 += org.telegram.messenger.i0.L(46.0f);
                }
                if (b2Var != null && b2Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.i0.L(40.0f)) + b2Var.getLayoutParams().width;
                }
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(46.0f);
                L2 = org.telegram.messenger.i0.L(46.0f);
                a1 a1Var = this.J1;
                if (a1Var != null && a1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.i0.L(46.0f);
                }
            }
            rectF2.set(org.telegram.messenger.i0.L(10.0f) + L, ((this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f)) - L2, (this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.i0.L(5.0f));
            this.K1.setTranslationX((1.0f - this.Z1) * L);
            if (this.K1.getMeasuredHeight() > org.telegram.messenger.i0.L(50.0f)) {
                f7 = ((1.0f - this.Z1) * (this.K1.getMeasuredHeight() - org.telegram.messenger.i0.L(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.K1.getEditField().setTranslationY(c3.i0.z(1.0f, this.Z1, -org.telegram.messenger.i0.L(2.0f), f7));
            float L3 = org.telegram.messenger.i0.L(50.0f) / 2.0f;
            org.telegram.messenger.i0.Z1(rectF2, x2Var.h, this.Z1, rectF3);
            vg.f fVar2 = this.U1;
            if (fVar2 != null) {
                fVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                fVar2.q(L3);
                fVar2.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.a2) * 255.0f * getHideInterfaceAlpha()));
                fVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.Z1 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (t1Var != null && t1Var.r0(view)) {
            float L4 = org.telegram.messenger.i0.L(30.0f);
            RectF rectF4 = x2Var.f49618k;
            RectF rectF5 = x2Var.f49618k;
            rectF4.set(0.0f, view.getY() + org.telegram.messenger.i0.L(1.0f), getWidth(), org.telegram.messenger.i0.L(20.0f) + getHeight());
            Path path = this.K3;
            path.rewind();
            path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            vg.f fVar3 = this.V1;
            if (fVar3 != null) {
                fVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                fVar3.r(L4, L4, L4, L4);
                fVar3.setAlpha(255);
                fVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, L4, L4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.O1 && this.K1 != null) {
                view.setTranslationY(((this.K1.getY() + this.K1.getAnimatedTop()) + (-nj0Var.getMeasuredHeight())) - org.telegram.messenger.i0.L(18.0f));
            } else {
                if (view == this.f49706a3) {
                    view.setTranslationY((this.f49789x0.getY() + (b2Var.getY() + (-(nj0Var2.getMeasuredHeight() - this.f49706a3.getPaddingBottom())))) - org.telegram.messenger.i0.L(18.0f));
                } else {
                    g2 g2Var = this.L0;
                    if (view == g2Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f49764q3) != null && !fVar.f7722r) {
                        RecordingCanvas i11 = fVar.i(getMeasuredWidth(), getMeasuredHeight());
                        i11.drawColor(i0.b.f(0.2f, -16777216, -1));
                        i11.translate(g2Var.getX(), g2Var.getY());
                        view.draw(i11);
                        fVar.j();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: th.z2.e1():void");
    }

    public final void f1() {
        int i10;
        if (this.f49758p1) {
            TextView textView = this.Q1;
            if (textView != null) {
                textView.setText(dd.L0(2131748833, null));
            }
            TextView textView2 = this.R1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.Q1;
        if (textView3 != null) {
            if (this.f49750n1) {
                i10 = 2131744684;
            } else {
                i10 = 2131744519;
            }
            textView3.setText(dd.L0(i10, null));
        }
        TextView textView4 = this.R1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.R1.setText(dd.L0(2131744518, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f49732i1;
        o7 o7Var = this.f49769s0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f49720f1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((d5) arrayList2.get(i11)).f48890a;
                    if (((int) (j10 ^ (j10 >>> 32))) == o7Var.P0) {
                        this.f49770s1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f49732i1.indexOf(Integer.valueOf(o7Var.P0));
            if (indexOf < 0 && !this.f49732i1.isEmpty()) {
                if (o7Var.P0 > ((Integer) this.f49732i1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (o7Var.P0 < ((Integer) i0.a.g(1, this.f49732i1)).intValue()) {
                    indexOf = this.f49732i1.size() - 1;
                }
            }
            this.f49770s1 = i10 + indexOf;
        } else {
            int i12 = o7Var.f49316e1.get(this.f49740k1, -1);
            this.f49770s1 = i12;
            if (i12 == -1 && !o7Var.N0 && (peerStories = this.f49713d1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f49716e1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f20032id > this.f49713d1.max_read_id) {
                        this.f49770s1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.f49770s1 == -1) {
            this.f49770s1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f49732i1;
    }

    public long getCurrentPeer() {
        return this.f49740k1;
    }

    public int getListPosition() {
        return this.f49778u1;
    }

    public Bitmap getPlayingBitmap() {
        g2 g2Var = this.L0;
        Bitmap createBitmap = Bitmap.createBitmap(g2Var.getWidth(), g2Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f49770s1;
    }

    public e5 getStoriesController() {
        return wp.r1(this.f49744l2).O1();
    }

    public int getStoriesCount() {
        return Math.max(this.f49747m2, this.f49716e1.size()) + this.f49720f1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f49716e1;
    }

    public final void h1() {
        x4 x4Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f49716e1;
        arrayList.clear();
        o7 o7Var = this.f49769s0;
        if (o7Var.N0) {
            if (!o7Var.S0) {
                arrayList.add(o7Var.T0);
            }
        } else {
            ArrayList arrayList2 = this.f49732i1;
            int i10 = 0;
            ArrayList arrayList3 = this.f49720f1;
            if (arrayList2 != null && (x4Var = o7Var.O0) != null) {
                if (x4Var instanceof q4) {
                    arrayList3.clear();
                    ArrayList F = wp.r1(this.f49744l2).O1().F(this.f49740k1);
                    String str = ((q4) o7Var.O0).E;
                    if (F != null) {
                        for (int i11 = 0; i11 < F.size(); i11++) {
                            d5 d5Var = (d5) F.get(i11);
                            vh.n5 n5Var = d5Var.f48892c;
                            if (n5Var != null && !n5Var.f51544g && TextUtils.equals(n5Var.K0, str)) {
                                arrayList3.add(d5Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f49732i1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    kj f7 = o7Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.f16694l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (o7Var.O0 != null) {
                while (i10 < o7Var.O0.f49650i.size()) {
                    arrayList.add(((kj) o7Var.O0.f49650i.get(i10)).f16694l);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = o7Var.Q0;
                if (peerStories != null && org.telegram.messenger.o5.o(peerStories.peer) == this.f49740k1) {
                    this.f49713d1 = o7Var.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.B1.y(this.f49740k1);
                    this.f49713d1 = y3;
                    if (y3 == null) {
                        this.f49713d1 = this.B1.z(this.f49740k1);
                    }
                }
                this.f49747m2 = 0;
                TL_stories.PeerStories peerStories2 = this.f49713d1;
                if (peerStories2 != null) {
                    this.f49747m2 = peerStories2.stories.size();
                    arrayList.addAll(this.f49713d1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.B1.F(this.f49740k1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        }
        this.f49736j1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        z2 currentPeerView;
        e50 e50Var = this.f49771s2;
        if (e50Var != null) {
            e50Var.f25703e0 = null;
            e50Var.a(false);
        }
        long j10 = this.f49740k1;
        TL_stories.StoryItem storyItem = this.f49790x1.f49675a;
        o7 o7Var = this.f49769s0;
        o7Var.getClass();
        if (j10 != 0 && storyItem != null) {
            o7.E1.remove(j10 + (j10 >> 16) + (storyItem.f20032id << 16));
        }
        this.R2 = true;
        e7 e7Var = o7Var.f49333n0;
        if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            wb J = new cc(this.L0, this.f49739k0).J(2131624027, dd.L0(2131748498, null), dd.L0(2131743578, null), 5000, false, new i1(this, 2));
            J.f32209r = false;
            J.k(false);
        }
        wp.r1(this.f49744l2).s0(this.f49740k1, 0, null);
    }

    public final void i1(boolean z10) {
        String L0;
        int i10;
        String L02;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z11;
        int i11;
        boolean z12;
        y2 y2Var = this.f49790x1;
        TL_stories.StoryItem storyItem = y2Var.f49675a;
        if (storyItem == null) {
            storyItem = y2Var.f49677c;
        }
        boolean z13 = this.f49746m1;
        if (z13 || this.l1) {
            if (storyItem != null) {
                o7 o7Var = this.f49769s0;
                b2 b2Var = this.m0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.e6 e6Var = this.A0;
                    if (e6Var != null && (i11 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i11);
                        if (z10 && this.E0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        e6Var.t(num, z12, true);
                        this.E0 = true;
                    } else {
                        this.E0 = false;
                    }
                    int i12 = storyItem.views.reactions_count;
                    if (i12 > 0) {
                        org.telegram.ui.Components.e6 e6Var2 = this.f49796z0;
                        String num2 = Integer.toString(i12);
                        if (z10 && this.D0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e6Var2.t(num2, z11, true);
                        this.D0 = true;
                    } else {
                        this.D0 = false;
                    }
                    if (!z10) {
                        org.telegram.ui.Components.t5 t5Var = this.B0;
                        if (this.D0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        t5Var.e(true, f11);
                        org.telegram.ui.Components.t5 t5Var2 = this.C0;
                        if (t5Var2 != null) {
                            if (this.E0) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            t5Var2.e(true, f12);
                        }
                    }
                    TLRPC.Chat L03 = wp.r1(this.f49744l2).L0(Long.valueOf(-this.f49740k1));
                    if ((!this.f49750n1 || (!org.telegram.messenger.w3.q(L03) && !org.telegram.messenger.w3.s0(L03))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f49737j2;
                        if (o7Var.O0 == null) {
                            L02 = dd.L0(2131748139, null);
                        } else {
                            L02 = dd.L0(2131748138, null);
                        }
                        textView.setText(L02);
                        this.f49737j2.setTranslationX(org.telegram.messenger.i0.L(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new dq(2131231185, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.o0(storyItem.views.views_count, 0));
                        this.f49737j2.setText(spannableStringBuilder);
                    } else {
                        this.f49737j2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = b2Var.getLayoutParams();
                    float L = org.telegram.messenger.i0.L(40.0f);
                    if (this.D0) {
                        f7 = this.f49796z0.d + org.telegram.messenger.i0.L(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (L + f7);
                    ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(40.0f) + b2Var.getLayoutParams().width;
                    b2 b2Var2 = this.f49793y0;
                    if (b2Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = b2Var2.getLayoutParams();
                        float L2 = org.telegram.messenger.i0.L(40.0f);
                        if (this.E0) {
                            f10 = org.telegram.messenger.i0.L(4.0f) + this.A0.d;
                        } else {
                            f10 = 0.0f;
                        }
                        layoutParams2.width = (int) (L2 + f10);
                        ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin += b2Var2.getLayoutParams().width;
                        b2Var2.requestLayout();
                    }
                    this.F1.requestLayout();
                    b2Var.requestLayout();
                    this.f49741k2.setVisibility(8);
                    this.f49755o2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = y2Var.f49675a;
                    e2 e2Var = this.S0;
                    if (storyItem2 == null) {
                        e2Var.getClass();
                        return;
                    }
                    for (int i13 = 0; i13 < e2Var.getChildCount(); i13++) {
                        if (e2Var.getChildAt(i13) instanceof v6) {
                            ((v6) e2Var.getChildAt(i13)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                int i14 = 3;
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (i15 < storyItem.views.recent_viewers.size()) {
                            TLObject d22 = wp.r1(this.f49744l2).d2(storyItem.views.recent_viewers.get(i15).longValue());
                            if (d22 != null) {
                                this.f49741k2.b(i16, this.f49744l2, d22);
                                i16++;
                            }
                            i10 = i14;
                            if (i16 >= i10) {
                                break;
                            }
                            i15++;
                            i14 = i10;
                        } else {
                            i10 = i14;
                            break;
                        }
                    }
                    for (int i17 = i16; i17 < i10; i17++) {
                        this.f49741k2.b(i17, this.f49744l2, null);
                    }
                    this.f49741k2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        dq dqVar = new dq(2131231979, 0);
                        dqVar.f25572y = -53704;
                        dqVar.f25567n = org.telegram.messenger.i0.L(0.2f);
                        spannableStringBuilder2.setSpan(dqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        dq dqVar2 = new dq(2131231970, 0);
                        dqVar2.f25572y = -14161823;
                        dqVar2.f25567n = org.telegram.messenger.i0.L(0.2f);
                        spannableStringBuilder2.setSpan(dqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f49737j2.setText(spannableStringBuilder2);
                    if (i16 == 0) {
                        this.f49741k2.setVisibility(8);
                        this.f49737j2.setTranslationX(org.telegram.messenger.i0.L(16.0f));
                    } else {
                        this.f49741k2.setVisibility(0);
                        this.f49737j2.setTranslationX(org.telegram.messenger.i0.L(10.0f) + i0.a.e(i16, 1, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(24.0f) + org.telegram.messenger.i0.L(13.0f)));
                    }
                    this.f49755o2.setVisibility(0);
                } else {
                    TextView textView2 = this.f49737j2;
                    if (o7Var.O0 == null) {
                        L0 = dd.L0(2131748139, null);
                    } else {
                        L0 = dd.L0(2131748138, null);
                    }
                    textView2.setText(L0);
                    this.f49737j2.setTranslationX(org.telegram.messenger.i0.L(16.0f));
                    this.f49741k2.setVisibility(8);
                    this.f49755o2.setVisibility(8);
                }
                b2Var.getLayoutParams().width = org.telegram.messenger.i0.L(40.0f);
                this.f49789x0.requestLayout();
                return;
            }
            this.f49737j2.setText("");
            this.f49755o2.setVisibility(8);
            this.f49741k2.setVisibility(8);
        }
    }

    public final void j0() {
        j5 j5Var = this.f49749n0;
        j5Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.messenger.x(1, j5Var)).setDuration(150L).start();
        int L = org.telegram.messenger.i0.L(8.0f);
        j5 j5Var2 = new j5(getContext(), this.f49724g1);
        this.f49749n0 = j5Var2;
        j5Var2.setPadding(L, L, L, L);
        this.f49749n0.setAlpha(0.0f);
        this.f49749n0.setScaleX(0.8f);
        this.f49749n0.setScaleY(0.8f);
        this.f49749n0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.m0.addView(this.f49749n0, w7.b6.e(40, 40, 3));
        this.Z2 = false;
    }

    public final void j1() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        t1 t1Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float L;
        int i10;
        float f17;
        float f18;
        int i11;
        b2 b2Var;
        ImageView imageView;
        k2 k2Var;
        b2 b2Var2;
        boolean z11;
        float f19;
        nj0 nj0Var;
        float f20;
        int i12;
        float f21;
        float f22;
        float f23 = ((f7) this.f49797z1).d.V;
        if (this.f49779u2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.t5 t5Var = this.f49791x2;
        t5Var.e(false, f7);
        int i13 = this.f49711c2;
        if (i13 != 0 && this.f49714d2) {
            f10 = w7.u.a(this.f49763q2 / i13, 0.0f, 1.0f);
        } else if (this.f49717e2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.t5 t5Var2 = this.G3;
        float f24 = t5Var2.f30530c;
        org.telegram.ui.Components.t5 t5Var3 = this.H3;
        float f25 = t5Var3.f30530c;
        org.telegram.ui.Components.t5 t5Var4 = this.I3;
        float f26 = t5Var4.f30530c;
        if (this.f49759p2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        t5Var2.e(false, f11);
        if (!this.R2) {
            t1 t1Var2 = this.K1;
            if (t1Var2 != null && !TextUtils.isEmpty(t1Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            t5Var3.e(false, f22);
        }
        t1 t1Var3 = this.K1;
        if (t1Var3 != null && t1Var3.f23824z3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        t5Var4.e(false, f12);
        final t1 t1Var4 = this.K1;
        if (t1Var4 != null) {
            z2 z2Var = t1Var4.f49471x5;
            f13 = 1.0f;
            int backgroundTop = t1Var4.getBackgroundTop();
            int i14 = t1Var4.f49468u5;
            if (i14 != 0 && backgroundTop != i14) {
                int i15 = (t1Var4.T1 + i14) - backgroundTop;
                t1Var4.setAnimatedTop(i15);
                z2Var.E2 = true;
                ValueAnimator valueAnimator = z2Var.N1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    z2Var.N1.cancel();
                }
                View view = t1Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var4.G1.setTranslationY(((1.0f - t1Var4.getTopViewEnterProgress()) * t1Var4.G1.getLayoutParams().height) + t1Var4.T1);
                }
                z2Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i15, 0.0f);
                z2Var.N1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                t1 t1Var5 = t1Var4;
                                t1Var5.getClass();
                                t1Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                z2 z2Var2 = t1Var5.f49471x5;
                                z2Var2.E2 = true;
                                z2Var2.invalidate();
                                t1Var5.invalidate();
                                return;
                            default:
                                t1Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                z2Var.N1.addListener(new sg.r(t1Var4, 6));
                z2Var.N1.setDuration(250L);
                z2Var.N1.setInterpolator(ci.o.V);
                z2Var.N1.start();
                t1Var4.f49468u5 = 0;
            }
            if (t1Var4.f23756n3) {
                float scrollY = (t1Var4.f49470w5 - t1Var4.E0.getScrollY()) + (t1Var4.f49469v5 - t1Var4.E0.getMeasuredHeight());
                se seVar = t1Var4.E0;
                seVar.setOffsetY(seVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(t1Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                t1 t1Var5 = t1Var4;
                                t1Var5.getClass();
                                t1Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                z2 z2Var2 = t1Var5.f49471x5;
                                z2Var2.E2 = true;
                                z2Var2.invalidate();
                                t1Var5.invalidate();
                                return;
                            default:
                                t1Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = t1Var4.f49467t5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t1Var4.f49467t5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ci.o.V);
                ofFloat2.start();
                t1Var4.f23756n3 = false;
                z2Var.j1();
            }
            t1Var4.getMeasuredHeight();
        } else {
            f13 = 1.0f;
        }
        t1 t1Var5 = this.K1;
        if (t1Var5 != null && t1Var5.q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f49725g2;
        Paint paint = this.W1;
        if (z12) {
            paint.setColor(i0.b.f(this.Z1, -14933463, org.telegram.ui.ActionBar.t6.r1(0.44f, -16777216)));
            float f27 = f13;
            paint.setAlpha((int) ((f27 - this.N3) * org.telegram.messenger.m5.A(f27, this.a2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.b.o(-16777216, (int) ((f13 - this.N3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.E2;
        o7 o7Var = this.f49769s0;
        if (z13 || this.J3 != o7Var.f49313d0 || t5Var.f30530c != this.f49798z2 || this.f49708b2 != this.f49763q2 || f10 != this.Z1 || f23 != this.a2 || f24 != t5Var2.f30530c || z10 || f26 != t5Var4.f30530c || f25 != t5Var3.f30530c) {
            this.E2 = false;
            this.f49708b2 = this.f49763q2;
            int i16 = (t5Var.f30530c > this.f49798z2 ? 1 : (t5Var.f30530c == this.f49798z2 ? 0 : -1));
            g2 g2Var = this.L0;
            if (i16 != 0) {
                g2Var.invalidate();
            }
            if (f23 != 0.0f) {
                g2Var.setLayerType(2, null);
            } else {
                g2Var.setLayerType(0, null);
            }
            this.f49798z2 = t5Var.f30530c;
            this.a2 = f23;
            this.Z1 = f10;
            this.J3 = o7Var.f49313d0;
            float height = this.f49763q2 - (getHeight() - g2Var.getBottom());
            if (this.K1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = t1Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.X1 - (getHeight() - g2Var.getBottom());
            t1 t1Var6 = this.K1;
            if (t1Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = t1Var6.getHeightWithTopView();
                if (this.f49717e2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            t1 t1Var7 = this.K1;
            if (t1Var7 != null) {
                if (this.M1 != null) {
                    ImageView suggestButton = t1Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.M1.m(1.0f, -(org.telegram.messenger.i0.L(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.M1.setTranslationY(-((getHeight() - this.K1.getY()) + org.telegram.messenger.i0.L(6.0f)));
                }
                mt editField = this.K1.getEditField();
                eo0 senderSelectView = this.K1.getSenderSelectView();
                if (editField != null) {
                    f16 = 6.0f;
                    f21 = 1.0f;
                    float T1 = org.telegram.messenger.i0.T1(0.88f, 1.0f, f10);
                    editField.setScaleX(T1);
                    editField.setScaleY(T1);
                } else {
                    f16 = 6.0f;
                    f21 = 1.0f;
                }
                if (senderSelectView != null) {
                    float T12 = org.telegram.messenger.i0.T1(0.8f, f21, f10);
                    senderSelectView.setScaleX(T12);
                    senderSelectView.setScaleY(T12);
                    senderSelectView.setTranslationY(org.telegram.messenger.i0.W1(f10, -org.telegram.messenger.i0.L(2.0f), 0));
                }
            } else {
                f16 = 6.0f;
            }
            if (this.f49725g2) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, L + max);
            if (!this.f49725g2 && !this.f49717e2) {
                i10 = org.telegram.messenger.i0.L(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float L2 = (org.telegram.messenger.i0.L(f16) * f10) + max3;
            p1 p1Var = this.f49777u0;
            mb0 mb0Var = p1Var.f49097c;
            p1Var.K = L2;
            if (Math.abs(p1Var.L - max4) > 0.1f) {
                p1Var.L = max4;
                f17 = 0.8f;
                i11 = 0;
                f18 = 8.0f;
                mb0Var.setPadding(org.telegram.messenger.i0.L(8.0f), Math.max(0, ((int) max4) - mb0Var.getTop()) + org.telegram.messenger.i0.L(7.5f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.5f));
                if (!mb0Var.canScrollVertically(1)) {
                    p1Var.d.h1(0, org.telegram.messenger.i0.L(100.0f));
                }
            } else {
                f17 = 0.8f;
                f18 = 8.0f;
                i11 = 0;
            }
            p1Var.setTranslationY(-p1Var.K);
            p1Var.invalidate();
            vh.s2 s2Var = o7Var.D0;
            if (s2Var != null) {
                s2Var.setKeyboardOffset(max);
            }
            nj0 nj0Var2 = this.O1;
            y2 y2Var = this.f49790x1;
            if (nj0Var2 != null) {
                if (this.Z1 > 0.0f && (y2Var == null || !y2Var.f49678f)) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                nj0Var2.setVisibility(i12);
            }
            int i17 = i11;
            while (true) {
                int childCount = getChildCount();
                b2Var = this.f49793y0;
                imageView = this.f49785w0;
                k2Var = this.f49773t0;
                b2Var2 = this.m0;
                if (i17 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && childAt != this.F1 && childAt.getTag(2131296591) == null && childAt != k2Var.W.n(getContext())) {
                    t1 t1Var8 = this.K1;
                    if (t1Var8 != null && childAt == t1Var8.getEmojiView()) {
                        childAt.setTranslationY(this.K1.getEmojiView().getMeasuredHeight() - this.f49763q2);
                    } else if (childAt instanceof q30) {
                        q30 q30Var = (q30) childAt;
                        View view2 = q30Var.e;
                        if (view2 != null) {
                            q30Var.g(view2);
                        }
                    } else if (childAt != this.f49771s2 && childAt != g2Var && childAt != imageView && childAt != this.f49789x0 && childAt != b2Var && childAt != this.F2 && childAt != this.M1 && childAt != b2Var2 && ((nj0Var = this.f49706a3) == null || nj0Var.getReactionsWindow() == null || childAt != this.f49706a3.getReactionsWindow().f48288c)) {
                        float f28 = this.Z1;
                        f28 = (childAt == this.G1 || childAt == this.I1 || childAt == this.J1 || childAt == this.H1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float L3 = (((((-this.f49775t2) * f29) - (org.telegram.messenger.i0.L(7.0f) * f28)) - this.f49763q2) - (org.telegram.messenger.i0.L(f18) * f29)) - (org.telegram.messenger.i0.L(20.0f) * o7Var.f49313d0);
                        if (childAt == this.G1 || childAt == this.I1 || childAt == this.J1 || childAt == this.H1) {
                            L3 += this.f49763q2;
                        }
                        if (this.f49725g2) {
                            f20 = (1.0f - this.a2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.K2) {
                            L3 = o7Var.f49313d0 * (-org.telegram.messenger.i0.L(20.0f));
                        }
                        if (childAt == this.M2) {
                            L3 -= this.K1.getMeasuredHeight() - this.K1.getAnimatedTop();
                            f20 = this.Z1;
                            childAt.invalidate();
                        }
                        if (childAt == this.L1) {
                            L3 -= this.K1.getMeasuredHeight() - this.K1.getAnimatedTop();
                            f20 *= this.Z1;
                        }
                        if (childAt == this.O1) {
                            float f30 = (1.0f - t5Var3.f30530c) * (1.0f - f26) * (1.0f - t5Var2.f30530c) * this.Z1;
                            float f31 = f20 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.O1.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(L3);
                            t1 t1Var9 = this.K1;
                            if (t1Var9 == null || childAt != t1Var9.O1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.F1) {
                    if (this.f49725g2) {
                        childAt.setAlpha((1.0f - this.N3) * (1.0f - this.a2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.N3) * hideInterfaceAlpha);
                    }
                    i17++;
                }
                i17++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.N3) * f34);
            b2Var2.setAlpha((1.0f - this.N3) * f34);
            if (b2Var != null) {
                b2Var.setAlpha((1.0f - this.N3) * f34);
            }
            for (int i18 = 0; i18 < g2Var.getChildCount(); i18++) {
                View childAt2 = g2Var.getChildAt(i18);
                if (childAt2 != null && childAt2 != this.f49781v0) {
                    w2 w2Var = this.X0;
                    bg0 bg0Var = this.f49727h0;
                    if (childAt2 != w2Var && childAt2 != this.f49719f0 && childAt2 != this.f49723g0 && childAt2 != bg0Var && childAt2 != this.F1 && childAt2 != k2Var && childAt2 != this.f49743l0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == bg0Var) {
                            f19 = this.N2;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == k2Var) {
                            childAt2.setAlpha((1.0f - this.N3) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.N3) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.K1 != null) {
                float L4 = org.telegram.messenger.i0.L(40.0f);
                if (!y2Var.f49678f) {
                    if (this.B2) {
                        L4 += org.telegram.messenger.i0.L(46.0f);
                    }
                    if (this.C2 && this.f49746m1) {
                        L4 += org.telegram.messenger.i0.L(46.0f);
                    }
                    if (b2Var2.getVisibility() == 0) {
                        L4 = (L4 - org.telegram.messenger.i0.L(40.0f)) + b2Var2.getLayoutParams().width;
                    }
                } else {
                    float L5 = org.telegram.messenger.i0.L(46.0f);
                    L4 = org.telegram.messenger.i0.L(46.0f);
                    a1 a1Var = this.J1;
                    if (a1Var != null && a1Var.getVisibility() == 0) {
                        L4 += org.telegram.messenger.i0.L(46.0f);
                    }
                    f33 = L5;
                }
                t1 t1Var10 = this.K1;
                float f35 = -org.telegram.messenger.i0.L(10.0f);
                float f36 = -(org.telegram.messenger.i0.L(10.0f) + L4 + f33);
                float f37 = this.Z1;
                if ((this.B2 || this.f49750n1) && !y2Var.f49678f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t1Var10.f1(f35, f36, f37, z11);
                if (this.K1.getEmojiView() != null) {
                    this.K1.getEmojiView().setAlpha(this.Z1);
                }
            }
        }
    }

    public final void k0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.M3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.N3;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.M3 = ofFloat;
        ofFloat.addUpdateListener(new j1(this, 2));
        this.M3.addListener(new q1(this, z10, 1));
        this.M3.setDuration(420L);
        this.M3.setInterpolator(gr.h);
        this.M3.start();
    }

    public final void l0(Runnable runnable) {
        if (wp.r1(this.f49744l2).u2()) {
            org.telegram.ui.b.b(this.f49744l2);
            return;
        }
        int i10 = uz.f18511e0;
        if (i10 > 0 && this.T2) {
            int i11 = i10 - 1;
            uz.f18511e0 = i11;
            uz.T(i11);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(0, getContext(), this.f49739k0);
            x1Var.setTitle(dd.L0(2131744903, null));
            x1Var.n(dd.L0(2131744904, null));
            String L0 = dd.L0(2131746758, null);
            rh.d0 d0Var = new rh.d0(runnable, 13);
            x1Var.f21497n0 = L0;
            x1Var.f21498o0 = d0Var;
            String L02 = dd.L0(2131752589, null);
            rh.x6 x6Var = new rh.x6(29);
            x1Var.f21499p0 = L02;
            x1Var.f21500q0 = x6Var;
            x1Var.show();
            return;
        }
        runnable.run();
    }

    public final void m0(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f49751n2 = false;
        this.E2 = true;
        this.f49742k3 = false;
        this.f49746m1 = false;
        this.f49750n1 = false;
        long j10 = this.f49740k1;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        w2 w2Var = this.X0;
        r8 r8Var = this.W0;
        if (i13 >= 0) {
            if (j10 == e20.i(this.f49744l2).e()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.l1 = z14;
            TLRPC.User Z1 = wp.r1(this.f49744l2).Z1(Long.valueOf(this.f49740k1));
            TL_account.RequirementToContact H2 = wp.r1(this.f49744l2).H2(this.f49740k1);
            if (!e20.i(this.f49744l2).q() && (H2 instanceof TL_account.requirementToContactPremium)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f49754o1 = z15;
            this.f49762q1 = org.telegram.messenger.o5.k(H2);
            r8Var.r(Z1);
            w2Var.f49574a.getImageReceiver().i0(Z1, r8Var, null);
            U0(this.f49740k1, true, false);
        } else {
            this.l1 = false;
            this.f49746m1 = true;
            if (!this.B1.h(j10)) {
                boolean z16 = org.telegram.messenger.v2.f18578a;
            } else {
                this.f49742k3 = true;
            }
            TLRPC.Chat L0 = wp.r1(this.f49744l2).L0(Long.valueOf(-this.f49740k1));
            boolean V = org.telegram.messenger.w3.V(L0);
            this.f49750n1 = !V;
            if (!V && wp.r1(this.f49744l2).M0(-this.f49740k1) == null) {
                is.a0(this.f49744l2).F0(-this.f49740k1, true, new CountDownLatch(1), false, false, 0);
            }
            if (this.f49750n1 && !org.telegram.messenger.w3.q(L0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f49754o1 = z10;
            this.f49762q1 = wp.r1(this.f49744l2).M1(this.f49740k1);
            r8Var.q(L0);
            w2Var.f49574a.getImageReceiver().i0(L0, r8Var, null);
            U0(this.f49740k1, true, false);
        }
        if (this.f49774t1 && (this.l1 || this.f49746m1)) {
            e5 e5Var = this.B1;
            long j11 = this.f49740k1;
            a0.h hVar = e5Var.f48927m;
            x7 x7Var = (x7) hVar.f(j11);
            if (x7Var == null) {
                x7Var = new x7(e5Var.f48918a, j11, e5Var);
                hVar.k(x7Var, j11);
            }
            x7Var.b(true);
        }
        h1();
        this.f49770s1 = i10;
        if (i10 < 0) {
            this.f49770s1 = 0;
        }
        this.F0 = 0L;
        this.H0 = false;
        this.f49772s3 = null;
        this.f49776t3 = null;
        boolean z17 = this.f49746m1;
        g2 g2Var = this.L0;
        o7 o7Var = this.f49769s0;
        int i14 = 8;
        y2 y2Var = this.f49790x1;
        if (z17) {
            z0();
            if (this.K1 == null && (this.f49750n1 || y2Var.f49678f)) {
                t0();
            }
            if (this.K1 != null) {
                TLRPC.Chat L02 = wp.r1(this.f49744l2).L0(Long.valueOf(-this.f49740k1));
                t1 t1Var = this.K1;
                if (y2Var.f49678f || (!G0() && this.f49750n1 && (org.telegram.messenger.w3.q(L02) || org.telegram.messenger.w3.s0(L02)))) {
                    i14 = 0;
                }
                t1Var.setVisibility(i14);
                t1 t1Var2 = this.K1;
                boolean z18 = y2Var.f49678f;
                B0(true);
                t1Var2.g1(z18);
                t1 t1Var3 = this.K1;
                if (y2Var.f49678f && !B0(true) && (this.f49717e2 || this.K1.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                t1Var3.m1(z13, true);
                mt editField = this.K1.getEditField();
                long j12 = this.f49740k1;
                TL_stories.StoryItem storyItem = y2Var.f49675a;
                o7Var.getClass();
                editField.setText(o7.I(j12, storyItem));
                this.K1.Z0(this.f49744l2, this.f49740k1);
                this.K1.J1(L02, null);
            }
            org.telegram.ui.Components.e6 e6Var = this.f49796z0;
            org.telegram.ui.ActionBar.p6 p6Var = this.f49739k0;
            if (e6Var == null) {
                org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, false, false);
                this.f49796z0 = e6Var2;
                b2 b2Var = this.m0;
                e6Var2.setCallback(b2Var);
                this.f49796z0.u(p6Var.h(org.telegram.ui.ActionBar.t6.G6));
                this.f49796z0.w(org.telegram.messenger.i0.L(14.0f));
                this.B0 = new org.telegram.ui.Components.t5(b2Var);
            }
            b2 b2Var2 = this.f49793y0;
            if (b2Var2 != null && this.A0 == null) {
                org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(false, false, false);
                this.A0 = e6Var3;
                e6Var3.setCallback(b2Var2);
                this.A0.u(p6Var.h(org.telegram.ui.ActionBar.t6.G6));
                this.A0.w(org.telegram.messenger.i0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.t5(b2Var2);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            this.f49736j1 = getStoriesCount();
            g2Var.invalidate();
            invalidate();
        } else if (this.l1) {
            z0();
            if (y2Var.f49678f) {
                this.F1.setVisibility(8);
                if (this.K1 == null) {
                    t0();
                }
                this.K1.setVisibility(0);
            } else {
                this.F1.setVisibility(0);
                t1 t1Var4 = this.K1;
                if (t1Var4 != null) {
                    t1Var4.setVisibility(8);
                }
            }
            t1 t1Var5 = this.K1;
            if (t1Var5 != null) {
                boolean z19 = y2Var.f49678f;
                B0(true);
                t1Var5.g1(z19);
                t1 t1Var6 = this.K1;
                if (y2Var.f49678f && !B0(true) && (this.f49717e2 || this.K1.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t1Var6.m1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f49732i1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(o7Var.P0));
                    if (indexOf < 0 && !this.f49732i1.isEmpty()) {
                        if (o7Var.P0 > ((Integer) this.f49732i1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (o7Var.P0 < ((Integer) i0.a.g(1, this.f49732i1)).intValue()) {
                            indexOf = this.f49732i1.size() - 1;
                        }
                    }
                    this.f49770s1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f49720f1.isEmpty();
                    ArrayList arrayList2 = this.f49716e1;
                    if (!isEmpty) {
                        this.f49770s1 = arrayList2.size();
                    } else {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i15)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i15)).f20032id > this.B1.f48921f.get(this.f49740k1)) {
                                this.f49770s1 = i15;
                                break;
                            }
                        }
                    }
                }
            }
            d1(false);
            g2Var.invalidate();
            invalidate();
        } else {
            if (this.K1 == null) {
                t0();
            }
            if (this.f49754o1 && this.P1 == null) {
                x0();
            }
            if (this.P1 != null) {
                if (this.f49754o1 || this.f49758p1) {
                    f1();
                }
                LinearLayout linearLayout = this.P1;
                if ((this.f49754o1 && !y2Var.f49678f) || this.f49758p1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            o6 o6Var = this.S1;
            if (o6Var != null) {
                o6Var.setVisibility(8);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            t1 t1Var7 = this.K1;
            if (t1Var7 != null) {
                if (!G0() && !i20.A(this.f49740k1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                t1Var7.setVisibility(i11);
                t1 t1Var8 = this.K1;
                boolean z20 = y2Var.f49678f;
                B0(true);
                t1Var8.g1(z20);
                t1 t1Var9 = this.K1;
                if (y2Var.f49678f && !B0(true) && (this.f49717e2 || this.K1.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t1Var9.m1(z11, true);
                mt editField2 = this.K1.getEditField();
                long j13 = this.f49740k1;
                TL_stories.StoryItem storyItem2 = y2Var.f49675a;
                o7Var.getClass();
                editField2.setText(o7.I(j13, storyItem2));
                this.K1.Z0(this.f49744l2, this.f49740k1);
                TLRPC.UserFull a2 = wp.r1(this.f49744l2).a2(this.f49740k1);
                if (a2 != null) {
                    this.K1.J1(null, a2);
                } else {
                    wp.r1(this.f49744l2).U2(wp.r1(this.f49744l2).Z1(Long.valueOf(this.f49740k1)), this.f49733i2, false, null);
                }
            }
            this.f49736j1 = getStoriesCount();
            b2 b2Var3 = this.F1;
            if (b2Var3 != null) {
                b2Var3.setVisibility(8);
            }
            g2Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        k2 k2Var = this.f49773t0;
        if (k2Var.W.x()) {
            k2Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.f49774t1) {
            ((f7) this.f49797z1).d.d0();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J0 = true;
        this.N0.P();
        this.P0.P();
        this.O0.P();
        this.U2.P();
        this.W2.P();
        t1 t1Var = this.K1;
        if (t1Var != null) {
            t1Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i10 < arrayList.size()) {
                ((sg.f0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                at.f(this.f49744l2).c(this, at.T);
                at.f(this.f49744l2).c(this, at.G2);
                at.f(this.f49744l2).c(this, at.f14805v5);
                at.f(this.f49744l2).c(this, at.f14746m3);
                at.f(this.f49744l2).c(this, at.f14819x5);
                at.f(this.f49744l2).c(this, at.D5);
                at.f(this.f49744l2).c(this, at.f14683b3);
                at.f(this.f49744l2).c(this, at.f14725i3);
                at.f(this.f49744l2).c(this, at.F);
                at.e().c(this, at.f14726i4);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.N0.R();
        this.P0.R();
        this.O0.R();
        this.U2.R();
        this.W2.R();
        t1 t1Var = this.K1;
        if (t1Var != null) {
            t1Var.B0();
        }
        org.telegram.ui.Components.f5 f5Var = this.X2;
        if (f5Var != null) {
            f5Var.n(this);
            this.X2 = null;
        }
        sg.d dVar = this.V2;
        if (dVar != null) {
            dVar.d(this);
            this.V2 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i10 < arrayList.size()) {
                ((sg.f0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                at.f(this.f49744l2).n(this, at.T);
                at.f(this.f49744l2).n(this, at.G2);
                at.f(this.f49744l2).n(this, at.f14805v5);
                at.f(this.f49744l2).n(this, at.f14746m3);
                at.f(this.f49744l2).n(this, at.f14819x5);
                at.f(this.f49744l2).n(this, at.D5);
                at.f(this.f49744l2).n(this, at.f14683b3);
                at.f(this.f49744l2).n(this, at.f14725i3);
                at.f(this.f49744l2).n(this, at.F);
                at.e().n(this, at.f14726i4);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f49724g1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(72.0f));
    }

    @Override
    public final void onMeasure(int r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: th.z2.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Z1 = -1.0f;
        this.E2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        int i10;
        if (this.K1 != null && this.O2 && this.J0) {
            i1 i1Var = this.y3;
            org.telegram.messenger.i0.r(i1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.B1.B;
            this.K1.F(true);
            boolean z11 = this.f49754o1;
            y2 y2Var = this.f49790x1;
            if ((z11 && !y2Var.f49678f) || this.f49758p1) {
                this.T2 = false;
                this.K1.setEnabled(false);
                this.K1.h1(" ", z10);
            } else if (this.f49762q1 > 0) {
                this.T2 = false;
                this.K1.setEnabled(true);
                this.K1.h1(h8.T0(dd.a0(null, null, 2131743951, dd.E(this.f49762q1, ','))), z10);
            } else {
                if (!y2Var.f49678f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f49744l2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.T2 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.f49744l2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        Locale locale = Locale.US;
                        String a02 = dd.a0(null, null, 2131744906, String.format(locale, "%02d:%02d", 99, 99));
                        this.K1.setEnabled(true);
                        if (((int) this.K1.getEditField().getPaint().measureText(a02)) * 1.2f >= this.K1.getEditField().getMeasuredWidth()) {
                            t1 t1Var = this.K1;
                            String a03 = dd.a0(null, null, 2131744906, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            t1Var.e = a03;
                            t1Var.f23706f = format;
                            t1Var.F1(z10);
                        } else {
                            this.K1.h1(dd.a0(null, null, 2131744907, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        org.telegram.messenger.i0.h3(i1Var, 1000L);
                        return;
                    }
                }
                this.T2 = false;
                this.K1.setEnabled(true);
                if (y2Var.f49678f) {
                    long starsPrice = this.K1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.K1.h1(h8.Y0(false, dd.a0(null, null, 2131752004, dd.E((int) starsPrice, ',')), this.K1.O4), z10);
                        dq dqVar = this.K1.O4[0];
                        if (dqVar != null) {
                            dqVar.G = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.K1.h1(dd.L0(2131752005, null), z10);
                    return;
                }
                t1 t1Var2 = this.K1;
                if (this.f49750n1) {
                    i10 = 2131746267;
                } else {
                    i10 = 2131746272;
                }
                t1Var2.h1(dd.L0(i10, null), z10);
            }
        }
    }

    public final boolean q0() {
        if (this.f49709b3) {
            if (this.f49706a3.getReactionsWindow() != null) {
                if (this.f49729h2 > 0) {
                    org.telegram.messenger.i0.v1(this.f49706a3.getReactionsWindow().f48288c);
                    return true;
                }
                this.f49706a3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        e2 e2Var = this.S0;
        if (e2Var != null) {
            vh.p2 p2Var = e2Var.f49454c;
            if (p2Var != null) {
                p2Var.e(true);
                e2Var.f49454c = null;
            }
            e2Var.f49453b = null;
            e2Var.invalidate();
            e2Var.b(false);
        }
        k2 k2Var = this.f49773t0;
        if (k2Var.W.x()) {
            k2Var.W.f(false);
            return true;
        }
        vh.p2 p2Var2 = this.f49753o0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        vh.p2 p2Var3 = this.f49757p0;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        q30 q30Var = this.F2;
        if (q30Var != null) {
            q30Var.b(true);
        }
        u2 u2Var = this.f49710c1;
        if (u2Var != null && u2Var.f10473a) {
            u2Var.a();
            return true;
        }
        t1 t1Var = this.K1;
        if (t1Var != null && t1Var.s0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f49739k0);
            boolean z10 = this.K1.f23689c1;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            if (z10) {
                x1Var.R = dd.L0(2131751396, null);
                x1Var.T = dd.L0(2131751397, null);
            } else {
                x1Var.R = dd.L0(2131751393, null);
                x1Var.T = dd.L0(2131751394, null);
            }
            alertDialog$Builder.k(dd.L0(2131751395, null), new f1(this, 0));
            alertDialog$Builder.h(dd.L0(2131751771, null), null);
            ((f7) this.f49797z1).h(x1Var);
            return true;
        }
        nj0 nj0Var = this.O1;
        if (nj0Var != null && nj0Var.getReactionsWindow() != null && !this.O1.getReactionsWindow().f48299q) {
            this.O1.getReactionsWindow().d();
            return true;
        }
        t1 t1Var2 = this.K1;
        if (t1Var2 != null && t1Var2.q0()) {
            if (this.f49729h2 > 0) {
                org.telegram.messenger.i0.v1(this.K1.getEmojiView());
                return true;
            }
            this.K1.j0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f)) {
            t1 t1Var3 = this.K1;
            if (t1Var3 != null) {
                long j10 = this.f49740k1;
                TL_stories.StoryItem storyItem = this.f49790x1.f49675a;
                Editable editText = t1Var3.getEditText();
                this.f49769s0.getClass();
                o7.X(j10, storyItem, editText);
            }
            org.telegram.messenger.i0.v1(this.K1);
            return true;
        } else if (k2Var.getVisibility() != 0 || k2Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            k2Var.D();
            this.P2 = false;
            this.L0.invalidate();
            return true;
        }
    }

    public final void r0() {
        if (this.f49767r2 == null) {
            ag.v vVar = new ag.v(this, getContext(), this.f49739k0);
            this.f49767r2 = vVar;
            vVar.T3 = new x1(this);
            vVar.a2.g0();
            ag.v vVar2 = this.f49767r2;
            vVar2.N1 = true;
            vVar2.d1();
            ag.v vVar3 = this.f49767r2;
            vVar3.O1 = new y1(this);
            vVar3.Z0().setText(this.K1.getFieldText());
        }
    }

    public final void s0() {
        if (this.G1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f49768r3);
            this.G1 = aVar;
            aVar.setOnClickListener(new k1(this, 1));
            addView(this.G1, w7.b6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i10) {
        this.f49744l2 = i10;
        this.B1 = wp.r1(i10).f19140h0;
        this.T0.f39017b = i10;
        nj0 nj0Var = this.O1;
        if (nj0Var != null) {
            nj0Var.setCurrentAccount(i10);
            this.O1.p(null, null, true);
        }
        nj0 nj0Var2 = this.f49706a3;
        if (nj0Var2 != null) {
            nj0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(v2 v2Var) {
        this.f49797z1 = v2Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.O2 != z10) {
            this.O2 = z10;
            if (z10) {
                this.N0.f14385h1 = 1.0f;
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.f49774t1) {
            this.f49779u2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10;
        if (f7 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.K0 != z10) {
            this.K0 = z10;
            this.L0.invalidate();
            if (this.f49774t1 && this.f49769s0.f49304a && Build.VERSION.SDK_INT < 33) {
                ew ewVar = this.F3;
                if (z10) {
                    org.telegram.messenger.i0.r(ewVar);
                    org.telegram.messenger.i0.h3(ewVar, 250L);
                    return;
                }
                org.telegram.messenger.i0.r(ewVar);
                o7 o7Var = ((f7) this.f49797z1).d;
                o7Var.l1 = true;
                o7Var.d0();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            ag.c2 c2Var = this.N0;
            if (z10) {
                c2Var.Q0();
                c2Var.f14409t0 = false;
            } else {
                c2Var.P0(false);
                c2Var.f14409t0 = true;
            }
            this.G0 = 0L;
            this.L0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f49739k0;
        t1 t1Var = new t1(this, org.telegram.messenger.i0.W(getContext()), this, new org.telegram.ui.web.a0(2, p6Var));
        this.K1 = t1Var;
        mt editField = t1Var.getEditField();
        editField.getClass();
        et etVar = new et(editField, 0);
        editField.f24019t0 = etVar;
        etVar.q(true);
        editField.f24019t0.u(editField.f24027x0);
        editField.f24019t0.w(editField.getPaint().getTextSize());
        et etVar2 = new et(editField, 1);
        editField.f24021u0 = etVar2;
        etVar2.f25744b = 5;
        etVar2.u(editField.f24027x0);
        editField.f24021u0.w(editField.getPaint().getTextSize());
        this.K1.getEditField().setScaleX(0.0f);
        this.K1.setOverrideKeyboardAnimation(true);
        this.K1.setClipChildren(false);
        this.K1.setDelegate(new u1(this));
        setDelegate(this.K1);
        t1 t1Var2 = this.K1;
        t1Var2.f23820y4 = false;
        t1Var2.f23825z4 = true;
        if (this.f49790x1.f49678f) {
            t1Var2.T0(false, false, false);
        } else {
            t1Var2.T0(true, true, false);
        }
        this.K1.updateColors();
        t1 t1Var3 = this.K1;
        t1Var3.A4 = true;
        addView(t1Var3, w7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.f49792x3 != null) {
            this.K1.O1(false);
        }
        this.K1.G2 = this.f49733i2;
        k2.t0 t0Var = this.f49783v2;
        ((ArrayList) t0Var.f10771g).add(this.L0);
        ((ArrayList) t0Var.f10771g).add(this);
        if (this.J0) {
            this.K1.C0();
        }
        p0(false);
        if (G0()) {
            this.K1.setVisibility(8);
        }
        bh.k kVar = new bh.k(getContext(), p6Var, this.f49768r3, this.f49756o3);
        this.L1 = kVar;
        kVar.setOnClickListener(new f1(this, 1));
        addView(this.L1, w7.b6.e(57, 300, 85));
        this.L1.setVisibility(8);
        this.K1.setSideButtonsForAttach(this.L1);
        this.f49765r0 = getChildCount();
    }

    public final void u0() {
        if (this.S1 != null) {
            return;
        }
        o6 o6Var = new o6(getContext(), this.f49739k0);
        this.S1 = o6Var;
        o6Var.setOnClickListener(new k1(this, 4));
        this.S1.setAlpha(0.0f);
        this.S1.setVisibility(8);
        addView(this.S1, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z10;
        if (this.J1 == null && getContext() != null) {
            a1 a1Var = new a1(getContext(), this.f49768r3);
            this.J1 = a1Var;
            a1Var.setOnClickListener(new k1(this, 5));
            a1 a1Var2 = this.J1;
            s0 s0Var = s0.W;
            boolean z11 = true;
            if (s0Var != null && s0Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1Var2.b(z10, false);
            a1 a1Var3 = this.J1;
            s0 s0Var2 = s0.W;
            if (s0Var2 != null && !s0Var2.m()) {
                z11 = false;
            }
            a1Var3.a(z11, false);
            addView(this.J1, w7.b6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void w0() {
        if (this.I1 == null && getContext() != null) {
            this.H1 = new d1(getContext(), this.f49744l2);
            e1 e1Var = new e1(getContext(), this.H1, this.f49768r3);
            this.I1 = e1Var;
            e1Var.setOnClickListener(new k1(this, 6));
            this.I1.setOnLongClickListener(new h1(this, 1));
            addView(this.I1, w7.b6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.H1, w7.b6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void x0() {
        int i10;
        if (this.P1 != null) {
            return;
        }
        if (this.K1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.P1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(2131231975);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.Q1 = textView;
        textView.setTextColor(-8026747);
        this.Q1.setTextSize(1, 16.0f);
        TextView textView2 = this.Q1;
        if (this.f49750n1) {
            i10 = 2131744684;
        } else {
            i10 = 2131744519;
        }
        textView2.setText(dd.L0(i10, null));
        TextView textView3 = new TextView(getContext());
        this.R1 = textView3;
        textView3.setTextColor(-1);
        this.R1.setTextSize(1, 12.0f);
        TextView textView4 = this.R1;
        int L = org.telegram.messenger.i0.L(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.R1.setGravity(17);
        w7.e6.a(this.R1);
        this.R1.setText(dd.L0(2131744518, null));
        this.R1.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        this.P1.addView(imageView, w7.b6.t(22, 22, 16, 12, 1, 4, 0));
        this.P1.addView(this.Q1, w7.b6.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.P1.addView(this.R1, w7.b6.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.K1.addView(this.P1, w7.b6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.K2 != null) {
            return;
        }
        cl0 cl0Var = new cl0(getContext(), 3);
        this.K2 = cl0Var;
        cl0Var.setTextSize(1, 14.0f);
        this.K2.setTextColor(i0.b.f(0.5f, -16777216, -1));
        this.K2.setGravity(19);
        this.K2.setText(dd.L0(2131744517, null));
        addView(this.K2, w7.b6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.F1 != null) {
            return;
        }
        b2 b2Var = new b2(this, getContext(), 0);
        this.F1 = b2Var;
        b2Var.setClickable(true);
        addView(this.F1, w7.b6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        ih.c cVar = new ih.c(this, getContext());
        this.f49755o2 = cVar;
        cVar.setOnClickListener(new k1(this, 0));
        this.F1.addView(this.f49755o2, w7.b6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        oh.b bVar = new oh.b(1, getContext(), false);
        this.f49741k2 = bVar;
        bVar.setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        this.F1.addView(this.f49741k2, w7.b6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f49737j2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f49737j2.setTextColor(-1);
        this.F1.addView(this.f49737j2, w7.b6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f49724g1.f49626s);
        ih.c cVar2 = this.f49755o2;
        int L = org.telegram.messenger.i0.L(15.0f);
        int o10 = i0.b.o(-1, 120);
        cVar2.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.t6.O(i0.b.o(-1, 120), -org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f)));
    }
}
