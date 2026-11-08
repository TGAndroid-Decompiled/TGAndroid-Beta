package zh;

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
import bi.dd;
import bi.ea;
import c8.ha;
import fi.y5;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.messenger.t10;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public class a4 extends na implements ls, v9 {
    public final boolean P1;
    public final int Q1;
    public final long R1;
    public final boolean S1;
    public final boolean T1;
    public final TL_stars.StarGift U1;
    public s9 V1;
    public final ug.j W1;
    public final String X1;
    public final Runnable Y1;
    public final u3 Z1;
    public final LinearLayout f60208a2;
    public final long f60209b2;
    public final org.telegram.ui.Cells.t0 f60210c2;
    public final TLRPC.MessageAction d2;
    public final ij f60211e2;
    public final LinearLayout f60212f2;
    public final fi.d f60213g2;
    public final FrameLayout f60214h2;
    public boolean f60215i2;
    public boolean f60216j2;
    public boolean f60217k2;
    public final v3 f60218l2;
    public l41 f60219m2;
    public int f60220n2;
    public final wp[] f60221o2;
    public boolean f60222p2;
    public final ri.c f60223q2;

    public a4(Context context, int i7, final TL_stars.StarGift starGift, final ug.j jVar, long j3, Runnable runnable, final boolean z9, final boolean z10) {
        super(context, null, true, false, 2, null);
        float f10;
        long j10;
        Integer num;
        Integer num2;
        int w02;
        int i10;
        boolean z11;
        int i11;
        this.f60216j2 = false;
        this.f60217k2 = false;
        this.f60220n2 = -2;
        this.f60221o2 = new wp[1];
        this.f60222p2 = false;
        boolean z12 = j3 == p10.i(i7).e();
        this.P1 = z12;
        this.M0 = 4;
        N();
        this.f36290z1 = org.telegram.messenger.g0.L(4.0f);
        this.A1 = org.telegram.messenger.g0.L(-10.0f);
        if (z12) {
            this.f60215i2 = true;
        }
        this.Q1 = i7;
        this.R1 = j3;
        this.U1 = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.V1 = w9.c(i7).l(starGift.f27185id, this);
        }
        this.W1 = jVar;
        this.Y1 = runnable;
        this.S1 = z9;
        this.T1 = z10;
        if (z9) {
            this.f60216j2 = true;
        } else if (z10) {
            this.f60216j2 = false;
        }
        this.f36282r1 = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.X1 = t10.k(qp.s1(i7).a2(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            this.X1 = M0 == null ? "" : M0.title;
        }
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, this.I0, false);
        this.f60210c2 = t0Var;
        t0Var.setDelegate(new Object());
        u3 u3Var = new u3(this, context);
        this.Z1 = u3Var;
        Drawable e10 = y5.e(null, i7, j3, k6.I.q());
        u3Var.U(e10);
        ri.c cVar = new ri.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof qa0) {
                qa0 qa0Var = (qa0) e10;
                if (qa0Var.f37266q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = qa0Var.f37248a;
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
            w02 = k6.w0(k6.f27925h5, this.I0);
        }
        cVar.a(w02);
        this.f60223q2 = num2 == null ? cVar : null;
        fh.g gVar = new fh.g(cVar, cVar, cVar);
        f6 f6Var = this.I0;
        int i12 = k6.f27925h5;
        gVar.p(new gh.b(i12, f6Var));
        gVar.r(org.telegram.messenger.g0.L(20.0f));
        gVar.q(org.telegram.messenger.g0.L(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f60208a2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i10 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.d2 = tL_messageActionStarGift;
            z11 = z12;
            i11 = i12;
        } else {
            boolean z13 = z12;
            i10 = 6;
            if (jVar != null && jVar.f56639b != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = jVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = jVar.a();
                long e11 = jVar.e();
                tL_messageActionGiftCode.amount = e11;
                z11 = z13;
                if (jVar.h != null) {
                    i11 = i12;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode.currency) - 6) * e11);
                } else {
                    i11 = i12;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.d2 = tL_messageActionGiftCode;
            } else {
                z11 = z13;
                i11 = i12;
                if (jVar != null && jVar.f56638a != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = jVar.d();
                    tL_messageActionGiftPremium.currency = jVar.a();
                    long e12 = jVar.e();
                    tL_messageActionGiftPremium.amount = e12;
                    if (jVar.h != null) {
                        tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium.currency) - 6) * e12);
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.d2 = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z14 = this.f60216j2;
            tL_messageActionStarGift2.can_upgrade = z14 || (z11 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z11 && z14) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z14 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.f26977id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = qp.s1(i7).z1(p10.i(i7).e());
        tL_messageService.peer_id = qp.s1(i7).z1(j3);
        tL_messageService.action = this.d2;
        long N1 = starGift != null ? qp.s1(i7).N1(j3) : j10;
        this.f60209b2 = N1;
        ij ijVar = new ij(i7, tL_messageService, false, false);
        this.f60211e2 = ijVar;
        t0Var.g0(ijVar, true);
        linearLayout.addView(t0Var, ha.t(-1, -1, 119, 0, N1 > j10 ? 0 : 8, 0, 8));
        u3Var.addView(linearLayout, ha.e(-1, -1, 119));
        v3 v3Var = new v3(this, context, (rt0) this.f28619b, id.M0(starGift != null ? 2131750121 : 2131750120, null), qp.s1(i7).D6, this.I0, gVar, i7);
        this.f60218l2 = v3Var;
        org.telegram.ui.Cells.f3 f3Var = v3Var.f29252b;
        f3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        f3Var.Q = true;
        v3Var.setShowLimitWhenNear(50);
        this.H1 = f3Var;
        v3Var.setShowLimitOnFocus(true);
        v3Var.setDivider(false);
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(v3Var, 3);
        f3Var.getEditText().setImeOptions(i10);
        f3Var.getEditText().setOnEditorActionListener(new m.s2(fVar, 1));
        int i13 = this.f28649t0;
        v3Var.setPadding(i13, 0, i13, 0);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f57071m = false;
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.D = 40L;
        this.f36277k1.setItemAnimator(kVar);
        this.f60219m2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f60212f2 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(i11, this.I0));
        int i14 = this.f28649t0;
        int i15 = i11;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i14, 0, i14, 0));
        int i16 = this.f28649t0;
        linearLayout2.setPadding(i16, 0, i16, 0);
        this.f28619b.addView(linearLayout2, ha.e(-1, -2, 87));
        View view = new View(context);
        r6.i(k6.K5, view, this.I0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ha.z(-1.0f), ha.z(1.0f / org.telegram.messenger.g0.f22562p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i17 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i18 = k6.f27796a7;
        Drawable d02 = k6.d0(L, k6.w0(i18, this.I0));
        n6 N = r6.N(i18);
        f6 f6Var2 = this.I0;
        frameLayout.setBackground(d02);
        r6.k(frameLayout, d02, N, null, f6Var2);
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f60214h2 = frameLayout2;
            frameLayout2.addView(frameLayout, ha.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            r6.i(i15, frameLayout2, this.I0);
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, ha.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.f60214h2 = null;
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i19 = k6.G6;
        r6.V(textView, i19, this.I0);
        if (starGift != null) {
            textView.setText(id.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView i20 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i20.setTextSize(1, 13.0f);
        i20.setGravity(21);
        i20.setTypeface(org.telegram.messenger.g0.o());
        r6.V(i20, i19, this.I0);
        if (starGift != null) {
            i20.setText(id.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(i20, ha.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View x3Var = new x3(context, starGift, i17);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i21 = k6.Ci;
        Drawable d03 = k6.d0(L2, k6.w0(i21, this.I0));
        n6 N2 = r6.N(i21);
        f6 f6Var3 = this.I0;
        x3Var.setBackground(d03);
        r6.k(x3Var, d03, N2, null, f6Var3);
        frameLayout.addView(x3Var, ha.e(-1, -1, 119));
        y3 y3Var = new y3(context, i17);
        y3Var.setWillNotDraw(false);
        frameLayout.addView(y3Var, ha.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(id.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        y3Var.addView(textView2, ha.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(id.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        y3Var.addView(textView3, ha.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        fi.d dVar = new fi.d(context, this.I0, true);
        this.f60213g2 = dVar;
        dVar.f();
        g1(false);
        linearLayout2.addView(dVar, ha.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new m(this, j3, context, runnable, starGift));
        jg.b0 b0Var = this.f36276j1;
        this.G1 = true;
        b0Var.k1(true);
        this.f60219m2.O(false);
        this.f36276j1.h1(this.f60219m2.D.size(), org.telegram.messenger.g0.L(200.0f));
        pj0 pj0Var = this.f36277k1;
        int i22 = this.f28649t0;
        pj0Var.setPadding(i22, 0, i22, org.telegram.messenger.g0.L(68 + ((starGift != null && starGift.limited && this.f60214h2 == null) ? 40 : 0)));
        this.f36277k1.i(new z3(this));
        this.f36277k1.setOnItemClickListener(new bj0() {
            @Override
            public final void c(int i23, View view2) {
                boolean z15;
                long j11;
                TL_stars.StarGift starGift2;
                a4 a4Var = a4.this;
                TL_stars.StarGift starGift3 = a4Var.U1;
                boolean z16 = a4Var.P1;
                org.telegram.ui.Cells.t0 t0Var2 = a4Var.f60210c2;
                TLRPC.MessageAction messageAction2 = a4Var.d2;
                ij ijVar2 = a4Var.f60211e2;
                l41 l41Var = a4Var.f60219m2;
                if (!a4Var.G1) {
                    i23--;
                }
                x31 G = l41Var.G(i23);
                if (G != null) {
                    int i24 = G.d;
                    if (i24 == 1) {
                        boolean z17 = !a4Var.f60215i2;
                        a4Var.f60215i2 = z17;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                        }
                        ijVar2.b6();
                        t0Var2.g0(ijVar2, true);
                        a4Var.f60219m2.O(true);
                    } else if (i24 == 2) {
                        if (!z9 && !z10) {
                            boolean z18 = a4Var.f60216j2;
                            a4Var.f60216j2 = !z18;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                if (z18 && (!z16 || (starGift2 = starGift) == null || !starGift2.can_upgrade)) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                tL_messageActionStarGift3.can_upgrade = z15;
                                long j12 = 0;
                                if (z16 || z18) {
                                    j11 = 0;
                                } else {
                                    j11 = starGift3.upgrade_stars;
                                }
                                tL_messageActionStarGift3.upgrade_stars = j11;
                                if (z18) {
                                    j12 = starGift3.convert_stars;
                                }
                                tL_messageActionStarGift3.convert_stars = j12;
                            }
                            ijVar2.b6();
                            t0Var2.g0(ijVar2, true);
                            a4Var.f60219m2.O(true);
                            a4Var.g1(true);
                            return;
                        }
                        int i25 = -a4Var.f60220n2;
                        a4Var.f60220n2 = i25;
                        org.telegram.messenger.g0.G3(i25, view2, null);
                    } else if (i24 == 3) {
                        boolean z19 = a4Var.f60217k2;
                        a4Var.f60217k2 = !z19;
                        boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                        ug.j jVar2 = jVar;
                        if (z20) {
                            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                            if (!z19) {
                                tL_messageActionGiftPremium2.currency = "XTR";
                                tL_messageActionGiftPremium2.amount = jVar2.g();
                            } else {
                                tL_messageActionGiftPremium2.currency = jVar2.a();
                                long e13 = jVar2.e();
                                tL_messageActionGiftPremium2.amount = e13;
                                if (jVar2.h != null) {
                                    tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium2.currency) - 6) * e13);
                                }
                            }
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                            if (!z19) {
                                tL_messageActionGiftCode2.currency = "XTR";
                                tL_messageActionGiftCode2.amount = jVar2.g();
                            } else {
                                tL_messageActionGiftCode2.currency = jVar2.a();
                                long e14 = jVar2.e();
                                tL_messageActionGiftCode2.amount = e14;
                                if (jVar2.h != null) {
                                    tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode2.currency) - 6) * e14);
                                }
                            }
                        }
                        ijVar2.b6();
                        t0Var2.g0(ijVar2, true);
                        a4Var.f60219m2.O(true);
                        a4Var.g1(true);
                    }
                }
            }
        });
        this.l1.setTitle(O0());
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.f36277k1, getContext(), this.Q1, 0, true, new o3(this, 0), this.I0);
        this.f60219m2 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.P1) {
            i7 = 2131749939;
        } else {
            i7 = 2131749945;
        }
        return id.M0(i7, null);
    }

    @Override
    public final void c(s9 s9Var) {
        this.V1 = s9Var;
    }

    public final TLRPC.TL_textWithEntities d1() {
        if (qp.s1(this.Q1).N1(this.R1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.d2;
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25114y3) {
            g1(true);
            l41 l41Var = this.f60219m2;
            if (l41Var != null && this.W1 != null) {
                l41Var.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        v3 v3Var = this.f60218l2;
        org.telegram.ui.Cells.f3 f3Var = v3Var.f29252b;
        org.telegram.ui.Cells.f3 f3Var2 = v3Var.f29252b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.f35785w) {
            f3Var2.d();
        } else {
            f3Var2.r();
            if (this.V1 != null) {
                w9.c(this.Q1).n(this.V1.f25435b, this);
            }
            this.f60222p2 = true;
            super.dismiss();
        }
    }

    public hc e1() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return hc.a0(T);
    }

    public final void f1(boolean z9) {
        int i7 = this.Q1;
        qp s12 = qp.s1(i7);
        long j3 = this.R1;
        TLRPC.UserFull b22 = s12.b2(j3);
        TLObject e22 = qp.s1(i7).e2(j3);
        int i10 = 0;
        if (b22 != null && (e22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) e22;
            user.premium = true;
            qp.s1(i7).X3(user, true, false);
            qs.f(i7).k(qs.E0, Long.valueOf(user.f27105id), b22);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f36279o1;
        if (f2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) f2Var.getParentActivity()).M().getFragmentStack());
            q4 parentLayout = f2Var.getParentLayout();
            int size = arrayList.size();
            an anVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                if (f2Var2 instanceof an) {
                    anVar = (an) f2Var2;
                    if (anVar.a() != j3) {
                        f2Var2.removeSelfFromStack();
                    }
                } else if (f2Var2 instanceof ProfileActivity) {
                    if (z9 && parentLayout.getLastFragment() == f2Var2) {
                        f2Var2.finishFragment();
                    } else {
                        f2Var2.removeSelfFromStack();
                    }
                }
            }
            if (anVar == null || anVar.a() != j3) {
                ((ActionBarLayout) parentLayout).T(new an(a8.p0.j(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void g1(boolean z9) {
        CharSequence charSequence;
        long j3;
        String str;
        s9 s9Var = this.V1;
        int i7 = this.Q1;
        fi.d dVar = this.f60213g2;
        if (s9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (this.V1.g(currentTime)) {
                int i10 = this.V1.d.auction_start_date - currentTime;
                dVar.i(id.M0(2131750341, null), z9, true);
                dVar.g(id.a0(null, null, 2131750336, id.c0(i10)), z9);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.V1.f25438f;
            if (tL_starGiftAuctionState != null) {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(id.M0(2131750346, null), z9, true);
                dVar.g(id.a0(null, null, 2131750322, id.c0(i11)), z9);
                return;
            }
            dVar.i(id.M0(2131750346, null), z9, true);
            dVar.g(null, z9);
            return;
        }
        TL_stars.StarGift starGift = this.U1;
        wp[] wpVarArr = this.f60221o2;
        if (starGift != null) {
            long j10 = ea.y(i7, false).p().amount;
            long j11 = starGift.stars;
            long j12 = 0;
            if (this.f60216j2) {
                j3 = starGift.upgrade_stars;
            } else {
                j3 = 0;
            }
            long j13 = j11 + j3;
            if (!TextUtils.isEmpty(this.f60218l2.getText())) {
                j12 = this.f60209b2;
            }
            long j14 = j13 + j12;
            if (this.P1) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            dVar.i(dd.Y0(false, id.H(',', str, (int) j14), wpVarArr), z9, true);
            if (ea.y(i7, false).f3810e && j14 > j10) {
                dVar.g(id.H(',', "Gift2SendYourBalance", (int) j10), z9);
                return;
            } else {
                dVar.g(null, z9);
                return;
            }
        }
        ug.j jVar = this.W1;
        if (jVar != null) {
            if (this.f60217k2) {
                dVar.i(dd.U0(id.a0(null, null, 2131749995, id.E(jVar.g(), ',')), 1.0f, wpVarArr), z9, true);
                wpVarArr[0].G = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(id.a0(null, null, 2131749996, jVar.c())), z9, true);
            }
            dVar.g(charSequence, z9);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.Q1).c(this, qs.f25114y3);
    }

    @Override
    public final void onBackPressed() {
        v3 v3Var = this.f60218l2;
        org.telegram.ui.Cells.f3 f3Var = v3Var.f29252b;
        org.telegram.ui.Cells.f3 f3Var2 = v3Var.f29252b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.f35785w) {
            f3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.Q1).n(this, qs.f25114y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.f60212f2;
            if (linearLayout != null) {
                int w02 = k6.w0(k6.f27925h5, this.I0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i7 = this.f28649t0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i7, 0, i7, 0));
                }
            }
            ri.c cVar = this.f60223q2;
            if (cVar != null) {
                cVar.a(k6.w0(k6.f27925h5, this.I0));
                ViewGroup viewGroup = this.f28619b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        v3 v3Var = this.f60218l2;
        if (v3Var != null) {
            v3Var.f29252b.s();
        }
        super.show();
    }

    @Override
    public final void v() {
        this.f36277k1.a0();
    }
}
