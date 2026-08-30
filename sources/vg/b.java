package vg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.uq;
public final class b extends FrameLayout {
    public final f6 f45770a;
    public a f45771b;
    public uq f45772c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f45770a = f6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.f45772c == null) {
            uq uqVar = new uq(getContext(), this.f45770a);
            this.f45772c = uqVar;
            uqVar.setReverse(this.d);
            addView(this.f45772c, b6.e(-1, 28, 48));
        }
        this.f45772c.f29272a.c(i10, z4);
    }

    public final void b(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.f45771b.e(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        a aVar = this.f45771b;
        if (aVar.d == null) {
            if (!z4) {
                return;
            }
            rp rpVar = new rp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = rpVar;
            rpVar.f28509f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, b6.e(46, 46, 17));
        }
        xd.a aVar2 = aVar.f45765a;
        if (!aVar2.f46893f && aVar2.e == 0.0f) {
            aVar.e.f28508c = -1L;
        }
        aVar2.a(z4, z10);
    }

    @Override
    public void setEnabled(boolean z4) {
        b(z4, false);
    }
}
