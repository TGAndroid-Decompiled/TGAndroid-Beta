package rg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.kq;

public final class b extends FrameLayout {

    public final c6 f47023a;

    public a f47024b;

    public kq f47025c;
    public boolean d;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f47023a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f47025c == null) {
            kq kqVar = new kq(getContext(), this.f47023a);
            this.f47025c = kqVar;
            kqVar.setReverse(this.d);
            addView(this.f47025c, z5.e(-1, 28, 48));
        }
        this.f47025c.f30167a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f47024b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f47024b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            hp hpVar = new hp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f47020e = hpVar;
            hpVar.f29074f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f47020e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        ud.a aVar2 = aVar.f47017a;
        if (!aVar2.f48498f && aVar2.f48497e == 0.0f) {
            aVar.f47020e.f29072c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
