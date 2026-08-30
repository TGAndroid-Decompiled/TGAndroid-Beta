package th;

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
import k7.b6;
import lf.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.yh;
import sh.n0;
import sh.o0;
public final class g extends FrameLayout implements a6 {
    public static final int C = 0;
    public long B;
    public final f6 f44947a;
    public final int f44948b;
    public final p9 f44949c;
    public final TextView d;
    public final p9 e;
    public final TextView f44950f;
    public final TextView h;
    public final TextView f44951n;
    public final mq f44952r;
    public final sg.d f44953s;
    public final pg.b v;
    public boolean f44954w;
    public d f44955x;
    public long f44956y;

    public g(Context context, int i10, f6 f6Var) {
        super(context);
        ng.a aVar;
        this.f44947a = f6Var;
        this.f44948b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            sg.d dVar = new sg.d(null);
            this.f44953s = dVar;
            dVar.h(AndroidUtilities.dp(7.0f), m0.a());
            dVar.h = true;
            aVar = new ng.a(dVar);
        } else {
            this.f44953s = null;
            sg.c cVar = new sg.c();
            cVar.a(-16777216);
            aVar = new ng.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        p9 p9Var = new p9(context);
        this.f44949c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(p9Var, b6.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        mq mqVar = new mq(R.drawable.mini_user_channels_10, 0);
        this.f44952r = mqVar;
        mqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, b6.e(-2, -1, 81));
        addView(frameLayout, b6.s(52, 48, 11, 48, 0, 14.33f, 0));
        pg.b c3 = aVar.c(textView, null, false);
        qg.d dVar2 = new qg.d(f6Var);
        dVar2.e = new rg.a(2);
        dVar2.d(1627389951, 1358954495);
        dVar2.c(603979776, 603979776);
        dVar2.b(0, 0);
        dVar2.f43064n = 0.0f;
        dVar2.f43065r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        dVar2.f43063f = dpf2;
        dVar2.h = dpf22;
        c3.n(dVar2);
        c3.p(AndroidUtilities.dp(7.0f));
        this.v = c3;
        textView.setBackground(c3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f44950f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, b6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        p9 p9Var2 = new p9(context);
        this.e = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        p9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g f44942b;

            {
                this.f44942b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f44942b;
                        d dVar3 = gVar.f44955x;
                        if (dVar3 != null) {
                            long j10 = gVar.B;
                            n0 n0Var = ((o0) dVar3).h;
                            if (n0Var != null) {
                                n0Var.b(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f44942b;
                        d dVar4 = gVar2.f44955x;
                        if (dVar4 != null) {
                            long j11 = gVar2.B;
                            n0 n0Var2 = ((o0) dVar4).h;
                            if (n0Var2 != null) {
                                n0Var2.b(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f44942b;
                        d dVar5 = gVar3.f44955x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.f44956y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f44942b;
                        d dVar6 = gVar4.f44955x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.f44956y, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(p9Var2, b6.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final g f44942b;

            {
                this.f44942b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f44942b;
                        d dVar3 = gVar.f44955x;
                        if (dVar3 != null) {
                            long j10 = gVar.B;
                            n0 n0Var = ((o0) dVar3).h;
                            if (n0Var != null) {
                                n0Var.b(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f44942b;
                        d dVar4 = gVar2.f44955x;
                        if (dVar4 != null) {
                            long j11 = gVar2.B;
                            n0 n0Var2 = ((o0) dVar4).h;
                            if (n0Var2 != null) {
                                n0Var2.b(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f44942b;
                        d dVar5 = gVar3.f44955x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.f44956y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f44942b;
                        d dVar6 = gVar4.f44955x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.f44956y, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView j10 = yh.j(linearLayout, textView3, b6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f44951n = j10;
        j10.setTextSize(1, 13.0f);
        j10.setBackground(j6.b0(AndroidUtilities.dp(12.0f), j6.l1(0.14f, j6.v0(j6.D6, f6Var))));
        j10.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        j10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new mq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        j10.setText(spannableStringBuilder);
        j10.setVisibility(8);
        linearLayout.addView(j10, b6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ph.d dVar3 = new ph.d(context, f6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.d();
        dVar3.setColor(j6.l1(0.14f, j6.v0(j6.f20298z6, f6Var)));
        dVar3.setTextColor(j6.w0(null, j6.G6, false));
        dVar3.g(LocaleController.getString(R.string.Decline), false, true);
        dVar3.setOnClickListener(new View.OnClickListener(this) {
            public final g f44942b;

            {
                this.f44942b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f44942b;
                        d dVar32 = gVar.f44955x;
                        if (dVar32 != null) {
                            long j102 = gVar.B;
                            n0 n0Var = ((o0) dVar32).h;
                            if (n0Var != null) {
                                n0Var.b(j102);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f44942b;
                        d dVar4 = gVar2.f44955x;
                        if (dVar4 != null) {
                            long j11 = gVar2.B;
                            n0 n0Var2 = ((o0) dVar4).h;
                            if (n0Var2 != null) {
                                n0Var2.b(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f44942b;
                        d dVar5 = gVar3.f44955x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.f44956y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f44942b;
                        d dVar6 = gVar4.f44955x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.f44956y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar3, b6.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ph.d dVar4 = new ph.d(context, f6Var, true);
        dVar4.setUseWrapContent(true);
        dVar4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar4.e();
        dVar4.g(LocaleController.getString(R.string.Add), false, true);
        dVar4.setOnClickListener(new View.OnClickListener(this) {
            public final g f44942b;

            {
                this.f44942b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f44942b;
                        d dVar32 = gVar.f44955x;
                        if (dVar32 != null) {
                            long j102 = gVar.B;
                            n0 n0Var = ((o0) dVar32).h;
                            if (n0Var != null) {
                                n0Var.b(j102);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f44942b;
                        d dVar42 = gVar2.f44955x;
                        if (dVar42 != null) {
                            long j11 = gVar2.B;
                            n0 n0Var2 = ((o0) dVar42).h;
                            if (n0Var2 != null) {
                                n0Var2.b(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f44942b;
                        d dVar5 = gVar3.f44955x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.f44956y, false);
                            return;
                        }
                        return;
                    default:
                        g gVar4 = this.f44942b;
                        d dVar6 = gVar4.f44955x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.f44956y, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(dVar4, b6.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, b6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, b6.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f44954w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, j6.f20025k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sg.d dVar;
        p9 p9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f44953s) != null && view == (p9Var = this.f44949c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = p9Var.getLeft() - dp;
            int top = p9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(j6.v0(j6.f19906d6, this.f44947a));
            a2.save();
            float f10 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(536870912);
            dVar.b();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.f44947a;
        this.f44950f.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.f20298z6;
        this.h.setTextColor(j6.v0(i11, f6Var));
        this.f44951n.setTextColor(j6.v0(i11, f6Var));
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
