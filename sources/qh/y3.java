package qh;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y3 implements Runnable {
    public final int f46362a;
    public final a5 f46363b;
    public final eg.j f46364c;

    public y3(a5 a5Var, eg.j jVar, int i10) {
        this.f46362a = i10;
        this.f46363b = a5Var;
        this.f46364c = jVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.f46362a) {
            case 0:
                this.f46363b.C0(this.f46364c);
                return;
            default:
                final a5 a5Var = this.f46363b;
                v4 v4Var = a5Var.O0;
                i4 i4Var = a5Var.L1;
                p4 p4Var = a5Var.D1;
                LinearLayout linearLayout = new LinearLayout(a5Var.getContext());
                linearLayout.setOrientation(0);
                final eg.j jVar = this.f46364c;
                boolean z4 = jVar instanceof eg.y1;
                if (!z4) {
                    TextView textView = new TextView(a5Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, p4Var));
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            eg.z3 z3Var;
                            switch (r3) {
                                case 0:
                                    eg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof eg.z2;
                                    a5 a5Var2 = a5Var;
                                    if (z10) {
                                        q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                        if (q9Var != null) {
                                            q9Var.B();
                                        }
                                    } else {
                                        a5Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        a5Var2.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    eg.j jVar3 = jVar;
                                    a5 a5Var3 = a5Var;
                                    a5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        a5Var3.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    a5 a5Var4 = a5Var;
                                    a5Var4.D0(jVar, true);
                                    a5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        a5Var4.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    a5 a5Var5 = a5Var;
                                    a5Var5.D0(null, true);
                                    eg.j jVar4 = jVar;
                                    a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        a5Var5.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    a5 a5Var6 = a5Var;
                                    a5Var6.D0(null, true);
                                    a5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        a5Var6.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    eg.j jVar5 = jVar;
                                    if (jVar5 instanceof eg.p3) {
                                        ((eg.p3) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.y2) {
                                        ((eg.y2) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar5;
                                        z2Var.f5587o0 = !z2Var.f5587o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar5).r(true);
                                    }
                                    a5 a5Var7 = a5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        a5Var7.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    a5 a5Var8 = a5Var;
                                    a5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        a5Var8.E1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    a5 a5Var9 = a5Var;
                                    v4 v4Var2 = a5Var9.O0;
                                    eg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = a5Var9.Q0(jVar6);
                                        if (jVar6 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                            p3Var.setDelegate(a5Var9);
                                            v4Var2.addView(p3Var);
                                            a5Var9.g0();
                                            z3Var = p3Var;
                                        } else if (jVar6 instanceof eg.z3) {
                                            eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                            z3Var2.setDelegate(a5Var9);
                                            z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                            a5Var9.g0();
                                            z3Var = z3Var2;
                                        }
                                        a5Var9.B0(z3Var);
                                        a5Var9.D0(null, true);
                                        a5Var9.d0(z3Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        a5Var9.E1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView, k7.c6.n(-2, 44));
                }
                if (jVar instanceof eg.z3) {
                    TextView textView2 = new TextView(a5Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, p4Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((i4Var.c() && !i4Var.d) || a5Var.f44953q2 > 0) {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                eg.z3 z3Var;
                                switch (r3) {
                                    case 0:
                                        eg.j jVar2 = jVar;
                                        boolean z10 = jVar2 instanceof eg.z2;
                                        a5 a5Var2 = a5Var;
                                        if (z10) {
                                            q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                            if (q9Var != null) {
                                                q9Var.B();
                                            }
                                        } else {
                                            a5Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            a5Var2.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        eg.j jVar3 = jVar;
                                        a5 a5Var3 = a5Var;
                                        a5Var3.getClass();
                                        try {
                                            ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            a5Var3.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        a5 a5Var4 = a5Var;
                                        a5Var4.D0(jVar, true);
                                        a5Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            a5Var4.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        a5 a5Var5 = a5Var;
                                        a5Var5.D0(null, true);
                                        eg.j jVar4 = jVar;
                                        a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            a5Var5.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        a5 a5Var6 = a5Var;
                                        a5Var6.D0(null, true);
                                        a5Var6.K0((eg.g1) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            a5Var6.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        eg.j jVar5 = jVar;
                                        if (jVar5 instanceof eg.p3) {
                                            ((eg.p3) jVar5).r(true);
                                        } else if (jVar5 instanceof eg.y2) {
                                            ((eg.y2) jVar5).r(true);
                                        } else if (jVar5 instanceof eg.z2) {
                                            eg.z2 z2Var = (eg.z2) jVar5;
                                            z2Var.f5587o0 = !z2Var.f5587o0;
                                            z2Var.invalidate();
                                        } else {
                                            ((eg.t2) jVar5).r(true);
                                        }
                                        a5 a5Var7 = a5Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            a5Var7.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        a5 a5Var8 = a5Var;
                                        a5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            a5Var8.E1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        a5 a5Var9 = a5Var;
                                        v4 v4Var2 = a5Var9.O0;
                                        eg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = a5Var9.Q0(jVar6);
                                            if (jVar6 instanceof eg.p3) {
                                                eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                                p3Var.setDelegate(a5Var9);
                                                v4Var2.addView(p3Var);
                                                a5Var9.g0();
                                                z3Var = p3Var;
                                            } else if (jVar6 instanceof eg.z3) {
                                                eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                                z3Var2.setDelegate(a5Var9);
                                                z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                                v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                                a5Var9.g0();
                                                z3Var = z3Var2;
                                            }
                                            a5Var9.B0(z3Var);
                                            a5Var9.D0(null, true);
                                            a5Var9.d0(z3Var);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            a5Var9.E1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                eg.z3 z3Var;
                                switch (r3) {
                                    case 0:
                                        eg.j jVar2 = jVar;
                                        boolean z10 = jVar2 instanceof eg.z2;
                                        a5 a5Var2 = a5Var;
                                        if (z10) {
                                            q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                            if (q9Var != null) {
                                                q9Var.B();
                                            }
                                        } else {
                                            a5Var2.C0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            a5Var2.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        eg.j jVar3 = jVar;
                                        a5 a5Var3 = a5Var;
                                        a5Var3.getClass();
                                        try {
                                            ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            a5Var3.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        a5 a5Var4 = a5Var;
                                        a5Var4.D0(jVar, true);
                                        a5Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            a5Var4.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        a5 a5Var5 = a5Var;
                                        a5Var5.D0(null, true);
                                        eg.j jVar4 = jVar;
                                        a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            a5Var5.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        a5 a5Var6 = a5Var;
                                        a5Var6.D0(null, true);
                                        a5Var6.K0((eg.g1) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            a5Var6.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        eg.j jVar5 = jVar;
                                        if (jVar5 instanceof eg.p3) {
                                            ((eg.p3) jVar5).r(true);
                                        } else if (jVar5 instanceof eg.y2) {
                                            ((eg.y2) jVar5).r(true);
                                        } else if (jVar5 instanceof eg.z2) {
                                            eg.z2 z2Var = (eg.z2) jVar5;
                                            z2Var.f5587o0 = !z2Var.f5587o0;
                                            z2Var.invalidate();
                                        } else {
                                            ((eg.t2) jVar5).r(true);
                                        }
                                        a5 a5Var7 = a5Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            a5Var7.E1.d(true);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        a5 a5Var8 = a5Var;
                                        a5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            a5Var8.E1.d(true);
                                            return;
                                        }
                                        return;
                                    default:
                                        a5 a5Var9 = a5Var;
                                        v4 v4Var2 = a5Var9.O0;
                                        eg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF Q0 = a5Var9.Q0(jVar6);
                                            if (jVar6 instanceof eg.p3) {
                                                eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                                p3Var.setDelegate(a5Var9);
                                                v4Var2.addView(p3Var);
                                                a5Var9.g0();
                                                z3Var = p3Var;
                                            } else if (jVar6 instanceof eg.z3) {
                                                eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                                z3Var2.setDelegate(a5Var9);
                                                z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                                v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                                a5Var9.g0();
                                                z3Var = z3Var2;
                                            }
                                            a5Var9.B0(z3Var);
                                            a5Var9.D0(null, true);
                                            a5Var9.d0(z3Var);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            a5Var9.E1.d(true);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, k7.c6.n(-2, 44));
                } else if (jVar instanceof eg.k1) {
                    TextView h02 = a5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h02.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            eg.z3 z3Var;
                            switch (r3) {
                                case 0:
                                    eg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof eg.z2;
                                    a5 a5Var2 = a5Var;
                                    if (z10) {
                                        q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                        if (q9Var != null) {
                                            q9Var.B();
                                        }
                                    } else {
                                        a5Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        a5Var2.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    eg.j jVar3 = jVar;
                                    a5 a5Var3 = a5Var;
                                    a5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        a5Var3.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    a5 a5Var4 = a5Var;
                                    a5Var4.D0(jVar, true);
                                    a5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        a5Var4.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    a5 a5Var5 = a5Var;
                                    a5Var5.D0(null, true);
                                    eg.j jVar4 = jVar;
                                    a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        a5Var5.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    a5 a5Var6 = a5Var;
                                    a5Var6.D0(null, true);
                                    a5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        a5Var6.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    eg.j jVar5 = jVar;
                                    if (jVar5 instanceof eg.p3) {
                                        ((eg.p3) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.y2) {
                                        ((eg.y2) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar5;
                                        z2Var.f5587o0 = !z2Var.f5587o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar5).r(true);
                                    }
                                    a5 a5Var7 = a5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        a5Var7.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    a5 a5Var8 = a5Var;
                                    a5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        a5Var8.E1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    a5 a5Var9 = a5Var;
                                    v4 v4Var2 = a5Var9.O0;
                                    eg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = a5Var9.Q0(jVar6);
                                        if (jVar6 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                            p3Var.setDelegate(a5Var9);
                                            v4Var2.addView(p3Var);
                                            a5Var9.g0();
                                            z3Var = p3Var;
                                        } else if (jVar6 instanceof eg.z3) {
                                            eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                            z3Var2.setDelegate(a5Var9);
                                            z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                            a5Var9.g0();
                                            z3Var = z3Var2;
                                        }
                                        a5Var9.B0(z3Var);
                                        a5Var9.D0(null, true);
                                        a5Var9.d0(z3Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        a5Var9.E1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h02, k7.c6.n(-2, 44));
                } else if (jVar instanceof eg.g1) {
                    TextView h03 = a5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    h03.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            eg.z3 z3Var;
                            switch (r3) {
                                case 0:
                                    eg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof eg.z2;
                                    a5 a5Var2 = a5Var;
                                    if (z10) {
                                        q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                        if (q9Var != null) {
                                            q9Var.B();
                                        }
                                    } else {
                                        a5Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        a5Var2.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    eg.j jVar3 = jVar;
                                    a5 a5Var3 = a5Var;
                                    a5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        a5Var3.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    a5 a5Var4 = a5Var;
                                    a5Var4.D0(jVar, true);
                                    a5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        a5Var4.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    a5 a5Var5 = a5Var;
                                    a5Var5.D0(null, true);
                                    eg.j jVar4 = jVar;
                                    a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        a5Var5.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    a5 a5Var6 = a5Var;
                                    a5Var6.D0(null, true);
                                    a5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        a5Var6.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    eg.j jVar5 = jVar;
                                    if (jVar5 instanceof eg.p3) {
                                        ((eg.p3) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.y2) {
                                        ((eg.y2) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar5;
                                        z2Var.f5587o0 = !z2Var.f5587o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar5).r(true);
                                    }
                                    a5 a5Var7 = a5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        a5Var7.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    a5 a5Var8 = a5Var;
                                    a5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        a5Var8.E1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    a5 a5Var9 = a5Var;
                                    v4 v4Var2 = a5Var9.O0;
                                    eg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = a5Var9.Q0(jVar6);
                                        if (jVar6 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                            p3Var.setDelegate(a5Var9);
                                            v4Var2.addView(p3Var);
                                            a5Var9.g0();
                                            z3Var = p3Var;
                                        } else if (jVar6 instanceof eg.z3) {
                                            eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                            z3Var2.setDelegate(a5Var9);
                                            z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                            a5Var9.g0();
                                            z3Var = z3Var2;
                                        }
                                        a5Var9.B0(z3Var);
                                        a5Var9.D0(null, true);
                                        a5Var9.d0(z3Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        a5Var9.E1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h03, k7.c6.n(-2, 44));
                }
                if ((jVar instanceof eg.p3) || (jVar instanceof eg.z2) || (jVar instanceof eg.t2) || (jVar instanceof eg.y2)) {
                    TextView h04 = a5Var.h0(4, LocaleController.getString(R.string.Flip));
                    h04.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            eg.z3 z3Var;
                            switch (r3) {
                                case 0:
                                    eg.j jVar2 = jVar;
                                    boolean z10 = jVar2 instanceof eg.z2;
                                    a5 a5Var2 = a5Var;
                                    if (z10) {
                                        q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                        if (q9Var != null) {
                                            q9Var.B();
                                        }
                                    } else {
                                        a5Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        a5Var2.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    eg.j jVar3 = jVar;
                                    a5 a5Var3 = a5Var;
                                    a5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        a5Var3.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    a5 a5Var4 = a5Var;
                                    a5Var4.D0(jVar, true);
                                    a5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        a5Var4.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    a5 a5Var5 = a5Var;
                                    a5Var5.D0(null, true);
                                    eg.j jVar4 = jVar;
                                    a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        a5Var5.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    a5 a5Var6 = a5Var;
                                    a5Var6.D0(null, true);
                                    a5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        a5Var6.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    eg.j jVar5 = jVar;
                                    if (jVar5 instanceof eg.p3) {
                                        ((eg.p3) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.y2) {
                                        ((eg.y2) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar5;
                                        z2Var.f5587o0 = !z2Var.f5587o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar5).r(true);
                                    }
                                    a5 a5Var7 = a5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        a5Var7.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    a5 a5Var8 = a5Var;
                                    a5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        a5Var8.E1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    a5 a5Var9 = a5Var;
                                    v4 v4Var2 = a5Var9.O0;
                                    eg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = a5Var9.Q0(jVar6);
                                        if (jVar6 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                            p3Var.setDelegate(a5Var9);
                                            v4Var2.addView(p3Var);
                                            a5Var9.g0();
                                            z3Var = p3Var;
                                        } else if (jVar6 instanceof eg.z3) {
                                            eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                            z3Var2.setDelegate(a5Var9);
                                            z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                            a5Var9.g0();
                                            z3Var = z3Var2;
                                        }
                                        a5Var9.B0(z3Var);
                                        a5Var9.D0(null, true);
                                        a5Var9.d0(z3Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        a5Var9.E1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(h04, k7.c6.n(-2, 44));
                }
                boolean z10 = jVar instanceof eg.t2;
                if (v4Var.indexOfChild(jVar) != v4Var.getChildCount() - 1 && !(jVar instanceof eg.y2)) {
                    TextView textView3 = new TextView(a5Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, p4Var));
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            eg.z3 z3Var;
                            switch (r3) {
                                case 0:
                                    eg.j jVar2 = jVar;
                                    boolean z102 = jVar2 instanceof eg.z2;
                                    a5 a5Var2 = a5Var;
                                    if (z102) {
                                        q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                        if (q9Var != null) {
                                            q9Var.B();
                                        }
                                    } else {
                                        a5Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        a5Var2.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    eg.j jVar3 = jVar;
                                    a5 a5Var3 = a5Var;
                                    a5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        a5Var3.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    a5 a5Var4 = a5Var;
                                    a5Var4.D0(jVar, true);
                                    a5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        a5Var4.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    a5 a5Var5 = a5Var;
                                    a5Var5.D0(null, true);
                                    eg.j jVar4 = jVar;
                                    a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        a5Var5.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    a5 a5Var6 = a5Var;
                                    a5Var6.D0(null, true);
                                    a5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        a5Var6.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    eg.j jVar5 = jVar;
                                    if (jVar5 instanceof eg.p3) {
                                        ((eg.p3) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.y2) {
                                        ((eg.y2) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar5;
                                        z2Var.f5587o0 = !z2Var.f5587o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar5).r(true);
                                    }
                                    a5 a5Var7 = a5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        a5Var7.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    a5 a5Var8 = a5Var;
                                    a5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        a5Var8.E1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    a5 a5Var9 = a5Var;
                                    v4 v4Var2 = a5Var9.O0;
                                    eg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = a5Var9.Q0(jVar6);
                                        if (jVar6 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                            p3Var.setDelegate(a5Var9);
                                            v4Var2.addView(p3Var);
                                            a5Var9.g0();
                                            z3Var = p3Var;
                                        } else if (jVar6 instanceof eg.z3) {
                                            eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                            z3Var2.setDelegate(a5Var9);
                                            z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                            a5Var9.g0();
                                            z3Var = z3Var2;
                                        }
                                        a5Var9.B0(z3Var);
                                        a5Var9.D0(null, true);
                                        a5Var9.d0(z3Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        a5Var9.E1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, k7.c6.n(-2, 44));
                } else if (!z10 && !z4 && !(jVar instanceof eg.z2) && !(jVar instanceof eg.k1) && !(jVar instanceof eg.a4) && !(jVar instanceof eg.g1) && !(jVar instanceof eg.y2)) {
                    TextView textView4 = new TextView(a5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, p4Var));
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            eg.z3 z3Var;
                            switch (r3) {
                                case 0:
                                    eg.j jVar2 = jVar;
                                    boolean z102 = jVar2 instanceof eg.z2;
                                    a5 a5Var2 = a5Var;
                                    if (z102) {
                                        q9 q9Var = ((e9) a5Var2).f45309x2.Z0;
                                        if (q9Var != null) {
                                            q9Var.B();
                                        }
                                    } else {
                                        a5Var2.C0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = a5Var2.E1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        a5Var2.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 1:
                                    eg.j jVar3 = jVar;
                                    a5 a5Var3 = a5Var;
                                    a5Var3.getClass();
                                    try {
                                        ((eg.z3) jVar3).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = a5Var3.E1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        a5Var3.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 2:
                                    a5 a5Var4 = a5Var;
                                    a5Var4.D0(jVar, true);
                                    a5Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = a5Var4.E1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        a5Var4.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 3:
                                    a5 a5Var5 = a5Var;
                                    a5Var5.D0(null, true);
                                    eg.j jVar4 = jVar;
                                    a5Var5.L0((eg.k1) jVar4, new eh.w(26, a5Var5, jVar4));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = a5Var5.E1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        a5Var5.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 4:
                                    a5 a5Var6 = a5Var;
                                    a5Var6.D0(null, true);
                                    a5Var6.K0((eg.g1) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = a5Var6.E1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        a5Var6.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 5:
                                    eg.j jVar5 = jVar;
                                    if (jVar5 instanceof eg.p3) {
                                        ((eg.p3) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.y2) {
                                        ((eg.y2) jVar5).r(true);
                                    } else if (jVar5 instanceof eg.z2) {
                                        eg.z2 z2Var = (eg.z2) jVar5;
                                        z2Var.f5587o0 = !z2Var.f5587o0;
                                        z2Var.invalidate();
                                    } else {
                                        ((eg.t2) jVar5).r(true);
                                    }
                                    a5 a5Var7 = a5Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = a5Var7.E1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        a5Var7.E1.d(true);
                                        return;
                                    }
                                    return;
                                case 6:
                                    a5 a5Var8 = a5Var;
                                    a5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = a5Var8.E1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        a5Var8.E1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    a5 a5Var9 = a5Var;
                                    v4 v4Var2 = a5Var9.O0;
                                    eg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF Q0 = a5Var9.Q0(jVar6);
                                        if (jVar6 instanceof eg.p3) {
                                            eg.j p3Var = new eg.p3(a5Var9.getContext(), (eg.p3) jVar6, Q0);
                                            p3Var.setDelegate(a5Var9);
                                            v4Var2.addView(p3Var);
                                            a5Var9.g0();
                                            z3Var = p3Var;
                                        } else if (jVar6 instanceof eg.z3) {
                                            eg.z3 z3Var2 = new eg.z3(a5Var9.getContext(), (eg.z3) jVar6, Q0);
                                            z3Var2.setDelegate(a5Var9);
                                            z3Var2.setMaxWidth(a5Var9.O1 - AndroidUtilities.dp(32.0f));
                                            v4Var2.addView(z3Var2, k7.c6.c(-2.0f, -2));
                                            a5Var9.g0();
                                            z3Var = z3Var2;
                                        }
                                        a5Var9.B0(z3Var);
                                        a5Var9.D0(null, true);
                                        a5Var9.d0(z3Var);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = a5Var9.E1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        a5Var9.E1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView4, k7.c6.n(-2, 44));
                }
                for (int i13 = 0; i13 < linearLayout.getChildCount(); i13++) {
                    View childAt = linearLayout.getChildAt(i13);
                    int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, p4Var);
                    int i14 = 8;
                    if (i13 == 0) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    if (i13 == linearLayout.getChildCount() - 1) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    if (i13 == linearLayout.getChildCount() - 1) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    if (i13 != 0) {
                        i14 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.k6.a0(v02, i10, i11, i12, i14));
                }
                a5Var.F1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
