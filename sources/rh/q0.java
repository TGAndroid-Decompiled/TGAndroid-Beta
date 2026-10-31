package rh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.c00;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
public final class q0 extends FrameLayout implements fe.e, org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f47334a;
    public final FrameLayout f47335b;
    public final ph.z0 f47336c;
    public final g9 d;
    public final TextView e;
    public final TextView f47337f;
    public Integer h;
    public TLRPC.Document f47338n;
    public final fe.b f47339r;
    public boolean f47340s;
    public o0 f47341w;

    public q0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f47339r = new fe.b(0, this, gr.h, 320L, false);
        this.f47334a = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47335b = frameLayout;
        ph.z0 z0Var = new ph.z0(frameLayout, p6Var, true);
        this.f47336c = z0Var;
        frameLayout.setBackground(z0Var);
        z0Var.f45381w = 1;
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.getImageReceiver().W(0);
        addView(g9Var, w7.b6.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.b6.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f47337f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(10.0f), 285212671));
        addView(textView2, w7.b6.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(q0 q0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        g9 g9Var = q0Var.d;
        if (document == null) {
            g9Var.b();
            q0Var.f47338n = null;
        } else if (q0Var.f47338n == document) {
        } else {
            q0Var.f47338n = document;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false);
            c00 f7 = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f20872a7, 0.3f, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("_");
            sb2.append(i10);
            if (z10) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i11 = (80 - i10) / 2;
            g9Var.setLayoutParams(w7.b6.d(i10, i10, 49, 0.0f, i11 + 17, 0.0f, i11));
            g9Var.m(ic.b(document), sb3, ic.c(w9, document), sb3, f7, obj);
        }
    }

    public final void b() {
        int f7;
        ph.z0 z0Var = this.f47336c;
        z0Var.f45384z = null;
        Integer num = this.h;
        fe.b bVar = this.f47339r;
        TextView textView = this.f47337f;
        if (num != null) {
            f7 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false), org.telegram.ui.ActionBar.t6.r1(org.telegram.messenger.i0.T1(0.15f, 1.0f, bVar.e), this.h.intValue()));
            z0Var.f45384z = this.h;
            this.f47335b.invalidate();
            textView.setTextColor(i0.b.f(bVar.e, this.h.intValue(), -1));
        } else if (this.f47340s) {
            int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            int f10 = i0.b.f(bVar.e, i0.b.f(0.05f, x02, org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
            textView.setTextColor(i0.b.f(bVar.e, i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false)), -1));
            f7 = f10;
        } else {
            f7 = i0.b.f(0.5f, i0.b.o(this.f47341w.f47272a.center_color, 255), i0.b.o(this.f47341w.f47272a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f7);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), f7, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void updateColors() {
        o0 o0Var;
        try {
            if (this.f47337f != null && this.f47335b != null && this.f47336c != null) {
                if (this.h != null || this.f47340s || ((o0Var = this.f47341w) != null && o0Var.f47272a != null)) {
                    b();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        b();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
