package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class r01 extends org.telegram.ui.Components.sj0 {
    public int f48983c;
    public int d;
    public int h;
    public final g11 f48988s;
    public int f48984e = -1;
    public int f48985f = -1;
    public int f48986n = 1;
    public final ArrayList f48987r = new ArrayList();

    public r01(g11 g11Var) {
        this.f48988s = g11Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        g11 g11Var = this.f48988s;
        int i3 = g11Var.f45435a0;
        boolean z11 = g11Var.J;
        ArrayList arrayList = this.f48987r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f48983c = -1;
        boolean z12 = false;
        this.f48986n = 0;
        arrayList.clear();
        ArrayList arrayList2 = g11Var.C1;
        if (arrayList2 != null) {
            if (i3 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f48986n;
                this.f48986n = i10 + 1;
                this.f48984e = i10;
                arrayList.add(1);
            }
            this.d = this.f48986n;
            for (int i11 = 0; i11 < g11Var.C1.size(); i11++) {
                this.f48986n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, g11Var.C1.get(i11))));
            }
        }
        if (i3 == 14) {
            ArrayList arrayList3 = g11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f48986n;
                this.f48986n = i12 + 1;
                this.f48985f = i12;
                arrayList.add(2);
                this.f48983c = this.f48986n;
                for (int i13 = 0; i13 < g11Var.D1.size(); i13++) {
                    this.f48986n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g11Var.D1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = g11Var.E1;
            if (arrayList4 != null) {
                if (i3 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f48986n;
                    this.f48986n = i14 + 1;
                    this.f48985f = i14;
                    arrayList.add(2);
                }
                this.f48983c = this.f48986n;
                for (int i15 = 0; i15 < g11Var.E1.size(); i15++) {
                    this.f48986n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g11Var.E1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = g11Var.F1;
        if (arrayList5 != null) {
            int i16 = this.f48986n;
            this.h = i16;
            this.f48986n = arrayList5.size() + i16;
        }
        f();
        if (g11Var.A1 && this.f48986n == 0) {
            z12 = true;
        }
        if (g11Var.I1 != z12) {
            g11Var.I1 = z12;
            ValueAnimator valueAnimator = g11Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            g11Var.J1 = ofFloat;
            ofFloat.addUpdateListener(new nz0(g11Var, z12, 1));
            g11Var.J1.addListener(new a01(g11Var, z12, 1));
            g11Var.J1.setInterpolator(org.telegram.ui.Components.xq.h);
            g11Var.J1.setDuration(100L);
            g11Var.J1.start();
            if (z12) {
                g11.D(g11Var.W, g11Var.m0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f48986n;
    }

    @Override
    public final int d(int i3) {
        int i10;
        if (i3 == this.f48984e || i3 == this.f48985f) {
            return 6;
        }
        g11 g11Var = this.f48988s;
        if (g11Var.f45435a0 == 14) {
            ArrayList arrayList = g11Var.D1;
            if (arrayList != null && i3 >= (i10 = this.f48983c) && i3 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f48983c;
            if (i3 > i11 && (i3 - i11) - 1 < g11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = g11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i3 > i12 && (i3 - i12) - 1 < arrayList2.size() && (g11Var.f45435a0 == 13 || ((dh.n0) g11Var.C1.get((i3 - this.d) - 1)).f9098g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i3 - i13 < 0 || i3 - i13 >= g11Var.F1.size()) {
            return 4;
        }
        if (g11Var.F1.get(i3 - this.h) instanceof d11) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        dh.n0 n0Var;
        int cacheType2;
        int i12;
        int indexOf;
        g11 g11Var = this.f48988s;
        HashSet hashSet = g11Var.L;
        int i13 = g11Var.f45435a0;
        int i14 = g11Var.W;
        uz0 uz0Var = g11Var.f45458j0;
        int i15 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i15 == 6) {
            m01 m01Var = (m01) view;
            ArrayList arrayList = g11Var.F1;
            if (arrayList != null && (i12 = i3 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) g11Var.F1.get(i3 - this.h);
                if (document2 instanceof d11) {
                    CharSequence charSequence = ((d11) document2).f44516a;
                    String str = g11Var.B1;
                    m01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jf, m01Var.f47481f.f45436a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    m01Var.f47477a.setText(charSequence);
                    m01Var.b(false);
                }
            } else if (i3 == this.f48984e) {
                m01Var.a(org.telegram.messenger.bd.M0(2131751197, null), false);
            } else if (i13 == 14) {
                m01Var.a(org.telegram.messenger.bd.M0(2131744886, null), false);
            } else {
                m01Var.a(org.telegram.messenger.bd.M0(2131754756, null), false);
            }
            m01Var.f47479c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) g11Var.E1.get((i3 - this.f48983c) - 1);
            q01 q01Var = (q01) view;
            q01Var.a(uz0Var);
            q01Var.h.r0(org.telegram.messenger.ac.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, null), 0L, "tgs", document3, 0);
            q01Var.R = true;
            q01Var.d = document3;
            q01Var.f48720e = null;
        } else if (i15 == 4) {
            q01 q01Var2 = (q01) view;
            q01Var2.f48719c = i3;
            ImageReceiver imageReceiver = q01Var2.f48722n;
            ArrayList arrayList2 = g11Var.C1;
            if (arrayList2 != null && i3 >= 0 && i3 < arrayList2.size()) {
                n0Var = (dh.n0) g11Var.C1.get(i3);
            } else {
                ArrayList arrayList3 = g11Var.D1;
                if (arrayList3 != null && i3 >= (i11 = this.f48983c) && i3 - i11 < arrayList3.size()) {
                    n0Var = (dh.n0) g11Var.D1.get(i3 - this.f48983c);
                } else {
                    return;
                }
            }
            if (q01Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(q01Var2);
                q01Var2.h = imageReceiver2;
                imageReceiver2.E0(7);
                q01Var2.h.P();
            }
            q01Var2.h.H0(uz0Var);
            q01Var2.f48727y = n0Var;
            q01Var2.E = false;
            q01Var2.d(g11Var.K.contains(n0Var), false);
            q01Var2.f48718b = false;
            q01Var2.invalidate();
            if (i13 == 13) {
                q01Var2.setDrawable(org.telegram.messenger.i6.g(n0Var.f9097f));
            } else if (!n0Var.f9094b && n0Var.f9097f != null) {
                q01Var2.f48724s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(i14).f24045r.get(n0Var.f9097f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, null);
                    if (!org.telegram.messenger.lc.e(8200)) {
                        q01Var2.h.r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", n0Var, 0);
                    } else {
                        dh.n0 n0Var2 = n0Var;
                        q01Var2.h.u0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", n0Var2, 0);
                        n0Var = n0Var2;
                    }
                    org.telegram.messenger.li.b0(i14);
                    org.telegram.messenger.li.m1(imageReceiver, org.telegram.messenger.ac.b(tL_availableReaction.around_animation), dh.j0.a());
                } else {
                    q01Var2.h.f();
                    imageReceiver.f();
                }
                q01Var2.f48720e = null;
                q01Var2.d = null;
                q01Var2.setDrawable(null);
                p01 p01Var = q01Var2.K;
                if (p01Var != null) {
                    p01Var.setVisibility(8);
                    q01Var2.K.setImageReceiver(null);
                }
                if (tL_availableReaction == null && n0Var.f9094b) {
                    q01Var2.setDrawable(org.telegram.messenger.i6.g(n0Var.f9097f));
                }
            } else {
                q01Var2.f48724s = false;
                q01Var2.f48720e = new org.telegram.ui.Components.p5(n0Var.f9098g, (Paint.FontMetricsInt) null);
                q01Var2.d = null;
                q01Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) uz0Var.f46478l3.get(q01Var2.f48720e.getDocumentId());
                if (g5Var == null) {
                    cacheType2 = g11Var.getCacheType();
                    g5Var = org.telegram.ui.Components.g5.m(i14, q01Var2.f48720e.getDocumentId(), null, cacheType2);
                    uz0Var.f46478l3.put(q01Var2.f48720e.getDocumentId(), g5Var);
                }
                q01Var2.setDrawable(g5Var);
            }
            if (!org.telegram.messenger.h10.i(i14).q() && i13 == 14 && n0Var.f9094b && n0Var.d) {
                q01Var2.b();
                q01Var2.K.setVisibility(0);
                q01Var2.setEmojicon(null);
                return;
            }
            if (n0Var.f9096e) {
                q01Var2.setEmojicon(n0Var.f9097f);
            } else {
                q01Var2.setEmojicon(null);
            }
            p01 p01Var2 = q01Var2.K;
            if (p01Var2 != null) {
                p01Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            q01 q01Var3 = (q01) view;
            q01Var3.f48717a = false;
            q01Var3.f48719c = i3;
            q01Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            q01Var3.setDrawable(null);
            ArrayList arrayList4 = g11Var.C1;
            if (arrayList4 != null && i3 >= 0 && i3 < arrayList4.size()) {
                dh.n0 n0Var3 = (dh.n0) g11Var.C1.get(i3);
                q01Var3.f48727y = n0Var3;
                long j10 = n0Var3.f9098g;
                if (j10 == 0) {
                    boolean contains2 = g11Var.K.contains(n0Var3);
                    q01Var3.E = true;
                    q01Var3.setDrawable(org.telegram.messenger.i6.g(n0Var3.f9097f));
                    q01Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i13 == 14 && !org.telegram.messenger.h10.i(i14).q() && n0Var3.f9094b && n0Var3.d) {
                    q01Var3.b();
                    q01Var3.K.setVisibility(0);
                } else {
                    p01 p01Var3 = q01Var3.K;
                    if (p01Var3 != null) {
                        p01Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = g11Var.F1;
                if (arrayList5 != null && (i10 = i3 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) g11Var.F1.get(i3 - this.h);
                    if (!(document instanceof d11)) {
                        l10 = null;
                    }
                }
                document = null;
                l10 = null;
            }
            if (l10 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    q01Var3.f48720e = new org.telegram.ui.Components.p5(document, (Paint.FontMetricsInt) null);
                    q01Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f27007id));
                } else {
                    org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(l10.longValue(), (Paint.FontMetricsInt) null);
                    q01Var3.f48720e = p5Var;
                    q01Var3.d = p5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.g5 g5Var2 = (org.telegram.ui.Components.g5) uz0Var.f46478l3.get(q01Var3.f48720e.getDocumentId());
                if (g5Var2 == null) {
                    cacheType = g11Var.getCacheType();
                    g5Var2 = org.telegram.ui.Components.g5.m(i14, q01Var3.f48720e.getDocumentId(), null, cacheType);
                    uz0Var.f46478l3.put(q01Var3.f48720e.getDocumentId(), g5Var2);
                }
                q01Var3.setDrawable(g5Var2);
            }
            q01Var3.d(contains, false);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View q01Var;
        boolean z10;
        g11 g11Var = this.f48988s;
        if (i3 == 6) {
            Context context = g11Var.getContext();
            if (g11Var.f45435a0 == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            q01Var = new m01(g11Var, context, z10);
        } else if (i3 == 7) {
            q01Var = new org.telegram.ui.Components.sm(g11Var.getContext(), 25);
            q01Var.setTag("searchbox");
        } else {
            q01Var = new q01(g11Var, g11Var.getContext());
        }
        if (g11.c(g11Var)) {
            q01Var.setScaleX(0.0f);
            q01Var.setScaleY(0.0f);
        }
        return new u4.d1(q01Var);
    }
}
