package zh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q extends s4.g0 {
    public final k0 f52086c;

    public q(k0 k0Var) {
        this.f52086c = k0Var;
    }

    @Override
    public final int h() {
        return this.f52086c.f52128s;
    }

    @Override
    public final int j(int i10) {
        k0 k0Var = this.f52086c;
        u uVar = (u) k0Var.f52126n.get(k0Var.f(i10));
        if (uVar.f52106b != null && i10 == uVar.d) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        k0 k0Var = this.f52086c;
        u uVar = (u) k0Var.f52126n.get(k0Var.f(i10));
        int i12 = b1Var.f45941f;
        View view = b1Var.f45938a;
        int i13 = 1;
        int i14 = 0;
        if (i12 == 0) {
            t tVar = (t) view;
            String str2 = uVar.f52106b;
            if (k0Var.f52129w || uVar.f52105a != 2) {
                i13 = 0;
            }
            TextView textView = tVar.f52101b;
            TextView textView2 = tVar.f52100a;
            if (str2 != null) {
                str = str2.replace('\n', ' ');
            } else {
                str = null;
            }
            textView2.setText(str);
            textView2.setTextColor(tVar.f52102c.f52130x);
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
        ArrayList arrayList = uVar.f52107c;
        int i16 = i10 - uVar.d;
        if (uVar.f52106b == null) {
            i13 = 0;
        }
        ((r) view).set((TLRPC.Document) arrayList.get(i16 - i13));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View rVar;
        k0 k0Var = this.f52086c;
        if (i10 == 0) {
            rVar = new t(k0Var, viewGroup.getContext());
            rVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(44.0f)));
        } else {
            rVar = new r(viewGroup.getContext(), k0Var.f52122a);
            rVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(rVar);
    }
}
