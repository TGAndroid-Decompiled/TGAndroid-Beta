package vh;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
public final class g3 implements Runnable {
    public final int f51190a;
    public final b4 f51191b;
    public final jg.j f51192c;

    public g3(b4 b4Var, jg.j jVar, int i10) {
        this.f51190a = i10;
        this.f51191b = b4Var;
        this.f51192c = jVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f51190a;
        final jg.j jVar = this.f51192c;
        final b4 b4Var = this.f51191b;
        switch (i13) {
            case 0:
                b4Var.z0(jVar);
                return;
            default:
                x3 x3Var = b4Var.A0;
                o3 o3Var = b4Var.f50997x1;
                org.telegram.ui.ActionBar.x4 x4Var = b4Var.f50981p1;
                LinearLayout linearLayout = new LinearLayout(b4Var.getContext());
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof jg.j1;
                if (!z10) {
                    TextView textView = new TextView(b4Var.getContext());
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.E8, x4Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    textView.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(cd.L0(2131747688, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            jg.g3 g3Var;
                            switch (r3) {
                                case 0:
                                    jg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof jg.i2;
                                    b4 b4Var2 = b4Var;
                                    if (z11) {
                                        e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                        if (e8Var != null) {
                                            e8Var.B();
                                        }
                                    } else {
                                        b4Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                    if (k1Var != null && k1Var.isShowing()) {
                                        b4Var2.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    b4 b4Var3 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                    if (k1Var2 != null && k1Var2.isShowing()) {
                                        b4Var3.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b4 b4Var4 = b4Var;
                                    b4Var4.A0(jVar, true);
                                    b4Var4.o0();
                                    org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                    if (k1Var3 != null && k1Var3.isShowing()) {
                                        b4Var4.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    b4 b4Var5 = b4Var;
                                    b4Var5.A0(null, true);
                                    jg.j jVar3 = jVar;
                                    b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                    org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                    if (k1Var4 != null && k1Var4.isShowing()) {
                                        b4Var5.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    b4 b4Var6 = b4Var;
                                    b4Var6.A0(null, true);
                                    b4Var6.H0((jg.v0) jVar);
                                    org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                    if (k1Var5 != null && k1Var5.isShowing()) {
                                        b4Var6.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    jg.j jVar4 = jVar;
                                    if (jVar4 instanceof jg.w2) {
                                        ((jg.w2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.h2) {
                                        ((jg.h2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.i2) {
                                        jg.i2 i2Var = (jg.i2) jVar4;
                                        i2Var.f10021r0 = !i2Var.f10021r0;
                                        i2Var.invalidate();
                                    } else {
                                        ((jg.e2) jVar4).r(true);
                                    }
                                    b4 b4Var7 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                    if (k1Var6 != null && k1Var6.isShowing()) {
                                        b4Var7.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    b4 b4Var8 = b4Var;
                                    b4Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                    if (k1Var7 != null && k1Var7.isShowing()) {
                                        b4Var8.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    b4 b4Var9 = b4Var;
                                    x3 x3Var2 = b4Var9.A0;
                                    jg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = b4Var9.N0(jVar5);
                                        if (jVar5 instanceof jg.w2) {
                                            jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                            w2Var.setDelegate(b4Var9);
                                            x3Var2.addView(w2Var);
                                            b4Var9.d0();
                                            g3Var = w2Var;
                                        } else if (jVar5 instanceof jg.g3) {
                                            jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                            g3Var2.setDelegate(b4Var9);
                                            g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                            x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                            b4Var9.d0();
                                            g3Var = g3Var2;
                                        }
                                        b4Var9.y0(g3Var);
                                        b4Var9.A0(null, true);
                                        b4Var9.b0(g3Var);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                    if (k1Var8 != null && k1Var8.isShowing()) {
                                        b4Var9.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.b6.o(-2, 44));
                }
                if (jVar instanceof jg.g3) {
                    TextView textView2 = new TextView(b4Var.getContext());
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.E8, x4Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.i0.o());
                    textView2.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((o3Var.c() && !o3Var.d) || b4Var.f50958c2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(cd.L0(2131747451, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                jg.g3 g3Var;
                                switch (r3) {
                                    case 0:
                                        jg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof jg.i2;
                                        b4 b4Var2 = b4Var;
                                        if (z11) {
                                            e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                            if (e8Var != null) {
                                                e8Var.B();
                                            }
                                        } else {
                                            b4Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                        if (k1Var != null && k1Var.isShowing()) {
                                            b4Var2.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                        }
                                        b4 b4Var3 = b4Var;
                                        org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                        if (k1Var2 != null && k1Var2.isShowing()) {
                                            b4Var3.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b4 b4Var4 = b4Var;
                                        b4Var4.A0(jVar, true);
                                        b4Var4.o0();
                                        org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                        if (k1Var3 != null && k1Var3.isShowing()) {
                                            b4Var4.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        b4 b4Var5 = b4Var;
                                        b4Var5.A0(null, true);
                                        jg.j jVar3 = jVar;
                                        b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                        org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                        if (k1Var4 != null && k1Var4.isShowing()) {
                                            b4Var5.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        b4 b4Var6 = b4Var;
                                        b4Var6.A0(null, true);
                                        b4Var6.H0((jg.v0) jVar);
                                        org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                        if (k1Var5 != null && k1Var5.isShowing()) {
                                            b4Var6.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        jg.j jVar4 = jVar;
                                        if (jVar4 instanceof jg.w2) {
                                            ((jg.w2) jVar4).r(true);
                                        } else if (jVar4 instanceof jg.h2) {
                                            ((jg.h2) jVar4).r(true);
                                        } else if (jVar4 instanceof jg.i2) {
                                            jg.i2 i2Var = (jg.i2) jVar4;
                                            i2Var.f10021r0 = !i2Var.f10021r0;
                                            i2Var.invalidate();
                                        } else {
                                            ((jg.e2) jVar4).r(true);
                                        }
                                        b4 b4Var7 = b4Var;
                                        org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                        if (k1Var6 != null && k1Var6.isShowing()) {
                                            b4Var7.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        b4 b4Var8 = b4Var;
                                        b4Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                        if (k1Var7 != null && k1Var7.isShowing()) {
                                            b4Var8.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        b4 b4Var9 = b4Var;
                                        x3 x3Var2 = b4Var9.A0;
                                        jg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = b4Var9.N0(jVar5);
                                            if (jVar5 instanceof jg.w2) {
                                                jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                                w2Var.setDelegate(b4Var9);
                                                x3Var2.addView(w2Var);
                                                b4Var9.d0();
                                                g3Var = w2Var;
                                            } else if (jVar5 instanceof jg.g3) {
                                                jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                                g3Var2.setDelegate(b4Var9);
                                                g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                                x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                                b4Var9.d0();
                                                g3Var = g3Var2;
                                            }
                                            b4Var9.y0(g3Var);
                                            b4Var9.A0(null, true);
                                            b4Var9.b0(g3Var);
                                        }
                                        org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                        if (k1Var8 != null && k1Var8.isShowing()) {
                                            b4Var9.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(cd.L0(2131747686, null));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                jg.g3 g3Var;
                                switch (r3) {
                                    case 0:
                                        jg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof jg.i2;
                                        b4 b4Var2 = b4Var;
                                        if (z11) {
                                            e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                            if (e8Var != null) {
                                                e8Var.B();
                                            }
                                        } else {
                                            b4Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                        if (k1Var != null && k1Var.isShowing()) {
                                            b4Var2.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                        }
                                        b4 b4Var3 = b4Var;
                                        org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                        if (k1Var2 != null && k1Var2.isShowing()) {
                                            b4Var3.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b4 b4Var4 = b4Var;
                                        b4Var4.A0(jVar, true);
                                        b4Var4.o0();
                                        org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                        if (k1Var3 != null && k1Var3.isShowing()) {
                                            b4Var4.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        b4 b4Var5 = b4Var;
                                        b4Var5.A0(null, true);
                                        jg.j jVar3 = jVar;
                                        b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                        org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                        if (k1Var4 != null && k1Var4.isShowing()) {
                                            b4Var5.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        b4 b4Var6 = b4Var;
                                        b4Var6.A0(null, true);
                                        b4Var6.H0((jg.v0) jVar);
                                        org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                        if (k1Var5 != null && k1Var5.isShowing()) {
                                            b4Var6.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        jg.j jVar4 = jVar;
                                        if (jVar4 instanceof jg.w2) {
                                            ((jg.w2) jVar4).r(true);
                                        } else if (jVar4 instanceof jg.h2) {
                                            ((jg.h2) jVar4).r(true);
                                        } else if (jVar4 instanceof jg.i2) {
                                            jg.i2 i2Var = (jg.i2) jVar4;
                                            i2Var.f10021r0 = !i2Var.f10021r0;
                                            i2Var.invalidate();
                                        } else {
                                            ((jg.e2) jVar4).r(true);
                                        }
                                        b4 b4Var7 = b4Var;
                                        org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                        if (k1Var6 != null && k1Var6.isShowing()) {
                                            b4Var7.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        b4 b4Var8 = b4Var;
                                        b4Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                        if (k1Var7 != null && k1Var7.isShowing()) {
                                            b4Var8.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        b4 b4Var9 = b4Var;
                                        x3 x3Var2 = b4Var9.A0;
                                        jg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = b4Var9.N0(jVar5);
                                            if (jVar5 instanceof jg.w2) {
                                                jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                                w2Var.setDelegate(b4Var9);
                                                x3Var2.addView(w2Var);
                                                b4Var9.d0();
                                                g3Var = w2Var;
                                            } else if (jVar5 instanceof jg.g3) {
                                                jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                                g3Var2.setDelegate(b4Var9);
                                                g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                                x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                                b4Var9.d0();
                                                g3Var = g3Var2;
                                            }
                                            b4Var9.y0(g3Var);
                                            b4Var9.A0(null, true);
                                            b4Var9.b0(g3Var);
                                        }
                                        org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                        if (k1Var8 != null && k1Var8.isShowing()) {
                                            b4Var9.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.b6.o(-2, 44));
                    f7 = 14.0f;
                } else if (jVar instanceof jg.z0) {
                    TextView e02 = b4Var.e0(1, cd.L0(2131747686, null));
                    f7 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            jg.g3 g3Var;
                            switch (r3) {
                                case 0:
                                    jg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof jg.i2;
                                    b4 b4Var2 = b4Var;
                                    if (z11) {
                                        e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                        if (e8Var != null) {
                                            e8Var.B();
                                        }
                                    } else {
                                        b4Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                    if (k1Var != null && k1Var.isShowing()) {
                                        b4Var2.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    b4 b4Var3 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                    if (k1Var2 != null && k1Var2.isShowing()) {
                                        b4Var3.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b4 b4Var4 = b4Var;
                                    b4Var4.A0(jVar, true);
                                    b4Var4.o0();
                                    org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                    if (k1Var3 != null && k1Var3.isShowing()) {
                                        b4Var4.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    b4 b4Var5 = b4Var;
                                    b4Var5.A0(null, true);
                                    jg.j jVar3 = jVar;
                                    b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                    org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                    if (k1Var4 != null && k1Var4.isShowing()) {
                                        b4Var5.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    b4 b4Var6 = b4Var;
                                    b4Var6.A0(null, true);
                                    b4Var6.H0((jg.v0) jVar);
                                    org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                    if (k1Var5 != null && k1Var5.isShowing()) {
                                        b4Var6.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    jg.j jVar4 = jVar;
                                    if (jVar4 instanceof jg.w2) {
                                        ((jg.w2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.h2) {
                                        ((jg.h2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.i2) {
                                        jg.i2 i2Var = (jg.i2) jVar4;
                                        i2Var.f10021r0 = !i2Var.f10021r0;
                                        i2Var.invalidate();
                                    } else {
                                        ((jg.e2) jVar4).r(true);
                                    }
                                    b4 b4Var7 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                    if (k1Var6 != null && k1Var6.isShowing()) {
                                        b4Var7.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    b4 b4Var8 = b4Var;
                                    b4Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                    if (k1Var7 != null && k1Var7.isShowing()) {
                                        b4Var8.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    b4 b4Var9 = b4Var;
                                    x3 x3Var2 = b4Var9.A0;
                                    jg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = b4Var9.N0(jVar5);
                                        if (jVar5 instanceof jg.w2) {
                                            jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                            w2Var.setDelegate(b4Var9);
                                            x3Var2.addView(w2Var);
                                            b4Var9.d0();
                                            g3Var = w2Var;
                                        } else if (jVar5 instanceof jg.g3) {
                                            jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                            g3Var2.setDelegate(b4Var9);
                                            g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                            x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                            b4Var9.d0();
                                            g3Var = g3Var2;
                                        }
                                        b4Var9.y0(g3Var);
                                        b4Var9.A0(null, true);
                                        b4Var9.b0(g3Var);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                    if (k1Var8 != null && k1Var8.isShowing()) {
                                        b4Var9.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e02, w7.b6.o(-2, 44));
                } else {
                    f7 = 14.0f;
                    if (jVar instanceof jg.v0) {
                        TextView e03 = b4Var.e0(1, cd.L0(2131747686, null));
                        e03.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                jg.g3 g3Var;
                                switch (r3) {
                                    case 0:
                                        jg.j jVar2 = jVar;
                                        boolean z11 = jVar2 instanceof jg.i2;
                                        b4 b4Var2 = b4Var;
                                        if (z11) {
                                            e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                            if (e8Var != null) {
                                                e8Var.B();
                                            }
                                        } else {
                                            b4Var2.z0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                        if (k1Var != null && k1Var.isShowing()) {
                                            b4Var2.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        try {
                                            ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                        }
                                        b4 b4Var3 = b4Var;
                                        org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                        if (k1Var2 != null && k1Var2.isShowing()) {
                                            b4Var3.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b4 b4Var4 = b4Var;
                                        b4Var4.A0(jVar, true);
                                        b4Var4.o0();
                                        org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                        if (k1Var3 != null && k1Var3.isShowing()) {
                                            b4Var4.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        b4 b4Var5 = b4Var;
                                        b4Var5.A0(null, true);
                                        jg.j jVar3 = jVar;
                                        b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                        org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                        if (k1Var4 != null && k1Var4.isShowing()) {
                                            b4Var5.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        b4 b4Var6 = b4Var;
                                        b4Var6.A0(null, true);
                                        b4Var6.H0((jg.v0) jVar);
                                        org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                        if (k1Var5 != null && k1Var5.isShowing()) {
                                            b4Var6.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        jg.j jVar4 = jVar;
                                        if (jVar4 instanceof jg.w2) {
                                            ((jg.w2) jVar4).r(true);
                                        } else if (jVar4 instanceof jg.h2) {
                                            ((jg.h2) jVar4).r(true);
                                        } else if (jVar4 instanceof jg.i2) {
                                            jg.i2 i2Var = (jg.i2) jVar4;
                                            i2Var.f10021r0 = !i2Var.f10021r0;
                                            i2Var.invalidate();
                                        } else {
                                            ((jg.e2) jVar4).r(true);
                                        }
                                        b4 b4Var7 = b4Var;
                                        org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                        if (k1Var6 != null && k1Var6.isShowing()) {
                                            b4Var7.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        b4 b4Var8 = b4Var;
                                        b4Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                        if (k1Var7 != null && k1Var7.isShowing()) {
                                            b4Var8.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        b4 b4Var9 = b4Var;
                                        x3 x3Var2 = b4Var9.A0;
                                        jg.j jVar5 = jVar;
                                        if (jVar5 != null) {
                                            PointF N0 = b4Var9.N0(jVar5);
                                            if (jVar5 instanceof jg.w2) {
                                                jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                                w2Var.setDelegate(b4Var9);
                                                x3Var2.addView(w2Var);
                                                b4Var9.d0();
                                                g3Var = w2Var;
                                            } else if (jVar5 instanceof jg.g3) {
                                                jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                                g3Var2.setDelegate(b4Var9);
                                                g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                                x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                                b4Var9.d0();
                                                g3Var = g3Var2;
                                            }
                                            b4Var9.y0(g3Var);
                                            b4Var9.A0(null, true);
                                            b4Var9.b0(g3Var);
                                        }
                                        org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                        if (k1Var8 != null && k1Var8.isShowing()) {
                                            b4Var9.f50983q1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        linearLayout.addView(e03, w7.b6.o(-2, 44));
                    }
                }
                if ((jVar instanceof jg.w2) || (jVar instanceof jg.i2) || (jVar instanceof jg.e2) || (jVar instanceof jg.h2)) {
                    TextView e04 = b4Var.e0(4, cd.L0(2131750691, null));
                    e04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            jg.g3 g3Var;
                            switch (r3) {
                                case 0:
                                    jg.j jVar2 = jVar;
                                    boolean z11 = jVar2 instanceof jg.i2;
                                    b4 b4Var2 = b4Var;
                                    if (z11) {
                                        e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                        if (e8Var != null) {
                                            e8Var.B();
                                        }
                                    } else {
                                        b4Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                    if (k1Var != null && k1Var.isShowing()) {
                                        b4Var2.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    b4 b4Var3 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                    if (k1Var2 != null && k1Var2.isShowing()) {
                                        b4Var3.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b4 b4Var4 = b4Var;
                                    b4Var4.A0(jVar, true);
                                    b4Var4.o0();
                                    org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                    if (k1Var3 != null && k1Var3.isShowing()) {
                                        b4Var4.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    b4 b4Var5 = b4Var;
                                    b4Var5.A0(null, true);
                                    jg.j jVar3 = jVar;
                                    b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                    org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                    if (k1Var4 != null && k1Var4.isShowing()) {
                                        b4Var5.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    b4 b4Var6 = b4Var;
                                    b4Var6.A0(null, true);
                                    b4Var6.H0((jg.v0) jVar);
                                    org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                    if (k1Var5 != null && k1Var5.isShowing()) {
                                        b4Var6.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    jg.j jVar4 = jVar;
                                    if (jVar4 instanceof jg.w2) {
                                        ((jg.w2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.h2) {
                                        ((jg.h2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.i2) {
                                        jg.i2 i2Var = (jg.i2) jVar4;
                                        i2Var.f10021r0 = !i2Var.f10021r0;
                                        i2Var.invalidate();
                                    } else {
                                        ((jg.e2) jVar4).r(true);
                                    }
                                    b4 b4Var7 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                    if (k1Var6 != null && k1Var6.isShowing()) {
                                        b4Var7.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    b4 b4Var8 = b4Var;
                                    b4Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                    if (k1Var7 != null && k1Var7.isShowing()) {
                                        b4Var8.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    b4 b4Var9 = b4Var;
                                    x3 x3Var2 = b4Var9.A0;
                                    jg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = b4Var9.N0(jVar5);
                                        if (jVar5 instanceof jg.w2) {
                                            jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                            w2Var.setDelegate(b4Var9);
                                            x3Var2.addView(w2Var);
                                            b4Var9.d0();
                                            g3Var = w2Var;
                                        } else if (jVar5 instanceof jg.g3) {
                                            jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                            g3Var2.setDelegate(b4Var9);
                                            g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                            x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                            b4Var9.d0();
                                            g3Var = g3Var2;
                                        }
                                        b4Var9.y0(g3Var);
                                        b4Var9.A0(null, true);
                                        b4Var9.b0(g3Var);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                    if (k1Var8 != null && k1Var8.isShowing()) {
                                        b4Var9.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(e04, w7.b6.o(-2, 44));
                }
                boolean z11 = jVar instanceof jg.e2;
                if (x3Var.indexOfChild(jVar) != x3Var.getChildCount() - 1 && !(jVar instanceof jg.h2)) {
                    TextView textView3 = new TextView(b4Var.getContext());
                    org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.E8, x4Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.i0.o());
                    textView3.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
                    textView3.setTextSize(1, f7);
                    textView3.setTag(2);
                    textView3.setText(cd.L0(2131747691, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            jg.g3 g3Var;
                            switch (r3) {
                                case 0:
                                    jg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof jg.i2;
                                    b4 b4Var2 = b4Var;
                                    if (z112) {
                                        e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                        if (e8Var != null) {
                                            e8Var.B();
                                        }
                                    } else {
                                        b4Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                    if (k1Var != null && k1Var.isShowing()) {
                                        b4Var2.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    b4 b4Var3 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                    if (k1Var2 != null && k1Var2.isShowing()) {
                                        b4Var3.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b4 b4Var4 = b4Var;
                                    b4Var4.A0(jVar, true);
                                    b4Var4.o0();
                                    org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                    if (k1Var3 != null && k1Var3.isShowing()) {
                                        b4Var4.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    b4 b4Var5 = b4Var;
                                    b4Var5.A0(null, true);
                                    jg.j jVar3 = jVar;
                                    b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                    org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                    if (k1Var4 != null && k1Var4.isShowing()) {
                                        b4Var5.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    b4 b4Var6 = b4Var;
                                    b4Var6.A0(null, true);
                                    b4Var6.H0((jg.v0) jVar);
                                    org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                    if (k1Var5 != null && k1Var5.isShowing()) {
                                        b4Var6.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    jg.j jVar4 = jVar;
                                    if (jVar4 instanceof jg.w2) {
                                        ((jg.w2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.h2) {
                                        ((jg.h2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.i2) {
                                        jg.i2 i2Var = (jg.i2) jVar4;
                                        i2Var.f10021r0 = !i2Var.f10021r0;
                                        i2Var.invalidate();
                                    } else {
                                        ((jg.e2) jVar4).r(true);
                                    }
                                    b4 b4Var7 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                    if (k1Var6 != null && k1Var6.isShowing()) {
                                        b4Var7.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    b4 b4Var8 = b4Var;
                                    b4Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                    if (k1Var7 != null && k1Var7.isShowing()) {
                                        b4Var8.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    b4 b4Var9 = b4Var;
                                    x3 x3Var2 = b4Var9.A0;
                                    jg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = b4Var9.N0(jVar5);
                                        if (jVar5 instanceof jg.w2) {
                                            jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                            w2Var.setDelegate(b4Var9);
                                            x3Var2.addView(w2Var);
                                            b4Var9.d0();
                                            g3Var = w2Var;
                                        } else if (jVar5 instanceof jg.g3) {
                                            jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                            g3Var2.setDelegate(b4Var9);
                                            g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                            x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                            b4Var9.d0();
                                            g3Var = g3Var2;
                                        }
                                        b4Var9.y0(g3Var);
                                        b4Var9.A0(null, true);
                                        b4Var9.b0(g3Var);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                    if (k1Var8 != null && k1Var8.isShowing()) {
                                        b4Var9.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.b6.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof jg.i2) && !(jVar instanceof jg.z0) && !(jVar instanceof jg.h3) && !(jVar instanceof jg.v0) && !(jVar instanceof jg.h2)) {
                    TextView textView4 = new TextView(b4Var.getContext());
                    org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.E8, x4Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.i0.o());
                    textView4.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(cd.L0(2131747687, "PaintDuplicate"));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            jg.g3 g3Var;
                            switch (r3) {
                                case 0:
                                    jg.j jVar2 = jVar;
                                    boolean z112 = jVar2 instanceof jg.i2;
                                    b4 b4Var2 = b4Var;
                                    if (z112) {
                                        e8 e8Var = ((s7) b4Var2).f51935j2.f51613c1;
                                        if (e8Var != null) {
                                            e8Var.B();
                                        }
                                    } else {
                                        b4Var2.z0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var = b4Var2.f50983q1;
                                    if (k1Var != null && k1Var.isShowing()) {
                                        b4Var2.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    try {
                                        ((jg.g3) jVar).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    b4 b4Var3 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var2 = b4Var3.f50983q1;
                                    if (k1Var2 != null && k1Var2.isShowing()) {
                                        b4Var3.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b4 b4Var4 = b4Var;
                                    b4Var4.A0(jVar, true);
                                    b4Var4.o0();
                                    org.telegram.ui.ActionBar.k1 k1Var3 = b4Var4.f50983q1;
                                    if (k1Var3 != null && k1Var3.isShowing()) {
                                        b4Var4.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    b4 b4Var5 = b4Var;
                                    b4Var5.A0(null, true);
                                    jg.j jVar3 = jVar;
                                    b4Var5.I0((jg.z0) jVar3, new rh.s6(5, b4Var5, jVar3));
                                    org.telegram.ui.ActionBar.k1 k1Var4 = b4Var5.f50983q1;
                                    if (k1Var4 != null && k1Var4.isShowing()) {
                                        b4Var5.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    b4 b4Var6 = b4Var;
                                    b4Var6.A0(null, true);
                                    b4Var6.H0((jg.v0) jVar);
                                    org.telegram.ui.ActionBar.k1 k1Var5 = b4Var6.f50983q1;
                                    if (k1Var5 != null && k1Var5.isShowing()) {
                                        b4Var6.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    jg.j jVar4 = jVar;
                                    if (jVar4 instanceof jg.w2) {
                                        ((jg.w2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.h2) {
                                        ((jg.h2) jVar4).r(true);
                                    } else if (jVar4 instanceof jg.i2) {
                                        jg.i2 i2Var = (jg.i2) jVar4;
                                        i2Var.f10021r0 = !i2Var.f10021r0;
                                        i2Var.invalidate();
                                    } else {
                                        ((jg.e2) jVar4).r(true);
                                    }
                                    b4 b4Var7 = b4Var;
                                    org.telegram.ui.ActionBar.k1 k1Var6 = b4Var7.f50983q1;
                                    if (k1Var6 != null && k1Var6.isShowing()) {
                                        b4Var7.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    b4 b4Var8 = b4Var;
                                    b4Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.k1 k1Var7 = b4Var8.f50983q1;
                                    if (k1Var7 != null && k1Var7.isShowing()) {
                                        b4Var8.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    b4 b4Var9 = b4Var;
                                    x3 x3Var2 = b4Var9.A0;
                                    jg.j jVar5 = jVar;
                                    if (jVar5 != null) {
                                        PointF N0 = b4Var9.N0(jVar5);
                                        if (jVar5 instanceof jg.w2) {
                                            jg.j w2Var = new jg.w2(b4Var9.getContext(), (jg.w2) jVar5, N0);
                                            w2Var.setDelegate(b4Var9);
                                            x3Var2.addView(w2Var);
                                            b4Var9.d0();
                                            g3Var = w2Var;
                                        } else if (jVar5 instanceof jg.g3) {
                                            jg.g3 g3Var2 = new jg.g3(b4Var9.getContext(), (jg.g3) jVar5, N0);
                                            g3Var2.setDelegate(b4Var9);
                                            g3Var2.setMaxWidth(b4Var9.A1 - org.telegram.messenger.i0.L(32.0f));
                                            x3Var2.addView(g3Var2, w7.b6.c(-2.0f, -2));
                                            b4Var9.d0();
                                            g3Var = g3Var2;
                                        }
                                        b4Var9.y0(g3Var);
                                        b4Var9.A0(null, true);
                                        b4Var9.b0(g3Var);
                                    }
                                    org.telegram.ui.ActionBar.k1 k1Var8 = b4Var9.f50983q1;
                                    if (k1Var8 != null && k1Var8.isShowing()) {
                                        b4Var9.f50983q1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.b6.o(-2, 44));
                }
                for (int i14 = 0; i14 < linearLayout.getChildCount(); i14++) {
                    View childAt = linearLayout.getChildAt(i14);
                    int i15 = org.telegram.ui.ActionBar.t6.f21020i6;
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i15, x4Var);
                    int i16 = 8;
                    if (i14 == 0) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    if (i14 == linearLayout.getChildCount() - 1) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    if (i14 == linearLayout.getChildCount() - 1) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    if (i14 != 0) {
                        i16 = 0;
                    }
                    org.telegram.ui.ActionBar.a7.R(childAt, org.telegram.ui.ActionBar.t6.c0(w02, i10, i11, i12, i16), null, org.telegram.ui.ActionBar.a7.N(i15), x4Var);
                }
                b4Var.f50985r1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
