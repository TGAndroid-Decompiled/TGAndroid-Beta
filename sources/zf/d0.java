package zf;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.e20;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import w7.b6;
public final class d0 extends FrameLayout implements k6 {
    public final p6 f55487a;
    public final g9 f55488b;
    public final TextView f55489c;
    public eq d;
    public e0 e;

    public d0(Context context, p6 p6Var) {
        super(context);
        this.f55487a = p6Var;
        g9 g9Var = new g9(context);
        this.f55488b = g9Var;
        addView(g9Var, b6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f55489c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(e0 e0Var) {
        this.e = e0Var;
        g9 g9Var = this.f55488b;
        g9Var.getImageReceiver().f();
        int i10 = e0Var.d;
        String str = e0Var.f55495c;
        TextView textView = this.f55489c;
        p6 p6Var = this.f55487a;
        float f7 = 16.0f;
        if (i10 == 7) {
            eq N = t6.N(org.telegram.messenger.i0.L(32.0f), 2131230993);
            this.d = N;
            int L = org.telegram.messenger.i0.L(16.0f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            N.e = L;
            N.f25904f = L2;
            t6.B1(this.d, t6.w0(t6.Ci, p6Var), false);
            t6.B1(this.d, t6.w0(t6.Gi, p6Var), true);
            g9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        eq N2 = t6.N(org.telegram.messenger.i0.L(32.0f), e0Var.f55493a);
        this.d = N2;
        int i11 = t6.Ci;
        t6.B1(N2, t6.w0(i11, p6Var), false);
        eq eqVar = this.d;
        int i12 = t6.Gi;
        t6.B1(eqVar, t6.w0(i12, p6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f55496f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (e20.i(e20.f15506s0).f().f19943id == user.f19943id) {
                    eq N3 = t6.N(org.telegram.messenger.i0.L(32.0f), 2131231000);
                    int L3 = org.telegram.messenger.i0.L(16.0f);
                    int L4 = org.telegram.messenger.i0.L(16.0f);
                    N3.e = L3;
                    N3.f25904f = L4;
                    t6.B1(N3, t6.w0(i11, p6Var), false);
                    t6.B1(N3, t6.w0(i12, p6Var), true);
                    g9Var.setImageDrawable(N3);
                } else {
                    g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(16.0f));
                    g9Var.getImageReceiver().i0(user, this.d, null);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                if (w3.Y(chat)) {
                    f7 = 10.0f;
                }
                imageReceiver.J0(org.telegram.messenger.i0.L(f7));
                g9Var.getImageReceiver().i0(chat, this.d, null);
            }
        } else {
            g9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        e0 e0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        p6 p6Var = this.f55487a;
        if (z10) {
            t6.C1(t6.w0(t6.Qi, p6Var), getBackground());
            invalidate();
        } else {
            setBackground(t6.d0(org.telegram.messenger.i0.L(28.0f), t6.w0(t6.Qi, p6Var)));
        }
        TextView textView = this.f55489c;
        if (textView != null) {
            textView.setTextColor(t6.w0(t6.G6, p6Var));
        }
        eq eqVar = this.d;
        if (eqVar != null && (e0Var = this.e) != null) {
            if (e0Var.d == 7) {
                t6.B1(eqVar, t6.w0(t6.Ci, p6Var), false);
                t6.B1(this.d, t6.w0(t6.Gi, p6Var), true);
                return;
            }
            t6.B1(eqVar, t6.w0(t6.Ci, p6Var), false);
            t6.B1(this.d, t6.w0(t6.Gi, p6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
