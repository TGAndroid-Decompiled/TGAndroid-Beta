package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45703a;
    public final c f45704b;
    public final int f45705c;

    public a(int i10, c cVar, int i11) {
        this.f45703a = i10;
        this.f45704b = cVar;
        this.f45705c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45703a);
        this.f45704b.f45713a.performAction(this.f45705c, bundle);
    }
}
