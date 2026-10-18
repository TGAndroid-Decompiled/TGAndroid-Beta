package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import s4.b1;
public final class k extends s4.g0 {
    public final d0 f51796c;

    public k(d0 d0Var) {
        this.f51796c = d0Var;
    }

    @Override
    public final int h() {
        return this.f51796c.f51864s;
    }

    @Override
    public final int j(int i10) {
        d0 d0Var = this.f51796c;
        o oVar = (o) d0Var.f51862n.get(d0Var.f(i10));
        if (oVar.f51816b != null && i10 == oVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        String str;
        int i11;
        d0 d0Var = this.f51796c;
        o oVar = (o) d0Var.f51862n.get(d0Var.f(i10));
        int i12 = b1Var.f45961f;
        View view = b1Var.f45958a;
        int i13 = 1;
        int i14 = 0;
        if (i12 == 0) {
            n nVar = (n) view;
            String str2 = oVar.f51816b;
            if (d0Var.f51865w || oVar.f51815a != 2) {
                i13 = 0;
            }
            TextView textView = nVar.f51810b;
            TextView textView2 = nVar.f51809a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(nVar.f51811c.f51866x);
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
        ArrayList arrayList = oVar.f51817c;
        int i16 = i10 - oVar.d;
        if (oVar.f51816b == null) {
            i13 = 0;
        }
        ((l) view).set((TLRPC.Document) arrayList.get(i16 - i13));
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        d0 d0Var = this.f51796c;
        if (i10 == 0) {
            lVar = new n(d0Var, viewGroup.getContext());
            lVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            lVar = new l(viewGroup.getContext(), d0Var.f51858a);
            lVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new b1(lVar);
    }
}
