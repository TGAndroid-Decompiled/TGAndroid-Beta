package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f56771a;
    public final c f56772b;
    public final int f56773c;

    public a(int i7, c cVar, int i10) {
        this.f56771a = i7;
        this.f56772b = cVar;
        this.f56773c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f56771a);
        this.f56772b.f56781a.performAction(this.f56773c, bundle);
    }
}
