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
    public final g6 f49612a;
    public a f49613b;
    public wq f49614c;
    public boolean d;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f49612a = g6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.f49614c == null) {
            wq wqVar = new wq(getContext(), this.f49612a);
            this.f49614c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.f49614c, c6.e(-1, 28, 48));
        }
        this.f49614c.f32837a.c(i10, z4);
    }

    public final void b(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.f49613b.e(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        a aVar = this.f49613b;
        if (aVar.d == null) {
            if (!z4) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f49609e = tpVar;
            tpVar.f31431f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f49609e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, c6.e(46, 46, 17));
        }
        xd.a aVar2 = aVar.f49606a;
        if (!aVar2.f50506f && aVar2.f50505e == 0.0f) {
            aVar.f49609e.f31429c = -1L;
        }
        aVar2.a(z4, z10);
    }

    @Override
    public void setEnabled(boolean z4) {
        b(z4, false);
    }
}
