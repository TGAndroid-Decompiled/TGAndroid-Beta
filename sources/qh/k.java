package qh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import s4.c1;
public final class k extends s4.g0 {
    public final g0 f45671c;

    public k(g0 g0Var) {
        this.f45671c = g0Var;
    }

    @Override
    public final int b() {
        return this.f45671c.f45725s;
    }

    @Override
    public final int d(int i10) {
        g0 g0Var = this.f45671c;
        o oVar = (o) g0Var.f45723n.get(g0Var.f(i10));
        if (oVar.f45704b != null && i10 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(c1 c1Var, int i10) {
        String str;
        int i11;
        g0 g0Var = this.f45671c;
        o oVar = (o) g0Var.f45723n.get(g0Var.f(i10));
        int i12 = c1Var.f47901f;
        View view = c1Var.f47898a;
        int i13 = 1;
        int i14 = 0;
        if (i12 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f45704b;
            if (g0Var.f45727x || oVar.f45703a != 2) {
                i13 = 0;
            }
            TextView textView = nVar.f45698b;
            TextView textView2 = nVar.f45697a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f45699c.f45728y);
            if (i13 != 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int L = org.telegram.messenger.i0.L(15.0f);
            if (i13 != 0) {
                i14 = org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i15 = L + i14;
            if (layoutParams.rightMargin != i15) {
                layoutParams.rightMargin = i15;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = oVar.f45705c;
        int i16 = i10 - oVar.d;
        if (oVar.f45704b == null) {
            i13 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i16 - i13));
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        View lVar;
        g0 g0Var = this.f45671c;
        if (i10 == 0) {
            lVar = new n(g0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), g0Var.f45719a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new c1(lVar);
    }
}
