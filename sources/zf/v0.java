package zf;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.g00;
import w7.b6;
public final class v0 extends LinearLayout implements k6 {
    public ShapeDrawable f55636a;
    public final p6 f55637b;
    public final g9 f55638c;
    public final r8 d;
    public final TextView e;
    public final TextView f55639f;

    public v0(Context context, p6 p6Var, boolean z10) {
        super(context);
        w6 N;
        this.d = new r8((p6) null);
        this.f55637b = p6Var;
        setOrientation(0);
        g9 g9Var = new g9(context);
        this.f55638c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
        addView(g9Var, b6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = t6.G6;
        a7.V(textView, i10, p6Var);
        linearLayout.addView(textView, b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f55639f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            N = a7.L(0.5f, i10);
        } else {
            N = a7.N(t6.f21330z6);
        }
        a7.W(textView2, N, p6Var);
        linearLayout.addView(textView2, b6.o(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f55639f;
        TextView textView2 = this.e;
        g9 g9Var = this.f55638c;
        if (i10 == 0) {
            ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(28.0f), t6.w0(t6.Ci, this.f55637b));
            this.f55636a = d02;
            eq eqVar = new eq(d02, getContext().getResources().getDrawable(2131231829).mutate());
            eqVar.f25845s = org.telegram.messenger.i0.L(-0.66f);
            eqVar.f25846w = 0;
            int L = org.telegram.messenger.i0.L(20.0f);
            int L2 = org.telegram.messenger.i0.L(20.0f);
            eqVar.e = L;
            eqVar.f25842f = L2;
            g9Var.setImageDrawable(eqVar);
            textView2.setText(cd.a0(null, null, 2131749353, str));
            textView.setText(cd.L0(2131749354, null));
            return;
        }
        r8 r8Var = this.d;
        r8Var.q(chat);
        g9Var.e(chat, r8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.a0(null, null, 2131749351, str + "@" + w3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        g00 g00Var = new g00(8);
        g00Var.f37377f = t6.x0(null, t6.zk, false);
        g00Var.f37378n = false;
        spannableStringBuilder.setSpan(g00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(cd.L0(2131749352, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f55636a;
            if (shapeDrawable != null) {
                t6.C1(t6.w0(t6.Ci, this.f55637b), shapeDrawable);
                g9 g9Var = this.f55638c;
                if (g9Var != null) {
                    g9Var.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
