package wg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wq;
public final class b extends FrameLayout {
    public final g6 f49611a;
    public a f49612b;
    public wq f49613c;
    public boolean d;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f49611a = g6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.f49613c == null) {
            wq wqVar = new wq(getContext(), this.f49611a);
            this.f49613c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.f49613c, c6.e(-1, 28, 48));
        }
        this.f49613c.f32837a.c(i10, z4);
    }

    public final void b(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.f49612b.e(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        a aVar = this.f49612b;
        if (aVar.d == null) {
            if (!z4) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f49608e = tpVar;
            tpVar.f31431f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f49608e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, c6.e(46, 46, 17));
        }
        xd.a aVar2 = aVar.f49605a;
        if (!aVar2.f50505f && aVar2.f50504e == 0.0f) {
            aVar.f49608e.f31429c = -1L;
        }
        aVar2.a(z4, z10);
    }

    @Override
    public void setEnabled(boolean z4) {
        b(z4, false);
    }
}
