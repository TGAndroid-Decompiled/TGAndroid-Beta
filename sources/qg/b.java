package qg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.mq;
public final class b extends FrameLayout {
    public final b6 f46264a;
    public a f46265b;
    public mq f46266c;
    public boolean d;

    public b(Context context, b6 b6Var) {
        super(context);
        this.f46264a = b6Var;
    }

    public final void a(int i9, boolean z10) {
        if (this.f46266c == null) {
            mq mqVar = new mq(getContext(), this.f46264a);
            this.f46266c = mqVar;
            mqVar.setReverse(this.d);
            addView(this.f46266c, e6.e(-1, 28, 48));
        }
        this.f46266c.f30905a.c(i9, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f46265b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.f46265b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            jp jpVar = new jp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.f46261e = jpVar;
            jpVar.f29814f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.f46261e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, e6.e(46, 46, 17));
        }
        td.a aVar2 = aVar.f46258a;
        if (!aVar2.f47776f && aVar2.f47775e == 0.0f) {
            aVar.f46261e.f29812c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
