package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class k extends s4.g0 {
    public final k0 f52489c;

    public k(k0 k0Var) {
        this.f52489c = k0Var;
    }

    @Override
    public final int h() {
        return this.f52489c.f52554s;
    }

    @Override
    public final int j(int i10) {
        k0 k0Var = this.f52489c;
        o oVar = (o) k0Var.f52552n.get(k0Var.f(i10));
        if (oVar.f52530b != null && i10 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        k0 k0Var = this.f52489c;
        o oVar = (o) k0Var.f52552n.get(k0Var.f(i10));
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        int i13 = 1;
        int i14 = 0;
        if (i12 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f52530b;
            if (k0Var.f52555w || oVar.f52529a != 2) {
                i13 = 0;
            }
            TextView textView = nVar.f52500b;
            TextView textView2 = nVar.f52499a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f52501c.f52556x);
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
        ArrayList arrayList = oVar.f52531c;
        int i16 = i10 - oVar.d;
        if (oVar.f52530b == null) {
            i13 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i16 - i13));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        k0 k0Var = this.f52489c;
        if (i10 == 0) {
            lVar = new n(k0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), k0Var.f52548a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(lVar);
    }
}
