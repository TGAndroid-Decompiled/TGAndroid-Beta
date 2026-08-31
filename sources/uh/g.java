package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import lf.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.yh;
import th.n0;
public final class g extends FrameLayout implements b6 {
    public static final int C = 0;
    public long B;
    public final g6 f48811a;
    public final int f48812b;
    public final p9 f48813c;
    public final TextView d;
    public final p9 f48814e;
    public final TextView f48815f;
    public final TextView h;
    public final TextView f48816n;
    public final oq f48817r;
    public final tg.d f48818s;
    public final qg.b v;
    public boolean f48819w;
    public d f48820x;
    public long f48821y;

    public g(Context context, int i10, g6 g6Var) {
        super(context);
        og.a aVar;
        this.f48811a = g6Var;
        this.f48812b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            tg.d dVar = new tg.d(null);
            this.f48818s = dVar;
            dVar.h(AndroidUtilities.dp(7.0f), m0.a());
            dVar.h = true;
            aVar = new og.a(dVar);
        } else {
            this.f48818s = null;
            tg.c cVar = new tg.c();
            cVar.a(-16777216);
            aVar = new og.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        p9 p9Var = new p9(context);
        this.f48813c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(p9Var, c6.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        oq oqVar = new oq(R.drawable.mini_user_channels_10, 0);
        this.f48817r = oqVar;
        oqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, c6.e(-2, -1, 81));
        addView(frameLayout, c6.s(52, 48, 11, 48, 0, 14.33f, 0));
        qg.b c3 = aVar.c(textView, null, false);
        rg.d dVar2 = new rg.d(g6Var);
        dVar2.f46811e = new s0.b(24);
        dVar2.d(1627389951, 1358954495);
        dVar2.c(603979776, 603979776);
        dVar2.b(0, 0);
        dVar2.f46813n = 0.0f;
        dVar2.f46814r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        dVar2.f46812f = dpf2;
        dVar2.h = dpf22;
        c3.n(dVar2);
        c3.p(AndroidUtilities.dp(7.0f));
        this.v = c3;
        textView.setBackground(c3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f48815f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, c6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        p9 p9Var2 = new p9(context);
        this.f48814e = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        p9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g f48806b;

            {
                this.f48806b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f48806b;
                        d dVar3 = gVar.f48820x;
                        if (dVar3 != null) {
                            long j10 = gVar.B;
                            th.m0 m0Var = ((n0) dVar3).h;
                            if (m0Var != null) {
                                m0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f48806b;
                        d dVar4 = gVar2.f48820x;
                        if (dVar4 != null) {
                            long j11 = gVar2.B;
                            th.m0 m0Var2 = ((n0) dVar4).h;
                            if (m0Var2 != null) {
                                m0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f48806b;
                        d dVar5 = gVar3.f48820x;
                        if (dVar5 != null) {
                            ((n0) dVar5).g(gVar3.f48821y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f48806b;
                        d dVar6 = gVar4.f48820x;
                        if (dVar6 != null) {
                            ((n0) dVar6).g(gVar4.f48821y, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(p9Var2, c6.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final g f48806b;

            {
                this.f48806b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f48806b;
                        d dVar3 = gVar.f48820x;
                        if (dVar3 != null) {
                            long j10 = gVar.B;
                            th.m0 m0Var = ((n0) dVar3).h;
                            if (m0Var != null) {
                                m0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f48806b;
                        d dVar4 = gVar2.f48820x;
                        if (dVar4 != null) {
                            long j11 = gVar2.B;
                            th.m0 m0Var2 = ((n0) dVar4).h;
                            if (m0Var2 != null) {
                                m0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f48806b;
                        d dVar5 = gVar3.f48820x;
                        if (dVar5 != null) {
                            ((n0) dVar5).g(gVar3.f48821y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f48806b;
                        d dVar6 = gVar4.f48820x;
                        if (dVar6 != null) {
                            ((n0) dVar6).g(gVar4.f48821y, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView i11 = yh.i(linearLayout, textView3, c6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f48816n = i11;
        i11.setTextSize(1, 13.0f);
        i11.setBackground(k6.b0(AndroidUtilities.dp(12.0f), k6.l1(0.14f, k6.v0(k6.D6, g6Var))));
        i11.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        i11.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        i11.setText(spannableStringBuilder);
        i11.setVisibility(8);
        linearLayout.addView(i11, c6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        qh.d dVar3 = new qh.d(context, g6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.d();
        dVar3.setColor(k6.l1(0.14f, k6.v0(k6.f22053z6, g6Var)));
        dVar3.setTextColor(k6.w0(null, k6.G6, false));
        dVar3.g(LocaleController.getString(R.string.Decline), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final g f48806b;

            {
                this.f48806b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f48806b;
                        d dVar32 = gVar.f48820x;
                        if (dVar32 != null) {
                            long j10 = gVar.B;
                            th.m0 m0Var = ((n0) dVar32).h;
                            if (m0Var != null) {
                                m0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f48806b;
                        d dVar4 = gVar2.f48820x;
                        if (dVar4 != null) {
                            long j11 = gVar2.B;
                            th.m0 m0Var2 = ((n0) dVar4).h;
                            if (m0Var2 != null) {
                                m0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f48806b;
                        d dVar5 = gVar3.f48820x;
                        if (dVar5 != null) {
                            ((n0) dVar5).g(gVar3.f48821y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f48806b;
                        d dVar6 = gVar4.f48820x;
                        if (dVar6 != null) {
                            ((n0) dVar6).g(gVar4.f48821y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, c6.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        qh.d dVar4 = new qh.d(context, g6Var, true);
        dVar4.setUseWrapContent(true);
        dVar4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar4.e();
        dVar4.g(LocaleController.getString(R.string.Add), false, true);
        dVar4.setOnClickListener(new View.OnClickListener(this) {
            public final g f48806b;

            {
                this.f48806b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f48806b;
                        d dVar32 = gVar.f48820x;
                        if (dVar32 != null) {
                            long j10 = gVar.B;
                            th.m0 m0Var = ((n0) dVar32).h;
                            if (m0Var != null) {
                                m0Var.a(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f48806b;
                        d dVar42 = gVar2.f48820x;
                        if (dVar42 != null) {
                            long j11 = gVar2.B;
                            th.m0 m0Var2 = ((n0) dVar42).h;
                            if (m0Var2 != null) {
                                m0Var2.a(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f48806b;
                        d dVar5 = gVar3.f48820x;
                        if (dVar5 != null) {
                            ((n0) dVar5).g(gVar3.f48821y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f48806b;
                        d dVar6 = gVar4.f48820x;
                        if (dVar6 != null) {
                            ((n0) dVar6).g(gVar4.f48821y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar4, c6.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, c6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, c6.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f48819w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, k6.f21779k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tg.d dVar;
        p9 p9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f48818s) != null && view == (p9Var = this.f48813c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = p9Var.getLeft() - dp;
            int top = p9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(k6.v0(k6.f21659d6, this.f48811a));
            a2.save();
            float f10 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(536870912);
            dVar.c();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        int i10 = k6.G6;
        g6 g6Var = this.f48811a;
        this.f48815f.setTextColor(k6.v0(i10, g6Var));
        int i11 = k6.f22053z6;
        this.h.setTextColor(k6.v0(i11, g6Var));
        this.f48816n.setTextColor(k6.v0(i11, g6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int left = this.d.getLeft();
        this.v.s(AndroidUtilities.dp(9.0f) + left, AndroidUtilities.dp(48.0f));
    }
}
