package tg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qq;
public final class b extends FrameLayout {
    public final c6 f48323a;
    public a f48324b;
    public qq f48325c;
    public boolean d;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f48323a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.f48325c == null) {
            qq qqVar = new qq(getContext(), this.f48323a);
            this.f48325c = qqVar;
            qqVar.setReverse(this.d);
            addView(this.f48325c, f6.e(-1, 28, 48));
        }
        this.f48325c.f32029a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f48324b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f48324b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            np npVar = new np(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f48320e = npVar;
            npVar.f31108f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f48320e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, f6.e(46, 46, 17));
        }
        vd.a aVar2 = aVar.f48317a;
        if (!aVar2.f49506f && aVar2.f49505e == 0.0f) {
            aVar.f48320e.f31106c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
