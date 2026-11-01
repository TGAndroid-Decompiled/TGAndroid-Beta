package ph;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.u9;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.messenger.x9;
import org.telegram.messenger.y9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
import rh.e6;
import rh.h8;
import vh.k4;
import w7.b6;
public class g4 extends ha implements vs, x9 {
    public final boolean P1;
    public final int Q1;
    public final long R1;
    public final boolean S1;
    public final boolean T1;
    public final TL_stars.StarGift U1;
    public u9 V1;
    public final kg.m W1;
    public final String X1;
    public final Runnable Y1;
    public final a4 Z1;
    public final LinearLayout a2;
    public final long f45081b2;
    public final org.telegram.ui.Cells.s0 f45082c2;
    public final TLRPC.MessageAction f45083d2;
    public final kj f45084e2;
    public final LinearLayout f45085f2;
    public final vh.d f45086g2;
    public final FrameLayout f45087h2;
    public boolean f45088i2;
    public boolean f45089j2;
    public boolean f45090k2;
    public final b4 f45091l2;
    public q51 f45092m2;
    public int f45093n2;
    public final dq[] f45094o2;
    public boolean f45095p2;
    public final hi.c f45096q2;

    public g4(Context context, int i10, final TL_stars.StarGift starGift, final kg.m mVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j11;
        Integer num;
        Integer num2;
        int w02;
        int i11;
        boolean z12;
        int i12;
        this.f45089j2 = false;
        this.f45090k2 = false;
        this.f45093n2 = -2;
        this.f45094o2 = new dq[1];
        this.f45095p2 = false;
        boolean z13 = j10 == e20.i(i10).e();
        this.P1 = z13;
        this.M0 = 4;
        O();
        this.f26738z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-10.0f);
        if (z13) {
            this.f45088i2 = true;
        }
        this.Q1 = i10;
        this.R1 = j10;
        this.U1 = starGift;
        if (starGift == null || !starGift.auction) {
            f7 = 4.0f;
        } else {
            f7 = 4.0f;
            this.V1 = y9.c(i10).l(starGift.f20022id, this);
        }
        this.W1 = mVar;
        this.Y1 = runnable;
        this.S1 = z10;
        this.T1 = z11;
        if (z10) {
            this.f45089j2 = true;
        } else if (z11) {
            this.f45089j2 = false;
        }
        this.f26730r1 = 0.2f;
        if (j10 >= 0) {
            j11 = 0;
            this.X1 = i20.k(wp.r1(i10).Z1(Long.valueOf(j10)));
        } else {
            j11 = 0;
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
            this.X1 = L0 == null ? "" : L0.title;
        }
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, this.I0, false);
        this.f45082c2 = s0Var;
        s0Var.setDelegate(new Object());
        a4 a4Var = new a4(this, context);
        this.Z1 = a4Var;
        Drawable e = k4.e(null, i10, j10, t6.I.q());
        a4Var.U(e);
        hi.c cVar = new hi.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof jb0) {
                jb0 jb0Var = (jb0) e;
                if (jb0Var.f27348q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = jb0Var.f27331a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        if (num != null) {
            w02 = num.intValue();
            num2 = num;
        } else {
            num2 = num;
            w02 = t6.w0(t6.f21002h5, this.I0);
        }
        cVar.a(w02);
        this.f45096q2 = num2 == null ? cVar : null;
        vg.f fVar = new vg.f(cVar, cVar, cVar);
        p6 p6Var = this.I0;
        int i13 = t6.f21002h5;
        fVar.o(new wg.b(i13, p6Var));
        fVar.q(org.telegram.messenger.i0.L(20.0f));
        fVar.p(org.telegram.messenger.i0.L(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.f45083d2 = tL_messageActionStarGift;
            z12 = z13;
            i12 = i13;
        } else {
            boolean z14 = z13;
            i11 = 6;
            if (mVar != null && mVar.f11180b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = mVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = mVar.a();
                long e7 = mVar.e();
                tL_messageActionGiftCode.amount = e7;
                z12 = z14;
                if (mVar.h != null) {
                    i12 = i13;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftCode.currency) - 6) * e7);
                } else {
                    i12 = i13;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.f45083d2 = tL_messageActionGiftCode;
            } else {
                z12 = z14;
                i12 = i13;
                if (mVar != null && mVar.f11179a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = mVar.d();
                    tL_messageActionGiftPremium.currency = mVar.a();
                    long e10 = mVar.e();
                    tL_messageActionGiftPremium.amount = e10;
                    if (mVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftPremium.currency) - 6) * e10);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.f45083d2 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.f45083d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.f45089j2;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j11;
            tL_messageActionStarGift2.convert_stars = z15 ? j11 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f19815id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = wp.r1(i10).y1(e20.i(i10).e());
        tL_messageService.peer_id = wp.r1(i10).y1(j10);
        tL_messageService.action = this.f45083d2;
        long M1 = starGift != null ? wp.r1(i10).M1(j10) : j11;
        this.f45081b2 = M1;
        kj kjVar = new kj(i10, tL_messageService, false, false);
        this.f45084e2 = kjVar;
        s0Var.f0(kjVar, true);
        linearLayout.addView(s0Var, b6.t(-1, -1, 119, 0, M1 > j11 ? 0 : 8, 0, 8));
        a4Var.addView(linearLayout, b6.e(-1, -1, 119));
        b4 b4Var = new b4(this, context, (vu0) this.f21587b, dd.L0(starGift != null ? 2131750129 : 2131750128, null), wp.r1(i10).E6, this.I0, fVar, i10);
        this.f45091l2 = b4Var;
        org.telegram.ui.Cells.h3 h3Var = b4Var.f22066b;
        h3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.l3());
        h3Var.Q = true;
        b4Var.setShowLimitWhenNear(50);
        this.H1 = h3Var;
        b4Var.setShowLimitOnFocus(true);
        b4Var.setDivider(false);
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(b4Var, 3);
        h3Var.getEditText().setImeOptions(i11);
        h3Var.getEditText().setOnEditorActionListener(new m.s2(fVar2, 1));
        int i14 = this.f21616t0;
        b4Var.setPadding(i14, 0, i14, 0);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47938m = false;
        jVar.n(350L);
        jVar.o(gr.h);
        jVar.D = 40L;
        this.f26724k1.setItemAnimator(jVar);
        this.f45092m2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f45085f2 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(t6.w0(i12, this.I0));
        int i15 = this.f21616t0;
        int i16 = i12;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i15, 0, i15, 0));
        int i17 = this.f21616t0;
        linearLayout2.setPadding(i17, 0, i17, 0);
        this.f21587b.addView(linearLayout2, b6.e(-1, -2, 87));
        View view = new View(context);
        a7.i(t6.K5, view, this.I0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b6.z(-1.0f), b6.z(1.0f / org.telegram.messenger.i0.f16171p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i18 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(6.0f);
        int i19 = t6.f20873a7;
        Drawable d02 = t6.d0(L, t6.w0(i19, this.I0));
        w6 N = a7.N(i19);
        p6 p6Var2 = this.I0;
        frameLayout.setBackground(d02);
        a7.k(frameLayout, d02, N, null, p6Var2);
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f45087h2 = frameLayout2;
            frameLayout2.addView(frameLayout, b6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            a7.i(i16, frameLayout2, this.I0);
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, b6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f45087h2 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i20 = t6.G6;
        a7.V(textView, i20, this.I0);
        if (starGift != null) {
            textView.setText(dd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(21);
        l4.setTypeface(org.telegram.messenger.i0.o());
        a7.V(l4, i20, this.I0);
        if (starGift != null) {
            l4.setText(dd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(l4, b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View d4Var = new d4(context, starGift, i18);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int i21 = t6.Ci;
        Drawable d03 = t6.d0(L2, t6.w0(i21, this.I0));
        w6 N2 = a7.N(i21);
        p6 p6Var3 = this.I0;
        d4Var.setBackground(d03);
        a7.k(d4Var, d03, N2, null, p6Var3);
        frameLayout.addView(d4Var, b6.e(-1, -1, 119));
        e4 e4Var = new e4(context, i18);
        e4Var.setWillNotDraw(false);
        frameLayout.addView(e4Var, b6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(dd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        e4Var.addView(textView2, b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(dd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        e4Var.addView(textView3, b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        vh.d dVar = new vh.d(context, this.I0, true);
        this.f45086g2 = dVar;
        dVar.f();
        g1(false);
        linearLayout2.addView(dVar, b6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j10, context, runnable, starGift));
        dh.f fVar3 = this.f26723j1;
        this.G1 = true;
        fVar3.k1(true);
        this.f45092m2.O(false);
        this.f26723j1.h1(this.f45092m2.D.size(), org.telegram.messenger.i0.L(200.0f));
        uk0 uk0Var = this.f26724k1;
        int i22 = this.f21616t0;
        uk0Var.setPadding(i22, 0, i22, org.telegram.messenger.i0.L(68 + ((starGift != null && starGift.limited && this.f45087h2 == null) ? 40 : 0)));
        this.f26724k1.i(new f4(this));
        this.f26724k1.setOnItemClickListener(new hk0() {
            @Override
            public final void f(int i23, View view2) {
                boolean z16;
                long j12;
                TL_stars.StarGift starGift2;
                g4 g4Var = g4.this;
                TL_stars.StarGift starGift3 = g4Var.U1;
                boolean z17 = g4Var.P1;
                org.telegram.ui.Cells.s0 s0Var2 = g4Var.f45082c2;
                TLRPC.MessageAction messageAction2 = g4Var.f45083d2;
                kj kjVar2 = g4Var.f45084e2;
                q51 q51Var = g4Var.f45092m2;
                if (!g4Var.G1) {
                    i23--;
                }
                b51 G = q51Var.G(i23);
                if (G != null) {
                    int i24 = G.d;
                    if (i24 == 1) {
                        boolean z18 = !g4Var.f45088i2;
                        g4Var.f45088i2 = z18;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z18;
                        }
                        kjVar2.Y5();
                        s0Var2.f0(kjVar2, true);
                        g4Var.f45092m2.O(true);
                    } else if (i24 == 2) {
                        if (!z10 && !z11) {
                            boolean z19 = g4Var.f45089j2;
                            g4Var.f45089j2 = !z19;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z19 && (!z17 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z16;
                                long j13 = 0;
                                if (z17 || z19) {
                                    j12 = 0;
                                } else {
                                    j12 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j12;
                                if (z19) {
                                    j13 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j13;
                            }
                            kjVar2.Y5();
                            s0Var2.f0(kjVar2, true);
                            g4Var.f45092m2.O(true);
                            g4Var.g1(true);
                            return;
                        }
                        int i25 = -g4Var.f45093n2;
                        g4Var.f45093n2 = i25;
                        org.telegram.messenger.i0.F3(i25, view2, null);
                    } else if (i24 == 3) {
                        boolean z20 = g4Var.f45090k2;
                        g4Var.f45090k2 = !z20;
                        boolean z21 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        kg.m mVar2 = mVar;
                        if (z21) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = mVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = mVar2.a();
                                long e11 = mVar2.e();
                                tL_messageActionGiftPremium2.amount = e11;
                                if (mVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftPremium2.currency) - 6) * e11);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z20) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = mVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = mVar2.a();
                                long e12 = mVar2.e();
                                tL_messageActionGiftCode2.amount = e12;
                                if (mVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftCode2.currency) - 6) * e12);
                                }
                            }
                        }
                        kjVar2.Y5();
                        s0Var2.f0(kjVar2, true);
                        g4Var.f45092m2.O(true);
                        g4Var.g1(true);
                    }
                }
            }
        });
        this.l1.setTitle(O0());
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.Q1, 0, true, new u3(this, 0), this.I0);
        this.f45092m2 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        int i10;
        if (this.P1) {
            i10 = 2131749947;
        } else {
            i10 = 2131749953;
        }
        return dd.L0(i10, null);
    }

    @Override
    public final void c(u9 u9Var) {
        this.V1 = u9Var;
    }

    public final TLRPC.TL_textWithEntities d1() {
        if (wp.r1(this.Q1).M1(this.R1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.f45083d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
            return null;
        }
        return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.y3) {
            g1(true);
            q51 q51Var = this.f45092m2;
            if (q51Var != null && this.W1 != null) {
                q51Var.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        b4 b4Var = this.f45091l2;
        org.telegram.ui.Cells.h3 h3Var = b4Var.f22066b;
        org.telegram.ui.Cells.h3 h3Var2 = b4Var.f22066b;
        if (h3Var.getEmojiPadding() > 0) {
            h3Var2.k(true);
        } else if (h3Var2.f32315w) {
            h3Var2.d();
        } else {
            h3Var2.r();
            if (this.V1 != null) {
                y9.c(this.Q1).n(this.V1.f18403b, this);
            }
            this.f45095p2 = true;
            super.dismiss();
        }
    }

    public cc e1() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return cc.a0(T);
    }

    public final void f1(boolean z10) {
        int i10 = this.Q1;
        wp r12 = wp.r1(i10);
        long j10 = this.R1;
        TLRPC.UserFull a2 = r12.a2(j10);
        TLObject d22 = wp.r1(i10).d2(j10);
        int i11 = 0;
        if (a2 != null && (d22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) d22;
            user.premium = true;
            wp.r1(i10).U3(user, true, false);
            at.f(i10).k(at.E0, Long.valueOf(user.f19943id), a2);
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.f26727o1;
        if (k2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) k2Var.getParentActivity()).M().getFragmentStack());
            z4 parentLayout = k2Var.getParentLayout();
            int size = arrayList.size();
            un unVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                if (k2Var2 instanceof un) {
                    unVar = (un) k2Var2;
                    if (unVar.a() != j10) {
                        k2Var2.removeSelfFromStack();
                    }
                } else if (k2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == k2Var2) {
                        k2Var2.finishFragment();
                    } else {
                        k2Var2.removeSelfFromStack();
                    }
                }
            }
            if (unVar == null || unVar.a() != j10) {
                ((ActionBarLayout) parentLayout).S(new un(org.telegram.ui.Cells.f1.k(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void g1(boolean z10) {
        CharSequence charSequence;
        long j10;
        String str;
        u9 u9Var = this.V1;
        int i10 = this.Q1;
        vh.d dVar = this.f45086g2;
        if (u9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.V1.g(currentTime)) {
                int i11 = this.V1.d.auction_start_date - currentTime;
                dVar.i(dd.L0(2131750349, null), z10, true);
                dVar.g(dd.a0(null, null, 2131750344, dd.c0(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.V1.f18405f;
            if (tL_starGiftAuctionState != null) {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(dd.L0(2131750354, null), z10, true);
                dVar.g(dd.a0(null, null, 2131750330, dd.c0(i12)), z10);
                return;
            }
            dVar.i(dd.L0(2131750354, null), z10, true);
            dVar.g(null, z10);
            return;
        }
        TL_stars.StarGift starGift = this.U1;
        dq[] dqVarArr = this.f45094o2;
        if (starGift != null) {
            long j11 = e6.y(i10, false).p().amount;
            long j12 = starGift.stars;
            long j13 = 0;
            if (this.f45089j2) {
                j10 = starGift.upgrade_stars;
            } else {
                j10 = 0;
            }
            long j14 = j12 + j10;
            if (!TextUtils.isEmpty(this.f45091l2.getText())) {
                j13 = this.f45081b2;
            }
            long j15 = j14 + j13;
            if (this.P1) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.i(h8.Y0(false, dd.H(',', str, (int) j15), dqVarArr), z10, true);
            if (e6.y(i10, false).e && j15 > j11) {
                dVar.g(dd.H(',', "Gift2SendYourBalance", (int) j11), z10);
                return;
            } else {
                dVar.g(null, z10);
                return;
            }
        }
        kg.m mVar = this.W1;
        if (mVar != null) {
            if (this.f45090k2) {
                dVar.i(h8.U0(dd.a0(null, null, 2131750003, dd.E(mVar.g(), ',')), 1.0f, dqVarArr), z10, true);
                dqVarArr[0].G = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(dd.a0(null, null, 2131750004, mVar.c())), z10, true);
            }
            dVar.g(charSequence, z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.Q1).c(this, at.y3);
    }

    @Override
    public final void onBackPressed() {
        b4 b4Var = this.f45091l2;
        org.telegram.ui.Cells.h3 h3Var = b4Var.f22066b;
        org.telegram.ui.Cells.h3 h3Var2 = b4Var.f22066b;
        if (h3Var.getEmojiPadding() > 0) {
            h3Var2.k(true);
        } else if (h3Var2.f32315w) {
            h3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.Q1).n(this, at.y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.f45085f2;
            if (linearLayout != null) {
                int w02 = t6.w0(t6.f21002h5, this.I0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i10 = this.f21616t0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i10, 0, i10, 0));
                }
            }
            hi.c cVar = this.f45096q2;
            if (cVar != null) {
                cVar.a(t6.w0(t6.f21002h5, this.I0));
                ViewGroup viewGroup = this.f21587b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        b4 b4Var = this.f45091l2;
        if (b4Var != null) {
            b4Var.f22066b.s();
        }
        super.show();
    }

    @Override
    public final void w() {
        this.f26724k1.a0();
    }
}
