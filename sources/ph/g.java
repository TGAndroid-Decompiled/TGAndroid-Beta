package ph;

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
import gf.n0;
import h7.z5;
import oh.p0;
import oh.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n9;

public final class g extends FrameLayout implements x5 {
    public static final int B = 0;
    public long A;

    public final c6 f46039a;

    public final int f46040b;

    public final n9 f46041c;
    public final TextView d;

    public final n9 f46042e;

    public final TextView f46043f;
    public final TextView h;

    public final TextView f46044n;

    public final cq f46045r;

    public final og.d f46046s;
    public final lg.d v;

    public boolean f46047w;

    public d f46048x;

    public long f46049y;

    public g(Context context, int i10, c6 c6Var) {
        jg.a aVar;
        super(context);
        this.f46039a = c6Var;
        this.f46040b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            og.d dVar = new og.d(null);
            this.f46046s = dVar;
            dVar.g(AndroidUtilities.dp(7.0f), n0.a());
            dVar.h = true;
            aVar = new jg.a(dVar);
        } else {
            this.f46046s = null;
            og.c cVar = new og.c();
            cVar.a(-16777216);
            aVar = new jg.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        n9 n9Var = new n9(context);
        this.f46041c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(n9Var, z5.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        cq cqVar = new cq(R.drawable.mini_user_channels_10, 0);
        this.f46045r = cqVar;
        cqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, z5.e(-2, -1, 81));
        addView(frameLayout, z5.s(52, 48, 11, 48, 0, 14.33f, 0));
        lg.d dVarC = aVar.c(textView, null, false);
        mg.d dVar2 = new mg.d(c6Var);
        dVar2.f18050e = new ng.a(5);
        dVar2.d(1627389951, 1358954495);
        dVar2.c(603979776, 603979776);
        dVar2.b(0, 0);
        dVar2.f18052n = 0.0f;
        dVar2.f18053r = 0.0f;
        float fDpf2 = AndroidUtilities.dpf2(0.43f);
        float fDpf3 = AndroidUtilities.dpf2(0.43f);
        dVar2.f18051f = fDpf2;
        dVar2.h = fDpf3;
        dVarC.n(dVar2);
        dVarC.p(AndroidUtilities.dp(7.0f));
        this.v = dVarC;
        textView.setBackground(dVarC);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f46043f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        n9 n9Var2 = new n9(context);
        this.f46042e = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        final int i11 = 0;
        n9Var2.setOnClickListener(new View.OnClickListener(this) {

            public final g f46034b;

            {
                this.f46034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g gVar = this.f46034b;
                        d dVar3 = gVar.f46048x;
                        if (dVar3 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar3).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.f46034b;
                        d dVar4 = gVar2.f46048x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.f46034b;
                        d dVar5 = gVar3.f46048x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.f46049y, false);
                        }
                        break;
                    default:
                        g gVar4 = this.f46034b;
                        d dVar6 = gVar4.f46048x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.f46049y, true);
                        }
                        break;
                }
            }
        });
        addView(n9Var2, z5.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        final int i12 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final g f46034b;

            {
                this.f46034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g gVar = this.f46034b;
                        d dVar3 = gVar.f46048x;
                        if (dVar3 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar3).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.f46034b;
                        d dVar4 = gVar2.f46048x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.f46034b;
                        d dVar5 = gVar3.f46048x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.f46049y, false);
                        }
                        break;
                    default:
                        g gVar4 = this.f46034b;
                        d dVar6 = gVar4.f46048x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.f46049y, true);
                        }
                        break;
                }
            }
        });
        TextView textViewI = pa.i(linearLayout, textView3, z5.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.f46044n = textViewI;
        textViewI.setTextSize(1, 13.0f);
        textViewI.setBackground(g6.b0(AndroidUtilities.dp(12.0f), g6.l1(0.14f, g6.v0(g6.D6, c6Var))));
        textViewI.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        textViewI.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new cq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        textViewI.setText(spannableStringBuilder);
        textViewI.setVisibility(8);
        linearLayout.addView(textViewI, z5.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        lh.d dVar3 = new lh.d(context, c6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.d();
        dVar3.setColor(g6.l1(0.14f, g6.v0(g6.f23441z6, c6Var)));
        dVar3.setTextColor(g6.w0(null, g6.G6, false));
        dVar3.g(LocaleController.getString(R.string.Decline), false, true);
        final int i13 = 2;
        dVar3.setOnClickListener(new View.OnClickListener(this) {

            public final g f46034b;

            {
                this.f46034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g gVar = this.f46034b;
                        d dVar4 = gVar.f46048x;
                        if (dVar4 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar4).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.f46034b;
                        d dVar5 = gVar2.f46048x;
                        if (dVar5 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar5).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.f46034b;
                        d dVar6 = gVar3.f46048x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar3.f46049y, false);
                        }
                        break;
                    default:
                        g gVar4 = this.f46034b;
                        d dVar7 = gVar4.f46048x;
                        if (dVar7 != null) {
                            ((q0) dVar7).g(gVar4.f46049y, true);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar3, z5.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        lh.d dVar4 = new lh.d(context, c6Var, true);
        dVar4.setUseWrapContent(true);
        dVar4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar4.e();
        dVar4.g(LocaleController.getString(R.string.Add), false, true);
        final int i14 = 3;
        dVar4.setOnClickListener(new View.OnClickListener(this) {

            public final g f46034b;

            {
                this.f46034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g gVar = this.f46034b;
                        d dVar5 = gVar.f46048x;
                        if (dVar5 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar5).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.f46034b;
                        d dVar6 = gVar2.f46048x;
                        if (dVar6 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar6).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.f46034b;
                        d dVar7 = gVar3.f46048x;
                        if (dVar7 != null) {
                            ((q0) dVar7).g(gVar3.f46049y, false);
                        }
                        break;
                    default:
                        g gVar4 = this.f46034b;
                        d dVar8 = gVar4.f46048x;
                        if (dVar8 != null) {
                            ((q0) dVar8).g(gVar4.f46049y, true);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar4, z5.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, z5.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, z5.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.f46039a;
        this.f46043f.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.f23441z6;
        this.h.setTextColor(g6.v0(i11, c6Var));
        this.f46044n.setTextColor(g6.v0(i11, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f46047w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, g6.f23175k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        og.d dVar;
        n9 n9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f46046s) != null && view == (n9Var = this.f46041c)) {
            int iDp = AndroidUtilities.dp(9.0f);
            int left = n9Var.getLeft() - iDp;
            int top = n9Var.getTop() - iDp;
            int iDp2 = (iDp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas recordingCanvasA = dVar.a(iDp2, iDp2);
            recordingCanvasA.translate(-left, -top);
            recordingCanvasA.drawColor(g6.v0(g6.f23053d6, this.f46039a));
            recordingCanvasA.save();
            float f10 = iDp2 / 2.0f;
            recordingCanvasA.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(recordingCanvasA, view, j10);
            recordingCanvasA.restore();
            recordingCanvasA.drawColor(536870912);
            dVar.b();
        }
        return super.drawChild(canvas, view, j10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.s(AndroidUtilities.dp(9.0f) + this.d.getLeft(), AndroidUtilities.dp(48.0f));
    }
}
