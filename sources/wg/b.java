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
    public final g6 f49648a;
    public a f49649b;
    public wq f49650c;
    public boolean d;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f49648a = g6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.f49650c == null) {
            wq wqVar = new wq(getContext(), this.f49648a);
            this.f49650c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.f49650c, c6.e(-1, 28, 48));
        }
        this.f49650c.f32815a.c(i10, z4);
    }

    public final void b(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.f49649b.e(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        a aVar = this.f49649b;
        if (aVar.d == null) {
            if (!z4) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f49645e = tpVar;
            tpVar.f31385f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f49645e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, c6.e(46, 46, 17));
        }
        xd.a aVar2 = aVar.f49642a;
        if (!aVar2.f50542f && aVar2.f50541e == 0.0f) {
            aVar.f49645e.f31383c = -1L;
        }
        aVar2.a(z4, z10);
    }

    @Override
    public void setEnabled(boolean z4) {
        b(z4, false);
    }
}
