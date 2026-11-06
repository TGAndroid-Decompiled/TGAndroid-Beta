package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f54498a;
    public final d f54499b;
    public final int f54500c;

    public a(int i7, d dVar, int i10) {
        this.f54498a = i7;
        this.f54499b = dVar;
        this.f54500c = i10;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f54498a);
        this.f54499b.f54509a.performAction(this.f54500c, bundle);
    }
}
