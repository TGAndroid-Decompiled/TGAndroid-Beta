package rh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.at;
import org.telegram.messenger.cj;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.messenger.lt;
import org.telegram.messenger.r20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cl0;
import org.telegram.ui.dx0;
import org.telegram.ui.f51;
import org.telegram.ui.un;
public final class y8 extends org.telegram.ui.ActionBar.z2 implements vs {
    public final ep A1;
    public final kg.h B1;
    public final kj C1;
    public final ArrayList D1;
    public final a E1;
    public int F1;
    public th.p1 G1;
    public int H1;
    public d0 I1;
    public final dq[] J1;
    public boolean K1;
    public boolean L1;
    public un M1;
    public View N1;
    public ValueAnimator O1;
    public final org.telegram.ui.ActionBar.p6 f47780i1;
    public final int f47781j1;
    public final boolean f47782k1;
    public final boolean l1;
    public final LinearLayout f47783m1;
    public final FrameLayout f47784n1;
    public final LinearLayout f47785o1;
    public final n8 f47786p1;
    public final FrameLayout f47787q1;
    public final FrameLayout f47788r1;
    public final g9 f47789s1;
    public final vh.d f47790t1;
    public final x8 f47791u1;
    public long f47792v1;
    public long f47793w1;
    public final th.h0 f47794x1;
    public final th.c0 f47795y1;
    public final View f47796z1;

    public y8(Context context, final int i10, final long j10, un unVar, kj kjVar, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        boolean z13;
        float f7;
        float f10;
        float f11;
        float f12;
        String str;
        int[] iArr;
        String a02;
        String str2;
        boolean z14;
        long j12;
        int i11;
        Context context2;
        int i12;
        int i13;
        int i14;
        float f13;
        this.J1 = new dq[1];
        this.L1 = false;
        this.f47780i1 = p6Var;
        this.f47781j1 = i10;
        this.C1 = kjVar;
        this.D1 = arrayList;
        this.f47782k1 = z11;
        this.l1 = z10;
        a aVar = new a(i10, context, p6Var);
        this.E1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.f21590c.addView(aVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.e6.a(aVar);
        aVar.setOnClickListener(new f51(2, context, p6Var));
        long e = e20.i(i10).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i15 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long o10 = org.telegram.messenger.o5.o(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    o10 = e;
                }
                if (messageReactor3.my || o10 == e) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            if (arrayList != null) {
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC.MessageReactor) arrayList.get(i16)).my) {
                        TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) arrayList.get(i16);
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f47792v1 = j11;
        } else {
            this.f47792v1 = e6.y(i10, false).A(kjVar);
        }
        long j13 = this.f47792v1;
        this.f47793w1 = j13 == 2666000 ? e : j13;
        P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, p6Var));
        this.F1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47783m1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47784n1 = frameLayout;
        linearLayout.addView(frameLayout, w7.b6.o(-1, -2));
        this.f47786p1 = new n8(this, context, p6Var, z11, i10);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = wp.r1(i10).f19082a6;
        ArrayList arrayList2 = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 < 9) {
                int i18 = iArr2[i17];
                z13 = z12;
                if (i18 > j14) {
                    arrayList2.add(Integer.valueOf((int) j14));
                    break;
                }
                arrayList2.add(Integer.valueOf(i18));
                if (iArr2[i17] == j14) {
                    break;
                }
                i17++;
                z12 = z13;
            } else {
                z13 = z12;
                break;
            }
        }
        int[] iArr3 = new int[arrayList2.size()];
        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
            iArr3[i19] = ((Integer) arrayList2.get(i19)).intValue();
        }
        n8 n8Var = this.f47786p1;
        n8Var.f47617e0 = iArr3;
        if (z10 || z11) {
            if (!z10) {
                n8Var.setAlpha(0.5f);
            }
            FrameLayout frameLayout2 = this.f47784n1;
            n8 n8Var2 = this.f47786p1;
            if (z11) {
                f7 = -50.0f;
            } else {
                f7 = 0.0f;
            }
            if (z11 && !z13) {
                f10 = -40.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(n8Var2, w7.b6.d(-1, -2.0f, 55, 0.0f, f7, 0.0f, f10));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f47785o1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.f47784n1.addView(linearLayout2, w7.b6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f47787q1 = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f47788r1 = frameLayout4;
        int L = org.telegram.messenger.i0.L(14.0f);
        int i20 = org.telegram.ui.ActionBar.t6.f21020i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i20, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i20);
        frameLayout4.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout4, d02, N, null, p6Var);
        g9 g9Var = new g9(context);
        this.f47789s1 = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        g9Var.getImageReceiver().A0 = true;
        M0();
        frameLayout4.addView(g9Var, w7.b6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i21 = org.telegram.ui.ActionBar.t6.f21186r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i21, p6Var, mode);
        imageView.setImageResource(2131230873);
        frameLayout4.addView(imageView, w7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout3.addView(frameLayout4, w7.b6.e(52, 28, 17));
        frameLayout3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
        linearLayout2.addView(frameLayout3, w7.b6.q(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.e6.a(frameLayout3);
        r.g(i10).o();
        cl0 cl0Var = new cl0(context, 2);
        int i22 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(cl0Var, i22, p6Var);
        cl0Var.setTextSize(1, 20.0f);
        cl0Var.setGravity(17);
        cl0Var.setText(dd.L0(2131745056, null));
        cl0Var.setTypeface(org.telegram.messenger.i0.o());
        cl0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(cl0Var, w7.b6.q(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        L0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231270);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.W5, p6Var, mode);
        w7.e6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final y8 f47180b;

            {
                this.f47180b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f47180b.dismiss();
                        return;
                    default:
                        y8 y8Var = this.f47180b;
                        ep epVar = y8Var.A1;
                        epVar.a(!epVar.f25895a.f23920q, true);
                        if (epVar.f25895a.f23920q) {
                            j15 = y8Var.f47793w1;
                        } else {
                            j15 = 2666000;
                        }
                        y8Var.f47792v1 = j15;
                        y8Var.M0();
                        x8 x8Var = y8Var.f47791u1;
                        if (x8Var != null) {
                            x8Var.setMyPrivacy(y8Var.f47792v1);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.b6.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout5 = this.f47784n1;
        if (z11) {
            f12 = 0.0f;
        } else {
            if (z10) {
                f11 = 179.0f;
            } else {
                f11 = 45.0f;
            }
            f12 = f11;
        }
        frameLayout5.addView(linearLayout3, w7.b6.d(-1, -2.0f, 55, 0.0f, f12, 0.0f, 15.0f));
        TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, i22, p6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = dd.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            iArr = null;
            a02 = dd.a0(null, null, 2131745061, str);
        }
        textView.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i0.W2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.b6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z13) {
            if (!z11) {
                linearLayout3.addView(new org.telegram.ui.ActionBar.f5(context, p6Var), w7.b6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            x8 x8Var = new x8(this, context, z11);
            this.f47791u1 = x8Var;
            x8Var.setOnSenderClickListener(new r20() {
                @Override
                public final void a(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    int i23 = (l4.longValue() > 0L ? 1 : (l4.longValue() == 0L ? 0 : -1));
                    y8 y8Var = y8.this;
                    boolean z15 = z11;
                    if (i23 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == e20.i(i10).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new o8(y8Var, bundle, z15));
                        y8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        T.presentFragment(new p8(y8Var, bundle2, z15));
                    }
                    y8Var.dismiss();
                }
            });
            LinearLayout linearLayout4 = this.f47783m1;
            if (z11) {
                f13 = -50.0f;
            } else {
                f13 = 0.0f;
            }
            linearLayout4.addView(x8Var, w7.b6.k(0.0f, f13, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.f47796z1 = view;
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, p6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.f47783m1.addView(view, w7.b6.n(1.0f / org.telegram.messenger.i0.f16171p, -1, 7, 24, 0, 24, 0));
            }
            str2 = null;
        } else {
            str2 = null;
            this.f47791u1 = null;
            this.f47796z1 = null;
        }
        if (z11) {
            int i23 = org.telegram.ui.ActionBar.t6.f21038j5;
            TextView b10 = w7.g6.b(context, 20.0f, i23, true, p6Var);
            b10.setGravity(17);
            if (z10) {
                i13 = 2131748801;
            } else {
                i13 = 2131748803;
            }
            b10.setText(dd.L0(i13, str2));
            this.f47783m1.addView(b10, w7.b6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.g6.b(context, 14.0f, i23, false, p6Var);
            b11.setGravity(17);
            if (z10) {
                i14 = 2131748802;
            } else if (z13) {
                i14 = 2131748804;
            } else {
                i14 = 2131748805;
            }
            org.telegram.messenger.m5.q(null, null, i14, new Object[]{org.telegram.messenger.o5.l(e20.f15506s0, j10)}, b11);
            this.f47783m1.addView(b11, w7.b6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.f47794x1 = obj2;
            obj2.f49022c = this.f47792v1;
            obj2.f49024g = 50L;
            obj2.e = true;
            th.c0 c0Var = new th.c0(i10, context, true);
            this.f47795y1 = c0Var;
            c0Var.set(obj2);
            this.f47783m1.addView(c0Var, w7.b6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        ep epVar = new ep(21, context, p6Var);
        this.A1 = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.f21004h7, org.telegram.ui.ActionBar.t6.f21040j7, org.telegram.ui.ActionBar.t6.f21060k7);
        epVar.setDrawUnchecked(true);
        if (this.f47792v1 != 2666000) {
            z14 = true;
        } else {
            z14 = false;
        }
        epVar.a(z14, false);
        x8 x8Var2 = this.f47791u1;
        if (x8Var2 != null) {
            x8Var2.setMyPrivacy(this.f47792v1);
        }
        epVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, i22, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(dd.L0(2131745064, null));
        LinearLayout f14 = org.telegram.messenger.m5.f(context, 0);
        f14.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        f14.addView(epVar, w7.b6.t(21, 21, 16, 0, 0, 9, 0));
        f14.addView(textView2, w7.b6.r(-2, -2, 16));
        f14.setOnClickListener(new View.OnClickListener(this) {
            public final y8 f47180b;

            {
                this.f47180b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f47180b.dismiss();
                        return;
                    default:
                        y8 y8Var = this.f47180b;
                        ep epVar2 = y8Var.A1;
                        epVar2.a(!epVar2.f25895a.f23920q, true);
                        if (epVar2.f25895a.f23920q) {
                            j15 = y8Var.f47793w1;
                        } else {
                            j15 = 2666000;
                        }
                        y8Var.f47792v1 = j15;
                        y8Var.M0();
                        x8 x8Var3 = y8Var.f47791u1;
                        if (x8Var3 != null) {
                            x8Var3.setMyPrivacy(y8Var.f47792v1);
                            return;
                        }
                        return;
                }
            }
        });
        w7.e6.b(f14, 0.05f, 1.2f);
        int i24 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i24, p6Var), 6, 6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i24);
        f14.setBackground(a03);
        org.telegram.ui.ActionBar.a7.k(f14, a03, null, N2, p6Var);
        if (!z11 && (z10 || messageReactor != null)) {
            LinearLayout linearLayout5 = this.f47783m1;
            if (z13) {
                i12 = 10;
            } else {
                i12 = 4;
            }
            linearLayout5.addView(f14, w7.b6.t(-2, -2, 1, 0, i12, 0, 10));
        }
        vh.d dVar = new vh.d(context, p6Var, true);
        this.f47790t1 = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f47783m1.addView(dVar, w7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        N0(0L);
        dVar.i(h8.Y0(false, dd.a0(null, null, 2131745065, dd.E(50L, ',')), this.J1), true, true);
        if (z10) {
            j12 = 0;
            i11 = 10;
            context2 = context;
            dVar.setOnClickListener(new y6(this, kjVar, unVar, i10, z11, context, p6Var, j10, L0));
        } else {
            j12 = 0;
            i11 = 10;
            context2 = context;
        }
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                long j15;
                boolean z15;
                int i25 = i10;
                r g10 = r.g(i25);
                g10.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g10.f47404l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, e20.i(i25).f());
                y8 y8Var = y8.this;
                z60 F = z60.F(y8Var.f21587b, p6Var, y8Var.f47788r1);
                int size2 = arrayList3.size();
                int i26 = 0;
                while (i26 < size2) {
                    int i27 = i26 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i26);
                    if (tLObject instanceof TLRPC.User) {
                        j15 = ((TLRPC.User) tLObject).f19943id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.w3.V(chat)) {
                                j15 = -chat.f19794id;
                            }
                        }
                        i26 = i27;
                    }
                    if (j15 != j10) {
                        long j16 = y8Var.f47792v1;
                        if (j15 != j16 && (j16 != 0 || j15 != e20.i(i25).e())) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        F.g(tLObject, z15, new lt(y8Var, j15, z11, 2));
                    }
                    i26 = i27;
                }
                F.f33045t = false;
                F.Y = true;
                F.f33044s = 0;
                F.V(5);
                F.Z();
            }
        });
        p80 p80Var = new p80(context2, p6Var);
        p80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        if (z11 && !z10) {
            p80Var.setText(dd.L0(2131748806, null));
        } else {
            p80Var.setText(org.telegram.messenger.i0.T2(dd.L0(2131745063, null), new ph.p0(context2, i11)));
        }
        p80Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.f21058k5, p6Var);
        if (z10 || z11) {
            this.f47783m1.addView(p80Var, w7.b6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.N = this.f47783m1;
        kg.h hVar = new kg.h(context2, 1, 2, 5);
        this.B1 = hVar;
        lg.h hVar2 = hVar.f11920b;
        hVar2.f11898z = org.telegram.ui.ActionBar.t6.Tk;
        hVar2.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar2.b();
        hVar.f11920b.f11884k = 1.0f;
        hVar.setVisibility(4);
        hVar.setPaused(true);
        this.f21590c.addView(hVar, w7.b6.c(150.0f, 150));
        this.f47786p1.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i25 = 0; i25 < arrayList.size(); i25++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i25)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor != null ? j15 - messageReactor.count : j15;
            if (j15 > j12) {
                this.f47786p1.setStarsTop(j15 + 1);
            }
        }
    }

    @Override
    public final void G(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float[] fArr = {f7};
        a aVar = this.E1;
        arrayList.add(ObjectAnimator.ofFloat(aVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(aVar, property2, f10));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(aVar, property3, f11));
    }

    @Override
    public final boolean H() {
        if (this.f47786p1.f47624k0) {
            return false;
        }
        return this.f21588b0;
    }

    public final void J0(final a6 a6Var) {
        sg.m0 m0Var;
        View view;
        sg.p0 p0Var;
        th.p1 p1Var;
        View view2;
        sg.p0 p0Var2;
        sg.m0 m0Var2;
        kj kjVar;
        n8 n8Var = this.f47786p1;
        kg.h hVar = this.B1;
        kj kjVar2 = this.C1;
        if (kjVar2 != null && (view2 = this.M1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.N1;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                p0Var2.getClass();
                m0Var2 = p0Var2.k("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.s0) {
                p0Var2 = ((org.telegram.ui.Cells.s0) view3).E0;
                p0Var2.getClass();
                m0Var2 = p0Var2.k("stars");
            } else {
                p0Var2 = null;
                m0Var2 = null;
            }
            if (m0Var2 == null && p0Var2 != null) {
                fj p9 = this.M1.p9(kjVar2);
                if (p9 != null && !p9.e.isEmpty()) {
                    ArrayList arrayList = p9.d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            kjVar = (kj) obj;
                            cj d = p9.d(kjVar);
                            if (d != null) {
                                int i11 = d.f15166l;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            kjVar = null;
                            break;
                        }
                    }
                    if (kjVar != null) {
                        view3 = this.M1.E8(kjVar.f1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.q1) {
                        p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                        p0Var2.getClass();
                        m0Var2 = p0Var2.k("stars");
                    }
                } else {
                    return;
                }
            }
            if (m0Var2 != null) {
                p0Var = p0Var2;
                m0Var = m0Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.G1 == null) {
            return;
        } else {
            m0Var = null;
            view = null;
            p0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        n8Var.getLocationInWindow(iArr);
        rectF.set(n8Var.G.getBounds());
        rectF.inset(-org.telegram.messenger.i0.L(3.5f), -org.telegram.messenger.i0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        i8 i8Var = new i8(this, 2);
        hVar.f11919a0 = i8Var;
        if (hVar.W) {
            hVar.f11919a0 = null;
            i8Var.run();
        }
        if (m0Var != null) {
            m0Var.f48415k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        sg.m0 m0Var3 = m0Var;
        th.c0[] c0VarArr = new th.c0[1];
        if (this.f47782k1 && (p1Var = this.G1) != null) {
            c0VarArr[0] = p1Var.d(this.H1);
        }
        final RectF rectF2 = new RectF();
        final mg.c0 c0Var = new mg.c0(this, c0VarArr, iArr, rectF2, view, p0Var, m0Var3, 17);
        View view4 = view;
        c0Var.run();
        hVar.setPaused(false);
        hVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        hVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
        hVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
        hVar.setScaleX(rectF3.width() / org.telegram.messenger.i0.L(150.0f));
        hVar.setScaleY(rectF3.height() / org.telegram.messenger.i0.L(150.0f));
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.O1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                c0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.i0.Z1(rectF4, rectF5, floatValue, rectF6);
                y8 y8Var = y8.this;
                kg.h hVar2 = y8Var.B1;
                hVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
                hVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.i0.T1(Math.max(rectF6.width() / org.telegram.messenger.i0.L(150.0f), rectF6.height() / org.telegram.messenger.i0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                hVar2.setScaleX(T1);
                hVar2.setScaleY(T1);
                lg.h hVar3 = hVar2.f11920b;
                hVar3.d = 360.0f * floatValue;
                hVar3.f11884k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        y8Var.f21590c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = a6Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.O1.addListener(new q8(this, m0Var3, view4, c0VarArr, zArr, rectF2, a6Var));
        this.O1.setDuration(800L);
        this.O1.setInterpolator(new org.telegram.ui.Cells.p2(1));
        this.O1.start();
    }

    public final boolean K0() {
        if (!this.f47782k1) {
            r g10 = r.g(this.f47781j1);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f47404l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.w3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void L() {
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.L();
    }

    public final void L0(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f47787q1;
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != K0()) {
            if (!K0()) {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                if (K0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f47785o1, changeBounds);
            }
        }
    }

    public final void M0() {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.f29927p = 0.42f;
        long j10 = this.f47792v1;
        int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        g9 g9Var = this.f47789s1;
        if (i10 == 0) {
            r8Var.g(21);
            int i11 = org.telegram.ui.ActionBar.t6.f20913c8;
            org.telegram.ui.ActionBar.p6 p6Var = this.f47780i1;
            r8Var.i(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            g9Var.e(null, r8Var);
            return;
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f47781j1;
        if (i12 >= 0) {
            TLRPC.User Z1 = wp.r1(i13).Z1(Long.valueOf(this.f47792v1));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
            return;
        }
        TLRPC.Chat L0 = wp.r1(i13).L0(Long.valueOf(-this.f47792v1));
        r8Var.q(L0);
        g9Var.e(L0, r8Var);
    }

    public final void N0(long j10) {
        x8 x8Var;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.f47782k1 || this.l1 || j10 <= 0) && (x8Var = this.f47791u1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = e20.i(this.f47781j1).e();
            int i10 = 1;
            ArrayList arrayList2 = this.D1;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long o10 = org.telegram.messenger.o5.o(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            o10 = e;
                        } else {
                            o10 = (-i11) - i10;
                        }
                    }
                    if (!messageReactor.my && o10 != e) {
                        long j15 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f47525a = z11;
                        obj.f47526b = false;
                        obj.f47527c = o10;
                        obj.d = j15;
                        arrayList.add(obj);
                    } else {
                        j12 = messageReactor.count;
                    }
                    i11++;
                    j13 = j14;
                    i10 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                if (this.f47792v1 == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f47525a = z10;
                obj2.f47526b = true;
                obj2.f47527c = e;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new dx0(14));
            x8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean Y(float f7, float f10) {
        a aVar = this.E1;
        if (f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.Y(f7, f10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.M3) {
            L0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long A1;
        if (!this.K1 && !this.L1) {
            this.L1 = true;
            kj kjVar = this.C1;
            if (kjVar != null && ((A1 = kjVar.A1()) == null || A1.longValue() != this.f47792v1)) {
                kjVar.I5(this.f47792v1);
                x5 b10 = x5.b(kjVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f47781j1;
                wp r12 = wp.r1(i10);
                long j10 = b10.f47705a;
                int i11 = b10.f47706b;
                tL_messages_togglePaidReactionPrivacy.peer = r12.i1(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.f47792v1;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = wp.r1(i10).i1(this.f47792v1);
                }
                at.f(i10).k(at.I1, Long.valueOf(b10.f47705a), Integer.valueOf(i11), Long.valueOf(this.f47792v1));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ag.c(this, 18));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.f47781j1).c(this, at.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f47781j1).n(this, at.M3);
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.F1 && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.f47780i1)) != this.G0) {
                this.G0 = w02;
                this.F1 = w02;
                E0(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
