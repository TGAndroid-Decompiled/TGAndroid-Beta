package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54473a;
    public final d f54474b;
    public final int f54475c;

    public a(int i7, d dVar, int i10) {
        this.f54473a = i7;
        this.f54474b = dVar;
        this.f54475c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54473a);
        this.f54474b.f54484a.performAction(this.f54475c, bundle);
    }
}
