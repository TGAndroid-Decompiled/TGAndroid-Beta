package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class k extends s4.g0 {
    public final k0 f52490c;

    public k(k0 k0Var) {
        this.f52490c = k0Var;
    }

    @Override
    public final int h() {
        return this.f52490c.f52555s;
    }

    @Override
    public final int j(int i10) {
        k0 k0Var = this.f52490c;
        o oVar = (o) k0Var.f52553n.get(k0Var.f(i10));
        if (oVar.f52531b != null && i10 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        k0 k0Var = this.f52490c;
        o oVar = (o) k0Var.f52553n.get(k0Var.f(i10));
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        int i13 = 1;
        int i14 = 0;
        if (i12 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f52531b;
            if (k0Var.f52556w || oVar.f52530a != 2) {
                i13 = 0;
            }
            TextView textView = nVar.f52501b;
            TextView textView2 = nVar.f52500a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f52502c.f52557x);
            if (i13 != 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            int dp = AndroidUtilities.dp(15.0f);
            if (i13 != 0) {
                i14 = AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
            }
            int i15 = dp + i14;
            if (layoutParams.rightMargin != i15) {
                layoutParams.rightMargin = i15;
                textView2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ArrayList arrayList = oVar.f52532c;
        int i16 = i10 - oVar.d;
        if (oVar.f52531b == null) {
            i13 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i16 - i13));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        k0 k0Var = this.f52490c;
        if (i10 == 0) {
            lVar = new n(k0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), k0Var.f52549a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(lVar);
    }
}
