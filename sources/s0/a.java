package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f56853a;
    public final c f56854b;
    public final int f56855c;

    public a(int i7, c cVar, int i10) {
        this.f56853a = i7;
        this.f56854b = cVar;
        this.f56855c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f56853a);
        this.f56854b.f56863a.performAction(this.f56855c, bundle);
    }
}
