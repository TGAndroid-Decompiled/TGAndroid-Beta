package vh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.tk0;
public final class c6 extends org.telegram.ui.ActionBar.z2 implements us {
    public final int f51034i1;
    public ArrayList f51035j1;
    public final TLRPC.InputPeer f51036k1;
    public final tk0 l1;
    public final b6 f51037m1;
    public final TextView f51038n1;

    public c6(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final q20 q20Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        int i11;
        O();
        vp.r1(i10).O1().U();
        this.f51034i1 = i10;
        this.f51035j1 = vp.r1(i10).O1().T;
        this.f51036k1 = inputPeer;
        this.f21586b = new z5(this, context, p6Var);
        tk0 tk0Var = new tk0(context, p6Var);
        this.l1 = tk0Var;
        int i12 = this.f21615t0;
        tk0Var.setPadding(i12, 0, i12, 0);
        b6 b6Var = new b6(this);
        this.f51037m1 = b6Var;
        tk0Var.setAdapter(b6Var);
        tk0Var.setLayoutManager(new s4.a0());
        this.f21586b.addView(tk0Var, w7.b6.e(-1, -1, 119));
        tk0Var.setOnItemClickListener(new gk0() {
            @Override
            public final void f(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                c6 c6Var = c6.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) c6Var.f51035j1.get(i13 - 2);
                int i14 = (inputPeer2.channel_id > 0L ? 1 : (inputPeer2.channel_id == 0L ? 0 : -1));
                q20 q20Var2 = q20Var;
                if (i14 == 0 && inputPeer2.chat_id == 0) {
                    q20Var2.a(inputPeer2);
                    c6Var.dismiss();
                    return;
                }
                Context context2 = c6Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context2, p6Var2);
                x1Var.r(200L);
                vp.r1(i10).O1().k(org.telegram.messenger.o5.n(inputPeer2), new kg.d0(x1Var, q20Var2, inputPeer2, 13), true, p6Var2);
                c6Var.dismiss();
            }
        });
        tk0Var.setOnScrollListener(new a6(this));
        TextView textView = new TextView(getContext());
        this.f51038n1 = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.i0.L(22.0f) + this.f21615t0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(22.0f) + this.f21615t0, org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, textView, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        if (z10) {
            i11 = 2131744543;
        } else {
            i11 = 2131744544;
        }
        textView.setText(cd.L0(i11, null));
        this.f21586b.addView(textView, w7.b6.c(-2.0f, -1));
    }

    @Override
    public final boolean H() {
        if (I0() > ((int) (org.telegram.messenger.i0.f16026q.y * 0.5f))) {
            return true;
        }
        return false;
    }

    public final float I0() {
        int R;
        float measuredHeight = this.f21586b.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            tk0 tk0Var = this.l1;
            if (i10 < tk0Var.getChildCount()) {
                View childAt = tk0Var.getChildAt(i10);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(org.telegram.messenger.i0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i10++;
            } else {
                return measuredHeight;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19593c3) {
            this.f51035j1 = vp.r1(this.f51034i1).O1().T;
            this.f51037m1.f();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f51034i1).c(this, zs.f19593c3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f51034i1).n(this, zs.f19593c3);
    }
}
