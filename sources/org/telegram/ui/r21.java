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
public final class r21 extends org.telegram.ui.Components.tk0 {
    public int f40961c;
    public int d;
    public int h;
    public final g31 f40965s;
    public int e = -1;
    public int f40962f = -1;
    public int f40963n = 1;
    public final ArrayList f40964r = new ArrayList();

    public r21(g31 g31Var) {
        this.f40965s = g31Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        g31 g31Var = this.f40965s;
        int i10 = g31Var.W;
        boolean z11 = g31Var.I;
        ArrayList arrayList = this.f40964r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f40961c = -1;
        boolean z12 = false;
        this.f40963n = 0;
        arrayList.clear();
        ArrayList arrayList2 = g31Var.B1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f40963n;
                this.f40963n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f40963n;
            for (int i12 = 0; i12 < g31Var.B1.size(); i12++) {
                this.f40963n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, g31Var.B1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = g31Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f40963n;
                this.f40963n = i13 + 1;
                this.f40962f = i13;
                arrayList.add(2);
                this.f40961c = this.f40963n;
                for (int i14 = 0; i14 < g31Var.C1.size(); i14++) {
                    this.f40963n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g31Var.C1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = g31Var.D1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f40963n;
                    this.f40963n = i15 + 1;
                    this.f40962f = i15;
                    arrayList.add(2);
                }
                this.f40961c = this.f40963n;
                for (int i16 = 0; i16 < g31Var.D1.size(); i16++) {
                    this.f40963n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, g31Var.D1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = g31Var.E1;
        if (arrayList5 != null) {
            int i17 = this.f40963n;
            this.h = i17;
            this.f40963n = arrayList5.size() + i17;
        }
        f();
        if (g31Var.f37346z1 && this.f40963n == 0) {
            z12 = true;
        }
        if (g31Var.H1 != z12) {
            g31Var.H1 = z12;
            ValueAnimator valueAnimator = g31Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            g31Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new m11(g31Var, z12, 1));
            g31Var.I1.addListener(new a21(g31Var, z12, 1));
            g31Var.I1.setInterpolator(org.telegram.ui.Components.gr.h);
            g31Var.I1.setDuration(100L);
            g31Var.I1.start();
            if (z12) {
                g31.D(g31Var.V, g31Var.f37313l0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f40963n;
    }

    @Override
    public final int d(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f40962f) {
            return 6;
        }
        g31 g31Var = this.f40965s;
        if (g31Var.W == 14) {
            ArrayList arrayList = g31Var.C1;
            if (arrayList != null && i10 >= (i11 = this.f40961c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f40961c;
            if (i10 > i12 && (i10 - i12) - 1 < g31Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = g31Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (g31Var.W == 13 || ((sg.o0) g31Var.B1.get((i10 - this.d) - 1)).f48446g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= g31Var.E1.size()) {
            return 4;
        }
        if (g31Var.E1.get(i10 - this.h) instanceof d31) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        sg.o0 o0Var;
        int cacheType2;
        int i13;
        int indexOf;
        g31 g31Var = this.f40965s;
        HashSet hashSet = g31Var.K;
        int i14 = g31Var.W;
        int i15 = g31Var.V;
        t11 t11Var = g31Var.f37307i0;
        int i16 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i16 == 6) {
            m21 m21Var = (m21) view;
            ArrayList arrayList = g31Var.E1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) g31Var.E1.get(i10 - this.h);
                if (document2 instanceof d31) {
                    CharSequence charSequence = ((d31) document2).f36475a;
                    String str = g31Var.A1;
                    m21Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jf, m21Var.f39420f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    m21Var.f39417a.setText(charSequence);
                    m21Var.b(false);
                }
            } else if (i10 == this.e) {
                m21Var.a(org.telegram.messenger.dd.L0(2131751197, null), false);
            } else if (i14 == 14) {
                m21Var.a(org.telegram.messenger.dd.L0(2131744894, null), false);
            } else {
                m21Var.a(org.telegram.messenger.dd.L0(2131754756, null), false);
            }
            m21Var.f39419c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) g31Var.D1.get((i10 - this.f40961c) - 1);
            q21 q21Var = (q21) view;
            q21Var.a(t11Var);
            q21Var.h.r0(org.telegram.messenger.jc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.v5.f(document3, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, null), 0L, "tgs", document3, 0);
            q21Var.Q = true;
            q21Var.d = document3;
            q21Var.e = null;
        } else if (i16 == 4) {
            q21 q21Var2 = (q21) view;
            q21Var2.f40664c = i10;
            ImageReceiver imageReceiver = q21Var2.f40666n;
            ArrayList arrayList2 = g31Var.B1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                o0Var = (sg.o0) g31Var.B1.get(i10);
            } else {
                ArrayList arrayList3 = g31Var.C1;
                if (arrayList3 != null && i10 >= (i12 = this.f40961c) && i10 - i12 < arrayList3.size()) {
                    o0Var = (sg.o0) g31Var.C1.get(i10 - this.f40961c);
                } else {
                    return;
                }
            }
            if (q21Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(q21Var2);
                q21Var2.h = imageReceiver2;
                imageReceiver2.E0(7);
                q21Var2.h.P();
            }
            q21Var2.h.H0(t11Var);
            q21Var2.f40671y = o0Var;
            q21Var2.D = false;
            q21Var2.d(g31Var.J.contains(o0Var), false);
            q21Var2.f40663b = false;
            q21Var2.invalidate();
            if (i14 == 13) {
                q21Var2.setDrawable(org.telegram.messenger.k6.g(o0Var.f48445f));
            } else if (!o0Var.f48443b && o0Var.f48445f != null) {
                q21Var2.f40668s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(i15).f18670r.get(o0Var.f48445f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.d00 f7 = org.telegram.messenger.v5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, null);
                    if (!org.telegram.messenger.tc.e(8200)) {
                        q21Var2.h.r0(org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f7, 0L, "tgs", o0Var, 0);
                    } else {
                        sg.o0 o0Var2 = o0Var;
                        q21Var2.h.u0(org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f7, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    }
                    org.telegram.messenger.vi.b0(i15);
                    org.telegram.messenger.vi.m1(imageReceiver, org.telegram.messenger.jc.b(tL_availableReaction.around_animation), sg.k0.a());
                } else {
                    q21Var2.h.f();
                    imageReceiver.f();
                }
                q21Var2.e = null;
                q21Var2.d = null;
                q21Var2.setDrawable(null);
                p21 p21Var = q21Var2.J;
                if (p21Var != null) {
                    p21Var.setVisibility(8);
                    q21Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && o0Var.f48443b) {
                    q21Var2.setDrawable(org.telegram.messenger.k6.g(o0Var.f48445f));
                }
            } else {
                q21Var2.f40668s = false;
                q21Var2.e = new org.telegram.ui.Components.o5(o0Var.f48446g, (Paint.FontMetricsInt) null);
                q21Var2.d = null;
                q21Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) t11Var.f38263k3.get(q21Var2.e.getDocumentId());
                if (f5Var == null) {
                    cacheType2 = g31Var.getCacheType();
                    f5Var = org.telegram.ui.Components.f5.m(i15, q21Var2.e.getDocumentId(), null, cacheType2);
                    t11Var.f38263k3.put(q21Var2.e.getDocumentId(), f5Var);
                }
                q21Var2.setDrawable(f5Var);
            }
            if (!org.telegram.messenger.e20.i(i15).q() && i14 == 14 && o0Var.f48443b && o0Var.d) {
                q21Var2.b();
                q21Var2.J.setVisibility(0);
                q21Var2.setEmojicon(null);
                return;
            }
            if (o0Var.e) {
                q21Var2.setEmojicon(o0Var.f48445f);
            } else {
                q21Var2.setEmojicon(null);
            }
            p21 p21Var2 = q21Var2.J;
            if (p21Var2 != null) {
                p21Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            q21 q21Var3 = (q21) view;
            q21Var3.f40662a = false;
            q21Var3.f40664c = i10;
            q21Var3.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
            q21Var3.setDrawable(null);
            ArrayList arrayList4 = g31Var.B1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                sg.o0 o0Var3 = (sg.o0) g31Var.B1.get(i10);
                q21Var3.f40671y = o0Var3;
                long j10 = o0Var3.f48446g;
                if (j10 == 0) {
                    boolean contains2 = g31Var.J.contains(o0Var3);
                    q21Var3.D = true;
                    q21Var3.setDrawable(org.telegram.messenger.k6.g(o0Var3.f48445f));
                    q21Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j10);
                if (i14 == 14 && !org.telegram.messenger.e20.i(i15).q() && o0Var3.f48443b && o0Var3.d) {
                    q21Var3.b();
                    q21Var3.J.setVisibility(0);
                } else {
                    p21 p21Var3 = q21Var3.J;
                    if (p21Var3 != null) {
                        p21Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = g31Var.E1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) g31Var.E1.get(i10 - this.h);
                    if (!(document instanceof d31)) {
                        l4 = null;
                    }
                }
                document = null;
                l4 = null;
            }
            if (l4 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    q21Var3.e = new org.telegram.ui.Components.o5(document, (Paint.FontMetricsInt) null);
                    q21Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f19800id));
                } else {
                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(l4.longValue(), (Paint.FontMetricsInt) null);
                    q21Var3.e = o5Var;
                    q21Var3.d = o5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.f5 f5Var2 = (org.telegram.ui.Components.f5) t11Var.f38263k3.get(q21Var3.e.getDocumentId());
                if (f5Var2 == null) {
                    cacheType = g31Var.getCacheType();
                    f5Var2 = org.telegram.ui.Components.f5.m(i15, q21Var3.e.getDocumentId(), null, cacheType);
                    t11Var.f38263k3.put(q21Var3.e.getDocumentId(), f5Var2);
                }
                q21Var3.setDrawable(f5Var2);
            }
            q21Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View q21Var;
        boolean z10;
        g31 g31Var = this.f40965s;
        if (i10 == 6) {
            Context context = g31Var.getContext();
            if (g31Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            q21Var = new m21(g31Var, context, z10);
        } else if (i10 == 7) {
            q21Var = new org.telegram.ui.Components.bn(g31Var.getContext(), 21);
            q21Var.setTag("searchbox");
        } else {
            q21Var = new q21(g31Var, g31Var.getContext());
        }
        if (g31.c(g31Var)) {
            q21Var.setScaleX(0.0f);
            q21Var.setScaleY(0.0f);
        }
        return new s4.c1(q21Var);
    }
}
