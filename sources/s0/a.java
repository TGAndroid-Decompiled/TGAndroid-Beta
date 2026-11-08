package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54589a;
    public final d f54590b;
    public final int f54591c;

    public a(int i7, d dVar, int i10) {
        this.f54589a = i7;
        this.f54590b = dVar;
        this.f54591c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54589a);
        this.f54590b.f54600a.performAction(this.f54591c, bundle);
    }
}
